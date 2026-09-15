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
