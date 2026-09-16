# Tool Calling — Interview Questions & Answers

## 1. What is tool calling?

A model-generated structured request to invoke an approved capability.

## 2. Does the model execute the tool?

No. Application/runtime code validates and executes it.

## 3. Function calling vs tool calling?

Function calling is a subset of the broader tool-calling concept.

## 4. What makes a good tool schema?

Clear name, precise description, typed bounded inputs, stable semantics, and minimal ambiguity.

## 5. Why validate arguments after schema validation?

Business rules and authorization constraints go beyond type/schema correctness.

## 6. How do you secure tools?

Allowlist, schema validation, auth/authz, least privilege, risk classification, approval, audit.

## 7. Why idempotency?

Retries/resumes can repeat write operations and cause duplicate side effects.

## 8. When use parallel tool calls?

Only when calls are independent and order does not matter.

## 9. How do you prevent tool loops?

Max steps, time/cost limits, repeated-action detection, explicit failure states.

## 10. Structured output vs tool call?

Structured output returns typed data; a tool call requests an external capability.

## 11. How do you expose many tools?

Filter dynamically by task, role, tenant, or workflow phase rather than exposing everything.

## 12. What should a tool result contain?

Structured result, status, minimal relevant data, stable error semantics, and references where needed.

## 13. What is the role of MCP?

It standardizes remote tool connectivity, not authorization or trust.

## 14. How do you monitor tools?

Trace latency, success/failure, retries, auth/approval outcomes, and correlation IDs.

## 15. One-line principle?

> The model chooses; the platform governs and executes.
