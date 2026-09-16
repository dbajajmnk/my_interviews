# Reconnection and Resume

## Resume Requirements

Useful mechanisms:
- event IDs;
- sequence numbers;
- durable run ID;
- checkpoint;
- cursor/continuation token.

## SSE Pattern

Clients can reconnect with the last processed event ID and request missing events if the server retains/replays them.

## Long-Running Pattern

For long-running runs, persist execution state independently of the stream connection.
