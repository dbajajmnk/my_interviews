# Pinia SSR

## What / Why

Create Pinia per application request and hydrate serialized state safely.

## Mental Model

```text
server store → serialize → client hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use framework guidance, especially Nuxt.

## Common Mistake / Interview Trap

Never share singleton server store across requests.

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

> **Pinia SSR:** Create Pinia per application request and hydrate serialized state safely.
