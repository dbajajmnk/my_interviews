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
