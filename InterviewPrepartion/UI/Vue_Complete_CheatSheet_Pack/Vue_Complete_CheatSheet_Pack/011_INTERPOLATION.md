# Interpolation

## What / Why

Displays text from expressions.

## Mental Model

```text
{{ user.name }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Interpolation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for escaped text content.

## Common Mistake / Interview Trap

Do not expect interpolation inside raw HTML attributes; use bindings.

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

> **Interpolation:** Displays text from expressions.
