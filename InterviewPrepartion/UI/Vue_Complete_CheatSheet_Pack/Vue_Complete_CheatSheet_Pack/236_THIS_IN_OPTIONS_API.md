# this in Options API

## What / Why

Options API exposes instance properties on `this`.

## Mental Model

```text
this.count
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: this in Options API
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know for legacy/Options code.

## Common Mistake / Interview Trap

No `this` component instance in script setup Composition API.

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

> **this in Options API:** Options API exposes instance properties on `this`.
