# Spring Batch Production Checklist

## Identity
- deterministic JobInstance parameters
- duplicate-launch protection
- business date/file/checksum recorded

## Restart
- persistent JobRepository
- reader/writer state saved
- ExecutionContext small/version-compatible
- idempotent side effects
- restart runbook tested

## Transactions
- clear chunk boundary
- correct transaction manager
- bounded transaction duration
- remote/file side effects handled explicitly

## Fault Tolerance
- transient retry list
- skip policy
- retry backoff
- quarantine/DLQ
- business skip threshold

## Performance
- realistic chunk/page sizes
- DB indexes
- JDBC batching
- bounded worker threads
- connection pool aligned
- partition skew measured

## Operations
- metrics/JFR/log correlation
- SLA alerts
- reconciliation/control totals
- graceful shutdown
- metadata retention
- audit of start/stop/restart
