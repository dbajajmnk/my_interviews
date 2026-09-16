# Agent Execution Loop

## Loop

```text
1. Receive goal
2. Build context
3. Ask model for next decision
4. Validate decision
5. Execute approved action/tool
6. Observe result
7. Update state
8. Check termination condition
9. Repeat or finish
```

## Pseudo Code

```python
state = initial_state(task)

while not should_stop(state):
    context = build_context(state)
    decision = model.decide(context)

    validate(decision)

    if decision.type == "tool":
        result = execute_tool(decision.tool, decision.args)
        state = update_state(state, result)
    elif decision.type == "final":
        return decision.output
```

## Production Requirements

A real loop also needs:
- max-steps;
- timeout;
- token/cost budget;
- tool allowlist;
- retries with limits;
- idempotency;
- audit logs;
- cancellation;
- human escalation.

## Failure Example

Without a step limit, an agent can enter a loop:

```text
Search → no result → search again → same result → repeat
```

Control it with max iterations, novelty checks, and explicit failure states.

## 20-Second Recall

> An agent is an event loop with intelligence in the decision step. Everything around that decision must still be engineered like production software.
