# Spring Data / JPA — 30-Second Recall

```text
Controller
   ↓
Service @Transactional
   ↓
Spring Data Repository
   ↓
EntityManager
   ↓
Persistence Context
   ↓
Hibernate / JPA Provider
   ↓
JDBC
   ↓
Database
```

## Entity Lifecycle
```text
Transient
  └─ persist → Managed
Managed
  ├─ dirty checking → SQL on flush
  ├─ remove → Removed
  └─ detach/clear/close → Detached
Detached
  └─ merge → managed copy
```

## Golden Rules
```text
JPA = specification
Hibernate = provider
Spring Data JPA = repository abstraction
Transaction = business boundary
LAZY/EAGER != SQL strategy
N+1 must be measured
save() != always INSERT
```
