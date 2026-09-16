# MCP Integration

## What

MCP integration lets agents use tools exposed by MCP servers.

## Patterns

The SDK supports hosted and local MCP-style integration paths.

## Architecture

```text
Agent
  │
  ▼
MCP Tool Integration
  │
  ├─ CRM server
  ├─ Knowledge server
  └─ Internal automation server
```

## Approval

MCP tool calls can be placed behind approval requirements depending on the integration mode.

## Security Rule

MCP standardizes connectivity, not trust. Still enforce identity, allowlists, scopes, policy, and auditing.
