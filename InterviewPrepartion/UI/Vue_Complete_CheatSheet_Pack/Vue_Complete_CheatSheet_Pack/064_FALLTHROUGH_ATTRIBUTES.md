# Fallthrough Attributes

## What / Why

Undeclared attrs/listeners fall through to component root.

## Mental Model

```text
class/id/@click → root
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Fallthrough Attributes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use wrapper component conventions carefully.

## Common Mistake / Interview Trap

Multi-root components require explicit forwarding.

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

> **Fallthrough Attributes:** Undeclared attrs/listeners fall through to component root.
