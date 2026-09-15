# API Adapter

## What / Why

Maps backend DTO/protocol into domain-facing API.

## Mental Model

```text
feature → adapter → API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: API Adapter
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when backend shape differs from UI/domain model.

## Common Mistake / Interview Trap

Avoid layers that add no semantic value.

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

> **API Adapter:** Maps backend DTO/protocol into domain-facing API.
