# OpenTelemetry Collector

## Role

A collector receives, processes and exports telemetry.

## Pipeline

```text
Receivers
  ↓
Processors
  ↓
Exporters
```

## Processors

Can perform:
- batching;
- sampling;
- attribute filtering;
- redaction;
- routing.

## Rule

Centralize telemetry processing policy where practical.
