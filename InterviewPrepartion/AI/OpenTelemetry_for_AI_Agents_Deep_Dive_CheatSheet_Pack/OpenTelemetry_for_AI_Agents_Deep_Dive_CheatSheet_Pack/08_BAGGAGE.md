# OpenTelemetry Baggage

## What

Baggage propagates key/value context across service boundaries.

## Possible Uses

- workflow correlation;
- non-sensitive routing metadata.

## Caution

Baggage can travel broadly. Do not put secrets or unnecessary PII into it.
