# Deterministic Workflow vs Agent

## Decision Table

| Situation | Prefer |
|---|---|
| Known sequence | Workflow |
| Regulatory exactness | Workflow |
| Dynamic tool selection | Agent |
| Unknown path | Agent |
| High-risk action | Workflow/HITL |
| Mixed task | Hybrid |

## Enterprise Pattern

```text
Deterministic shell
    │
    ├─ Authentication
    ├─ Policy
    ├─ Approval
    ├─ Audit
    │
    └── Agentic decision zone
          ├─ classify
          ├─ retrieve
          ├─ recommend
          └─ choose safe tool
```

## Strong Interview Answer

> I would not make the whole business process agentic. I would keep deterministic controls around the agent and use model-driven decisions only where ambiguity or dynamic reasoning genuinely adds value.

## Common Mistake

Using an LLM for things normal code already does better:
- date arithmetic;
- deterministic validation;
- authorization decisions;
- exact accounting logic;
- database constraints.
