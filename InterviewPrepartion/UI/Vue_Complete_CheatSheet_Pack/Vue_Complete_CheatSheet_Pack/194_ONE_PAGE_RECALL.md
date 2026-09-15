# Vue — One-Page Architecture Recall

```text
                        Vue App
                           │
            ┌──────────────┼──────────────┐
            ▼              ▼              ▼
        Components       Router          Pinia
            │              │              │
       SFC Template     URL State    Shared State
            │                             │
            └──────────┬──────────────────┘
                       ▼
             Composition API
          ref/reactive/computed
             watch / effects
                       ▼
              Compiler + Runtime
                       ▼
                      DOM
```

## Async

```text
fetch / framework query
→ pending/error/data
→ ref/composable/store
```

## Built-ins

```text
Teleport
KeepAlive
Suspense
Transition
Async Components
```

## Production

```text
Vite / create-vue
Vue Router
Pinia
Vitest
SSR/Nuxt when needed
Security
Accessibility
Web Vitals
Telemetry
```
