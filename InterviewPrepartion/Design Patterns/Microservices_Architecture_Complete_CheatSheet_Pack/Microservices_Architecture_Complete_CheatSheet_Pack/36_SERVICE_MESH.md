# Service Mesh

## What

Infrastructure layer for service-to-service communication.

## Capabilities

```text
mTLS
traffic policy
retries
telemetry
routing
```

## Architecture

```text
Service A ↔ Proxy ↔ Proxy ↔ Service B
          \____ control plane ____/
```

## Benefits

Cross-cutting network policy outside app code.

## Costs

- complexity
- latency
- debugging layers
- operational burden

## Trap

Do not adopt a mesh unless the operational value exceeds its complexity.
