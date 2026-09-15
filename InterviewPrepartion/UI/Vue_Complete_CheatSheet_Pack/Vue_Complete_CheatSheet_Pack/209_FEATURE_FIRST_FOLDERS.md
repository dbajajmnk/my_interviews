# Feature-First Folders

## What / Why

Organize code by business feature.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Feature-First Folders
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in medium/large apps.

## Common Mistake / Interview Trap

Avoid giant global components/composables/services folders.

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

> **Feature-First Folders:** Organize code by business feature.
