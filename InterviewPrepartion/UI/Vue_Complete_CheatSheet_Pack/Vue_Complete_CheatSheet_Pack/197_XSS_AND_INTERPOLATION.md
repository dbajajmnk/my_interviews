# XSS and Interpolation

## What / Why

Text interpolation/attribute bindings are escaped/safely handled in normal cases.

## Mental Model

```text
{{ userText }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: XSS and Interpolation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use normal bindings for untrusted text.

## Common Mistake / Interview Trap

Unsafe DOM APIs/v-html remain dangerous.

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

> **XSS and Interpolation:** Text interpolation/attribute bindings are escaped/safely handled in normal cases.
