# Custom Directives

## What / Why

Encapsulate low-level DOM behavior.

## Mental Model

```text
v-focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Directives
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM concerns not suited to components/composables alone.

## Common Mistake / Interview Trap

Directive hooks should avoid owning business state.

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

> **Custom Directives:** Encapsulate low-level DOM behavior.
