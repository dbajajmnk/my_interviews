# AI-01 / File 03 — Prompt Engineering & Structured Outputs

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** Emerging AI Core + API Integration

---

# 1. Objective

Master:

- prompt anatomy;
- instruction hierarchy awareness;
- role/context/task/constraints;
- zero-shot/few-shot;
- delimiters;
- structured output;
- extraction/classification prompts;
- prompt testing;
- avoiding prompt overengineering;
- prompt versioning.

---

# 2. 5W+H

## What?

Prompt engineering is designing model input so task, context, constraints, and output expectations are clear.

## Why?

Good prompts improve:

- consistency;
- relevance;
- safety;
- parseability.

## Where?

Generation, extraction, classification, summarization, RAG, AI workflows.

## When?

Before considering fine-tuning for many tasks.

## How?

Define objective → context → instruction → constraints → examples → output contract.

---

# 3. Real-Life Analogy

Giving an LLM a vague prompt is like assigning work to a senior engineer with no acceptance criteria.

Clear requirements produce better output.

---

# 4. Visualization

```text
Prompt
├── Role / Context
├── Task
├── Input
├── Constraints
├── Examples
└── Output Schema
```

---

# 5. Mind Map

```text
Prompting
│
├── Zero-shot
├── Few-shot
├── Context
├── Constraints
├── Delimiters
├── Structured Output
├── Examples
├── Versioning
└── Evaluation
```

---

# 6. Core Concepts

## 6.1 Clear Task

Weak:

```text
Analyze this.
```

Better:

```text
Classify the support ticket into one of:
BILLING, TECHNICAL, ACCOUNT, OTHER.
Return only the category.
```

---

## 6.2 Context

Provide only relevant context.

Explicitly distinguish:

```text
Instructions
Reference data
User input
```

This reduces ambiguity.

---

## 6.3 Constraints

Examples:

- maximum length;
- allowed categories;
- no unsupported claims;
- output JSON schema;
- language/tone.

---

## 6.4 Zero-Shot

Instruction without examples.

Good when task is straightforward.

---

## 6.5 Few-Shot

Include representative examples.

Useful when:

- output style/label mapping is ambiguous;
- edge cases need demonstration.

Bad examples can teach bad behavior.

---

## 6.6 Delimiters

Use clear boundaries:

```text
<document>
...
</document>
```

or fenced blocks.

Helps distinguish data from instruction—but is not a complete security boundary.

---

## 6.7 Structured Output

Prefer machine-readable output when downstream code consumes result.

Example:

```json
{
  "category": "BILLING",
  "confidence": 0.86
}
```

Where supported, schema-constrained output/tooling is stronger than “please return valid JSON.”

---

## 6.8 Parsing

Never assume model output is valid because prompt requested JSON.

Use:

- schema-constrained generation where available;
- runtime validation;
- retry/repair policy where appropriate.

---

## 6.9 Prompt Versioning

Production prompt is code/config.

Track:

- version;
- evaluation score;
- model version;
- rollout.

---

# 7. Engineering Depth

## 7.1 Prompt vs Program

Use code for deterministic transformation.

Use prompt where language ambiguity/generalization is valuable.

Do not encode a 200-line rules engine into prose if code is safer.

---

## 7.2 Prompt Optimization Requires Evaluation

Do not say:

> This prompt looks better.

Measure against test cases.

---

## 7.3 Reasoning Visibility

For production systems, focus on reliable outputs and externally verifiable evidence rather than requiring hidden internal reasoning.

Ask for:

- concise rationale;
- citations;
- structured intermediate outputs where useful.

---

# 8. Implementation / Code

```python
PROMPT = """
You classify support tickets.

Allowed categories:
- BILLING
- TECHNICAL
- ACCOUNT
- OTHER

Ticket:
<ticket>
{ticket}
</ticket>

Return JSON with:
- category
- reason
"""
```

Validate returned data in code.

---

# 9. Hands-On Practice

Improve:

```text
Summarize this document.
```

Add:

- target audience;
- maximum bullets;
- include key risks;
- no unsupported claims;
- clear input boundary.

---

# 10. Google Interview Drill

## Problem — Extract Invoice Data

Need:

```text
invoice_number
invoice_date
vendor
total
currency
```

### Clarify

- OCR already done?
- multiple currencies?
- missing fields?
- confidence?
- critical financial workflow?

### First Approach

Ask free-form extraction.

Hard to parse reliably.

### Improve

Use strict schema + validation:

```json
{
  "invoice_number": "string|null",
  "invoice_date": "YYYY-MM-DD|null",
  "vendor": "string|null",
  "total": "number|null",
  "currency": "string|null"
}
```

### Validate

- types;
- date;
- currency;
- amount;
- business rules.

### Edge Cases

- multiple totals;
- tax vs grand total;
- unreadable OCR;
- malicious text inside invoice.

### Follow-Up

Human review for uncertain/high-value invoices.

---

# 11. Common Mistakes

1. Vague task.
2. Too much irrelevant context.
3. JSON requested but never validated.
4. Prompt examples inconsistent.
5. Prompt treated as security boundary.
6. Prompt changed without regression evaluation.
7. Deterministic logic shoved into prompt.
8. Confidence number blindly trusted.

---

# 12. Best Practices

- explicit objective;
- clear context boundaries;
- concise constraints;
- examples only when helpful;
- schema-constrained output where supported;
- runtime validation;
- version prompts;
- evaluate before rollout.

---

# 13. Interview Questions

1. What makes a good prompt?
2. Zero-shot vs few-shot?
3. Why delimiters?
4. Structured output?
5. How ensure valid JSON?
6. Prompt vs fine-tuning?
7. How version prompts?
8. How test prompt changes?
9. How handle extraction uncertainty?

---

# 14. Google-Level Follow-Ups

1. multilingual invoices?
2. prompt injection in document?
3. low confidence?
4. schema migration?
5. model change?
6. 10M documents?
7. cost/latency?

---

# 15. Quick Revision

```text
Prompt:
objective
context
task
constraints
examples
output schema

Structured output still needs validation
Prompt is versioned/evaluated artifact
Use code for deterministic invariants
```

---

# 16. Readiness Gate

- [ ] Prompt anatomy.
- [ ] Zero/few-shot.
- [ ] Constraints/delimiters.
- [ ] Structured output.
- [ ] Runtime validation.
- [ ] Prompt versioning.
- [ ] Invoice drill.

**Gate:** READY / REPAIR

---

# 17. References

- Provider-neutral prompting guidance
- JSON Schema references
