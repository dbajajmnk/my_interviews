# Typing Emits

## What / Why

Use typed defineEmits signatures.

## Mental Model

```text
defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Emits
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to document component events.

## Common Mistake / Interview Trap

Avoid untyped string payloads.

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

> **Typing Emits:** Use typed defineEmits signatures.
