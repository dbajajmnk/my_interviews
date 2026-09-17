# Pulsar Interview Traps

1. Pulsar broker and storage layers are separated.
2. Persistent topic data is stored in BookKeeper, not owned durably by the serving broker.
3. A broker failure does not imply topic data loss if BookKeeper remains healthy.
4. Managed Ledger is composed of BookKeeper ledgers.
5. Ensemble size, write quorum and ack quorum are distinct.
6. Subscription is more than a consumer group name; it owns cursor/backlog and dispatch semantics.
7. Shared subscription does not guarantee ordering.
8. Key_Shared requires stable keys and compatible batching.
9. Failover is active-standby, not parallel load balancing.
10. Exclusive allows only one consumer.
11. Reader is not the same as Consumer.
12. Backlog and retention are different concepts.
13. Retention can preserve already acknowledged data.
14. Topic compaction is not the same as retention.
15. Geo-replication is asynchronous and local-first.
16. Geo-replication replicates topic data; subscriptions are cluster-local by default.
17. Transactions span Pulsar topics/partitions, not arbitrary external DBs.
18. Deduplication does not eliminate duplicate business side effects outside Pulsar.
19. Functions at-least-once is the default processing guarantee.
20. IO sink guarantees depend on the external sink implementation too.
21. Tiered storage offloads sealed ledgers, not the active ledger.
22. Tiered storage reads remain transparent to consumers but have different latency.
23. Multi-tenancy is first-class through tenants and namespaces.
24. Namespace bundle is a broker load-balancing unit.
25. Bookie scaling and broker scaling solve different bottlenecks.
26. Metadata-store availability affects coordination even if BookKeeper data remains.
27. Pulsar 5.0.0-M1 is preview, not production GA.
28. Latest stable does not always mean best support horizon: 4.0.x is the current LTS line.
29. Pulsar is not simply “Kafka plus queues.”
30. Kafka compatibility layers do not erase architectural differences.
