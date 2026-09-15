# AWS Snapshot

## Mental Model

```text
Global Infrastructure
      ↓
Accounts / Organization
      ↓
Identity & Governance
      ↓
VPC / Network
      ↓
Compute
      ↓
Storage / Database
      ↓
Integration
      ↓
Observability / Security
      ↓
Automation / Cost
```

## Architecture Principle

Do not select services independently.

Design around:

```text
business requirement
availability target
latency
security
data model
scale pattern
team capability
cost
```

## Core Rule

Managed services reduce undifferentiated operational work, but every abstraction introduces constraints and pricing trade-offs.
