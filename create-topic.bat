@echo off
setlocal

REM バッチの実行方法oke
REM .\create-topic.bat 01 2

if "%~1"=="" (
    echo Usage: create-topic.bat [chapter] [topic]
    echo Example: create-topic.bat 01 1
    exit /b 1
)

if "%~2"=="" (
    echo Usage: create-topic.bat [chapter] [topic]
    echo Example: create-topic.bat 01 1
    exit /b 1
)

set "CHAP=%~1"
set "TOPIC=0%~2"
set "TOPIC=%TOPIC:~-2%"

set "PACKAGE=org.example.chap%CHAP%.topic%TOPIC%"
set "TARGET_DIR=src\main\java\org\example\chap%CHAP%\topic%TOPIC%"
set "TARGET_FILE=%TARGET_DIR%\Main.java"
set "TEMPLATE=template\Main.java.template"

if exist "%TARGET_FILE%" (
    echo ERROR: Main.java already exists.
    echo %TARGET_FILE%
    exit /b 1
)

if not exist "%TARGET_DIR%" (
    mkdir "%TARGET_DIR%"
)

powershell -NoProfile -Command "(Get-Content '%TEMPLATE%' -Raw) -replace '\$\{PACKAGE\}', '%PACKAGE%' | Set-Content '%TARGET_FILE%'"

echo.
echo Created:
echo %TARGET_FILE%
echo.
echo Package:
echo %PACKAGE%

endlocal