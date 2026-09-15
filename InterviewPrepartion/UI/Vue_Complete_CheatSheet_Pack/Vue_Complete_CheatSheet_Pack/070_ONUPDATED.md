# onUpdated

## What / Why

Runs after DOM update.

## Mental Model

```text
patch → onUpdated
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onUpdated
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM-dependent integration.

## Common Mistake / Interview Trap

Can run frequently; do not perform expensive work blindly.

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

> **onUpdated:** Runs after DOM update.
