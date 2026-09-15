# computed

## What / Why

Creates cached derived reactive value.

## Mental Model

```text
computed(()=>first.value+' '+last.value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: computed
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for derived state.

## Common Mistake / Interview Trap

Computed getters should be pure.

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

> **computed:** Creates cached derived reactive value.
