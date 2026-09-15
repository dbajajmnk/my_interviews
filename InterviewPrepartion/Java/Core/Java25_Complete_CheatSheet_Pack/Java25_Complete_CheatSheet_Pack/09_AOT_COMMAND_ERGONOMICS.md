# Ahead-of-Time Command-Line Ergonomics

## Goal

Make it easier to create and use AOT caches.

## Why

Java normally gathers runtime information during startup/warmup.

AOT caching can preserve useful artifacts ahead of subsequent runs.

## Mental Model

```text
Training / Preparation
       ↓
    AOT Cache
       ↓
Application Start
       ↓
less repeated startup work
```

## Benefits

Potentially improves:

- startup time
- warmup
- deployment responsiveness

## Good Fits

```text
microservices
CLI tools
short-lived processes
serverless-like workloads
frequent restarts
```

## Trap

AOT cache is sensitive to application/JDK/platform context.

Regenerate when relevant inputs change.
