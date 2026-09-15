# v-model lazy

## What / Why

Updates on change rather than input.

## Mental Model

```text
.lazy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model lazy
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when per-keystroke updates are unnecessary.

## Common Mistake / Interview Trap

Changes UX/validation timing.

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

> **v-model lazy:** Updates on change rather than input.
