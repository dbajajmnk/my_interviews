# Observability and Tracing

## Trace vs Stream

Stream = runtime delivery to consumers.  
Trace = durable observability record.

## Correlate

Use:
- run_id;
- trace_id;
- span_id;
- event_id;
- tool_call_id;
- agent_id.

## Rule

Do not depend on the frontend stream as your only operational record.
