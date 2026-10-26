#!/usr/bin/env bash
# Checks the size of what a release publishes to Maven Central: the jar, the sources jar and the
# javadoc jar of one version, added up. Maven Central counts that total against a per-release
# limit (80 MB); this check fails well below it, at RELEASE_SIZE_LIMIT_MB (default 60), so growth
# is caught in a pull request instead of at release time. Sizes are in decimal MB, as Central
# reports them.
#
# Usage (after `mvn package`, which builds all three jars):
#   scripts/check-release-size.sh [target-dir]
#   RELEASE_SIZE_LIMIT_MB=50 scripts/check-release-size.sh
set -euo pipefail

here="$(cd "$(dirname "$0")" && pwd)"
dir="${1:-$here/../target}"
limit_mb="${RELEASE_SIZE_LIMIT_MB:-60}"
case "$limit_mb" in
  ''|*[!0-9]*) echo "error: RELEASE_SIZE_LIMIT_MB must be a whole number of MB, got '$limit_mb'" >&2; exit 2 ;;
esac

shopt -s nullglob
one() { # <label> <glob...>: the single file matching, or exit 2
  local label="$1"; shift
  local found=("$@")
  if [ "${#found[@]}" -ne 1 ]; then
    echo "error: expected exactly one $label in $dir (found ${#found[@]}); run mvn package first" >&2
    exit 2
  fi
  printf '%s' "${found[0]}"
}
main_jars=()
for f in "$dir"/scalekit-sdk-java-*.jar; do
  case "$f" in
    *-sources.jar|*-javadoc.jar|*-shaded.jar) ;;
    *) main_jars+=("$f") ;;
  esac
done
jar="$(one jar "${main_jars[@]}")"
sources="$(one "sources jar" "$dir"/scalekit-sdk-java-*-sources.jar)"
javadoc="$(one "javadoc jar" "$dir"/scalekit-sdk-java-*-javadoc.jar)"

size() { wc -c < "$1" | tr -d ' '; }
mb() { awk -v b="$1" 'BEGIN { printf "%.2f", b / 1000000 }'; }

total=0
echo "release size (what Maven Central counts), limit ${limit_mb} MB:"
for f in "$jar" "$sources" "$javadoc"; do
  b="$(size "$f")"
  total=$((total + b))
  printf '  %8s MB  %s\n' "$(mb "$b")" "$(basename "$f")"
done
printf '  %8s MB  total\n' "$(mb "$total")"

if [ "$total" -gt $((limit_mb * 1000000)) ]; then
  echo "FAIL: the release would be $(mb "$total") MB, over the ${limit_mb} MB limit."
  echo "      Find what grew (unzip -l on the jar above), e.g. a new bundled dependency in the"
  echo "      shaded jar or generated packages in the javadoc (see excludePackageNames in pom.xml)."
  exit 1
fi
echo "OK: $(mb "$total") MB is within the ${limit_mb} MB limit."
