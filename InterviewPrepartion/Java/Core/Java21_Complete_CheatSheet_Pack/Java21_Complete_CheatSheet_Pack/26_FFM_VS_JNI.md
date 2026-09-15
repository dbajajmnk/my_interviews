# FFM vs JNI

| FFM API | JNI |
|---|---|
| modern Java API | native interface model |
| structured memory access | more manual native glue |
| linker abstractions | native wrapper code common |
| easier composition | verbose and fragile |
| preview in Java 21 | long-standing final mechanism |

## Use Case

Calling:

```text
C libraries
native operating-system APIs
high-performance native code
```

## Rule

In Java 21, FFM is preview.

JNI remains relevant for stable production use where preview APIs are not allowed.
