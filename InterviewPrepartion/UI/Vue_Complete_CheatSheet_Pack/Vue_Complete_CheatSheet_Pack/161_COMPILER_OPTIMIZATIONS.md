# Compiler Optimizations

## What / Why

Vue's template compiler emits patch flags/static hoisting to reduce runtime work.

## Mental Model

```text
template → optimized render code
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Compiler Optimizations
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use normal templates and let compiler optimize.

## Common Mistake / Interview Trap

Hand-written render functions can lose compiler optimizations.

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

> **Compiler Optimizations:** Vue's template compiler emits patch flags/static hoisting to reduce runtime work.
