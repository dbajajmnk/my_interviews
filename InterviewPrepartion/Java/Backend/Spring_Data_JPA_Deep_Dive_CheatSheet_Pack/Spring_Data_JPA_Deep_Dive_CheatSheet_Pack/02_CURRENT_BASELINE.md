# Current Baseline — September 2026

## Spring Data JPA
**4.1.1** is the current stable Spring Data JPA line.

Other official lines:
- 4.0.7 stable
- 3.5.13 stable
- 4.2.0-M1 preview

## Jakarta Persistence
**Jakarta Persistence 3.2** is the current final specification.

Selected 3.2 additions:
- record embeddables
- `Instant` and `Year` mappings
- JPQL/Criteria `union`, `intersect`, `except`
- `cast`, `left`, `right`, `replace`
- `id()` and `version()`
- null precedence in ordering
- `getSingleResultOrNull()`
- expanded Criteria API support

## Hibernate Awareness
Hibernate ORM **7.4.8.Final** is the latest stable provider line as of September 13, 2026.

Use Spring Boot dependency management for the actual application combination instead of manually forcing unrelated Spring Data/Hibernate versions.
