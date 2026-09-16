# Agent Orchestration Patterns

## Sequential

```text
A → B → C
```
Use for known ordered work.

## Router

```text
Input → classify → A / B / C
```
Use for specialization.

## Supervisor

```text
Supervisor
 ├─ Agent A
 ├─ Agent B
 └─ Agent C
```
Use when central coordination is needed.

## Planner-Executor

```text
Planner → plan → Executor → observe → replan
```
Use for dynamic multi-step tasks.

## Parallel

Use for independent work that can run concurrently.

## Human Approval

Use interrupt/resume around sensitive actions.

## Rule

Start with the simplest graph that expresses the workflow.
