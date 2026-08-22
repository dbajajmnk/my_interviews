# FS-03 / File 06 — React + Python + AI Full-Stack System Design

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** M19 + M21 Architecture

---

# 1. Objective

Integrate frontend, Python backend, and AI into one defendable design.

Focus:

- UI/API boundaries;
- streaming;
- long-running AI jobs;
- citations;
- cancellation;
- retries;
- auth;
- caching;
- observability;
- failure UX;
- scalability.

---

# 2. 5W+H

## What?

An AI full-stack application combines interactive UI with backend orchestration and slow/streaming AI services.

## Why?

AI changes normal web behavior because responses may:

- take seconds/minutes;
- stream incrementally;
- fail partially;
- incur cost;
- require citations/evaluation.

## Where?

RAG search, AI copilots, document processing, assistants.

## When?

For role-specific architect questions.

## How?

Keep browser thin/trusted appropriately, backend owns AI credentials/policy, and long-running work is bounded/observable.

---

# 3. Real-Life Analogy

The React UI is the customer desk.

The Python backend is the operations team.

The LLM/vector systems are specialist external departments.

The customer desk should never receive master keys to specialist systems.

---

# 4. Visualization

```text
React Client
   │
   │ HTTPS
   ▼
Python API
   ├── Auth / Policy
   ├── Conversation / Request Service
   ├── Retriever
   ├── LLM Provider
   └── Observability
         │
         ├── Metadata DB
         ├── Vector Store
         └── Cache

Streaming response:
Python API ─────► React UI
```

---

# 5. Mind Map

```text
AI Full Stack
│
├── React
│   ├── prompt
│   ├── stream UI
│   └── citations
├── Python API
│   ├── auth
│   ├── retrieval
│   ├── model call
│   └── policy
├── Data
│   ├── relational
│   ├── vector
│   └── object store
└── Production
    ├── timeout
    ├── cancel
    ├── quota
    └── observability
```

---

# 6. Core Concepts

## 6.1 Never Put LLM Secret in Browser

Browser calls Python backend.

Backend owns:

- provider credential;
- model routing;
- quotas;
- safety/policy;
- logging;
- cost controls.

---

## 6.2 Streaming

Options may include:

- Server-Sent Events;
- streaming HTTP/fetch;
- WebSocket for bidirectional real-time needs.

Choose simplest protocol that matches requirement.

For one-way token streaming, full WebSocket may be unnecessary.

---

## 6.3 UI Streaming State

Possible:

```text
idle
submitting
streaming
complete
cancelled
error
```

Render partial response progressively.

---

## 6.4 Cancellation

User clicks Stop.

Frontend cancels connection/request.

Backend should propagate cancellation to model/provider when feasible to reduce cost.

---

## 6.5 Citations

Backend should return structured citation metadata, not force frontend to parse citation text heuristically.

Example:

```json
{
  "answerChunk": "...",
  "citations": [
    {
      "documentId": "d1",
      "title": "Policy",
      "page": 4
    }
  ]
}
```

---

## 6.6 Long-Running AI Jobs

For minutes-long document processing:

```text
POST /documents
→ jobId

GET /jobs/{jobId}
```

or push updates.

Do not keep fragile HTTP request open for multi-minute background pipeline unnecessarily.

---

# 7. Engineering Depth

## 7.1 AI Failure UX

Distinguish:

- network failure;
- rate limit;
- retrieval failure;
- model timeout;
- unsafe/blocked result;
- partial stream;
- job failed.

User message should be safe and actionable; internal diagnostics belong in logs/traces.

---

## 7.2 Conversation State

Decide where conversation lives:

- browser-only?
- backend DB?
- short-lived cache?

For multi-device/history, backend persistence likely needed.

Do not let huge conversation history grow unbounded into each model prompt.

---

## 7.3 Full-Stack Observability

Correlate:

```text
frontend request ID
→ API trace
→ retrieval span
→ LLM span
→ response
```

Metrics:

- time to first token;
- total generation latency;
- model errors;
- cancellation;
- token/cost;
- retrieval latency.

---

# 8. Implementation / Design

```text
React Chat
  ↓ POST /chat/stream
Python API
  ↓
Authorize
  ↓
Retrieve context
  ↓
Call LLM
  ↓
Stream answer + citation events
  ↓
React renders progressively
```

---

# 9. Hands-On Practice

Design UI/backend behavior for:

1. LLM 429;
2. user cancels;
3. retrieval succeeds but model fails;
4. model streams half answer then disconnects;
5. same user opens two tabs.

---

# 10. Google Interview Drill

## Problem — Design Enterprise RAG Chat

Requirements:

- React UI;
- Python backend;
- enterprise documents;
- citations;
- streaming;
- 2,000 concurrent users;
- tenant isolation.

### Clarify

- auth provider?
- document ACL?
- history?
- latency SLO?
- model quota?
- data residency?
- feedback?

### First Design

```text
React
 ↓
Python API
 ↓
Vector search
 ↓
LLM
```

### Improve

```text
React
 ↓
Gateway/Auth
 ↓
Python Chat API
 ├── tenant/ACL filter
 ├── retriever
 ├── reranker optional
 ├── prompt builder
 ├── model adapter
 └── stream formatter
       ↓
React

Stores:
Relational metadata/ACL
Vector index
Object store
Cache as justified
```

### Production Controls

- concurrency limit;
- timeout;
- cancellation;
- rate limit;
- citations;
- tracing;
- cost metrics.

### Edge Cases

- cross-tenant retrieval;
- stale index;
- provider outage;
- partial stream;
- client reconnect;
- deleted document citation.

### Trade-Off

Do not send vector DB or LLM credentials to client.

Do not trust frontend tenant filter.

---

# 11. Common Mistakes

1. LLM key in browser.
2. Frontend enforces tenant security.
3. No streaming cancellation.
4. Unbounded prompt/history.
5. No citation structure.
6. WebSocket chosen automatically.
7. No failure UX.
8. No cost/concurrency controls.
9. No trace correlation.

---

# 12. Best Practices

- backend owns AI credentials/policy;
- enforce ACL in backend retrieval;
- stream with simplest protocol;
- propagate cancellation;
- structured citations;
- bounded model concurrency;
- observable request chain;
- explicit failure states.

---

# 13. Interview Questions

1. How connect React to Python AI backend?
2. Where store LLM key?
3. SSE vs WebSocket?
4. How stream tokens?
5. How cancel generation?
6. How represent citations?
7. How enforce tenant ACL?
8. How store chat history?
9. What AI frontend metrics matter?
10. How handle provider outage?

---

# 14. Google-Level Follow-Ups

1. reconnect stream?
2. duplicate request?
3. model fallback?
4. document deletion?
5. prompt injection?
6. cache AI result?
7. 10k concurrent users?
8. multi-region?
9. feedback loop?
10. evaluation telemetry?

---

# 15. Quick Revision

```text
Browser → Python backend → AI services
Secrets stay server-side
Backend enforces tenant/ACL
Stream one-way with simplest fitting protocol
Cancel downstream work when user cancels
Structured citations
Bound model concurrency
Trace frontend → retrieval → model
```

---

# 16. Readiness Gate

- [ ] Secret boundary.
- [ ] Streaming choice.
- [ ] Cancellation.
- [ ] Citations.
- [ ] Long job.
- [ ] Tenant ACL.
- [ ] Observability.
- [ ] Enterprise RAG design.

**Gate:** READY / REPAIR

---

# 17. References

- React official documentation
- MDN streaming/network APIs
- OWASP guidance
