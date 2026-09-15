# Typing Template Refs

## What / Why

Vue 3.5 + language-tools can infer static useTemplateRef types.

## Mental Model

```text
useTemplateRef<HTMLInputElement>('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Template Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use explicit generic when inference is impossible.

## Common Mistake / Interview Trap

Ref is nullable before mount.

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

> **Typing Template Refs:** Vue 3.5 + language-tools can infer static useTemplateRef types.
