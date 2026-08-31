# Anusha Framework Help — Content File 03
## Scheduled Pipeline Execution + Scripts Folder Walkthrough

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We still do not have Anusha's actual repository, YAML, scripts, or reporting code. This file uses a realistic Azure DevOps + GitHub + Cucumber.js model so we can understand the likely execution path and recognize the real implementation quickly.

---

# 1. Objective

By the end of this content file, you should be able to:

- Explain how a scheduled Azure Pipeline starts.
- Trace the execution from YAML to script to npm to Cucumber.
- Understand why PowerShell and Bash scripts may both exist.
- Understand the role of exit codes.
- Understand how scripts can control environment setup, test selection, cleanup, and reporting.
- Identify where report deletion or overwrite may be happening.
- Identify where individual-test selection could be passed.
- Read an unknown scripts folder in a structured way.
- Explain the end-to-end scheduled execution flow confidently during the demo.

---

# 2. High-Level Execution Flow

Assumed flow:

```text
Azure Schedule
      ↓
Main YAML
      ↓
Template
      ↓
Agent
      ↓
Script
      ↓
npm
      ↓
Cucumber.js
      ↓
Feature Files
      ↓
Step Definitions
      ↓
Hooks
      ↓
Result
      ↓
Report
      ↓
Azure Test Results / Artifact
```

This is the main execution chain we need to understand.

---

# 3. What Happens When the Schedule Time Arrives?

Suppose the YAML contains:

```yaml
schedules:
- cron: "0 2 * * *"
  displayName: Nightly Regression
  branches:
    include:
    - main
  always: true
```

Conceptually:

```text
Configured Cron Time
       ↓
Azure DevOps Scheduler
       ↓
Pipeline Run Created
       ↓
Repository Checked Out
       ↓
Agent Allocated
       ↓
Pipeline Steps Begin
```

Important:

> Azure DevOps YAML cron schedules are evaluated in UTC.

So during the demo, if schedule timing matters, verify whether the intended business time has been converted correctly.

---

# 4. Scheduled Run vs Manual Run

A scheduled run may use:

```text
Default test suite
Default environment
Default browser
Default report settings
```

A manual run may later support:

```text
Selected tag
Selected environment
Selected browser
Selected feature
```

Conceptually:

```text
                   Azure Pipeline
                         │
              ┌──────────┴──────────┐
              │                     │
          Scheduled               Manual
              │                     │
        @regression             @TC001
              │                     │
              └──────────┬──────────┘
                         ↓
                       Script
                         ↓
                    Cucumber.js
```

This distinction is directly useful for Anusha's individual-test requirement.

---

# 5. Main YAML Responsibility

The main YAML normally handles orchestration.

Example:

```yaml
schedules:
- cron: "0 2 * * *"
  branches:
    include:
    - main

jobs:
- template: pipeline/template/c360.yaml
```

The main YAML may contain almost no test logic.

It may simply say:

```text
When to run
What template to call
What values to pass
```

That is why we must keep following referenced files.

---

# 6. Template Responsibility

Assume:

```yaml
# c360.yaml

jobs:
- template: windows.yaml
```

Then:

```text
Main YAML
    ↓
c360.yaml
    ↓
windows.yaml
```

`c360.yaml` may be acting as an orchestration layer.

Do not assume this is its real role until the file is inspected.

---

# 7. Windows Template Example

A realistic Windows-oriented template may look like:

```yaml
jobs:
- job: RunWindowsTests

  pool:
    vmImage: windows-latest

  steps:

  - checkout: self

  - task: NodeTool@0
    inputs:
      versionSpec: '20.x'

  - script: npm ci
    displayName: Install Dependencies

  - powershell: |
      ./pipeline/scripts/run-tests.ps1
    displayName: Execute Tests
```

Concept:

```text
Windows Agent
     ↓
Checkout
     ↓
Install Node
     ↓
npm ci
     ↓
PowerShell Script
```

---

# 8. Ubuntu Template Example

A realistic Ubuntu template may look like:

```yaml
jobs:
- job: RunUbuntuTests

  pool:
    vmImage: ubuntu-latest

  steps:

  - checkout: self

  - task: NodeTool@0
    inputs:
      versionSpec: '20.x'

  - script: npm ci
    displayName: Install Dependencies

  - bash: |
      ./pipeline/scripts/run-tests.sh
    displayName: Execute Tests
```

Concept:

```text
Ubuntu Agent
     ↓
Checkout
     ↓
Install Node
     ↓
npm ci
     ↓
Bash Script
```

---

# 9. Why Separate PowerShell and Bash Scripts?

Windows commonly uses:

```text
PowerShell
.ps1
```

Linux/Ubuntu commonly uses:

```text
Bash
.sh
```

The business logic may be similar:

```text
Prepare Environment
Create Report Directory
Run Cucumber
Capture Exit Code
Publish/Copy Results
```

But the command syntax differs.

Example:

### PowerShell

```powershell
New-Item -ItemType Directory -Path reports -Force
```

### Bash

```bash
mkdir -p reports
```

---

# 10. Assumed Scripts Folder

A realistic folder could look like:

```text
pipeline/
└── scripts/
    ├── run-tests.ps1
    ├── run-tests.sh
    ├── prepare-environment.ps1
    ├── prepare-environment.sh
    ├── create-report-folder.ps1
    ├── archive-report.ps1
    └── publish-report.ps1
```

Or it may contain only one script.

The important point is:

> Script names are clues, but the actual commands inside them are the truth.

---

# 11. What to Look for First in a Script

When Anusha opens a script, scan for these categories:

```text
1. Input parameters
2. Environment variables
3. Folder creation
4. Folder deletion
5. npm commands
6. cucumber-js commands
7. report paths
8. copy/move operations
9. exit codes
10. error handling
```

---

# 12. PowerShell Script Example

Assume:

```powershell
param(
    [string]$Tag = "@regression"
)

Write-Host "Running Cucumber tests for tag: $Tag"

New-Item -ItemType Directory -Path "reports" -Force

npx cucumber-js --tags $Tag

if ($LASTEXITCODE -ne 0) {
    Write-Host "Tests failed"
    exit $LASTEXITCODE
}

Write-Host "Tests completed"
```

What does this tell us?

```text
Input Tag
   ↓
Create reports directory
   ↓
Run Cucumber
   ↓
Check result
   ↓
Return failure if Cucumber failed
```

---

# 13. Bash Script Example

Equivalent idea:

```bash
#!/bin/bash

TAG="${1:-@regression}"

echo "Running Cucumber tests for tag: $TAG"

mkdir -p reports

npx cucumber-js --tags "$TAG"

EXIT_CODE=$?

if [ $EXIT_CODE -ne 0 ]; then
  echo "Tests failed"
  exit $EXIT_CODE
fi

echo "Tests completed"
```

Same logical behavior, different shell syntax.

---

# 14. Core Concept — Script Arguments

Suppose Azure passes:

```text
@TC001
```

to the script.

PowerShell:

```powershell
./run-tests.ps1 -Tag "@TC001"
```

Bash:

```bash
./run-tests.sh "@TC001"
```

Then script executes:

```bash
npx cucumber-js --tags "@TC001"
```

This is one possible path for individual-test execution.

---

# 15. Core Concept — npm Scripts

A shell script may not call Cucumber directly.

It may call:

```bash
npm run regression
```

Then `package.json` may contain:

```json
{
  "scripts": {
    "regression": "cucumber-js --tags \"@regression\"",
    "smoke": "cucumber-js --tags \"@smoke\""
  }
}
```

So actual flow becomes:

```text
YAML
 ↓
Script
 ↓
npm run regression
 ↓
package.json
 ↓
cucumber-js
```

This is why `package.json` must always be inspected.

---

# 16. Full Scheduled Execution Example

Assume the following.

## Main YAML

```yaml
schedules:
- cron: "0 2 * * *"
  branches:
    include:
    - main

jobs:
- template: pipeline/template/c360.yaml
```

## c360.yaml

```yaml
jobs:
- template: windows.yaml
```

## windows.yaml

```yaml
jobs:
- job: ExecuteRegression

  pool:
    vmImage: windows-latest

  steps:
  - script: npm ci

  - powershell: |
      ./pipeline/scripts/run-tests.ps1
```

## run-tests.ps1

```powershell
npm run regression
```

## package.json

```json
{
  "scripts": {
    "regression": "cucumber-js --tags \"@regression\""
  }
}
```

End-to-end:

```text
2:00 UTC
   ↓
Azure Schedule
   ↓
Main YAML
   ↓
c360.yaml
   ↓
windows.yaml
   ↓
Windows Agent
   ↓
npm ci
   ↓
run-tests.ps1
   ↓
npm run regression
   ↓
package.json
   ↓
cucumber-js --tags "@regression"
   ↓
Regression scenarios execute
```

---

# 17. Core Concept — Exit Code

An exit code tells the operating system whether a command succeeded.

Usually:

```text
0 = Success
non-zero = Failure
```

Example:

```bash
npx cucumber-js
echo $?
```

PowerShell commonly checks:

```powershell
$LASTEXITCODE
```

Why is this important?

Because Azure uses command/task status to determine:

```text
Pipeline Passed
Pipeline Failed
```

---

# 18. Cucumber Failure and Pipeline Failure

Assume one scenario fails.

```text
Cucumber Test Failure
        ↓
Cucumber exits non-zero
        ↓
Script receives non-zero
        ↓
Script returns failure
        ↓
Azure task fails
        ↓
Pipeline may fail
```

This is normally desirable.

However, we still want reports to publish even when tests fail.

---

# 19. Report Publishing After Failure

A common pattern is:

```text
Run Tests
    ↓
Pass OR Fail
    ↓
Publish Results Anyway
```

Conceptual YAML:

```yaml
- script: npm test
  displayName: Run Tests

- task: PublishTestResults@2
  condition: always()
  inputs:
    testResultsFormat: JUnit
    testResultsFiles: '**/junit.xml'
```

`condition: always()` is important because failed tests should still produce evidence.

---

# 20. Report Artifact Publishing

A report folder may also be published:

```yaml
- task: PublishPipelineArtifact@1
  condition: always()
  inputs:
    targetPath: reports
    artifact: cucumber-report
```

Concept:

```text
reports/
     ↓
Azure Pipeline Artifact
     ↓
Stored against pipeline run
```

This becomes important for report history.

---

# 21. Where Report Deletion May Be Happening

Search scripts for commands like:

### PowerShell

```powershell
Remove-Item -Recurse -Force reports
```

or:

```powershell
Remove-Item reports\* -Recurse -Force
```

### Bash

```bash
rm -rf reports
```

or:

```bash
rm -rf reports/*
```

These commands may explain why old evidence disappears.

---

# 22. Why Report Cleanup Exists

Deleting old reports before a run is not automatically wrong.

It may be done to avoid:

```text
Old test results mixing with new results
Old screenshots appearing in new report
Incorrect pass/fail counts
Artifact pollution
```

The real issue is:

> Current-run workspace cleanup and long-term evidence retention are two different concerns.

Better architecture:

```text
Current Working Folder
       ↓
Clean before each run
       ↓
Generate fresh report
       ↓
Publish/archive immutable copy
```

So we should not simply remove cleanup without understanding its purpose.

---

# 23. Correct Mental Model for Report History

Avoid:

```text
Never delete anything from reports/
```

Better:

```text
Temporary Current Run Folder
          ↓
Fresh Execution
          ↓
Publish to Unique Run Evidence
```

Example:

```text
working-reports/
    cucumber.html
```

then publish as:

```text
Artifact:
cucumber-report-Run-1024
```

or copy into:

```text
archive/
└── Run-1024/
```

depending on the actual architecture.

---

# 24. Where Individual Test Selection May Be Added

Potential chain:

```text
Azure Manual Parameter
       ↓
c360.yaml Parameter
       ↓
windows.yaml Parameter
       ↓
run-tests.ps1 Argument
       ↓
npm / cucumber-js
       ↓
--tags "@TC001"
```

Example:

## Main YAML

```yaml
parameters:
- name: cucumberTag
  type: string
  default: '@regression'
```

## Template

```yaml
- template: pipeline/template/windows.yaml
  parameters:
    cucumberTag: ${{ parameters.cucumberTag }}
```

## Windows Template

```yaml
- powershell: |
    ./pipeline/scripts/run-tests.ps1 -Tag "${{ parameters.cucumberTag }}"
```

## PowerShell

```powershell
param(
    [string]$Tag
)

npx cucumber-js --tags $Tag
```

This is a clean conceptual flow.

---

# 25. Scheduled Run Must Stay Safe

If the scheduled suite currently runs full regression, preserve that behavior.

For example:

```text
Default:
@regression
```

Manual user can override:

```text
@TC001
```

So:

```text
Scheduled
   ↓
No manual input
   ↓
Default @regression

Manual
   ↓
User enters @TC001
   ↓
Only TC001
```

This is the design principle to remember.

---

# 26. Environment Variables

Scripts may receive values through environment variables instead of parameters.

Example YAML:

```yaml
variables:
  TEST_TAG: '@regression'
```

Script:

```powershell
npx cucumber-js --tags $env:TEST_TAG
```

Bash:

```bash
npx cucumber-js --tags "$TEST_TAG"
```

So when tracing, look for:

```text
$env:
$(VARIABLE)
${VARIABLE}
process.env
```

---

# 27. Secrets

Scripts may also use secure values such as:

```text
Username
Password
API key
Bearer token
Connection string
```

Do not expect these to appear directly in code.

They may come from:

```text
Azure Pipeline Variables
Variable Groups
Key Vault
Environment Variables
Secret Variables
```

For tomorrow, our focus is recognition, not secret-management redesign.

---

# 28. Script Error Handling

PowerShell example:

```powershell
try {
    npm run regression

    if ($LASTEXITCODE -ne 0) {
        throw "Cucumber execution failed"
    }
}
catch {
    Write-Error $_
    exit 1
}
```

Bash example:

```bash
set -e

npm run regression
```

or manual handling:

```bash
npm run regression

if [ $? -ne 0 ]; then
  exit 1
fi
```

These patterns affect pipeline pass/fail behavior.

---

# 29. Script Logging

Look for:

```powershell
Write-Host
Write-Error
Write-Warning
```

or:

```bash
echo
printf
```

Good logging helps determine:

```text
Which environment ran?
Which tag ran?
Which report path was used?
Where failure occurred?
```

During the demo, logs may be the fastest way to understand the execution.

---

# 30. Where the Report Path May Be Controlled

Possible places:

```text
package.json
cucumber.js
cucumber.json
script arguments
environment variables
PowerShell script
Bash script
custom reporter code
YAML variable
```

Example:

```json
{
  "scripts": {
    "regression": "cucumber-js --format html:reports/report.html"
  }
}
```

or:

```powershell
$ReportPath = "reports/$env:BUILD_BUILDID"
```

Always trace the actual path source.

---

# 31. Build ID

Azure exposes build/run information through predefined variables.

A useful concept for report uniqueness is:

```text
Build ID
```

Conceptually:

```text
Run 1001 → Report 1001
Run 1002 → Report 1002
Run 1003 → Report 1003
```

We will cover report archiving in depth in the next dedicated content file.

---

# 32. Script Folder Investigation Checklist

When the real repository is shown:

```text
Open scripts/
```

Then classify every file:

| Category | Examples |
|---|---|
| Setup | install, prepare, init |
| Execution | run-tests, execute |
| Environment | env, config |
| Reporting | report, publish |
| Cleanup | clean, delete |
| Archive | archive, backup |
| Utility | helper, common |
| Deployment | deploy |
| C360-specific | c360 |

Then identify:

```text
Who calls each script?
```

---

# 33. Reverse Trace

If Anusha starts from the report page instead of code, trace backward.

```text
Pie Chart / Report
      ↑
Published Test Results
      ↑
JUnit / Cucumber Output
      ↑
Test Command
      ↑
Script
      ↑
Template
      ↑
Main YAML
      ↑
Schedule
```

This is often faster when troubleshooting reporting.

---

# 34. Forward Trace

If she starts from YAML:

```text
Main YAML
      ↓
Template
      ↓
Script
      ↓
npm
      ↓
Cucumber
      ↓
Feature
      ↓
Result
      ↓
Report
```

Both directions should make sense to you.

---

# 35. Practical Exercise 1

Given:

```yaml
- powershell: |
    ./pipeline/scripts/run-tests.ps1
```

and:

```powershell
npm run test:c360
```

and:

```json
{
  "scripts": {
    "test:c360": "cucumber-js --tags \"@c360\""
  }
}
```

Explain the flow:

```text
Azure
  ↓
PowerShell
  ↓
npm
  ↓
Cucumber
  ↓
@c360 scenarios
```

---

# 36. Practical Exercise 2

Given:

```powershell
Remove-Item -Recurse -Force reports
New-Item -ItemType Directory reports
npm test
```

What is the likely issue?

Answer:

> The current execution folder is intentionally being cleaned before the run, so previous local reports are removed. We should not immediately remove cleanup. We should determine where the completed report should be archived before cleanup occurs on the next run.

---

# 37. Practical Exercise 3

Given:

```yaml
- script: npm test

- task: PublishPipelineArtifact@1
  condition: always()
  inputs:
    targetPath: reports
```

What is happening?

Answer:

```text
Tests run
   ↓
Report directory exists
   ↓
Artifact publishing executes even if tests fail
   ↓
Report evidence is attached to the pipeline run
```

---

# 38. Common Mistakes

## Mistake 1 — Modifying the Script Before Understanding Inputs

Check parameters and environment variables first.

---

## Mistake 2 — Removing Cleanup Just to Preserve Reports

Cleanup may be necessary for correct execution.

Archive before the next cleanup instead.

---

## Mistake 3 — Hardcoding One Test

Bad:

```bash
npx cucumber-js --tags "@TC001"
```

directly into a shared regression script.

Better:

```text
Receive test selector
       ↓
Default regression
       ↓
Allow manual override
```

---

## Mistake 4 — Swallowing Test Failures

Bad example:

```powershell
npm test
exit 0
```

This can make Azure show green even when tests fail.

Preserve the real exit code.

---

## Mistake 5 — Publishing Reports Only on Success

Failed tests need evidence even more than successful tests.

Use an always-run publishing mechanism where appropriate.

---

# 39. Demo Conversation Practice

## Anusha: How will you find where tests actually start?

**Answer:**

> I will trace from the main pipeline into the referenced template, then into the called PowerShell or Bash script, then into the npm script, until I reach the actual Cucumber command.

---

## Anusha: What if the script deletes the report folder?

**Answer:**

> I would first verify whether that cleanup is intentionally keeping each run clean. If yes, I would preserve that behavior and archive or publish the completed report before the next run rather than mixing historical reports into the current working directory.

---

## Anusha: Can one script support full suite and one test?

**Answer:**

> Yes. The script can accept a test selector, such as a Cucumber tag, while keeping `@regression` as the default for scheduled runs.

---

## Anusha: Why do we care about exit codes?

**Answer:**

> The script's exit code is what allows Azure to know whether the test execution actually passed or failed. We should avoid masking Cucumber failures while still ensuring reports are published.

---

## Anusha: Why might we have both `.ps1` and `.sh`?

**Answer:**

> They may support Windows and Ubuntu agents respectively. I would compare them to see whether they implement the same business flow with OS-specific command syntax.

---

# 40. Demo-Day Questions

Ask these when the scripts folder is shown:

1. Which script is the main test runner?
2. Which YAML calls it?
3. Does Windows use PowerShell?
4. Does Ubuntu use Bash?
5. Are both platforms actually active?
6. Which npm command is called?
7. Which `package.json` script does that map to?
8. Where is the Cucumber tag/filter defined?
9. Where is the report directory created?
10. Is the report directory cleaned first?
11. Where are screenshots stored?
12. Where is JUnit/XML generated?
13. Is a custom HTML reporter being used?
14. Does the script preserve Cucumber's exit code?
15. Are reports published even when the test fails?
16. Does the script use Azure build/run variables?
17. Does the scheduled run always use the full suite?
18. Is there already any input mechanism for selective execution?

---

# 41. Tomorrow Cheat Sheet

```text
SCHEDULE
   ↓
MAIN YAML
   ↓
TEMPLATE
   ↓
AGENT
   ↓
SCRIPT
   ↓
NPM
   ↓
CUCUMBER
   ↓
RESULT
   ↓
REPORT
```

When reading a script:

```text
Inputs
→ Environment
→ Cleanup
→ Setup
→ Test Command
→ Exit Code
→ Report
→ Publish
```

Watch for:

```text
Remove-Item
rm -rf
npm run
npx cucumber-js
--tags
reports/
junit.xml
$LASTEXITCODE
exit
```

---

# 42. Readiness Check

You are ready to move forward if you can answer:

- What starts a scheduled pipeline?
- What happens after the schedule triggers?
- Why may Windows use PowerShell and Ubuntu use Bash?
- Why do we follow YAML into scripts?
- Why do we follow scripts into `package.json`?
- What does exit code 0 normally mean?
- Why should test failures return a non-zero code?
- Why should reports still publish when tests fail?
- Why might a report folder be deleted before execution?
- Why should we not simply remove cleanup?
- How can a test tag move from Azure to Cucumber?
- How can scheduled regression remain unchanged while manual selective execution is added?

---

# 43. Next Content File

## Content File 04 — Report Lifecycle, Historical Evidence, and Archive Solution

Focus:

```text
Current Run
→ Report Creation
→ Screenshots / JUnit / HTML
→ Publish Test Results
→ Archive Evidence
→ Unique Run ID
→ Preserve History
→ Next Run Starts Clean
```

This file will directly prepare us for Anusha's first reported issue.
