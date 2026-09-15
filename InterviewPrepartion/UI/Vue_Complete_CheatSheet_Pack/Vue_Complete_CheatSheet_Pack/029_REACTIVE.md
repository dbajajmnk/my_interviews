# reactive

## What / Why

Creates a deep reactive proxy for objects.

## Mental Model

```text
const state=reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: reactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for cohesive object state.

## Common Mistake / Interview Trap

Destructuring plain properties can lose reactivity unless using toRefs/toRef or reactive props behavior.

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

> **reactive:** Creates a deep reactive proxy for objects.
