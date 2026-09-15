# Vuex to Pinia

## What / Why

Pinia is the recommended modern store for Vue 3 apps.

## Mental Model

```text
Vuex modules → Pinia stores
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vuex to Pinia
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use incremental migration.

## Common Mistake / Interview Trap

Vuex knowledge still matters in legacy code.

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

> **Vuex to Pinia:** Pinia is the recommended modern store for Vue 3 apps.
