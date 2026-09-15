# Observability

## What / Why

Capture route, version, API timing, component errors, backend trace IDs.

## Mental Model

```text
frontend telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Observability
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use release-aware monitoring.

## Common Mistake / Interview Trap

Do not log secrets or sensitive payloads.

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

> **Observability:** Capture route, version, API timing, component errors, backend trace IDs.
