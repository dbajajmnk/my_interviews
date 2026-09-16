# Context Types — Taxonomy

## Context Categories

| Context Type | Example | Usually Model-Visible? |
|---|---|---:|
| Runtime context | user_id, tenant, API client | No |
| Instructions | role, policies | Yes |
| Conversation | messages | Yes |
| Execution state | current step, tool result | Sometimes |
| Short-term memory | thread summary | Yes |
| Long-term memory | preferences | Selected |
| Retrieval | KB documents | Selected |
| Tool context | call ID, auth identity | Usually No |
| Observability context | trace/span IDs | No |

## Rule

Treat each category differently rather than putting all of them into a single “context dictionary.”
