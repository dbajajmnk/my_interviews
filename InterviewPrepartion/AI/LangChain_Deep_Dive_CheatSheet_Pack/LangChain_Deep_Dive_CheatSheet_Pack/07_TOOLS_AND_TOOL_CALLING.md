# Tools and Tool Calling

## Tool Mental Model

A tool is a callable capability exposed to the model with a schema and description.

## Basic Tool

```python
from langchain.tools import tool

@tool
def search_customer(email: str) -> str:
    # Find a customer by email.
    return "customer_123"
```

## What the Model Does

The model chooses:
- whether to call a tool;
- which tool;
- input arguments.

Application/runtime code executes the tool.

## Production Requirements

- schema validation;
- auth/authz;
- allowlisted tools;
- timeout;
- retry policy;
- idempotency;
- audit.

## Strong Interview Phrase

> Tool calling is model-driven action selection, not permission to execute arbitrary application code.
