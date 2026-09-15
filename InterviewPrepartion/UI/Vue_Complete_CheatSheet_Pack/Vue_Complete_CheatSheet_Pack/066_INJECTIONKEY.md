# InjectionKey

## What / Why

Typed symbol for provide/inject.

## Mental Model

```text
InjectionKey<UserContext>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: InjectionKey
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in TypeScript libraries/apps.

## Common Mistake / Interview Trap

Avoid string key collisions in large apps.

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

> **InjectionKey:** Typed symbol for provide/inject.
