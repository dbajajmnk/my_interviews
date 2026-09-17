# Pulsar Troubleshooting — Golden Flow

```text
1. Client / Lookup
   ├─ service URL?
   ├─ auth?
   └─ topic owner?

2. Broker
   ├─ owns topic?
   ├─ throttled?
   ├─ cache/memory?
   └─ producer/consumer stats?

3. Managed Ledger / BookKeeper
   ├─ quorum healthy?
   ├─ bookie disk/journal?
   ├─ under-replicated?
   └─ ledger recovery?

4. Subscription
   ├─ correct type?
   ├─ cursor/backlog?
   ├─ unacked?
   └─ redelivery/DLQ?

5. Downstream
   ├─ handler errors?
   ├─ idempotency?
   └─ business dependency?
```
