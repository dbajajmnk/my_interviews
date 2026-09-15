# Vue Production Readiness Checklist

## Architecture
- [ ] feature ownership clear
- [ ] local state kept local
- [ ] Pinia only for justified shared state
- [ ] URL state handled by Router
- [ ] server-state cache strategy explicit
- [ ] composables clean up external resources

## Performance
- [ ] lazy routes
- [ ] async components for heavy secondary UI
- [ ] stable keys/props
- [ ] huge lists virtualized
- [ ] bundle analyzed
- [ ] Web Vitals measured
- [ ] SSR lazy hydration evaluated where useful

## SSR
- [ ] request-scoped app/store state
- [ ] hydration tested
- [ ] browser globals guarded
- [ ] serialized state escaped safely
- [ ] unavoidable mismatch suppression limited

## Security
- [ ] no untrusted Vue templates
- [ ] no unsafe v-html
- [ ] URLs validated
- [ ] no client secrets
- [ ] backend authorization
- [ ] CSP considered

## Quality
- [ ] TypeScript/vue-tsc
- [ ] component tests
- [ ] composable/store tests
- [ ] critical E2E
- [ ] accessibility review

## Delivery
- [ ] production build
- [ ] immutable assets
- [ ] history fallback configured
- [ ] release/version telemetry
- [ ] rollback strategy
