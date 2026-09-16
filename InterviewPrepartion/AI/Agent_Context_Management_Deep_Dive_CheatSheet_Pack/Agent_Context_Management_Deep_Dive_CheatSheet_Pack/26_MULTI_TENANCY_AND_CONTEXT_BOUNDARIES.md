# Multi-Tenancy and Context Boundaries

## Isolation Keys

Context stores should be partitioned by:
- tenant;
- user;
- thread/session;
- data classification.

## Risk

One bad namespace or cache key can expose another tenant's context.

## Controls

- tenant-aware storage;
- scoped retrieval;
- per-tenant encryption where needed;
- auth checks on every load;
- test cross-tenant denial.
