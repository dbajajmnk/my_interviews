# SSR State Serialization

## What / Why

Serialize app/store state safely into HTML.

## Mental Model

```text
server state → escaped JSON → client
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR State Serialization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use secure serializers such as framework-recommended tools.

## Common Mistake / Interview Trap

Unsafe serialization can create XSS.

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

> **SSR State Serialization:** Serialize app/store state safely into HTML.
