# v-html Security

## What / Why

Raw HTML rendering bypasses normal escaping.

## Mental Model

```text
v-html='trustedHtml'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-html Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only with trusted/sanitized HTML.

## Common Mistake / Interview Trap

Do not render arbitrary user HTML without robust sanitization.

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

> **v-html Security:** Raw HTML rendering bypasses normal escaping.
