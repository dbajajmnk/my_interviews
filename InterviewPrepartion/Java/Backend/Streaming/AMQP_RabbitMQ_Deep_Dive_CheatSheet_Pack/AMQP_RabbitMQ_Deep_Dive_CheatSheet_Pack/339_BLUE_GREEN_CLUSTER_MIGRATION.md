# Blue Green Cluster Migration

## What / Why
Stand up target cluster and move traffic/data using Shovel/Federation/application cutover.

## Visual
```text
Blue Green Cluster Migration → RabbitMQ messaging flow
```

## How to Think About It
- Separate **publisher → broker** reliability from **broker → consumer** reliability.
- Define exchange, routing, queue type and acknowledgement semantics explicitly.
- Treat retries/redelivery as normal distributed-system behavior.
- Match queue type to backlog, HA and replay requirements.

## Real-Life Analogy
RabbitMQ is like a **postal sorting center**: publishers hand parcels to an exchange, routing rules determine which mailbox/queue receives them, and consumers acknowledge after safely handling them.

## Production Questions
```text
Exchange type?
Routing key?
Queue type?
Durable?
Publisher confirms?
Manual ack?
Prefetch?
Retry/DLX?
Idempotency?
HA/replicas?
Security?
Backlog capacity?
```

## Interview Trap
Always distinguish **routing semantics**, **queue semantics**, **publisher confirms**, and **consumer acknowledgements**. They solve different problems.

## 20-Second Recall
> **Blue Green Cluster Migration:** Stand up target cluster and move traffic/data using Shovel/Federation/application cutover.
