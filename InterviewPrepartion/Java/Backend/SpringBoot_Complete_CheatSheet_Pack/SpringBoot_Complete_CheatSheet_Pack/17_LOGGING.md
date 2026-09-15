# Logging Cheat Sheet

## Levels
`TRACE → DEBUG → INFO → WARN → ERROR`

## Good Fields
Timestamp, level, service, environment, trace/correlation ID, request ID, event, safe business ID.

## Never Log
Passwords, access tokens, secrets, card data, unnecessary sensitive personal data.

```java
log.info("order_created orderId={} customerId={}", orderId, customerId);
```

## Rule
Logs should explain events, not dump the universe. Correlate them with traces.
