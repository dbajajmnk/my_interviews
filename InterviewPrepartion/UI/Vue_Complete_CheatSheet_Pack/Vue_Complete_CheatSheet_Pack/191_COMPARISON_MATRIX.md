# Vue High-Value Comparison Matrix

## ref vs reactive

| ref | reactive |
|---|---|
| wraps any value | proxies object |
| `.value` in JS | direct property access |
| easy replacement | best for cohesive mutable object |
| template auto-unwrapped | nested proxy reactivity |

## computed vs watch

| computed | watch |
|---|---|
| derived value | side effect |
| cached | callback |
| pure | async/external allowed |
| return value | no derived-state duplication |

## watch vs watchEffect

| watch | watchEffect |
|---|---|
| explicit source | auto dependency tracking |
| old/new values | concise effect |
| lazy by default | runs immediately |
| more control | less explicit |

## v-if vs v-show

| v-if | v-show |
|---|---|
| mount/unmount | CSS display toggle |
| lower initial if false | always initially rendered |
| expensive frequent toggles | good frequent toggles |

## Composition vs Options

| Composition API | Options API |
|---|---|
| `<script setup>` | `data/methods/computed` |
| composables | option sections |
| strong TS reuse | approachable |
| modern complex apps | fully supported |

## Pinia vs local state

| Pinia | Local ref/reactive |
|---|---|
| shared state | component/feature state |
| devtools/plugins | simplest |
| SSR conventions | no global architecture needed |

## Vue vs Nuxt

| Vue | Nuxt |
|---|---|
| core framework | full-stack Vue framework |
| choose routing/data/SSR structure | conventions for routing/SSR/server/data |
| SPA/library flexibility | app/framework productivity |
