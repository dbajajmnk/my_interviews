# Tool Runtime

## Pipeline

```text
Model proposes
→ schema validation
→ authz
→ policy/risk
→ HITL if required
→ execute
→ normalize result
→ audit
```

## Rule

The model never directly executes privileged business actions.
