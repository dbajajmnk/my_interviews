# End-to-End Sequence — Tool Call

## Sequence

```text
Client
→ SDK
→ Runtime
→ Model
← tool_call
→ Tool Runtime
→ validate/authz/policy
→ Tool
← result
→ Model
← final
→ SDK
```
