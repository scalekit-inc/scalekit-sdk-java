#!/usr/bin/env bash
# Checks what the packaged (shaded) jar bundles outside com/scalekit/ and META-INF/.
#
# Bundled third-party classes must be relocated under com/scalekit/shaded/. Packages that are
# still bundled under their original names are listed in scripts/jar-contents-allowlist.txt;
# anything else fails the check. The allowlist is a ratchet: when a package leaves the jar,
# its entry must be removed too (the check fails on stale entries), so it cannot come back
# unnoticed.
#
# Also fails on a module descriptor in the jar (module-info.class, at the root or under
# META-INF/versions/), and on unrelocated classes under META-INF/versions/ if the jar is
# Multi-Release (otherwise the JVM ignores them; they are listed as a warning).
#
# Usage:
#   scripts/check-jar-contents.sh [path/to/scalekit-sdk-java-<version>.jar]
#   scripts/check-jar-contents.sh --list [jar]   # print the bundled package prefixes
set -euo pipefail

here="$(cd "$(dirname "$0")" && pwd)"
allowlist="${JAR_CONTENTS_ALLOWLIST:-$here/jar-contents-allowlist.txt}"

list_only=false
if [ "${1:-}" = "--list" ]; then
  list_only=true
  shift
fi

jar="${1:-}"
if [ -z "$jar" ]; then
  shopt -s nullglob
  candidates=()
  for f in "$here"/../target/scalekit-sdk-java-*.jar; do
    case "$f" in
      *-sources.jar|*-javadoc.jar|*-shaded.jar) ;;
      *) candidates+=("$f") ;;
    esac
  done
  if [ "${#candidates[@]}" -ne 1 ]; then
    echo "error: expected exactly one packaged jar in target/ (found ${#candidates[@]}); pass the path" >&2
    exit 2
  fi
  jar="${candidates[0]}"
fi
[ -f "$jar" ] || { echo "error: no such jar: $jar" >&2; exit 2; }

command -v unzip >/dev/null 2>&1 || { echo "error: unzip is required" >&2; exit 2; }

# Package prefix of an entry, at the granularity used by the allowlist: two directory levels
# (org/jose4j/, jakarta/mail/), one more under umbrella namespaces that hold unrelated
# libraries (org/apache/http/, org/apache/commons/codec/, org/codehaus/mojo/). A file at the
# root of the jar is its own prefix.
prefix_of() {
  awk -F/ '{
    n = NF - 1
    if (n == 0) { print $0; next }
    depth = 2
    if ($1 == "org" && ($2 == "apache" || $2 == "codehaus")) depth = 3
    if ($1 == "org" && $2 == "apache" && $3 == "commons") depth = 4
    if (depth > n) depth = n
    p = $1
    for (i = 2; i <= depth; i++) p = p "/" $i
    print p "/"
  }'
}

entries="$(unzip -Z1 "$jar" | grep -v '/$')"
# Files of this project at the jar root (pom <resources>), not dependencies.
owned_root_files='^(LICENSE)$'
outside="$(printf '%s\n' "$entries" | grep -Ev '^(com/scalekit/|META-INF/)' | grep -Ev "$owned_root_files" || true)"

if $list_only; then
  printf '%s\n' "$outside" | sed '/^$/d' | prefix_of | sort | uniq -c
  exit 0
fi

[ -f "$allowlist" ] || { echo "error: allowlist not found: $allowlist" >&2; exit 2; }
allowed="$(sed -e 's/#.*//' -e 's/[[:space:]]*$//' -e '/^$/d' "$allowlist")"

status=0
echo "checking $(basename "$jar") against $(basename "$allowlist")"

# 1. Every bundled entry outside com/scalekit/ and META-INF/ is under an allowlisted prefix.
unexpected="$(printf '%s\n' "$outside" | sed '/^$/d' | awk -v list="$allowed" '
  BEGIN { n = split(list, a, "\n") }
  { ok = 0; for (i = 1; i <= n; i++) if (index($0, a[i]) == 1) { ok = 1; break } if (!ok) print }')"
if [ -n "$unexpected" ]; then
  status=1
  echo "FAIL: unrelocated third-party entries outside the allowlist (relocate them under"
  echo "      com.scalekit.shaded in the maven-shade-plugin config, or declare a normal dependency):"
  printf '%s\n' "$unexpected" | prefix_of | sort | uniq -c | sed 's/^/      /'
  echo "      first entries:"
  printf '%s\n' "$unexpected" | head -5 | sed 's/^/        /'
fi

# 2. Ratchet: every allowlist entry still matches something in the jar.
stale="$(printf '%s\n' "$outside" | sed '/^$/d' | awk -v list="$allowed" '
  BEGIN { n = split(list, a, "\n") }
  { for (i = 1; i <= n; i++) if (index($0, a[i]) == 1) seen[i] = 1 }
  END { for (i = 1; i <= n; i++) if (!seen[i]) print a[i] }')"
if [ -n "$stale" ]; then
  status=1
  echo "FAIL: allowlist entries no longer in the jar; remove them from $(basename "$allowlist"):"
  printf '%s\n' "$stale" | sed 's/^/      /'
fi

# 3. Module descriptors (JV-PKG-2): the jar must not carry a dependency's module-info.
descriptors="$(printf '%s\n' "$entries" | grep -E '(^|^META-INF/versions/[0-9]+/)module-info\.class$' || true)"
if [ -n "$descriptors" ]; then
  status=1
  echo "FAIL: module descriptors in the jar (exclude them in the maven-shade-plugin filters):"
  printf '%s\n' "$descriptors" | sed 's/^/      /'
fi

# 4. Versioned classes are only loaded from a Multi-Release jar.
versioned="$(printf '%s\n' "$entries" | grep -E '^META-INF/versions/[0-9]+/.+\.class$' \
  | grep -Ev '^META-INF/versions/[0-9]+/(com/scalekit/|module-info\.class$)' || true)"
if [ -n "$versioned" ]; then
  if (unzip -p "$jar" META-INF/MANIFEST.MF 2>/dev/null || true) | tr -d '\r' | grep -qi '^Multi-Release: *true'; then
    status=1
    echo "FAIL: Multi-Release jar with unrelocated versioned classes:"
  else
    echo "warning: unrelocated classes under META-INF/versions/ (ignored by the JVM: the jar is not Multi-Release):"
  fi
  printf '%s\n' "$versioned" | sed 's#^\(META-INF/versions/[0-9]*/\)\(.*\)/[^/]*$#\1\2/#' | sort | uniq -c | sed 's/^/      /'
fi

if [ "$status" -eq 0 ]; then
  echo "OK: $(printf '%s\n' "$outside" | sed '/^$/d' | wc -l | tr -d ' ') entries outside com/scalekit/ and META-INF/, all under allowlisted prefixes"
fi
exit "$status"
