# Vue Production Readiness Checklist

## Architecture
- [ ] Composition API / script setup standards
- [ ] feature boundaries
- [ ] local vs Pinia vs URL vs server-state ownership
- [ ] Router lazy loading
- [ ] composable cleanup/lifetimes

## Reactivity
- [ ] no lost reactive destructuring
- [ ] computed for derived values
- [ ] watchers only for side effects
- [ ] stable list keys
- [ ] shallow/markRaw use justified

## Async
- [ ] loading/error/empty states
- [ ] stale request cancellation
- [ ] retry policy
- [ ] dedupe/cache ownership

## SSR
- [ ] per-request app/router/store
- [ ] no user data singleton
- [ ] browser globals guarded
- [ ] hydration tested

## Security
- [ ] no v-html with untrusted content
- [ ] URL/style inputs validated
- [ ] CSP considered
- [ ] backend authorization
- [ ] no client secrets

## Performance
- [ ] route/async code splitting
- [ ] bundle analysis
- [ ] virtualization for huge lists
- [ ] image/font strategy
- [ ] Web Vitals telemetry

## Quality
- [ ] Vitest
- [ ] component/integration tests
- [ ] critical E2E
- [ ] accessibility tests
- [ ] release/error telemetry
