# Suspense

## What / Why

Coordinates async dependencies with fallback/content.

## Mental Model

```text
<Suspense><Async/></Suspense>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Suspense
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for async setup/async components where appropriate.

## Common Mistake / Interview Trap

Vue Suspense has had experimental status historically; verify exact support expectations in your framework/version.

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

> **Suspense:** Coordinates async dependencies with fallback/content.
