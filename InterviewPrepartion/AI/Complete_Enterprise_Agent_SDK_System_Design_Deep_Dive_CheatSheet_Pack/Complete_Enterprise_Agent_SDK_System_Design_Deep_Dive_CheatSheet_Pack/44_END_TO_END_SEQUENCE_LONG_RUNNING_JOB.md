# End-to-End Sequence — Long-Running Job

## Sequence

```text
Submit
→ queue
→ worker claims lease/token
→ checkpoint
→ external step
→ lease renew
→ checkpoint
→ finalize only if token still owns work
```
