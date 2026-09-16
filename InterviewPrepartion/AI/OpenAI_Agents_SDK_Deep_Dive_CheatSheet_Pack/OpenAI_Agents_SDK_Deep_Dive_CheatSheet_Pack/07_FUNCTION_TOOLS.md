# Function Tools

## Purpose

Function tools convert Python functions into typed agent capabilities.

## Example

```python
from agents import function_tool

@function_tool
def get_order_status(order_id: str) -> str:
    """Return the status of an order."""
    return f"{order_id}: shipped"
```

## Why Useful

The SDK can derive schema from Python type information and use validation around tool inputs.

## Production Rules

- keep tool intent narrow;
- validate inputs;
- use least-privilege credentials;
- time-bound execution;
- make writes idempotent;
- audit tool calls.

## Key Interview Phrase

> A function tool is a controlled capability exposed to the model, not arbitrary code execution.
