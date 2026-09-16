# OpenAI Agents SDK — 60-Second Recall

## Formula

```text
Agent + Runner + Tools + Handoffs + Guardrails + Sessions + HITL + Tracing
```

## 60-Second Answer

> The OpenAI Agents SDK separates agent configuration from the runner loop. It supports tools, handoffs, guardrails, sessions, context, human approval, and tracing. I distinguish handoff from agent-as-tool: handoff transfers control, while agent-as-tool delegates work under the parent agent's control.

## Recall Points

- Agent != Runner.
- Sessions store conversation state.
- HITL must preserve state.
- Tracing is built in.
