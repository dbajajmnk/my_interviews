# Connection Client ID

## What / Why
Identifier used by durable subscriptions and provider behavior.

## Visual
```text
Connection Client ID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Client ID:** Identifier used by durable subscriptions and provider behavior.
