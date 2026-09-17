# Sources & Accuracy Notes

Baseline verified against official Apache Kafka 4.3.x documentation.

Current facts used:
- Kafka 4.3.1 released June 25, 2026.
- KIP-848 next-generation Consumer rebalance protocol GA since Kafka 4.0.
- Share Groups / Queues for Kafka production-ready since Kafka 4.2.
- Producer idempotence defaults on when configurations do not conflict.
- Kafka 4.3 exposes Producer, Consumer, Share Consumer, Streams, Connect and Admin APIs.
- Tiered Storage uses pluggable RemoteStorageManager/remote-log metadata architecture.

Always verify exact client/broker patch compatibility and configuration docs for production.
