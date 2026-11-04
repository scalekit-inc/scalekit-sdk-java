# Usage:
#   make setup           # Install tooling and prefetch Maven dependencies locally
#   make generate        # Regenerate SDK code from proto sources
#   make generate-local  # Regenerate SDK code from local ../scalekit/proto
#   make lint            # Run static checks
#   make javadoc         # Fail on broken Javadoc references
#   make test            # Run unit tests
#   make publish         # Publish the pom.xml version to Google Artifact Registry
#   make publish-dry-run # Build and sign the release into target/publish-dry-run; publishes nothing

SHELL := /bin/bash

MVN := mvn
TOOLS_BIN := $(CURDIR)/.tools/bin
MAVEN_REPO_LOCAL := $(CURDIR)/.tools/m2
MVN_FLAGS := -B -ntp -Dmaven.repo.local="$(MAVEN_REPO_LOCAL)"
MVN_CMD := $(MVN) $(MVN_FLAGS)
BUF := PATH="$(TOOLS_BIN):$$PATH" buf

PROTO_REPO_URL := https://github.com/scalekit-inc/scalekit.git
PROTO_REF := v0.1.160.0
PROTO_SUBDIR := proto
PROTO_REMOTE_INPUT := $(PROTO_REPO_URL)\#ref=$(PROTO_REF),subdir=$(PROTO_SUBDIR)
BUF_GENERATE_FLAGS := --include-imports

PROTO_LOCAL_INPUT := ../scalekit

PROTO_OUT := .artifacts
JAVA_PKG := src/main/java/com/scalekit/grpc

# Must match the gcp-artifact-registry profile in pom.xml.
ARTIFACT_REGISTRY_URL := https://us-maven.pkg.dev/scalekit-public/java
ARTIFACT_PATH := com/scalekit/scalekit-sdk-java

.PHONY: setup tools-check generate generate-local lint javadoc test verify-generate publish publish-dry-run

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

verify-generate: generate
	git diff --exit-code

# Builds the three jars a release publishes and checks their total against
# RELEASE_SIZE_LIMIT_MB (default 60; Maven Central's free tier allows about 80 MB per month).
.PHONY: release-size
release-size:
	$(MVN_CMD) -DskipTests -Dgpg.skip clean package
	scripts/check-release-size.sh

# Publishes the version in pom.xml to the public Google Artifact Registry repository.
# Needs gcloud logged in as an account with Artifact Registry Writer on the repository,
# and a GPG key for signing. Tests are skipped here: CI runs them on every push to main.
# Refuses to run from a dirty tree or to re-publish a version that already exists.
publish:
	@command -v gcloud >/dev/null 2>&1 || (echo "missing gcloud. install the Google Cloud CLI and run 'gcloud auth login'" && exit 1)
	@[ -z "$$(git status --porcelain)" ] || (echo "uncommitted or untracked files; publish from a clean checkout of the release commit" && git status --short && exit 1)
	@version="$$($(MVN_CMD) -q help:evaluate -Dexpression=project.version -DforceStdout)" || exit 1; \
	pom_url="$(ARTIFACT_REGISTRY_URL)/$(ARTIFACT_PATH)/$$version/scalekit-sdk-java-$$version.pom"; \
	status="$$(curl -s -o /dev/null -w '%{http_code}' "$$pom_url")"; \
	if [ "$$status" = "200" ]; then echo "$$version is already published at $(ARTIFACT_REGISTRY_URL); bump the version first"; exit 1; fi; \
	if [ "$$status" != "404" ]; then echo "could not check whether $$version is published: HTTP $$status from $$pom_url (is the repository created and readable by allUsers?)"; exit 1; fi; \
	token="$$(gcloud auth print-access-token)" && [ -n "$$token" ] || { echo "gcloud auth print-access-token failed; run 'gcloud auth login'"; exit 1; }; \
	echo "publishing scalekit-sdk-java $$version to $(ARTIFACT_REGISTRY_URL)"; \
	ARTIFACT_REGISTRY_TOKEN="$$token" $(MVN_CMD) -gs .mvn/artifact-registry-settings.xml -P gcp-artifact-registry -DskipTests clean deploy && \
	echo "published: $$pom_url"

# Builds and signs exactly what `make publish` would upload, into target/publish-dry-run.
# Publishes nothing and needs no Google Cloud access; the Release workflow uses it for
# its dry-run mode.
publish-dry-run:
	$(MVN_CMD) -P gcp-artifact-registry -DskipTests -DaltDeploymentRepository=dry-run::file:$(CURDIR)/target/publish-dry-run clean deploy
	@echo "dry run complete: artifacts in target/publish-dry-run; nothing was published"
