# Messaging Integration Map

```text
Producer → Broker/Topic/Queue → Consumer → Business Handler → DB/External API
```

## Recall
Producer, consumer, partition/queue, group, offset/ack, retry, dead-letter handling, ordering, idempotency, duplicates.

## Rule
Design handlers for safe redelivery/idempotency where required.

## Boundary
Kafka, AMQP/RabbitMQ, JMS and Pulsar each deserve dedicated deep-dive cheat sheets; this file covers their Spring Boot integration role.
