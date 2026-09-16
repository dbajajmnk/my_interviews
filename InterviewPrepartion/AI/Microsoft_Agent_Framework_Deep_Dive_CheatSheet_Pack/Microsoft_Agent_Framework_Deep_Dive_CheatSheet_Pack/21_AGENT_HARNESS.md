# Agent Harness

## What

Agent Harness is opinionated runtime scaffolding for longer, multi-step agent tasks.

## Batteries Included

The harness can compose capabilities such as:
- planning/execution modes;
- todo tracking;
- context compaction;
- file memory;
- file access;
- tool approval;
- observability;
- optional bounded looping.

## Mental Model

```text
Chat Client
   ↓
Harness
 ├─ planning
 ├─ todo state
 ├─ context compaction
 ├─ memory/files
 ├─ approvals
 ├─ telemetry
 └─ optional loop
   ↓
Agent interface
```

## When to Use

Use a harness when building coding, research, analysis, or other long-running interactive agents where you would otherwise assemble the same scaffolding manually.
