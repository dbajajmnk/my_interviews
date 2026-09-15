# Why Vue Updates

## What / Why

Reactive dependency changes trigger affected render effects; compiler/runtime optimize patching.

## Mental Model

```text
mutation → tracked dependency → update
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Why Vue Updates
// Use the concrete API described above in real code.
</script>
```

## When to Use

Explain dependency tracking, not 'whole DOM rerenders'.

## Common Mistake / Interview Trap

Reactive mutation and DOM flush are asynchronous/batched.

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

> **Why Vue Updates:** Reactive dependency changes trigger affected render effects; compiler/runtime optimize patching.
