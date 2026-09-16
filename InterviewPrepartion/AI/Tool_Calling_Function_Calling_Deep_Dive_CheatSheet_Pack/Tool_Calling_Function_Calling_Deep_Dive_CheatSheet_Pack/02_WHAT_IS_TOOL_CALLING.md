# What Is Tool Calling?

## Definition

Tool calling allows a model to request that application code invoke a declared capability using structured arguments.

## Example

```text
User:
"Where is order A100?"

Model decides:
tool = get_order_status
arguments = {"order_id": "A100"}

Application:
validate → authorize → execute

Tool result:
{"status": "SHIPPED"}

Model:
"Order A100 has shipped."
```

## Why It Matters

Without tools, the model only has what is in its context.

Tools let it access:
- APIs;
- databases;
- search;
- calculators;
- ticketing;
- workflows;
- enterprise systems.

## Boundary

The model should never be treated as the authority that grants permission to execute the requested action.
