# Composable Testing

## What / Why

Run composables in suitable effect/component scope.

## Mental Model

```text
test helper/mounted host
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when lifecycle/DI needed.

## Common Mistake / Interview Trap

Pure composables may be tested as ordinary functions.

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

> **Composable Testing:** Run composables in suitable effect/component scope.
