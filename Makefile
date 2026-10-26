# Usage:
#   make setup           # Install tooling and prefetch Maven dependencies locally
#   make generate        # Regenerate SDK code from proto sources
#   make generate-local  # Regenerate SDK code from local ../scalekit/proto
#   make lint            # Run static checks
#   make javadoc         # Fail on broken Javadoc references
#   make test            # Run all tests, including live ones (needs SCALEKIT_* env vars)
#   make unit-test       # Run only the tests that need no credentials or network
#   make api-compat      # Fail on a binary/source incompatible API change vs the last release
#   make jar-check       # Fail if the packaged jar bundles an unexpected unrelocated package

SHELL := /bin/bash

MVN := mvn
TOOLS_BIN := $(CURDIR)/.tools/bin
MAVEN_REPO_LOCAL := $(CURDIR)/.tools/m2
MVN_FLAGS := -B -ntp -Dmaven.repo.local="$(MAVEN_REPO_LOCAL)"
MVN_CMD := $(MVN) $(MVN_FLAGS)
BUF := PATH="$(TOOLS_BIN):$$PATH" buf

PROTO_REPO_URL := https://github.com/scalekit-inc/scalekit.git
PROTO_REF := v0.1.150.0
PROTO_SUBDIR := proto
PROTO_REMOTE_INPUT := $(PROTO_REPO_URL)\#ref=$(PROTO_REF),subdir=$(PROTO_SUBDIR)
BUF_GENERATE_FLAGS := --include-imports

PROTO_LOCAL_INPUT := ../scalekit

PROTO_OUT := .artifacts
JAVA_PKG := src/main/java/com/scalekit/grpc

.PHONY: setup tools-check generate generate-local lint javadoc test unit-test api-compat jar-check verify-generate

setup:
	@mkdir -p "$(TOOLS_BIN)" "$(MAVEN_REPO_LOCAL)"
	@command -v "$(MVN)" >/dev/null 2>&1 || (echo "missing maven. install Maven and retry." && exit 1)
	@echo "prefetching Maven dependencies into $(MAVEN_REPO_LOCAL)"
	$(MVN_CMD) -DskipTests dependency:go-offline
	@echo "setup complete"

tools-check:
	@command -v "$(MVN)" >/dev/null 2>&1 || (echo "missing maven. run 'make setup'" && exit 1)
	@PATH="$(TOOLS_BIN):$$PATH" command -v buf >/dev/null 2>&1 || (echo "missing buf. install buf (https://buf.build/docs/installation/) and rerun 'make generate'" && exit 1)

generate: tools-check
	@echo "cleaning generated paths"
	rm -rf "$(PROTO_OUT)" "$(JAVA_PKG)"
	@echo "generating grpc/protobuf code from $(PROTO_REMOTE_INPUT)"
	$(BUF) generate "$(PROTO_REMOTE_INPUT)" --template buf.gen.yaml $(BUF_GENERATE_FLAGS)
	@echo "copying generated java code to $(JAVA_PKG)"
	mkdir -p "$(JAVA_PKG)"
	cp -r "$(PROTO_OUT)"/com/scalekit/grpc/* "$(JAVA_PKG)"

generate-local: tools-check
	@echo "cleaning generated paths"
	rm -rf "$(PROTO_OUT)" "$(JAVA_PKG)"
	@echo "generating grpc/protobuf code from $(PROTO_LOCAL_INPUT)"
	$(BUF) generate "$(PROTO_LOCAL_INPUT)" --template buf.gen.yaml $(BUF_GENERATE_FLAGS)
	@echo "copying generated java code to $(JAVA_PKG)"
	mkdir -p "$(JAVA_PKG)"
	cp -r "$(PROTO_OUT)"/com/scalekit/grpc/* "$(JAVA_PKG)"

lint:
	@echo "No dedicated lint/static plugin configured in pom.xml; skipping lint."

# Runs the standard doclet with the doclint groups set in pom.xml (all,-missing).
# A broken {@link} is a Javadoc error, so this fails here instead of during `mvn deploy`.
javadoc:
	$(MVN_CMD) javadoc:javadoc

test:
	$(MVN_CMD) test

# Tests that call a real Scalekit environment carry @Tag("live"); everything else must run
# without credentials or network, so tag any new test that needs them. Sources are compiled
# by the JDK running Maven (release 8); JVM=/path/to/bin/java runs the tests on another JDK,
# which is how CI covers JDK 8, 11, 17, 21 and 25.
unit-test:
	$(MVN_CMD) -DexcludedGroups=live $(if $(JVM),-Djvm="$(JVM)") test

# Compares the packaged jar with the jar of JAPICMP_OLD_VERSION published on Maven Central
# (default: the japicmp.oldVersion property in pom.xml; CI passes the latest v* tag).
# Fails on any binary or source incompatible change. Reports: target/japicmp/.
JAPICMP_OLD_VERSION ?= $(shell sed -n 's:.*<japicmp.oldVersion>\(.*\)</japicmp.oldVersion>.*:\1:p' pom.xml)
JAPICMP_OLD_JAR := $(CURDIR)/target/japicmp-baseline/scalekit-sdk-java-$(JAPICMP_OLD_VERSION).jar

api-compat:
	scripts/fetch-release-jar.sh "$(JAPICMP_OLD_VERSION)" "$(JAPICMP_OLD_JAR)"
	$(MVN_CMD) -DskipTests -Dgpg.skip -Dmaven.javadoc.skip=true -Djapicmp.skip=false \
		-Djapicmp.oldVersion="$(JAPICMP_OLD_VERSION)" -Djapicmp.oldJar="$(JAPICMP_OLD_JAR)" verify

# Packages the shaded jar and checks it against scripts/jar-contents-allowlist.txt.
jar-check:
	$(MVN_CMD) -DskipTests -Dgpg.skip -Dmaven.javadoc.skip=true package
	scripts/check-jar-contents.sh

verify-generate: generate
	git diff --exit-code
