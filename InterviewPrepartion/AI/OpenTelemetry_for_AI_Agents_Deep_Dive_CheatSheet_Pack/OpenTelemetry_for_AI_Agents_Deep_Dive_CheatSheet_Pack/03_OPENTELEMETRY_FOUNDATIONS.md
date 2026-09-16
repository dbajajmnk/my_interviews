# OpenTelemetry Foundations

## What

OpenTelemetry is a vendor-neutral observability framework for producing, collecting and exporting telemetry.

## Signals

- traces;
- metrics;
- logs;
- events/profiles depending on ecosystem support.

## Architecture

```text
Application
 ↓
OTel API/SDK
 ↓
Processor
 ↓
Exporter
 ↓
Collector
 ↓
Backend
```
