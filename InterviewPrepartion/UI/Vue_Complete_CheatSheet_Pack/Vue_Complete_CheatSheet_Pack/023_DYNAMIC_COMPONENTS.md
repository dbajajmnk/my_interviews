# Dynamic Components

## What / Why

`<component :is='current'>` switches component type dynamically.

## Mental Model

```text
type → component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Dynamic Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for tabs/pluggable views.

## Common Mistake / Interview Trap

Consider KeepAlive if state preservation is needed.

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

> **Dynamic Components:** `<component :is='current'>` switches component type dynamically.
