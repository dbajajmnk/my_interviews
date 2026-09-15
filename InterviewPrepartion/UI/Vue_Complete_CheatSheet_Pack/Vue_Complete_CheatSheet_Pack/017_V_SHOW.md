# v-show

## What / Why

Toggles display while keeping element mounted.

## Mental Model

```text
display:none
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-show
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for frequently toggled content.

## Common Mistake / Interview Trap

Initial render cost remains.

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

> **v-show:** Toggles display while keeping element mounted.
