# Environment Promotion

## Pattern

```text
Same versioned artifact
DEV → UAT → PROD
```

## Avoid

Rebuilding differently for each environment.

## Rule

Promote immutable artifacts; change environment configuration separately.
