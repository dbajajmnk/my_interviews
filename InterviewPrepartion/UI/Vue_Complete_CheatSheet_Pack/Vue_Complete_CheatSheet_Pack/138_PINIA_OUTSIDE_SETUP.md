# Pinia Outside setup

## What / Why

Pass/ensure correct pinia instance when using stores outside component setup.

## Mental Model

```text
useStore(pinia)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Outside setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in guards/framework code.

## Common Mistake / Interview Trap

SSR context makes global singleton usage risky.

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

> **Pinia Outside setup:** Pass/ensure correct pinia instance when using stores outside component setup.
