# Agent Testing — Interview Q&A

## 1. How do you unit test an agent?

Fake the model and tools; test routing/state/policies deterministically.

## 2. Why fake models?

To make agent loop tests repeatable and cheap.

## 3. What should contract tests verify?

Tool/retriever schemas, outputs, errors, and compatibility.

## 4. How do you test LangGraph?

Test nodes, reducers, routing, checkpoints, interrupts, and resume independently.

## 5. How do you test tool calling?

Expected tool, arguments, authorization, approval, and failure recovery.

## 6. How do you test memory?

Write/read/expiry/update/delete plus tenant isolation.

## 7. How do you test RAG?

Retriever correctness, context assembly, then end-to-end grounded answer separately.

## 8. How do you test streaming?

Event order, cancellation, disconnect, resume, duplicate handling, terminal state.

## 9. Why test idempotency?

Retries and resumes can repeat writes.

## 10. What is failure injection?

Deliberately making model/tool/dependency calls fail to verify recovery.

## 11. How do you regression test prompt/model changes?

Run golden datasets and compare success, safety, latency, cost, and traces.

## 12. How do tests differ from evals?

Tests assert deterministic invariants; evals score probabilistic quality. Mature systems need both.

## 13. What goes in CI?

Fast unit/contract/workflow tests plus targeted agent regression and safety gates.

## 14. What is production validation?

Canary/shadow rollout with live metrics and rollback thresholds.

## 15. One-line principle?

> Make the agent runtime deterministic wherever engineering correctness requires it.
