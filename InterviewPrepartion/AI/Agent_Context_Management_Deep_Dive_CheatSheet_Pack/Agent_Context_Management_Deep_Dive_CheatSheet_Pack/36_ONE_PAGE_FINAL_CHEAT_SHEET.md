# Agent Context Management — One-Page Final Cheat Sheet

## Formula

```text
Model Context =
Instructions
+ Current Input
+ Selected History
+ State
+ Relevant Memory
+ Retrieval
+ Tool Observations
- Irrelevant / Unauthorized / Stale Data
```

## Key Distinctions

- Runtime context = local trusted app data/dependencies
- Model context = information sent to LLM
- State = current execution
- Session = conversation continuity
- Short-term memory = thread working memory
- Long-term memory = durable cross-session information
- RAG = external knowledge retrieval
- Tool context = execution metadata

## Production Rules

1. More context is not automatically better.
2. Keep secrets outside model-visible context.
3. Separate state, session, and long-term memory.
4. Authorize retrieval and memory reads.
5. Track source and freshness.
6. Trim/summarize long histories.
7. Preserve output token headroom.
8. Isolate multi-agent and multi-tenant context.
9. Treat retrieved/tool content as untrusted.
10. Persist only context worth resuming or remembering.

## 30-Second Answer

> I treat context management as an explicit pipeline. Trusted runtime context carries identity and dependencies locally; conversation state and short-term memory preserve the current thread; long-term memory stores selected durable information; retrieval brings in authorized external knowledge; and a context builder ranks, trims, summarizes, redacts, and token-budgets these sources before each model call. The goal is the minimum relevant, fresh, authorized context needed for the next decision.
