# Inbox / Idempotent Consumer

## Problem

Messages may be delivered more than once.

## Pattern

Consumer tracks processed message IDs.

```text
Message
 ↓
Already processed?
 ├── yes → ignore safely
 └── no  → process + record
```

## Why

Makes at-least-once delivery safe.

## Trap

Idempotency must include business side effects, not just message acknowledgement.
