# OTLP and Exporters

## OTLP

OpenTelemetry Protocol transports telemetry between SDKs, collectors and compatible backends.

## Exporters

Exporters send telemetry to:
- OTLP collector;
- console;
- vendor-specific destinations.

## Rule

Prefer an OTLP boundary so application code is less coupled to a single observability vendor.
