# Sources & Accuracy Notes

Primary current references:
- Spring Data JPA 4.1.1 official reference
- Jakarta Persistence 3.2 specification/Javadoc
- Hibernate ORM 7.4 current documentation for provider-specific awareness

Current verified baseline:
- Spring Data JPA 4.1.1 is current stable.
- 4.2.0-M1 is preview.
- Jakarta Persistence 3.2 is final and part of Jakarta EE 11.
- Persistence 3.2 adds record embeddables, Instant/Year, query set operations, cast, string functions, id/version functions, null precedence, getSingleResultOrNull and Criteria enhancements.
- Hibernate ORM 7.4.8.Final is latest stable Hibernate line as of September 13, 2026.

Use Spring Boot dependency management to determine the supported Spring Data JPA/Hibernate combination for an actual project.
