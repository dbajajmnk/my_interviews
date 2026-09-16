# Memory and Store

## State vs Store

Checkpointed graph state handles thread-scoped execution history.

A store supports broader long-term data that may span multiple threads.

## Use Cases

- user preferences;
- persistent knowledge;
- cross-session memory;
- agent profile/state beyond one thread.

## Rule

Treat long-term memory as governed data with explicit retention, privacy, and deletion semantics.
