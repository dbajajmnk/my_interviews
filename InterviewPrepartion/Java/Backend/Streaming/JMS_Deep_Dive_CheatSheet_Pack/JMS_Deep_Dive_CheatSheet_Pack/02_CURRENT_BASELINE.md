# Current Baseline — Jakarta Messaging 3.1

## Specification
- **Jakarta Messaging 3.1**
- Jakarta EE 10 release
- Maven: `jakarta.jms:jakarta.jms-api:3.1.0`
- Minimum Java SE: **11+**

## Lineage
```text
JMS 1.x
  ↓
JMS 2.0
  ↓
Jakarta Messaging 3.0
  ↓
Jakarta Messaging 3.1
```

## Namespace Migration
```java
javax.jms.*
    ↓
jakarta.jms.*
```

## Architectural Boundary
Jakarta Messaging standardizes Java messaging APIs and semantics.

It does not standardize:
- broker administration
- wire protocol
- security/privacy configuration
- persistence architecture
- clustering/HA topology
- DLQ/redelivery policy
- provider monitoring

Those remain provider-specific.
