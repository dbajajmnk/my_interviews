# Remote Tools and MCP

## Remote Tools

Tool execution may live in:
- another service;
- another language runtime;
- another team;
- an MCP server.

## Architecture

```text
Agent Runtime
   ↓
Tool Client / MCP Client
   ↓
Remote Tool Service
```

## Benefits

- language independence;
- centralized governance;
- reusable capabilities;
- service ownership.

## Trade-Offs

- network latency;
- auth;
- versioning;
- distributed tracing;
- availability;
- timeout/retry complexity.

## Rule

MCP standardizes connectivity, not trust.
