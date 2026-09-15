# Error Architecture

## What / Why

Use local error states, onErrorCaptured/app errorHandler, router/framework error boundaries, telemetry.

## Mental Model

```text
error → local/global handler → UX + telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Error Architecture
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use layered recovery.

## Common Mistake / Interview Trap

One global error handler should not replace local UX.

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

> **Error Architecture:** Use local error states, onErrorCaptured/app errorHandler, router/framework error boundaries, telemetry.
