# Microsoft Agent Framework Streaming

## Agent Streaming

Current .NET Agent Framework exposes `RunStreamingAsync(...)`, returning an asynchronous stream of `AgentResponseUpdate`.

## Workflow Streaming

Current workflow execution supports streaming event consumption.

C# conceptually:
```text
RunStreamingAsync(workflow, input)
 ↓
WatchStreamAsync()
 ↓
WorkflowEvent
```

## Workflow Events

Workflow events provide real-time observability into executor progress and workflow output.

## A2A

Remote A2A agents also support streaming updates and long-running/background-response patterns.

## Frontend Integration

Current AG-UI hosting can stream agent responses as protocol events over SSE.
