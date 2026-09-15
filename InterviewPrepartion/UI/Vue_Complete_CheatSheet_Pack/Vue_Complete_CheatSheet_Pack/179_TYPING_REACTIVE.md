# Typing reactive

## What / Why

Prefer inferred object type or carefully typed interfaces.

## Mental Model

```text
reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing reactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use ref for replacing whole object often.

## Common Mistake / Interview Trap

Generic argument on reactive can be misleading with nested unwrapping.

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

> **Typing reactive:** Prefer inferred object type or carefully typed interfaces.
