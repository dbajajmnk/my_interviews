# Microfrontend Vue

## What / Why

Vue can participate in route-based MFEs, Module Federation, single-spa, or Web Components/custom elements.

## Mental Model

```text
Shell → Vue MFE
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Microfrontend Vue
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use business/team boundaries.

## Common Mistake / Interview Trap

Do not use MFE for ordinary component modularity.

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

> **Microfrontend Vue:** Vue can participate in route-based MFEs, Module Federation, single-spa, or Web Components/custom elements.
