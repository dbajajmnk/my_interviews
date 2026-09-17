# Rebalance Storms

## What / Why
Usually caused by slow polls, crashes, deployments or unstable settings.

## Visual
```text
Rebalance Storms → Kafka partition/log semantics
```

## How to Think About It
- Identify the partition/log boundary.
- Define ownership and ordering.
- Define failure and replay behavior.
- Define durability and delivery semantics.
- Measure before tuning.

## Real-Life Analogy
Kafka is like a replicated chronological ledger. Producers append; partitions are separate ordered ledgers; each consumer group keeps its own bookmark.

## Production Questions
```text
Key strategy?
Partition count?
Replication / ISR?
acks / minISR?
Retention / compaction?
Schema contract?
Consumer idempotency?
Lag / rebalance?
Security / ACL?
Replay safety?
```

## Interview Trap
Tie this topic back to **partitions, offsets, replication, failure, and delivery semantics**. Kafka answers that ignore those relationships are usually incomplete.

## 20-Second Recall
> **Rebalance Storms:** Usually caused by slow polls, crashes, deployments or unstable settings.
