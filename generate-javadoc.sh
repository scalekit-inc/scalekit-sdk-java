#!/bin/bash

# Script to generate Javadoc for Scalekit Java SDK
# Usage: ./generate-javadoc.sh [--open] [--no-open]
#   --open     Open docs in browser after generation (default in interactive mode)
#   --no-open  Skip opening the browser (default in non-interactive/CI mode)

OPEN_BROWSER=""
for arg in "$@"; do
  case "$arg" in
    --open)    OPEN_BROWSER="yes" ;;
    --no-open) OPEN_BROWSER="no"  ;;
  esac
done

echo "=========================================="
echo "Generating Javadoc for Scalekit Java SDK"
echo "=========================================="
echo ""

# Check if Maven is installed
if ! command -v mvn &> /dev/null; then
    echo "Error: Maven is not installed or not in PATH"
    exit 1
fi

# Clean previous javadoc
echo "Cleaning previous Javadoc..."
rm -rf target/site/apidocs

# Generate Javadoc
echo "Generating Javadoc..."
mvn javadoc:javadoc

# Check if generation was successful
if [ -d "target/site/apidocs" ]; then
    echo ""
    echo "=========================================="
    echo "Javadoc generated successfully!"
    echo "=========================================="
    echo ""
    echo "Documentation location: target/site/apidocs"
    echo "Open in browser: target/site/apidocs/index.html"
    echo ""

    # Ask if user wants to open in browser (skip in non-interactive/CI mode)
    if [[ -z "$OPEN_BROWSER" ]]; then
      if [[ -t 0 ]]; then
        read -p "Open Javadoc in browser? (y/n) " -n 1 -r
        echo ""
        [[ $REPLY =~ ^[Yy]$ ]] && OPEN_BROWSER="yes" || OPEN_BROWSER="no"
      else
        OPEN_BROWSER="no"
      fi
    fi

    if [[ "$OPEN_BROWSER" == "yes" ]]; then
        # Detect OS and open accordingly
        if [[ "$OSTYPE" == "darwin"* ]]; then
            # macOS
            open target/site/apidocs/index.html
        elif [[ "$OSTYPE" == "linux-gnu"* ]]; then
            # Linux
            xdg-open target/site/apidocs/index.html 2>/dev/null || echo "Please open target/site/apidocs/index.html manually"
        elif [[ "$OSTYPE" == "msys" || "$OSTYPE" == "cygwin" ]]; then
            # Windows
            start target/site/apidocs/index.html
        else
            echo "Please open target/site/apidocs/index.html manually"
        fi
    fi
else
    echo "Error: Javadoc generation failed"
    exit 1
fi
