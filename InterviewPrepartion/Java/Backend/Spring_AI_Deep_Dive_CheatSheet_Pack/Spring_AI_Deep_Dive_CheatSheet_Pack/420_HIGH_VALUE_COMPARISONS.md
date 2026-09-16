# Spring AI — High-Value Comparisons

## ChatModel vs ChatClient
| ChatModel | ChatClient |
|---|---|
| lower-level portable model API | fluent high-level orchestration |
| request/response model contract | prompts/advisors/tools/entity extraction |

## ChatMemory vs RAG
| ChatMemory | RAG |
|---|---|
| conversation continuity | external authoritative knowledge |
| user/session scope | corpus/domain scope |
| recent messages | retrieved documents |

## Tool Calling vs Structured Output
| Tool Calling | Structured Output |
|---|---|
| model requests application action | model returns typed result |
| invokes trusted code | schema-constrained data |
| authorization required | semantic validation required |

## Advisor vs Tool
| Advisor | Tool |
|---|---|
| transforms/orchestrates model interaction | callable business/external capability |
| memory/RAG/logging/tool loop | side effects/data access |

## VectorStore vs VectorStoreRetriever
| VectorStore | VectorStoreRetriever |
|---|---|
| read + mutation | retrieval only |
| ingestion/admin | least-privilege RAG component |

## Spring AI vs Native SDK
| Spring AI | Native provider SDK |
|---|---|
| portability/Spring ecosystem | fastest provider-specific capability access |
| common abstractions | direct provider model |
