# Agent Streaming — Production Architecture

## Reference Architecture

```text
Client
  │
API Gateway/Auth
  │
Run Service
  ├─ Agent Runtime
  ├─ Tool Services
  ├─ Session/Checkpoint Store
  └─ Event Publisher
          │
          ▼
      Event Buffer/Broker
          │
    ┌─────┼─────┐
    ▼     ▼     ▼
   SSE   WS   Telemetry
    │
  Client UI
```

## Production Checklist

- durable run ID;
- stable event envelope;
- event sequence;
- reconnect/resume;
- auth on subscriptions;
- backpressure;
- cancellation semantics;
- event retention;
- redaction;
- finalization state;
- telemetry.
