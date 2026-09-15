# Microfrontend Snapshot

## What

A frontend architecture in which a large UI is decomposed into independently developed and deployable slices aligned to business capabilities or team ownership.

## Why

Useful when:

```text
many teams
large frontend
independent release needs
domain-aligned ownership
legacy modernization
different release cadences
```

## Core Principle

```text
Organizational boundary
        ↓
Business capability
        ↓
Frontend slice
        ↓
Independent delivery
```

## Real-Life Analogy

A shopping mall:

```text
Mall Shell
 ├── Store A
 ├── Store B
 ├── Food Court
 └── Services
```

Each area operates independently but follows common mall standards.

## Trap

A fragmented UI without ownership and deployment autonomy is only a complicated frontend, not a useful microfrontend architecture.
