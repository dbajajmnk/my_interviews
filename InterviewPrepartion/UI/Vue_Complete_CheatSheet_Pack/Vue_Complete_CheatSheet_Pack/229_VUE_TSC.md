# vue-tsc

## What / Why

Type-checks Vue SFCs/templates with TypeScript.

## Mental Model

```text
vue-tsc --noEmit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: vue-tsc
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in CI for TS projects.

## Common Mistake / Interview Trap

Bundler transpilation can succeed with type errors unless checked.

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

> **vue-tsc:** Type-checks Vue SFCs/templates with TypeScript.
