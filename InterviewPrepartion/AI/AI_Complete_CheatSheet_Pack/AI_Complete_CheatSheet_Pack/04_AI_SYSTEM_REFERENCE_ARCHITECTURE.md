# AI System Reference Architecture

```text
Client / Product
      ↓
AI BFF / API Gateway
      ↓
Policy + Auth + Rate Limit
      ↓
AI Orchestrator
 ├── Model Router
 │    ├── Large Model
 │    └── Small Model
 ├── RAG
 │    ├── Query Rewrite
 │    ├── Hybrid Retrieval
 │    ├── Reranker
 │    └── Vector / Search Store
 ├── Tools
 │    ├── Internal APIs
 │    ├── Search
 │    └── Actions
 └── Agent Runtime / Workflow
      ↓
Output Validation / Guardrails
      ↓
User

Cross-cutting:
Identity
Audit
Evals
Tracing
Cost
Secrets
Human Approval
Data Governance
```

## Golden Rule

The model is a probabilistic component inside a deterministic, observable, secure application architecture.
