# Transition

## What / Why

Adds enter/leave transition orchestration.

## Mental Model

```text
state change → transition classes/hooks
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Transition
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for UI transitions.

## Common Mistake / Interview Trap

Do not animate layout-heavy properties unnecessarily.

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

> **Transition:** Adds enter/leave transition orchestration.
