# Context Caching

## What

Cache stable or expensive-to-build context when appropriate.

## Candidates

- static instructions;
- organization policy;
- expensive retrieval result;
- compiled summaries.

## Invalidation

Cache invalidation must consider:
- policy update;
- role change;
- source freshness;
- tenant data.

## Rule

Never cache authorization-sensitive context without identity/tenant-aware keys.
