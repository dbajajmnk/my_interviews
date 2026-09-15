# Migration from Java 8 to Java 17

## Safe Migration Flow

```text
Inventory dependencies
 ↓
Upgrade build plugins
 ↓
Compile on modern JDK
 ↓
Fix removed/deprecated APIs
 ↓
Fix JDK-internal access
 ↓
Upgrade frameworks/libraries
 ↓
Run unit tests
 ↓
Run integration tests
 ↓
Performance test
 ↓
Observe in staging
 ↓
Controlled rollout
```

## Common Risk Areas

```text
sun.* / internal APIs
reflection
old bytecode tooling
old mocking libraries
JAXB/JAX-WS assumptions
TLS / crypto changes
GC flags
container behavior
old application servers
illegal reflective access
```

## Architecture Rule

Do not mix:
- JDK migration
- framework major migration
- database migration
- architecture redesign

into one uncontrolled change unless unavoidable.

## Interview Answer

The hardest part of 8→17 migration is usually **ecosystem compatibility and internal API assumptions**, not language syntax.
