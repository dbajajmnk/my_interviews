# Kafka — 30-Second Recall

```text
Producer → Topic → Partition Leader → Replicated Log
                                  ↓
                        Consumer Group offsets
```

**Topic** = logical stream  
**Partition** = order + parallelism + replication unit  
**Offset** = position  
**Key** = partition/order domain  
**KRaft** = metadata/control plane  
**Consumer Group** = one partition owner per group member  
**Share Group** = queue-like record sharing and per-record acknowledgement

**Durability:** `RF + ISR + min.insync.replicas + acks=all`

**Reliability:** producer idempotence + consumer idempotency + outbox + transactions where scope fits.
