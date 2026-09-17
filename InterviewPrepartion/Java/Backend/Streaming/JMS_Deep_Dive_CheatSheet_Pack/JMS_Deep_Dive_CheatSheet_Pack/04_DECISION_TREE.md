# JMS Decision Tree

```text
Java application needs portable brokered messaging API?
→ JMS / Jakarta Messaging candidate

One message should be handled by one consuming path?
→ Queue

Every subscriber needs its own copy?
→ Topic

Subscriber must receive messages while offline?
→ Durable subscription

Multiple consumers need to share one topic subscription?
→ Shared durable/non-durable subscription

Need atomic JMS-only receive/send?
→ Local transacted Session

Need DB + JMS atomic transaction?
├─ XA/JTA justified and provider supports it → XA
└─ Prefer simpler distributed architecture → Outbox + idempotency

Need polyglot native broker features?
→ Use provider protocol/API where portability is less important
```
