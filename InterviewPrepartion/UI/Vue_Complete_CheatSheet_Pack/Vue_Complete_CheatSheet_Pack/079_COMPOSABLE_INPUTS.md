# Composable Inputs

## What / Why

Accept MaybeRefOrGetter inputs and normalize with toValue.

## Mental Model

```text
useFeature(id)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Inputs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use flexible reactive APIs.

## Common Mistake / Interview Trap

Normalize inside reactive tracking context when you want changes observed.

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

> **Composable Inputs:** Accept MaybeRefOrGetter inputs and normalize with toValue.
