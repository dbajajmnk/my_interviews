# toRefs

## What / Why

Converts reactive object properties to refs.

## Mental Model

```text
toRefs(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRefs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when destructuring a reactive object.

## Common Mistake / Interview Trap

Can create many refs unnecessarily.

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

> **toRefs:** Converts reactive object properties to refs.
