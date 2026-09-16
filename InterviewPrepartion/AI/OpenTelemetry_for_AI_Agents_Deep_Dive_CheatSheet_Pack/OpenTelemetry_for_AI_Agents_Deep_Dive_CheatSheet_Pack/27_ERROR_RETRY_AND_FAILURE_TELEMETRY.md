# Error, Retry and Failure Telemetry

## Capture

- error type;
- operation;
- status;
- retry attempt;
- fallback used;
- terminal outcome.

## Rule

Record errors in normalized attributes/events; do not blindly attach raw stack/context containing secrets.
