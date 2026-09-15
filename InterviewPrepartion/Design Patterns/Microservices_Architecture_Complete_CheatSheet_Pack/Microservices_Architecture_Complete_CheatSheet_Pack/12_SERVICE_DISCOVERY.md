# Service Discovery

## Problem

Service instances are dynamic.

```text
service-a-1
service-a-2
service-a-3
```

## Discovery Models

```text
Client-side discovery
Server-side discovery
Platform-native discovery
```

## Kubernetes Example Concept

```text
Service Name
  ↓
Cluster DNS / Service
  ↓
Healthy Pods
```

## Trap

Discovery solves location, not resilience.
