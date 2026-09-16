# Spring Data / JPA Interview Traps

1. JPA is not Hibernate.
2. Spring Data JPA is not JPA itself.
3. EntityManager is not a repository.
4. Persistence context is a first-level cache and identity map.
5. `persist()` and `merge()` have different semantics.
6. `merge()` returns the managed instance; the argument remains detached.
7. `save()` may call persist or merge.
8. Calling `save()` on an already managed entity is usually unnecessary.
9. Dirty checking happens on managed entities.
10. SQL may execute at flush, not where setter/save appears in code.
11. Flush is not commit.
12. AUTO flush may happen before a query.
13. EAGER does not mean JOIN.
14. LAZY does not always mean an extra query if fetch plan overrides it.
15. To-one defaults are EAGER in JPA.
16. To-many defaults are LAZY.
17. N+1 can happen with EAGER associations too.
18. Fetch join plus collection pagination is dangerous.
19. `@EntityGraph` controls fetch plan, not authorization.
20. Cascade is not fetch strategy.
21. orphanRemoval is not identical to cascade REMOVE.
22. Bidirectional associations must be synchronized in Java.
23. Many-to-many often deserves an association entity.
24. Bulk JPQL update bypasses dirty checking/entity callbacks.
25. Bulk updates can stale the persistence context.
26. CLIENT-side UUID/sequence strategy can batch inserts better than IDENTITY in many setups.
27. `saveAll()` alone does not guarantee JDBC batching.
28. First-level cache cannot be disabled like L2 cache.
29. L2 cache is provider-specific/optional.
30. Query cache is not a magic general-purpose cache.
31. `@Transactional(readOnly=true)` is not a security boundary.
32. Self-invocation can bypass proxy-based transactions.
33. Long transactions across remote calls exhaust connections/locks.
34. Optimistic locking detects conflicts; it does not prevent them.
35. Pessimistic locks can deadlock.
36. H2 passing tests do not guarantee production DB SQL behavior.
37. JPA is blocking; wrapping JpaRepository in Mono does not make it reactive.
38. DTO projections are often better than entities for read APIs.
39. Page can issue an expensive count query.
40. Keyset scrolling needs stable unique ordering.
