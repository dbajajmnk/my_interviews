# Decompose by Subdomain / Bounded Context

## Intent
Align services with DDD bounded contexts.

## Visual
```text
Domain
  ↓
Subdomains
  ↓
Bounded Contexts
  ↓
Service candidates
```

## Why
The same term can mean different things in different contexts.

Example:
```text
Customer in Sales != Customer in Billing
```

## Use When
Domain complexity is high and language/model boundaries matter.

## Trap
Bounded context is a modeling boundary; it does not always need to be a separate deployment unit.
