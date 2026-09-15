# Amazon GuardDuty

## What

Managed threat-detection service.

## Detects Suspicious Patterns Across Relevant AWS Data Sources

Use findings for:

```text
triage
automation
incident response
```

## Architecture

```text
AWS telemetry
 ↓
GuardDuty
 ↓
Finding
 ↓
Security Hub / EventBridge / Response
```

## Trap

Threat detection does not replace preventive IAM/network controls.
