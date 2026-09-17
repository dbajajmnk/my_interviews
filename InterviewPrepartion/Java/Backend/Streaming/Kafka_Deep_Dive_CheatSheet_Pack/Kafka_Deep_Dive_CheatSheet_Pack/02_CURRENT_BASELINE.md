# Kafka 4.3.1 — Current Baseline

- Current supported release used here: **Apache Kafka 4.3.1**, released June 25, 2026.
- Kafka 4.x is KRaft-era Kafka; ZooKeeper is legacy knowledge.
- Next-generation Consumer rebalance protocol is GA since Kafka 4.0.
- In Kafka 4.x, clients opt in with `group.protocol=consumer`.
- Share Groups / Queues for Kafka are production-ready since Kafka 4.2.
- Kafka 4.3 includes additional Share Group controls and starts the classic consumer-protocol deprecation path.
- Producer idempotence is enabled by default when configs do not conflict.
- Kafka 4.3.1 fixes a critical Kafka Streams RocksDB native-memory leak from 4.3.0.

Use exact patch-version docs before production configuration changes.
