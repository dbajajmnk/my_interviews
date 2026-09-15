# Spring Boot Complete Cheat Sheet — Combined Edition

> Fast-revision companion. Use individual files for focused revision.


---

<!-- 00_MASTER_INDEX.md -->

# Spring Boot Complete Cheat Sheet Pack

**Purpose:** Ultra-fast revision for development, production work, interviews, architecture discussions, and training.

**Baseline:** Concept-first Spring Boot. Current-version notes target Spring Boot 4.1.x, while migration/interview notes retain awareness of Spring Boot 3.x.

## Revision Modes
- **30 seconds:** open `01_30_SECOND_RECALL.md`.
- **2 minutes:** Snapshot → Flow → API/Annotation → Trap → Production Check.
- **10 minutes:** What → Why → Flow → Code Skeleton → Internals → Best Practices → Mistakes → Troubleshooting → Interview Recall.

## Pack Map
1. 30-second recall
2. Mental model
3. Setup, starters and build
4. Startup lifecycle
5. IoC, DI, beans and lifecycle
6. Auto-configuration
7. Configuration and profiles
8. Spring MVC request flow
9. REST, validation and exceptions
10. JSON / Jackson
11. Spring Data JPA
12. Transactions
13. Database, pooling and migrations
14. Security
15. Testing
16. Actuator and observability
17. Logging
18. Caching
19. Scheduling and async
20. HTTP clients
21. WebFlux vs MVC
22. Virtual threads
23. Messaging integration map
24. AOT, native and containers
25. Performance
26. Production checklist
27. Troubleshooting matrix
28. Interview traps
29. Annotation reference
30. Properties reference
31. Command reference
32. Boot 3 → 4 migration
33. Ecosystem boundary map
34. One-page architecture recall
35. Sources/version notes

> A cheat sheet is a **memory trigger**, not a textbook.


---

<!-- 01_30_SECOND_RECALL.md -->

# Spring Boot — 30-Second Recall

## Formula
**Spring Boot = Spring Framework + Auto-configuration + Starters + Embedded runtime + Externalized config + Production tooling**

## Main Annotation
```java
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

`@SpringBootApplication` ≈ `@Configuration + @EnableAutoConfiguration + @ComponentScan`

## Request Flow
```text
Client → Servlet Container → Filters → DispatcherServlet → HandlerMapping
      → Controller → Service → Repository → DB → HttpMessageConverter → Response
```

## Must-Remember
- Prefer constructor injection.
- Keep controllers thin.
- Put business logic in services/domain.
- Use DTOs at API boundaries.
- Use `@Transactional` deliberately.
- Centralize exception handling.
- Externalize configuration and secrets.
- Observe health, metrics and traces.
- Use the smallest appropriate test scope.
- Profile before tuning.

## Interview Traps
- Spring Boot does **not** replace Spring.
- JPA is a specification; Hibernate is a provider.
- `@Transactional` is generally proxy-based.
- Self-invocation can bypass proxy advice.
- `@Async` is not a durable queue.
- WebFlux does not make every workload faster.
- Virtual threads improve concurrency for blocking workloads, not CPU speed.


---

<!-- 02_MENTAL_MODEL.md -->

# Spring Boot Mental Model

## What
Spring Boot is an opinionated way to build stand-alone, production-grade Spring applications with minimal setup.

## Why
It reduces repeated setup for dependency versions, web runtime, serialization, data sources, framework beans, health/metrics, and environment configuration.

## Visual
```text
Your Code
 ├─ Controllers
 ├─ Services
 ├─ Repositories
 └─ Configuration
       ↓
Spring Framework
(IoC, DI, AOP, MVC, Transactions)
       ↓
Spring Boot
(Starters, Auto-config, Runtime, External Config, Actuator)
       ↓
JVM + Infrastructure
```

## Analogy
Spring Framework = engineering system and building materials.  
Spring Boot = a professionally preconfigured building kit using those materials.

## Production Question
Whenever Boot appears to do something automatically, ask: **Which dependency, property, bean and condition caused which auto-configured bean to be created?**


---

<!-- 03_SETUP_STARTERS_BUILD.md -->

# Setup, Starters, Maven & Gradle

## Typical Dependencies
- Spring Web
- Validation
- Spring Data JPA
- Database driver
- Actuator
- Security when required

## Starter Example
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

| Need | Starter |
|---|---|
| MVC/REST | `spring-boot-starter-web` |
| Reactive | `spring-boot-starter-webflux` |
| JPA | `spring-boot-starter-data-jpa` |
| Validation | `spring-boot-starter-validation` |
| Security | `spring-boot-starter-security` |
| Actuator | `spring-boot-starter-actuator` |
| Testing | `spring-boot-starter-test` |

## Commands
```bash
./mvnw spring-boot:run
./mvnw test
./mvnw clean package
java -jar target/app.jar

./gradlew bootRun
./gradlew test
./gradlew bootJar
java -jar build/libs/app.jar
```

## Rule
Use Spring Boot dependency management/BOM rather than pinning every framework dependency independently.


---

<!-- 04_STARTUP_LIFECYCLE.md -->

# `@SpringBootApplication` & Startup Lifecycle

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

## Startup Flow
```text
main()
 ↓
SpringApplication.run()
 ↓
Prepare Environment
 ↓
Create ApplicationContext
 ↓
Load Bean Definitions / Component Scan
 ↓
Evaluate Auto-configuration
 ↓
Instantiate + Wire Beans
 ↓
Start Web Server
 ↓
Runner Hooks
 ↓
Ready
```

## Package Rule
Place the main class near the root package so component scanning naturally sees subpackages.

## Trap
Startup success does not prove business dependencies are healthy. Use readiness checks and integration tests.


---

<!-- 05_IOC_DI_BEANS.md -->

# IoC, Dependency Injection, Beans & Lifecycle

## Preferred Constructor Injection
```java
@Service
class OrderService {
    private final OrderRepository repository;
    OrderService(OrderRepository repository) { this.repository = repository; }
}
```

Why: explicit dependencies, `final` fields, easier tests, no partially initialized object.

## Stereotypes
```text
@Component
 ├─ @Service
 ├─ @Repository
 └─ @Controller / @RestController
```

## Explicit Bean
```java
@Configuration
class AppConfig {
    @Bean
    Clock clock() { return Clock.systemUTC(); }
}
```

## Common Scopes
`singleton` (default), `prototype`, `request`, `session`.

## Lifecycle
```text
Definition → Instantiate → Inject → BeanPostProcessor(before)
→ @PostConstruct → BeanPostProcessor(after) → Ready → @PreDestroy
```

## Trap
Singleton means one bean instance **per Spring container**, not a magical JVM-global object.


---

<!-- 06_AUTO_CONFIGURATION.md -->

# Auto-configuration & Conditional Configuration

## Formula
```text
Classpath + Properties + Existing Beans + Application Type
              ↓
        Conditional Matching
              ↓
      Auto-configured Beans
```

## Conditions
```java
@ConditionalOnClass
@ConditionalOnMissingBean
@ConditionalOnBean
@ConditionalOnProperty
@ConditionalOnWebApplication
```

## Back-Off
Boot commonly backs off when your application provides its own compatible bean/configuration.

## Debug
```properties
debug=true
```
Use the condition evaluation report to see why configuration matched or did not match.

## Interview Answer
Auto-configuration is conditional configuration, not magic.


---

<!-- 07_CONFIGURATION_PROFILES.md -->

# External Configuration, Properties & Profiles

## Sources
`application.properties`, `application.yml`, profile files, environment variables, system properties, command-line args, external config locations.

## Typed Config
```java
@ConfigurationProperties(prefix = "payment")
public record PaymentProperties(URI baseUrl, Duration timeout) {}
```

```yaml
payment:
  base-url: https://example.internal
  timeout: 2s
```

## Profiles
```text
application.yml
application-dev.yml
application-test.yml
application-prod.yml
```

## Secrets
Do not commit credentials. Prefer secret managers or environment/platform injection.

## Trap
Use `@ConfigurationProperties` for grouped typed configuration; reserve `@Value` for small/simple cases.


---

<!-- 08_SPRING_MVC_REQUEST_FLOW.md -->

# Spring MVC & Request Lifecycle

```text
HTTP Client → Servlet Container → Filters → DispatcherServlet
→ HandlerMapping → Interceptor → Controller → Service → Repository
→ Return Value → HttpMessageConverter → HTTP Response
```

## Controller
```java
@RestController
@RequestMapping("/orders")
class OrderController {
    @GetMapping("/{id}")
    OrderResponse get(@PathVariable long id) { return service.get(id); }
}
```

## Inputs
`@PathVariable`, `@RequestParam`, `@RequestHeader`, `@RequestBody`, `@ModelAttribute`.

## Mappings
`@GetMapping`, `@PostMapping`, `@PutMapping`, `@PatchMapping`, `@DeleteMapping`.

## Trap
`DispatcherServlet` is Spring MVC's front controller; Tomcat/Jetty is the servlet container/runtime.


---

<!-- 09_REST_VALIDATION_EXCEPTIONS.md -->

# REST APIs, Validation & Exception Handling

## Boundary
```text
JSON → Request DTO → Validation → Service/Domain → Response DTO → JSON
```
Avoid exposing persistence entities directly as public API contracts.

## Validation
```java
public record CreateUserRequest(@NotBlank String name, @Email String email) {}

@PostMapping
ResponseEntity<UserResponse> create(@Valid @RequestBody CreateUserRequest request) { ... }
```

## Central Error Handling
```java
@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<ApiError> notFound(NotFoundException ex) { ... }
}
```

## Error Contract
Prefer stable fields: `code`, `message`, `timestamp`, `path`, `correlationId`, validation errors.

## Rule
Validate boundaries, hide internal stack/SQL details, and use predictable HTTP semantics.


---

<!-- 10_JSON_JACKSON.md -->

# JSON / Jackson Cheat Sheet

## Flow
```text
JSON Request → HttpMessageConverter → Jackson → Java DTO
Java DTO → Jackson → JSON Response
```

## Common Annotations
`@JsonProperty`, `@JsonIgnore`, `@JsonInclude`, `@JsonFormat`, `@JsonCreator`.

## Watch For
- recursive entity relationships
- lazy JPA proxies
- sensitive fields
- timezone ambiguity
- accidental breaking contract changes

## Rule
Serialization is part of the external API contract, not a cosmetic detail.


---

<!-- 11_DATA_JPA_REPOSITORIES.md -->

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


---

<!-- 12_TRANSACTIONS.md -->

# Transactions Cheat Sheet

```java
@Transactional
public void placeOrder(...) { ... }
```

## Flow
```text
Method Call → Spring Proxy → Open/Join Transaction → Business Method → Commit/Rollback
```

## Know
Propagation, isolation, rollback rules, read-only transactions, transaction boundaries.

## Self-Invocation Trap
`this.transactionalMethod()` may bypass proxy interception.

## Boundary
Transactions typically wrap one coherent business use case at service/application level.

## Distributed Systems
`@Transactional` does not create an atomic transaction across independent microservices.


---

<!-- 13_DATABASE_POOL_MIGRATIONS.md -->

# Database, Connection Pool & Migrations

```text
Application → Connection Pool → JDBC Driver → Database
```

## Pool Concerns
Max pool size, connection timeout, idle timeout, DB connection limit, query latency, transaction duration.

## Migrations
Common: Flyway, Liquibase.

## Rule
Schema evolution should be versioned and repeatable.

## Trap
Increasing pool size is not automatically a performance fix; it can overload the database.

## Debug Order
```text
Threads → Pool Saturation → Slow Query → Locking → DB Capacity → Network
```


---

<!-- 14_SECURITY.md -->

# Spring Security Essentials

## Flow
```text
Request → Security Filter Chain → Authentication → SecurityContext
→ Authorization → Controller
```

## Modern Configuration Shape
```java
@Bean
SecurityFilterChain security(HttpSecurity http) throws Exception {
    return http.authorizeHttpRequests(auth -> auth
        .requestMatchers("/actuator/health").permitAll()
        .anyRequest().authenticated()).build();
}
```

## Concepts
Authentication, authorization, principal, roles/authorities, password encoding, session vs token, CSRF, CORS.

## API Checklist
TLS, token validation, least privilege, secret protection, safe errors, rate limiting where appropriate, audit critical actions.

## Trap
CORS and CSRF solve different problems.


---

<!-- 15_TESTING.md -->

# Testing, Test Slices & Testcontainers

## Pyramid
```text
Many Unit Tests → Focused Slice Tests → Integration Tests → Few E2E Tests
```

## Tools
JUnit, Mockito, Spring Test, MockMvc, WebTestClient, Testcontainers.

## Full Context
```java
@SpringBootTest
class ApplicationIT { }
```
Use only when you truly need the application context.

## Testcontainers
Useful for realistic PostgreSQL/MySQL/Kafka/Redis integration tests.

## Rule
Choose the **smallest test scope that proves the behavior**.

## Trap
Using `@SpringBootTest` for every test produces slow, noisy suites.


---

<!-- 16_ACTUATOR_OBSERVABILITY.md -->

# Actuator, Metrics, Tracing & Observability

## Three Signals
**Logs + Metrics + Traces**

## Common Actuator Endpoints
`/actuator/health`, `/actuator/metrics`.

## Flow
```text
Spring Boot App
  ↓
Micrometer / Observation
  ├─ Metrics → Prometheus → Grafana
  └─ Traces  → OpenTelemetry-compatible backend
```

## Watch
Liveness, readiness, p95/p99 latency, error rate, throughput, JVM memory/GC, concurrency saturation, DB pool saturation.

## Trap
Health `UP` does not always mean the service is ready to serve useful business traffic.


---

<!-- 17_LOGGING.md -->

# Logging Cheat Sheet

## Levels
`TRACE → DEBUG → INFO → WARN → ERROR`

## Good Fields
Timestamp, level, service, environment, trace/correlation ID, request ID, event, safe business ID.

## Never Log
Passwords, access tokens, secrets, card data, unnecessary sensitive personal data.

```java
log.info("order_created orderId={} customerId={}", orderId, customerId);
```

## Rule
Logs should explain events, not dump the universe. Correlate them with traces.


---

<!-- 18_CACHING.md -->

# Caching Cheat Sheet

## Annotations
`@Cacheable`, `@CachePut`, `@CacheEvict`.

## Flow
```text
Request → Cache Lookup ─Hit→ Return
                   └─Miss→ Source/DB → Cache → Return
```

## Good Candidates
Expensive repeated reads with safe staleness tolerance.

## Hard Problems
Invalidation, TTL, consistency, stampede, memory growth, distributed cache failure.

## Trap
Caching the wrong data makes correctness harder rather than performance better.


---

<!-- 19_SCHEDULING_ASYNC.md -->

# Scheduling & Async Execution

## Scheduling
`@Scheduled(fixedRate=...)`, `@Scheduled(fixedDelay=...)`, `@Scheduled(cron="...")`.

## Async
```java
@Async
public CompletableFuture<Result> process() { ... }
```

## Ask
Can jobs overlap? One node or all nodes? Retry? Ordering? Durability? Monitoring?

## Traps
- `@Scheduled` can run on every replica unless coordinated.
- `@Async` is not a durable queue or workflow engine.


---

<!-- 20_HTTP_CLIENTS.md -->

# HTTP Client Cheat Sheet

## Common Choices
- `RestClient` for synchronous fluent calls
- `WebClient` for reactive/non-blocking calls
- interface-based HTTP service clients where appropriate

## Resilience Checklist
Timeout, retry policy, authentication, connection reuse, correlation, metrics, tracing, error mapping, idempotency.

## Rule
Always configure realistic outbound timeouts.

## Trap
Blind retries can amplify outages. Retry only transient, safe/idempotent operations with controlled backoff.


---

<!-- 21_WEBFLUX_VS_MVC.md -->

# WebFlux vs MVC

| MVC | WebFlux |
|---|---|
| Servlet model | Reactive model |
| Common blocking stack | Non-blocking capable |
| Imperative style | Reactive types/operators |
| Great default for many services | Useful for reactive chains/streaming/high concurrency |

## Decision
Choose WebFlux because the workload and dependency chain benefit from reactive non-blocking execution, not because it is newer.

## Trap
Blocking JDBC/HTTP work inside an event-loop path can destroy reactive scalability.


---

<!-- 22_VIRTUAL_THREADS.md -->

# Virtual Threads with Spring Boot

## What
Lightweight JVM-managed threads that make thread-per-request style much more scalable for many blocking I/O workloads.

## Visual
```text
Many Virtual Threads → JVM Scheduler → Fewer Carrier/Platform Threads
```

## Good Fit
High concurrency with blocking DB/HTTP/file I/O.

## Not Magic
They do not make CPU-heavy algorithms faster.

## Review
Thread-local usage, synchronized/pinning-sensitive regions, DB pool limits, downstream capacity, observability and rate limits.

## Trap
More virtual threads do not create more database connections or downstream capacity.


---

<!-- 23_MESSAGING_MAP.md -->

# Messaging Integration Map

```text
Producer → Broker/Topic/Queue → Consumer → Business Handler → DB/External API
```

## Recall
Producer, consumer, partition/queue, group, offset/ack, retry, dead-letter handling, ordering, idempotency, duplicates.

## Rule
Design handlers for safe redelivery/idempotency where required.

## Boundary
Kafka, AMQP/RabbitMQ, JMS and Pulsar each deserve dedicated deep-dive cheat sheets; this file covers their Spring Boot integration role.


---

<!-- 24_AOT_NATIVE_CONTAINERS.md -->

# AOT, Native Images, Packaging & Containers

## JVM Packaging
```text
Source → Build → Executable JAR → JVM
```

## Container Skeleton
```dockerfile
FROM eclipse-temurin:21-jre
COPY target/app.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

## Native/AOT
Potential benefits: faster startup, lower memory for suitable workloads.  
Trade-offs: build complexity, reflection/dynamic constraints, different diagnostics/performance profile.

## Production
Graceful shutdown, container memory awareness, probes, external config, non-root where feasible, immutable image, SBOM/security scanning.


---

<!-- 25_PERFORMANCE.md -->

# Performance Cheat Sheet

## Golden Rule
**Measure first.**

```text
Client → Network → Server Threads/Event Loop → App Code → HTTP Clients
→ DB Pool → Queries/Locks/Indexes → JVM/GC/CPU/Memory
```

## Metrics
Throughput, p50/p95/p99 latency, errors, CPU, heap, GC, threads, pool active/pending, downstream latency.

## Common Causes
N+1, missing indexes, excessive serialization, slow downstreams, lock contention, huge payloads, wrong cache, unbounded concurrency, pool starvation.

## Trap
Adding threads/cache/memory before finding the bottleneck can reduce stability.


---

<!-- 26_PRODUCTION_CHECKLIST.md -->

# Production Readiness Checklist

## API
- [ ] validation
- [ ] stable error contract
- [ ] DTO boundaries
- [ ] timeouts

## Security
- [ ] authn/authz
- [ ] TLS
- [ ] secrets outside repo/logs
- [ ] dependency scanning
- [ ] least privilege

## Data
- [ ] migrations
- [ ] indexes checked
- [ ] transaction boundaries
- [ ] pool sizing
- [ ] backup/recovery

## Reliability
- [ ] graceful shutdown
- [ ] safe retry
- [ ] idempotency where needed
- [ ] downstream failure plan

## Observability
- [ ] structured logs
- [ ] metrics
- [ ] traces
- [ ] liveness/readiness
- [ ] alerts tied to impact

## Testing / Deployment
- [ ] unit + integration
- [ ] contract/performance where relevant
- [ ] immutable artifact
- [ ] rollback strategy
- [ ] controlled rollout


---

<!-- 27_TROUBLESHOOTING_MATRIX.md -->

# Troubleshooting Matrix

| Symptom | First Checks | Likely Areas |
|---|---|---|
| Won't start | root exception, condition report | bean/config/port |
| 404 | mapping/base path | scan/route |
| 400 | binding/validation | DTO/JSON/converter |
| 401 | authentication | token/session/config |
| 403 | authorization/CSRF | authorities/rules |
| 500 | logs + trace ID | server exception |
| Slow API | p95 trace | DB/downstream/CPU |
| DB timeout | pool metrics | leaks/long TX/slow SQL |
| High memory | heap/GC | cache/allocations/leak |
| High CPU | profiler | loops/serialization/crypto |
| N+1 | SQL/APM | fetch strategy |
| Bean ambiguity | candidates | qualifier/primary/design |
| Circular dependency | dependency graph | architecture issue |
| Transaction absent | proxy path | self-call/config |
| Duplicate scheduled job | replicas | coordination |

**Evidence flow:** Symptom → Metric → Trace → Log → Profile/Query Plan → Fix → Re-measure.


---

<!-- 28_INTERVIEW_TRAPS.md -->

# Spring Boot Interview Traps & Senior Questions

## 20 Fast Traps
1. Boot is built on Spring; it does not replace Spring.
2. `@SpringBootApplication` carries configuration, component scanning and auto-config semantics.
3. Constructor injection is usually preferred.
4. Auto-configuration is conditional.
5. Boot can back off when user configuration exists.
6. `DispatcherServlet` is MVC's front controller.
7. JPA != Hibernate.
8. `@Transactional` is generally proxy/AOP based.
9. Self-invocation may bypass transactional/async advice.
10. Lazy loading can create N+1.
11. `@Async` is not durable messaging.
12. `@Scheduled` may execute on every replica.
13. WebFlux is not automatically faster.
14. Virtual threads do not speed CPU-bound work.
15. Bigger DB pools can hurt the DB.
16. Liveness != readiness.
17. Retries can create retry storms.
18. DTOs decouple API and persistence contracts.
19. Observability = logs + metrics + traces.
20. Performance tuning begins with measurement.

## Senior Questions
- Explain startup from `main()` to readiness.
- How does auto-configuration choose beans?
- Explain MVC request flow.
- Where should transaction boundaries live?
- Diagnose N+1.
- When choose WebFlux?
- Secure a stateless REST API.
- Design readiness/liveness.
- Test persistence realistically.
- Troubleshoot rising p99 latency.
- Make scheduled jobs safe with five replicas.
- Plan a Boot 3 → 4 upgrade.


---

<!-- 29_ANNOTATIONS_REFERENCE.md -->

# Annotation Quick Reference

## Boot / Config
`@SpringBootApplication`, `@Configuration`, `@Bean`, `@ConfigurationProperties`, `@Profile`

## Components
`@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`

## Web
`@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@PatchMapping`, `@DeleteMapping`, `@RequestBody`, `@PathVariable`, `@RequestParam`, `@RequestHeader`

## Validation
`@Valid`, `@Validated`, `@NotNull`, `@NotBlank`, `@Size`, `@Email`, `@Min`, `@Max`

## Persistence
`@Entity`, `@Id`, `@GeneratedValue`, `@Transactional`

## Errors
`@ControllerAdvice`, `@RestControllerAdvice`, `@ExceptionHandler`

## Execution / Cache
`@Scheduled`, `@Async`, `@Cacheable`, `@CachePut`, `@CacheEvict`

## Testing
`@SpringBootTest` plus version-appropriate focused test-slice annotations.


---

<!-- 30_PROPERTIES_REFERENCE.md -->

# Configuration Properties — Recall Sheet

```yaml
server:
  port: 8080
spring:
  application:
    name: order-service
  profiles:
    active: dev
  datasource:
    url: jdbc:postgresql://localhost:5432/app
    username: app
    password: ${DB_PASSWORD}
  jpa:
    open-in-view: false
management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
logging:
  level:
    com.example: INFO
```

## Rule
Do not memorize hundreds of properties. Know the namespace, metadata discovery, override model, and production-sensitive settings.


---

<!-- 31_COMMANDS_REFERENCE.md -->

# Maven / Gradle / Runtime Commands

```bash
./mvnw test
./mvnw clean package
./mvnw spring-boot:run
java -jar target/*.jar

./gradlew test
./gradlew clean build
./gradlew bootRun
java -jar build/libs/*.jar

java -jar app.jar --server.port=9090
curl http://localhost:8080/actuator/health
```

Environment examples:
```bash
export SPRING_PROFILES_ACTIVE=prod
export DB_PASSWORD=...
```


---

<!-- 32_BOOT3_TO_BOOT4.md -->

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


---

<!-- 33_ECOSYSTEM_BOUNDARY_MAP.md -->

# Spring Boot vs Spring Ecosystem

```text
Spring Framework
 ├─ Core / IoC / AOP
 ├─ MVC / WebFlux
 └─ Transactions
       ↓
Spring Boot
 ├─ Auto-config
 ├─ Starters
 ├─ External Config
 ├─ Runtime
 └─ Actuator
       ├─ Spring Data
       ├─ Spring Security
       ├─ Spring Kafka / AMQP
       ├─ Spring Batch
       ├─ Spring Integration
       ├─ Spring GraphQL
       ├─ Spring AI
       ├─ Spring Modulith
       └─ Spring Cloud
```

## Rule
A complete Boot cheat sheet should know how Boot integrates these areas; deep mastery of Security, Cloud, Kafka, Batch, AI, etc. belongs in dedicated packs.


---

<!-- 34_ONE_PAGE_ARCHITECTURE_RECALL.md -->

# Spring Boot — One-Page Architecture Recall

```text
Client
  ↓
Servlet Container / HTTP Runtime
  ↓
Security + Filters
  ↓
DispatcherServlet
  ↓
Controller
  ↓
Service
  ├─ Cache
  ├─ Repository → DB
  └─ HTTP Client → External Service
```

## Cross-Cutting
Configuration, validation, transactions, security, caching, logging, metrics, tracing, errors, testing.

## Boot Internals
```text
Starters + Classpath + Properties + Existing Beans
                   ↓
        Auto-configuration Conditions
                   ↓
          ApplicationContext
                   ↓
            Configured Runtime
```

## Production
```text
Build → Test → Package → Deploy → Health → Metrics → Traces → Logs → Alerts
```


---

<!-- 35_SOURCES_AND_VERSION_NOTES.md -->

# Sources & Version Notes

Primary official references:
- https://docs.spring.io/spring-boot/
- https://docs.spring.io/spring-boot/reference/
- https://spring.io/projects/spring-boot
- https://docs.spring.io/spring-framework/reference/

Version context at pack creation:
- Current Spring Boot stable shown by official docs: **4.1.1**.
- Spring Boot 3.5.16 was announced as the **final OSS 3.5.x release**.
- Current Spring Framework stable documentation shows the 7.0.x and 6.2.x lines.

## Accuracy Rule
For version-sensitive APIs, confirm against the version-specific official reference for the target project.

## Deep-Dive Packs to Keep Separate
Spring Security, Spring Data/JPA, Spring Cloud, Kafka/Messaging, Spring Batch, Spring AI, Reactive Programming.
