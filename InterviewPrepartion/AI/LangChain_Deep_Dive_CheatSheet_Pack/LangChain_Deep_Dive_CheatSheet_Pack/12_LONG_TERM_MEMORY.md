# Long-Term Memory

## Definition

Long-term memory persists information across different threads and sessions.

## Storage Model

LangGraph stores back LangChain long-term memory. Data is saved as documents organized by namespace/key.

## Examples

- user preferences;
- organization context;
- durable facts;
- learned task preferences.

## Difference

| Mechanism | Scope |
|---|---|
| State + checkpointer | One conversation/thread |
| Store | Across conversations/threads |

## Enterprise Reminder

Apply retention, privacy, consent, and deletion policies to long-term memory.
