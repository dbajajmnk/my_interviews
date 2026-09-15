# Publish-Subscribe

## Pattern
```text
Publisher
 ↓
Topic/Event Bus
 ├── Consumer A
 ├── Consumer B
 └── Consumer C
```

## Use
One event needed by multiple independent consumers.

## Trap
Fan-out is not the same as queue-based competing consumption.
