# Provide / Inject

## What / Why

Passes dependencies/context through component tree without prop drilling.

## Mental Model

```text
provide(key,value) → inject(key)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Provide / Inject
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for plugin-like/context dependencies.

## Common Mistake / Interview Trap

Use Symbol/injection keys for library safety.

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

> **Provide / Inject:** Passes dependencies/context through component tree without prop drilling.
