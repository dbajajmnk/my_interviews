# watchEffect

## What / Why

Runs immediately and tracks dependencies used synchronously.

## Mental Model

```text
watchEffect(()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watchEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for small auto-tracked side effects.

## Common Mistake / Interview Trap

Dependencies accessed after await are not tracked the same way.

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

> **watchEffect:** Runs immediately and tracks dependencies used synchronously.
