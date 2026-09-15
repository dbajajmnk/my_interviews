# fetch

## What / Why

Browser/native fetch for HTTP calls.

## Mental Model

```text
await fetch(url)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: fetch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use directly or through service/composable.

## Common Mistake / Interview Trap

Remember status errors do not reject automatically for HTTP 4xx/5xx.

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

> **fetch:** Browser/native fetch for HTTP calls.
