# Agent Security — Interview Q&A

## 1. How do you secure tool calling?

Trusted authz, schema/business validation, risk tier, HITL, scoped credentials.

## 2. What is prompt injection?

Untrusted content trying to override or manipulate agent instructions.

## 3. Why isn't prompting enough?

The model is not a security boundary.

## 4. Authentication vs authorization?

Authentication proves identity; authorization decides allowed action.

## 5. How do you prevent cross-tenant leakage?

Trusted tenant context and enforcement across retrieval, memory, cache and tools.

## 6. What is indirect prompt injection?

Malicious instructions arriving through external content such as documents or webpages.

## 7. How do you secure memory?

Write policy, provenance, expiry, correction, tenant isolation.

## 8. How do you secure RAG?

Trusted ingestion, ACL filters, provenance and retrieval authorization.

## 9. When do you use HITL?

High-risk destructive, financial, legal, external or privileged actions.

## 10. How do you handle secrets?

Vault/identity on server side; never model-visible.

## 11. What is tool risk classification?

Grouping tools by impact to determine required controls.

## 12. How do you audit agent actions?

Identity, policy decision, action, args metadata, outcome, trace ID.

## 13. What is sandboxing for?

Isolating untrusted code/tool execution from trusted infrastructure.

## 14. What is enterprise governance?

Policies for models, tools, data, risk, release, monitoring and ownership.

## 15. One-line principle?

> The model can propose; trusted code must authorize and execute.
