# Microservices Snapshot

## What

An architectural style where a system is composed of small, independently deployable services aligned to business capabilities.

## Key Properties

```text
Business-aligned boundaries
Independent deployment
Independent scaling
Decentralized data ownership
Fault isolation
Automation
Observability
```

## Why

Useful when teams need:

- independent delivery
- selective scaling
- domain ownership
- technology autonomy
- fault isolation

## Real-Life Analogy

A large restaurant kitchen can be split into specialized stations:

```text
Orders
Grill
Dessert
Drinks
Billing
```

Each station owns its work, but they coordinate to complete one customer order.

## Trap

If all services must be deployed together, share one database, and break together, you probably have a distributed monolith.
