# LangGraph Production Architecture

## Reference Architecture

```text
Client / API
    │
Auth / Gateway
    │
LangGraph Service
    │
Compiled Graph
 ├─ Model APIs
 ├─ Tool Services
 ├─ Retrieval
 ├─ Checkpointer
 ├─ Long-Term Store
 ├─ Event Stream
 └─ Observability
```

## Production Requirements

- durable checkpoint store;
- explicit thread IDs;
- idempotent tool actions;
- retries/timeouts;
- cancellation;
- tenant isolation;
- secrets management;
- streaming;
- tracing;
- evaluation;
- state cleanup/retention.

## Scaling

Scale graph workers independently from:
- model providers;
- tool services;
- storage;
- retrieval systems.
