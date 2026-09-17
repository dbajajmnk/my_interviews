# JMS Production Readiness Checklist

## API / Contract
- jakarta.jms version
- queue vs topic
- durable/shared subscription
- payload format/schema
- message properties/selectors
- provider extension usage documented

## Reliability
- delivery mode
- ack mode
- local/JTA/XA transaction decision
- idempotent consumer
- provider redelivery/DLQ
- timeout/TTL
- poison message handling

## Runtime
- pooled/reused connections
- session/thread ownership
- consumer concurrency
- provider HA
- capacity/backlog
- failover testing

## Security
- TLS
- credentials
- destination authorization
- secrets management
- no unsafe ObjectMessage from untrusted sources

## Operations
- queue/subscription depth
- redelivery/DLQ
- transaction rollback
- provider health
- publish/consume latency
- trace/correlation IDs
