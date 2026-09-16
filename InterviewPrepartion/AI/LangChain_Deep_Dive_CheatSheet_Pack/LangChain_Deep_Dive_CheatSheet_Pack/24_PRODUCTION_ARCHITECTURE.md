# LangChain Production Architecture

## Reference Architecture

```text
Client / UI
    │
API Gateway + Auth
    │
Agent Service
    │
LangChain create_agent
    │
    ├─ Model Provider
    ├─ Tool Services
    ├─ Retriever
    ├─ Checkpointer
    ├─ Long-Term Store
    ├─ Policy Middleware
    └─ Tracing/Evaluation
```

## Production Checklist

- identity propagation;
- stateless application replicas;
- durable checkpointing;
- durable long-term store;
- tool timeouts;
- provider retry/circuit breaking;
- secret management;
- rate limits;
- observability;
- eval regression suite;
- cost budgets.

## Scaling

Keep agent-service compute separate from:
- model provider;
- vector/retrieval service;
- state store;
- tool services.

Scale each according to its bottleneck.
