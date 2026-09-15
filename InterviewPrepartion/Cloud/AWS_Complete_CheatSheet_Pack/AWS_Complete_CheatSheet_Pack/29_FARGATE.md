# AWS Fargate

## What

Serverless compute capacity for containers.

Used with:

```text
ECS
EKS
```

## Benefit

No worker EC2 fleet management.

## Good Fits

```text
variable container workloads
teams avoiding node management
isolated tasks/services
```

## Trade-offs

```text
less node-level control
pricing differences
platform constraints
```

## Trap

Fargate is compute for containers, not a standalone orchestration system.
