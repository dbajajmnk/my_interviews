# Hydration

## What / Why

Client attaches Vue to server-rendered DOM.

## Mental Model

```text
SSR HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Hydration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with SSR/frameworks.

## Common Mistake / Interview Trap

Server and client output must be compatible.

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

> **Hydration:** Client attaches Vue to server-rendered DOM.
