# React Interview Traps

1. React is a UI library; routing/data architecture comes from frameworks/ecosystem.
2. State is a snapshot, not a mutable local variable.
3. Re-render does not automatically mean DOM mutation.
4. Rendering must be pure.
5. `useEffect` is for synchronization with external systems.
6. Derived values usually do not belong in state.
7. Stable keys represent identity; index keys are risky for reordered stateful lists.
8. `useRef` updates do not trigger renders.
9. `useMemo`/`useCallback` are optimizations, not correctness tools.
10. Context is not automatically a global-state solution.
11. Server state and client UI state are different problems.
12. Suspense does not catch every arbitrary Promise unless integrated with supported resource/framework behavior.
13. Error Boundaries do not catch all event/async errors automatically.
14. Client-side permission checks are not backend authorization.
15. `dangerouslySetInnerHTML` needs trusted/sanitized content.
16. Hydration requires compatible server/client initial output.
17. Server Components cannot use client-only state/effects.
18. `'use client'` creates a client boundary in RSC frameworks.
19. Actions are mutation workflows, not just event handlers.
20. `useActionState` returns state, Action dispatcher and pending status.
21. `useOptimistic` needs failure reconciliation.
22. `useFormStatus` reads nearest form status.
23. `<Activity>` arrived in React 19.2.
24. `useEffectEvent` arrived in React 19.2.
25. ViewTransition became stable in React 19.3.
26. Fragment Refs became stable in React 19.3.
27. `browser()` is a React DOM 19.3 API for opting specific UI out of SSR under Suspense.
28. React 19.3 adds Trusted Types support; React is still not a sanitizer.
29. React Compiler 1.0 is stable but optional.
30. Compiler does not remove the need for profiling/state architecture.
31. Create React App is deprecated.
32. Modern React recommends frameworks for most full production apps.
33. Vite/Parcel/Rsbuild remain valid when a framework is not a fit.
34. Class components still matter for legacy maintenance.
35. StrictMode development behavior should not be confused with production behavior.
