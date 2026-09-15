# Class Binding

## What / Why

Binds classes from strings/objects/arrays.

## Mental Model

```text
:class='{active:isActive}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Class Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for conditional styling.

## Common Mistake / Interview Trap

Avoid unreadable large class-expression objects in templates.

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

> **Class Binding:** Binds classes from strings/objects/arrays.
