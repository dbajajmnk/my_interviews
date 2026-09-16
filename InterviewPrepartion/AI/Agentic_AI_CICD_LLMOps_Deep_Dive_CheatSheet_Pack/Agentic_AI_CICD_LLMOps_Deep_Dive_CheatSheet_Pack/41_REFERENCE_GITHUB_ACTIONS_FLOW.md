# Reference GitHub Actions Flow

## Conceptual Flow

```yaml
jobs:
  build:
  unit-tests:
  contract-tests:
  agent-evals:
  security:
  cost-latency-gate:
  package:
  deploy-dev:
  deploy-uat:
  canary-prod:
  promote-prod:
```

## Rule

Keep expensive live-model evals targeted and cache/reuse fixtures where safe.
