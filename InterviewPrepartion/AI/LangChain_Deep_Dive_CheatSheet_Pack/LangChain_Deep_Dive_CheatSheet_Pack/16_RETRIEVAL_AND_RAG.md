# Retrieval and RAG

## Purpose

Retrieval grounds model responses using external knowledge.

## Flow

```text
Question
 ↓
Retriever
 ↓
Relevant Documents
 ↓
Context
 ↓
Model / Agent
```

## Agentic Use

An agent may expose retrieval as a tool so the model decides when search is required.

## Architecture Choice

Two common patterns:
1. always retrieve before generation;
2. let the agent decide whether to retrieve.

Use the first for predictable grounding; the second for more flexible multi-step tasks.

## Do Not Confuse

RAG = retrieve knowledge.  
Memory = retain useful history/state.
