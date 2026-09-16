# Production Checklist

## Pipeline
- no nested subscribe
- no block/sleep on event loop
- bounded flatMap concurrency
- bounded buffers/cache/replay
- explicit error and empty semantics
- cancellation-safe cleanup

## HTTP
- connect/response timeout strategy
- bounded connection pool
- streaming media types where needed
- codec memory limits
- retries only for safe/idempotent work

## Data
- R2DBC driver verified
- DB pool bounded
- transactions short
- no JDBC/JPA on event loop

## Operations
- p95/p99 latency
- Netty pool saturation
- R2DBC pool saturation
- retry rate
- event-loop blocking detection
- trace/context propagation
