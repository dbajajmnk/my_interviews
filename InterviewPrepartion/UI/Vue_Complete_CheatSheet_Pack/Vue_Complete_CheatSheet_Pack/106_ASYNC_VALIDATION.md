# Async Validation

## What / Why

Validates with server/async source.

## Mental Model

```text
watch/debounce/cancel
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Validation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use cancellation/stale-result protection.

## Common Mistake / Interview Trap

Race conditions can show outdated validation.

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

> **Async Validation:** Validates with server/async source.
