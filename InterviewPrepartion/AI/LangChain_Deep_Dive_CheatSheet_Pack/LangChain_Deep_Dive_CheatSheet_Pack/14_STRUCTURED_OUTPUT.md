# Structured Output

## Purpose

Structured output lets an agent return predictable machine-readable results rather than free-form text.

## Supported Strategies

Current LangChain agent APIs support:
- provider-native structured output where available;
- tool-based structured output otherwise.

## Conceptual Example

```python
from pydantic import BaseModel
from langchain.agents import create_agent

class Ticket(BaseModel):
    category: str
    priority: str

agent = create_agent(
    model="provider:model-name",
    tools=[],
    response_format=Ticket,
)
```

## Why It Matters

Use structured output for:
- downstream APIs;
- workflow decisions;
- UI rendering;
- validation;
- typed SDK contracts.

## Interview Point

> Prefer validated structured output when a downstream system must consume the result.
