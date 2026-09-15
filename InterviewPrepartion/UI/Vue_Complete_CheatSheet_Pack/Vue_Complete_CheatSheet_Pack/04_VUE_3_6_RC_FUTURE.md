# Vue 3.6 RC — Future-Facing Cheat Sheet

## Status

As of September 15, 2026, Vue 3.6 is still **Release Candidate**, not stable.

## Major Themes

### Vapor Mode
A compiler/runtime strategy designed to update DOM more directly without relying on the normal Virtual DOM path for supported compiled components.

Mental model:
```text
Template
  ↓
Vapor Compiler
  ↓
Fine-grained DOM operations
```

### Reactivity Engine Refactor
Vue 3.6 RC includes a major `@vue/reactivity` refactor based on alien-signals with performance and memory improvements.

## Interview Position

Say:

> Vue 3.6 introduces Vapor Mode and a major reactivity-engine rewrite, but as of September 15, 2026 it is still in RC. My stable production baseline is Vue 3.5.42.

## Rule

Learn 3.6 architecture now; adopt in production only after stable release and ecosystem compatibility review.
