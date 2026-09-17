# RabbitMQ Reference Architecture

```text
                RabbitMQ Cluster
      ┌─────────────┬─────────────┐
      ▼             ▼             ▼
    Node A        Node B        Node C
      │             │             │
      └──── Quorum Queue Raft ────┘
                / Stream replicas

Publisher
   │
   ▼
Exchange
 ├─ direct
 ├─ topic
 ├─ fanout
 └─ headers
   │
Bindings
   │
   ▼
Queue / Quorum Queue / Stream
   │
   ▼
Consumer(s)
   │
ack / nack / reject

Cross-cutting:
TLS • Auth • VHosts • Permissions • Policies
Confirms • Prefetch • DLX • TTL • Observability
Federation • Shovel • Prometheus • Management
```
