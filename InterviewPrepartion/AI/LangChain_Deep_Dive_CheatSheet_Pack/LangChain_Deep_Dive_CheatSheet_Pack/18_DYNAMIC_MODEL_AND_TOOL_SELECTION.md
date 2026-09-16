# Dynamic Model and Tool Selection

## Dynamic Model

Middleware can choose a model at runtime based on:
- cost;
- complexity;
- tenant policy;
- latency;
- task type.

## Dynamic Tools

Tool availability can also be scoped dynamically based on:
- user permissions;
- task phase;
- risk level;
- organization.

## Architecture Rule

Routing is not authorization.

Even if a tool is not shown to the model, the execution layer must still enforce access.
