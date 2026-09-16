# Capability Negotiation

## Why

Server/provider features may vary.

## Pattern

```text
Client asks: supports(streaming_v2)?
Server says: yes/no
```

## Use

Avoid version-number guessing.

## Rule

Capabilities describe behavior better than raw version checks.
