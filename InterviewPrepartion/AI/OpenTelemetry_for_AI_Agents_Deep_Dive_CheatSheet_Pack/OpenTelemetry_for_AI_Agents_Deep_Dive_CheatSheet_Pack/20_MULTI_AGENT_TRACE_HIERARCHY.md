# Multi-Agent Trace Hierarchy

## Pattern

```text
invoke_workflow
 └─ invoke_agent(supervisor)
     ├─ invoke_agent(researcher)
     │   └─ model/tool...
     └─ invoke_agent(writer)
         └─ model...
```

## Correlation

Keep one end-to-end trace while preserving agent-specific child spans.

## Rule

Agent identity must be explicit in telemetry when multiple agents participate.
