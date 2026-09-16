# Scripted Model Responses

## Pattern

```text
Call 1 → tool_call(search, {"q":"x"})
Call 2 → final("done")
```

## Use

Verify:
- loop sequencing;
- tool execution;
- state update;
- finalization.

## Rule

Script the smallest response sequence needed for the behavior under test.
