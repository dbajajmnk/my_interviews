# LangChain / LangGraph — Context Management

## Three-Layer Model

A useful LangChain/LangGraph distinction is:
- runtime context;
- thread-scoped graph state;
- cross-thread store.

## Short-Term Memory

Current LangChain agent memory stores thread-level context in graph state and persists it using a checkpointer.

## Long-Term Memory

LangGraph stores persist application-defined information across threads, such as preferences or facts.

## Runtime Context

Nodes/tools can access invocation context such as `user_id` without placing it directly in graph messages.

## Production Rule

Use persistent checkpointers/stores rather than in-memory implementations when state must survive restarts.
