# Form Validation

## What / Why

Model field/field-group validation explicitly.

## Mental Model

```text
state + errors + submit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Form Validation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use native constraints, schema libs, or custom validation.

## Common Mistake / Interview Trap

Client validation is not security.

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

> **Form Validation:** Model field/field-group validation explicitly.
