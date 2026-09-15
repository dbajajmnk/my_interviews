# Service Boundaries & DDD

## Goal

A service should align with a **business capability**, not a technical layer.

Bad:

```text
UserControllerService
DatabaseService
ValidationService
```

Better:

```text
Order Service
Payment Service
Inventory Service
Shipping Service
```

## Boundary Test

Ask:

```text
Does this capability change independently?
Does one team own it?
Does it own its data?
Can it be deployed independently?
Can its invariants stay local?
```

## DDD Link

```text
Domain
  ↓
Subdomain
  ↓
Bounded Context
  ↓
Microservice Candidate
```

## Trap

Entity-per-service usually creates too many services and chatty networks.
