# Current Vue Baseline — Vue 3.5

## Stable Version

As of September 15, 2026:

```text
Vue stable: 3.5.42
Vue 3.6: release-candidate / pre-release
```

Vue 3 remains the current major Vue line.

Vue 2 reached end of life on December 31, 2023.

## Production Baseline

```text
Vue 3.5.x
Composition API
<script setup>
create-vue
Vite
Vue Router 4
Pinia
Vitest
TypeScript when appropriate
```

## Important Vue 3.5-era Features

```text
Reactive props destructure
useTemplateRef()
onWatcherCleanup()
SSR lazy hydration strategies
reactivity/SSR improvements
```

## Setup

```bash
npm create vue@latest
```

Official create-vue prompts can configure:
- TypeScript
- JSX
- Vue Router
- Pinia
- testing
- linting/formatting

## Rule

Do not treat Vue 3.6 RC APIs/behavior as stable production baseline until 3.6 is officially released.
