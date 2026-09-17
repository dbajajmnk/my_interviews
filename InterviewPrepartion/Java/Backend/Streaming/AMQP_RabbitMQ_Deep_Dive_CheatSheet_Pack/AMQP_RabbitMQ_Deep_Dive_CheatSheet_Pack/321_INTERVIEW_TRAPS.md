# RabbitMQ Interview Traps

1. AMQP 0-9-1 and AMQP 1.0 are different protocol models, not simply minor revisions.
2. Exchange stores/routs publishes; queues hold deliveries.
3. A routing key is not a queue name except with conveniences such as the default exchange.
4. Publisher confirm and consumer acknowledgement solve opposite reliability directions.
5. Socket write does not prove RabbitMQ safely accepted a message.
6. Auto-ack can lose work if consumer fails after delivery.
7. Manual ack can cause redelivery; consumer must be idempotent.
8. Immediate requeue can create redelivery storms.
9. Prefetch is not merely a performance knob; it limits in-flight unacked work.
10. Quorum Queue is the modern replicated HA queue choice.
11. Classic mirrored queues are removed in RabbitMQ 4.x.
12. Quorum Queue majority is required for progress.
13. More quorum replicas do not help if you lose the majority.
14. Streams are not the same as queues; they retain data and support replay.
15. RabbitMQ Stream SAC differs from queue SAC.
16. Fanout exchange does not mean one shared queue; subscribers usually need separate queues for independent copies.
17. One queue with many consumers is competing consumers, not pub/sub.
18. Persistent delivery mode alone is not sufficient for end-to-end safety.
19. Durable exchange/queue does not make consumers idempotent.
20. DLQ is not a retry strategy by itself.
21. TTL + DLX can create delayed retry patterns.
22. RabbitMQ cluster metadata replication does not mean every queue's data exists on every node.
23. Stretching one RabbitMQ cluster across unreliable WAN is usually the wrong geo strategy.
24. Federation and Shovel solve different inter-broker movement problems.
25. JMS portability does not expose every RabbitMQ-native feature cleanly.
