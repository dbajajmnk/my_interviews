# Aggregator Pattern

## Intent
Combine responses from multiple services.

```text
Client
 ↓
Aggregator
 ├── Service A
 ├── Service B
 └── Service C
 ↓
Combined Response
```

## Use
Dashboards, composite pages, summary APIs.

## Trap
Deep synchronous aggregation increases latency and failure probability.
