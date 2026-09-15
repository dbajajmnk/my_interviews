# Route Params

## What / Why

Dynamic path identity.

## Mental Model

```text
:id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Route Params
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for resource routes.

## Common Mistake / Interview Trap

React to param changes when same component instance is reused.

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

> **Route Params:** Dynamic path identity.
