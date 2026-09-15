# Lazy Hydration Strategies

## What / Why

Vue 3.5+ async components can hydrate on idle/visible/media/interaction.

## Mental Model

```text
hydrateOnIdle/Visible/MediaQuery/Interaction
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration Strategies
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to reduce hydration cost.

## Common Mistake / Interview Trap

Requires SSR context.

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

> **Lazy Hydration Strategies:** Vue 3.5+ async components can hydrate on idle/visible/media/interaction.
