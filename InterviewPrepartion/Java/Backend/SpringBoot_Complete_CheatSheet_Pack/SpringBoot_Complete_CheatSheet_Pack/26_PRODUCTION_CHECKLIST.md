# Production Readiness Checklist

## API
- [ ] validation
- [ ] stable error contract
- [ ] DTO boundaries
- [ ] timeouts

## Security
- [ ] authn/authz
- [ ] TLS
- [ ] secrets outside repo/logs
- [ ] dependency scanning
- [ ] least privilege

## Data
- [ ] migrations
- [ ] indexes checked
- [ ] transaction boundaries
- [ ] pool sizing
- [ ] backup/recovery

## Reliability
- [ ] graceful shutdown
- [ ] safe retry
- [ ] idempotency where needed
- [ ] downstream failure plan

## Observability
- [ ] structured logs
- [ ] metrics
- [ ] traces
- [ ] liveness/readiness
- [ ] alerts tied to impact

## Testing / Deployment
- [ ] unit + integration
- [ ] contract/performance where relevant
- [ ] immutable artifact
- [ ] rollback strategy
- [ ] controlled rollout
