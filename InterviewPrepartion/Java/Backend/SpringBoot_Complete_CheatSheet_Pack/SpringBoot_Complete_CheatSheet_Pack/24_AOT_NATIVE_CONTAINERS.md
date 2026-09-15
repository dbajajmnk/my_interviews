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
