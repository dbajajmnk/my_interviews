# Emitted Events Testing

## What / Why

Inspect emitted events/payloads.

## Mental Model

```text
wrapper.emitted('save')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Emitted Events Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for component contract.

## Common Mistake / Interview Trap

Avoid testing framework internals.

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

> **Emitted Events Testing:** Inspect emitted events/payloads.
