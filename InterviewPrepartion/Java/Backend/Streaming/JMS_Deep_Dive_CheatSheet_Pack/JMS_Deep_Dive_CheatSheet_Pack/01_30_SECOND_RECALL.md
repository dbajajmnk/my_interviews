# JMS / Jakarta Messaging — 30-Second Recall

```text
ConnectionFactory
      ↓
Connection / JMSContext
      ↓
Session
 ├── Producer → Queue / Topic
 └── Consumer ← Queue / Subscription
```

## Queue
```text
Producer → Queue → one consuming path
```

## Topic
```text
Publisher → Topic
              ├→ Subscription A
              └→ Subscription B
```

## Reliability
```text
PERSISTENT delivery
+ correct ack/transaction
+ provider HA/persistence
+ idempotent consumer
```

## Key Rule
**JMS is a Java API specification.**
It does **not** define the broker, administration model, security configuration, or wire protocol.
