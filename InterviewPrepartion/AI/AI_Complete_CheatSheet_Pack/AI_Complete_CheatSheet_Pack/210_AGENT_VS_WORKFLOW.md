# Agent vs Workflow

## What / Why

Workflow has predefined control flow; agent chooses next action dynamically.

## Mental Model

```text
deterministic DAG vs model-directed loop
```

## When to Use

Use workflow for predictable business processes, agent for ambiguity.

## Common Mistake / Interview Trap

Agentic freedom increases risk/cost.

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

> **Agent vs Workflow:** Workflow has predefined control flow; agent chooses next action dynamically.
