# Bundle Analysis

## What / Why

Analyze chunks/dependencies.

## Mental Model

```text
rollup visualizer/etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Bundle Analysis
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use before performance changes.

## Common Mistake / Interview Trap

Measure actual load/parse/runtime costs.

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

> **Bundle Analysis:** Analyze chunks/dependencies.
