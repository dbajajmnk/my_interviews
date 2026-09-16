# OpenAI Agents SDK Streaming

## Current Python API

Current OpenAI Agents SDK documentation uses:
- `Runner.run_streamed(...)`
- `RunResultStreaming`
- `result.stream_events()`

## Event Levels

The SDK exposes:
- raw response events;
- higher-level run-item events;
- agent-updated events.

## Important Completion Detail

The streaming run is not complete until the async event iterator finishes. Post-processing such as session persistence or approval bookkeeping may continue after the last visible token.

## Approvals

If a tool approval interruption occurs:
- drain the stream;
- inspect interruptions;
- convert to run state;
- approve/reject;
- resume with streaming.

## Cancellation

Current SDK supports cancellation, including stopping immediately or after the current turn.
