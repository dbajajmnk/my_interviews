# TypeScript Setup

## What / Why

Vue SFCs support `<script setup lang='ts'>` and vue-tsc/language tooling.

## Mental Model

```text
TS + template inference
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: TypeScript Setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use strict TypeScript in production apps.

## Common Mistake / Interview Trap

Build transpilation alone may not perform full type checking.

## Production Questions

```text
Who owns this state?
Is this local state, server state, URL state, or store state?
Is cleanup required?
What happens during SSR/hydration?
Can this be lazy-loaded?
How is this typed and tested?
What happens on slow network/error?
```

## 20-Second Recall

> **TypeScript Setup:** Vue SFCs support `<script setup lang='ts'>` and vue-tsc/language tooling.
