# Agent Context Management — Production Architecture

## Reference Architecture

```text
Client
  │
Auth / Tenant Resolution
  │
Agent Service
  │
Context Builder
 ├─ Instructions
 ├─ Conversation Store
 ├─ State Store
 ├─ Memory Store
 ├─ Retriever
 ├─ Tool Observations
 └─ Context Policy
      │
      ▼
Rank / Trim / Summarize / Redact
      │
      ▼
Model Context
      │
      ▼
LLM / Agent Runtime
```

## Production Checklist

- tenant isolation;
- durable session state;
- memory retention policy;
- retrieval authorization;
- token budgeting;
- provenance;
- freshness;
- redaction;
- context observability;
- resume/versioning.
