# React — 30-Second Recall

## Formula

```text
Props + State
   ↓
Render (pure)
   ↓
Reconciliation
   ↓
Commit
   ↓
DOM
   ↓
Effects synchronize external systems
```

## Daily Core

```text
Components
Props
State
Events
Keys
useState
useReducer
useContext
useRef
useEffect
Custom Hooks
```

## Performance

```text
Profile first
State colocation
React Compiler
memo/useMemo/useCallback when justified
lazy + Suspense
Transitions / deferred values
```

## Modern React 19.x

```text
Actions
useActionState
useOptimistic
useFormStatus
use
Activity
useEffectEvent
ViewTransition
Fragment Refs
browser()
Trusted Types
React Compiler
```

## Five Rules

1. Rendering must be pure.
2. State is a snapshot.
3. Effects synchronize with external systems.
4. Stable keys represent identity.
5. Keep state as local as practical.

## Ten-Second Interview Answer

> React is a component-based UI library that uses declarative rendering, one-way data flow, state-driven updates, reconciliation, and a render/commit model.
