# Backup / Resilience / DR

## Tools / Patterns

```text
AWS Backup
service-native backups
S3 versioning
RDS snapshots/PITR
DynamoDB PITR
cross-Region copies
replication
```

## Rule

Backup is useful only if restore is tested.

## Trap

Replication can replicate corruption/deletion; backup and replication solve different problems.
