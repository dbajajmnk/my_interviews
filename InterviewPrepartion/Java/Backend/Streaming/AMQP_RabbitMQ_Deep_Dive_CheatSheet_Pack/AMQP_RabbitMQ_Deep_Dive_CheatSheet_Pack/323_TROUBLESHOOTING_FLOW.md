# RabbitMQ Troubleshooting — Golden Flow

```text
1. Publisher
   ├─ connected?
   ├─ blocked?
   ├─ confirm?
   └─ mandatory return?

2. Exchange / Routing
   ├─ exchange exists?
   ├─ correct type?
   ├─ routing key?
   └─ binding exists?

3. Queue
   ├─ correct queue type?
   ├─ ready/unacked depth?
   ├─ quorum majority?
   └─ TTL/DLX/limit?

4. Consumer
   ├─ registered?
   ├─ prefetch?
   ├─ ack/nack?
   └─ repeated redelivery?

5. Business Handler
   ├─ downstream dependency?
   ├─ idempotency?
   ├─ retry?
   └─ DLQ?
```

Do not start by increasing prefetch or memory limits before locating the failing layer.
