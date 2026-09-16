# OpenAI Agents SDK — One-Page Final Cheat Sheet

## Formula

```text
OpenAI Agents SDK =
Agent
+ Runner
+ Tools
+ Handoffs
+ Guardrails
+ Sessions
+ Context
+ HITL
+ Tracing
```

## Key Distinctions

- Agent = configuration/capabilities
- Runner = loop/execution
- Handoff = transfer control
- Agent-as-tool = delegate while retaining control
- Session = conversation memory
- Run context = local runtime dependencies/state
- Guardrail = validation/tripwire
- RunResult = output + run evidence/state
- Tracing = workflow observability

## Production Rules

1. Keep auth/authz outside model reasoning.
2. Use least-privilege tools.
3. Require approval for high-risk writes.
4. Make write tools idempotent.
5. Separate session memory from local app context.
6. Treat model output as untrusted.
7. Use tracing with redaction/governance.
8. Track tokens and cost.
9. Test handoffs and approvals, not only final text.
10. Use durable workflow infrastructure for genuinely long-running work.

## 30-Second Answer

> The OpenAI Agents SDK gives me a small set of agent-runtime primitives. I configure Agents with instructions, tools, handoffs, and guardrails; Runner manages the execution loop; sessions preserve conversation memory; RunContextWrapper carries application context; interruptions and RunState support human approval; and built-in tracing provides end-to-end observability. I still keep identity, authorization, idempotency, and business invariants in deterministic application layers.
