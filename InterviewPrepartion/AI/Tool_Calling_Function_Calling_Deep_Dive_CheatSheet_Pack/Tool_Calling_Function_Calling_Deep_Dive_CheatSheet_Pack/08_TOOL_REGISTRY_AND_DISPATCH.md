# Tool Registry and Dispatch

## Tool Registry

The registry maps approved tool names to executable handlers and metadata.

## Metadata

Possible metadata:
- schema;
- handler;
- read/write class;
- required permissions;
- timeout;
- retry policy;
- approval policy;
- version.

## Dispatch

```text
Tool call
 ↓
registry.find(name)
 ↓
validate
 ↓
authorize
 ↓
execute handler
```

## Design Principle

Never dispatch by arbitrary reflection or free-form method names supplied by the model.
