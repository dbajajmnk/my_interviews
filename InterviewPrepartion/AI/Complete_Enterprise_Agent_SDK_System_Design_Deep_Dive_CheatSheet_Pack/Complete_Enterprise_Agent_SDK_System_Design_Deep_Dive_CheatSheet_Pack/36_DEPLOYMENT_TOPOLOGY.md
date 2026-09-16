# Deployment Topology

## Example

```text
API Gateway
  ↓
Agent Runtime Cluster
  ↓
Worker Pool / Queue
  ↓
Model / Tools / Data
  ↓
OTel Collector
```

## Rule

Separate interactive runtime from heavy/long-running workers when useful.
