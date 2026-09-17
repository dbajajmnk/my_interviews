# Kafka Production Checklist

## Cluster
- KRaft quorum failure tolerance
- broker/storage/network headroom
- rack-aware replica placement
- tested rolling restart/upgrade

## Topic
- owner
- key/partition strategy
- RF and minISR
- retention/compaction
- schema compatibility
- ACL/data classification

## Producer
- acks
- idempotence
- batching/linger/compression
- delivery timeout
- transactions only where justified

## Consumer
- group/share-group model
- commit strategy
- idempotency
- max processing time
- lag/rebalance alerts
- replay-safe side effects

## Operations
- URP/offline partitions
- controller quorum
- disk/network
- schema failures
- DR/failover drills
