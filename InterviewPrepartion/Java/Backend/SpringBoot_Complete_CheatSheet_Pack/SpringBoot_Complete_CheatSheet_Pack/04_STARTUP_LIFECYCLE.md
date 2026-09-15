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
