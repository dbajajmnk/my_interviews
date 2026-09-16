# Error Handling and Fault Tolerance

## Failure Types

- node failure;
- timeout;
- invalid state update;
- graph recursion limit;
- provider/tool failure;
- cancellation.

## Fault Tolerance

Checkpointing can preserve successful progress and support resumption instead of replaying all prior work.

## Design Techniques

- bounded retries;
- error nodes;
- compensating actions;
- idempotency;
- fallback routes;
- durable checkpoints.

## Interview Point

> In long-running graphs, the goal is not merely to catch exceptions; it is to preserve correct progress and resume safely.
