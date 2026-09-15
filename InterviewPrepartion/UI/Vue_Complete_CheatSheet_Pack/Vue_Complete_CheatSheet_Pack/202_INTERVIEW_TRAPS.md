# Vue Interview Traps

1. Vue 3.5.42 is the current stable baseline as of Sep 15, 2026.
2. Vue 3.6 is still RC; Vapor Mode is not yet the stable default.
3. Composition API does not deprecate Options API.
4. `<script setup>` is compile-time syntax sugar.
5. `ref` needs `.value` in JavaScript but templates auto-unwrap in common cases.
6. `reactive` returns a Proxy and object destructuring can lose reactivity.
7. Vue 3.5 reactive props destructure is special compiler behavior in script setup.
8. `computed` is for derived state; `watch` is for side effects.
9. `watchEffect` tracks dependencies used during synchronous execution.
10. Stable keys represent identity.
11. `v-if` and `v-show` have different mount/performance semantics.
12. `v-html` can create XSS.
13. Props are readonly in the child.
14. Nested prop objects can still be mutated in JavaScript; avoid hidden parent-state mutation.
15. `defineModel()` is the recommended component v-model approach since 3.4.
16. defineModel defaults can desynchronize parent/child when parent provides no value.
17. `useTemplateRef()` is a Vue 3.5 API.
18. Lazy hydration strategies are Vue 3.5+ SSR features.
19. `data-allow-mismatch` should be used selectively.
20. Pinia store state/getters should use `storeToRefs` when destructuring.
21. Pinia is not necessary for every local piece of state.
22. Navigation guards are not backend authorization.
23. Vue Router history mode needs server fallback on page refresh.
24. Vue Router Data Loaders are currently under the experimental API path; do not treat them as a frozen stable contract.
25. Async component loading and SSR hydration are separate concerns.
26. Suspense support/status should be checked against exact framework/version expectations.
27. KeepAlive preserves component state and can keep stale data.
28. Server state is not the same as Pinia/client state.
29. Singleton module state can leak across SSR requests.
30. Browser env variables are not secrets.
31. Teleport changes DOM location but not component ownership.
32. Vue templates are not safe to compile from untrusted user content.
33. Nuxt is a framework built around Vue; Vue itself is the core framework/library layer.
34. Vite is tooling, not part of Vue runtime.
35. Vue 2 patterns remain important for migration but are not modern defaults.
