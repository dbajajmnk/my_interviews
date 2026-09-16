# Enterprise Agent Architecture

## Reference Architecture

```text
Users / Apps
    │
API Gateway / Auth
    │
Agent Runtime / Orchestrator
    │
    ├── Model Gateway
    │     ├─ Azure/OpenAI
    │     └─ Other Providers
    │
    ├── Tool Registry
    │     ├─ Internal APIs
    │     ├─ Databases
    │     └─ Business Services
    │
    ├── Retrieval / Knowledge
    ├── State Store
    ├── Memory Store
    ├── Policy / Guardrails
    └── Telemetry
          ├─ Logs
          ├─ Metrics
          └─ Traces
```

## Enterprise Boundaries

Add:
- identity propagation;
- least privilege;
- secrets management;
- tenant isolation;
- data classification;
- rate limits;
- cost budgets;
- audit trails;
- model/provider abstraction.

## Key Design Principle

> Separate the **agent decision layer** from the **execution and governance layers**.

The model can propose. The platform decides what is permitted to execute.

## Production Readiness Questions

Ask:
- What can the agent do?
- On whose identity?
- With what data?
- Who can approve?
- How do we replay/debug?
- How do we measure success?
- How do we roll back a model/prompt/tool change?
