# ScopedValue vs ThreadLocal

| ThreadLocal | ScopedValue |
|---|---|
| mutable per-thread storage | immutable scoped binding |
| manual cleanup discipline | bounded automatically |
| can leak across pooled threads | binding ends with scope |
| inheritance can be costly | designed for structured inheritance |
| longstanding API | final since Java 25 |

## Best ScopedValue Use

```text
one-way context transmission
```

Examples:

```text
tenant
request identity
trace info
authorization context
```

## Rule

Use ThreadLocal when mutable per-thread state is genuinely needed.

Prefer ScopedValue for bounded immutable context.
