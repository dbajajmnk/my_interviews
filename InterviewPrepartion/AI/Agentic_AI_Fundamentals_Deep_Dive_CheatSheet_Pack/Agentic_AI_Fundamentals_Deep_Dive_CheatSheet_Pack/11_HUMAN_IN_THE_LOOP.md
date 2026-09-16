# Human in the Loop (HITL)

## Why

Human approval is valuable when actions are:
- financially sensitive;
- legally significant;
- destructive;
- externally visible;
- low-confidence;
- policy-sensitive.

## Pattern

```text
Agent proposes action
       ↓
Risk/Policy check
       ↓
Low risk ──────────────▶ Execute
       │
High risk
       ↓
Human Approval
   ├─ Approve → Execute
   └─ Reject  → Revise/Stop
```

## Good Approval Payload

Show the reviewer:
- proposed action;
- parameters;
- evidence;
- reason summary;
- impact;
- alternatives;
- audit identifier.

## Interview Point

> Human-in-the-loop is not a failure of automation. It is an explicit control boundary for decisions whose risk exceeds the system's autonomous authority.
