# shallowReactive

## What / Why

Only root-level properties are reactive.

## Mental Model

```text
shallowReactive(obj)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowReactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for controlled performance/integration cases.

## Common Mistake / Interview Trap

Mixing shallow/deep trees can be confusing.

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

> **shallowReactive:** Only root-level properties are reactive.
