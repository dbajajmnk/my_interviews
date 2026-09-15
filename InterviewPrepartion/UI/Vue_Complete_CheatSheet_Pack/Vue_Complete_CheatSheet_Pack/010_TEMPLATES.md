# Templates

## What / Why

Vue templates declaratively bind reactive state to DOM/component output.

## Mental Model

```text
state → template expressions/directives
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Templates
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for presentation logic.

## Common Mistake / Interview Trap

Keep heavy business logic outside templates.

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

> **Templates:** Vue templates declaratively bind reactive state to DOM/component output.
