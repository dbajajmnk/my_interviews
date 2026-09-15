# Enterprise AI Reference Architecture

```text
┌─────────────────────────────────────────┐
│ Web • Mobile • API • Voice • Copilot   │
└────────────────────┬────────────────────┘
                     ↓
          API Gateway / AI BFF
                     ↓
       Identity • Quota • Policy • DLP
                     ↓
             AI Orchestrator
        ┌────────────┼────────────┐
        ↓            ↓            ↓
 Model Gateway   Knowledge/RAG   Agent Runtime
        │            │            │
 Models/SLMs     Search/Vector    Tool Gateway
                                  │
                              APIs/MCP/Apps
        └────────────┬────────────┘
                     ↓
       Guardrails • Schema Validation
                     ↓
                 Response/Action

Data Plane:
Documents • Metadata • Memory • Conversations • Checkpoints

Ops Plane:
Evals • Traces • Audit • Cost • SLOs • Release Registry
```

## Principle

Keep business invariants, authorization, payment/deletion/deployment controls, and transactional guarantees outside model reasoning.
