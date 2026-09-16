# Tool Calling — 30-Second Recall

## Recall

```text
Tool Calling =
Model chooses capability
+ generates arguments
+ app validates
+ app authorizes
+ app executes
+ app returns result
+ model continues
```

## 30-Second Interview Answer

> Tool calling lets an LLM select an approved application capability and generate structured arguments for it. The model does not directly execute business code. The application validates the schema, checks authorization and policy, optionally requests approval, executes the tool, records telemetry, and returns the result to the model for the next step.

## Do Not Forget

- Tool calling is action selection, not raw code execution.
- Tool schema quality directly affects reliability.
- Authorization happens outside the model.
- Write tools require idempotency and stronger controls.
- Tool results are untrusted external data.
- Parallel calls are useful only when actions are independent.
