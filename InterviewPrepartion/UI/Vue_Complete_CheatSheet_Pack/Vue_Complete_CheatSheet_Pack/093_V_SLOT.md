# v-slot

## What / Why

Declares named/scoped slot content.

## Mental Model

```text
#header='{title}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-slot
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for flexible component APIs.

## Common Mistake / Interview Trap

Avoid slot APIs exposing too much internal implementation.

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

> **v-slot:** Declares named/scoped slot content.
