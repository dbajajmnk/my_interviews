# API Gateway Pattern

## Intent
Provide one entry point for clients.

## Visual
```text
Client
 ↓
Gateway
 ├── routing
 ├── auth
 ├── rate limit
 └── aggregation
      ↓
Services
```

## Good Responsibilities
Cross-cutting edge concerns.

## Avoid
Domain business logic.

## Trap
A fat gateway becomes a new monolith.
