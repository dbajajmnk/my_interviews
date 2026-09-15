# JFR Cooperative Sampling

## What

Improves stability when JFR samples Java thread stacks.

## Idea

Instead of walking stacks at arbitrary unsafe moments, sampling cooperates with JVM safepoint mechanisms while trying to avoid excessive bias.

## Why

Better:

```text
stability
stack-sampling reliability
profiling confidence
```

## Production Value

Useful for always-on or low-overhead diagnostic strategies.

## Trap

Sampling is statistical observation, not exact tracing of every method call.
