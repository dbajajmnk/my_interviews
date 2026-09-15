# unref

## What / Why

Returns ref value or plain value unchanged.

## Mental Model

```text
unref(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: unref
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in generic utilities.

## Common Mistake / Interview Trap

Often `toValue` is better for MaybeRefOrGetter inputs.

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

> **unref:** Returns ref value or plain value unchanged.
