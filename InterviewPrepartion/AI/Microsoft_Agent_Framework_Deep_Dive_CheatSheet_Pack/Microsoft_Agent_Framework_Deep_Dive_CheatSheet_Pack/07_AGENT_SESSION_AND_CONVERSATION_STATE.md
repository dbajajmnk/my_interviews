# AgentSession and Conversation State

## Purpose

`AgentSession` carries conversation state across multiple agent runs.

## Mental Model

```text
Run 1 ─┐
Run 2 ─┼─ AgentSession
Run 3 ─┘
```

## Use Cases

- multi-turn chat;
- tool-calling continuity;
- harness planning/todo state;
- persisted conversation state.

## Production Rule

Do not rely on process-local session storage in a scaled deployment. Use durable session storage when continuity must survive restarts or multiple instances.
