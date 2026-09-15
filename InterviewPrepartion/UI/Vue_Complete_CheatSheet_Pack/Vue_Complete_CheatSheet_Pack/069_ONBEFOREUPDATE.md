# onBeforeUpdate

## What / Why

Runs before DOM patch after reactive update.

## Mental Model

```text
state change → beforeUpdate → patch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeUpdate
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely for DOM snapshot logic.

## Common Mistake / Interview Trap

Avoid mutating state that retriggers updates.

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

> **onBeforeUpdate:** Runs before DOM patch after reactive update.
