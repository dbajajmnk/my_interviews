# Vapor Mode Future

## What / Why

Vue 3.6 RC includes Vapor Mode, a compiler strategy without Virtual DOM for supported paths.

## Mental Model

```text
template → fine-grained DOM updates
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vapor Mode Future
// Use the concrete API described above in real code.
</script>
```

## When to Use

Track for future adoption after stable release/ecosystem readiness.

## Common Mistake / Interview Trap

As of Sep 15 2026 Vue 3.6 is RC, not the stable production baseline.

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

> **Vapor Mode Future:** Vue 3.6 RC includes Vapor Mode, a compiler strategy without Virtual DOM for supported paths.
