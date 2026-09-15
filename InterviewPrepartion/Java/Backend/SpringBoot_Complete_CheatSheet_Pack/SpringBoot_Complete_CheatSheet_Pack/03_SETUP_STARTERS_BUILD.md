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
