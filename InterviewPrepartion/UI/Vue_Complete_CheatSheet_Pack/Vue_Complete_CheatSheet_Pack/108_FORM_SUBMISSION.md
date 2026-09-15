# Form Submission

## What / Why

Prevent accidental duplicate work and show pending/errors.

## Mental Model

```text
submit → pending → result
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Form Submission
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use idempotency for high-risk operations.

## Common Mistake / Interview Trap

Disabled button alone is not backend protection.

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

> **Form Submission:** Prevent accidental duplicate work and show pending/errors.
