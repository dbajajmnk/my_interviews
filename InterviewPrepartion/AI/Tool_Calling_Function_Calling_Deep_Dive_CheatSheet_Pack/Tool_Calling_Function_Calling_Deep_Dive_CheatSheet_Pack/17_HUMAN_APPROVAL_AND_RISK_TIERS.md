# Human Approval and Risk Tiers

## Risk Tiers

Example:
- Tier 0: read-only public lookup
- Tier 1: read-only internal data
- Tier 2: reversible write
- Tier 3: destructive/financial/external action

## Approval

Require human approval for higher-risk actions.

## Pattern

```text
Model proposes tool
 ↓
Risk classifier / policy
 ↓
Low risk → execute
High risk → human approve/reject
```

## Rule

Human approval is a control boundary, not a failure of automation.
