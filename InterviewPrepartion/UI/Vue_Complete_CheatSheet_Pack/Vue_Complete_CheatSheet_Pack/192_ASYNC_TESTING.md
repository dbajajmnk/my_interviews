# Async Testing

## What / Why

Await DOM flush/promises via nextTick/flushPromises as appropriate.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use deterministic async outcomes.

## Common Mistake / Interview Trap

Arbitrary sleeps are brittle.

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

> **Async Testing:** Await DOM flush/promises via nextTick/flushPromises as appropriate.
