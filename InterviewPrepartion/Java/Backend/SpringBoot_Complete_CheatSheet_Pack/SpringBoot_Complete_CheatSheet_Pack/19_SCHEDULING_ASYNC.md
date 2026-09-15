# Scheduling & Async Execution

## Scheduling
`@Scheduled(fixedRate=...)`, `@Scheduled(fixedDelay=...)`, `@Scheduled(cron="...")`.

## Async
```java
@Async
public CompletableFuture<Result> process() { ... }
```

## Ask
Can jobs overlap? One node or all nodes? Retry? Ordering? Durability? Monitoring?

## Traps
- `@Scheduled` can run on every replica unless coordinated.
- `@Async` is not a durable queue or workflow engine.
