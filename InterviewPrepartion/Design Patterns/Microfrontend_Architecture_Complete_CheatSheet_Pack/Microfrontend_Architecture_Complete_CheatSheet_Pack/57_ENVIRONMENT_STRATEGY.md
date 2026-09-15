# Environment Strategy

## Avoid

One permanent full environment per branch for every MFE.

## Prefer

```text
shared integration environment
ephemeral preview where useful
runtime remote override
immutable artifacts
promotion
```

## Rule

Deploy the same artifact through environments when possible.

## Trap

Environment-specific rebuilds reduce confidence in promotion.
