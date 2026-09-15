# ScopedValue vs ThreadLocal

| ThreadLocal | ScopedValue |
|---|---|
| mutable per-thread state | immutable scoped binding |
| cleanup discipline required | lexical/bounded scope |
| familiar legacy approach | better structured-context model |
| can be problematic at scale | designed with modern concurrency in mind |
| final API | preview in Java 21 |

## Typical Context

```text
request ID
user identity
trace context
tenant context
```

## Rule

Do not replace ThreadLocal mechanically.

Adopt ScopedValue only when preview-feature policy allows it.
