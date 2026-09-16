# Agents as Tools

## What

One agent can expose another agent as a tool for in-process delegation.

## Mental Model

```text
Manager Agent
   ├─ Research Agent as tool
   ├─ Data Agent as tool
   └─ Writer Agent as tool
```

## When to Use

Use agents-as-tools when:
- all agents are in the same application/runtime;
- the parent should retain control;
- specialization improves tool/instruction focus.

## Why Not One Huge Agent?

As agents accumulate many tools and broad instructions, tool selection and role focus can degrade.
