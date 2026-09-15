# Vue — One-Page Architecture Recall

```text
                    Vue Application
                          │
             ┌────────────┼────────────┐
             ▼            ▼            ▼
         Components     Router        Pinia
             │            │            │
       Props / Emits     Routes       Stores
             │                         │
       ref / reactive / computed / watchers
             │
        Render Effect
             │
   Compiler + Virtual DOM Patch
             │
            DOM
```

## State

```text
Local UI → ref/reactive
Derived → computed
Side effect → watch/watchEffect
Feature/app shared → Pinia
Navigation → Router URL
Remote authoritative data → query/framework/server cache
```

## Performance

```text
lazy routes
async components
compiler optimizations
stable props/keys
virtualization
lazy hydration
bundle analysis
Web Vitals
```

## Production

```text
TypeScript
testing
accessibility
security
SSR isolation
error telemetry
immutable assets
```
