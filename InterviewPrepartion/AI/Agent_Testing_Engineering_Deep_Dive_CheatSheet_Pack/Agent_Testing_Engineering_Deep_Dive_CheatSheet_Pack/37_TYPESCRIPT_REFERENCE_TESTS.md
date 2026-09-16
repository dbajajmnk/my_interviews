# TypeScript Reference Tests

## Example

```ts
it("emits tool.started before tool.completed", async () => {
  const events = await collect(runWithFakeTool());
  const started = events.findIndex(e => e.type === "tool.started");
  const completed = events.findIndex(e => e.type === "tool.completed");

  expect(started).toBeLessThan(completed);
});
```
