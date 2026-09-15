# AI Architecture Interview Traps

1. LLM is not the architecture.
2. RAG is not a vector database.
3. Vector database is not automatically source of truth.
4. Fine-tuning is not a substitute for frequently changing knowledge.
5. Long context does not eliminate permission-aware retrieval.
6. Agent is not the same as workflow.
7. Multi-agent is not automatically better than single-agent.
8. Tool schema is not authorization.
9. Prompt is not policy enforcement.
10. Human approval must bind to the exact action.
11. Memory and RAG solve different problems.
12. More context can make answers worse.
13. Provider fallback must be behaviorally evaluated.
14. Retry on side-effecting tools requires idempotency.
15. Model gateway adds value only when shared concerns justify it.
16. RAG quality must be split into retrieval and generation metrics.
17. Citations can be wrong even when present.
18. Observability must include model, retrieval and tool layers.
19. Agent production readiness requires stop/time/cost limits.
20. AI security must assume external retrieved content is untrusted.
