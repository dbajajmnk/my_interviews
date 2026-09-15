# v-for

## What / Why

Iterates over arrays/objects/ranges.

## Mental Model

```text
v-for='item in items' :key='item.id'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-for
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Avoid v-if on same element when filtered computed data is clearer.

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

> **v-for:** Iterates over arrays/objects/ranges.
