# Apache Pulsar — 30-Second Recall

```text
Producer
   ↓
Broker (stateless serving layer)
   ↓
Managed Ledger
   ↓
Apache BookKeeper Bookies
   ↓
Subscription Cursor
   ↓
Consumer
```

## Platform Hierarchy
```text
Instance
 → Cluster
   → Tenant
     → Namespace
       → Topic
         → Partition(s)
```

## Subscription Types
```text
Exclusive  → one consumer
Failover   → active + standby
Shared     → parallel workers, no order guarantee
Key_Shared → parallel workers + per-key affinity/order
```

## Architecture Formula
```text
Stateless Brokers
+ BookKeeper Durable Storage
+ Metadata Store
+ Native Multi-Tenancy
+ Subscription Cursors
+ Geo Replication
```
