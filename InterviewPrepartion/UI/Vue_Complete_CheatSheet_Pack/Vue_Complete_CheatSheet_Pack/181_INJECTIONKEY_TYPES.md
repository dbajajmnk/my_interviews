# InjectionKey Types

## What / Why

Use `InjectionKey<T>` for typed provide/inject.

## Mental Model

```text
const Key:InjectionKey<Auth>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: InjectionKey Types
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in libraries/context.

## Common Mistake / Interview Trap

Avoid unsafe casts after inject.

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

> **InjectionKey Types:** Use `InjectionKey<T>` for typed provide/inject.
