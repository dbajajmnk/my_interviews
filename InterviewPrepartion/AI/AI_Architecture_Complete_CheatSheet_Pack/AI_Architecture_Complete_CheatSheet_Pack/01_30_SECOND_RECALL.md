# AI Architecture — 30-Second Recall

```text
Experience / Channels
        ↓
API Gateway / AI BFF
        ↓
Identity + Policy + Quotas
        ↓
AI Orchestration
 ├── Model Gateway / Router
 ├── RAG / Knowledge
 ├── Agent Runtime
 └── Tool Gateway
        ↓
Guardrails / Output Validation
        ↓
User / Business Action

Cross-Cutting:
Evals • Tracing • Audit • Cost • Security • Governance
```

## Golden Rules

1. Model ≠ application architecture.
2. Authorization stays deterministic.
3. Retrieve only authorized evidence.
4. Tools get least privilege.
5. Agents are bounded by steps/time/cost.
6. Every release is evaluated.
7. Every production call is observable.
8. Architect to capabilities, not vendor model names.
