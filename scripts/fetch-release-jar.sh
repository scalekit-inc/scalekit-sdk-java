#!/usr/bin/env bash
# Downloads the published scalekit-sdk-java jar for a version from Maven Central and verifies
# its checksum. Used by `make api-compat` as the japicmp baseline.
#
# The baseline is fetched directly instead of being resolved as a Maven dependency because
# the version in pom.xml usually equals the latest release between releases; Maven would then
# resolve the baseline to the jar this build just produced and compare it with itself.
#
# Usage: scripts/fetch-release-jar.sh <version> <output-jar-path>
set -euo pipefail

if [ "$#" -ne 2 ] || [ -z "$1" ] || [ -z "$2" ]; then
  echo "usage: $0 <version> <output-jar-path>" >&2
  exit 2
fi

version="$1"
out="$2"
base_url="${MAVEN_CENTRAL_URL:-https://repo1.maven.org/maven2}/com/scalekit/scalekit-sdk-java/${version}"
jar_url="${base_url}/scalekit-sdk-java-${version}.jar"

# The jar is only moved into place after its checksum matched, so an existing file is reused.
if [ -s "$out" ]; then
  echo "baseline: ${out} (already downloaded)"
  exit 0
fi

mkdir -p "$(dirname "$out")"
tmp="${out}.part"
trap 'rm -f "$tmp"' EXIT

echo "fetching ${jar_url}"
if ! curl -fsSL --retry 5 --retry-delay 5 -o "$tmp" "$jar_url"; then
  echo "error: scalekit-sdk-java ${version} could not be downloaded from Maven Central." >&2
  echo "Check that the version is released (the baseline is the latest v* tag or JAPICMP_OLD_VERSION)." >&2
  exit 1
fi

# Every Central artifact has a .sha1; newer ones also have a .sha256, which is preferred.
if expected="$(curl -fsSL --retry 5 --retry-delay 5 "${jar_url}.sha256" 2>/dev/null)"; then
  actual="$(sha256sum "$tmp" | cut -d' ' -f1)"
else
  expected="$(curl -fsSL --retry 5 --retry-delay 5 "${jar_url}.sha1")"
  actual="$(sha1sum "$tmp" | cut -d' ' -f1)"
fi
expected="$(printf '%s' "$expected" | tr -d '[:space:]' | cut -c1-${#actual})"
if [ "$expected" != "$actual" ]; then
  echo "error: checksum mismatch for ${jar_url} (expected ${expected}, got ${actual})" >&2
  exit 1
fi

mv "$tmp" "$out"
echo "baseline: ${out} (checksum verified)"
