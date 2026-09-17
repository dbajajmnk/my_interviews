# Pulsar Subscription Decision Tree

```text
Need exactly one active consumer?
→ Exclusive

Need active-standby failover?
→ Failover

Need maximum worker concurrency and ordering not required?
→ Shared

Need worker concurrency but same key must stay ordered/affine?
→ Key_Shared
   └─ use stable keys and key-based batching / disable incompatible batching
```

## Retry Decision
```text
Transient failure
→ negativeAck / reconsumeLater / retry topic + backoff

Repeated poison message
→ Dead Letter Policy / DLQ

Critical business side effect
→ ack after success + idempotent handler
```
