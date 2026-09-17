# Kafka Decision Tree

```text
Need durable replayable event history?
  No → queue/RPC may be simpler
  Yes → Kafka candidate

Need per-entity ordering?
  → stable key → same partition

Need independent subscribers?
  → separate consumer groups

Need queue-like workers / consumers > partitions?
  → Share Groups

Need reliable DB event publication?
  → Transactional Outbox + CDC

Need Kafka read-process-write atomicity?
  → Kafka Transactions / Streams EOS

Need connectors?
  → Kafka Connect

Need stateful stream processing?
  → Kafka Streams or another stream processor

Need cross-cluster DR?
  → MirrorMaker 2 / managed replication
```
