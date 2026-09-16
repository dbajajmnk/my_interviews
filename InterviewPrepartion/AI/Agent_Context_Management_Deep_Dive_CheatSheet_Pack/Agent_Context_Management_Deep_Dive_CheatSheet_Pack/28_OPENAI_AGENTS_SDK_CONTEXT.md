# OpenAI Agents SDK — Context Management

## Two Context Classes

Current OpenAI Agents SDK documentation distinguishes:
1. local context available to your code;
2. context available to the LLM.

## Local Context

`RunContextWrapper[T]` carries the app-defined context object to:
- tools;
- hooks;
- callbacks;
- handoffs.

The context object itself is not automatically sent to the LLM.

## Useful Runtime Metadata

`RunContextWrapper` also exposes runtime-managed information such as:
- usage;
- tool input for nested agent-as-tool runs;
- approval state helpers.

`ToolContext` extends this with tool-call metadata.

## Sessions

Sessions preserve conversation history across runs. They solve conversation-memory continuity, while `RunContextWrapper` solves local application context/dependency injection.

## Security Detail

If resumable `RunState` is serialized, avoid placing secrets in app context because runtime state can be persisted or transmitted.
