# Spring AI — 30-Second Recall

```text
Application
   ↓
ChatClient
 ├─ Prompt
 ├─ Advisors
 │   ├─ Memory
 │   ├─ RAG
 │   └─ ToolCalling
 ├─ Tools / MCP
 └─ ChatModel
      ↓
   AI Provider
```

## RAG
```text
Documents
→ Reader
→ Splitter/Transformer
→ EmbeddingModel
→ VectorStore

Question
→ Retriever
→ Context
→ ChatModel
→ Grounded Answer
```

## Core APIs
```text
ChatModel
ChatClient
Advisor
ToolCallback / @Tool
EmbeddingModel
VectorStore
ChatMemory
Evaluator
MCP
```
