# Usage:
#   make setup     # Install tooling and prefetch Maven dependencies locally
#   make generate  # Regenerate SDK code from proto sources
#   make lint      # Run static checks
#   make test      # Run unit tests

SHELL := /bin/bash

MVN := mvn
TOOLS_BIN := $(CURDIR)/.tools/bin
MAVEN_REPO_LOCAL := $(CURDIR)/.tools/m2
MVN_FLAGS := -B -ntp -Dmaven.repo.local="$(MAVEN_REPO_LOCAL)"
MVN_CMD := $(MVN) $(MVN_FLAGS)
BUF := PATH="$(TOOLS_BIN):$$PATH" buf

PROTO_REPO_URL := https://github.com/scalekit-inc/scalekit.git
PROTO_REF := v0.1.103
PROTO_SUBDIR := proto
PROTO_REMOTE_INPUT := $(PROTO_REPO_URL)\#ref=$(PROTO_REF),subdir=$(PROTO_SUBDIR)
BUF_GENERATE_FLAGS := --include-imports

PROTO_OUT := .artifacts
JAVA_PKG := src/main/java/com/scalekit/grpc

.PHONY: setup tools-check generate lint test verify-generate

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

lint:
	@echo "No dedicated lint/static plugin configured in pom.xml; skipping lint."

test:
	$(MVN_CMD) test

verify-generate: generate
	git diff --exit-code
