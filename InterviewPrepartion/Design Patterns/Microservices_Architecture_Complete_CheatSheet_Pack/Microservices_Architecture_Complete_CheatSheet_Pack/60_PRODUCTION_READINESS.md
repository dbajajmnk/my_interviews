# Production Readiness Checklist

## Service

- [ ] clear business owner
- [ ] clear data ownership
- [ ] health endpoints
- [ ] graceful shutdown
- [ ] timeouts
- [ ] retry policy
- [ ] circuit breaker where needed
- [ ] idempotency

## Data

- [ ] migrations
- [ ] backup/recovery
- [ ] event schema
- [ ] reconciliation process

## Security

- [ ] authentication
- [ ] authorization
- [ ] mTLS/workload identity
- [ ] secret management

## Observability

- [ ] logs
- [ ] metrics
- [ ] tracing
- [ ] SLO
- [ ] alerts

## Delivery

- [ ] CI/CD
- [ ] rollback
- [ ] canary/blue-green
- [ ] contract tests
