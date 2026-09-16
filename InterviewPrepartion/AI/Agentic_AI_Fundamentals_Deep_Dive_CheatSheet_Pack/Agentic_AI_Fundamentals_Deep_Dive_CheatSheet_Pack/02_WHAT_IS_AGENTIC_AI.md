# What Is Agentic AI?

## What

Agentic AI describes systems where an AI model participates in **decision-making and action selection**, not just text generation.

The model may:
- interpret a goal;
- choose a tool;
- supply structured arguments;
- observe results;
- decide a next action;
- maintain task state;
- stop when a goal or constraint is satisfied.

## Why

Traditional LLM applications are often one-shot:

```text
Prompt → Model → Response
```

Agentic systems are iterative:

```text
Goal → Decide → Act → Observe → Update → Decide Again → Finish
```

This matters when a task cannot be solved in a single generation and requires interaction with external systems.

## What Agentic AI Is Not

It is not:
- unrestricted autonomy;
- a synonym for chatbot;
- automatically multi-agent;
- simply a long prompt;
- merely RAG;
- permission to let an LLM call arbitrary production systems.

## When It Fits

Use agentic behavior when:
- the next step depends on intermediate results;
- tool selection is dynamic;
- the task crosses multiple systems;
- the reasoning path cannot be fully hard-coded;
- human approval may be inserted at decision points.

## When It Does Not Fit

Prefer normal deterministic software when:
- rules are known and stable;
- compliance requires exact predictable steps;
- the task is simple CRUD;
- latency/cost sensitivity is extreme;
- every action can be represented as a fixed workflow.

## 20-Second Recall

> Agentic AI is useful when software must dynamically choose actions based on goals and observations. It should complement—not replace—deterministic software.
