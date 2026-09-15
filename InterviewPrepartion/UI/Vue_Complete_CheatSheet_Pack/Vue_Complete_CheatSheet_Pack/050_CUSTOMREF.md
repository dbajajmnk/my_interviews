# customRef

## What / Why

Implements custom tracking/triggering behavior.

## Mental Model

```text
customRef((track,trigger)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: customRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for debounce-like refs/library features.

## Common Mistake / Interview Trap

Incorrect tracking can create subtle bugs.

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

> **customRef:** Implements custom tracking/triggering behavior.
