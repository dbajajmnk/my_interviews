# Anusha Framework Help — Content File 06
## Demo Troubleshooting Scenarios + Senior Engineer Diagnostic Approach

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We still do not have Anusha's actual repository or Azure pipeline. This file is designed to help you diagnose likely failures methodically instead of guessing during the demo.

---

# 1. Objective

By the end of this content file, you should be able to:

- Troubleshoot a pipeline that does not start.
- Troubleshoot a scheduled pipeline running at the wrong time.
- Troubleshoot YAML/template loading issues.
- Troubleshoot script execution problems.
- Troubleshoot npm dependency and Node.js issues.
- Troubleshoot Cucumber finding zero tests.
- Troubleshoot tag filtering problems.
- Troubleshoot missing reports.
- Troubleshoot old reports being overwritten.
- Troubleshoot missing Azure test results.
- Troubleshoot pipelines showing green when tests failed.
- Use a structured senior-engineer diagnostic flow rather than random trial and error.

---

# 2. Core Troubleshooting Principle

Never jump directly to changing code.

Use this order:

```text
Observe
   ↓
Locate Failure Layer
   ↓
Verify Inputs
   ↓
Verify Execution
   ↓
Verify Output
   ↓
Change Smallest Possible Thing
   ↓
Re-run
```

---

# 3. The Layers We Need to Think About

For this assumed framework:

```text
Layer 1 — GitHub
Layer 2 — Azure Trigger / Schedule
Layer 3 — Main YAML
Layer 4 — Templates
Layer 5 — Agent
Layer 6 — Scripts
Layer 7 — Node / npm
Layer 8 — Cucumber
Layer 9 — Feature / Steps / Hooks
Layer 10 — Report Generation
Layer 11 — Azure Test Publishing
Layer 12 — Artifact / Dashboard
```

If you identify the correct layer, troubleshooting becomes much easier.

---

# 4. Senior Diagnostic Flow

When something fails, ask:

```text
Did the pipeline start?
   ↓
Did the correct YAML load?
   ↓
Did the correct template run?
   ↓
Did the agent start?
   ↓
Did the script execute?
   ↓
Did npm run?
   ↓
Did Cucumber start?
   ↓
Did scenarios execute?
   ↓
Did reports generate?
   ↓
Did Azure publish them?
```

This is your master troubleshooting chain.

---

# 5. Scenario 1 — Pipeline Does Not Start

Possible symptoms:

```text
No new run
Schedule missed
Code pushed but no run
Manual run unavailable
```

Check:

```text
1. Is the pipeline enabled?
2. Is the correct branch configured?
3. Is trigger present?
4. Is schedule present?
5. Is the YAML path correct?
6. Is GitHub connection healthy?
7. Are pipeline permissions valid?
```

---

# 6. Pipeline Trigger Troubleshooting

If code push should trigger pipeline:

Look for:

```yaml
trigger:
- main
```

Potential problems:

```text
Wrong branch
Trigger disabled
Path filter excludes files
Pipeline uses another YAML
Repository connection issue
```

---

# 7. Scenario 2 — Schedule Does Not Run

Symptoms:

```text
Pipeline should run nightly
but no run appears
```

Check:

```text
cron
branch include
always setting
pipeline enabled
schedule location
timezone conversion
```

Important mental note:

```text
Azure YAML schedule cron = UTC
```

So if business expects:

```text
7:30 AM IST
```

the cron must reflect UTC conversion.

Do not guess the conversion in the demo; verify intended timezone first.

---

# 8. Scenario 3 — Schedule Runs at Wrong Time

Possible causes:

```text
UTC misunderstanding
Daylight-saving assumptions
UI schedule vs YAML schedule mismatch
Multiple schedules configured
Old schedule still active
```

Ask:

> Is the schedule defined in YAML, pipeline settings, or both?

---

# 9. Scenario 4 — YAML Syntax Error

Symptoms:

```text
Pipeline validation fails
Unexpected value
Mapping error
Indentation error
```

Common causes:

```text
Wrong indentation
Missing colon
Wrong list syntax
Wrong parameter type
Template inserted in wrong section
```

Example bad YAML:

```yaml
steps:
 - script npm test
```

Correct:

```yaml
steps:
- script: npm test
```

---

# 10. YAML Debugging Rule

Before changing logic:

```text
Validate syntax
then
validate semantics
```

A syntactically correct YAML can still be logically wrong.

---

# 11. Scenario 5 — Template Cannot Be Found

Symptoms:

```text
Template file not found
Unexpected path
Repository resource error
```

Check:

```text
Correct relative path
Correct filename
Case sensitivity
Repository location
Template repository reference
Branch
```

Example:

```yaml
- template: pipeline/template/windows.yaml
```

If repository contains:

```text
pipeline/Templates/windows.yml
```

it will fail.

---

# 12. Scenario 6 — Wrong Template Runs

Symptoms:

```text
Windows expected
Ubuntu executes
```

or:

```text
C360 template not called
```

Check:

```text
conditions
parameters
branch conditions
template selection logic
stage/job conditions
```

Trace from the main YAML.

---

# 13. Scenario 7 — Agent Does Not Start

Symptoms:

```text
Job queued
No agent available
Pool error
Unauthorized pool
```

Possible causes:

```text
Self-hosted agent offline
Wrong pool name
Permission missing
No matching capability
Concurrency unavailable
```

If Microsoft-hosted:

```text
vmImage value may be wrong or unsupported
```

---

# 14. Scenario 8 — Script File Not Found

Example:

```text
./pipeline/scripts/run-tests.ps1 not found
```

Check:

```text
Repository path
Current working directory
Filename
Extension
Case
Checkout occurred
```

Remember:

```text
Windows may hide case issues
Linux may expose them
```

---

# 15. Scenario 9 — PowerShell Execution Problem

Possible symptoms:

```text
Command not recognized
Execution policy
Parameter binding error
Path not found
```

Check:

```text
PowerShell vs pwsh
Correct script path
Parameter names
Quotes
Environment variables
```

---

# 16. Scenario 10 — Bash Script Permission Error

Possible symptom:

```text
Permission denied
```

Possible cause:

```text
.sh file is not executable
```

Possible solution concept:

```bash
chmod +x pipeline/scripts/run-tests.sh
```

or call through:

```bash
bash pipeline/scripts/run-tests.sh
```

depending on project convention.

---

# 17. Scenario 11 — Node.js Not Available

Symptoms:

```text
node not found
npm not found
```

Check:

```text
Node installed on agent
Node task present
Version
PATH
```

Possible pipeline setup:

```yaml
- task: NodeTool@0
  inputs:
    versionSpec: '20.x'
```

Do not assume actual Node version.

Check `package.json` and framework compatibility.

---

# 18. Scenario 12 — npm ci Fails

Common causes:

```text
package-lock.json mismatch
Registry access
Private package authentication
Unsupported Node version
Dependency conflict
Network issue
```

Check first:

```text
Exact error message
Node version
npm version
package-lock.json
```

Avoid immediately replacing:

```bash
npm ci
```

with:

```bash
npm install
```

because that changes dependency reproducibility.

---

# 19. Scenario 13 — npm Script Not Found

Symptom:

```text
Missing script: test:regression
```

Check:

```text
package.json
scripts section
spelling
working directory
```

Example:

```json
"scripts": {
  "test:regression": "cucumber-js --tags \"@regression\""
}
```

---

# 20. Scenario 14 — Cucumber Command Not Found

Symptom:

```text
cucumber-js not recognized
```

Check:

```text
@cucumber/cucumber installed?
npm ci completed?
Using npx?
Global vs local dependency?
Working directory correct?
```

Preferred local execution concept:

```bash
npx cucumber-js
```

---

# 21. Scenario 15 — Cucumber Finds Zero Scenarios

Symptoms:

```text
0 scenarios
0 steps
```

Possible causes:

```text
Wrong feature path
Wrong tag
Tag typo
Cucumber config excludes file
Profile issue
Feature file naming/path
Tag expression mismatch
```

For individual execution, this is especially important.

---

# 22. Zero-Test Diagnostic Flow

```text
Did feature load?
   ↓
Does tag exist?
   ↓
Is tag applied to scenario?
   ↓
Is command quoting correct?
   ↓
Is config/profile filtering something else?
```

---

# 23. Scenario 16 — Tag Does Not Filter

Expected:

```text
@TC001
```

but full suite runs.

Check:

```text
Was parameter passed?
Did template receive it?
Did script receive it?
Did npm forward it?
Does package.json already hardcode another tag?
```

Trace value at every level.

---

# 24. Add Diagnostic Logging

Example:

PowerShell:

```powershell
Write-Host "Selected tag: $Tag"
```

Bash:

```bash
echo "Selected tag: $TAG"
```

YAML:

```yaml
- script: echo "Selector = ${{ parameters.cucumberTag }}"
```

Do not log secrets.

---

# 25. Scenario 17 — Tag Expression Breaks

Input:

```text
@smoke and not @skip
```

may fail because of quoting.

Check:

```text
YAML quoting
PowerShell quoting
Bash quoting
npm forwarding
```

Single simple tag is easiest for first implementation.

---

# 26. Scenario 18 — Undefined Step

Symptoms:

```text
Undefined
Step implementation missing
```

Possible causes:

```text
Step definition not implemented
Step definition not loaded
Text mismatch
Wrong require/import path
Cucumber config excludes support file
```

---

# 27. Scenario 19 — Ambiguous Step

Symptoms:

```text
Multiple step definitions match
```

Cause:

```text
Two implementations match same Gherkin step
```

Fix principle:

```text
Make step patterns specific
Remove duplication
```

---

# 28. Scenario 20 — Hook Failure

Symptoms:

```text
Scenario fails before first Given
Scenario fails during cleanup
```

Check:

```text
Before hook
After hook
browser setup
test data setup
screenshot logic
cleanup
```

Remember:

```text
Failure may be framework setup, not test logic.
```

---

# 29. Scenario 21 — Browser Does Not Start

Possible causes:

```text
Browser not installed
Headless configuration
Driver mismatch
Linux display issue
Permissions
Framework-specific browser dependency
```

We cannot prepare exact fix until we know which browser automation library is used.

Could be:

```text
Playwright
Selenium
WebdriverIO
Puppeteer
Cypress integration
Custom browser wrapper
```

Do not assume.

---

# 30. Scenario 22 — Tests Pass Locally but Fail in Azure

Common differences:

```text
OS
Node version
Environment variables
Credentials
Network
File paths
Case sensitivity
Browser/headless mode
Timezone
Test data
Parallelism
```

Ask:

> What is different between local execution and pipeline execution?

This is one of the strongest troubleshooting questions.

---

# 31. Scenario 23 — Tests Fail Only on Ubuntu

Check:

```text
Case-sensitive paths
Shell syntax
Browser dependencies
Permissions
Line endings
Environment variables
File separators
```

Example:

```text
Login.feature
```

vs:

```text
login.feature
```

Windows may tolerate more than Linux.

---

# 32. Scenario 24 — Report File Not Generated

Check:

```text
Did Cucumber formatter execute?
Correct output path?
Parent folder exists?
Permission?
Reporter package installed?
Execution terminated too early?
```

Trace:

```text
Cucumber command
→ formatter options
→ output path
```

---

# 33. Scenario 25 — HTML Exists but Azure Test Tab Is Empty

Likely reason:

```text
HTML report != structured Azure Test Results
```

Check whether JUnit/XML is generated and published.

Concept:

```text
HTML
→ human report

JUnit
→ Azure test publishing
```

---

# 34. Scenario 26 — JUnit Exists but Azure Test Results Missing

Check:

```text
PublishTestResults task
file glob/path
testResultsFormat
condition
working directory
file generated before publish
```

---

# 35. Scenario 27 — Old Report Overwritten

Trace:

```text
Report path
Cleanup script
Copy destination
Artifact strategy
Agent type
```

Likely pattern:

```text
reports/report.html
```

every run.

Possible improvement:

```text
reports/<BuildID>/report.html
```

or publish each run separately.

---

# 36. Scenario 28 — Old Report Folder Deleted

Search:

```text
Remove-Item
rm -rf
rmdir
clean
```

Do not immediately remove cleanup.

Ask:

```text
Should completed evidence be archived before cleanup?
```

---

# 37. Scenario 29 — Pipeline Green Even When Tests Fail

Possible causes:

```text
Script exits 0
Error ignored
continueOnError
Failure swallowed
Custom script catches exception
```

Check exit-code propagation.

Example bad:

```powershell
npm test
exit 0
```

Better concept:

```powershell
npm test
exit $LASTEXITCODE
```

---

# 38. Scenario 30 — Pipeline Stops Before Publishing Report

Likely:

```text
Test task fails
Subsequent publish step uses default success condition
```

Potential approach:

```yaml
condition: always()
```

for evidence publishing steps.

Pipeline should still remain failed.

---

# 39. Scenario 31 — Report Shows Results from Previous Run

Possible cause:

```text
Current report folder not cleaned
Old XML/screenshots included
Shared report path
```

This proves why current workspace cleanup can be important.

---

# 40. Scenario 32 — Two Runs Corrupt Each Other

Possible on shared/self-hosted environment.

If both use:

```text
reports/current/
```

then:

```text
Run A
+
Run B
↓
Collision
```

Safer:

```text
reports/<BuildID>/
```

---

# 41. Scenario 33 — Manual Test Works but Scheduled Regression Fails

Check differences:

```text
Default parameter
schedule-specific variables
environment
branch
test tag
agent
```

Make sure:

```text
scheduled default = existing regression behavior
```

---

# 42. Scenario 34 — Scheduled Run Executes One Test Only

Likely cause:

```text
Manual selector accidentally became global default
```

Check parameter defaults and variables.

Expected:

```text
Schedule → @regression
Manual → optional override
```

---

# 43. Scenario 35 — Wrong Environment Used

Look for:

```text
environment parameter
config file
variable group
.env file
Azure variable
script argument
```

Do not change test code first.

---

# 44. Scenario 36 — Secret/Authentication Failure

Symptoms:

```text
401
403
login failed
token missing
```

Check:

```text
secret variable available?
correct variable group linked?
environment variable name correct?
scope/permission valid?
```

Never print secret values into pipeline logs.

---

# 45. Scenario 37 — Pie Chart Does Not Match HTML Report

Possible reasons:

```text
Different data source
JUnit vs HTML reporter
Skipped tests interpreted differently
Retry behavior
Duplicate XML
Old XML files
Publish aggregation
```

First determine:

> Is the pie chart native Azure analytics or generated by the custom HTML reporter?

---

# 46. Scenario 38 — Test Count Is Wrong

Check:

```text
Old JUnit files included
Retries counted
Scenario outlines expanded
Skipped scenarios
Duplicate report files
Multiple platform runs aggregated
```

---

# 47. Scenario 39 — Pipeline Is Slow

Do not optimize immediately.

Measure:

```text
Checkout
npm ci
Environment setup
Browser launch
Test execution
Report generation
Artifact upload
```

Identify the expensive phase first.

---

# 48. Scenario 40 — Full Suite Is Too Expensive for Debugging

This directly supports Anusha's requirement.

Solution direction:

```text
Selective test execution
```

Use:

```text
unique tag
```

for quick diagnostic runs while scheduled regression remains intact.

---

# 49. Senior Engineer Response Pattern

When Anusha reports a problem, use:

```text
1. What exactly failed?
2. Which pipeline run?
3. At which step?
4. What was the input?
5. What was the last successful step?
6. What error was produced?
7. Did expected output exist?
8. Is it reproducible?
```

Then investigate.

---

# 50. Example Diagnostic Conversation

Anusha:

> The report is missing.

Weak response:

> Maybe the reporter failed.

Senior response:

> Let me first confirm whether the test completed, whether the report file was created on the agent, and whether the failure is in report generation or Azure publishing.

This separates:

```text
Generation
```

from:

```text
Publication
```

---

# 51. Another Diagnostic Conversation

Anusha:

> Individual test execution doesn't work.

Senior response:

> I will trace the selector from the pipeline input through the template and script into the final Cucumber command, then verify whether the selected tag actually exists in the feature file.

Very clear.

---

# 52. Do Not Bluff

If an unfamiliar file appears tomorrow, say:

> I want to trace who calls this file and what it calls before deciding its role.

That sounds more professional than guessing.

---

# 53. Fast Repository Inspection Sequence

If Anusha gives you only a few minutes:

```text
1. Main YAML
2. Templates
3. Scripts
4. package.json
5. Cucumber config
6. Feature tags
7. Report path
8. Publish tasks
```

This is enough to build the execution map quickly.

---

# 54. Fast Azure Run Inspection Sequence

Open one pipeline run and inspect:

```text
1. Trigger reason
2. Agent
3. Job names
4. Script step
5. npm/Cucumber output
6. Test counts
7. Publish test results
8. Artifact
9. Dashboard
```

---

# 55. Evidence-Based Troubleshooting

Capture facts:

```text
Run ID
Branch
Commit
Agent
Selector
Environment
Start time
End time
Result
Report path
Artifact
```

Then compare failing vs successful runs.

---

# 56. Common Root-Cause Categories

Most problems will fall into:

```text
Configuration
Path
Input
Environment
Dependency
Permission
Test logic
Reporting
Publishing
Scheduling
Concurrency
```

Classify first.

---

# 57. Tomorrow Demo Cheat Sheet

When something breaks:

```text
TRIGGER
↓
YAML
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
TEST
↓
REPORT
↓
PUBLISH
```

Find the first layer where expected behavior stops.

---

# 58. Quick Commands / Patterns to Recognize

```text
npm ci
npm run ...
npx cucumber-js
--tags
--name

PowerShell:
$LASTEXITCODE
Write-Host
Remove-Item

Bash:
$?
echo
rm -rf

Azure:
condition: always()
PublishTestResults
PublishPipelineArtifact
$(Build.BuildId)
```

---

# 59. Readiness Check

You are ready for demo troubleshooting if you can answer:

- What do you check if a pipeline does not start?
- What do you check if schedule time is wrong?
- What do you check if template is missing?
- What do you check if script is not found?
- What do you check if npm fails?
- What do you check if Cucumber finds zero tests?
- How do you trace a tag that is not working?
- Why may HTML exist but Azure Tests be empty?
- Why may old reports disappear?
- Why can a pipeline be green when tests failed?
- Why should reports publish on failure?
- Why can two parallel runs corrupt a shared report directory?
- How do you troubleshoot without guessing?

---

# 60. Next Content File

## Content File 07 — Second Demo Mock Interview + 15-Minute Rehearsal

Focus:

```text
Opening conversation
Framework explanation
Architecture walkthrough
Report issue discussion
Individual-test solution
Azure questions
Troubleshooting questions
What to say when you do not know
Strong closing
```

This will convert the technical preparation into confident delivery for tomorrow.
