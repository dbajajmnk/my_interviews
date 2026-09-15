# defineEmits

## What / Why

Compiler macro declares emitted events.

## Mental Model

```text
const emit=defineEmits<...>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineEmits
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed child-to-parent events.

## Common Mistake / Interview Trap

Emits should represent events, not remote procedure calls for everything.

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

> **defineEmits:** Compiler macro declares emitted events.
