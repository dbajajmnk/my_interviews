# Security Manager — Deprecated for Removal

## Java 17 Change

The Java Security Manager was deprecated for removal.

## Why It Matters

Do not design new Java security architecture around Security Manager sandboxing.

## Modern Security Controls

Prefer:

```text
OS / container isolation
Least privilege
Process boundaries
Network policies
IAM
Secrets management
Application authorization
Dependency security
```

## Interview Position

Security Manager is a historical JVM sandbox mechanism whose long-term removal was signaled in Java 17.
