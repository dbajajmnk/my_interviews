# Design System

## What / Why

Share tokens, primitives, patterns, accessibility.

## Mental Model

```text
tokens → components → features
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Design System
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use governed versioning.

## Common Mistake / Interview Trap

Do not put domain business logic in UI library.

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

> **Design System:** Share tokens, primitives, patterns, accessibility.
