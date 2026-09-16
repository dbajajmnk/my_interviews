# Durable Context and Resume

## Why

Long-running agents may:
- wait for humans;
- restart;
- fail mid-run;
- resume hours later.

## Persist

- execution state;
- conversation/thread state;
- approval state;
- references to external context;
- version metadata.

## Avoid

Persisting raw secrets inside serialized agent state.

## Rule

Durable context must be serializable, versioned, secure, and resumable.
