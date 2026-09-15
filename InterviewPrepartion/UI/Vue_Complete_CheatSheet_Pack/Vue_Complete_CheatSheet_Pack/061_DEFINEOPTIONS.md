# defineOptions

## What / Why

Declares component options inside script setup.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineOptions
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for compile-time component options.

## Common Mistake / Interview Trap

Not for reactive runtime values.

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

> **defineOptions:** Declares component options inside script setup.
