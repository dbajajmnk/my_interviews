# StateGraph Basics

## Definition

`StateGraph` is the main graph builder. Nodes read shared state and return partial state updates.

## Minimal Example

```python
from typing_extensions import TypedDict
from langgraph.graph import StateGraph, START, END

class State(TypedDict):
    text: str

def uppercase(state: State):
    return {"text": state["text"].upper()}

builder = StateGraph(State)
builder.add_node("uppercase", uppercase)
builder.add_edge(START, "uppercase")
builder.add_edge("uppercase", END)

graph = builder.compile()

result = graph.invoke({"text": "hello"})
```

## Important

A `StateGraph` must be compiled before execution.

The compiled graph can be invoked, streamed, batched, or called asynchronously.
