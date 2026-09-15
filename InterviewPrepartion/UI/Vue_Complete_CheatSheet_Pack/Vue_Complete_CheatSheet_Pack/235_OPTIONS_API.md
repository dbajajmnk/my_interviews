# Options API

## What / Why

Organizes component by data/computed/methods/watch/lifecycle options.

## Mental Model

```text
export default {data,computed,methods}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Options API
// Use the concrete API described above in real code.
</script>
```

## When to Use

Still fully supported and useful.

## Common Mistake / Interview Trap

Composition API is often better for complex reusable logic, not automatically for every tiny component.

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

> **Options API:** Organizes component by data/computed/methods/watch/lifecycle options.
