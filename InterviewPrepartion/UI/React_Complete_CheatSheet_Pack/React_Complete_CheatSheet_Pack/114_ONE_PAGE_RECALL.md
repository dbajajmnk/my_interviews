# React — One-Page Architecture Recall

```text
User Event / External Update
          ↓
       State Update
          ↓
        Render
       (pure)
          ↓
    Reconciliation
          ↓
        Commit
          ↓
          DOM
          ↓
 Effects synchronize external systems
```

## Data Flow

```text
Parent → props → Child
Context → distant consumers
Local state → local UI
Server state → framework/query/RSC cache
URL → navigation/shareable state
```

## Modern Async UI

```text
Action
 ├── useActionState
 ├── useOptimistic
 └── useFormStatus

Suspense
 ├── lazy
 ├── framework data
 ├── use(resource)
 └── streaming/RSC
```

## Performance

```text
State Colocation
React Compiler
Code Splitting
Suspense
Transition
Deferred Value
Profiler
Web Vitals
```

## Production

```text
Accessibility
Security
Error Boundaries
Telemetry
Immutable Assets
Cache Safety
Feature Flags
Tests
```
