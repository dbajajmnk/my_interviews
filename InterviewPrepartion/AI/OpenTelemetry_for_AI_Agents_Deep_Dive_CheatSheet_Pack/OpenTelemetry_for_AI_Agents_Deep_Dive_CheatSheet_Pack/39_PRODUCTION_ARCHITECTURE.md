# OpenTelemetry for Agents — Production Architecture

## Reference Architecture

```text
Clients
   ↓
API Gateway
   ↓
Agent Runtime ──→ Model Provider
   │  ├─────────→ Tool Services
   │  ├─────────→ Vector/DB
   │  └─────────→ Memory Service
   │
   └─ OTel SDK
        ↓ OTLP
   OTel Collector
   ├─ batch
   ├─ redact
   ├─ sample
   └─ route
        ↓
  Observability Backend
   ├─ traces
   ├─ metrics
   └─ logs
```

## Production Checklist

- W3C propagation;
- stable semantic layer;
- OTLP;
- collector;
- sampling;
- token/cost metrics;
- trace/log correlation;
- PII redaction;
- retention;
- RBAC;
- release/version attributes.
