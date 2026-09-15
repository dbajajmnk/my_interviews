# toValue

## What / Why

Normalizes value/ref/getter to value.

## Mental Model

```text
toValue(source)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toValue
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in composables accepting flexible reactive inputs.

## Common Mistake / Interview Trap

Getter execution may establish dependencies when used in reactive context.

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

> **toValue:** Normalizes value/ref/getter to value.
