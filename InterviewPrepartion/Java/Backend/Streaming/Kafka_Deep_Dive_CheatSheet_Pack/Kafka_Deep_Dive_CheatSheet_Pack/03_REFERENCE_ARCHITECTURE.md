# Kafka Reference Architecture

```text
                 KRaft Controller Quorum
                           │
          ┌────────────────┼────────────────┐
          ▼                ▼                ▼
       Broker 1         Broker 2         Broker 3
       P0 Lead          P0 Follow        P0 Follow
       P1 Follow        P1 Lead          P1 Follow
       P2 Follow        P2 Follow        P2 Lead
          ▲                ▲                ▲
          └──────── Producers / Consumers ──┘

Platform:
Schema Governance • Connect • Streams • ACL/TLS • Metrics
Quotas • Tiered Storage • MirrorMaker/DR • IaC
```
