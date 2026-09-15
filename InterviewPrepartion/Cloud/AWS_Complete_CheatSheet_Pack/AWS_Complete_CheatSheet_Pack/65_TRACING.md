# X-Ray / OpenTelemetry

## Goal

Distributed tracing across service calls.

## Trace

```text
API Gateway
 ↓
Lambda
 ↓
Service
 ↓
Database
```

## Capture

```text
trace ID
span/segment
latency
errors
dependencies
```

## Modern Strategy

Use standards-based OpenTelemetry where appropriate and integrate with AWS observability backends/services.

## Trap

Logs alone cannot show request-level latency across distributed systems as clearly as tracing.
