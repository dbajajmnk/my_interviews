# Tool Call Budget

## What / Why
2.0.1 supports configurable tool-call limits.

## Mental Model
```text
Tool Call Budget → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Call Budget:** 2.0.1 supports configurable tool-call limits.
