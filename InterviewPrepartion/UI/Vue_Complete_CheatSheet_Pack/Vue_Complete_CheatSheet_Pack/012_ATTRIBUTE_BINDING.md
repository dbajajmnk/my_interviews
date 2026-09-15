# Attribute Binding

## What / Why

`v-bind` / `:` binds element/component props and attributes.

## Mental Model

```text
:disabled='saving'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Attribute Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for dynamic attributes/props.

## Common Mistake / Interview Trap

Know prop-vs-attribute behavior for custom elements/components.

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

> **Attribute Binding:** `v-bind` / `:` binds element/component props and attributes.
