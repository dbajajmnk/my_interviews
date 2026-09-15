# Ambassador Pattern

## Intent
A helper proxy handles outbound connectivity for a service.

```text
Service
 ↓
Ambassador Proxy
 ↓
External Service
```

## Responsibilities
```text
TLS
retry
routing
telemetry
```

## Related
Sidecar, Service Mesh.
