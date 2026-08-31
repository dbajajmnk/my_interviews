# Anusha Framework Help — Content File 04
## Report Lifecycle, Historical Evidence, and Archive Solution

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We do not yet have Anusha's actual report implementation, Azure artifact configuration, agent type, or scripts. This file prepares us with a realistic enterprise-grade report lifecycle so we can diagnose the actual issue quickly when the framework is shown.

---

# 1. Objective

By the end of this content file, you should be able to:

- Explain the complete lifecycle of a test report.
- Distinguish between current-run working files and historical evidence.
- Explain why a framework may delete the current report directory before each run.
- Understand why simply keeping all files in one report folder is risky.
- Understand how Azure Pipeline run/build IDs can make reports unique.
- Understand the difference between local folders, Azure Test Results, and Pipeline Artifacts.
- Propose a safe archive strategy without breaking the current scheduled pipeline.
- Explain how failed runs should still preserve evidence.
- Identify exactly where to investigate when old reports disappear.
- Present a clean solution to Anusha with confidence.

---

# 2. The Report Problem

Anusha's expectation is approximately:

```text
Run 1
   ↓
Report 1 created
   ↓
Report 1 preserved as evidence

Run 2
   ↓
New Report 2 created
   ↓
Report 1 still available

Run 3
   ↓
New Report 3 created
   ↓
Report 1 + Report 2 still available
```

The current behavior may instead be:

```text
Run 1
   ↓
reports/report.html

Run 2
   ↓
reports/report.html overwritten

Run 3
   ↓
reports/report.html overwritten again
```

This means only the latest execution remains visible.

---

# 3. Plain-English Understanding

Think of every automated test run as an exam.

After the exam finishes, we need:

```text
Answer sheet
Result
Evidence
Timestamp
Execution identity
```

If the next exam reuses the same answer sheet and erases the previous one, audit history is lost.

A better design is:

```text
Current exam workspace
       ↓
Finish exam
       ↓
Save immutable copy
       ↓
Start next exam with clean workspace
```

---

# 4. Analogy

Imagine a hospital laboratory.

Each patient's test result is first produced in the laboratory working area.

After completion:

```text
Result is validated
      ↓
Archived against unique patient/test ID
      ↓
Working area is reset for next test
```

You would never solve history retention by saying:

> "Never clean the laboratory."

The same principle applies here.

---

# 5. Core Principle

Separate:

```text
CURRENT EXECUTION WORKSPACE
```

from:

```text
HISTORICAL EVIDENCE STORAGE
```

This is the most important concept in this file.

---

# 6. Bad Report Design

Example:

```text
reports/
├── report.html
├── result.xml
└── screenshots/
```

Every new run writes to the same location.

Potential problems:

```text
Old files mixed with new files
Old screenshots counted in new run
Wrong report totals
Files overwritten
Difficult audit trail
No clear run ownership
```

---

# 7. Better Report Design

Current working area:

```text
reports/current/
├── cucumber-report.html
├── junit.xml
├── screenshots/
└── logs/
```

Historical evidence:

```text
reports/archive/
├── Run_1001/
├── Run_1002/
├── Run_1003/
└── Run_1004/
```

Concept:

```text
Run
 ↓
Generate current report
 ↓
Publish/archive using unique run ID
 ↓
Next run cleans current/
```

---

# 8. Best Enterprise Mental Model

```text
Temporary Workspace
        ↓
Current Test Execution
        ↓
Generate Test Evidence
        ↓
Publish Test Results
        ↓
Archive Immutable Evidence
        ↓
Pipeline Ends
        ↓
Next Pipeline Run Gets Fresh Workspace
```

Historical evidence should not depend only on the current agent folder.

---

# 9. What Counts as Test Evidence?

A test run may produce:

```text
HTML Report
JUnit XML
JSON Result
Screenshots
Videos
Application Logs
Browser Logs
Network Logs
Execution Metadata
Environment Details
```

For Anusha's framework, we need to discover which of these actually exist.

---

# 10. Minimum Evidence Package

A good minimum package could be:

```text
Run_1024/
├── cucumber-report.html
├── junit.xml
├── screenshots/
└── run-info.txt
```

Possible `run-info.txt`:

```text
Build ID: 1024
Branch: main
Test Selection: @regression
Environment: QA
Execution Date: ...
Agent: ...
```

The exact metadata should depend on their requirements.

---

# 11. Unique Run Identity

Every archived report needs a unique identity.

Possible choices:

```text
Azure Build ID
Azure Build Number
Timestamp
Combination of Build ID + Timestamp
```

Best simple starting point:

```text
Build ID
```

Concept:

```text
Run 101 → Evidence 101
Run 102 → Evidence 102
Run 103 → Evidence 103
```

---

# 12. Why Build ID Is Useful

A build/run ID gives traceability:

```text
Azure Pipeline Run 1024
        ↓
Cucumber execution
        ↓
Artifact / Report 1024
```

So if somebody asks:

> Which evidence belongs to this Azure run?

the answer is immediate.

---

# 13. Current Folder + Run Folder

One possible design:

```text
reports/
├── current/
│   ├── cucumber.html
│   └── junit.xml
│
└── archive/
    ├── 1021/
    ├── 1022/
    └── 1023/
```

Execution:

```text
Clean reports/current
        ↓
Run tests
        ↓
Generate files in reports/current
        ↓
Copy to reports/archive/<RunID>
        ↓
Publish archive/run as evidence
```

---

# 14. Important Azure DevOps Consideration

If Microsoft-hosted agents are used, do not assume local history will remain across pipeline runs.

Conceptually:

```text
Run 101 → Agent A
Run 102 → Agent B
Run 103 → Agent C
```

Even if the code creates:

```text
reports/archive/
```

inside the agent workspace, that does not automatically create durable long-term evidence across future runs.

Therefore, we need to ask:

> Where should the historical report actually live?

---

# 15. Possible Evidence Storage Options

Possible locations include:

```text
Azure Pipeline Artifact
Azure Test Results
Azure Storage
Network Share
Custom C360 Portal
Shared File Server
Database-backed Report Portal
Self-hosted Agent Disk
```

We should not choose until the actual requirement is clear.

---

# 16. Azure Test Results vs Report Artifact

These are not the same thing.

## Azure Test Results

Used for structured test data:

```text
Passed
Failed
Skipped
Duration
Test Name
Trend
Analytics
```

Usually based on formats such as JUnit.

---

## Pipeline Artifact

Used to preserve files:

```text
HTML report
Screenshots
Logs
JSON
Videos
Attachments
```

Concept:

```text
JUnit XML
   ↓
Publish Test Results
   ↓
Azure Tests / Analytics

HTML + Screenshots
   ↓
Publish Artifact
   ↓
Evidence Files
```

---

# 17. Why Both May Be Needed

Azure analytics is useful for:

```text
Pass/fail visibility
Trend
Test statistics
Dashboard
```

Artifact evidence is useful for:

```text
Detailed report
Screenshots
Logs
Audit evidence
Investigation
```

So a strong design may use both.

---

# 18. Assumed Reporting Flow

```text
Cucumber.js
      ↓
      ├── JUnit XML
      │      ↓
      │  Azure Test Results
      │
      └── HTML / Screenshots / Logs
             ↓
        Pipeline Artifact
```

---

# 19. Example Cucumber Output Paths

Assume:

```bash
npx cucumber-js \
  --format "html:reports/current/cucumber-report.html" \
  --format "junit:reports/current/junit.xml"
```

Then current execution generates:

```text
reports/current/
├── cucumber-report.html
└── junit.xml
```

Hooks may add:

```text
reports/current/screenshots/
```

---

# 20. Example Report Archive Script — PowerShell

Conceptual example:

```powershell
$BuildId = $env:BUILD_BUILDID

$CurrentReport = "reports/current"
$ArchivePath = "reports/archive/$BuildId"

New-Item -ItemType Directory -Path $ArchivePath -Force

Copy-Item "$CurrentReport/*" `
    -Destination $ArchivePath `
    -Recurse `
    -Force

Write-Host "Report archived to $ArchivePath"
```

Flow:

```text
Current report
      ↓
Build ID
      ↓
Unique archive directory
      ↓
Copy evidence
```

---

# 21. Example Report Archive Script — Bash

Conceptual example:

```bash
BUILD_ID="${BUILD_BUILDID}"

CURRENT_REPORT="reports/current"
ARCHIVE_PATH="reports/archive/${BUILD_ID}"

mkdir -p "$ARCHIVE_PATH"

cp -R "$CURRENT_REPORT"/. "$ARCHIVE_PATH"/

echo "Report archived to $ARCHIVE_PATH"
```

Again, actual implementation depends on the agent and project.

---

# 22. But Is Local Archive Enough?

Not necessarily.

If the agent is temporary:

```text
Pipeline finishes
      ↓
Agent disappears
      ↓
Local archive disappears
```

Therefore we may still need:

```text
PublishPipelineArtifact
```

or another durable destination.

---

# 23. Pipeline Artifact Concept

Conceptual YAML:

```yaml
- task: PublishPipelineArtifact@1
  condition: always()
  inputs:
    targetPath: 'reports/current'
    artifact: 'cucumber-report-$(Build.BuildId)'
```

Logical result:

```text
Pipeline Run 1024
       ↓
Artifact
       ↓
cucumber-report-1024
```

This creates an evidence package tied to the execution.

---

# 24. Better Naming Convention

Possible artifact names:

```text
cucumber-report-1024
regression-report-1024
c360-report-1024
qa-regression-1024
```

Do not overcomplicate naming.

A good name should tell:

```text
What
+
Which Run
```

---

# 25. What Happens on the Next Run?

Correct lifecycle:

```text
Run 1024
   ↓
Clean current workspace
   ↓
Execute tests
   ↓
Generate report
   ↓
Publish/archive as Run 1024
   ↓
Finish

Run 1025
   ↓
Clean current workspace
   ↓
Execute fresh tests
   ↓
Generate new report
   ↓
Publish/archive as Run 1025
```

Historical evidence is preserved independently.

---

# 26. Failure Scenario

Suppose test execution fails.

Bad flow:

```text
Test fails
   ↓
Pipeline stops
   ↓
No report published
```

This is especially bad because failed runs need evidence.

Better flow:

```text
Test fails
   ↓
Capture exit code
   ↓
Generate/finalize evidence
   ↓
Publish results
   ↓
Publish artifact
   ↓
Pipeline remains failed
```

---

# 27. Important Rule

Do not make the pipeline green just to publish evidence.

We want:

```text
Failed tests
      ↓
Pipeline status = Failed
```

while still preserving:

```text
Report
Screenshots
Logs
JUnit
```

---

# 28. Example Always-Publish Pattern

Conceptual:

```yaml
- task: PublishTestResults@2
  condition: always()
  inputs:
    testResultsFormat: 'JUnit'
    testResultsFiles: '**/junit.xml'

- task: PublishPipelineArtifact@1
  condition: always()
  inputs:
    targetPath: 'reports/current'
    artifact: 'cucumber-report-$(Build.BuildId)'
```

This allows evidence publishing on both pass and fail.

---

# 29. Where Old Reports May Be Disappearing

Check in this order.

## 1. Script Cleanup

Search:

```text
Remove-Item
rm -rf
del
rmdir
```

---

## 2. Reporter Output

Search:

```text
reports/report.html
reports/index.html
output.html
```

If every run writes the same filename, overwrite may occur.

---

## 3. Pipeline Workspace Cleanup

Check:

```text
checkout clean
workspace clean
agent behavior
```

---

## 4. Artifact Publishing

Check whether the artifact name/path is unique per run.

---

## 5. External Report Location

If C360 copies reports to a shared site, inspect whether the destination is:

```text
/report/latest/
```

rather than:

```text
/report/<run-id>/
```

---

# 30. Evidence Retention Is Different from Report Generation

Important distinction:

```text
REPORT GENERATION
```

answers:

> How do we create the report?

while:

```text
EVIDENCE RETENTION
```

answers:

> Where do we keep the completed report after the run?

These should be treated separately.

---

# 31. Current Report Folder Cleanup Is Often Correct

Suppose the script has:

```powershell
Remove-Item -Recurse -Force reports/current
```

This may be good.

Why?

Because otherwise:

```text
Run 1 screenshots
+
Run 2 screenshots
```

could appear together.

So our likely solution is not:

```text
Remove cleanup
```

Our likely solution is:

```text
Archive/publish completed current run
        ↓
Then allow next run to clean current workspace
```

---

# 32. Recommended Assumed Architecture

```text
                  TEST RUN
                     │
                     ▼
            reports/current/
                     │
       ┌─────────────┼──────────────┐
       ▼             ▼              ▼
 cucumber.html    junit.xml     screenshots
       │             │              │
       │             ▼              │
       │      PublishTestResults     │
       │                             │
       └─────────────┬───────────────┘
                     ▼
             Publish Artifact
                     │
                     ▼
        report-$(Build.BuildId)
                     │
                     ▼
            Historical Evidence
```

Next run:

```text
Clean reports/current/
```

without affecting old artifacts.

---

# 33. If Anusha Specifically Wants Folders

If her requirement is literally:

> Earlier folder should be archived and a new folder should be created.

Then one possible design is:

```text
reports/
├── 2026-08-30_1024/
│
├── 2026-08-30_1025/
│
└── 2026-08-30_1026/
```

or:

```text
reports/
├── Run_1024/
├── Run_1025/
└── Run_1026/
```

But ask:

> Does she need these folders physically on a shared report server, or is Azure artifact history acceptable?

This changes implementation.

---

# 34. Self-Hosted Agent Scenario

If reports must remain on a self-hosted machine:

```text
D:\TestEvidence\
├── Run_1024\
├── Run_1025\
└── Run_1026\
```

This can work, but then consider:

```text
Disk growth
Retention policy
Access permissions
Backup
Cleanup after retention period
Concurrent runs
```

Do not blindly keep files forever.

---

# 35. Microsoft-Hosted Agent Scenario

Recommended mental model:

```text
Agent workspace
      ↓
Generate current report
      ↓
Publish artifact
      ↓
Agent can disappear
```

Historical evidence remains in Azure according to configured retention.

---

# 36. Parallel Run Risk

Suppose two runs execute at the same time.

Bad shared path:

```text
reports/current/
```

on one shared machine may cause collisions.

Unique execution path is safer:

```text
reports/$(Build.BuildId)/
```

Then:

```text
Run 1024 → reports/1024/
Run 1025 → reports/1025/
```

No collision.

This matters especially on self-hosted/shared environments.

---

# 37. Simple Safe Pattern

One practical pattern:

```text
Run starts
   ↓
Create reports/<BuildID>
   ↓
Run Cucumber writing directly there
   ↓
Publish test results
   ↓
Publish entire folder
```

This removes the need for:

```text
current → archive copy
```

Example:

```text
reports/
└── 1024/
    ├── report.html
    ├── junit.xml
    └── screenshots/
```

This may be simpler if the current reporter allows dynamic paths.

---

# 38. Option Comparison

| Option | Strength | Risk |
|---|---|---|
| Reuse one report folder | Simple | Overwrite/history loss |
| Current + archive copy | Clear separation | Extra copy logic |
| Build-ID folder directly | Simple + unique | Reporter must support dynamic path |
| Azure artifact only | Durable per run | User must access Azure run |
| Shared server archive | Central access | Storage/cleanup/security complexity |

---

# 39. My Preferred Starting Recommendation

Without seeing the project:

```text
Build-ID-based report folder
+
Azure Test Results
+
Pipeline Artifact
```

Concept:

```text
reports/1024/
      ↓
JUnit → Azure Tests
HTML/screenshots/logs → Artifact
```

Why?

```text
Unique
Traceable
Clean
Low-risk
Easy to explain
Does not depend on previous agent workspace
```

But this remains a recommendation until we inspect the real architecture.

---

# 40. Practical Exercise 1

Current script:

```powershell
Remove-Item -Recurse -Force reports
New-Item -ItemType Directory reports
npm test
```

What is wrong?

Not necessarily the cleanup.

The missing part may be:

```text
Where was the previous completed report preserved before the folder was deleted?
```

---

# 41. Practical Exercise 2

Current reporter writes:

```text
reports/report.html
```

Potential improvement:

```text
reports/$BuildId/report.html
```

Then:

```text
Run 100 → reports/100/report.html
Run 101 → reports/101/report.html
```

---

# 42. Practical Exercise 3

Pipeline publishes:

```yaml
artifact: cucumber-report
```

Is this automatically wrong?

No.

Azure already associates artifacts with pipeline runs.

But if users also need each report visible in a common external location, additional organization may be required.

---

# 43. Practical Exercise 4

Tests fail before `After` hook finishes.

Questions:

```text
Was HTML finalized?
Was JUnit written?
Were screenshots attached?
Did publish steps still run?
```

This is why failure-path testing matters.

---

# 44. Troubleshooting Checklist

When old report disappears:

```text
[ ] Find report output path
[ ] Find cleanup command
[ ] Find archive/copy logic
[ ] Find artifact publish task
[ ] Find test-results publish task
[ ] Check agent type
[ ] Check shared destination
[ ] Check artifact/run retention
[ ] Check failed-run behavior
[ ] Check parallel-run behavior
```

---

# 45. Demo Conversation Practice

## Anusha: I want the previous report folder preserved.

**Answer:**

> Yes. I would separate the current execution workspace from historical evidence. Each run should have a unique identity, ideally using the Azure run/build ID, and the completed report should be archived or published before the next run starts clean.

---

## Anusha: Can we just stop deleting the report folder?

**Answer:**

> We can, but I would first verify why cleanup exists. Keeping old files in the same working folder can mix screenshots and results across runs. A safer design is to keep the current run clean and archive each completed run separately.

---

## Anusha: What if tests fail?

**Answer:**

> The pipeline should still preserve the failed-run evidence. Test results and report artifacts should publish even when the execution fails, while the pipeline itself should remain failed.

---

## Anusha: Where will the archive live?

**Answer:**

> That depends on the requirement. If Azure run history is acceptable, Pipeline Artifacts are a clean option. If C360 requires a shared report site or file path, then we should archive to a unique run-specific folder there.

---

## Anusha: How do we identify which report belongs to which run?

**Answer:**

> Use the Azure build/run ID in the report folder or artifact name so the evidence maps directly back to the pipeline execution.

---

# 46. Questions to Ask Tomorrow

1. Where is the current report generated?
2. What is the exact report directory?
3. Which file or script creates it?
4. Which file or script deletes it?
5. Does the reporter always write the same filename?
6. Is HTML generated?
7. Is JUnit/XML generated?
8. Are screenshots stored inside the report folder?
9. Are logs included?
10. Is the Azure agent Microsoft-hosted or self-hosted?
11. Are reports already published as pipeline artifacts?
12. Are test results published to Azure Test Results?
13. Is the pie chart based on JUnit/native Azure data?
14. Does C360 host its own HTML report?
15. Where exactly does Anusha expect historical evidence to be visible?
16. How long must evidence be retained?
17. What should happen for failed runs?
18. Can two pipeline runs execute concurrently?
19. Is report history required per scheduled run only or every manual run too?
20. Is Azure run/build ID acceptable as the report identifier?

---

# 47. Demo-Day Cheat Sheet

Problem:

```text
New run overwrites old report
```

Do NOT immediately do:

```text
Stop cleaning reports/
```

Think:

```text
CURRENT WORKSPACE
      ↓
Generate fresh report
      ↓
ARCHIVE / PUBLISH
      ↓
Unique Build ID
      ↓
Historical Evidence
```

Preferred assumed solution:

```text
reports/<BuildID>/
      ↓
JUnit → Azure Test Results
HTML + screenshots + logs → Pipeline Artifact
```

Failure rule:

```text
Tests fail
   ↓
Evidence still publishes
   ↓
Pipeline remains failed
```

---

# 48. Readiness Check

You are ready to move forward if you can answer:

- Why should current workspace and historical evidence be separated?
- Why can report cleanup be correct?
- What is the purpose of a unique Build ID?
- What is the difference between Azure Test Results and Pipeline Artifacts?
- Why may Microsoft-hosted agents not preserve local folders?
- Why should failed runs still publish evidence?
- What could cause old reports to disappear?
- Why is `reports/<BuildID>/` safer than one shared report path?
- What question determines whether Azure Artifacts are enough?
- Why should we not redesign until we know where C360 expects the report?

---

# 49. Next Content File

## Content File 05 — Individual Test Execution from Cucumber to Azure Pipeline

Focus:

```text
Scenario Tag
→ Cucumber Filter
→ npm Script
→ PowerShell/Bash Argument
→ YAML Parameter
→ Manual Pipeline Run
→ Scheduled Regression Default
```

This will directly prepare us for Anusha's second requested change.
