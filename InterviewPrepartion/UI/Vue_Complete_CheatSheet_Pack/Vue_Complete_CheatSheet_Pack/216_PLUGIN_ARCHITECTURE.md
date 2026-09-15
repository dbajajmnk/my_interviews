# Plugin Architecture

## What / Why

Vue `app.use()` installs app-level plugins.

## Mental Model

```text
app.use(router/pinia/plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Plugin Architecture
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for framework-wide capabilities.

## Common Mistake / Interview Trap

Plugins can hide global side effects; document them.

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

> **Plugin Architecture:** Vue `app.use()` installs app-level plugins.
