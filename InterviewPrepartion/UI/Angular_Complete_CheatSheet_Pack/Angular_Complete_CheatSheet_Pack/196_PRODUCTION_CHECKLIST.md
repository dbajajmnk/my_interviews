# Angular Production Readiness Checklist

## Architecture
- [ ] standalone-first architecture
- [ ] feature boundaries clear
- [ ] local signal state colocated
- [ ] RxJS used for real stream problems
- [ ] DI scopes reviewed
- [ ] lazy routes / @defer used appropriately

## Change Detection
- [ ] zoneless-compatible dependencies
- [ ] OnPush-default assumptions understood
- [ ] no mutation patterns relying on old global checks
- [ ] minimal manual detectChanges

## Data
- [ ] typed HTTP contracts
- [ ] error/loading states
- [ ] cancellation/retry semantics
- [ ] resource/httpResource used for reads, not mutations
- [ ] server/client state ownership explicit

## Security
- [ ] no browser secrets
- [ ] no unsafe sanitizer bypass
- [ ] backend authorization
- [ ] XSRF strategy correct
- [ ] CSP / Trusted Types evaluated

## SSR
- [ ] no unsafe browser globals
- [ ] hydration tested
- [ ] render modes chosen by route
- [ ] transfer state contains no secrets

## Performance
- [ ] bundle budgets
- [ ] stable @for tracking
- [ ] @defer/lazy routes
- [ ] optimized images
- [ ] Web Vitals monitored

## Quality
- [ ] Vitest unit tests
- [ ] integration tests
- [ ] critical E2E
- [ ] accessibility checks
- [ ] release telemetry
