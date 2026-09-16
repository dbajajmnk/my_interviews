# Agentic AI — 30-Second Recall

## Recall

```text
AGENT = Model + Instructions + Context + State + Tools
        + Memory(optional) + Guardrails + Observability

Loop:
Goal → Decide → Act → Observe → Update State → Repeat/Stop
```

**Key difference:** a normal LLM generates. An agent can **choose and execute actions** through controlled tools.

**Enterprise rule:** autonomy must be bounded by authentication, authorization, validation, observability, budgets, retries, and human approval where risk is high.

## 30-Second Interview Answer

> Agentic AI extends an LLM from pure response generation into a controlled execution loop. The agent receives a goal and context, decides what action is needed, invokes approved tools or services, observes the result, updates state, and continues until a termination condition is reached. In enterprise systems I would keep that loop bounded with security, schema validation, retries, cost limits, tracing, evaluation, and human approval for sensitive actions.

## Do Not Forget

- RAG is **knowledge grounding**, not memory.
- Memory is **continuity/state across interactions**.
- A workflow is not automatically an agent.
- Multi-agent is not automatically better.
- Tool execution should happen in application code, not inside the model itself.
- Prefer deterministic workflows when the process is known.
