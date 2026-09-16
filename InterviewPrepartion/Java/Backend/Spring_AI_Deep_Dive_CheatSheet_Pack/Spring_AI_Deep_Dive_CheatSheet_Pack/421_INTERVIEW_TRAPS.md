# Spring AI Interview Traps

1. Spring AI is not an LLM itself.
2. ChatClient and ChatModel are different abstraction levels.
3. Provider portability does not imply identical provider behavior.
4. Runtime ChatOptions can override startup defaults.
5. Structured output is not the same as tool calling.
6. Typed output does not guarantee business correctness.
7. Advisor ordering changes behavior.
8. Chat memory and RAG solve different problems.
9. Conversation ID must be scoped per user/session when memory is used.
10. RAG quality depends heavily on ingestion/chunking/filtering, not only LLM quality.
11. Tenant filters must be applied before retrieved data enters model context.
12. VectorStoreRetriever is intentionally read-only.
13. Tool schema validation is not authorization.
14. `ToolCallingAdvisor` is auto-registered in current ChatClient unless disabled.
15. Per-call tools append to default tools.
16. Destructive tools should not normally be default tools.
17. Tool loops must have time/step/cost limits.
18. MCP is a protocol boundary; ToolCallback is a local Java abstraction.
19. MCP servers must be treated as external trust boundaries.
20. Prompt injection can arrive through RAG, tools and MCP resources.
21. Spring AI evaluation utilities are not a replacement for human validation on high-stakes use cases.
22. Observability must not leak raw prompts/tokens/PII.
23. Changing embedding model commonly requires reindexing vectors.
24. Similarity threshold/topK are workload-specific, not universal constants.
25. Provider model switch requires regression evaluation.
26. Streaming may emit partial output before an error occurs.
27. Blocking ChatClient calls in WebFlux request threads must be isolated or use streaming/reactive support appropriately.
28. RAG and fine-tuning are complementary, not interchangeable.
29. A vector database is not the application's source of truth by default.
30. Cost/latency are architecture requirements, not post-production optimizations.
