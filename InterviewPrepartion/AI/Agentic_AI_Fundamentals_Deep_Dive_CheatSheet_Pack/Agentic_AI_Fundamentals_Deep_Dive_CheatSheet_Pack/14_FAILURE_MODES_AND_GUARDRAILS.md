# Failure Modes and Guardrails

## Common Failure Modes

- hallucinated facts;
- wrong tool selection;
- incorrect tool arguments;
- repeated loops;
- prompt injection;
- excessive permissions;
- stale context;
- accidental destructive action;
- data leakage;
- high token cost;
- latency spikes;
- provider failure.

## Guardrail Layers

```text
Input Guardrails
 ↓
Context/Data Controls
 ↓
Model/Instruction Controls
 ↓
Tool Schema Validation
 ↓
Authorization / Policy
 ↓
Human Approval
 ↓
Output Validation
 ↓
Audit / Monitoring
```

## Practical Controls

- allowlist tools;
- schema validation;
- max iterations;
- max tokens;
- timeout;
- content/policy checks;
- least privilege;
- read-only default;
- confirmation for writes;
- idempotency keys;
- circuit breakers;
- fallbacks.

## Interview Trap

Do not say “the prompt tells the agent not to do it.”

Prompts are one layer only. Critical controls belong in enforceable application/policy layers.
