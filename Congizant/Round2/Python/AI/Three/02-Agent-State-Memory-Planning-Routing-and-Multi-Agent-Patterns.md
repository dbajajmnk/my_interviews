# AI-03 / File 02 — Agent State, Memory, Planning, Routing & Multi-Agent Patterns

**Priority:** P0  
**Suggested Time:** 75 minutes

---

# 1. Objective

Master:

- runtime state;
- short-term context;
- durable memory;
- checkpoints;
- planning;
- routing;
- delegation;
- supervisor/worker pattern;
- multi-agent trade-offs;
- state size and context management.

---

# 2. 5W+H

## What?

Agent state tracks what has happened during a run. Memory preserves selected information across turns/runs. Planning/routing determines what action happens next.

## Why?

Multi-step tasks require continuity and controlled progression.

## Where?

Long tasks, support workflows, coding/research agents, operational assistants.

## When?

Only when task requires state beyond one simple model call.

## How?

Persist explicit state and let orchestration/model choose among allowed transitions.

---

# 3. Real-Life Analogy

State is the whiteboard for the current meeting.

Memory is the approved meeting record kept for later.

Do not keep every word forever just because it was spoken.

---

# 4. Visualization

```text
Current Goal
  ↓
State
├── messages
├── tool results
├── current step
├── budgets
└── business status
  ↓
Planner / Router
  ↓
Next Node / Tool
  ↓
Checkpoint
```

---

# 5. Mind Map

```text
Agent Orchestration
│
├── State
├── Memory
├── Checkpoint
├── Planning
├── Routing
├── Delegation
├── Supervisor
└── Multi-Agent
```

---

# 6. Core Concepts

## 6.1 State

State should be explicit.

Examples:

```text
request_id
user_id
goal
messages
tool_results
step_count
budget
status
```

Avoid hidden globals.

---

## 6.2 Memory Types

### Short-Term
Current conversation/run context.

### Durable Memory
Selected information persisted across sessions.

### Business State
Authoritative external state such as order/job status.

Do not confuse LLM memory with source-of-truth business data.

---

## 6.3 Memory Governance

Before storing:

- is it needed?
- sensitive?
- expiry?
- user can delete/correct it?
- tenant scope?

---

## 6.4 Checkpoint

Persist progress so long-running workflow can resume after:

- process restart;
- human approval;
- external delay.

---

## 6.5 Planning

Model may decompose goal into steps.

But plans are provisional.

Re-plan when observations change.

For high-risk tasks, deterministic workflow transitions may be safer.

---

## 6.6 Routing

Select which specialized path/tool handles request.

Example:

```text
billing → billing workflow
technical → troubleshooting
account → identity workflow
```

Routing may be model-based, rule-based, or hybrid.

---

## 6.7 Multi-Agent

Possible pattern:

```text
Supervisor
 ├── Research Agent
 ├── Data Agent
 └── Writer Agent
```

But multi-agent adds:

- coordination;
- duplicated context;
- more cost;
- harder evaluation;
- failure propagation.

---

## 6.8 When Multi-Agent Is Justified

Potential reasons:

- strong isolation of specialized tools/permissions;
- independent tasks can execute separately;
- different model/tool policies;
- organizational workflow requires delegation.

Not because:

> “multi-agent sounds advanced.”

---

# 7. Engineering Depth

## 7.1 State Machine + LLM

A strong pattern:

```text
deterministic state machine controls legal transitions
LLM assists decisions/content inside permitted state
```

This combines flexibility with control.

---

## 7.2 Memory Summarization

Long conversation:

- recent turns;
- durable facts;
- summarized history;
- retrieved relevant past information.

Never let memory grow unbounded.

---

## 7.3 Idempotent Resume

If checkpointed step is retried after crash, side-effecting actions need idempotency.

---

# 8. Implementation / Code

Pseudo state:

```python
@dataclass
class AgentState:
    run_id: str
    goal: str
    step_count: int
    status: str
    tool_results: list
    remaining_budget: float
```

---

# 9. Hands-On Practice

Design memory for support assistant:

Store:
- customer preference only if useful/allowed;
- active ticket ID;
- explicit approved notes.

Do not treat model-generated assumptions as durable facts.

---

# 10. Google Interview Drill

## Problem — Long-Running Procurement Agent

Process:

```text
collect requirements
→ compare approved suppliers
→ draft recommendation
→ human approval
→ create purchase request
```

### Clarify

- purchase request irreversible?
- approval role?
- supplier system?
- restart/resume?
- audit?

### First Approach

One autonomous agent loops until purchase created.

Too risky.

### Improve

State machine:

```text
DRAFT_REQUIREMENTS
→ RESEARCH
→ RECOMMENDATION
→ WAITING_APPROVAL
→ CREATE_REQUEST
→ COMPLETE
```

LLM helps:

- summarize;
- compare;
- draft.

Deterministic system controls:

- approval;
- transition;
- final side effect.

### Follow-Up

Checkpoint before waiting for approval and use idempotency on purchase creation.

---

# 11. Common Mistakes

1. Memory = full conversation forever.
2. Model-generated fact stored as truth.
3. Hidden state.
4. No checkpoint for long task.
5. Multi-agent before simple workflow.
6. Autonomous plan controls irreversible transition.
7. Resume repeats side effect.
8. No tenant/privacy scope for memory.

---

# 12. Best Practices

- explicit state;
- minimal durable memory;
- authoritative business data stays external;
- checkpoint long workflows;
- deterministic control for critical transitions;
- idempotent resume;
- multi-agent only for justified separation.

---

# 13. Interview Questions

1. State vs memory?
2. Short-term vs durable memory?
3. What is checkpoint?
4. What is planning?
5. Routing?
6. When multi-agent?
7. Supervisor pattern?
8. Why state machine with LLM?
9. How resume after crash?
10. How govern memory?

---

# 14. Google-Level Follow-Ups

1. user corrects memory?
2. GDPR deletion?
3. checkpoint DB down?
4. two workers resume same run?
5. agent version changes mid-run?
6. parallel subtasks?
7. stale plan?
8. cross-tenant memory?

---

# 15. Quick Revision

```text
State = current run
Memory = selected persisted information
Business state ≠ model memory
Checkpoint enables resume
Plan is provisional
State machine controls legal transitions
Multi-agent only when separation earns its cost
```

---

# 16. Readiness Gate

- [ ] State.
- [ ] Memory.
- [ ] Checkpoint.
- [ ] Planning/routing.
- [ ] Multi-agent trade-off.
- [ ] State machine pattern.
- [ ] Procurement drill.

**Gate:** READY / REPAIR

---

# 17. References

- Workflow/state-machine architecture references
- Agent orchestration design references
