#!/bin/bash

# Update the package list and install curl and dependencies
echo "Installing dependencies..."
sudo apt-get update -y
sudo apt-get install -y curl libcurl4-openssl-dev libssl-dev libxml2-dev

# Download Quarto from the official release page
echo "Downloading Quarto..."
curl -LO https://github.com/quarto-dev/quarto-cli/releases/download/1.0.0/quarto-1.0.0-linux-amd64.deb

# Install the Quarto .deb package (works for Linux)
echo "Installing Quarto..."
sudo dpkg -i quarto-1.0.0-linux-amd64.deb

# Install missing dependencies, if necessary
sudo apt-get install -f

# Remove the downloaded .deb file after installation
rm quarto-1.0.0-linux-amd64.deb

# Verify if Quarto was successfully installed
echo "Quarto installed successfully!"
quarto --version
