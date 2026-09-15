# Lazy Loading

## Pattern

```text
Initial shell
 ↓
load route MFE only when needed
```

## Benefits

- smaller initial payload
- faster startup
- less unused JavaScript

## Combine With

```text
prefetch
preload
route prediction
CDN
```

## Trap

Lazy loading everything can create visible waterfalls.
