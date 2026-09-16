# Streaming Security

## Risks

- leaking tool arguments;
- leaking hidden system details;
- PII in partial output;
- unauthorized progress events;
- cross-tenant run subscriptions.

## Controls

- authenticated run subscription;
- tenant/run ownership check;
- event filtering;
- redaction;
- secure transport;
- bounded retention.

## Rule

Authorization applies to the stream channel as much as to the initial request.
