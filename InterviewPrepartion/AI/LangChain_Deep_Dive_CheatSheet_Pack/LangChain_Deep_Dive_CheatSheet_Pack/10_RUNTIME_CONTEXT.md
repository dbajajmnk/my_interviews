# Runtime Context

## Definition

Runtime context carries static invocation-scoped data and dependencies.

## Examples

- user ID;
- tenant ID;
- database connection;
- API client;
- permissions;
- environment configuration.

## Example

```python
from dataclasses import dataclass
from langchain.agents import create_agent

@dataclass
class Context:
    user_id: str

agent = create_agent(
    model="provider:model-name",
    tools=[],
    context_schema=Context,
)
```

## Why It Matters

Runtime context is a dependency-injection mechanism. It avoids hidden globals and makes tools/middleware more reusable and testable.
