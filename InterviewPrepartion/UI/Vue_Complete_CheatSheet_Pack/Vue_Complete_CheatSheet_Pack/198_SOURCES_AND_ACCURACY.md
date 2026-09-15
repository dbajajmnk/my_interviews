# Sources & Accuracy Notes

Primary current references:

- Vue official documentation — https://vuejs.org/
- Vue release policy — https://vuejs.org/about/releases
- Vue npm package release tags
- Vue Router official documentation
- Pinia official documentation
- Vue testing guide
- Vue SSR guide

## Current Baseline — September 15, 2026

```text
Vue stable: 3.5.42
Vue 3.6: RC/pre-release
Vue 2: EOL since Dec 31, 2023
```

## Current Official Ecosystem Guidance

```text
Project scaffolding → create-vue
Build tool → Vite
Routing → Vue Router
Large shared state → Pinia
Unit testing → Vitest
Full-stack/SSR framework → Nuxt ecosystem where appropriate
```

## Version-Sensitive Vue 3.5 Topics

```text
Reactive props destructure
useTemplateRef()
onWatcherCleanup()
SSR lazy hydration strategies
reactivity / hydration improvements
```

## Accuracy Rule

Before production work verify:
- exact Vue patch/minor,
- Router and Pinia versions,
- Vite/TypeScript compatibility,
- Nuxt version if applicable,
- browser support,
- pre-release vs stable status.
