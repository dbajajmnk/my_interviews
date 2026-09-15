# ref vs reactive Interview

## What / Why

ref wraps a value; reactive proxies object; both participate in same reactivity graph.

## Mental Model

```text
ref.value vs reactive.prop
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ref vs reactive Interview
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose by ergonomics/identity.

## Common Mistake / Interview Trap

Reactive object destructuring needs care.

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

> **ref vs reactive Interview:** ref wraps a value; reactive proxies object; both participate in same reactivity graph.
