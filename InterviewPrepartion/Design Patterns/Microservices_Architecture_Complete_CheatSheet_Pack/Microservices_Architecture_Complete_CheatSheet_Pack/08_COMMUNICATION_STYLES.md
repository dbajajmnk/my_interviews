# Communication Styles

## Synchronous

```text
HTTP/REST
gRPC
request-response
```

## Asynchronous

```text
events
commands
queues
topics
streams
```

## Decision

Use sync when:

```text
caller needs immediate result
latency is acceptable
availability dependency is acceptable
```

Use async when:

```text
decoupling matters
work can continue later
buffering is useful
eventual consistency acceptable
```

## Trap

Async messaging reduces temporal coupling, not logical coupling.
