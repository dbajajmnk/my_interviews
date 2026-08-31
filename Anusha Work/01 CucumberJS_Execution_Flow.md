# Anusha Framework Help — Content File 01
## JavaScript + Cucumber.js Execution Flow

> **Preparation Mode:** Assumption-based preparation for the second demo  
> **Important:** We do not yet have Anusha's actual repository, YAML files, scripts, Cucumber configuration, or report implementation. This file prepares us using a realistic industry-standard Cucumber.js framework so we can recognize and trace the real implementation quickly when it is shown.

---

## 1. Objective

By the end of this content file, you should be able to:

- Explain what Cucumber.js is and where it fits in a JavaScript automation framework.
- Read a basic `.feature` file.
- Understand how a Gherkin step connects to JavaScript step-definition code.
- Explain the purpose of `Given`, `When`, and `Then`.
- Understand where hooks such as `Before` and `After` fit.
- Explain how `npx cucumber-js` starts test execution.
- Trace one scenario from feature file to execution result.
- Understand how tags can be used to execute an individual test or selected group of tests.
- Identify where report generation normally fits.
- Ask the correct questions when Anusha shows the actual framework.

---

## 2. What Is Cucumber.js?

Cucumber.js is the JavaScript implementation of Cucumber.

It allows tests to be written in a business-readable format called **Gherkin**.

Example:

```gherkin
Feature: Login

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the dashboard should be displayed
```

The feature file describes **what should happen**.

JavaScript step-definition files contain the code that explains **how the automation performs those actions**.

---

## 3. Why Is It Used?

Cucumber helps connect:

```text
Business Requirement
        ↓
Readable Scenario
        ↓
Automation Code
        ↓
Execution Result
        ↓
Evidence / Report
```

A tester, developer, business analyst, product owner, or client can read the scenario without needing to understand the complete JavaScript implementation.

---

## 4. Plain-English Understanding

Think of Cucumber as a translator.

The feature file says:

```text
Given the user is on the login page
```

Cucumber searches the loaded JavaScript step definitions for code matching that sentence.

It may find:

```javascript
Given('the user is on the login page', async function () {
    await browser.openLoginPage();
});
```

Cucumber then executes that JavaScript function.

So:

```text
English-like Gherkin
        ↓
Matching JavaScript Function
        ↓
Actual Automation
```

---

## 5. Analogy

Imagine a restaurant.

### Feature File

The customer says:

> "I want one vegetable pizza."

### Step Definition

The kitchen has an instruction:

> "When somebody orders vegetable pizza, prepare dough, add vegetables, add cheese, and bake it."

### Cucumber

Cucumber acts like the waiter who connects the customer's request to the correct kitchen instruction.

### Test Runner

The kitchen executes the instruction.

### Report

The waiter records whether the order was successfully delivered.

Mapping:

```text
Customer Request     → Gherkin Step
Kitchen Recipe       → Step Definition
Waiter               → Cucumber
Cooking              → Test Execution
Order Status         → Test Result / Report
```

---

## 6. Visualization

```text
┌─────────────────────────────┐
│        Feature File         │
│        login.feature        │
└──────────────┬──────────────┘
               │
               │ Gherkin Steps
               ▼
┌─────────────────────────────┐
│      Cucumber.js Runner     │
└──────────────┬──────────────┘
               │
               │ Finds matching steps
               ▼
┌─────────────────────────────┐
│     Step Definitions        │
│       login.steps.js        │
└──────────────┬──────────────┘
               │
               │ Calls automation code
               ▼
┌─────────────────────────────┐
│ Browser / API / Application │
└──────────────┬──────────────┘
               │
               │ Pass / Fail
               ▼
┌─────────────────────────────┐
│        Cucumber Result      │
└──────────────┬──────────────┘
               │
               ▼
┌─────────────────────────────┐
│   HTML / JUnit / Other      │
│          Reports            │
└─────────────────────────────┘
```

---

## 7. Mind Map

```text
Cucumber.js
│
├── Feature Files
│   ├── Feature
│   ├── Scenario
│   ├── Given
│   ├── When
│   ├── Then
│   └── Tags
│
├── Step Definitions
│   ├── Given()
│   ├── When()
│   └── Then()
│
├── Support Code
│   ├── Hooks
│   ├── Before
│   ├── After
│   ├── World / Context
│   └── Utilities
│
├── Runner
│   └── cucumber-js
│
├── Filtering
│   ├── Tag
│   ├── Feature
│   ├── Line
│   └── Scenario Name
│
└── Output
    ├── Console
    ├── HTML
    ├── JUnit
    ├── Logs
    └── Screenshots
```

---

# 8. Core Concept 1 — Feature File

A feature file normally uses the `.feature` extension.

Example structure:

```text
features/
└── login.feature
```

Example:

```gherkin
Feature: User Login

  As a registered user
  I want to log in
  So that I can access the application

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks the login button
    Then the dashboard should be displayed
```

### Important Keywords

| Keyword | Purpose |
|---|---|
| `Feature` | Describes the capability being tested |
| `Scenario` | Describes one test case |
| `Given` | Initial state or precondition |
| `When` | User/system action |
| `Then` | Expected result |
| `And` | Continues the previous step type |

---

# 9. Core Concept 2 — Step Definitions

The feature file itself does not normally contain browser automation code.

The automation implementation is placed in JavaScript step-definition files.

Example structure:

```text
features/
├── login.feature
└── step_definitions/
    └── login.steps.js
```

Example JavaScript:

```javascript
const { Given, When, Then } = require('@cucumber/cucumber');

Given('the user is on the login page', async function () {
    console.log('Opening login page');
});

When('the user enters valid credentials', async function () {
    console.log('Entering username and password');
});

When('the user clicks the login button', async function () {
    console.log('Clicking login');
});

Then('the dashboard should be displayed', async function () {
    console.log('Validating dashboard');
});
```

---

## 10. How Cucumber Matches Steps

Feature:

```gherkin
Given the user is on the login page
```

Step definition:

```javascript
Given('the user is on the login page', async function () {
    // automation
});
```

Cucumber matches the Gherkin text with the registered JavaScript step definition.

Conceptually:

```text
"the user is on the login page"
              ↓
         Find Match
              ↓
Given('the user is on the login page', ...)
              ↓
       Execute Function
```

If no matching step definition exists, the step is normally reported as **undefined**.

---

# 11. Core Concept 3 — Hooks

Hooks execute code around scenarios.

Common examples:

```javascript
const { Before, After } = require('@cucumber/cucumber');

Before(async function () {
    console.log('Prepare test');
});

After(async function () {
    console.log('Clean up test');
});
```

Typical responsibilities:

### `Before`

```text
Start browser
Create API client
Prepare test data
Authenticate user
Initialize context
```

### `After`

```text
Take failure screenshot
Close browser
Clean test data
Save logs
Attach evidence
```

Assumed execution:

```text
Before
  ↓
Given
  ↓
When
  ↓
Then
  ↓
After
```

For tomorrow, remember that **report evidence or screenshots may be implemented inside an `After` hook**, so we should inspect hooks when the real project becomes available.

---

# 12. Core Concept 4 — Cucumber Runner

After Cucumber is installed in a Node.js project, a common execution command is:

```bash
npx cucumber-js
```

Conceptually this tells Cucumber:

```text
Load configuration
      ↓
Find feature files
      ↓
Load support / step-definition code
      ↓
Select scenarios
      ↓
Execute scenarios
      ↓
Produce result/output
```

A project may hide this command behind `package.json`.

Example:

```json
{
  "scripts": {
    "test": "cucumber-js",
    "test:smoke": "cucumber-js --tags \"@smoke\"",
    "test:regression": "cucumber-js --tags \"@regression\""
  }
}
```

Then execution may be:

```bash
npm test
```

or:

```bash
npm run test:regression
```

### Tomorrow's rule

Do not assume the Azure YAML directly contains:

```bash
npx cucumber-js
```

It may call:

```text
Azure YAML
    ↓
PowerShell / Shell Script
    ↓
npm script
    ↓
cucumber-js
```

We must trace the chain.

---

# 13. Complete Scenario Execution Flow

Assume we have:

```text
features/
├── login.feature
├── step_definitions/
│   └── login.steps.js
└── support/
    └── hooks.js
```

Execution:

```bash
npx cucumber-js
```

The logical flow is:

```text
1. Node.js starts Cucumber.js
          ↓
2. Cucumber loads configuration
          ↓
3. Cucumber discovers .feature files
          ↓
4. Cucumber loads step definitions
          ↓
5. Cucumber loads hooks/support code
          ↓
6. Cucumber selects scenarios
          ↓
7. Before hook executes
          ↓
8. Given step executes
          ↓
9. When step executes
          ↓
10. Then step executes
          ↓
11. After hook executes
          ↓
12. Result is recorded
          ↓
13. Formatter/report receives result
```

This flow is one of the most important things to understand before tomorrow's demo.

---

# 14. Core Concept 5 — Tags

Tags allow scenarios to be classified.

Example:

```gherkin
@smoke
Scenario: Successful login
  Given the user is on the login page
  When the user enters valid credentials
  Then the dashboard should be displayed
```

Run only smoke tests:

```bash
npx cucumber-js --tags "@smoke"
```

Multiple expressions are possible, for example:

```bash
npx cucumber-js --tags "@smoke and not @skip"
```

---

# 15. Individual Test Execution — Important for Anusha

This is directly related to Anusha's request.

Instead of always executing the complete suite, give an individual scenario a stable test identifier.

Example:

```gherkin
@TC_LOGIN_001
Scenario: Successful login
  Given the user is on the login page
  When the user enters valid credentials
  Then the dashboard should be displayed
```

Execute:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Concept:

```text
Complete Suite
    ↓
100 Scenarios

vs.

Tag Filter
    ↓
@TC_LOGIN_001
    ↓
1 Matching Scenario
```

This is likely one of the cleanest options to investigate for Anusha's requirement.

---

# 16. Other Ways to Select Tests

Cucumber.js can also select scenarios in other ways.

## By Feature File

```bash
npx cucumber-js features/login.feature
```

## By Feature File + Line Number

```bash
npx cucumber-js features/login.feature:12
```

This can target a scenario at a specific location.

## By Scenario Name

```bash
npx cucumber-js --name "Successful login"
```

## By Tag

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

### Preferred Starting Recommendation

For a company framework where individual tests need to be triggered repeatedly, a unique tag such as:

```text
@TC_LOGIN_001
```

is usually easier to maintain than depending on a feature-file line number.

But tomorrow we first inspect the framework's existing conventions before recommending a change.

---

# 17. Core Concept 6 — Reporting

Cucumber's execution output can be sent to formatters.

A simplified example:

```bash
npx cucumber-js --format "html:reports/cucumber.html"
```

Concept:

```text
Scenario Execution
      ↓
Cucumber Events / Results
      ↓
Formatter
      ↓
reports/cucumber.html
```

A framework may create:

```text
reports/
├── cucumber.html
├── results.xml
├── screenshots/
└── logs/
```

The actual project may use:

- Cucumber's built-in formatters
- A third-party reporter
- Custom JavaScript reporting
- A script after execution
- Azure DevOps test-result publishing
- A combination of these

We must verify rather than assume.

---

# 18. Connection to Anusha's Report Issue

Anusha's reported issue is approximately:

```text
Run 1
  ↓
reports/current-report

Run 2
  ↓
Old report removed / overwritten
  ↓
reports/current-report
```

Her expectation is closer to:

```text
Run 1
  ↓
Report evidence retained

Run 2
  ↓
New report generated
  ↓
Previous evidence still available
```

Before changing anything, we need to determine **who deletes or overwrites the report**.

Possible locations:

```text
Cucumber configuration
        OR
JavaScript reporting code
        OR
After hook
        OR
package.json script
        OR
pipeline script folder
        OR
Azure YAML
        OR
artifact publishing configuration
```

This is why understanding the Cucumber execution flow comes first.

---

# 19. Engineering Depth — Trace Instead of Guess

When Anusha shares the repository, trace one execution in this order:

```text
.feature
   ↓
step definition
   ↓
hook/support file
   ↓
Cucumber configuration
   ↓
package.json
   ↓
test command
   ↓
pipeline script
   ↓
YAML
   ↓
Azure pipeline
   ↓
report/output
```

### Questions to answer

1. Which command actually starts Cucumber?
2. Where are feature files located?
3. Where are step definitions located?
4. Which file defines hooks?
5. Are test tags already used?
6. How does the pipeline choose tests?
7. Where is the report path configured?
8. Who creates the report folder?
9. Who deletes/cleans the old report?
10. Who publishes the report to Azure?

---

# 20. Example Assumed Project

```text
automation-framework/
│
├── package.json
├── cucumber.js
│
├── features/
│   ├── login.feature
│   ├── customer.feature
│   │
│   ├── step_definitions/
│   │   ├── login.steps.js
│   │   └── customer.steps.js
│   │
│   └── support/
│       └── hooks.js
│
├── reports/
│
└── pipeline/
    ├── template/
    │   ├── windows.yaml
    │   ├── ubuntu.yaml
    │   └── c360.yaml
    │
    └── scripts/
        ├── run-tests.ps1
        └── run-tests.sh
```

Again, this is an **assumed learning structure**, not a claim about Anusha's repository.

---

# 21. Execution Walkthrough Example

Feature:

```gherkin
@TC_LOGIN_001
Feature: Login

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the dashboard should be displayed
```

Step definitions:

```javascript
const { Given, When, Then } = require('@cucumber/cucumber');

Given('the user is on the login page', async function () {
    console.log('Open login page');
});

When('the user enters valid credentials', async function () {
    console.log('Enter credentials');
});

Then('the dashboard should be displayed', async function () {
    console.log('Validate dashboard');
});
```

Run only this test:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Expected logical result:

```text
1 scenario
3 steps
Pass / Fail
```

The exact console format depends on the installed Cucumber version and formatter configuration.

---

# 22. Common Mistakes

## Mistake 1 — Thinking Feature Files Contain Automation Logic

Wrong mental model:

```text
.feature = automation code
```

Correct:

```text
.feature = test behaviour/specification
step definition = implementation
```

---

## Mistake 2 — Assuming Azure Directly Executes Feature Files

Usually Azure executes a command or script.

Example:

```text
Azure Pipeline
    ↓
script
    ↓
npm
    ↓
cucumber-js
    ↓
.feature
```

---

## Mistake 3 — Changing YAML Before Finding the Actual Test Command

First locate:

```text
What command starts Cucumber?
```

Then understand where it is called from.

---

## Mistake 4 — Using Line Number as the Only Long-Term Test ID

This:

```bash
features/login.feature:17
```

can work, but the line number may move after editing the feature.

A stable tag can be easier:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

---

## Mistake 5 — Assuming Report Archiving Is a Cucumber Problem

The report may be overwritten by:

```text
Reporter
Script
Pipeline cleanup
Artifact configuration
Shared report location
```

We must locate the actual ownership first.

---

# 23. Practical Exercise

Without installing anything, explain the following flow aloud:

```text
Feature:
@TC001
Scenario: User logs in

Step:
Given('user is on login page', ...)

Command:
npx cucumber-js --tags "@TC001"
```

Your explanation should be:

> Cucumber starts through the CLI, loads the configured feature and support files, filters scenarios using the tag expression, finds the JavaScript step definitions matching the selected scenario, runs the hooks and steps, records the execution result, and sends the result to the configured formatter/reporting mechanism.

---

# 24. Demo Practice — Questions Anusha May Ask

## Q1. How does Cucumber know which JavaScript function to execute?

**Answer:**

Cucumber loads the registered step definitions and matches the text of each Gherkin step with the corresponding `Given`, `When`, or `Then` definition.

---

## Q2. Can we execute only one test?

**Answer:**

Yes. Cucumber.js supports filtering. For a maintainable framework, we can investigate using a unique scenario tag such as `@TC_LOGIN_001` and run it through the `--tags` option. We first need to see how the existing project currently identifies and triggers tests.

---

## Q3. Will this affect scheduled regression?

**Answer:**

It does not have to. We can preserve the existing scheduled suite and expose filtering only for selected/manual execution. The exact implementation will depend on how the current YAML and scripts pass the Cucumber command.

---

## Q4. Where is the report generated?

**Answer:**

That is framework-specific. I would trace the Cucumber formatter/configuration, npm scripts, support hooks, pipeline scripts, and YAML to identify exactly where the report path is controlled.

---

## Q5. Why is the previous report disappearing?

**Answer:**

There are several possible causes: the report is being written to the same path, a script cleans the report folder before execution, the pipeline workspace is recreated, or only the latest report is being published. We should trace the report lifecycle before modifying it.

---

# 25. Questions We Should Ask During the Real Demo

When Anusha shows the project:

1. Which YAML is the entry pipeline?
2. Which YAML calls `windows.yaml`, `ubuntu.yaml`, or `c360.yaml`?
3. What exactly does C360 represent?
4. Which script starts the automation?
5. What command finally executes Cucumber?
6. Where is `package.json`?
7. Where is Cucumber configuration?
8. Which tags already exist?
9. How is the complete regression suite selected?
10. Where are reports generated?
11. Is an old report explicitly deleted?
12. Are reports stored on the agent or published as Azure artifacts?
13. Is the pie chart an Azure-native test dashboard or a custom report?
14. Does individual execution mean:
    - one scenario,
    - one test-case ID,
    - one feature,
    - one tag,
    - or one business module?

---

# 26. Quick Notes

Remember this chain:

```text
Feature
→ Step Definition
→ Hook
→ Cucumber Runner
→ Result
→ Report
```

Remember this command:

```bash
npx cucumber-js
```

Remember individual execution:

```bash
npx cucumber-js --tags "@TC_LOGIN_001"
```

Remember tomorrow's debugging chain:

```text
package.json
→ Cucumber config
→ feature
→ steps/hooks
→ script
→ YAML
→ Azure
→ report
```

And remember:

> **Do not redesign before tracing the existing execution flow.**

---

# 27. Readiness Check

You are ready to move to the Azure Pipeline section if you can answer these without looking:

- What is the role of a `.feature` file?
- What is a step definition?
- How does Cucumber connect them?
- What does a hook do?
- What command commonly starts Cucumber.js?
- How can a tag select an individual scenario?
- Where can reporting fit in the execution flow?
- Why should we inspect the project before deciding how report archiving should work?

---

# 28. Tomorrow Demo Cheat Sheet

```text
CUCUMBER FLOW
Feature → Steps → Hooks → Runner → Result → Report

RUNNER
npx cucumber-js

INDIVIDUAL TEST
npx cucumber-js --tags "@TC_LOGIN_001"

TRACE IN REAL PROJECT
package.json
→ cucumber config
→ feature
→ steps/hooks
→ scripts
→ YAML
→ Azure
→ report

REPORT ISSUE
Find who creates / cleans / overwrites / publishes report.

DO NOT ASSUME
C360 meaning
Actual report library
Actual script implementation
Actual Azure artifact strategy
```

---

# 29. References

Official Cucumber.js resources:

- Cucumber.js repository: https://github.com/cucumber/cucumber-js
- Cucumber.js CLI: https://github.com/cucumber/cucumber-js/blob/main/docs/cli.md
- Filtering and tags: https://github.com/cucumber/cucumber-js/blob/main/docs/filtering.md
- Cucumber.js installation: https://github.com/cucumber/website/blob/main/docs/installation/javascript.md
- Cucumber.js configuration documentation: https://github.com/cucumber/cucumber-js/blob/main/docs/configuration.md
- Cucumber.js formatter documentation: https://github.com/cucumber/cucumber-js/blob/main/docs/formatters.md

---

## Next Content File

**Content File 02 — Azure DevOps YAML Pipeline Flow for the Assumed Anusha Framework**

Focus:

```text
GitHub
→ Azure Pipeline
→ Main YAML
→ Templates
→ Windows / Ubuntu / C360
→ Scripts
→ Cucumber command
→ Scheduled execution
→ Result publishing
```
