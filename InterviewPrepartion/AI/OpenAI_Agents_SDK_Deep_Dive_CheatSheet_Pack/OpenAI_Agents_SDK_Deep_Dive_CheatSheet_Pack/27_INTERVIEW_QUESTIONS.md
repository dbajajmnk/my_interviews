# OpenAI Agents SDK — Interview Questions & Answers

## 1. What is the OpenAI Agents SDK?

A lightweight runtime for building agentic applications using agents, tools, handoffs, guardrails, sessions, HITL, and tracing.

## 2. Agent vs Runner?

Agent defines configuration/capabilities; Runner executes the workflow loop.

## 3. Agents SDK vs Responses API?

Responses API is lower-level. Agents SDK adds orchestration and runtime management around model calls.

## 4. What is a function tool?

A typed Python capability exposed to the model and executed by application/runtime code.

## 5. Handoff vs agent-as-tool?

Handoff transfers control to the specialist. Agent-as-tool delegates a subtask while the parent keeps control.

## 6. Why guardrails?

To validate inputs, outputs, and guarded tool invocations, with tripwire behavior when checks fail.

## 7. Session vs context?

Session stores conversation history across runs. Run context carries local app data/dependencies to tools/hooks during execution.

## 8. What does RunResult contain?

Final output plus run items, last agent, raw responses, state/input conversion helpers, and interruption information.

## 9. How does HITL work?

Sensitive tool calls surface interruptions; convert the result to RunState, approve/reject, then resume the original agent run.

## 10. What does tracing capture?

Model generations, tool calls, handoffs, guardrails, and custom workflow spans/events.

## 11. How is token usage tracked?

Usage is aggregated across model calls in the run context/result context wrapper.

## 12. How does MCP fit?

It exposes remote tool capabilities through a standard integration path, while app security and approvals still apply.

## 13. What are realtime agents?

Long-lived low-latency sessions for text/audio with tool use, interruptions, and continuous events.

## 14. How do you secure tool execution?

Least privilege, typed schemas, auth/authz outside the model, approval for risky actions, audit, and idempotency.

## 15. When would you not use the SDK?

When the workflow is simple and I explicitly want to own the loop/state/tool dispatch directly via the Responses API.

## 16. Can orchestration be deterministic?

Yes. The SDK can be combined with code-driven orchestration; not every step should be delegated to model reasoning.

## 17. One-line architecture principle?

> Let the SDK manage agent mechanics, but keep enterprise security and business invariants deterministic.
