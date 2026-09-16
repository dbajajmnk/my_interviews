# TypeScript Idiomatic SDK Design

## Characteristics

- Promise;
- AsyncIterable;
- discriminated unions;
- AbortSignal;
- structural typing;
- runtime schema validators.

## Example

```ts
const result = await agent.run("Find my order", {
  context,
  signal
});
```

## Rule

Use discriminated unions for events/errors and pair TypeScript types with runtime validation.
