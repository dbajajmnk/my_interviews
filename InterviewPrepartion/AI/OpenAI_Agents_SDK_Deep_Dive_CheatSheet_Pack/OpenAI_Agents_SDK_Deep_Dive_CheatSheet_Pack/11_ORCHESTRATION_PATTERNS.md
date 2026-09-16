# Agent Orchestration Patterns

## Two Main Styles

The SDK documentation describes two broad orchestration approaches:
1. LLM-driven orchestration;
2. code-driven orchestration.

They can be mixed.

## LLM-Driven

The model decides:
- which tool to use;
- whether to delegate;
- which specialist to invoke;
- what step comes next.

## Code-Driven

Application code controls:
- sequence;
- branching;
- parallelism;
- retries;
- approval gates.

## Enterprise Pattern

Prefer a hybrid:
```text
Deterministic shell
  ├─ security
  ├─ approval
  ├─ audit
  └─ agentic decision zone
```
