#!/bin/bash

# Download Quarto
echo "Downloading Quarto..."
curl -Lo quarto.tar.gz https://github.com/quarto-dev/quarto-cli/releases/download/v1.3.252/quarto-1.3.252-linux-amd64.tar.gz

# Extract Quarto to a local directory
echo "Extracting Quarto..."
tar -xvzf quarto.tar.gz -C /opt

# Add Quarto to the PATH
echo "Adding Quarto to PATH..."
export PATH=$PATH:/opt/quarto-1.3.252-linux-amd64/bin

# Verify Quarto installation
quarto --version
