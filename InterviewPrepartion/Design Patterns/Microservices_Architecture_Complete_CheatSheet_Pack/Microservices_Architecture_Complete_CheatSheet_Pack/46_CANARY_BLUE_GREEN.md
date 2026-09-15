# Canary vs Blue-Green

| Canary | Blue-Green |
|---|---|
| partial traffic | environment switch |
| gradual risk | fast cutover |
| needs observability | needs duplicate capacity |
| progressive rollout | simple rollback |

## Canary Flow

```text
1% → 5% → 25% → 50% → 100%
```

## Gate On

```text
error rate
latency
business KPIs
resource saturation
```
