# Pulsar Functions Mental Model

## What / Why
Lightweight serverless compute framework consuming topics and producing outputs.

## Visual
```text
Pulsar Functions Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Functions Mental Model:** Lightweight serverless compute framework consuming topics and producing outputs.
