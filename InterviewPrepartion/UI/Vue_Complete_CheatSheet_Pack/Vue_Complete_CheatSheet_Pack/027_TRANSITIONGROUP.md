# TransitionGroup

## What / Why

Animates list insert/remove/reorder.

## Mental Model

```text
keyed list → move transitions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: TransitionGroup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with stable keys.

## Common Mistake / Interview Trap

Poor keys break transition identity.

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

> **TransitionGroup:** Animates list insert/remove/reorder.
