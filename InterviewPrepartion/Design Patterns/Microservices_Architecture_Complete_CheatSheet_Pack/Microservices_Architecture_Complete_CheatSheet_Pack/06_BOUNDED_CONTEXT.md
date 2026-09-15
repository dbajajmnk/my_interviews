# Bounded Context

## What

A boundary inside which a domain model has a precise meaning.

Example:

```text
Customer in Sales
!=
Customer in Billing
```

## Why

Prevents one giant shared enterprise model.

## Visual

```text
Sales Context
  Customer
  Lead
  Quote

Billing Context
  Account
  Invoice
  Payment
```

## Rule

Bounded contexts communicate through explicit contracts.

## Trap

Bounded context is a domain boundary, not automatically a deployment boundary.
