# Anusha Framework Help — Content File 02
## Azure DevOps YAML Pipeline Flow

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We still do not have Anusha's actual repository, YAML files, scripts, Cucumber configuration, or reporting implementation. This file uses a realistic Azure DevOps + GitHub + Cucumber.js setup so we can recognize the real structure quickly when it is shown.

---

## 1. Objective

By the end of this file, you should be able to:

- Explain how GitHub and Azure DevOps work together in this framework.
- Read a basic Azure DevOps YAML pipeline.
- Understand stages, jobs, steps, templates, parameters, variables, pools, and agents.
- Understand the likely purpose of `windows.yaml`, `ubuntu.yaml`, and `c360.yaml` without treating assumptions as facts.
- Trace execution from the main YAML to scripts and finally to Cucumber.js.
- Understand scheduled execution.
- Identify where individual-test selection and report archiving can fit later.
- Ask the right questions during Anusha's demo.

---

## 2. What Is Azure DevOps Pipeline?

Azure Pipelines is the execution/orchestration layer.

For the assumed framework:

```text
GitHub Repository
      ↓
Azure DevOps Pipeline
      ↓
Agent
      ↓
YAML / Templates
      ↓
Scripts
      ↓
npm / Cucumber.js
      ↓
Test Execution
      ↓
Results / Reports
```

GitHub stores the automation framework. Azure DevOps runs and monitors it.

---

## 3. Why GitHub + Azure DevOps?

A realistic separation is:

```text
GitHub
├── JavaScript code
├── Cucumber feature files
├── Step definitions
├── YAML files
└── Scripts

Azure DevOps
├── Pipeline execution
├── Scheduled runs
├── Agents
├── Logs
├── Test results
├── Artifacts
└── Dashboard / analytics
```

In plain English:

> GitHub contains the instructions. Azure DevOps executes the instructions.

---

## 4. Analogy

Think of a factory.

- **GitHub** = warehouse containing blueprints and procedures.
- **YAML** = supervisor's process instructions.
- **Azure Pipeline** = factory supervisor.
- **Agent** = machine/workstation doing the work.
- **Scripts** = detailed operating instructions.
- **Cucumber.js** = QA execution engine.
- **Report** = quality evidence.

---

## 5. Visualization

```text
┌───────────────────────┐
│        GitHub         │
│ JS + Cucumber + YAML  │
└──────────┬────────────┘
           │ checkout
           ▼
┌───────────────────────┐
│ Azure DevOps Pipeline │
└──────────┬────────────┘
           ▼
┌───────────────────────┐
│      Main YAML        │
└──────────┬────────────┘
           │
     template calls
           │
    ┌──────┼───────┐
    ▼      ▼       ▼
 Windows Ubuntu   C360
 YAML    YAML     YAML
    └──────┬───────┘
           ▼
┌───────────────────────┐
│       Scripts         │
│ PowerShell / Bash     │
└──────────┬────────────┘
           ▼
┌───────────────────────┐
│ npm / cucumber-js     │
└──────────┬────────────┘
           ▼
┌───────────────────────┐
│     Test Results      │
└──────┬─────────┬──────┘
       ▼         ▼
 Azure Tests   Reports
```

---

## 6. Mind Map

```text
Azure Pipeline
│
├── Trigger
│   ├── Push
│   ├── Manual
│   └── Schedule
│
├── Main YAML
│   ├── Parameters
│   ├── Variables
│   ├── Pool
│   ├── Stages
│   ├── Jobs
│   ├── Steps
│   └── Templates
│
├── Agent
│   ├── Microsoft-hosted
│   └── Self-hosted
│
├── Templates
│   ├── windows.yaml
│   ├── ubuntu.yaml
│   └── c360.yaml
│
├── Scripts
│   ├── PowerShell
│   ├── Bash
│   └── Node / utility scripts
│
└── Output
    ├── Logs
    ├── Test Results
    ├── Reports
    └── Artifacts
```

---

# 7. Core Concept — Main YAML File

The entry pipeline is commonly something like:

```text
azure-pipelines.yml
```

Basic example:

```yaml
trigger:
- main

pool:
  vmImage: ubuntu-latest

steps:
- script: npm ci
  displayName: Install Dependencies

- script: npm test
  displayName: Run Tests
```

The main YAML normally answers:

```text
When does the pipeline start?
Which machine executes it?
Which stages/jobs run?
Which templates are called?
Which scripts are executed?
What results are published?
```

---

# 8. Core Concept — Trigger

Example:

```yaml
trigger:
- main
```

Flow:

```text
Push to main
    ↓
Azure detects change
    ↓
Pipeline starts
```

Anusha's pipeline is also reported to execute on a schedule, so we specifically need to inspect scheduled triggers.

---

# 9. Core Concept — Scheduled Execution

Typical YAML concept:

```yaml
schedules:
- cron: "0 2 * * *"
  displayName: Nightly Test Run
  branches:
    include:
    - main
  always: true
```

Important:

- Azure YAML cron schedules use **UTC**.
- In YAML-based pipelines, schedules are defined in the main pipeline YAML, not inside an included template.
- Azure pipeline settings can also affect scheduling, so we verify both YAML and UI configuration.

Assumed flow:

```text
Scheduled Time
      ↓
Main YAML
      ↓
Template
      ↓
Agent
      ↓
Script
      ↓
Cucumber Suite
```

---

# 10. Core Concept — Pool and Agent

The pipeline needs a machine to execute its work.

Example:

```yaml
pool:
  vmImage: ubuntu-latest
```

or:

```yaml
pool:
  vmImage: windows-latest
```

The machine is called an **agent**.

```text
Pipeline
   ↓
Agent
   ↓
Checkout Code
   ↓
Execute Steps
```

---

# 11. Microsoft-Hosted vs Self-Hosted Agent

This matters directly for the historical-report issue.

## Microsoft-Hosted

Conceptually:

```text
Run 101 → Temporary Agent A → Job ends
Run 102 → Temporary Agent B → Job ends
```

Do not assume files from the previous run will remain on disk.

## Self-Hosted

Conceptually:

```text
Company Agent Machine
   ↓
Run 101
   ↓
Run 102
   ↓
Run 103
```

Files may remain depending on cleanup settings and scripts.

### Question for tomorrow

> Are the test jobs running on Microsoft-hosted agents or company-managed self-hosted agents?

---

# 12. Core Concept — Stages, Jobs, Steps

Remember this hierarchy:

```text
Pipeline
   ↓
Stage
   ↓
Job
   ↓
Step
```

### Stage

A major pipeline phase.

```text
Prepare
Test
Publish
```

### Job

A unit of work executed on an agent.

### Step

One individual action.

Examples:

```text
Checkout
npm ci
Run Cucumber
Publish Results
Publish Artifact
```

---

# 13. Core Concept — Templates

Templates allow reusable YAML logic.

Instead of repeating:

```yaml
steps:
- script: npm ci
- script: npm test
```

we can reuse a template:

```yaml
- template: template/run-tests.yaml
```

Templates can contain reusable:

```text
Stages
Jobs
Steps
Variables
Parameters
```

---

# 14. Why `windows.yaml` May Exist

We only know the filename, so this is a hypothesis.

It may contain Windows-specific execution such as:

```text
Windows Agent
    ↓
PowerShell
    ↓
Node/npm
    ↓
Cucumber
```

Illustrative example:

```yaml
jobs:
- job: WindowsTests
  pool:
    vmImage: windows-latest
  steps:
  - script: npm ci
  - powershell: ./pipeline/scripts/run-tests.ps1
```

Do not treat this example as Anusha's actual implementation.

---

# 15. Why `ubuntu.yaml` May Exist

Likewise, it may represent Linux execution:

```text
Ubuntu Agent
    ↓
Bash
    ↓
Node/npm
    ↓
Cucumber
```

Illustrative example:

```yaml
jobs:
- job: UbuntuTests
  pool:
    vmImage: ubuntu-latest
  steps:
  - script: npm ci
  - bash: ./pipeline/scripts/run-tests.sh
```

---

# 16. What Is `c360.yaml`?

We do **not** know yet.

Possible meanings:

```text
Customer 360 application
Environment-specific template
Product-specific orchestration
Test-suite configuration
Report integration
Parent template
```

The correct approach tomorrow is:

> "What does C360 represent in this framework, and which YAML calls `c360.yaml`?"

Then inspect the file.

---

# 17. Core Concept — Parameters

Parameters allow a pipeline/template to receive input.

Example:

```yaml
parameters:
- name: environment
  type: string
  default: test
```

Use:

```yaml
- script: echo "${{ parameters.environment }}"
```

For Anusha's individual-test requirement, a future design could potentially use:

```yaml
parameters:
- name: cucumberTag
  type: string
  default: '@regression'
```

Then later pass that value to Cucumber.

We will not implement this until the actual execution chain is known.

---

# 18. Core Concept — Variables

Simple mental model:

```text
Parameter = pipeline/template input
Variable  = value used during pipeline execution
```

Example:

```yaml
variables:
  NODE_ENV: test
```

Use:

```yaml
- script: echo $(NODE_ENV)
```

Useful visual distinction:

```text
${{ parameters.name }}  → parameter/template expression
$(VariableName)         → common Azure variable syntax
```

---

# 19. Core Concept — Script Folder

The `scripts/` folder may contain the real operational logic.

Possible structure:

```text
pipeline/
└── scripts/
    ├── run-tests.ps1
    ├── run-tests.sh
    ├── generate-report.ps1
    ├── archive-report.ps1
    └── prepare-environment.sh
```

A YAML may only contain:

```yaml
- powershell: ./pipeline/scripts/run-tests.ps1
```

Inside that script may be:

```powershell
npm run regression
```

And `package.json` may finally contain:

```json
{
  "scripts": {
    "regression": "cucumber-js --tags \"@regression\""
  }
}
```

So the real chain may be:

```text
YAML
 ↓
PowerShell
 ↓
npm
 ↓
package.json
 ↓
cucumber-js
```

This is why we must inspect the scripts folder.

---

# 20. Complete Assumed Execution Flow

```text
Azure Schedule
      ↓
Main YAML
      ↓
c360.yaml
      ↓
windows.yaml / ubuntu.yaml
      ↓
Agent
      ↓
run-tests.ps1 / run-tests.sh
      ↓
npm run regression
      ↓
package.json
      ↓
cucumber-js
      ↓
Feature Files
      ↓
Step Definitions
      ↓
Hooks
      ↓
Pass / Fail
      ↓
Report
      ↓
Azure Results / Artifact
```

This is the main flow you should be able to draw tomorrow.

---

# 21. Example Assumed Repository

```text
automation-framework/
│
├── package.json
├── cucumber.js
│
├── features/
│   ├── login.feature
│   ├── step_definitions/
│   └── support/
│
└── pipeline/
    ├── azure-pipelines.yml
    │
    ├── template/
    │   ├── windows.yaml
    │   ├── ubuntu.yaml
    │   └── c360.yaml
    │
    └── scripts/
        ├── run-tests.ps1
        ├── run-tests.sh
        └── publish-report.ps1
```

This is a learning model only.

---

# 22. How to Read the Real YAML Tomorrow

Read the main pipeline in this order:

```text
1. trigger
2. schedules
3. parameters
4. variables
5. resources
6. pool
7. stages / jobs
8. template references
9. script/task calls
10. result/report publication
```

Then follow every external reference.

Example:

```yaml
- template: template/c360.yaml
```

Open `c360.yaml`.

If that calls:

```yaml
- template: windows.yaml
```

open `windows.yaml`.

If that calls:

```yaml
- powershell: ./pipeline/scripts/run.ps1
```

open the script.

Continue until you reach:

```text
npm
npx cucumber-js
or another actual test runner command
```

---

# 23. Connection to Individual Test Execution

Current assumed behavior:

```text
Scheduled Pipeline
      ↓
Complete Suite
```

Future desired behavior:

```text
                    Pipeline
                       │
             ┌─────────┴─────────┐
             │                   │
         Scheduled            Manual
             │                   │
       Full Regression      Selected Test
             │                   │
             └─────────┬─────────┘
                       ↓
                    Script
                       ↓
                  cucumber-js
```

Possible parameter flow:

```text
Pipeline Parameter
      ↓
Template Parameter
      ↓
Script Argument
      ↓
npm Argument
      ↓
Cucumber --tags
```

Example concept:

```yaml
parameters:
- name: cucumberTag
  type: string
  default: '@regression'

steps:
- script: npx cucumber-js --tags "${{ parameters.cucumberTag }}"
```

Again: concept only until we see the real framework.

---

# 24. Connection to Report Archiving

Assumed result flow:

```text
Cucumber Execution
      ↓
HTML / JUnit / Logs
      ↓
Publish Test Results
      ↓
Publish Report Artifact
```

The old report may currently be lost because:

```text
1. The same folder is deleted before each run.
2. The reporter writes to the same filename/path.
3. A script overwrites previous output.
4. A temporary Microsoft-hosted agent is used.
5. A shared C360 location only keeps the latest output.
6. Only the latest artifact/report link is exposed.
```

We need to identify the actual reason before changing anything.

---

# 25. Practical Reading Exercise

Suppose we see:

```yaml
schedules:
- cron: "0 1 * * *"
  branches:
    include:
    - main

jobs:
- template: template/windows.yaml
  parameters:
    testType: regression
```

What can we safely say?

```text
There is a YAML scheduled trigger.
The schedule applies to main.
A reusable Windows template is called.
The value regression is passed to that template.
```

What can we NOT safely say?

```text
That it definitely runs Cucumber @regression.
That it uses a Microsoft-hosted agent.
That reports are generated in a particular directory.
```

We must open the referenced template first.

---

# 26. Common Mistakes

## Mistake 1 — Reading Only the Main YAML

The main YAML may only orchestrate templates.

Always follow references.

## Mistake 2 — Assuming Filename Equals Purpose

Do not assume `c360.yaml` meaning from its name.

## Mistake 3 — Ignoring Scripts

The actual Cucumber command may be hidden several layers below the YAML.

## Mistake 4 — Assuming Windows and Ubuntu Behave Identically

They may use different:

```text
Agents
Shells
Paths
Browser setup
Environment variables
Scripts
```

## Mistake 5 — Assuming Agent Disk Is Permanent Evidence

Pipeline workspaces are not automatically a reliable historical archive.

## Mistake 6 — Changing the Pipeline Before Tracing It

First trace:

```text
Main YAML
→ Template
→ Script
→ npm
→ Cucumber
→ Report
```

Then make the smallest required change.

---

# 27. Demo Questions and Answers

## Q1. Where would you start understanding this pipeline?

**Answer:**

> I would identify the entry YAML first, then trace every referenced template and script until I reach the actual Cucumber execution command. After that I would trace how results and reports are published.

## Q2. Why do we have Windows and Ubuntu YAML files?

**Answer:**

> They may be platform-specific templates or agent configurations. I would verify which agents, jobs, and scripts each file actually defines before making any assumption.

## Q3. How is the pipeline running automatically?

**Answer:**

> I would inspect the main YAML and Azure pipeline configuration for scheduled triggers. If the schedule is YAML-based, the cron timing is evaluated in UTC.

## Q4. Where would individual test execution be added?

**Answer:**

> I would first identify how the current suite selection reaches Cucumber. If tags are already used, we can potentially pass a pipeline parameter through the template/script chain to the existing Cucumber tag filter while keeping scheduled regression unchanged.

## Q5. Where would you fix the report-history issue?

**Answer:**

> First I would identify whether the report is being deleted by a script, overwritten by the reporter, lost with the agent workspace, or replaced during publication. Then I would fix it at the layer that actually owns the report lifecycle.

---

# 28. Questions to Ask Anusha Tomorrow

1. Which YAML is configured as the Azure pipeline entry point?
2. Where is the schedule configured?
3. What does `c360.yaml` represent?
4. Which file calls `windows.yaml`?
5. Which file calls `ubuntu.yaml`?
6. Are both Windows and Ubuntu actively used?
7. Are the agents Microsoft-hosted or self-hosted?
8. What is inside the `scripts/` folder?
9. Which script finally invokes npm/Cucumber?
10. Which `package.json` command runs the full suite?
11. Are Cucumber tags already used?
12. Where is the report directory defined?
13. Is there any cleanup/delete command before test execution?
14. How are Azure test results published?
15. Is the pie chart Azure-native or generated by a custom reporter?
16. Where should historical reports ultimately be retained?
17. When she says individual test, does she mean one scenario ID, one feature, one tag, or one business flow?

---

# 29. Quick Notes

Remember this flow:

```text
GitHub
→ Main YAML
→ Template
→ Agent
→ Script
→ npm
→ Cucumber.js
→ Test
→ Report
→ Azure
```

Remember hierarchy:

```text
Pipeline
→ Stage
→ Job
→ Step
```

Remember:

```text
Template  = reusable YAML
Parameter = input to pipeline/template
Variable  = value used during execution
Agent     = machine running the job
```

Remember for schedules:

```text
Azure YAML cron → UTC
```

Remember for debugging:

> Do not stop at YAML. Follow the call chain until you find the real Cucumber command.

---

# 30. Readiness Check

You are ready for the next content file if you can answer:

- What does Azure Pipeline do in this framework?
- What is GitHub's role?
- What is an agent?
- Why does Microsoft-hosted vs self-hosted matter?
- What is a YAML template?
- What is the difference between stage, job, and step?
- What is a parameter?
- What is a variable?
- Why might Windows and Ubuntu have separate templates?
- Why can we not assume what `c360.yaml` does?
- Where should we look for the actual Cucumber command?
- How does scheduled execution start?
- Why is UTC relevant?
- Where could individual-test selection be passed?
- Where might the report-history problem actually live?

---

# 31. Tomorrow Demo Cheat Sheet

```text
GITHUB
   ↓
AZURE PIPELINE
   ↓
MAIN YAML
   ↓
TEMPLATES
   ↓
WINDOWS / UBUNTU / C360
   ↓
SCRIPTS
   ↓
NPM
   ↓
CUCUMBER.JS
   ↓
TEST EXECUTION
   ↓
RESULTS / REPORTS
   ↓
AZURE TESTS / ARTIFACTS / DASHBOARD
```

Trace in this order:

```text
trigger
→ schedules
→ parameters
→ variables
→ pool
→ stages/jobs
→ templates
→ scripts
→ npm
→ cucumber-js
→ report
→ publish
```

---

# 32. References

Official Microsoft documentation:

- Azure Pipelines with GitHub repositories:  
  https://learn.microsoft.com/en-us/azure/devops/pipelines/repos/github

- Azure YAML templates:  
  https://learn.microsoft.com/en-us/azure/devops/pipelines/process/templates

- Pipeline parameters:  
  https://learn.microsoft.com/en-us/azure/devops/pipelines/yaml-schema/parameters-parameter

- Scheduled triggers:  
  https://learn.microsoft.com/en-us/azure/devops/pipelines/process/scheduled-triggers

- Azure Pipelines agents:  
  https://learn.microsoft.com/en-us/azure/devops/pipelines/agents/agents

---

# 33. Next Content File

## Content File 03 — Scheduled Pipeline Execution + Scripts Folder Walkthrough

Focus:

```text
Schedule
→ Main YAML
→ Template
→ Agent
→ PowerShell / Bash
→ npm
→ Cucumber
→ Exit Code
→ Failure Handling
→ Report Generation
```

We will build a realistic assumed scripts folder and learn how to trace it during tomorrow's demo.
