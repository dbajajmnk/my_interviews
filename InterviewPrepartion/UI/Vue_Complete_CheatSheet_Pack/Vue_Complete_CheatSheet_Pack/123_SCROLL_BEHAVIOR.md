# Scroll Behavior

## What / Why

Controls position after navigation.

## Mental Model

```text
scrollBehavior
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Scroll Behavior
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for SPA navigation UX.

## Common Mistake / Interview Trap

Browser/history behavior should be tested.

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

> **Scroll Behavior:** Controls position after navigation.
