# Agentic AI — One-Page Final Cheat Sheet

## Definition

**Agentic AI = model-driven decision + controlled action loop.**

## Formula

```text
Agent =
Model
+ Instructions
+ Context
+ State
+ Tools
+ Memory(optional)
+ Guardrails
+ Telemetry
```

## Loop

```text
Goal → Decide → Validate → Act → Observe → Update → Repeat/Stop
```

## Key Distinctions

- **LLM:** generates.
- **Chatbot:** converses.
- **Workflow:** follows predefined path.
- **Agent:** dynamically chooses next action.
- **RAG:** external knowledge.
- **State:** current execution.
- **Memory:** retained historical context.

## Enterprise Rules

1. Model proposes; application executes.
2. Auth/authz never belongs only in prompt text.
3. Tool schemas must be validated.
4. Default to least privilege/read-only.
5. Use max steps/timeouts/cost limits.
6. Add HITL for high-risk actions.
7. Trace the full run.
8. Evaluate task success, not just wording.
9. Start single-agent.
10. Keep deterministic code where rules are known.

## 30-Second Answer

> An enterprise AI agent is a controlled runtime where a model can decide the next step, invoke approved tools, observe results, maintain state, and continue until a goal or stop condition is reached. I would keep security, authorization, validation, human approval, cost controls, and observability outside the model so that the system remains governable and production-safe.

## Final Interview Reminder

Do not sell “autonomy.”

Sell **controlled decision-making + enterprise engineering**.
