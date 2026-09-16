# Spring Data / JPA Reference Architecture

```text
HTTP / Messaging
      ↓
Application Service
   @Transactional
      ↓
Repository Interface
      ↓
Spring Data Repository Proxy
      ↓
EntityManager
      ↓
Persistence Context
 ┌────┼──────────────┐
 ↓    ↓              ↓
L1   Dirty         Query
Cache Checking     Engine
      ↓
JPA Provider (Hibernate)
      ↓
JDBC / Connection Pool
      ↓
Relational Database
```

## Cross-Cutting
```text
Entity mappings
Transactions
Locks
Fetch plans
Auditing
Migrations
SQL diagnostics
Caching
Multi-tenancy
Security
```
