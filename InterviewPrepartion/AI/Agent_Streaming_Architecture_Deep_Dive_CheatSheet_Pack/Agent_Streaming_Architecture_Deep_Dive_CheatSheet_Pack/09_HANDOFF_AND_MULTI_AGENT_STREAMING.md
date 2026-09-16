# Handoff and Multi-Agent Streaming

## Events

- handoff.requested
- handoff.completed
- agent.changed

## Why

Multi-agent systems need to communicate who currently owns the task.

## UI

Show meaningful progress such as:
```text
Triage Agent → Billing Specialist
```
when it helps users understand the workflow.

## Observability

Always include agent identity in traces/events for handoff debugging.
