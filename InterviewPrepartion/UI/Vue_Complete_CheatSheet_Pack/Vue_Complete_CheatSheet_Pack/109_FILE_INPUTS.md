# File Inputs

## What / Why

Use File APIs/FormData; file value is not normally controlled like text input.

## Mental Model

```text
input type=file
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: File Inputs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use explicit upload workflow.

## Common Mistake / Interview Trap

Validate type/size server-side.

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

> **File Inputs:** Use File APIs/FormData; file value is not normally controlled like text input.
