# withDefaults

## What / Why

Provides defaults for type-based defineProps in older/non-destructure patterns.

## Mental Model

```text
withDefaults(defineProps<Props>(),{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: withDefaults
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when needed.

## Common Mistake / Interview Trap

Mutable default values may need factory functions depending on API style.

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

> **withDefaults:** Provides defaults for type-based defineProps in older/non-destructure patterns.
