# Competing Consumers

## Pattern
```text
Queue
 ├── Consumer 1
 ├── Consumer 2
 └── Consumer 3
```

Only one consumer handles a given work item.

## Benefit
Horizontal scaling.

## Trap
Ordering becomes harder when multiple consumers process concurrently.
