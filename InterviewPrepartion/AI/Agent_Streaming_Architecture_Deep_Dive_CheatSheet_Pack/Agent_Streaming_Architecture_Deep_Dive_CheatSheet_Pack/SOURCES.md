# Source Notes

## OpenAI Agents SDK

Verified against current OpenAI Agents SDK documentation:
- `Runner.run_streamed()`
- `RunResultStreaming`
- `stream_events()`
- raw response events
- run-item events
- agent-updated events
- approval interruptions and resume
- cancellation
- completion/finalization semantics

## Microsoft Agent Framework

Verified against current Microsoft Agent Framework documentation:
- `RunStreamingAsync(...)`
- `AgentResponseUpdate`
- workflow `RunStreamingAsync`
- `WatchStreamAsync()`
- real-time `WorkflowEvent`
- A2A streaming/background responses
- AG-UI over SSE

## Currency Note

Framework streaming APIs evolve quickly. Verify exact imports, event names, and transport behavior against current official documentation before production implementation.
