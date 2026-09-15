# Destructuring Reactivity

## What / Why

Reactive props destructure works in Vue 3.5 script setup, but ordinary reactive object destructuring rules still matter.

## Mental Model

```text
props compiler transform vs generic object
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Destructuring Reactivity
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know context.

## Common Mistake / Interview Trap

Do not generalize reactive-props destructure to every reactive object.

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

> **Destructuring Reactivity:** Reactive props destructure works in Vue 3.5 script setup, but ordinary reactive object destructuring rules still matter.
