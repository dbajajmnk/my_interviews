# Agent Context Management — Interview Q&A

## 1. What is context management?

The process of selecting, filtering, persisting, retrieving, and supplying the information an agent needs for each decision.

## 2. Runtime context vs model context?

Runtime context is local application data/dependencies. Model context is what is actually sent to the LLM.

## 3. State vs memory?

State tracks current execution; memory retains information for future usefulness.

## 4. RAG vs memory?

RAG retrieves external knowledge; memory stores retained historical information.

## 5. Why is more context not always better?

It increases cost, latency, distraction, privacy exposure, and stale/conflicting information.

## 6. How do you manage long conversations?

Trim low-value messages, summarize older history, preserve critical facts separately, and keep recent turns.

## 7. What is context compaction?

Replacing verbose historical context with a smaller representation that preserves task-relevant information.

## 8. How do you avoid stale context?

Track freshness/version/source metadata and prioritize authoritative recent information.

## 9. How do you secure context?

Tenant isolation, authorization, redaction, minimization, encryption, retention, and source trust controls.

## 10. How do you handle multi-agent context?

Give each agent only the context needed for its responsibility; do not blindly share the full parent transcript.

## 11. What should a handoff contain?

Goal, relevant summary, entities, completed work, unresolved items, and references—not the entire raw history.

## 12. OpenAI session vs RunContextWrapper?

Session preserves conversation history across runs; RunContextWrapper carries local app context/dependencies and is not automatically model-visible.

## 13. LangGraph checkpointer vs store?

Checkpointer persists thread-scoped graph state; store persists application data across threads.

## 14. Microsoft middleware vs context provider?

Middleware changes execution behavior; context providers supply/persist agent knowledge.

## 15. One-line principle?

> Send the model the minimum authorized context required for the next decision.
