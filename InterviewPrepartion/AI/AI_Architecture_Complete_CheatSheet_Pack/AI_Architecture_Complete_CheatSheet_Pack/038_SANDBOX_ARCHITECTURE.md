# Sandbox Architecture

## Problem / Intent

Run generated code/browser/file operations in isolated environments with resource/network limits.

## Architecture View

```text
Agent → sandbox → controlled resources
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

> **Sandbox Architecture:** Run generated code/browser/file operations in isolated environments with resource/network limits.
