# Props Mutation

## What / Why

Props are readonly in child.

## Mental Model

```text
parent → prop → child
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Props Mutation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Emit/model local changes.

## Common Mistake / Interview Trap

Mutating nested object through prop can still mutate parent-owned data; avoid hidden mutation.

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

> **Props Mutation:** Props are readonly in child.
