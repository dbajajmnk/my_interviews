# Data Loaders Experimental

## What / Why

Vue Router's Data Loaders API provides navigation-aware parallel/deduped fetching but is under experimental namespace.

## Mental Model

```text
DataLoaderPlugin / defineBasicLoader
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Loaders Experimental
// Use the concrete API described above in real code.
</script>
```

## When to Use

Explore carefully or via supporting libraries/frameworks.

## Common Mistake / Interview Trap

Do not present current experimental API as long-term stable core contract.

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

> **Data Loaders Experimental:** Vue Router's Data Loaders API provides navigation-aware parallel/deduped fetching but is under experimental namespace.
