# Renderless Component

## What / Why

Uses slots to expose logic without UI.

## Mental Model

```text
slot props
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Renderless Component
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know as older reuse pattern.

## Common Mistake / Interview Trap

Composables usually provide simpler logic reuse today.

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

> **Renderless Component:** Uses slots to expose logic without UI.
