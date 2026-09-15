# Agent Orchestrator

## What / Why

Controls agent lifecycle, tools, checkpoints and policies.

## Mental Model

```text
task → orchestrator → model/tools
```

## When to Use

Use production agents.

## Common Mistake / Interview Trap

Do not put auth solely inside model prompt.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Orchestrator:** Controls agent lifecycle, tools, checkpoints and policies.
