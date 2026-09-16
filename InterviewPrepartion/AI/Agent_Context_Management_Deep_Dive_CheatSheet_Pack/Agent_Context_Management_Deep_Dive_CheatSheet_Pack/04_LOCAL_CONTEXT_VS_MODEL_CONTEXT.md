# Local Context vs Model Context

## Local Context

Data available to application code, tools, hooks, middleware, and runtime services.

## Examples

- database client;
- authenticated user;
- tenant ID;
- secret manager;
- logger;
- trace context.

## Model Context

Information actually sent to the LLM:
- instructions;
- messages;
- retrieved content;
- selected memories;
- tool outputs.

## Rule

> Just because the runtime knows something does not mean the model should see it.
