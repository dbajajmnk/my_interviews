# Outbox vs CDC

| Outbox | CDC |
|---|---|
| app writes explicit event row | capture DB log changes |
| domain-event friendly | row-change oriented |
| app schema change | infra connector/log reading |
| can use CDC to publish outbox | often complementary |

## Common Pattern
```text
Transactional Outbox + CDC
```
