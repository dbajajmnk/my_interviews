# Tool Calling — One-Page Final Cheat Sheet

## Formula

```text
Tool Calling =
Tool Schema
+ Model Selection
+ Arguments
+ Validation
+ Auth/AuthZ
+ Policy
+ Approval
+ Execution
+ Result
+ Audit
```

## Key Distinctions

- Tool calling = model requests external capability
- Structured output = model returns typed data
- Function calling = one type of tool calling
- Tool registry = approved capability map
- Execution context = trusted runtime data
- MCP = remote tool connectivity standard

## Production Rules

1. The model never grants itself permission.
2. Keep trusted identity outside model arguments.
3. Use narrow schemas.
4. Validate business invariants.
5. Treat tool output as untrusted.
6. Require idempotency for retriable writes.
7. Use HITL for high-risk actions.
8. Bound loops/retries/timeouts.
9. Audit every sensitive tool call.
10. Version tool contracts like APIs.

## 30-Second Answer

> Tool calling is the bridge between model reasoning and real application actions. The model selects a declared capability and generates structured arguments, but the platform validates the schema, applies business rules and authorization, optionally asks for approval, executes the tool with trusted runtime context, records telemetry and audit data, and returns the result to the model for the next step.
