PROTO_OUT := .artifacts
JAVA_PKG := src/main/java/com/scalekit/grpc

all: run
run:generate_grpc

exportAll:
	export PROTO_OUT
	export JAVA_PKG

generate_grpc:
	@echo "Generating gRPC code"
	buf generate --include-imports --verbose
	@echo "Copying generated code to $(JAVA_PKG)"
	cp -r $(PROTO_OUT)/com/scalekit/grpc/* $(JAVA_PKG)
