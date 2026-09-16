# Agent Lifecycle

## Lifecycle

```text
Design
 ↓
Build
 ↓
Test
 ↓
Evaluate
 ↓
Deploy
 ↓
Observe
 ↓
Improve
 ↓
Version / Retire
```

## Design

Define:
- goal;
- tool boundaries;
- data access;
- failure states;
- approval points;
- success metrics.

## Test & Evaluate

Test:
- tool schemas;
- invalid inputs;
- policy failures;
- loops;
- timeouts;
- model changes;
- retrieval changes;
- cost/latency;
- regression cases.

## Operate

Observe:
- task success;
- tool success;
- retries;
- latency;
- tokens;
- cost;
- escalation rate;
- safety events.

## Version

Version not only code but also:
- prompts/instructions;
- tool schemas;
- models;
- retrieval configuration;
- policies;
- evaluation datasets.
