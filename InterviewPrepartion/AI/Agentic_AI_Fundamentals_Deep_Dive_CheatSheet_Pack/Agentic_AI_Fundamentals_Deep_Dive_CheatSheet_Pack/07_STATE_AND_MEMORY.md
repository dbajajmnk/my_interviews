# State and Memory

## State

**State = current execution data.**

Examples:
- current step;
- selected customer;
- tool outputs;
- retry count;
- approval status;
- temporary variables.

## Memory

**Memory = information intentionally retained for future usefulness.**

Examples:
- user preference;
- long-running task history;
- useful prior decisions;
- conversation summary.

## Do Not Mix State and Memory

State is usually task-scoped and short-lived.

Memory may survive:
- turns;
- sessions;
- workflows;
- days/months.

Treat them with different retention, privacy, and lifecycle policies.

## RAG vs Memory

| Concept | Purpose |
|---|---|
| RAG | Retrieve external knowledge |
| State | Track current execution |
| Memory | Retain useful historical context |

## 20-Second Recall

> State tells the agent where it is now. Memory tells it what is worth remembering later.
