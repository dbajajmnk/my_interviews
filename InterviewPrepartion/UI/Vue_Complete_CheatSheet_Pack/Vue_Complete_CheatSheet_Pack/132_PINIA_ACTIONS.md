# Pinia Actions

## What / Why

Methods can mutate state and run async work.

## Mental Model

```text
actions:{async save(){...}}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Actions
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for business/client orchestration.

## Common Mistake / Interview Trap

Avoid giant stores containing unrelated domains.

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

> **Pinia Actions:** Methods can mutate state and run async work.
