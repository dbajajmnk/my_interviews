# DTO Mapping

## What / Why

Maps backend shape to UI/domain model.

## Mental Model

```text
DTO → mapper → model
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: DTO Mapping
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when contracts differ.

## Common Mistake / Interview Trap

Do not leak backend naming everywhere if it harms domain clarity.

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

> **DTO Mapping:** Maps backend shape to UI/domain model.
