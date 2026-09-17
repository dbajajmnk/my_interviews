# RabbitMQ Queue Selection Decision

```text
Need temporary/exclusive/simple non-replicated queue?
→ Classic Queue

Need durable replicated work queue / command processing?
→ Quorum Queue

Need retained replay, very large backlog, or large fanout?
→ RabbitMQ Stream

Need partitioned stream scalability?
→ Super Stream
```

## Reliability Decision
```text
Critical publish?
→ Publisher Confirms

Critical processing?
→ Manual Consumer Ack

Transient failure?
→ bounded retry/backoff

Permanent/poison failure?
→ DLX / DLQ

Need one active processor?
→ Single Active Consumer
```
