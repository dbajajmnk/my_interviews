# Agent Testing — 30-Second Recall

## Recall

```text
Agent Testing =
Deterministic Tests
+ Fake Models
+ Fake Tools
+ Contract Tests
+ Workflow Tests
+ Eval Cases
+ Failure Injection
+ Security Tests
+ Performance Tests
+ CI Gates
```

## 30-Second Interview Answer

> I test agent systems in layers. Deterministic code such as routing, state transitions, auth, and tool handlers gets normal unit and contract tests. Model-dependent behavior uses scripted fake models and golden evaluation cases. I test tool calls, retrieval, memory, streaming, HITL, retries, and orchestration explicitly, inject failures to verify resilience, and enforce critical regression, safety, latency, and cost thresholds in CI before release.

## Do Not Forget

- Do not hit a real LLM in every unit test.
- Fake models should produce deterministic tool calls/events.
- Test traces and state transitions, not only final text.
- Retry tests must include idempotency.
- Security and tenant-isolation tests are mandatory.
