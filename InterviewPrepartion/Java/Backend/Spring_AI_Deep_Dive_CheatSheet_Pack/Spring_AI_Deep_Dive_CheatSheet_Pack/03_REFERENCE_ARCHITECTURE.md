# Spring AI Reference Architecture

```text
Client / API
     ↓
Spring Security / Tenant Context
     ↓
AI Application Service
     ↓
ChatClient
 ┌────┼───────────────┐
 ↓    ↓               ↓
Memory Advisors    RAG Advisors     ToolCallingAdvisor
      │               │               │
      ▼               ▼               ▼
ChatMemory       VectorStore       Tools / MCP
                      │
                EmbeddingModel
                      │
                      ▼
                  ChatModel
                      │
                      ▼
                AI Provider(s)

Cross-cutting:
Evaluation
Observability
Security
Rate limits
Cost controls
Prompt/version management
```
