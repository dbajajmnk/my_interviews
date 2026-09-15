# EC2 vs Lambda vs Containers

| EC2 | Lambda | ECS/EKS |
|---|---|---|
| full VM control | function/event | container |
| long-running | event-driven | long-running/services/jobs |
| manage OS | no server mgmt | orchestration |
| flexible | strong constraints | portable packaging |
| steady workloads | bursty/serverless | service platforms |

## Decision

```text
Need OS/control? → EC2
Event/function model? → Lambda
Containerized service? → ECS/EKS
```

## Rule

Operational model is often more important than raw technology preference.
