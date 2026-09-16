# Tool Observability and Audit

## Trace

Capture:
- tool name;
- call ID;
- run/trace ID;
- latency;
- success/failure;
- retry count;
- authorization outcome;
- approval outcome.

## Sensitive Data

Redact:
- secrets;
- payment data;
- PII;
- tokens;
- confidential payloads.

## Audit vs Telemetry

Telemetry helps operate/debug.  
Audit proves who did what and when.

They overlap but serve different governance purposes.
