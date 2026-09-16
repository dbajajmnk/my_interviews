# Agent Core Abstraction

## Agent Composition

An Agent Framework agent combines:
- agent abstraction;
- model or remote-agent connection;
- instructions;
- tools;
- middleware;
- context providers;
- session state.

## Python Mental Model

```python
from agent_framework import Agent

agent = Agent(
    client=client,
    instructions="You are a helpful assistant.",
)
```

## C# Mental Model

```text
IChatClient
   ↓
AsAIAgent(...)
   ↓
AIAgent
```

## Design Principle

Use the common agent interface so application code stays relatively stable across providers and remote-agent implementations.
