# Python Idiomatic SDK Design

## Characteristics

- async/await;
- context managers;
- decorators;
- dataclasses/Pydantic;
- iterators/async iterators;
- exceptions.

## Example

```python
agent = Agent(
    name="support",
    tools=[search_tool],
)

result = await agent.run(
    "Find my order",
    context=ctx,
)
```

## Rule

Prefer simplicity and explicit typing without making Python feel like Java.
