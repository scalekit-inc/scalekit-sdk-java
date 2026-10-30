#!/usr/bin/env bash
# Checks the size of what a release publishes to Maven Central: the jar, the sources jar and the
# javadoc jar of one version, added up. Maven Central counts the release size of all releases in
# a calendar month against a monthly limit (about 80 MB, see the Usage Center); this check fails
# well below it, at RELEASE_SIZE_LIMIT_MB (default 60), so growth is caught in a pull request
# instead of at release time. Sizes are in decimal MB, as Central reports them.
#
# Usage (after `mvn clean package`, which builds all three jars):
#   scripts/check-release-size.sh [target-dir]
#   RELEASE_SIZE_LIMIT_MB=50 scripts/check-release-size.sh
set -euo pipefail

here="$(cd "$(dirname "$0")" && pwd)"
dir="${1:-$here/../target}"
limit_mb="${RELEASE_SIZE_LIMIT_MB:-60}"
case "$limit_mb" in
  ''|*[!0-9]*) echo "error: RELEASE_SIZE_LIMIT_MB must be a whole number of MB, got '$limit_mb'" >&2; exit 2 ;;
esac
if [ "${#limit_mb}" -gt 6 ]; then
  echo "error: RELEASE_SIZE_LIMIT_MB is too large: $limit_mb" >&2
  exit 2
fi
limit_mb=$((10#$limit_mb)) # decimal, even with leading zeros (Bash reads 060 as octal)

shopt -s nullglob
main_jars=()
for f in "$dir"/scalekit-sdk-java-*.jar; do
  case "$f" in
    *-sources.jar|*-javadoc.jar|*-shaded.jar) ;;
    *) main_jars+=("$f") ;;
  esac
done
if [ "${#main_jars[@]}" -ne 1 ]; then
  echo "error: expected exactly one scalekit-sdk-java-<version>.jar in $dir (found ${#main_jars[@]}); run mvn clean package" >&2
  exit 2
fi
# The sources and javadoc jars of the same version as the main jar.
jar="${main_jars[0]}"
sources="${jar%.jar}-sources.jar"
javadoc="${jar%.jar}-javadoc.jar"
for f in "$sources" "$javadoc"; do
  [ -f "$f" ] || { echo "error: missing $(basename "$f") next to $(basename "$jar"); run mvn clean package" >&2; exit 2; }
done

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
