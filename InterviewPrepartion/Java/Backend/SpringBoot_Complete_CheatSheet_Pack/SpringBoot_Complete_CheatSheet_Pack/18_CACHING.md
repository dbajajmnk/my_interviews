# Caching Cheat Sheet

## Annotations
`@Cacheable`, `@CachePut`, `@CacheEvict`.

## Flow
```text
Request → Cache Lookup ─Hit→ Return
                   └─Miss→ Source/DB → Cache → Return
```

## Good Candidates
Expensive repeated reads with safe staleness tolerance.

## Hard Problems
Invalidation, TTL, consistency, stampede, memory growth, distributed cache failure.

## Trap
Caching the wrong data makes correctness harder rather than performance better.
