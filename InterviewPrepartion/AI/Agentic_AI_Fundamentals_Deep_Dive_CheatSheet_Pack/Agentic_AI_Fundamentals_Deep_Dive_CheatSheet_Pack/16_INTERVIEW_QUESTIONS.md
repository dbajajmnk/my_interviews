# Agentic AI — Interview Questions & Answers

## 1. What is Agentic AI?

Agentic AI refers to systems where a model participates in deciding and executing multi-step actions. The system maintains context/state, uses approved tools, observes results, and continues until a goal or stop condition is reached.

## 2. What makes an agent different from a chatbot?

A chatbot focuses on conversation. An agent has an action loop and can dynamically choose tools or next steps based on observations.

## 3. Workflow vs Agent?

A workflow has a primarily predefined path. An agent can choose the next action dynamically. In enterprise systems, a hybrid is often best.

## 4. What are the core components of an agent?

Model, instructions, context, state, tools, optional memory, guardrails, telemetry, and termination logic.

## 5. What is tool calling?

The model produces a structured request to invoke a capability. Application code validates authorization/schema and executes the tool.

## 6. What is agent state?

Execution-scoped information such as current step, previous tool outputs, retries, and approval status.

## 7. What is agent memory?

Information intentionally retained for future interactions, such as useful user preferences, summaries, or long-lived task context.

## 8. RAG vs memory?

RAG retrieves external knowledge. Memory preserves useful historical context.

## 9. When should we not use agents?

When business logic is deterministic, highly regulated, low-latency, or easily expressed as normal code/workflows.

## 10. How do you prevent infinite loops?

Use max steps, timeouts, cost budgets, repeated-action detection, explicit failure states, and observability.

## 11. How do you secure tools?

Allowlist them, enforce authentication/authorization outside the model, validate schemas, use least privilege, audit every call, and require approval for sensitive writes.

## 12. Why not rely only on prompt guardrails?

Prompts are not enforceable security boundaries. Critical rules must exist in application and policy layers.

## 13. Single vs multi-agent?

Start with a single agent. Use multiple agents when specialization, isolation, independent permissions, or parallel work justifies the complexity.

## 14. What is HITL?

A control point where the agent proposes an action but a human must approve, reject, or modify it before execution.

## 15. How do you measure an agent?

Task success, tool correctness, policy compliance, latency, cost, retrieval quality, escalation rate, and safety failures.

## 16. How would you make an agent provider-neutral?

Put model access behind an interface or gateway and keep business logic dependent on internal contracts rather than one vendor SDK.

## 17. What should be traced?

Agent run, model calls, retrieval, tool calls, retries, guardrail events, latency, tokens, errors, and final outcome.

## 18. What is the safest default for tools?

Read-only, least privilege, bounded parameters, explicit schemas, and no sensitive write without approval.

## 19. What changes when moving from PoC to production?

Identity, authorization, privacy, observability, evaluation, versioning, cost control, SLAs, failure handling, audit, and operational ownership become mandatory.

## 20. Best one-line design principle?

> Use agentic reasoning only where ambiguity exists; keep execution, policy, security, and audit deterministic.
