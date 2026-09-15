# Generic Components

## What / Why

SFC script setup supports generic component patterns.

## Mental Model

```text
<script setup generic='T'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Generic Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable typed lists/selects.

## Common Mistake / Interview Trap

Keep public API ergonomic.

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

> **Generic Components:** SFC script setup supports generic component patterns.
