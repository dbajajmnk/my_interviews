# Agentic AI CI/CD & LLMOps — Production Architecture

## Reference

```text
Git
 ↓
CI Pipeline
 ├─ tests
 ├─ evals
 ├─ security
 └─ cost/latency
 ↓
Artifact Registry
 ↓
DEV → UAT → PROD
          ↓
     Canary / Flags
          ↓
 Agent Runtime
          ↓
Observability + Trace Evals
          ↓
Rollback / Feedback
```

## Control Plane

Version registry for:
- code;
- prompts;
- models;
- tools;
- retrieval;
- policies;
- datasets.
