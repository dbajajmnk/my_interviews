# Vue High-Value Comparisons

## ref vs reactive

| ref | reactive |
|---|---|
| any value | object proxy |
| `.value` in JS | direct properties |
| easy replacement | object identity proxy |
| good default for isolated state | good for cohesive object state |

## computed vs watch

| computed | watch |
|---|---|
| derived value | side effect |
| cached | callback |
| pure | can be async/imperative |

## watch vs watchEffect

| watch | watchEffect |
|---|---|
| explicit source | auto tracks sync reads |
| old/new values | immediate by default |
| precise control | concise side effects |

## v-if vs v-show

| v-if | v-show |
|---|---|
| mount/unmount | CSS display toggle |
| cheaper when rarely shown | cheaper frequent toggle |
| lifecycle runs | stays mounted |

## Composable vs Pinia

| Composable | Pinia |
|---|---|
| logic reuse / local/shared possible | formal global/feature store |
| minimal structure | devtools/plugins/store identity |
| easy per-instance state | SSR/store conventions |

## Vue SPA vs Nuxt

| Vue + Router | Nuxt |
|---|---|
| custom SPA stack | full-stack framework |
| manual data/SSR setup | conventions + SSR/SSG/server APIs |
| lower abstraction | faster app-level architecture |

## Pinia vs Vuex

| Pinia | Vuex |
|---|---|
| modern recommended store | legacy-established |
| simpler TS/devtools API | modules/mutations older model |
| setup/options stores | Vuex store/modules |
