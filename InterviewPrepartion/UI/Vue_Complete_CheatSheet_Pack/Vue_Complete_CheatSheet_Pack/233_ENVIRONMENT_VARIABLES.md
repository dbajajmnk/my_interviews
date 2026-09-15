# Environment Variables

## What / Why

Vite exposes prefixed client env vars.

## Mental Model

```text
import.meta.env
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Environment Variables
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for public build config.

## Common Mistake / Interview Trap

Never store secrets.

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

> **Environment Variables:** Vite exposes prefixed client env vars.
