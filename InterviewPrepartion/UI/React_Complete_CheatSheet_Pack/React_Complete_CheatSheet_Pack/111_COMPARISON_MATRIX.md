# React High-Value Comparisons

## State vs Ref

| State | Ref |
|---|---|
| triggers render | does not trigger render |
| UI data | imperative/mutable instance data |
| snapshot per render | mutable `.current` |

## useEffect vs useLayoutEffect

| useEffect | useLayoutEffect |
|---|---|
| after paint opportunity | before paint |
| normal external sync | measurement/layout |
| preferred default | can block paint |

## useMemo vs useCallback

| useMemo | useCallback |
|---|---|
| caches value | caches function |
| `useMemo(()=>value,deps)` | `useCallback(fn,deps)` |

## useTransition vs useDeferredValue

| useTransition | useDeferredValue |
|---|---|
| controls an update | defers consumption of value |
| gives pending state | gives deferred value |

## Controlled vs Uncontrolled

| Controlled | Uncontrolled |
|---|---|
| React state source | DOM source |
| value/onChange | defaultValue/ref/FormData |
| coordination | simpler isolated fields |

## Client State vs Server State

| Client State | Server State |
|---|---|
| UI interaction | remote authoritative data |
| useState/store | query cache/framework/RSC |
| local lifecycle | fetching/revalidation/cache |

## CSR vs SSR vs RSC

| CSR | SSR | RSC |
|---|---|---|
| render in browser | HTML rendered server-side | component execution server-side |
| JS-heavy startup | hydrate HTML | reduce client JS for server components |
| simple SPA model | SEO/first paint | framework architecture |
