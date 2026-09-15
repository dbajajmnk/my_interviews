# Sidecar Pattern

## Intent
Deploy helper functionality alongside the application.

```text
Pod / Host
 ├── App
 └── Sidecar
```

## Uses
```text
proxy
logging
telemetry
config
security
```

## Trap
Sidecars increase resource and operational overhead.
