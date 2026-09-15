# Angular — One-Page Architecture Recall

```text
                    Angular Application
                           │
              ┌────────────┼────────────┐
              ▼            ▼            ▼
          Components      Router        Services
              │            │            │
          Templates     Lazy Routes     DI
              │                         │
      Signals / RxJS                   HTTP
              │                         │
              └──────────┬──────────────┘
                         ▼
               Change Detection
          (Zoneless + OnPush default)
                         ▼
                        DOM
```

## Modern Data

```text
Local synchronous state → signals
Derived state → computed
External side effects → effect
Async streams → RxJS
Reactive read → resource/httpResource
Forms → Signal Forms / Reactive Forms
```

## Production

```text
SSR / Hydration
Lazy routes / @defer
Security / CSP / XSS
Accessibility / Angular Aria
Vitest / integration / E2E
Observability
Budgets / Web Vitals
```
