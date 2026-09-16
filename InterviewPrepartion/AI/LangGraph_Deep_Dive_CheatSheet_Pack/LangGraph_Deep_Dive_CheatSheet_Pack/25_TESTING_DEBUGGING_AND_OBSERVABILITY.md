# Testing, Debugging and Observability

## Unit Tests

Test nodes independently with known state input/output.

## Graph Tests

Test:
- expected path;
- conditional branches;
- retries;
- parallel reducers;
- interrupts;
- resume behavior;
- failure paths.

## State History

Checkpoint history is useful for debugging state transitions.

## Streaming/Tracing

Use runtime stream modes and tracing to observe:
- node starts/finishes;
- state updates;
- messages;
- errors;
- checkpoints.

## Evaluation

Evaluate final task success plus graph path quality, tool correctness, latency, cost, and policy compliance.
