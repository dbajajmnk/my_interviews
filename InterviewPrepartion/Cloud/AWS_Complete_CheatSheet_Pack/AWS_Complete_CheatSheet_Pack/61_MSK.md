# Amazon MSK

## What

Managed Apache Kafka service.

## Good Fits

```text
Kafka ecosystem
event streaming
high-throughput durable logs
consumer groups
existing Kafka applications
```

## Compare

```text
MSK → Kafka semantics/ecosystem
Kinesis → AWS-managed native stream
SQS → queue
EventBridge → event routing
```

## Trap

Kafka introduces partitioning, consumer lag, schema, and operational design concerns even when infrastructure is managed.
