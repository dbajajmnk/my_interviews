# Data Fetching After Navigation

## What / Why

Navigate first, fetch in component.

## Mental Model

```text
route → component → loading → data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Fetching After Navigation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when immediate page shell/loading UX is desired.

## Common Mistake / Interview Trap

Handle param-change cancellation/races.

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

> **Data Fetching After Navigation:** Navigate first, fetch in component.
