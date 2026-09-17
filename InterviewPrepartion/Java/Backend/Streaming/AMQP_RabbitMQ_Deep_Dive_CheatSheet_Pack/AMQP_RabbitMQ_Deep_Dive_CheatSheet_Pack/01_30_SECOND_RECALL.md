# AMQP / RabbitMQ — 30-Second Recall

```text
Publisher
   ↓
Exchange
   ↓ routing
Binding(s)
   ↓
Queue / Quorum Queue / Stream
   ↓
Consumer
```

## AMQP 0-9-1
```text
Connection → Channels
Exchange → Binding → Queue
basic.publish
basic.consume
basic.ack / nack / reject
publisher confirms
prefetch
```

## Reliability
```text
Durable queue
+ persistent message
+ publisher confirm
+ manual consumer ack
+ idempotent consumer
+ quorum queue when replicated safety is required
```

## Queue Choice
```text
Simple/non-replicated queue → Classic
Replicated HA work queue → Quorum
Replay/very large backlog/fanout → Stream
```

## Critical Distinction
Publisher Confirm != Consumer Acknowledgement.
They protect opposite sides of the broker.
