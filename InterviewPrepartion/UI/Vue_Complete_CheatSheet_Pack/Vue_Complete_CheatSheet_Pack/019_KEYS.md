# Keys

## What / Why

Keys tell Vue the identity of VNodes/components.

## Mental Model

```text
key=id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Keys
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable domain identity.

## Common Mistake / Interview Trap

Changing key intentionally resets component state.

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

> **Keys:** Keys tell Vue the identity of VNodes/components.
