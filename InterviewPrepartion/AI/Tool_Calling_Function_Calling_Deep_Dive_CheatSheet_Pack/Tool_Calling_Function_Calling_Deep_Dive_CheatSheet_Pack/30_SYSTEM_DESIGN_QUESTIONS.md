# Tool Calling — System Design Questions

## Q1 — Design a Secure Enterprise Tool Gateway

Discuss:
- tool registry;
- schema validation;
- identity;
- auth/authz;
- approval;
- timeout/retry;
- idempotency;
- audit;
- versioning.

## Q2 — Design an Order Support Agent

```text
Agent
 ├─ search_customer
 ├─ list_orders
 ├─ get_order_status
 └─ create_ticket
```

Read tools can be lower risk; ticket creation is a write and needs stronger validation/audit.

## Q3 — Design a Financial Action Tool

Require:
- strict schema;
- authenticated identity;
- policy;
- approval;
- idempotency key;
- transaction reference;
- audit trail.

## Q4 — Design Remote Multi-Language Tools

Use remote tool services or MCP with:
- stable contracts;
- auth;
- versioning;
- timeouts;
- distributed tracing;
- retries.

## Q5 — Design Dynamic Tool Exposure

Filter tool set based on:
- task classification;
- user role;
- tenant;
- current workflow phase;
- risk profile.

## Answer Framework

**Schema → selection → validation → authorization → approval → execution → result → retries/idempotency → audit → versioning.**
