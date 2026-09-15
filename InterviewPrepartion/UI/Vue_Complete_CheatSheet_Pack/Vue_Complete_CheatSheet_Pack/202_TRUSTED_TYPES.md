# Trusted Types

## What / Why

Can harden dangerous DOM sinks in supporting browsers.

## Mental Model

```text
TrustedHTML policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Trusted Types
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in security-sensitive deployments with library compatibility.

## Common Mistake / Interview Trap

Not a substitute for content validation.

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

> **Trusted Types:** Can harden dangerous DOM sinks in supporting browsers.
