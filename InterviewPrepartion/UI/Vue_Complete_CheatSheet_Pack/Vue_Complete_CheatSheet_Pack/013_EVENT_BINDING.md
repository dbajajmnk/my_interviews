# Event Binding

## What / Why

`v-on` / `@` binds events.

## Mental Model

```text
@click='save'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Event Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for user interactions.

## Common Mistake / Interview Trap

Pass function reference or inline expression deliberately.

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

> **Event Binding:** `v-on` / `@` binds events.
