# Human in the Loop

## Purpose

Sensitive tool calls can pause until a human approves or rejects them.

## Flow

```text
Model requests tool
       ↓
Approval required?
       ↓ yes
RunResult.interruptions
       ↓
result.to_state()
       ↓
state.approve(...) / state.reject(...)
       ↓
Runner.run(original_agent, state)
```

## Important Behavior

Approvals can surface from:
- the current agent;
- an agent after handoff;
- a nested agent-as-tool execution.

The interruption can be handled at the outer/original run.

## Enterprise Use Cases

- deleting data;
- sending external communication;
- financial changes;
- production operations;
- privileged tools.
