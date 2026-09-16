# Agent Core Abstraction

## Agent

An Agent is an LLM configured with:
- name;
- instructions;
- model/model settings;
- tools;
- handoffs;
- guardrails;
- optional structured output behavior.

## Conceptual Example

```python
from agents import Agent

agent = Agent(
    name="Support Agent",
    instructions="Resolve customer support requests safely and concisely.",
    tools=[...],
    handoffs=[...],
)
```

## Dynamic Behavior

Instructions and other behavior can be made dynamic when runtime context requires per-user, per-tenant, or per-task customization.

## Interview Point

> Agent is configuration plus capabilities; Runner is execution.
