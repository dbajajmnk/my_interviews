# Memory and Persistence

## Short-Term

Conversation history can be maintained in the agent session/history provider.

## Persistent Context

Context providers can load/store longer-lived information such as preferences, user context, or RAG-derived state.

## Persistence Rule

Separate:
- conversational/session state;
- durable workflow state;
- long-term user/domain memory.

## Production Questions

Ask:
- retention duration?
- deletion policy?
- tenant isolation?
- encryption?
- who can read/write memory?
- how is stale memory handled?
