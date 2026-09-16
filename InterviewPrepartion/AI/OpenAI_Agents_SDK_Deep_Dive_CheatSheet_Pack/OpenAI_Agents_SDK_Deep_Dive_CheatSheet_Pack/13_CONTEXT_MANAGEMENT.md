# Context Management

## Two Meanings of Context

The SDK distinguishes:
1. local context available to application code;
2. context visible to the model.

## Local Context

Local context is passed through `RunContextWrapper[T]`.

It can provide tools/hooks access to:
- app dependencies;
- user/tenant data;
- usage metadata;
- approval state.

## Conceptual Example

```python
from dataclasses import dataclass

@dataclass
class AppContext:
    user_id: str
    tenant_id: str
```

## Model Context

The model sees the conversation/input/instructions/tool outputs you include—not arbitrary application objects unless you deliberately surface them.

## Enterprise Rule

Do not place secrets into context that may later be serialized or transmitted with resumable run state.
