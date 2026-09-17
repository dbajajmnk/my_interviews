# JMS Troubleshooting — Golden Flow

```text
1. Naming / Configuration
   ├─ ConnectionFactory?
   └─ Destination?

2. Connection / Session
   ├─ connected?
   ├─ Connection.start?
   └─ transaction/ack mode?

3. Producer
   ├─ destination?
   ├─ persistence?
   ├─ selector-relevant properties?
   └─ send/async completion?

4. Provider
   ├─ message present?
   ├─ expired?
   ├─ DLQ/redelivery?
   └─ HA/storage/security?

5. Consumer
   ├─ queue/topic subscription?
   ├─ client ID / durable name?
   ├─ selector?
   └─ ack/rollback?

6. Business Effect
   ├─ idempotency?
   ├─ DB transaction?
   └─ downstream failure?
```
