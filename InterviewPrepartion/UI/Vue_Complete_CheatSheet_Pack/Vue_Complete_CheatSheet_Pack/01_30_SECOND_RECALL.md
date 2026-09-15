# Vue — 30-Second Recall

## Formula

```text
Reactive State
   ↓
Template / Render
   ↓
Compiler + Reactivity Tracking
   ↓
DOM Patch
```

## Modern Vue Stack

```text
Vue 3
Single-File Components
<script setup>
Composition API
ref / reactive / computed
watch / watchEffect
Vue Router
Pinia
Vite / create-vue
Vitest
SSR / Nuxt when needed
```

## State Rule

```text
Local UI → ref/reactive
Derived → computed
Side effect → watch/watchEffect
Shared app state → Pinia
Navigation state → Router/URL
Server state → fetch/query/framework cache
```

## Ten-Second Interview Answer

> Vue is a progressive JavaScript framework with a compiler-optimized rendering system, fine-grained reactivity, component-based templates, Composition API, and an official ecosystem around Router, Pinia, Vite, testing, and SSR frameworks such as Nuxt.
