# SSR Security

## What / Why

Escape serialized state and isolate request state.

## Mental Model

```text
server request → isolated app/store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use framework-recommended serializers.

## Common Mistake / Interview Trap

Cross-request singleton state can leak user data.

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

> **SSR Security:** Escape serialized state and isolate request state.
