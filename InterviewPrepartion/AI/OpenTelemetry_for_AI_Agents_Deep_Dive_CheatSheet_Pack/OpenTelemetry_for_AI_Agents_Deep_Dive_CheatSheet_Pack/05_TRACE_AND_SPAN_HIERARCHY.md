# Trace and Span Hierarchy

## Example

```text
support_agent_request
 ├─ invoke_agent
 │   ├─ model_call
 │   ├─ retrieve_kb
 │   ├─ execute_tool
 │   └─ model_call
 └─ persist_session
```

## Why Hierarchy Matters

It reveals:
- ownership;
- timing;
- nesting;
- dependencies;
- failure origin.
