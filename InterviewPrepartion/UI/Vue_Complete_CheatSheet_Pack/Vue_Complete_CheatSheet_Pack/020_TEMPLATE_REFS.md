# Template Refs

## What / Why

Refs access DOM/components after mount.

## Mental Model

```text
useTemplateRef('input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Template Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for focus, measurement, third-party integrations.

## Common Mistake / Interview Trap

Do not use template refs as ordinary reactive application state.

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

> **Template Refs:** Refs access DOM/components after mount.
