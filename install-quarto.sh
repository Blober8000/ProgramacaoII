#!/bin/bash
echo "Installing Quarto..."
# Install Quarto
curl -sSL https://github.com/quarto-dev/quarto-cli/releases/download/v1.0.0/quarto-1.0.0-linux-x86_64.tar.gz | tar -xz -C /usr/local/bin
