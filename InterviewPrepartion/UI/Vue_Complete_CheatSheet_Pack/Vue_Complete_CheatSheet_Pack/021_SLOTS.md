# Slots

## What / Why

Slots let parents provide template content to child components.

## Mental Model

```text
Parent content → child slot
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Slots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for composition.

## Common Mistake / Interview Trap

Slot scope comes from where template is defined.

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

> **Slots:** Slots let parents provide template content to child components.
