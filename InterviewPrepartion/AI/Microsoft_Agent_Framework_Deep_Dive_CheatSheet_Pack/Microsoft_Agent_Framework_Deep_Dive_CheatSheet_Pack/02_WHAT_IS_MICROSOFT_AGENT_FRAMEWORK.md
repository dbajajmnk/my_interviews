# What Is Microsoft Agent Framework?

## Definition

Microsoft Agent Framework is a multi-language SDK for building AI agents and workflows using LLMs and remote agent runtimes.

## Why It Exists

It unifies ideas from:
- Semantic Kernel enterprise integration;
- AutoGen multi-agent patterns;
- explicit workflow orchestration;
- persistent state and long-running execution.

## When to Use an Agent

Use an agent when:
- the task is open-ended;
- the model must choose tools;
- the interaction is conversational;
- dynamic planning adds value.

## When to Use a Workflow

Use a workflow when:
- execution order matters;
- steps are known;
- multiple agents/functions must coordinate;
- state and recoverability need explicit control.

## Golden Rule

> If a normal function solves the problem cleanly, prefer the function. Use an agent only where model-driven behavior adds value.
