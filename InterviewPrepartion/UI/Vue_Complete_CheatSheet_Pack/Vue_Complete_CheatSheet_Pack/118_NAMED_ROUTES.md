# Named Routes

## What / Why

Navigates by route name and params.

## Mental Model

```text
{name:'user',params:{id}}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Named Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to decouple callers from path strings.

## Common Mistake / Interview Trap

Route names become contracts.

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

> **Named Routes:** Navigates by route name and params.
