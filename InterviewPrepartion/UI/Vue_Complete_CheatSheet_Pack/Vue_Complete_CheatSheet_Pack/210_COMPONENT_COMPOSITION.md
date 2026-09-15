# Component Composition

## What / Why

Build pages from focused components with explicit props/emits/slots.

## Mental Model

```text
Page → Feature → UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Component Composition
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use simple one-way contracts.

## Common Mistake / Interview Trap

Avoid prop drilling across many layers when context/store fits.

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

> **Component Composition:** Build pages from focused components with explicit props/emits/slots.
