# Tool Call Streaming

## Useful Tool Events

- tool.requested
- tool.started
- tool.progress
- tool.completed
- tool.failed

## UI Example

```text
Searching customer...
Found customer.
Checking order...
Order found.
Generating answer...
```

## Rule

Do not expose sensitive raw tool arguments/results blindly to end users.
