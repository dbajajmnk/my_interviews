# API Service Layer

## What / Why

Centralizes transport/DTO mapping.

## Mental Model

```text
component → composable/service → HTTP
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: API Service Layer
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when API protocol should be isolated.

## Common Mistake / Interview Trap

Avoid generic mega-service.

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

> **API Service Layer:** Centralizes transport/DTO mapping.
