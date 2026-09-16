# Spring AI 2.0.1 — Current Baseline

## Release
**Spring AI 2.0.1** is the current latest release baseline used by this pack.

Release date:
```text
August 21, 2026
```

## Core 2.0.1 Capabilities
- Model API
- ChatModel / StreamingChatModel
- ChatClient
- Structured output
- Advisors
- Chat memory
- Tool calling
- MCP client/server integration
- Embeddings
- VectorStore and VectorStoreRetriever
- Modular RAG
- ETL document ingestion
- Evaluation
- Observability
- Image/audio/transcription/speech APIs
- Spring Boot auto-configuration/starters

## Important 2.0-era Behavior
- `ToolCallingAdvisor` is auto-registered by ChatClient unless explicitly disabled.
- Runtime-injected tools can participate in the same tool-calling loop.
- Per-call `.tools(...)` appends to default tools.
- Risky/destructive tools should not normally be exposed as global defaults.
- Conversation ID must be supplied for memory-advisor calls that require it.
- `VectorStoreRetriever` provides a read-only least-privilege retrieval surface.
