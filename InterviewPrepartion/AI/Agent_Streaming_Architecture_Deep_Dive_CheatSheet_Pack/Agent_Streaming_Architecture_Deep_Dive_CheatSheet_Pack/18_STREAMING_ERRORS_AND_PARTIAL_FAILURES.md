# Streaming Errors and Partial Failures

## Failure Points

- model stream breaks;
- tool fails;
- network disconnects;
- client stops consuming;
- downstream store fails.

## Error Event

Emit normalized terminal error metadata where possible.

## Rule

A partially displayed answer does not mean the run succeeded.

## Recovery

Use:
- reconnect;
- resume;
- retry at safe boundary;
- fallback final message.
