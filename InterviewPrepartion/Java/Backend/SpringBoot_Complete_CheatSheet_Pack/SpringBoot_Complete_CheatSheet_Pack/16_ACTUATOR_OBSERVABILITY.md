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
