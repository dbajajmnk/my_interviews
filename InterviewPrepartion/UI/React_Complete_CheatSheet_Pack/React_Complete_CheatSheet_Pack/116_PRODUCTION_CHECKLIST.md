# React Production Readiness Checklist

## Architecture
- [ ] state colocated
- [ ] server/client state separated
- [ ] route/data strategy defined
- [ ] error boundaries placed
- [ ] loading/Suspense boundaries intentional

## Performance
- [ ] initial JS budget
- [ ] route code splitting
- [ ] Web Vitals measured
- [ ] unnecessary global state avoided
- [ ] expensive renders profiled
- [ ] React Compiler/manual memoization strategy validated

## Security
- [ ] no client secrets
- [ ] raw HTML sanitized/trusted
- [ ] CSP considered
- [ ] Trusted Types considered where appropriate
- [ ] backend authorization enforced

## Accessibility
- [ ] semantic HTML
- [ ] labels/names
- [ ] keyboard flow
- [ ] focus behavior
- [ ] screen-reader checks

## Quality
- [ ] behavior-focused tests
- [ ] integration coverage
- [ ] critical E2E
- [ ] visual/accessibility tests where valuable

## Deployment
- [ ] hashed immutable assets
- [ ] cache invalidation safe
- [ ] source-map policy
- [ ] rollback
- [ ] telemetry includes release/version
