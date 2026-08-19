$projectRoot = Split-Path -Parent $PSScriptRoot

$sourceRoot = Join-Path $projectRoot "src\main\java\org\example"
$outputFile = Join-Path $projectRoot "REPORT.md"

$rows = @()

Get-ChildItem $sourceRoot -Recurse -Filter "Main.java" |
    Where-Object {
        $_.Directory.Name -match '^topic\d+$' -and
        $_.Directory.Parent.Name -match '^chap\d+$'
    } |
    Sort-Object FullName |
    ForEach-Object {

        $file = $_
        $content = Get-Content $file.FullName -Encoding UTF8

        $summary = "TODO"
        $keyword = "TODO"
        $level = "TODO"

        foreach ($line in $content) {

            if ($line -match '^\s*//\s*Summary:\s*(.*)$') {
                $summary = $matches[1].Trim()
            }

            if ($line -match '^\s*//\s*Keyword:\s*(.*)$') {
                $keyword = $matches[1].Trim()
            }

            if ($line -match '^\s*//\s*Level:\s*(.*)$') {
                $level = $matches[1].Trim()
            }
        }

        $topic = $file.Directory.Name
        $chapter = $file.Directory.Parent.Name

        $relativePath = $file.FullName.Replace(
            $projectRoot + "\",
            ""
        )

        $rows += "| $chapter | $topic | $summary | $keyword | $level | ``$relativePath`` |"
    }

$report = @"
# Java Gold Study Report

| Chapter | Topic | Summary | Keyword | Level | File |
|---|---|---|---|:---:|---|
$($rows -join "`n")

## Level

- A: Good
- B: Review recommended
- C: Needs review
- TODO: Not evaluated
"@

[System.IO.File]::WriteAllText(
    $outputFile,
    $report,
    [System.Text.UTF8Encoding]::new($false)
)

Write-Host "Created: $outputFile"