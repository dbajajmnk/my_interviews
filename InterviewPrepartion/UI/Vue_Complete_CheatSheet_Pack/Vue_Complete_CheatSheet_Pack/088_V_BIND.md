# v-bind

## What / Why

Binds attributes/props.

## Mental Model

```text
v-bind='attrs'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-bind
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use object binding for forwarding.

## Common Mistake / Interview Trap

Be careful forwarding unsafe/unwanted attributes.

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

> **v-bind:** Binds attributes/props.
