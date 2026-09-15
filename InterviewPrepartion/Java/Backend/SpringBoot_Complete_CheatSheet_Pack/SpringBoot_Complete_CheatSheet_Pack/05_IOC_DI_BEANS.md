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
