# End-to-End Sequence — HITL

## Sequence

```text
Model proposes risky action
→ Policy = REQUIRE_APPROVAL
→ Persist checkpoint
→ Emit approval.requested
→ Human approves
→ Verify exact pending action
→ Execute
→ Resume
```
