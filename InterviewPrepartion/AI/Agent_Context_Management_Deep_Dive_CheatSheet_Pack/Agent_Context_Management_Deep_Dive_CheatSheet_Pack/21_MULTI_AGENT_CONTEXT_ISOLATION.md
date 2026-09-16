# Multi-Agent Context Isolation

## Problem

Different agents need different context.

## Example

```text
Supervisor
 ├─ Finance Agent → finance context only
 ├─ HR Agent      → HR context only
 └─ Tech Agent    → technical context only
```

## Benefits

- reduced token cost;
- lower data exposure;
- clearer specialization;
- less instruction conflict.

## Rule

Do not automatically copy the entire parent context into every child agent.
