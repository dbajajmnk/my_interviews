# JMS — High-Value Comparisons

## Classic vs Simplified API
| Classic | Simplified |
|---|---|
| Connection + Session | JMSContext |
| MessageProducer | JMSProducer |
| MessageConsumer | JMSConsumer |
| checked JMSException | more JMSRuntimeException |
| explicit Connection.start | context starts delivery automatically |

## Queue vs Topic
| Queue | Topic |
|---|---|
| one consuming path | copy per subscription |
| competing consumers | independent subscribers |
| backlog belongs to queue | backlog belongs to durable subscription |

## AUTO vs CLIENT vs DUPS_OK
| AUTO | CLIENT | DUPS_OK |
|---|---|---|
| automatic | app calls acknowledge | lazy provider ack |
| simple | explicit control | duplicates acceptable |

## Local Transaction vs XA
| Local JMS Tx | XA/JTA |
|---|---|
| one Session | multiple resources |
| commit/rollback Session | transaction manager |
| simpler | heavier coordination |

## JMS vs AMQP
| JMS | AMQP |
|---|---|
| Java API specification | wire protocol family |
| provider-neutral Java semantics | protocol interoperability |
| no wire format | wire-level model |

## JMS vs RabbitMQ / Kafka / Pulsar
JMS is an API abstraction. RabbitMQ, Kafka and Pulsar are concrete messaging/streaming platforms with their own protocols and operational models.
