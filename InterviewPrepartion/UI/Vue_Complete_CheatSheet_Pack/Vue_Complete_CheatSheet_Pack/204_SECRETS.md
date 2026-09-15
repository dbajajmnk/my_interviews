# Secrets

## What / Why

Anything in browser bundle/runtime config can be inspected.

## Mental Model

```text
client env != secret
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Secrets
// Use the concrete API described above in real code.
</script>
```

## When to Use

Keep secrets server-side.

## Common Mistake / Interview Trap

Vite env variables shipped to client are public by definition.

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

> **Secrets:** Anything in browser bundle/runtime config can be inspected.
