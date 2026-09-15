# API Gateway

## Role

Single entry point for external clients.

```text
Client
  ↓
API Gateway
  ├── Auth
  ├── Routing
  ├── Rate Limit
  ├── TLS
  └── Aggregation
       ↓
Services
```

## Good Responsibilities

- routing
- auth enforcement
- throttling
- observability
- protocol adaptation

## Avoid

- business logic
- heavy orchestration
- domain state

## Trap

Gateway should not become a new monolith.
