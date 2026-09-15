# URL Security

## What / Why

User-provided URLs need backend/frontend validation.

## Mental Model

```text
href=userUrl
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: URL Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Validate schemes/targets.

## Common Mistake / Interview Trap

`javascript:` and malicious URLs are dangerous.

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

> **URL Security:** User-provided URLs need backend/frontend validation.
