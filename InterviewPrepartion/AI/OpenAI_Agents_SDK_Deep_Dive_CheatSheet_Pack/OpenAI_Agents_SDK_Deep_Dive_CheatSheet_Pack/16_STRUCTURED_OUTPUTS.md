# Structured Outputs

## Purpose

Structured outputs let an Agent return typed results rather than unstructured prose.

## Why

Use typed output for:
- APIs;
- workflow routing;
- downstream automation;
- validation;
- SDK contracts.

## Concept

```text
Agent
 ↓
Typed output schema
 ↓
Validated object
 ↓
Application logic
```

## Rule

Do not parse business-critical decisions from free-form text when a structured contract is available.
