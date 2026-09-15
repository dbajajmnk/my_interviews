# Sources & Accuracy Notes

Primary current references:

- Vue official documentation: https://vuejs.org/
- Vue core release/changelog
- Vue Router official documentation
- Pinia official documentation
- Vue TypeScript / language-tools documentation

## Current Baseline — September 15, 2026

```text
Vue stable: 3.5.42
Vue 3.6: Release Candidate (v3.6.0-rc.8 surfaced)
```

## Important Stable Feature Mapping

```text
Vue 3.4+
defineModel() recommended for component v-model

Vue 3.5+
Reactive Props Destructure
useTemplateRef()
lazy hydration strategies for async components
data-allow-mismatch hydration suppression
language-tools improvements for template refs
```

## Future / Pre-release

```text
Vue 3.6 RC:
Vapor Mode
major @vue/reactivity refactor based on alien-signals
```

## Router Note

Vue Router's newer Data Loaders documentation currently uses the `vue-router/experimental` entry point. Treat it as experimental and verify exact API status before production adoption.

## Pinia

Pinia remains the official/recommended store solution in the modern Vue ecosystem, with Options and Setup store styles plus SSR guidance.

## Accuracy Rule

Before production design, confirm:
- exact Vue / Router / Pinia versions,
- framework (Nuxt) compatibility,
- experimental feature status,
- browser/SSR requirements,
- security advisories.
