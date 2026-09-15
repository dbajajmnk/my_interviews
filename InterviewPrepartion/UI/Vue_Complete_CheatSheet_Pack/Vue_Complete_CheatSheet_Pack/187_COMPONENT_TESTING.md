# Component Testing

## What / Why

Mount component, set props, trigger events, assert DOM/emits.

## Mental Model

```text
mount → interact → assert
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Component Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use behavior-focused tests.

## Common Mistake / Interview Trap

Do not assert private implementation details.

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

> **Component Testing:** Mount component, set props, trigger events, assert DOM/emits.
