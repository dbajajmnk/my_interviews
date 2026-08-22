# AI-03 / File 01 — Agent Fundamentals, Workflows & Tool Calling

**Priority:** P0  
**Suggested Time:** 70 minutes

---

# 1. Objective

Master:

- deterministic workflow;
- agent definition;
- tool/function calling;
- agent loop;
- observations/results;
- termination;
- workflow vs agent decision;
- structured tool contracts.

---

# 2. 5W+H

## What?

An AI agent is a system in which a model can use current state/context to choose actions or tools toward a goal, observe results, and continue until a stop condition is reached.

## Why?

Some tasks require dynamic decisions that cannot be fully pre-scripted.

## Where?

- research assistance;
- support triage;
- operations;
- coding assistants;
- multi-step enterprise automation.

## When?

Use an agent when the next step genuinely depends on intermediate observations.

## How?

```text
Goal
→ Model decides next action
→ Tool executes
→ Result returns
→ Model decides next step
→ Stop
```

---

# 3. Real-Life Analogy

A workflow is a railway line with known stations.

An agent is a taxi driver choosing the route based on traffic and destination.

If the railway line solves the job reliably, do not hire a taxi for every trip.

---

# 4. Visualization

## Workflow

```text
Input
 ↓
Step A
 ↓
Step B
 ↓
Step C
 ↓
Output
```

## Agent

```text
Goal
 ↓
Model
 ├── answer directly
 ├── call Tool A
 ├── call Tool B
 └── ask for approval
      ↓
Observation
      ↓
Model
      ↓
Stop / Continue
```

---

# 5. Mind Map

```text
Agentic AI
│
├── Goal
├── Model
├── Tools
├── State
├── Observation
├── Loop
├── Termination
└── Evaluation
```

---

# 6. Core Concepts

## 6.1 Workflow vs Agent

Workflow:

- known sequence;
- deterministic orchestration;
- easier to test/debug;
- lower variance.

Agent:

- dynamic tool/action selection;
- adapts to intermediate results;
- more flexible;
- harder to control/evaluate.

Architect rule:

> Start with workflow. Add agentic decisions only where dynamic behavior creates real value.

---

## 6.2 Tool Calling

The model proposes a structured tool call.

Example conceptual schema:

```json
{
  "name": "get_order",
  "arguments": {
    "order_id": "O-101"
  }
}
```

Application validates arguments, authorizes operation, executes tool, and returns result.

The model should not directly bypass the application control layer.

---

## 6.3 Tool Schema

A good tool contract is:

- narrow;
- typed;
- explicit;
- minimally privileged.

Bad:

```text
run_any_sql(query)
```

Safer:

```text
get_order_status(order_id)
```

when that is all the use case needs.

---

## 6.4 Agent Loop

Conceptual:

```python
while not done:
    decision = model.decide(state)

    if decision.is_tool_call:
        result = execute_tool(decision)
        state.add(result)
    else:
        done = True
```

Production needs more controls:

- max steps;
- timeout;
- cost budget;
- tool authorization;
- validation.

---

## 6.5 Observation

Tool output becomes new evidence.

Treat tool output as data.

A compromised external tool response can also contain malicious instructions.

---

## 6.6 Stop Condition

Never allow an uncontrolled loop.

Possible:

- model final response;
- max steps;
- total timeout;
- cost/token budget;
- business completion state;
- human interruption.

---

# 7. Engineering Depth

## 7.1 Agents Are Not Automatically Better

Agent adds:

- nondeterminism;
- latency;
- cost;
- testing complexity;
- security surface.

Use only if benefit exceeds this complexity.

---

## 7.2 Tool Selection Is Not Authorization

Model may choose:

```text
delete_account
```

but application must decide whether current principal is permitted to execute it.

---

## 7.3 Prefer Domain Tools Over Raw Infrastructure

Better:

```text
cancel_order(order_id)
```

than:

```text
execute_sql(sql)
```

This narrows blast radius.

---

# 8. Implementation / Code

Pseudo tool registry:

```python
TOOLS = {
    "get_order_status": get_order_status,
    "create_support_ticket": create_support_ticket,
}

def execute_tool(call, principal):
    validate_schema(call)
    authorize(principal, call.name, call.arguments)
    return TOOLS[call.name](**call.arguments)
```

---

# 9. Hands-On Practice

Decide workflow or agent:

1. nightly invoice export with fixed steps → workflow.
2. research task requiring dynamic web/source selection → agent may help.
3. password reset → deterministic workflow.
4. troubleshooting assistant choosing diagnostic tools → agent may help with controls.

---

# 10. Google Interview Drill

## Problem — Design Support Automation

Task:

> Read customer issue, check order, check payment if needed, then either answer or create a support ticket.

### Clarify

- which systems?
- actions reversible?
- PII?
- ticket creation side effect?
- customer can authorize account actions?

### First Approach

Fully autonomous agent with database access.

Too much privilege.

### Improve

Tools:

```text
get_order_status(order_id)
get_payment_status(payment_id)
create_support_ticket(summary)
```

Agent decides which read tools to call.

Ticket creation may be allowed automatically if low-risk; destructive/refund actions need stronger controls.

### Termination

- max tool calls;
- overall timeout;
- final answer/ticket status.

### Follow-Up

Add evaluation:

- task completion;
- wrong tool rate;
- unnecessary tool calls;
- latency;
- cost.

---

# 11. Common Mistakes

1. Everything called an agent.
2. Agent used where workflow is enough.
3. Raw database/shell tool exposure.
4. Tool selection treated as authorization.
5. No max-step limit.
6. No schema validation.
7. Tool result blindly trusted as instruction.
8. Agent success measured only by final text quality.

---

# 12. Best Practices

- workflow first;
- narrow tools;
- strict schemas;
- deterministic authorization;
- termination budget;
- log every tool call;
- evaluate task and tool behavior.

---

# 13. Interview Questions

1. What is an AI agent?
2. Agent vs workflow?
3. What is tool calling?
4. Who executes tools?
5. Why narrow tools?
6. What is an agent loop?
7. How stop runaway agent?
8. Why model decision is not authorization?
9. When should you not use an agent?

---

# 14. Google-Level Follow-Ups

1. tool timeout?
2. wrong tool selected?
3. duplicate side effect?
4. tool output malicious?
5. retries?
6. user cancels?
7. 100 concurrent agents?
8. cost budget?

---

# 15. Quick Revision

```text
Workflow = known sequence
Agent = dynamic action selection
Tool call = model proposal, app executes
Tool selection ≠ authorization
Use narrow domain tools
Every loop needs stop + time + cost limits
```

---

# 16. Readiness Gate

- [ ] Workflow vs agent.
- [ ] Tool schema.
- [ ] Agent loop.
- [ ] Authorization boundary.
- [ ] Termination.
- [ ] Support drill.

**Gate:** READY / REPAIR

---

# 17. References

- Provider-neutral tool-calling and agent architecture references
