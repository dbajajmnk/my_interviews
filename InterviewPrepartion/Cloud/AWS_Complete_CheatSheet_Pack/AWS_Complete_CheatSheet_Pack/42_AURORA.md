# Amazon Aurora

## What

AWS-managed relational database compatible with MySQL/PostgreSQL families.

## Architecture

```text
Writer
  │
  ├── Shared Distributed Storage across AZs
  │
Readers
```

## Benefits

```text
managed HA
read scaling
fast failover patterns
Aurora-specific scaling/replication features
```

## Read Replicas

Aurora supports multiple reader instances on shared cluster storage.

## Trap

Aurora is not simply “normal RDS with a faster instance”; its storage/cluster architecture differs.
