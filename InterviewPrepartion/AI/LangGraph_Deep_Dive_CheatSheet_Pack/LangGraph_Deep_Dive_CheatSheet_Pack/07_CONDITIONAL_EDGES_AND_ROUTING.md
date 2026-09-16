# Conditional Edges and Routing

## Purpose

Conditional edges support branching based on current state.

## Example

```python
def route(state):
    if state["approved"]:
        return "execute"
    return "review"

builder.add_conditional_edges(
    "check",
    route,
    {
        "execute": "execute",
        "review": "review",
    }
)
```

## Use Cases

- model-based routing;
- success/failure;
- confidence threshold;
- retry/escalation;
- approval branching.

## Interview Point

> Conditional edges make control flow explicit and inspectable instead of burying branching inside large node functions.
