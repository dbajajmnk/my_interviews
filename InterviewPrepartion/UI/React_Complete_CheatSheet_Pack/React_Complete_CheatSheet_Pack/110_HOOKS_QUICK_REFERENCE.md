# React Hooks — Quick Reference

| Hook/API | Primary Purpose |
|---|---|
| `useState` | local state |
| `useReducer` | complex local state transitions |
| `useContext` | consume context |
| `useRef` | mutable value / DOM reference |
| `useEffect` | sync with external systems |
| `useLayoutEffect` | layout measurement before paint |
| `useInsertionEffect` | CSS-in-JS library insertion |
| `useMemo` | cache calculation |
| `useCallback` | cache function identity |
| `useTransition` | non-blocking transition + pending |
| `startTransition` | mark transition update |
| `useDeferredValue` | defer non-urgent value rendering |
| `useId` | accessibility-safe unique ID |
| `useSyncExternalStore` | external store subscription |
| `useDebugValue` | custom hook DevTools label |
| `useImperativeHandle` | customize ref handle |
| `useActionState` | Action state + pending |
| `useOptimistic` | optimistic state |
| `useEffectEvent` | non-reactive event logic from Effects |
| `use` | read Promise/context/resource |
| `useFormStatus` | nearest form Action status (react-dom) |

## Rule

Use Hooks to model state, synchronization and reusable logic—not to recreate lifecycle methods mechanically.
