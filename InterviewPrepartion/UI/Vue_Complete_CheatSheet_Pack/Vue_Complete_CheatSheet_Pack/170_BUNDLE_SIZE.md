# Bundle Size

## What / Why

Prefer tree-shakable APIs, lazy routes and smaller dependencies.

## Mental Model

```text
bundle analyzer
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Bundle Size
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use budgets/analysis.

## Common Mistake / Interview Trap

One dependency can dominate initial JS.

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

> **Bundle Size:** Prefer tree-shakable APIs, lazy routes and smaller dependencies.
