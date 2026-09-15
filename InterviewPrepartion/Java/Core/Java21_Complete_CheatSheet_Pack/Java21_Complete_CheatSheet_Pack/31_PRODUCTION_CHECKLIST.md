# Java 21 Production Checklist

## Runtime

- [ ] supported Java 21 distribution
- [ ] patch level current
- [ ] container limits validated
- [ ] GC behavior measured
- [ ] JVM flags reviewed

## Virtual Threads

- [ ] blocking workload actually benefits
- [ ] DB pool remains bounded appropriately
- [ ] downstream rate limits enforced
- [ ] ThreadLocal usage reviewed
- [ ] pinning/contention profiled

## Preview Features

- [ ] organizational policy allows them
- [ ] build uses preview flags
- [ ] runtime uses preview flags
- [ ] upgrade risk accepted
- [ ] not accidentally treated as stable API

## Security

- [ ] no unsupported crypto design
- [ ] deserialization reviewed
- [ ] native integration reviewed
- [ ] agent loading controlled

## Observability

- [ ] JFR strategy
- [ ] metrics
- [ ] traces
- [ ] thread/concurrency visibility
- [ ] GC metrics
