# Vue Reactivity Decision Guide

## ref

```ts
const count = ref(0)
```

Use for:
- primitives
- replaceable values
- template/component state

## reactive

```ts
const form = reactive({ name: '', age: 0 })
```

Use for:
- cohesive objects
- mutation-oriented object state

## computed

```ts
const fullName = computed(() => first.value + ' ' + last.value)
```

Use for:
- pure derived state

## watch

```ts
watch(userId, loadUser)
```

Use for:
- side effects tied to explicit source

## watchEffect

```ts
watchEffect(() => console.log(count.value))
```

Use for:
- concise effects with automatic dependency tracking

## Pinia

Use when:
- state is shared broadly,
- team conventions/devtools/SSR/plugins matter.

## Golden Rule

> If the output is another value, prefer `computed`. If the code affects an external system, use `watch`/`watchEffect`.
