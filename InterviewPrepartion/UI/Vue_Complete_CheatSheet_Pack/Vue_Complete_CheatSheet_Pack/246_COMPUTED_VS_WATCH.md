# computed vs watch

## What / Why

computed derives value; watch performs side effects.

## Mental Model

```text
derived vs effect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: computed vs watch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use computed whenever output is pure derivation.

## Common Mistake / Interview Trap

Watching just to set another derived ref is often redundant.

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

> **computed vs watch:** computed derives value; watch performs side effects.
