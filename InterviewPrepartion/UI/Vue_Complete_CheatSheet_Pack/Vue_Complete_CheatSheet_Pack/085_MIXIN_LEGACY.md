# Mixin Legacy

## What / Why

Mixins merge component options from multiple sources.

## Mental Model

```text
mixins:[...]
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Mixin Legacy
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know for legacy Vue 2/early Vue 3.

## Common Mistake / Interview Trap

Composition API/composables avoid naming/source ambiguity.

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

> **Mixin Legacy:** Mixins merge component options from multiple sources.
