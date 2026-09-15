# Logging

## Structured Log

```json
{
  "service":"order",
  "traceId":"abc",
  "orderId":"123",
  "event":"order_created"
}
```

## Include

- service
- environment
- trace/correlation ID
- event
- safe business ID

## Avoid

```text
passwords
tokens
PII
raw secrets
```

## Trap

Logs without correlation IDs are difficult to use in distributed systems.
