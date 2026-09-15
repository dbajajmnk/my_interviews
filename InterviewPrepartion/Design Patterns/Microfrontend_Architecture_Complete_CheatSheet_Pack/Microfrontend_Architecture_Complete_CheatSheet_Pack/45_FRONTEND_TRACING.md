# Frontend Tracing

## Flow

```text
Browser Navigation
  ↓
MFE Load
  ↓
API Call
  ↓
Backend Service
  ↓
Database
```

## Goal

Correlate frontend experience with backend traces.

## Useful Spans

```text
route transition
remote load
data fetch
render/hydration
user action
```

## Trap

High-cardinality or over-instrumented telemetry can become expensive.
