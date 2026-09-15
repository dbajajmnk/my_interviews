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
