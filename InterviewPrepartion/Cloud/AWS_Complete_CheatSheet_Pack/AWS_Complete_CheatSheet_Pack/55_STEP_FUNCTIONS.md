# AWS Step Functions

## What

Managed workflow orchestration.

## Use

```text
multi-step business process
serverless orchestration
retry/catch
parallel steps
human/system workflows
```

## Flow

```text
Start
 ↓
Validate
 ↓
Parallel Tasks
 ↓
Decision
 ↓
Complete / Compensate
```

## Good Fit

Visible orchestration over distributed tasks.

## Trap

Do not put all business code into giant state machines; orchestration and domain logic should remain separated.
