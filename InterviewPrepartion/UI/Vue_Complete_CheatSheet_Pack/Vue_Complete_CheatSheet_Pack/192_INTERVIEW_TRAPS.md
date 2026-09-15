# Vue Interview Traps

1. Vue 3 is the current major; Vue 2 reached EOL on Dec 31, 2023.
2. Vue 3.5.42 is the stable baseline as of Sep 15, 2026; Vue 3.6 is still prerelease/RC.
3. Composition API does not deprecate Options API.
4. `<script setup>` is compile-time SFC syntax, not a runtime component API.
5. `ref` requires `.value` in JavaScript but templates auto-unwrap refs.
6. `reactive` returns a Proxy; destructuring properties can lose reactive linkage.
7. Vue 3.5 reactive props destructure is compiler-supported and remains reactive.
8. `computed` is for derived values, not side effects.
9. `watch` is explicit-source; `watchEffect` auto-tracks.
10. Async watchEffect only tracks dependencies accessed synchronously before the first await.
11. `onWatcherCleanup` must be registered synchronously while watcher/effect is executing.
12. Props are readonly.
13. Mutating nested prop objects still mutates parent-owned data and is usually poor design.
14. `defineModel` formalizes v-model component contracts.
15. `provide/inject` is not automatically a global-state solution.
16. Pinia is recommended for new large shared-state Vue apps.
17. Vuex is maintenance mode, not the recommendation for new apps.
18. Direct Pinia state destructuring loses reactivity; use `storeToRefs`.
19. Vue Router 4 is the Vue 3 router line.
20. Navigation guards are UX/navigation controls, not backend authorization.
21. Vue has no mandatory HTTP client.
22. Multiple fetch/composable invocations can duplicate requests; Vue does not cache server data automatically.
23. Teleport changes DOM location, not component ownership.
24. KeepAlive caches component instances; deactivation is not unmount.
25. Stable keys are essential for list/component identity.
26. `v-if` mounts/unmounts; `v-show` toggles display.
27. `v-html` can create XSS vulnerabilities.
28. Vite environment variables included in client bundle are not secrets.
29. SSR must create request-isolated mutable state.
30. Browser globals can break SSR.
31. Hydration requires compatible server/client initial markup.
32. `create-vue` + Vite is the official new-project setup.
33. Vue CLI is not the current recommendation for new projects.
34. Vitest is the recommended unit-test runner for Vite-powered Vue apps.
35. Nuxt is a framework built on Vue; Vue and Nuxt APIs/versioning should not be conflated.
