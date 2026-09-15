# Database Migration

## Rule

Use backward-compatible schema evolution.

## Expand / Contract

```text
1. Add new field/table
2. Deploy code supporting old + new
3. Migrate data
4. Switch reads/writes
5. Remove old structure
```

## Trap

Dropping/renaming columns in one step breaks mixed-version deployments.
