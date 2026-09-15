# v-html

## What / Why

Sets raw innerHTML.

## Mental Model

```text
v-html='html'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-html
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only with trusted/sanitized HTML.

## Common Mistake / Interview Trap

Major XSS risk.

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

> **v-html:** Sets raw innerHTML.
