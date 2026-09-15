# Configuration

## What / Why

Separate build-time public config from server/private config.

## Mental Model

```text
Vite env/runtime endpoint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Configuration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed validated config.

## Common Mistake / Interview Trap

Client config is never secret.

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

> **Configuration:** Separate build-time public config from server/private config.
