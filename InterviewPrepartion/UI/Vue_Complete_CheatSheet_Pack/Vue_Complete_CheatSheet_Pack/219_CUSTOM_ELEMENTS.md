# Custom Elements

## What / Why

Vue can define custom elements for cross-framework integration.

## Mental Model

```text
defineCustomElement
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Elements
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for embeddable widgets.

## Common Mistake / Interview Trap

Styling/dependency/context behavior differs from normal app components.

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

> **Custom Elements:** Vue can define custom elements for cross-framework integration.
