# Resilience / Partial Failure

## Failure Types

```text
remote JS unavailable
API unavailable
auth unavailable
config unavailable
incompatible version
runtime exception
```

## Degrade

```text
fallback UI
cached content
hide optional feature
retry asset carefully
error telemetry
```

## Rule

Design page behavior when each MFE is unavailable.

## Trap

Runtime composition introduces runtime dependency failure modes.
