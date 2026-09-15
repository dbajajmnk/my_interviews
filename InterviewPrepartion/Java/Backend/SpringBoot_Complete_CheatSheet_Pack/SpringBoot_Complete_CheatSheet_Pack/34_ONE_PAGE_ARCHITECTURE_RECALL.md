# Spring Boot — One-Page Architecture Recall

```text
Client
  ↓
Servlet Container / HTTP Runtime
  ↓
Security + Filters
  ↓
DispatcherServlet
  ↓
Controller
  ↓
Service
  ├─ Cache
  ├─ Repository → DB
  └─ HTTP Client → External Service
```

## Cross-Cutting
Configuration, validation, transactions, security, caching, logging, metrics, tracing, errors, testing.

## Boot Internals
```text
Starters + Classpath + Properties + Existing Beans
                   ↓
        Auto-configuration Conditions
                   ↓
          ApplicationContext
                   ↓
            Configured Runtime
```

## Production
```text
Build → Test → Package → Deploy → Health → Metrics → Traces → Logs → Alerts
```
