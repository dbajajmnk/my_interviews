# Semantic Parity vs API Shape

## Semantic Parity

The same operation means the same thing everywhere.

## API Shape

Language-specific syntax can differ.

## Example

```text
Python       → await agent.run(...)
Java         → agent.runAsync(...): CompletionStage<Result>
C#           → await agent.RunAsync(...)
TypeScript   → await agent.run(...)
```

## Rule

Preserve behavior, not superficial syntax.
