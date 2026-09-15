# defineProps

## What / Why

Compiler macro declares component props.

## Mental Model

```text
const props=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineProps
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed props in script setup.

## Common Mistake / Interview Trap

Props are readonly from child perspective.

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

> **defineProps:** Compiler macro declares component props.
