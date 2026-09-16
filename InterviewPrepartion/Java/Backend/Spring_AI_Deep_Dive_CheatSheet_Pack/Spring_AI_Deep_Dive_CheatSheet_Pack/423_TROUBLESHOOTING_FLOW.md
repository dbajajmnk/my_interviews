# Spring AI Troubleshooting — Golden Flow

```text
1. ChatClient / Prompt
   ├─ correct system/user text?
   ├─ options?
   └─ prompt rendering?

2. Advisors
   ├─ order?
   ├─ memory conversation ID?
   ├─ RAG context?
   └─ tool calling?

3. Model Provider
   ├─ credentials?
   ├─ model exists?
   ├─ capability supported?
   ├─ 429 / timeout?
   └─ streaming errors?

4. RAG
   ├─ documents ingested?
   ├─ embeddings compatible?
   ├─ filter excludes everything?
   ├─ topK/threshold?
   └─ chunk quality?

5. Tools / MCP
   ├─ tool advertised?
   ├─ schema?
   ├─ authorization?
   ├─ transport?
   └─ loop limit?

6. Output
   ├─ structured schema?
   ├─ validation?
   └─ evaluator result?
```
