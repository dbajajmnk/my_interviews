# Amazon ECS

## What

AWS-native container orchestration.

## Core Concepts

```text
Cluster
Task Definition
Task
Service
Capacity Provider
```

## Runtime

```text
ECS on EC2
or
ECS on Fargate
```

## Good Fit

Teams that want managed container orchestration without Kubernetes complexity.

## Trap

Task definition is a deployment/runtime specification, not a Docker image itself.
