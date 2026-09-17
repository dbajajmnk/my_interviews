# Pulsar Production Readiness Checklist

## Platform
- metadata-store quorum
- broker capacity
- BookKeeper ensemble/write/ack quorum
- journal/ledger disk layout
- failure/recovery headroom

## Governance
- tenant owner
- namespace policies
- permissions
- isolation
- throttling
- backlog quota
- retention

## Topics
- persistent/non-persistent
- partition count
- schema
- compaction
- tiered storage
- geo replication

## Consumers
- correct subscription type
- ack strategy
- redelivery/backoff
- DLQ
- idempotency
- replay safety

## Operations
- broker ownership/load
- BookKeeper under-replication
- metadata health
- backlog age
- geo replication lag
- offload failures
- DR/failover drills
