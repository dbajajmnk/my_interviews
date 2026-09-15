# Props Stability

## What / Why

Keep child inputs stable where possible.

## Mental Model

```text
derive in parent
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Props Stability
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for large repeated children.

## Common Mistake / Interview Trap

Premature identity micro-optimization can reduce readability.

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

> **Props Stability:** Keep child inputs stable where possible.
