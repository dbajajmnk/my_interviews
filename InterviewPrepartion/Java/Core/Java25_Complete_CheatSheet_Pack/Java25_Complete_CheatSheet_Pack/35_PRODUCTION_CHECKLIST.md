# Java 25 Production Checklist

## Version

- [ ] supported JDK 25 distribution
- [ ] current security patch
- [ ] build and runtime versions aligned

## Feature Status

- [ ] no accidental preview dependency
- [ ] preview flags documented
- [ ] incubator modules documented
- [ ] experimental JVM features isolated

## Performance

- [ ] startup baseline
- [ ] warmup baseline
- [ ] GC baseline
- [ ] JFR diagnostics ready
- [ ] compact headers tested before enabling

## Concurrency

- [ ] virtual-thread limits understood
- [ ] ScopedValue usage bounded
- [ ] Structured Concurrency policy reviewed

## Operations

- [ ] rollback
- [ ] metrics
- [ ] traces
- [ ] logs
- [ ] JFR
