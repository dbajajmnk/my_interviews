# Router Testing

## What / Why

Create memory history/router and await readiness.

## Mental Model

```text
createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Router Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for route/guard tests.

## Common Mistake / Interview Trap

Browser history assumptions can make tests flaky.

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

> **Router Testing:** Create memory history/router and await readiness.
