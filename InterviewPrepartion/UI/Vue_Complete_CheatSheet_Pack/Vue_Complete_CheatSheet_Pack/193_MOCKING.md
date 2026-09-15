# Mocking

## What / Why

Mock network/external boundaries selectively.

## Mental Model

```text
MSW/fetch mock
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Mocking
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use realistic integration where practical.

## Common Mistake / Interview Trap

Excessive mocks create false confidence.

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

> **Mocking:** Mock network/external boundaries selectively.
