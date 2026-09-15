# Spring Boot 3 → 4 Migration Recall

## Review Areas
Java baseline, Spring Framework baseline, Jakarta APIs, removed/deprecated APIs, auto-config changes, properties, testing APIs, security, Jackson behavior, observability, build plugins, third-party starters.

## Safe Flow
```text
Read release notes → Upgrade latest supported patch → Remove deprecations
→ Upgrade major baseline → Compile → Unit tests → Integration/contract tests
→ Compare runtime behavior → Load/performance check → Controlled rollout
```

## Current Context
Spring Boot 4.x is the current active stable generation. Spring Boot 3.5.16 was announced as the final OSS 3.5.x release.

## Trap
Do not simultaneously change framework major version, Java baseline, architecture and infrastructure without evidence and rollback plans.
