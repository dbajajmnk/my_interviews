# AWS Lambda

## What

Event-driven serverless compute.

## Flow

```text
Event
 ↓
Lambda
 ↓
business logic
 ↓
service/database
```

## Sources

```text
API Gateway
S3
SQS
EventBridge
DynamoDB Streams
Kinesis
```

## Good Fits

```text
bursty workloads
event processing
API backends
automation
short-lived jobs
```

## Design Concerns

```text
timeouts
concurrency
cold starts
idempotency
retries
DLQ/destinations
VPC networking
```

## Trap

Lambda concurrency can overwhelm databases/downstream APIs if unbounded.
