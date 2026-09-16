# Structured Outputs — System Design Questions

## Q1 — Design an Invoice Extraction Service

Use:
- invoice schema;
- provider structured output;
- parse/type validation;
- business validation;
- confidence/exception handling;
- human review threshold;
- schema versioning.

## Q2 — Design a Ticket Classifier

Return:
```text
category
priority
confidence
reason_code
```
Then route deterministically based on validated fields.

## Q3 — Design Multi-Provider Structured Output

Add:
- capability registry;
- provider-native strategy;
- tool-based fallback;
- common domain schema;
- normalized validation errors.

## Q4 — Design Schema Evolution

Version external schema, maintain adapters, support old/new consumers during migration, and keep domain model independent where possible.

## Q5 — Design Streaming Structured Results

Stream progress separately; only trigger business actions after the final validated object is complete.

## Answer Framework

**Schema → provider strategy → parse → validate → refusal/incomplete → business rules → versioning → observability.**
