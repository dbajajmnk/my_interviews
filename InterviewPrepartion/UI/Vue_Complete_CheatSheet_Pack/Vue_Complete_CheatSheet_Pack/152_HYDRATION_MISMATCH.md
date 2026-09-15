# Hydration Mismatch

## What / Why

Server and client render different markup/data.

## Mental Model

```text
time/random/browser-only state
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Hydration Mismatch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Fix source or selectively allow known mismatch in Vue 3.5+.

## Common Mistake / Interview Trap

Suppressing mismatch is not a general fix.

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

> **Hydration Mismatch:** Server and client render different markup/data.
