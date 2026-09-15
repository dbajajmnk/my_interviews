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
