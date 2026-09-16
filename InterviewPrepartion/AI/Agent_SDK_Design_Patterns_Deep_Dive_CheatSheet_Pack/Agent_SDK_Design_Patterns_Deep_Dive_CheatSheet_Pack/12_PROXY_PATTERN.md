# Proxy Pattern

## Intent

Control access to a remote or sensitive dependency through an intermediary.

## Examples

- remote model proxy;
- tool execution proxy;
- rate-limited provider proxy;
- authorization proxy.

## Architecture

```text
Agent Runtime
   ↓
SecureToolProxy
   ↓
Remote Tool Service
```

## Proxy vs Adapter

- Proxy keeps same conceptual interface and controls access.
- Adapter changes one interface into another.
