# AI-02 / File 02 — Ingestion, Parsing, Chunking, Metadata & Indexing

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** Data ingestion + AI retrieval preparation

---

# 1. Objective

Master:

- ingestion pipeline;
- parsing and cleanup;
- document normalization;
- chunking;
- overlap;
- semantic/structure-aware chunking;
- metadata;
- deduplication;
- indexing;
- versioning;
- reprocessing;
- deletion.

---

# 2. 5W+H

## What?

Ingestion converts raw documents into searchable units suitable for retrieval.

## Why?

Bad ingestion creates bad retrieval even with an excellent LLM.

## Where?

PDFs, HTML, docs, wiki pages, tickets, source code, structured records.

## When?

Before any query-time RAG retrieval.

## How?

Source → parse → normalize → chunk → metadata → embed → index.

---

# 3. Real-Life Analogy

A library is useful only if books are:

- readable;
- categorized;
- split into meaningful sections;
- indexed correctly.

Dumping shredded pages into a pile is technically “storage,” not useful retrieval.

---

# 4. Visualization

```text
Source
 ↓
Extract Text
 ↓
Clean / Normalize
 ↓
Preserve Structure
 ↓
Chunk
 ↓
Attach Metadata
 ↓
Deduplicate / Version
 ↓
Embed
 ↓
Index
```

---

# 5. Mind Map

```text
Ingestion
│
├── Source Connectors
├── Parsing
├── Cleaning
├── Chunking
│   ├── fixed
│   ├── overlap
│   └── structure-aware
├── Metadata
├── Deduplication
├── Versioning
└── Indexing
```

---

# 6. Core Concepts

## 6.1 Parsing

Extraction quality matters.

For PDF:

- headings;
- tables;
- page numbers;
- columns;
- footnotes;
- OCR;
- reading order.

If parsed text is wrong, retrieval quality suffers.

---

## 6.2 Cleaning

Remove irrelevant repeated noise such as:

- headers/footers;
- navigation chrome;
- duplicated boilerplate.

But do not remove legal/semantic context blindly.

---

## 6.3 Chunking

Goal:

> create retrieval units that are coherent enough to answer questions while small enough to retrieve precisely.

---

## 6.4 Fixed-Size Chunking

Example:

```text
500 tokens
100-token overlap
```

Simple baseline.

Pros:

- easy;
- predictable.

Cons:

- may split semantic units;
- overlap increases index size/cost.

---

## 6.5 Structure-Aware Chunking

Split by:

- heading;
- section;
- paragraph;
- code function/class;
- table.

Often better for documents with meaningful structure.

---

## 6.6 Chunk Size Trade-Off

Too small:

- missing context;
- many fragments;
- weaker semantic meaning.

Too large:

- irrelevant content;
- poor precision;
- larger context/cost.

There is no universal best chunk size.

Evaluate on corpus/tasks.

---

## 6.7 Overlap

Overlap helps preserve boundary context.

But too much overlap:

- duplicates retrieval;
- increases storage;
- wastes context tokens.

---

## 6.8 Metadata

Examples:

```text
document_id
tenant_id
title
section
page
document_type
created_at
updated_at
version
ACL labels
language
```

Metadata powers:

- filtering;
- citations;
- governance;
- debugging.

---

## 6.9 Deduplication

Duplicate documents/chunks can distort retrieval.

Use:

- source IDs;
- content hashes;
- version IDs.

---

## 6.10 Versioning

When document changes:

- new version;
- old chunks removed/deactivated;
- new chunks indexed;
- citation points to correct version.

---

# 7. Engineering Depth

## 7.1 Chunking by Content Type

Policies:
- headings/sections.

Code:
- functions/classes.

Tables:
- preserve row/column semantics.

Support tickets:
- maybe whole ticket/turn groups.

One chunking method for every corpus is rarely optimal.

---

## 7.2 Incremental Indexing

Avoid rebuilding entire corpus for one changed document.

Need:

```text
source change detection
→ reprocess only affected document
→ upsert new chunks
→ delete old chunks
```

---

## 7.3 Idempotent Ingestion

If same ingestion event is delivered twice, avoid duplicate index entries.

Use stable IDs:

```text
tenant + document + version + chunk
```

---

# 8. Implementation / Code

Pseudo chunk object:

```python
@dataclass
class Chunk:
    chunk_id: str
    document_id: str
    text: str
    page: int | None
    section: str | None
    tenant_id: str
    version: str
```

---

# 9. Hands-On Practice

For a 200-page employee handbook, define:

- chunk boundary;
- overlap;
- metadata;
- citation info;
- update strategy.

---

# 10. Google Interview Drill

## Problem — RAG Misses Answers That Span Two Pages

### Clarify

- parser preserves sections?
- chunk size?
- overlap?
- page split artificial?
- answer spans heading boundary?

### First Approach

Double chunk size globally.

May hurt precision/cost.

### Improve

Investigate retrieval examples.

Possible fixes:

- structure-aware sections;
- moderate overlap;
- parent-child retrieval;
- adjacent-chunk expansion.

### Test

Build cases where answer spans:

- page boundary;
- heading boundary;
- table continuation.

### Follow-Up

Measure recall improvement vs added context/token cost.

---

# 11. Common Mistakes

1. Chunk size copied from blog without evaluation.
2. Page = semantic chunk.
3. Overlap set huge “to be safe.”
4. Metadata missing tenant/source/version.
5. Reindex creates duplicates.
6. Delete not propagated.
7. Parser quality ignored.
8. Tables/code treated like prose.

---

# 12. Best Practices

- baseline fixed chunking first;
- preserve source structure;
- capture citation/security metadata;
- make ingestion idempotent;
- version documents/chunks;
- evaluate chunk strategy on real questions.

---

# 13. Interview Questions

1. What is chunking?
2. Why chunk?
3. How choose chunk size?
4. What is overlap?
5. Fixed vs semantic/structure-aware chunking?
6. What metadata matters?
7. How re-index changed documents?
8. How delete data?
9. How deduplicate ingestion?
10. How handle tables/code?

---

# 14. Google-Level Follow-Ups

1. 50M documents?
2. PDFs with OCR?
3. changing ACL?
4. near-duplicate docs?
5. version rollback?
6. embedding model migration?
7. incremental ingestion?
8. streaming source updates?

---

# 15. Quick Revision

```text
Parser quality matters
Chunk = retrieval unit
Too small → missing context
Too large → noisy/expensive
Overlap helps boundaries but costs
Metadata powers ACL + filtering + citations
Ingestion must support update/delete/idempotency
```

---

# 16. Readiness Gate

- [ ] Parsing.
- [ ] Chunking.
- [ ] Chunk-size trade-off.
- [ ] Overlap.
- [ ] Metadata.
- [ ] Version/update/delete.
- [ ] Boundary-answer drill.

**Gate:** READY / REPAIR

---

# 17. References

- Information retrieval preprocessing references
- Document parsing/chunking design references
