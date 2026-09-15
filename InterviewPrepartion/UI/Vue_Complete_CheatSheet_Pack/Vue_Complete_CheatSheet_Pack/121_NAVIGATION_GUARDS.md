# Navigation Guards

## What / Why

Global/per-route/in-component guards can redirect/cancel navigation.

## Mental Model

```text
beforeEach
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Navigation Guards
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for UX/navigation rules.

## Common Mistake / Interview Trap

Backend must enforce authorization.

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

> **Navigation Guards:** Global/per-route/in-component guards can redirect/cancel navigation.
