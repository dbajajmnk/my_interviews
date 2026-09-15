# Vue Mental Model

## What / Why

Vue builds reactive component UIs by tracking dependencies and efficiently updating the DOM.

## Mental Model

```text
Reactive State → Render Effect → Virtual DOM/Compiler Optimizations → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use this as the mental model for state-driven UI.

## Common Mistake / Interview Trap

Vue reactivity does not mean every state change rerenders the entire application.

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

> **Vue Mental Model:** Vue builds reactive component UIs by tracking dependencies and efficiently updating the DOM.
