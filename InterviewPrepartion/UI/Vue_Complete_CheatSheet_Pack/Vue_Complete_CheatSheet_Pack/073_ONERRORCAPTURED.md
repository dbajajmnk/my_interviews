# onErrorCaptured

## What / Why

Captures descendant errors.

## Mental Model

```text
child error → ancestor hook
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onErrorCaptured
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for error boundaries/logging.

## Common Mistake / Interview Trap

Returning false stops propagation.

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

> **onErrorCaptured:** Captures descendant errors.
