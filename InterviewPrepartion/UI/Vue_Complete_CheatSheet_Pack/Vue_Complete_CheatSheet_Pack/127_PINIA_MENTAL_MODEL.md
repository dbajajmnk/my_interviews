# Pinia Mental Model

## What / Why

Pinia stores provide named shared state, getters, actions, devtools/plugins, and SSR patterns.

## Mental Model

```text
Component → Store → State/Getters/Actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for app/feature shared state.

## Common Mistake / Interview Trap

Do not move every local ref into Pinia.

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

> **Pinia Mental Model:** Pinia stores provide named shared state, getters, actions, devtools/plugins, and SSR patterns.
