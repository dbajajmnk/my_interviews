# v-once

## What / Why

Renders subtree once and skips future updates.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-once
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for truly static runtime content.

## Common Mistake / Interview Trap

Wrong use creates stale UI.

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

> **v-once:** Renders subtree once and skips future updates.
