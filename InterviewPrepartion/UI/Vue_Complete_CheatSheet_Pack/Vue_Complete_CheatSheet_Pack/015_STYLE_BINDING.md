# Style Binding

## What / Why

Binds inline style objects/arrays.

## Mental Model

```text
:style='{color:color}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Style Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for truly dynamic inline values.

## Common Mistake / Interview Trap

Prefer CSS classes for normal design styling.

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

> **Style Binding:** Binds inline style objects/arrays.
