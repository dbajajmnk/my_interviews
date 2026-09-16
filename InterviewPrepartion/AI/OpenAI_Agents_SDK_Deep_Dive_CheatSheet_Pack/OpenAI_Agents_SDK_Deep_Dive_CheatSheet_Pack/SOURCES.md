# Official Source Notes

## Official OpenAI Agents SDK Sources Used

This pack was cross-checked against current official OpenAI Agents SDK documentation covering:
- SDK overview
- Agents
- Runner / running agents
- Tools
- Agent orchestration
- Sessions
- Context management
- Results
- Human-in-the-loop
- Guardrails
- Tracing
- Usage
- Realtime agents

## Current Details Verified

Verified current concepts include:
- the SDK uses the Responses API by default for OpenAI models;
- core primitives include agents, agents-as-tools/handoffs, guardrails, sessions, HITL, and tracing;
- `Runner.run`, `run_sync`, and `run_streamed` provide core execution modes;
- session memory automatically loads/stores conversation history;
- local application context is exposed through `RunContextWrapper`;
- HITL surfaces tool approvals as run interruptions and resumes through `RunState`;
- tracing records model generations, tool calls, handoffs, guardrails, and custom events;
- realtime agents use `RealtimeAgent`, `RealtimeRunner`, `RealtimeSession`, and `RealtimeModel`.

## Currency Note

The Agents SDK is evolving rapidly. Verify exact imports, tool classes, and method signatures against the current official documentation before production coding.
