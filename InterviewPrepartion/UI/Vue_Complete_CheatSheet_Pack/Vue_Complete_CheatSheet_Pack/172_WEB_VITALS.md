# Web Vitals

## What / Why

Measure LCP, INP, CLS in real users.

## Mental Model

```text
field telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Web Vitals
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use per route/release.

## Common Mistake / Interview Trap

Framework speed claims do not replace app-specific measurement.

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

> **Web Vitals:** Measure LCP, INP, CLS in real users.
