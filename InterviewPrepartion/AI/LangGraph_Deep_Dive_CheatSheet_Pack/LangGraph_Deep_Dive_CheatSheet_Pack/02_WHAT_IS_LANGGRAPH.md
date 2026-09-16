# What Is LangGraph?

## Definition

LangGraph is a low-level orchestration framework for building, managing, and running long-running stateful agents and workflows.

## Core Strengths

- explicit control flow;
- durable execution;
- persistence;
- human-in-the-loop;
- streaming;
- stateful workflows;
- deterministic + agentic composition;
- long-running processes.

## When to Use

Use LangGraph when:
- workflow structure matters;
- state transitions must be explicit;
- the system can pause/resume;
- human approval is required;
- agents need durable execution;
- deterministic and model-driven steps are mixed.

## When Not Needed

If a standard LangChain `create_agent` fits the use case, direct LangGraph may add unnecessary complexity.
