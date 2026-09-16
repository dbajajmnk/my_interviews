# State vs Memory vs Context

## Comparison

| Concept | Main Question |
|---|---|
| Context | What information is available now? |
| State | Where are we in execution? |
| Memory | What should persist for later? |

## Example

```text
State:
current_step = "approval"

Memory:
user_prefers_email = true

Context:
selected policy + current state + relevant memory
```

## Interview Point

> Context is assembled from state, memory, retrieval, instructions, and current input; it is not synonymous with any one of them.
