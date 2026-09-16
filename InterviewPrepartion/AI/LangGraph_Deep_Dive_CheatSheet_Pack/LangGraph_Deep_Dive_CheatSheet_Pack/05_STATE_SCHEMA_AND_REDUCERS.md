# State Schema and Reducers

## State

State defines the data shared across nodes.

## Partial Updates

Nodes return only the fields they change.

```python
def node(state):
    return {"status": "done"}
```

## Reducers

Reducers define how multiple updates to the same state key are combined.

## Example

```python
import operator
from typing import Annotated
from typing_extensions import TypedDict

class State(TypedDict):
    messages: Annotated[list[str], operator.add]
```

## Why Reducers Matter

Reducers are essential when parallel branches write to the same key.

Without a valid reducer strategy, concurrent writes may conflict.
