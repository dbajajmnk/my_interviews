# Retrieval Integration

## Retriever Contract

```java
interface Retriever {
    RetrievalResult retrieve(RetrievalQuery query);
}
```

## SDK Role

The base Agent SDK should provide a retrieval extension point, not hard-code one vector database.

## Possible Backends

- Azure AI Search;
- Elasticsearch;
- pgvector;
- vector DB;
- enterprise search;
- knowledge graph.

## Metadata

Return:
- content;
- source;
- score;
- metadata;
- permissions;
- citation/reference identifier.

## Architecture Principle

Retrieval is a capability used by the agent. It should remain independently replaceable and independently testable.
