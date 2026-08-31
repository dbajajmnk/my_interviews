# Anusha Framework Help — Content File 05
## Individual Test Execution from Cucumber to Azure Pipeline

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We still do not have Anusha's actual framework. This file uses a realistic Cucumber.js + Azure DevOps design so we can understand where individual-test selection should enter the flow and how to preserve the existing scheduled suite.

---

# 1. Objective

By the end of this content file, you should be able to:

- Explain how Cucumber.js selects scenarios.
- Understand tags as a practical test-selection mechanism.
- Understand how one scenario can be targeted without changing the full regression suite.
- Explain how a test selector can travel from Azure Pipeline to Cucumber.
- Understand the role of pipeline parameters.
- Understand how scripts can receive the selected tag.
- Preserve scheduled regression as the default.
- Avoid hardcoding individual test IDs into shared scripts.
- Explain alternative selection methods such as feature path, scenario name, and line number.
- Recommend a clean implementation approach during the demo.

---

# 2. The Requirement

Anusha wants:

```text
Today:
Pipeline
   ↓
Complete Test Suite
```

Desired:

```text
Pipeline
   ↓
Choose:
   ├── Full Suite
   └── Individual Test
```

The important condition is:

> Adding individual execution should not break or replace the existing scheduled regression execution.

---

# 3. Plain-English Understanding

We want one pipeline that supports two modes.

```text
Mode 1
Scheduled Run
    ↓
Run standard regression suite

Mode 2
Manual Run
    ↓
User selects a specific test
```

The framework should remain reusable.

---

# 4. Analogy

Think of a school.

Normally:

```text
Principal says:
"Test the entire class."
```

That is the scheduled regression.

Sometimes:

```text
Teacher says:
"Test only Student 25."
```

That is selective execution.

We should not create a completely different school process.

We simply introduce a selector:

```text
Who should be tested?
```

---

# 5. High-Level Design

```text
                   Azure Pipeline
                         │
               ┌─────────┴─────────┐
               │                   │
          Scheduled Run        Manual Run
               │                   │
         Default Selector       User Selector
               │                   │
          @regression            @TC001
               │                   │
               └─────────┬─────────┘
                         ↓
                     YAML
                         ↓
                     Script
                         ↓
                       npm
                         ↓
                  Cucumber.js
                         ↓
               Matching Scenario(s)
```

---

# 6. Cucumber Tags

Tags are labels attached to features or scenarios.

Example:

```gherkin
@TC_LOGIN_001
Scenario: Successful login
  Given the user is on the login page
  When the user enters valid credentials
  Then the dashboard should be displayed
```

The tag:

```text
@TC_LOGIN_001
```

acts as a stable identifier.

---

# 7. Execute One Tagged Scenario

Example:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Concept:

```text
All Feature Files
      ↓
Cucumber Loads Scenarios
      ↓
Tag Filter Applied
      ↓
Only @TC_LOGIN_001
      ↓
Scenario Executes
```

---

# 8. Why Tags Are Good for This Requirement

Compared with line-number based execution:

```text
features/login.feature:27
```

a tag is usually more stable.

Example:

```text
@TC_LOGIN_001
```

The feature file can change, but the test identifier can remain the same.

Tags also support grouping:

```text
@smoke
@regression
@login
@payment
@critical
```

---

# 9. Test-Level Tags

Example:

```gherkin
Feature: Login

  @TC_LOGIN_001 @smoke
  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the dashboard should be displayed

  @TC_LOGIN_002 @regression
  Scenario: Invalid password
    Given the user is on the login page
    When the user enters an invalid password
    Then an error message should be displayed
```

Run one test:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Run smoke group:

```bash
npx cucumber-js --tags "@smoke"
```

Run regression group:

```bash
npx cucumber-js --tags "@regression"
```

---

# 10. Tag Expressions

Cucumber supports tag expressions.

Examples:

```bash
npx cucumber-js --tags "@smoke and not @skip"
```

```bash
npx cucumber-js --tags "@login or @payment"
```

Conceptually:

```text
@smoke and not @skip
```

means:

```text
Run smoke scenarios
but exclude scenarios marked skip
```

---

# 11. Other Individual-Test Selection Options

Tags are not the only option.

## By Feature File

```bash
npx cucumber-js features/login.feature
```

## By Feature File + Line Number

```bash
npx cucumber-js features/login.feature:25
```

## By Scenario Name

```bash
npx cucumber-js --name "Successful login"
```

## By Tag

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

---

# 12. Recommended Starting Choice

For Anusha's requirement, the first option I would investigate is:

```text
Unique Test Case Tag
```

Example:

```text
@TC_LOGIN_001
```

Why?

```text
Readable
Stable
Easy to pass through pipeline
Easy to group
Easy to search
Easy to automate
```

But if her framework already uses a different convention, we should reuse it instead of forcing a new one.

---

# 13. Do Not Hardcode the Test

Bad design:

```powershell
npx cucumber-js --tags "@TC_LOGIN_001"
```

inside a shared script.

Why bad?

Because every manual change requires editing code.

Better:

```text
Pipeline Input
      ↓
Script Argument
      ↓
Cucumber Tag
```

---

# 14. Pipeline Parameter Concept

A manual Azure Pipeline can expose a parameter.

Example:

```yaml
parameters:
- name: cucumberTag
  displayName: Cucumber Tag
  type: string
  default: '@regression'
```

When manually running the pipeline, the user may enter:

```text
@TC_LOGIN_001
```

The pipeline then passes it downstream.

---

# 15. Preserve the Scheduled Default

The key design is:

```text
Default = @regression
```

Therefore:

```text
Scheduled Run
   ↓
No manual override
   ↓
@regression
```

Manual run:

```text
User enters:
@TC_LOGIN_001
   ↓
Only that test runs
```

This keeps the scheduled pipeline safe.

---

# 16. Complete Parameter Flow

```text
Azure Manual Input
        ↓
Main YAML Parameter
        ↓
Template Parameter
        ↓
Script Argument
        ↓
npm / Cucumber
        ↓
--tags "@TC_LOGIN_001"
```

This is the main flow to remember.

---

# 17. Main YAML Example

Conceptual example:

```yaml
parameters:
- name: cucumberTag
  displayName: Test Selector
  type: string
  default: '@regression'

jobs:
- template: pipeline/template/c360.yaml
  parameters:
    cucumberTag: ${{ parameters.cucumberTag }}
```

The main YAML receives the input and passes it to the template.

---

# 18. c360.yaml Example

Assumed example:

```yaml
parameters:
- name: cucumberTag
  type: string

jobs:
- template: windows.yaml
  parameters:
    cucumberTag: ${{ parameters.cucumberTag }}
```

Concept:

```text
Main YAML
   ↓
c360.yaml
   ↓
windows.yaml
```

The selector continues through the template chain.

---

# 19. windows.yaml Example

Conceptual:

```yaml
parameters:
- name: cucumberTag
  type: string

jobs:
- job: RunTests

  pool:
    vmImage: windows-latest

  steps:

  - script: npm ci

  - powershell: |
      ./pipeline/scripts/run-tests.ps1 `
        -Tag "${{ parameters.cucumberTag }}"
```

The YAML passes the value to PowerShell.

---

# 20. PowerShell Example

```powershell
param(
    [string]$Tag = "@regression"
)

Write-Host "Executing test selector: $Tag"

npx cucumber-js --tags $Tag

exit $LASTEXITCODE
```

Flow:

```text
Input
 ↓
@TC_LOGIN_001
 ↓
PowerShell
 ↓
cucumber-js --tags @TC_LOGIN_001
```

---

# 21. Ubuntu/Bash Example

YAML:

```yaml
- bash: |
    ./pipeline/scripts/run-tests.sh "${{ parameters.cucumberTag }}"
```

Script:

```bash
#!/bin/bash

TAG="${1:-@regression}"

echo "Executing test selector: $TAG"

npx cucumber-js --tags "$TAG"

exit $?
```

Same logical design.

---

# 22. npm-Based Design

The script may call npm rather than Cucumber directly.

Example:

```powershell
npm run test -- --tags "$Tag"
```

`package.json`:

```json
{
  "scripts": {
    "test": "cucumber-js"
  }
}
```

The extra CLI argument is forwarded to Cucumber.

Concept:

```text
PowerShell
   ↓
npm run test
   ↓
cucumber-js
   ↓
--tags @TC001
```

---

# 23. Another npm Design

The framework might define:

```json
{
  "scripts": {
    "test:regression": "cucumber-js --tags \"@regression\"",
    "test:smoke": "cucumber-js --tags \"@smoke\""
  }
}
```

This is good for predefined suites.

But for arbitrary individual execution, a dynamic selector may still be useful.

---

# 24. Individual Test vs Test Group

We should clarify what Anusha means by:

```text
Individual test
```

Possible meanings:

```text
One scenario
One feature
One tag
One module
One business journey
One test case ID
```

Our assumed recommendation is:

```text
One scenario identified by unique tag
```

but we need her definition tomorrow.

---

# 25. Manual Pipeline Experience

Ideal user experience:

```text
Run Pipeline
```

Then input:

```text
Test Selector:
@TC_LOGIN_001
```

or leave default:

```text
@regression
```

Then click:

```text
Run
```

No code edit required.

---

# 26. Better Parameter Design

Instead of exposing only a raw tag, the pipeline could eventually support:

```text
Execution Mode:
- regression
- smoke
- individual

Test ID:
- required only for individual
```

But this is more logic.

For tomorrow, keep the first implementation simple.

KIS approach:

```text
One parameter:
cucumberTag
```

Default:

```text
@regression
```

---

# 27. Input Validation

If users can type anything, there may be mistakes.

Example:

```text
TC001
```

instead of:

```text
@TC001
```

Possible future validation:

```powershell
if (-not $Tag.StartsWith("@")) {
    throw "Cucumber tag must start with @"
}
```

But do not add complexity before understanding user behavior.

---

# 28. Empty Parameter Handling

Potential issue:

```text
User submits empty test selector
```

Possible script behavior:

```powershell
if ([string]::IsNullOrWhiteSpace($Tag)) {
    $Tag = "@regression"
}
```

This safely falls back to the default.

---

# 29. No Matching Scenario

Suppose user enters:

```text
@TC999
```

but no scenario has that tag.

Questions:

```text
Does Cucumber return success?
Does it report zero scenarios?
Should pipeline treat zero tests as failure?
```

This is an important enterprise requirement.

A manual "individual test" run should ideally not show success if nothing actually ran.

We need to inspect how the current framework treats zero-test execution.

---

# 30. Report Must Show Selected Test

The report should make it clear which selector was used.

Possible metadata:

```text
Execution Type: Manual
Test Selector: @TC_LOGIN_001
Build ID: 1024
Environment: QA
```

This improves traceability.

---

# 31. Scheduled vs Manual Evidence

Historical evidence should preserve both.

Example:

```text
Run_1024/
  execution-mode.txt
  test-selector.txt
  cucumber-report.html
```

So later we can determine whether the run was:

```text
Scheduled Regression
```

or:

```text
Manual Individual Test
```

---

# 32. Full Architecture

```text
                   AZURE DEVOPS
                        │
          ┌─────────────┴─────────────┐
          │                           │
      Schedule                      Manual
          │                           │
   default @regression         input @TC_LOGIN_001
          │                           │
          └─────────────┬─────────────┘
                        ↓
                  Main YAML
                        ↓
                   c360.yaml
                        ↓
              windows/ubuntu.yaml
                        ↓
                 run-tests script
                        ↓
                     npm
                        ↓
                  cucumber-js
                        ↓
                 --tags VALUE
                        ↓
               Selected Scenario(s)
                        ↓
                     Report
                        ↓
                 Azure Evidence
```

---

# 33. Practical Example

Feature:

```gherkin
@TC_LOGIN_001 @smoke
Scenario: Successful login
  Given the user is on the login page
  When the user enters valid credentials
  Then the dashboard should be displayed
```

Manual input:

```text
@TC_LOGIN_001
```

Pipeline:

```yaml
parameters:
- name: cucumberTag
  type: string
  default: '@regression'
```

Script receives:

```text
@TC_LOGIN_001
```

Command:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Result:

```text
Only matching scenario executes.
```

---

# 34. What If Multiple Tests Are Needed?

Example:

```bash
npx cucumber-js --tags "@login"
```

All login-tagged scenarios execute.

Or:

```bash
npx cucumber-js --tags "@TC001 or @TC002"
```

This can support multiple selected scenarios.

But user input and quoting need to be handled carefully.

For tomorrow, single-tag execution is enough.

---

# 35. Feature-Level Execution

If the company prefers feature selection, another option is:

```text
features/login.feature
```

Pipeline parameter:

```text
featurePath
```

Command:

```bash
npx cucumber-js "$FEATURE_PATH"
```

This may be useful if their test organization is feature-centric rather than test-ID-centric.

---

# 36. Scenario-Name Execution

Possible:

```bash
npx cucumber-js --name "Successful login"
```

Potential weakness:

```text
Names may change
Names may duplicate
Special-character quoting
```

So I would not make this the first enterprise recommendation.

---

# 37. Line-Number Execution

Possible:

```bash
npx cucumber-js features/login.feature:25
```

Useful for developers during debugging.

Potential weakness:

```text
Line number changes when feature file is edited.
```

Good ad-hoc developer tool, weaker long-term test identifier.

---

# 38. Decision Table

| Method | Good For | Main Limitation |
|---|---|---|
| Unique tag | Stable test case execution | Requires tagging discipline |
| Feature path | Run one feature | Not one scenario |
| Line number | Quick local debugging | Changes when file moves |
| Scenario name | Human-friendly | May change/duplicate |
| Suite tag | Smoke/regression groups | Multiple scenarios |

Recommended first option:

```text
Unique Scenario Tag
```

---

# 39. Common Mistakes

## Mistake 1 — Replace Regression with Individual Execution

Wrong:

```text
Change existing scheduled pipeline to @TC001
```

Correct:

```text
Keep @regression default
Allow manual override
```

---

## Mistake 2 — Hardcode Test ID

Wrong:

```yaml
npx cucumber-js --tags "@TC001"
```

inside shared YAML.

Correct:

```text
Parameter
→ script
→ Cucumber
```

---

## Mistake 3 — Create Separate Pipeline for Every Test

This becomes difficult to maintain.

Prefer one reusable pipeline unless architecture requires otherwise.

---

## Mistake 4 — Ignore Existing Tag Convention

If project already uses:

```text
@TestCase_123
```

do not introduce:

```text
@TC123
```

without reason.

Reuse current conventions.

---

## Mistake 5 — Let Scheduled Run Depend on Manual Input

Scheduled execution must have safe defaults.

---

## Mistake 6 — Run Zero Tests and Show Green

We need to understand how no-match conditions are handled.

---

# 40. Troubleshooting

## Problem: Tag Input Reaches Script but Tests Do Not Filter

Check:

```text
Quotes
Shell escaping
npm argument forwarding
Cucumber config
Tag expression syntax
```

---

## Problem: Full Suite Still Runs

Check whether:

```text
package.json already hardcodes @regression
```

Example:

```json
"test": "cucumber-js --tags @regression"
```

Then appending another selector may not behave as expected.

---

## Problem: Pipeline Parameter Is Ignored

Trace:

```text
Main YAML
→ Template
→ Child Template
→ Script
```

The value may be dropped at one level.

---

## Problem: Manual Input Works on Windows but Not Ubuntu

Check:

```text
PowerShell quoting
Bash quoting
Special characters
Tag expression spaces
```

---

# 41. Demo Conversation Practice

## Anusha: Can we execute just one scenario?

**Answer:**

> Yes. If the framework already uses Cucumber tags, I would prefer a unique scenario tag and pass that selector from the manual pipeline run down to Cucumber. The scheduled pipeline can continue using the regression tag by default.

---

## Anusha: Will we need another pipeline?

**Answer:**

> Not necessarily. A reusable parameterized pipeline is cleaner if the current design allows it. We can preserve the same YAML and use a manual selector only when needed.

---

## Anusha: What if I don't enter any test ID?

**Answer:**

> We can keep the current regression selector as the default, so scheduled execution remains unchanged.

---

## Anusha: Why not use the scenario name?

**Answer:**

> We can, but a unique test-case tag is usually more stable because scenario names may change or duplicate. I would first check the framework's existing convention.

---

## Anusha: Where exactly will the change go?

**Answer:**

> I would trace where the current regression selector is set. The clean flow would be pipeline parameter → template → script → Cucumber filter. We should make the change at the existing selection point rather than duplicate logic.

---

# 42. Questions to Ask Tomorrow

1. Are scenarios already tagged?
2. Are unique test IDs already available?
3. What tag identifies regression?
4. What tag identifies smoke?
5. Does `package.json` hardcode any tags?
6. Does the PowerShell/Bash script accept arguments?
7. Are Azure pipeline parameters already used?
8. Is there already a manual execution mode?
9. What does "individual test" mean to Anusha exactly?
10. Should one manual run support multiple test IDs?
11. Should users type the tag or choose from predefined options?
12. What should happen if no scenario matches?
13. Should manual execution still generate the same report?
14. Should manual execution also be archived as evidence?
15. Should the dashboard include individual runs?
16. Should scheduled runs remain unchanged?
17. Are Windows and Ubuntu both expected to support selective execution?

---

# 43. Demo-Day Cheat Sheet

Requirement:

```text
Run one test without breaking full suite.
```

Preferred assumed flow:

```text
@TC001
  ↓
Azure Parameter
  ↓
Template
  ↓
Script
  ↓
Cucumber --tags
  ↓
One Matching Scenario
```

Keep:

```text
Scheduled Default = @regression
```

Manual:

```text
Override = @TC001
```

Remember alternatives:

```text
Tag
Feature
Line
Name
```

Preferred:

```text
Unique tag
```

---

# 44. Readiness Check

You are ready to move forward if you can answer:

- Why are tags useful for individual execution?
- How does `--tags` work conceptually?
- Why should the scheduled default remain unchanged?
- What is the role of an Azure pipeline parameter?
- How can that value reach the script?
- Why should the script not hardcode the test ID?
- What are the alternatives to tag-based selection?
- Why is a line number less stable?
- Why can a scenario name be weaker than a unique tag?
- What should happen if no tests match?
- Why should individual runs still produce reports and evidence?

---

# 45. Next Content File

## Content File 06 — Demo Troubleshooting Scenarios + Senior Engineer Diagnostic Approach

Focus:

```text
Pipeline not triggering
Schedule wrong
Template not loading
Script failing
npm dependency issue
Cucumber not finding tests
Tag not working
Report missing
Old report overwritten
Azure test results missing
Pipeline green despite failed tests
```

This will prepare you for unexpected questions during tomorrow's demo.
