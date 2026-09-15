# Secrets Architecture

## Problem / Intent

Keep secrets in vault/executor boundary, never model context.

## Architecture View

```text
Model requests action → executor injects secret
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

> **Secrets Architecture:** Keep secrets in vault/executor boundary, never model context.
