# Monolith vs Modular Monolith vs Microservices

| Area | Monolith | Modular Monolith | Microservices |
|---|---|---|---|
| Deployment | one unit | one unit | many units |
| Boundaries | often weak | strong modules | network boundaries |
| Data | shared | shared/partitioned | service-owned |
| Ops complexity | low | medium | high |
| Team autonomy | limited | good | high |
| Failure isolation | low | medium | high potential |
| Network overhead | low | low | high |
| Transactions | simple | simple | distributed complexity |

## Recommendation

Start with a **modular monolith** when the domain/team size does not justify distributed complexity.

Move to microservices when there is strong evidence around:

```text
team autonomy
independent scaling
deployment independence
domain complexity
organizational scale
```

## Trap

Microservices should not be the default for every new application.
