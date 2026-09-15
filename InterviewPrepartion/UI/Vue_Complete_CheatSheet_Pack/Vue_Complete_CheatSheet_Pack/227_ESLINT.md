# ESLint

## What / Why

Static analysis for Vue/TS/code quality.

## Mental Model

```text
eslint-plugin-vue
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ESLint
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use project rules and CI.

## Common Mistake / Interview Trap

Lint cannot replace runtime tests.

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

> **ESLint:** Static analysis for Vue/TS/code quality.
