@echo off
setlocal

powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0scripts\create-report.ps1"

if errorlevel 1 (
    echo ERROR: Failed to create report.
    exit /b 1
)

endlocal