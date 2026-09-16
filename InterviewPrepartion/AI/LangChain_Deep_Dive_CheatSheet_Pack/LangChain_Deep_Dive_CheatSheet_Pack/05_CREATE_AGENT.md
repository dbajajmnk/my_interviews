# create_agent — Core Agent API

## What

`create_agent` builds an agent loop that can invoke a model, call tools, maintain state, and stop when the model returns a final answer or execution reaches a configured limit.

## Minimal Example

```python
from langchain.agents import create_agent
from langchain.tools import tool

@tool
def get_order_status(order_id: str) -> str:
    # Return the order status for the supplied order id.
    return f"{order_id}: shipped"

agent = create_agent(
    model="provider:model-name",
    tools=[get_order_status],
)

result = agent.invoke({
    "messages": [
        {"role": "user", "content": "Check order A100"}
    ]
})
```

## What Happens Internally

```text
Message
  ↓
Model
  ↓
Tool call?
 ├─ No → Final response
 └─ Yes
      ↓
    Tool
      ↓
   Tool result
      ↓
    Model again
```

## Interview Point

> `create_agent` is not a one-shot chain. It provides an iterative agent runtime on top of LangGraph.
