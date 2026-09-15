# Lazy Hydration Performance

## What / Why

Delay hydration until idle/visible/interaction.

## Mental Model

```text
SSR static → later hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration Performance
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for below-fold/low-priority widgets.

## Common Mistake / Interview Trap

Measure interaction readiness.

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

> **Lazy Hydration Performance:** Delay hydration until idle/visible/interaction.
