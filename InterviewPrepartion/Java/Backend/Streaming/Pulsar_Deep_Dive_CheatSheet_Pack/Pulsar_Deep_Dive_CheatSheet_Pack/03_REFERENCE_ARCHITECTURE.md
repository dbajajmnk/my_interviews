# Pulsar Reference Architecture

```text
Clients
  │
  ▼
Pulsar Brokers  ←── Metadata Store
(stateless)
  │
  ▼
Managed Ledger
  │
  ▼
Apache BookKeeper
 ├─ Bookie A
 ├─ Bookie B
 └─ Bookie C

Administrative hierarchy:
Tenant
  ↓
Namespace
  ↓
Topic / Partition
  ↓
Subscription
  ↓
Consumer(s)
```

## Cross-Cutting
```text
Schemas
Functions
Pulsar IO
Tiered Storage
Geo Replication
Security
Isolation
Throttling
Prometheus/Grafana
Transactions
```
