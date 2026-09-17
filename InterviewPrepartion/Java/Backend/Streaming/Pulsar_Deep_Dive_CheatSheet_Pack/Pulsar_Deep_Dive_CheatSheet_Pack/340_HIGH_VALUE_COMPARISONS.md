# Pulsar — High-Value Comparisons

## Subscription Types
| Type | Consumers | Ordering |
|---|---:|---|
| Exclusive | 1 active | strongest/simple |
| Failover | active + standby | per partition active consumer |
| Shared | many | no ordering guarantee |
| Key_Shared | many | same key kept together |

## Pulsar vs Kafka
| Pulsar | Kafka |
|---|---|
| stateless brokers | brokers also host partition storage |
| BookKeeper storage | broker-local log storage + tiering |
| subscription types | consumer groups/share groups |
| tenant/namespace first-class | topic/group administrative model |
| native geo replication | cross-cluster replication tooling |

## Pulsar vs RabbitMQ
| Pulsar | RabbitMQ |
|---|---|
| messaging + retained streaming | exchange/queue broker + streams |
| BookKeeper | queue/stream storage inside RabbitMQ cluster |
| Exclusive/Failover/Shared/Key_Shared | competing consumers/SAC |
| built-in tenants/namespaces | vhosts |

## Reader vs Consumer
| Reader | Consumer |
|---|---|
| explicit MessageId cursor | subscription cursor |
| replay-oriented | delivery semantics |
| no normal subscription ownership | durable subscription state |

## Retention vs Backlog
| Retention | Backlog |
|---|---|
| acknowledged history kept by policy | unread/unacked subscription data |
| supports replay | driven by cursor position |
