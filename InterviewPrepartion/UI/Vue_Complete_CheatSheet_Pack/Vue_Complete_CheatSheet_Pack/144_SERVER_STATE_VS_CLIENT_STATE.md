# Server State vs Client State

## What / Why

Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.

## Mental Model

```text
server cache vs refs/Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Server State vs Client State
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use query/framework tools where appropriate.

## Common Mistake / Interview Trap

Do not blindly mirror all API data into Pinia.

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

> **Server State vs Client State:** Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.
