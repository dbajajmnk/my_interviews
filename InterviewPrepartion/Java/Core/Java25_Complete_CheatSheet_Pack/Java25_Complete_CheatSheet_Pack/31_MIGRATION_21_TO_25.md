# Java 21 → Java 25 Migration

## Safe Flow

```text
Inventory
 ↓
Update build/toolchain
 ↓
Run on JDK 25
 ↓
Fix library/agent incompatibility
 ↓
Regression tests
 ↓
Performance baseline
 ↓
Staging
 ↓
Controlled rollout
```

## Then Modernize

Evaluate separately:

```text
Scoped Values
Compact Headers
AOT
KDF
new language features
JFR improvements
```

## Risk Areas

- bytecode agents
- profilers
- instrumentation
- JVM flags
- frameworks
- native dependencies
- preview-feature code

## Rule

Migration first.

Feature adoption second.
