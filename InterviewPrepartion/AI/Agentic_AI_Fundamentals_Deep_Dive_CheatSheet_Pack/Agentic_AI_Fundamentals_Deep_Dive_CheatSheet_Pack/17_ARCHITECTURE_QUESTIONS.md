# Agentic AI — Architecture Questions

## Q1 — Design a Customer Support Agent

**Requirements**
- answer using KB;
- check order status;
- create ticket;
- escalate when needed.

**Design**
```text
Chat UI
 ↓
API/Auth
 ↓
Support Agent
 ├─ Retriever → KB
 ├─ Tool → Order API
 ├─ Tool → Ticket API
 ├─ State Store
 ├─ Policy/Guardrails
 └─ Telemetry
```

**Key points**
- read-only order tool;
- ticket creation with validation;
- PII controls;
- escalation after confidence/policy threshold;
- task success metrics.

## Q2 — Design a Safe Finance Agent

Use deterministic boundaries:
```text
Agent recommends
 ↓
Policy Engine
 ↓
Human Approval
 ↓
Transaction Service
```

Never let the model directly perform unbounded fund movement.

## Q3 — Design for Multiple Model Providers

Create:
```text
ModelClient
 ├─ AzureOpenAIAdapter
 ├─ OpenAIAdapter
 └─ OtherProviderAdapter
```

Normalize:
- request;
- response;
- tool call format;
- errors;
- telemetry;
- retry policy.

## Q4 — How Would You Scale?

Scale separately:
- stateless agent runtime;
- state/memory services;
- tool services;
- retrieval;
- model gateway.

Use queues for long-running operations, correlation IDs for tracing, and limits per tenant/user.

## Q5 — How Would You Debug a Bad Run?

Inspect:
1. input;
2. context assembled;
3. model decision;
4. tool selection/arguments;
5. tool result;
6. state update;
7. retries;
8. policy events;
9. final answer.

This is why end-to-end tracing matters.

## Architecture Answer Framework

For any design question answer in this order:

1. **Goal**
2. **Actors**
3. **Agent boundary**
4. **Tools/data**
5. **State/memory**
6. **Security**
7. **Guardrails/HITL**
8. **Observability**
9. **Evaluation**
10. **Scale/failure**
