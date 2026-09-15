# Environment Strategy

## Problem / Intent

Separate dev/test/UAT/prod data, indexes, prompts, agents and credentials.

## Architecture View

```text
Environment isolation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Environment Strategy:** Separate dev/test/UAT/prod data, indexes, prompts, agents and credentials.
