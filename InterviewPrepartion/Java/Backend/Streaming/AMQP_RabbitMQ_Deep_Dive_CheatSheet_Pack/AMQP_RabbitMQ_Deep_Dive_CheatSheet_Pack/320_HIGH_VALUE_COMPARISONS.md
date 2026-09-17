# RabbitMQ — High-Value Comparisons

## Exchange Types
| Type | Match |
|---|---|
| Direct | exact routing key |
| Topic | wildcard routing pattern |
| Fanout | all bindings |
| Headers | header criteria |

## Classic vs Quorum vs Stream
| Classic | Quorum | Stream |
|---|---|---|
| simple queue | replicated Raft queue | retained replicated log |
| non-replicated typical | HA/data safety | replay/fanout/backlog |
| lowest complexity | majority required | offset consumption |

## Publisher Confirm vs Consumer Ack
| Publisher Confirm | Consumer Ack |
|---|---|
| broker → publisher | consumer → broker |
| publish responsibility | processing responsibility |
| prevents unknown unsafe publish state | controls message removal/redelivery |

## Reject vs Nack
| Reject | Nack |
|---|---|
| one delivery | one or multiple |
| AMQP method | RabbitMQ AMQP 0-9-1 extension |

## RabbitMQ vs Kafka
| RabbitMQ | Kafka |
|---|---|
| exchanges/queues | topics/partitions |
| broker routing | partition selection |
| ack/delete queue work | retained log + offsets |
| strong work-queue semantics | strong replay/event-stream semantics |

## RabbitMQ vs JMS
RabbitMQ is a broker/product with protocols and implementation semantics. JMS is a Java messaging API specification.
