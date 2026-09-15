# Vue Security Rule

## What / Why

Never use non-trusted content as Vue templates.

## Mental Model

```text
server text ≠ template source
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Security Rule
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use templates authored by developers.

## Common Mistake / Interview Trap

Compiling user content as template is equivalent to code execution.

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

> **Vue Security Rule:** Never use non-trusted content as Vue templates.
