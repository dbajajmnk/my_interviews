# Retrieval Context and RAG

## Purpose

Retrieval injects external knowledge relevant to the current task.

## Flow

```text
Question
 ↓
Query
 ↓
Retriever
 ↓
Relevant chunks
 ↓
Authorization/filter
 ↓
Context builder
 ↓
Model
```

## Controls

- relevance;
- freshness;
- access control;
- source metadata;
- chunk size;
- diversity;
- token budget.

## Rule

RAG retrieves knowledge. Memory preserves learned/retained context. They can work together.
