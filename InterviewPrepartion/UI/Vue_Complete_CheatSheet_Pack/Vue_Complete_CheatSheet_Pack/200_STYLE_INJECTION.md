# Style Injection

## What / Why

User-controlled style objects can enable UI redressing risks.

## Mental Model

```text
style bindings
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Style Injection
// Use the concrete API described above in real code.
</script>
```

## When to Use

Whitelist safe properties if user-controlled.

## Common Mistake / Interview Trap

Never let arbitrary user CSS take over page.

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

> **Style Injection:** User-controlled style objects can enable UI redressing risks.
