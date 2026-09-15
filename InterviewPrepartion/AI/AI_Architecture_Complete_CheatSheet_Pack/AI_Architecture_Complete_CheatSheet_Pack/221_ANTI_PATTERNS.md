# AI Architecture Anti-Patterns

1. Client directly calls model provider with secret key.
2. One giant system prompt contains policy, data, memory and business rules.
3. Authorization delegated to the model.
4. Retrieve unauthorized content and ask model not to reveal it.
5. One vector database/index for unrelated domains without governance.
6. Every business process converted into an autonomous agent.
7. Agent given administrator credentials.
8. Unbounded agent loops.
9. Tool side effects without idempotency.
10. Prompt edits deployed without evaluation.
11. Model aliases changed without version traceability.
12. No separation between memory and authoritative knowledge.
13. Full conversation history sent forever.
14. Logging raw sensitive prompts/tool results.
15. Multi-agent architecture without measurable need.
16. Provider abstraction reduced to lowest-common-denominator too early.
17. RAG used to compensate for bad source data.
18. No rollback for prompt/index/tool changes.
19. Evaluation based only on demo examples.
20. Token cost optimized without business-quality metrics.
