# CI/CD Test Gates

## Pipeline

```text
Lint
 ↓
Unit
 ↓
Contract
 ↓
Workflow
 ↓
Agent regression
 ↓
Security
 ↓
Performance budget
 ↓
PASS → deploy
```

## Rule

Critical agent eval/test thresholds belong in CI, not only dashboards.
