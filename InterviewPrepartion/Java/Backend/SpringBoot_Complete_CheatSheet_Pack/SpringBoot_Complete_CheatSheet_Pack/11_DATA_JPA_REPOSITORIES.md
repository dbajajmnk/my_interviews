# Spring Data JPA & Repositories

## Stack
```text
Service → Repository → EntityManager/JPA → Hibernate (common provider) → JDBC → DB
```

## Repository
```java
interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
```

## Query Options
Derived methods, JPQL, native SQL, specifications/criteria, projections.

## Must Remember
JPA = specification/API model. Hibernate = common provider.

## Performance Traps
N+1 selects, eager fetching everywhere, full entities for simple reads, huge transactions, unbounded pagination, missing indexes.

## Production Rule
Inspect generated SQL and query plans for important endpoints.
