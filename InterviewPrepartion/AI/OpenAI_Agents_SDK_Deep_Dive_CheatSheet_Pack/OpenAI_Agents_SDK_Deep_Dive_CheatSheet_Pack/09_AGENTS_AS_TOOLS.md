# Agents as Tools

## Concept

An agent can be exposed as a tool to another agent.

## Mental Model

```text
Manager Agent
   │
   ├─ call Research Agent as tool
   ├─ call Coding Agent as tool
   └─ synthesize final answer
```

## Why

Use this when the top-level manager should retain ownership of the conversation and simply delegate specialist work.

## Difference from Handoff

- **Agent as tool:** manager keeps control.
- **Handoff:** control transfers to specialist agent.

## Interview Rule

Choose based on conversation ownership, not merely on the number of agents.
