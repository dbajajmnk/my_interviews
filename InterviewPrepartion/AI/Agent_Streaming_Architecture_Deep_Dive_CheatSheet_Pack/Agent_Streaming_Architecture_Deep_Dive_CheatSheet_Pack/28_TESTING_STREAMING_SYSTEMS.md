# Testing Streaming Systems

## Unit Tests

Test event mapping and reducers independently.

## Integration Tests

Test:
- token stream;
- tool events;
- handoff;
- approval pause/resume;
- cancellation;
- disconnect/reconnect;
- duplicate event handling;
- terminal error.

## Deterministic Testing

Use scripted/fake models with predefined event sequences.

## Rule

Test event order and terminal states, not only final text.
