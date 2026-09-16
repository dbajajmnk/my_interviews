# Reference Agent SDK Public API

## Canonical Surface

```text
Agent
Tool
RunRequest
RunResult
RunContext
StreamEvent
SdkError
Capabilities
ProviderAdapter
Retriever
MemoryStore
```

## Design Rule

Keep transport/provider-specific details behind internal or adapter layers.
