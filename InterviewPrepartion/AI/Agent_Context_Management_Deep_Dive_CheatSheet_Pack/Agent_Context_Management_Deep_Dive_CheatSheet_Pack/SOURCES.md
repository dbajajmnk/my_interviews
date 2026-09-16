# Source Notes

## OpenAI Agents SDK

Verified against current OpenAI Agents SDK documentation:
- local context vs model-visible context;
- `RunContextWrapper[T]`;
- `ToolContext`;
- context passed to tools/hooks/handoffs;
- context object is not automatically sent to the LLM;
- sessions preserve conversation history across runs;
- serialization caveats for resumable run state.

## LangChain / LangGraph

Verified against current LangChain/LangGraph material:
- short-term memory is stored in graph state and persisted with checkpointers;
- checkpointers are thread-scoped;
- stores support long-term, cross-thread memory;
- runtime context can carry invocation data such as user identity.

## Microsoft Agent Framework

Verified against current Microsoft Agent Framework agent concepts:
- agents combine model/remote connection, instructions, tools, middleware, context providers, and session state;
- context providers are part of the agent information/memory pipeline.

## Currency Note

Framework context APIs evolve quickly. Verify exact types, storage adapters, and method signatures in current official documentation before production implementation.
