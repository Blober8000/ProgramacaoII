# install-quarto.sh for Windows

echo "Installing Quarto..."

# Download Quarto MSI installer for Windows
curl -LO https://github.com/quarto-dev/quarto-cli/releases/download/1.0.0/quarto-1.0.0-windows-x86_64.msi

# Install Quarto using the MSI installer (works for Windows)
echo "Installing Quarto..."
msiexec /i quarto-1.0.0-windows-x86_64.msi /quiet /norestart

# Remove the MSI file after installation
del quarto-1.0.0-windows-x86_64.msi

# Check if Quarto is installed correctly
quarto --version
