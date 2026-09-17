# Kafka — Interview Traps

1. Ordering is per partition, not across a multi-partition topic.
2. Traditional consumer-group parallelism is bounded by partitions.
3. Share Groups allow queue-like record sharing and more consumers than partitions.
4. Reading does not delete Kafka records.
5. Retention is independent of consumption.
6. `acks=all` alone is not enough; ISR and `min.insync.replicas` matter.
7. ISR is not synonymous with all configured replicas.
8. Producer idempotence prevents duplicate retry appends to Kafka, not duplicate business side effects.
9. Kafka EOS does not atomically include arbitrary external databases.
10. `read_committed` matters for transactional visibility.
11. KRaft replaces ZooKeeper metadata management, not topic data replication.
12. New Consumer protocol is GA but opt-in in Kafka 4.x clients.
13. Classic consumer protocol is on a deprecation path.
14. Compaction is asynchronous; it does not instantly leave one record per key.
15. Increasing partitions can affect key mapping.
16. Connect is a runtime/framework, not just connector files.
17. Streams is a client library, not a separate broker service.
18. Replaying can repeat real-world side effects unless handlers are replay-safe.
19. MirrorMaker does not make the entire business system disaster-recovered.
20. Kafka is not always the right choice for a simple low-volume work queue.
