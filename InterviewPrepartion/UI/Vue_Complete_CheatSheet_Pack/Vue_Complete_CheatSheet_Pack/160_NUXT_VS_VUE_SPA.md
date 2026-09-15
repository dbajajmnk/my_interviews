# Nuxt vs Vue SPA

## What / Why

Nuxt adds conventions/server/rendering; plain Vue + Router gives lower-level SPA control.

## Mental Model

```text
framework vs library stack
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Nuxt vs Vue SPA
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose based on routing/data/SSR requirements.

## Common Mistake / Interview Trap

Do not use Nuxt just because Vue app is large.

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

> **Nuxt vs Vue SPA:** Nuxt adds conventions/server/rendering; plain Vue + Router gives lower-level SPA control.
