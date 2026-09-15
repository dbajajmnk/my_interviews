# Pinia State

## What / Why

State function creates initial store state.

## Mental Model

```text
state:()=>({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia State
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed initial state.

## Common Mistake / Interview Trap

Declare all intended state properties.

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

> **Pinia State:** State function creates initial store state.
