# Handoffs

## Concept

A handoff lets one agent transfer responsibility to another agent.

## Example Flow

```text
Triage Agent
   ├─ Billing → Billing Agent
   ├─ Technical → Tech Agent
   └─ Sales → Sales Agent
```

## Use When

Use handoffs when:
- a specialist should own the next part of the task;
- instructions/tools differ significantly;
- the receiving agent should become the active agent.

## Design Considerations

Define:
- clear handoff descriptions;
- limited destinations;
- transfer criteria;
- input filtering where appropriate;
- trace/audit visibility.
