#!/bin/bash
echo "Installing Quarto..."

# Install dependencies (curl and wget) if needed
if ! command -v curl &> /dev/null
then
    echo "curl could not be found, installing it..."
    apt-get update
    apt-get install -y curl
fi

# Download the latest Quarto tarball (for Linux)
curl -sSL https://github.com/quarto-dev/quarto-cli/releases/latest/download/quarto-1.0.0-linux-x86_64.tar.gz | tar -xz -C /usr/local/bin

# Verify installation
echo "Quarto version:"
quarto --version
