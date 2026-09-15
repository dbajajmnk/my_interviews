# Multi-Region Reference Architecture

```text
                 Route 53 / Global Accelerator
                    ┌─────────┴─────────┐
                    ▼                   ▼
                 Region A            Region B
               ┌──────────┐         ┌──────────┐
               │ App Tier │         │ App Tier │
               └────┬─────┘         └────┬─────┘
                    │                    │
                 Global / replicated data
```

## Data Options Depend On Workload

Examples:

```text
DynamoDB Global Tables
Aurora Global Database patterns
S3 replication
application-level replication
```

## Rule

Define conflict/consistency/failover behavior before calling an architecture active-active.
