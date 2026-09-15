# Semantic HTML

## What / Why

Use native semantic elements first.

## Mental Model

```text
button/label/nav
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Semantic HTML
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for accessibility.

## Common Mistake / Interview Trap

Clickable divs require extra work and often remain inferior.

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

> **Semantic HTML:** Use native semantic elements first.
