# OpenAI Agents SDK — 30-Second Recall

## Recall

```text
Agent = model + instructions + tools + handoffs + guardrails
Runner = execution loop
Session = conversation memory
Context = local app dependencies/state
Handoff = transfer control to another agent
Agent-as-tool = delegate without transferring ownership
Tracing = built in
HITL = pause on tool approval
```

## 30-Second Interview Answer

> The OpenAI Agents SDK is a lightweight agent runtime built around a small set of primitives: agents, tools, handoffs, guardrails, sessions, and tracing. I define an Agent with instructions and capabilities, then Runner manages the loop, tool execution, handoffs, and final result. I use sessions for working conversation memory, RunContextWrapper for local application context, human approval for sensitive tools, and built-in tracing to observe the full workflow.

## Do Not Forget

- OpenAI models use the Responses API by default underneath the SDK.
- The SDK manages the loop; Responses API alone leaves more orchestration to you.
- Handoff transfers control; agent-as-tool does not.
- Session memory and local run context solve different problems.
- Guardrails are validation mechanisms, not a replacement for auth/authz.
