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
