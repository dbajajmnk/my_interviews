# SSE vs WebSocket vs AsyncIterable

## SSE

Good for server → client event streams over HTTP.

Advantages:
- simple;
- browser friendly;
- reconnect support;
- works well for chat/progress.

## WebSocket

Good when bidirectional low-latency communication is important.

Use cases:
- voice/realtime;
- client interrupts;
- collaborative interactions.

## AsyncIterable

Excellent in application SDKs:
```text
async for event in stream:
    ...
```

## Reactive Streams

Useful in Java/.NET ecosystems for:
- backpressure;
- composition;
- asynchronous pipelines.

## Selection Rule

Use transport based on interaction model, not framework fashion.
