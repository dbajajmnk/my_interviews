# AOT Startup & Warmup Cheat Sheet

## Startup

Time until application can begin useful work.

## Warmup

Time until runtime/JIT reaches desired optimized performance.

## Java 25 AOT Story

```text
Training Run
 ↓
AOT Cache
 ├── classes / heap artifacts
 └── method profiles
 ↓
Next Run
 ↓
faster startup / earlier optimization
```

## Good Metrics

```text
time-to-first-request
time-to-steady-state
startup CPU
startup memory
p95 during warmup
```

## Trap

Fast startup and fast steady-state performance are different goals.
