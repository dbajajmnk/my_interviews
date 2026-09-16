# Model Context Protocol (MCP) Integration

## What

MCP standardizes how applications expose tools and context to LLM applications.

## LangChain Integration

LangChain agents can use tools from MCP servers through MCP adapter libraries.

## Architecture

```text
LangChain Agent
    │
    ▼
MCP Client / Adapter
    │
    ├─ CRM MCP Server
    ├─ Files MCP Server
    └─ Internal Tool MCP Server
```

## Interceptors

MCP interceptors can bridge runtime context into tool execution and support request modification, retries, headers, or short-circuiting.

## Interview Point

> MCP helps standardize tool connectivity; it does not replace application authorization, policy, or audit controls.
