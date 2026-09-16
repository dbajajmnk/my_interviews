# Single Agent vs Multi-Agent

## Single Agent

One agent owns the task and uses multiple tools.

Advantages:
- simpler;
- easier to debug;
- lower cost;
- fewer handoffs;
- easier governance.

## Multi-Agent

Multiple specialized agents collaborate.

Possible roles:
```text
Supervisor
 ├─ Research Agent
 ├─ Data Agent
 ├─ Coding Agent
 └─ Reviewer Agent
```

## When Multi-Agent Helps

Use it when there are genuinely separate:
- domains;
- permissions;
- contexts;
- models;
- independent parallel tasks;
- review responsibilities.

## When It Hurts

Avoid it when it only creates:
- duplicated context;
- extra latency;
- more token cost;
- complex debugging;
- unclear ownership.

## 20-Second Recall

> Start with one agent. Split into multiple agents only when specialization, isolation, or parallelism justifies the operational complexity.
