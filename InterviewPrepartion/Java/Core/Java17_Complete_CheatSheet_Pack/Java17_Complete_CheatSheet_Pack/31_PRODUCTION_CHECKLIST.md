# Java 17 Production Checklist

## Runtime

- [ ] supported JDK distribution/version
- [ ] container memory settings verified
- [ ] GC behavior measured
- [ ] heap sizing evidence-based
- [ ] JFR/diagnostics strategy available

## Dependencies

- [ ] compatible with Java 17
- [ ] no unsupported internal JDK API dependency
- [ ] security patches current
- [ ] bytecode agents compatible

## Code

- [ ] use modern APIs where they improve clarity
- [ ] do not use preview features accidentally in production
- [ ] no unnecessary `--add-opens`
- [ ] serialization risk reviewed

## Performance

- [ ] benchmark critical paths
- [ ] p95/p99 monitored
- [ ] allocation/GC checked
- [ ] CPU profiling available

## Migration

- [ ] integration tests
- [ ] regression tests
- [ ] load tests
- [ ] rollback strategy
- [ ] observability during rollout
