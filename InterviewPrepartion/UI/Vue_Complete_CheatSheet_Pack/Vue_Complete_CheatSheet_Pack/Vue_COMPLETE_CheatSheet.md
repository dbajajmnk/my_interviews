# Vue — Complete Cheat Sheet (Combined Edition)

> Fast revision companion for Vue 3.5, modern frontend architecture, interviews, and production engineering.


---

<!-- 005_VUE_MENTAL_MODEL.md -->

# Vue Mental Model

## What / Why

Vue maps reactive state to declarative templates through a compiler-optimized rendering system.

## Mental Model

```text
Reactive State → Render Effect → Virtual DOM / Compiler Optimizations → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Mental Model
</script>

<template>
  <div>Vue Mental Model</div>
</template>
```

## When to Use

Use this as the top-level model for Vue rendering and interviews.

## Common Mistake / Interview Trap

Vue is more than a templating library; reactivity and the compiler are central.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue Mental Model:** Vue maps reactive state to declarative templates through a compiler-optimized rendering system.


---

<!-- 006_SINGLE_FILE_COMPONENTS.md -->

# Single-File Components

## What / Why

A `.vue` Single-File Component groups template, script, and style.

## Mental Model

```text
<template> + <script setup> + <style>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Single-File Components
</script>

<template>
  <div>Single-File Components</div>
</template>
```

## When to Use

Use SFCs as the normal production component format.

## Common Mistake / Interview Trap

SFCs require a build setup and are not plain browser-native files.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Single-File Components:** A `.vue` Single-File Component groups template, script, and style.


---

<!-- 006_VUE_MENTAL_MODEL.md -->

# Vue Mental Model

## What / Why

Vue builds reactive component UIs by tracking dependencies and efficiently updating the DOM.

## Mental Model

```text
Reactive State → Render Effect → Virtual DOM/Compiler Optimizations → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use this as the mental model for state-driven UI.

## Common Mistake / Interview Trap

Vue reactivity does not mean every state change rerenders the entire application.

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

> **Vue Mental Model:** Vue builds reactive component UIs by tracking dependencies and efficiently updating the DOM.


---

<!-- 007_CREATEAPP.md -->

# createApp

## What / Why

Creates a Vue application instance and mounts the root component.

## Mental Model

```text
createApp(App).mount('#app')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: createApp
</script>

<template>
  <div>createApp</div>
</template>
```

## When to Use

Use for SPA/client application bootstrap.

## Common Mistake / Interview Trap

Create one app instance per independently mounted Vue app.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **createApp:** Creates a Vue application instance and mounts the root component.


---

<!-- 007_SINGLE_FILE_COMPONENTS.md -->

# Single File Components

## What / Why

SFCs combine template, script, and style in `.vue` files.

## Mental Model

```text
<template> + <script setup> + <style>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Single File Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use SFCs as the normal component format in build-tool apps.

## Common Mistake / Interview Trap

SFCs require a build step or framework tooling.

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

> **Single File Components:** SFCs combine template, script, and style in `.vue` files.


---

<!-- 008_COMPOSITION_API.md -->

# Composition API

## What / Why

Composition API organizes reusable logic by capability rather than Options sections.

## Mental Model

```text
ref/reactive/computed/watch/onMounted
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composition API
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use as the primary modern Vue 3 style.

## Common Mistake / Interview Trap

Composition API does not remove Options API; both remain supported.

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

> **Composition API:** Composition API organizes reusable logic by capability rather than Options sections.


---

<!-- 008_TEMPLATES.md -->

# Templates

## What / Why

Templates declaratively describe UI and bindings.

## Mental Model

```text
state → template → DOM
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Templates
</script>

<template>
  <div>Templates</div>
</template>
```

## When to Use

Use templates for most Vue applications.

## Common Mistake / Interview Trap

Avoid complex side effects or heavy computation in templates.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Templates:** Templates declaratively describe UI and bindings.


---

<!-- 009_INTERPOLATION.md -->

# Interpolation

## What / Why

Renders text from expressions.

## Mental Model

```text
{{ message }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Interpolation
</script>

<template>
  <div>Interpolation</div>
</template>
```

## When to Use

Use for text content.

## Common Mistake / Interview Trap

Interpolated text is escaped by default.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Interpolation:** Renders text from expressions.


---

<!-- 009_SCRIPT_SETUP.md -->

# script setup

## What / Why

`<script setup>` is compile-time syntax sugar for Composition API in SFCs.

## Mental Model

```text
top-level bindings → template exposure
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: script setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for concise modern components.

## Common Mistake / Interview Trap

Compiler macros such as defineProps do not need imports.

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

> **script setup:** `<script setup>` is compile-time syntax sugar for Composition API in SFCs.


---

<!-- 00_MASTER_INDEX.md -->

# Vue — Complete Cheat Sheet Pack

**Current stable baseline:** Vue 3.5.42 (September 2026).

**Pre-release:** Vue 3.6 is in release-candidate/pre-release and is intentionally not treated as stable production baseline.

**Purpose:** Fast revision for Vue development, architecture, state management, routing, SSR, testing, performance, security, and interviews.

## Fast Revision

- `01_30_SECOND_RECALL.md`
- `02_CURRENT_VUE_3_5.md`
- `03_COMPOSITION_VS_OPTIONS.md`
- `04_REACTIVITY_DECISION.md`

## Foundations

- Vue Mental Model — `005_VUE_MENTAL_MODEL.md`
- Single-File Components — `006_SINGLE_FILE_COMPONENTS.md`
- createApp — `007_CREATEAPP.md`
- Templates — `008_TEMPLATES.md`
- Interpolation — `009_INTERPOLATION.md`
- v-bind — `010_V_BIND.md`
- v-on — `011_V_ON.md`
- v-model — `012_V_MODEL.md`
- v-if — `013_V_IF.md`
- v-show — `014_V_SHOW.md`
- v-for — `015_V_FOR.md`
- Keys — `016_KEYS.md`
- Class and Style Binding — `017_CLASS_AND_STYLE_BINDING.md`
- Computed Rendering — `018_COMPUTED_RENDERING.md`
- Component Registration — `019_COMPONENT_REGISTRATION.md`

## Composition API

- script setup — `020_SCRIPT_SETUP.md`
- ref — `021_REF.md`
- reactive — `022_REACTIVE.md`
- shallowRef — `023_SHALLOWREF.md`
- shallowReactive — `024_SHALLOWREACTIVE.md`
- readonly — `025_READONLY.md`
- computed — `026_COMPUTED.md`
- computed setter — `027_COMPUTED_SETTER.md`
- watch — `028_WATCH.md`
- watchEffect — `029_WATCHEFFECT.md`
- watchPostEffect — `030_WATCHPOSTEFFECT.md`
- watchSyncEffect — `031_WATCHSYNCEFFECT.md`
- onWatcherCleanup — `032_ONWATCHERCLEANUP.md`
- toRef — `033_TOREF.md`
- toRefs — `034_TOREFS.md`
- toValue — `035_TOVALUE.md`
- unref — `036_UNREF.md`
- isRef — `037_ISREF.md`
- customRef — `038_CUSTOMREF.md`
- triggerRef — `039_TRIGGERREF.md`
- markRaw — `040_MARKRAW.md`
- effectScope — `041_EFFECTSCOPE.md`
- getCurrentScope — `042_GETCURRENTSCOPE.md`
- onScopeDispose — `043_ONSCOPEDISPOSE.md`
- nextTick — `044_NEXTTICK.md`

## Props, Emits & Component Contracts

- defineProps — `045_DEFINEPROPS.md`
- Reactive Props Destructure — `046_REACTIVE_PROPS_DESTRUCTURE.md`
- withDefaults — `047_WITHDEFAULTS.md`
- defineEmits — `048_DEFINEEMITS.md`
- defineModel — `049_DEFINEMODEL.md`
- Multiple v-model — `050_MULTIPLE_V_MODEL.md`
- Model Modifiers — `051_MODEL_MODIFIERS.md`
- Fallthrough Attributes — `052_FALLTHROUGH_ATTRIBUTES.md`
- inheritAttrs — `053_INHERITATTRS.md`
- Slots — `054_SLOTS.md`
- Named Slots — `055_NAMED_SLOTS.md`
- Scoped Slots — `056_SCOPED_SLOTS.md`
- defineSlots — `057_DEFINESLOTS.md`
- provide — `058_PROVIDE.md`
- inject — `059_INJECT.md`
- InjectionKey — `060_INJECTIONKEY.md`
- defineExpose — `061_DEFINEEXPOSE.md`
- defineOptions — `062_DEFINEOPTIONS.md`
- defineAsyncComponent — `063_DEFINEASYNCCOMPONENT.md`

## Lifecycle & DOM

- onBeforeMount — `064_ONBEFOREMOUNT.md`
- onMounted — `065_ONMOUNTED.md`
- onBeforeUpdate — `066_ONBEFOREUPDATE.md`
- onUpdated — `067_ONUPDATED.md`
- onBeforeUnmount — `068_ONBEFOREUNMOUNT.md`
- onUnmounted — `069_ONUNMOUNTED.md`
- onActivated — `070_ONACTIVATED.md`
- onDeactivated — `071_ONDEACTIVATED.md`
- onErrorCaptured — `072_ONERRORCAPTURED.md`
- Template Refs — `073_TEMPLATE_REFS.md`
- useTemplateRef — `074_USETEMPLATEREF.md`
- Component Refs — `075_COMPONENT_REFS.md`
- Teleport — `076_TELEPORT.md`
- KeepAlive — `077_KEEPALIVE.md`
- Suspense — `078_SUSPENSE.md`
- Transition — `079_TRANSITION.md`
- TransitionGroup — `080_TRANSITIONGROUP.md`
- Dynamic Components — `081_DYNAMIC_COMPONENTS.md`

## Composables

- Composable Mental Model — `082_COMPOSABLE_MENTAL_MODEL.md`
- Naming Convention — `083_NAMING_CONVENTION.md`
- Input Normalization — `084_INPUT_NORMALIZATION.md`
- Return Refs — `085_RETURN_REFS.md`
- Cleanup — `086_CLEANUP.md`
- Shared Composable State — `087_SHARED_COMPOSABLE_STATE.md`
- Composable Error Handling — `088_COMPOSABLE_ERROR_HANDLING.md`
- Composable vs Store — `089_COMPOSABLE_VS_STORE.md`
- Composable vs Service — `090_COMPOSABLE_VS_SERVICE.md`

## Router

- Vue Router — `091_VUE_ROUTER.md`
- createRouter — `092_CREATEROUTER.md`
- History Modes — `093_HISTORY_MODES.md`
- Routes — `094_ROUTES.md`
- RouterLink — `095_ROUTERLINK.md`
- RouterView — `096_ROUTERVIEW.md`
- Dynamic Params — `097_DYNAMIC_PARAMS.md`
- Query Params — `098_QUERY_PARAMS.md`
- Named Routes — `099_NAMED_ROUTES.md`
- Nested Routes — `100_NESTED_ROUTES.md`
- Lazy Routes — `101_LAZY_ROUTES.md`
- Navigation Guards — `102_NAVIGATION_GUARDS.md`
- Route Meta — `103_ROUTE_META.md`
- Scroll Behavior — `104_SCROLL_BEHAVIOR.md`
- Router Error Handling — `105_ROUTER_ERROR_HANDLING.md`
- Typed Routes Awareness — `106_TYPED_ROUTES_AWARENESS.md`

## State Management

- State Ownership — `107_STATE_OWNERSHIP.md`
- Local Component State — `108_LOCAL_COMPONENT_STATE.md`
- Lifted State — `109_LIFTED_STATE.md`
- Simple Shared Reactive Store — `110_SIMPLE_SHARED_REACTIVE_STORE.md`
- Pinia — `111_PINIA.md`
- Pinia Option Store — `112_PINIA_OPTION_STORE.md`
- Pinia Setup Store — `113_PINIA_SETUP_STORE.md`
- storeToRefs — `114_STORETOREFS.md`
- Pinia Actions — `115_PINIA_ACTIONS.md`
- Pinia Getters — `116_PINIA_GETTERS.md`
- Pinia Plugins — `117_PINIA_PLUGINS.md`
- Pinia SSR — `118_PINIA_SSR.md`
- Vuex Legacy — `119_VUEX_LEGACY.md`

## HTTP & Async Data

- Fetch API Pattern — `120_FETCH_API_PATTERN.md`
- Async Composable — `121_ASYNC_COMPOSABLE.md`
- AbortController — `122_ABORTCONTROLLER.md`
- Watcher Fetching — `123_WATCHER_FETCHING.md`
- Parallel Requests — `124_PARALLEL_REQUESTS.md`
- Server State vs Client State — `125_SERVER_STATE_VS_CLIENT_STATE.md`
- Loading Error Empty States — `126_LOADING_ERROR_EMPTY_STATES.md`
- Optimistic Updates — `127_OPTIMISTIC_UPDATES.md`
- Retry Strategy — `128_RETRY_STRATEGY.md`

## SSR & Nuxt Awareness

- Vue SSR — `129_VUE_SSR.md`
- Hydration — `130_HYDRATION.md`
- SSR State Isolation — `131_SSR_STATE_ISOLATION.md`
- Browser-Only APIs — `132_BROWSER_ONLY_APIS.md`
- SSR Data Fetching — `133_SSR_DATA_FETCHING.md`
- Hydration Mismatch — `134_HYDRATION_MISMATCH.md`
- Nuxt Awareness — `135_NUXT_AWARENESS.md`
- Universal Code — `136_UNIVERSAL_CODE.md`
- Streaming SSR — `137_STREAMING_SSR.md`

## Built-ins & Advanced Components

- Teleport Pattern — `138_TELEPORT_PATTERN.md`
- KeepAlive Include Exclude — `139_KEEPALIVE_INCLUDE_EXCLUDE.md`
- Suspense Async Setup — `140_SUSPENSE_ASYNC_SETUP.md`
- Transition CSS Classes — `141_TRANSITION_CSS_CLASSES.md`
- Transition JavaScript Hooks — `142_TRANSITION_JAVASCRIPT_HOOKS.md`
- TransitionGroup Moves — `143_TRANSITIONGROUP_MOVES.md`
- Async Component Loading States — `144_ASYNC_COMPONENT_LOADING_STATES.md`
- Recursive Components — `145_RECURSIVE_COMPONENTS.md`
- Dynamic Slots — `146_DYNAMIC_SLOTS.md`

## Performance

- Performance Mental Model — `147_PERFORMANCE_MENTAL_MODEL.md`
- Compiler Optimizations — `148_COMPILER_OPTIMIZATIONS.md`
- v-once — `149_V_ONCE.md`
- v-memo — `150_V_MEMO.md`
- shallowRef Performance — `151_SHALLOWREF_PERFORMANCE.md`
- List Virtualization — `152_LIST_VIRTUALIZATION.md`
- Code Splitting — `153_CODE_SPLITTING.md`
- Bundle Analysis — `154_BUNDLE_ANALYSIS.md`
- Stable Props — `155_STABLE_PROPS.md`
- Computed Caching — `156_COMPUTED_CACHING.md`
- Web Vitals — `157_WEB_VITALS.md`
- Lazy Hydration Awareness — `158_LAZY_HYDRATION_AWARENESS.md`

## TypeScript

- Typing Props — `159_TYPING_PROPS.md`
- Typing Emits — `160_TYPING_EMITS.md`
- Typing Template Refs — `161_TYPING_TEMPLATE_REFS.md`
- Typing provide inject — `162_TYPING_PROVIDE_INJECT.md`
- Generic Components — `163_GENERIC_COMPONENTS.md`
- Discriminated Union Props — `164_DISCRIMINATED_UNION_PROPS.md`
- Component Public Instance — `165_COMPONENT_PUBLIC_INSTANCE.md`
- vue-tsc — `166_VUE_TSC.md`

## Testing

- Testing Strategy — `167_TESTING_STRATEGY.md`
- Vitest — `168_VITEST.md`
- Vue Test Utils — `169_VUE_TEST_UTILS.md`
- Testing Library Awareness — `170_TESTING_LIBRARY_AWARENESS.md`
- Component Testing — `171_COMPONENT_TESTING.md`
- Composable Testing — `172_COMPOSABLE_TESTING.md`
- Pinia Testing — `173_PINIA_TESTING.md`
- Router Testing — `174_ROUTER_TESTING.md`
- Async Testing — `175_ASYNC_TESTING.md`
- E2E — `176_E2E.md`
- Accessibility Testing — `177_ACCESSIBILITY_TESTING.md`

## Security & Accessibility

- XSS Model — `178_XSS_MODEL.md`
- v-html — `179_V_HTML.md`
- URL Injection — `180_URL_INJECTION.md`
- Style Injection — `181_STYLE_INJECTION.md`
- CSP — `182_CSP.md`
- Authentication — `183_AUTHENTICATION.md`
- Authorization — `184_AUTHORIZATION.md`
- Secrets — `185_SECRETS.md`
- Semantic HTML — `186_SEMANTIC_HTML.md`
- Focus Management — `187_FOCUS_MANAGEMENT.md`
- ARIA — `188_ARIA.md`
- Accessibility Testing — `189_ACCESSIBILITY_TESTING.md`

## Architecture & Ecosystem

- Feature-First Folders — `190_FEATURE_FIRST_FOLDERS.md`
- Component Layering — `191_COMPONENT_LAYERING.md`
- Headless Component Pattern — `192_HEADLESS_COMPONENT_PATTERN.md`
- Renderless Component — `193_RENDERLESS_COMPONENT.md`
- Composable Architecture — `194_COMPOSABLE_ARCHITECTURE.md`
- API Adapter — `195_API_ADAPTER.md`
- Plugin System — `196_PLUGIN_SYSTEM.md`
- Global Properties — `197_GLOBAL_PROPERTIES.md`
- Error Handler — `198_ERROR_HANDLER.md`
- Design System — `199_DESIGN_SYSTEM.md`
- Microfrontend Integration — `200_MICROFRONTEND_INTEGRATION.md`
- create-vue — `201_CREATE_VUE.md`
- Vite — `202_VITE.md`
- Pinia Ecosystem — `203_PINIA_ECOSYSTEM.md`
- Vue Router Ecosystem — `204_VUE_ROUTER_ECOSYSTEM.md`
- Nuxt Ecosystem — `205_NUXT_ECOSYSTEM.md`
- i18n Awareness — `206_I18N_AWARENESS.md`
- Error Boundaries Pattern — `207_ERROR_BOUNDARIES_PATTERN.md`

## Tooling & Setup

- Project Creation — `208_PROJECT_CREATION.md`
- Vite Dev Server — `209_VITE_DEV_SERVER.md`
- Build — `210_BUILD.md`
- Preview — `211_PREVIEW.md`
- Type Check — `212_TYPE_CHECK.md`
- Lint — `213_LINT.md`
- DevTools — `214_DEVTOOLS.md`
- Version Check — `215_VERSION_CHECK.md`
- Upgrade Strategy — `216_UPGRADE_STRATEGY.md`

## Interview & Troubleshooting

- Vue vs React — `217_VUE_VS_REACT.md`
- Vue vs Angular — `218_VUE_VS_ANGULAR.md`
- Composition vs Options API — `219_COMPOSITION_VS_OPTIONS_API.md`
- ref vs reactive — `220_REF_VS_REACTIVE.md`
- computed vs watch — `221_COMPUTED_VS_WATCH.md`
- watch vs watchEffect — `222_WATCH_VS_WATCHEFFECT.md`
- v-if vs v-show — `223_V_IF_VS_V_SHOW.md`
- Prop Mutation — `224_PROP_MUTATION.md`
- Lost Reactivity — `225_LOST_REACTIVITY.md`
- Infinite Watch Loop — `226_INFINITE_WATCH_LOOP.md`
- Stale Async Response — `227_STALE_ASYNC_RESPONSE.md`
- Duplicate HTTP — `228_DUPLICATE_HTTP.md`
- KeepAlive Surprise — `229_KEEPALIVE_SURPRISE.md`
- Teleport Surprise — `230_TELEPORT_SURPRISE.md`
- Hydration Mismatch — `231_HYDRATION_MISMATCH.md`
- Pinia Destructure Bug — `232_PINIA_DESTRUCTURE_BUG.md`
- Vue 2 vs Vue 3 — `233_VUE_2_VS_VUE_3.md`
- Vue 3.5 vs 3.6 — `234_VUE_3_5_VS_3_6.md`
- Interview Traps — `235_INTERVIEW_TRAPS.md`


---

<!-- 010_TEMPLATES.md -->

# Templates

## What / Why

Vue templates declaratively bind reactive state to DOM/component output.

## Mental Model

```text
state → template expressions/directives
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Templates
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for presentation logic.

## Common Mistake / Interview Trap

Keep heavy business logic outside templates.

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

> **Templates:** Vue templates declaratively bind reactive state to DOM/component output.


---

<!-- 010_V_BIND.md -->

# v-bind

## What / Why

Binds attributes/properties/component props.

## Mental Model

```text
<img :src='url'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-bind
</script>

<template>
  <div>v-bind</div>
</template>
```

## When to Use

Use `:` shorthand in templates.

## Common Mistake / Interview Trap

Binding does not mean two-way synchronization.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-bind:** Binds attributes/properties/component props.


---

<!-- 011_INTERPOLATION.md -->

# Interpolation

## What / Why

Displays text from expressions.

## Mental Model

```text
{{ user.name }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Interpolation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for escaped text content.

## Common Mistake / Interview Trap

Do not expect interpolation inside raw HTML attributes; use bindings.

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

> **Interpolation:** Displays text from expressions.


---

<!-- 011_V_ON.md -->

# v-on

## What / Why

Registers event listeners.

## Mental Model

```text
<button @click='save'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-on
</script>

<template>
  <div>v-on</div>
</template>
```

## When to Use

Use `@` shorthand.

## Common Mistake / Interview Trap

Do not invoke expensive logic directly from every hot event without control.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-on:** Registers event listeners.


---

<!-- 012_ATTRIBUTE_BINDING.md -->

# Attribute Binding

## What / Why

`v-bind` / `:` binds element/component props and attributes.

## Mental Model

```text
:disabled='saving'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Attribute Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for dynamic attributes/props.

## Common Mistake / Interview Trap

Know prop-vs-attribute behavior for custom elements/components.

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

> **Attribute Binding:** `v-bind` / `:` binds element/component props and attributes.


---

<!-- 012_V_MODEL.md -->

# v-model

## What / Why

Creates two-way binding conventions for form/component values.

## Mental Model

```text
<input v-model='name'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-model
</script>

<template>
  <div>v-model</div>
</template>
```

## When to Use

Use for form/control value contracts.

## Common Mistake / Interview Trap

Understand modelValue/update:modelValue and defineModel in reusable components.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-model:** Creates two-way binding conventions for form/component values.


---

<!-- 013_EVENT_BINDING.md -->

# Event Binding

## What / Why

`v-on` / `@` binds events.

## Mental Model

```text
@click='save'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Event Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for user interactions.

## Common Mistake / Interview Trap

Pass function reference or inline expression deliberately.

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

> **Event Binding:** `v-on` / `@` binds events.


---

<!-- 013_V_IF.md -->

# v-if

## What / Why

Conditionally mounts/unmounts content.

## Mental Model

```text
<div v-if='visible'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-if
</script>

<template>
  <div>v-if</div>
</template>
```

## When to Use

Use when branch presence really changes.

## Common Mistake / Interview Trap

Frequent toggling may favor v-show.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-if:** Conditionally mounts/unmounts content.


---

<!-- 014_CLASS_BINDING.md -->

# Class Binding

## What / Why

Binds classes from strings/objects/arrays.

## Mental Model

```text
:class='{active:isActive}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Class Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for conditional styling.

## Common Mistake / Interview Trap

Avoid unreadable large class-expression objects in templates.

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

> **Class Binding:** Binds classes from strings/objects/arrays.


---

<!-- 014_V_SHOW.md -->

# v-show

## What / Why

Toggles CSS display without unmounting.

## Mental Model

```text
<div v-show='visible'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-show
</script>

<template>
  <div>v-show</div>
</template>
```

## When to Use

Use for frequently toggled expensive subtrees.

## Common Mistake / Interview Trap

Element still exists and initial render cost remains.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-show:** Toggles CSS display without unmounting.


---

<!-- 015_STYLE_BINDING.md -->

# Style Binding

## What / Why

Binds inline style objects/arrays.

## Mental Model

```text
:style='{color:color}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Style Binding
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for truly dynamic inline values.

## Common Mistake / Interview Trap

Prefer CSS classes for normal design styling.

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

> **Style Binding:** Binds inline style objects/arrays.


---

<!-- 015_V_FOR.md -->

# v-for

## What / Why

Renders lists.

## Mental Model

```text
<li v-for='item in items' :key='item.id'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-for
</script>

<template>
  <div>v-for</div>
</template>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Avoid array index keys for reordered/stateful items.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-for:** Renders lists.


---

<!-- 016_CONDITIONAL_RENDERING.md -->

# Conditional Rendering

## What / Why

`v-if/v-else-if/v-else` conditionally creates/destroys nodes.

## Mental Model

```text
condition → branch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Conditional Rendering
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when branch creation cost is acceptable.

## Common Mistake / Interview Trap

v-if and v-show solve different performance/behavior problems.

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

> **Conditional Rendering:** `v-if/v-else-if/v-else` conditionally creates/destroys nodes.


---

<!-- 016_KEYS.md -->

# Keys

## What / Why

Provide identity for sibling nodes/components.

## Mental Model

```text
:key='item.id'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Keys
</script>

<template>
  <div>Keys</div>
</template>
```

## When to Use

Use stable domain identity.

## Common Mistake / Interview Trap

Wrong keys cause state reuse/reset bugs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Keys:** Provide identity for sibling nodes/components.


---

<!-- 017_CLASS_AND_STYLE_BINDING.md -->

# Class and Style Binding

## What / Why

Binds class/style declaratively.

## Mental Model

```text
 :class='{active:isActive}' 
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Class and Style Binding
</script>

<template>
  <div>Class and Style Binding</div>
</template>
```

## When to Use

Use object/array syntax for conditional styling.

## Common Mistake / Interview Trap

Keep design logic readable.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Class and Style Binding:** Binds class/style declaratively.


---

<!-- 017_V_SHOW.md -->

# v-show

## What / Why

Toggles display while keeping element mounted.

## Mental Model

```text
display:none
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-show
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for frequently toggled content.

## Common Mistake / Interview Trap

Initial render cost remains.

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

> **v-show:** Toggles display while keeping element mounted.


---

<!-- 018_COMPUTED_RENDERING.md -->

# Computed Rendering

## What / Why

Use computed values rather than repeated heavy template calculations.

## Mental Model

```text
const filtered = computed(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Computed Rendering
</script>

<template>
  <div>Computed Rendering</div>
</template>
```

## When to Use

Use derived reactive state.

## Common Mistake / Interview Trap

Avoid calling expensive methods repeatedly in templates.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Computed Rendering:** Use computed values rather than repeated heavy template calculations.


---

<!-- 018_LIST_RENDERING.md -->

# List Rendering

## What / Why

`v-for` renders repeated content.

## Mental Model

```text
items → keyed children
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: List Rendering
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Do not use array indexes as keys for reordered stateful lists unless identity truly is position.

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

> **List Rendering:** `v-for` renders repeated content.


---

<!-- 019_COMPONENT_REGISTRATION.md -->

# Component Registration

## What / Why

Components can be imported locally; script setup exposes imports automatically.

## Mental Model

```text
import UserCard from './UserCard.vue'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Registration
</script>

<template>
  <div>Component Registration</div>
</template>
```

## When to Use

Use local explicit dependencies.

## Common Mistake / Interview Trap

Global registration should be limited to truly global primitives.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Component Registration:** Components can be imported locally; script setup exposes imports automatically.


---

<!-- 019_KEYS.md -->

# Keys

## What / Why

Keys tell Vue the identity of VNodes/components.

## Mental Model

```text
key=id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Keys
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable domain identity.

## Common Mistake / Interview Trap

Changing key intentionally resets component state.

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

> **Keys:** Keys tell Vue the identity of VNodes/components.


---

<!-- 01_30_SECOND_RECALL.md -->

# Vue — 30-Second Recall

## Formula

```text
Reactive State
   ↓
Template / Render
   ↓
Compiler + Reactivity Tracking
   ↓
DOM Patch
```

## Modern Vue Stack

```text
Vue 3
Single-File Components
<script setup>
Composition API
ref / reactive / computed
watch / watchEffect
Vue Router
Pinia
Vite / create-vue
Vitest
SSR / Nuxt when needed
```

## State Rule

```text
Local UI → ref/reactive
Derived → computed
Side effect → watch/watchEffect
Shared app state → Pinia
Navigation state → Router/URL
Server state → fetch/query/framework cache
```

## Ten-Second Interview Answer

> Vue is a progressive JavaScript framework with a compiler-optimized rendering system, fine-grained reactivity, component-based templates, Composition API, and an official ecosystem around Router, Pinia, Vite, testing, and SSR frameworks such as Nuxt.


---

<!-- 020_SCRIPT_SETUP.md -->

# script setup

## What / Why

Compile-time SFC syntax that exposes top-level bindings to template automatically.

## Mental Model

```text
<script setup> ... </script>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: script setup
</script>

<template>
  <div>script setup</div>
</template>
```

## When to Use

Use as the modern default for Vue 3 SFCs.

## Common Mistake / Interview Trap

It has compile-time macros; not every identifier is a runtime API.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **script setup:** Compile-time SFC syntax that exposes top-level bindings to template automatically.


---

<!-- 020_TEMPLATE_REFS.md -->

# Template Refs

## What / Why

Refs access DOM/components after mount.

## Mental Model

```text
useTemplateRef('input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Template Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for focus, measurement, third-party integrations.

## Common Mistake / Interview Trap

Do not use template refs as ordinary reactive application state.

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

> **Template Refs:** Refs access DOM/components after mount.


---

<!-- 021_REF.md -->

# ref

## What / Why

Creates a reactive wrapper around a value.

## Mental Model

```text
const count = ref(0)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: ref
</script>

<template>
  <div>ref</div>
</template>
```

## When to Use

Use for primitives and replacement-friendly values.

## Common Mistake / Interview Trap

In JS access with `.value`; templates unwrap refs automatically.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **ref:** Creates a reactive wrapper around a value.


---

<!-- 021_SLOTS.md -->

# Slots

## What / Why

Slots let parents provide template content to child components.

## Mental Model

```text
Parent content → child slot
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Slots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for composition.

## Common Mistake / Interview Trap

Slot scope comes from where template is defined.

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

> **Slots:** Slots let parents provide template content to child components.


---

<!-- 022_REACTIVE.md -->

# reactive

## What / Why

Creates a deeply reactive proxy for an object.

## Mental Model

```text
const state = reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: reactive
</script>

<template>
  <div>reactive</div>
</template>
```

## When to Use

Use for cohesive object state.

## Common Mistake / Interview Trap

Destructuring can lose reactivity unless using helpers.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **reactive:** Creates a deeply reactive proxy for an object.


---

<!-- 022_SCOPED_SLOTS.md -->

# Scoped Slots

## What / Why

Child exposes data to slot content.

## Mental Model

```text
<slot :item='item'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Scoped Slots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for render customization.

## Common Mistake / Interview Trap

Can create tight contracts if too much internal state is exposed.

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

> **Scoped Slots:** Child exposes data to slot content.


---

<!-- 023_DYNAMIC_COMPONENTS.md -->

# Dynamic Components

## What / Why

`<component :is='current'>` switches component type dynamically.

## Mental Model

```text
type → component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Dynamic Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for tabs/pluggable views.

## Common Mistake / Interview Trap

Consider KeepAlive if state preservation is needed.

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

> **Dynamic Components:** `<component :is='current'>` switches component type dynamically.


---

<!-- 023_SHALLOWREF.md -->

# shallowRef

## What / Why

Tracks replacement of `.value` without deeply proxying nested data.

## Mental Model

```text
const chart = shallowRef(instance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowRef
</script>

<template>
  <div>shallowRef</div>
</template>
```

## When to Use

Use for large immutable data or external class instances.

## Common Mistake / Interview Trap

Nested mutations do not trigger updates unless value is replaced/triggered.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **shallowRef:** Tracks replacement of `.value` without deeply proxying nested data.


---

<!-- 024_SHALLOWREACTIVE.md -->

# shallowReactive

## What / Why

Creates a proxy reactive only at root level.

## Mental Model

```text
shallowReactive({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowReactive
</script>

<template>
  <div>shallowReactive</div>
</template>
```

## When to Use

Use for controlled performance/integration scenarios.

## Common Mistake / Interview Trap

Avoid mixing shallow and deep reactivity casually.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **shallowReactive:** Creates a proxy reactive only at root level.


---

<!-- 024_TELEPORT.md -->

# Teleport

## What / Why

Renders children into a different DOM location.

## Mental Model

```text
component tree → body/modal root
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for modals/popovers.

## Common Mistake / Interview Trap

Logical Vue parentage remains even when DOM location changes.

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

> **Teleport:** Renders children into a different DOM location.


---

<!-- 025_KEEPALIVE.md -->

# KeepAlive

## What / Why

Caches inactive component instances instead of unmounting.

## Mental Model

```text
dynamic view → cached instance
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: KeepAlive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for tabs/routes needing preserved state.

## Common Mistake / Interview Trap

Cached components still consume memory.

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

> **KeepAlive:** Caches inactive component instances instead of unmounting.


---

<!-- 025_READONLY.md -->

# readonly

## What / Why

Creates a readonly proxy view.

## Mental Model

```text
readonly(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: readonly
</script>

<template>
  <div>readonly</div>
</template>
```

## When to Use

Use to expose state without mutation permission.

## Common Mistake / Interview Trap

Readonly is runtime reactive protection, not a security boundary.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **readonly:** Creates a readonly proxy view.


---

<!-- 026_COMPUTED.md -->

# computed

## What / Why

Creates cached derived reactive state.

## Mental Model

```text
const total = computed(()=>price.value*qty.value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed
</script>

<template>
  <div>computed</div>
</template>
```

## When to Use

Use for pure derivations.

## Common Mistake / Interview Trap

Do not perform side effects inside computed getters.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **computed:** Creates cached derived reactive state.


---

<!-- 026_TRANSITION.md -->

# Transition

## What / Why

Adds enter/leave transition orchestration.

## Mental Model

```text
state change → transition classes/hooks
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Transition
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for UI transitions.

## Common Mistake / Interview Trap

Do not animate layout-heavy properties unnecessarily.

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

> **Transition:** Adds enter/leave transition orchestration.


---

<!-- 027_COMPUTED_SETTER.md -->

# computed setter

## What / Why

Computed can expose get/set for derived writable contracts.

## Mental Model

```text
computed({get,set})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed setter
</script>

<template>
  <div>computed setter</div>
</template>
```

## When to Use

Use sparingly for reversible mapping.

## Common Mistake / Interview Trap

Prefer explicit mutation functions when setter semantics become opaque.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **computed setter:** Computed can expose get/set for derived writable contracts.


---

<!-- 027_TRANSITIONGROUP.md -->

# TransitionGroup

## What / Why

Animates list insert/remove/reorder.

## Mental Model

```text
keyed list → move transitions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: TransitionGroup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with stable keys.

## Common Mistake / Interview Trap

Poor keys break transition identity.

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

> **TransitionGroup:** Animates list insert/remove/reorder.


---

<!-- 028_REF.md -->

# ref

## What / Why

Wraps a value in a reactive ref.

## Mental Model

```text
const count=ref(0)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ref
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for primitive or explicit single-value state.

## Common Mistake / Interview Trap

Use `.value` in JavaScript; templates unwrap refs.

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

> **ref:** Wraps a value in a reactive ref.


---

<!-- 028_WATCH.md -->

# watch

## What / Why

Runs callback when explicit reactive source changes.

## Mental Model

```text
watch(id, async newId => ...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watch
</script>

<template>
  <div>watch</div>
</template>
```

## When to Use

Use for side effects tied to specific source.

## Common Mistake / Interview Trap

Do not use watch for values that should be computed.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **watch:** Runs callback when explicit reactive source changes.


---

<!-- 029_REACTIVE.md -->

# reactive

## What / Why

Creates a deep reactive proxy for objects.

## Mental Model

```text
const state=reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: reactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for cohesive object state.

## Common Mistake / Interview Trap

Destructuring plain properties can lose reactivity unless using toRefs/toRef or reactive props behavior.

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

> **reactive:** Creates a deep reactive proxy for objects.


---

<!-- 029_WATCHEFFECT.md -->

# watchEffect

## What / Why

Automatically tracks dependencies used synchronously in callback.

## Mental Model

```text
watchEffect(()=>console.log(count.value))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchEffect
</script>

<template>
  <div>watchEffect</div>
</template>
```

## When to Use

Use for concise reactive side effects.

## Common Mistake / Interview Trap

Implicit dependencies can reduce readability in complex logic.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **watchEffect:** Automatically tracks dependencies used synchronously in callback.


---

<!-- 02_CURRENT_VUE_3_5.md -->

# Current Vue Baseline — Vue 3.5

## Stable Version

As of September 15, 2026:

```text
Vue stable: 3.5.42
Vue 3.6: release-candidate / pre-release
```

Vue 3 remains the current major Vue line.

Vue 2 reached end of life on December 31, 2023.

## Production Baseline

```text
Vue 3.5.x
Composition API
<script setup>
create-vue
Vite
Vue Router 4
Pinia
Vitest
TypeScript when appropriate
```

## Important Vue 3.5-era Features

```text
Reactive props destructure
useTemplateRef()
onWatcherCleanup()
SSR lazy hydration strategies
reactivity/SSR improvements
```

## Setup

```bash
npm create vue@latest
```

Official create-vue prompts can configure:
- TypeScript
- JSX
- Vue Router
- Pinia
- testing
- linting/formatting

## Rule

Do not treat Vue 3.6 RC APIs/behavior as stable production baseline until 3.6 is officially released.


---

<!-- 030_SHALLOWREF.md -->

# shallowRef

## What / Why

Tracks `.value` replacement but not deep nested mutation.

## Mental Model

```text
shallowRef(externalObject)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for large immutable/external objects and integration.

## Common Mistake / Interview Trap

Nested changes are not tracked.

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

> **shallowRef:** Tracks `.value` replacement but not deep nested mutation.


---

<!-- 030_WATCHPOSTEFFECT.md -->

# watchPostEffect

## What / Why

Runs watched effect after component DOM update.

## Mental Model

```text
watchPostEffect(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchPostEffect
</script>

<template>
  <div>watchPostEffect</div>
</template>
```

## When to Use

Use when side effect needs updated DOM.

## Common Mistake / Interview Trap

Prefer nextTick or lifecycle APIs when intent is one-time DOM work.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **watchPostEffect:** Runs watched effect after component DOM update.


---

<!-- 031_SHALLOWREACTIVE.md -->

# shallowReactive

## What / Why

Only root-level properties are reactive.

## Mental Model

```text
shallowReactive(obj)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowReactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for controlled performance/integration cases.

## Common Mistake / Interview Trap

Mixing shallow/deep trees can be confusing.

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

> **shallowReactive:** Only root-level properties are reactive.


---

<!-- 031_WATCHSYNCEFFECT.md -->

# watchSyncEffect

## What / Why

Runs synchronously on dependency mutation.

## Mental Model

```text
watchSyncEffect(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watchSyncEffect
</script>

<template>
  <div>watchSyncEffect</div>
</template>
```

## When to Use

Use only for narrow low-cost cases.

## Common Mistake / Interview Trap

Can run many times and bypass batching benefits.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **watchSyncEffect:** Runs synchronously on dependency mutation.


---

<!-- 032_ONWATCHERCLEANUP.md -->

# onWatcherCleanup

## What / Why

Registers cleanup for a watcher before re-run/stop.

## Mental Model

```text
onWatcherCleanup(()=>controller.abort())
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onWatcherCleanup
</script>

<template>
  <div>onWatcherCleanup</div>
</template>
```

## When to Use

Use for aborting stale requests/resources in Vue 3.5+.

## Common Mistake / Interview Trap

Must be called synchronously during watcher callback/effect execution.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onWatcherCleanup:** Registers cleanup for a watcher before re-run/stop.


---

<!-- 032_READONLY.md -->

# readonly

## What / Why

Creates readonly reactive proxy.

## Mental Model

```text
readonly(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: readonly
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to expose read-only state.

## Common Mistake / Interview Trap

It does not freeze the original source object.

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

> **readonly:** Creates readonly reactive proxy.


---

<!-- 033_SHALLOWREADONLY.md -->

# shallowReadonly

## What / Why

Readonly only at root level.

## Mental Model

```text
shallowReadonly(obj)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: shallowReadonly
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for controlled API boundaries.

## Common Mistake / Interview Trap

Nested objects remain mutable.

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

> **shallowReadonly:** Readonly only at root level.


---

<!-- 033_TOREF.md -->

# toRef

## What / Why

Creates a ref linked to a property/source.

## Mental Model

```text
toRef(props,'foo')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toRef
</script>

<template>
  <div>toRef</div>
</template>
```

## When to Use

Use to preserve reactivity when passing a property around.

## Common Mistake / Interview Trap

Do not mutate readonly prop refs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **toRef:** Creates a ref linked to a property/source.


---

<!-- 034_COMPUTED.md -->

# computed

## What / Why

Creates cached derived reactive value.

## Mental Model

```text
computed(()=>first.value+' '+last.value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: computed
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for derived state.

## Common Mistake / Interview Trap

Computed getters should be pure.

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

> **computed:** Creates cached derived reactive value.


---

<!-- 034_TOREFS.md -->

# toRefs

## What / Why

Converts reactive object properties to linked refs.

## Mental Model

```text
const {x,y}=toRefs(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toRefs
</script>

<template>
  <div>toRefs</div>
</template>
```

## When to Use

Use when destructuring reactive objects.

## Common Mistake / Interview Trap

Adds ceremony; script setup/compiler conveniences may reduce need.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **toRefs:** Converts reactive object properties to linked refs.


---

<!-- 035_TOVALUE.md -->

# toValue

## What / Why

Normalizes ref/getter/plain value to a value.

## Mental Model

```text
toValue(maybeRefOrGetter)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: toValue
</script>

<template>
  <div>toValue</div>
</template>
```

## When to Use

Use in composables accepting flexible reactive inputs.

## Common Mistake / Interview Trap

Understand when the getter is evaluated.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **toValue:** Normalizes ref/getter/plain value to a value.


---

<!-- 035_WRITABLE_COMPUTED.md -->

# Writable Computed

## What / Why

Computed can define get/set.

## Mental Model

```text
computed({get,set})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Writable Computed
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for small derived two-way interfaces.

## Common Mistake / Interview Trap

Avoid hiding complex mutation rules.

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

> **Writable Computed:** Computed can define get/set.


---

<!-- 036_UNREF.md -->

# unref

## What / Why

Returns ref.value or plain value.

## Mental Model

```text
unref(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: unref
</script>

<template>
  <div>unref</div>
</template>
```

## When to Use

Use for simple normalization.

## Common Mistake / Interview Trap

toValue also supports getters.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **unref:** Returns ref.value or plain value.


---

<!-- 036_WATCH.md -->

# watch

## What / Why

Runs callback when explicit reactive source changes.

## Mental Model

```text
watch(source,cb)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for async side effects or comparing old/new values.

## Common Mistake / Interview Trap

Do not use watch for simple derived state.

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

> **watch:** Runs callback when explicit reactive source changes.


---

<!-- 037_ISREF.md -->

# isRef

## What / Why

Checks whether value is a ref.

## Mental Model

```text
isRef(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: isRef
</script>

<template>
  <div>isRef</div>
</template>
```

## When to Use

Use in generic composables/libraries.

## Common Mistake / Interview Trap

Application code rarely needs frequent type probing.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **isRef:** Checks whether value is a ref.


---

<!-- 037_WATCHEFFECT.md -->

# watchEffect

## What / Why

Runs immediately and tracks dependencies used synchronously.

## Mental Model

```text
watchEffect(()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watchEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for small auto-tracked side effects.

## Common Mistake / Interview Trap

Dependencies accessed after await are not tracked the same way.

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

> **watchEffect:** Runs immediately and tracks dependencies used synchronously.


---

<!-- 038_CUSTOMREF.md -->

# customRef

## What / Why

Creates custom dependency tracking/trigger behavior.

## Mental Model

```text
customRef((track,trigger)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: customRef
</script>

<template>
  <div>customRef</div>
</template>
```

## When to Use

Use for debounce or specialized reactivity.

## Common Mistake / Interview Trap

Easy to create surprising update semantics.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **customRef:** Creates custom dependency tracking/trigger behavior.


---

<!-- 038_WATCHPOSTEFFECT.md -->

# watchPostEffect

## What / Why

Runs watcher after component DOM updates.

## Mental Model

```text
watchPostEffect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watchPostEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM-dependent post-render work.

## Common Mistake / Interview Trap

Prefer normal watch/watchEffect unless timing matters.

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

> **watchPostEffect:** Runs watcher after component DOM updates.


---

<!-- 039_TRIGGERREF.md -->

# triggerRef

## What / Why

Manually triggers effects for a shallowRef.

## Mental Model

```text
triggerRef(shallow)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: triggerRef
</script>

<template>
  <div>triggerRef</div>
</template>
```

## When to Use

Use after deep mutation of shallow ref when necessary.

## Common Mistake / Interview Trap

Usually replacing the value is clearer.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **triggerRef:** Manually triggers effects for a shallowRef.


---

<!-- 039_WATCHSYNCEFFECT.md -->

# watchSyncEffect

## What / Why

Runs synchronously on dependency mutation.

## Mental Model

```text
watchSyncEffect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watchSyncEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely for low-level synchronization.

## Common Mistake / Interview Trap

Can cause performance issues with frequent mutations.

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

> **watchSyncEffect:** Runs synchronously on dependency mutation.


---

<!-- 03_COMPOSITION_VS_OPTIONS.md -->

# Composition API vs Options API

| Composition API | Options API |
|---|---|
| `setup` / `<script setup>` | `data`, `methods`, `computed`, `watch` |
| logic grouped by feature | logic grouped by option type |
| excellent TS inference | approachable object-based structure |
| composables | mixins / reusable patterns |
| modern default for complex apps | fully supported |

## Composition API Example

```vue
<script setup lang="ts">
import { ref, computed } from 'vue'

const count = ref(0)
const doubled = computed(() => count.value * 2)
</script>

<template>
  <button @click="count++">{{ doubled }}</button>
</template>
```

## Options API Example

```vue
<script>
export default {
  data: () => ({ count: 0 }),
  computed: {
    doubled() { return this.count * 2 }
  }
}
</script>
```

## Interview Rule

Options API is **not deprecated**.

For modern large TypeScript-heavy applications, Composition API with `<script setup>` is generally the preferred architecture.


---

<!-- 03_VUE_3_5_FEATURES.md -->

# Vue 3.5 — High-Value Feature Recall

## Reactive Props Destructure

```vue
<script setup lang="ts">
const { msg = 'hello' } = defineProps<{ msg?: string }>()
</script>
```

In Vue 3.5, destructured props in `<script setup>` are compiler-transformed so references remain reactive.

## useTemplateRef

```vue
<script setup lang="ts">
import { useTemplateRef, onMounted } from 'vue'

const input = useTemplateRef<HTMLInputElement>('input')

onMounted(() => input.value?.focus())
</script>

<template>
  <input ref="input" />
</template>
```

## Lazy Hydration for Async Components

```ts
defineAsyncComponent({
  loader: () => import('./Heavy.vue'),
  hydrate: hydrateOnVisible()
})
```

Built-in strategies include:
```text
hydrateOnIdle
hydrateOnVisible
hydrateOnMediaQuery
hydrateOnInteraction
```

## Hydration Mismatch Control

`data-allow-mismatch` can selectively suppress known unavoidable SSR mismatch warnings.

## Why It Matters

Vue 3.5 is not merely “Vue 3 with bug fixes”; it improves SFC ergonomics, SSR/hydration control, type inference, and runtime behavior.


---

<!-- 040_MARKRAW.md -->

# markRaw

## What / Why

Prevents an object from becoming reactive.

## Mental Model

```text
markRaw(externalInstance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: markRaw
</script>

<template>
  <div>markRaw</div>
</template>
```

## When to Use

Use for third-party class instances/large immutable objects.

## Common Mistake / Interview Trap

Creates identity/reactivity edges; use deliberately.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **markRaw:** Prevents an object from becoming reactive.


---

<!-- 040_ONWATCHERCLEANUP.md -->

# onWatcherCleanup

## What / Why

Registers cleanup for watcher invalidation.

## Mental Model

```text
onWatcherCleanup(cancel)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onWatcherCleanup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to abort stale requests/resources.

## Common Mistake / Interview Trap

Call it in supported synchronous watcher callback timing.

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

> **onWatcherCleanup:** Registers cleanup for watcher invalidation.


---

<!-- 041_EFFECTSCOPE.md -->

# effectScope

## What / Why

Groups reactive effects so they can be stopped together.

## Mental Model

```text
const scope=effectScope()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: effectScope
</script>

<template>
  <div>effectScope</div>
</template>
```

## When to Use

Use in libraries/composables managing effect lifetimes.

## Common Mistake / Interview Trap

Components already manage their own scope automatically.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **effectScope:** Groups reactive effects so they can be stopped together.


---

<!-- 042_GETCURRENTSCOPE.md -->

# getCurrentScope

## What / Why

Returns current active effect scope.

## Mental Model

```text
getCurrentScope()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: getCurrentScope
</script>

<template>
  <div>getCurrentScope</div>
</template>
```

## When to Use

Use in advanced composable/library code.

## Common Mistake / Interview Trap

Rarely necessary in app-level code.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **getCurrentScope:** Returns current active effect scope.


---

<!-- 043_ONSCOPEDISPOSE.md -->

# onScopeDispose

## What / Why

Registers cleanup in current effect scope.

## Mental Model

```text
onScopeDispose(cleanup)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onScopeDispose
</script>

<template>
  <div>onScopeDispose</div>
</template>
```

## When to Use

Use for reusable composables independent of component lifecycle.

## Common Mistake / Interview Trap

Ensure composable runs inside an active scope.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onScopeDispose:** Registers cleanup in current effect scope.


---

<!-- 044_NEXTTICK.md -->

# nextTick

## What / Why

Waits for pending DOM update flush.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: nextTick
</script>

<template>
  <div>nextTick</div>
</template>
```

## When to Use

Use when code must observe updated DOM.

## Common Mistake / Interview Trap

Do not use as a general async delay.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **nextTick:** Waits for pending DOM update flush.


---

<!-- 044_TOREF.md -->

# toRef

## What / Why

Creates/refers to a ref for a reactive property or getter.

## Mental Model

```text
toRef(state,'count')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to preserve reactivity across APIs.

## Common Mistake / Interview Trap

Changing underlying state updates the ref.

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

> **toRef:** Creates/refers to a ref for a reactive property or getter.


---

<!-- 045_DEFINEPROPS.md -->

# defineProps

## What / Why

Compile-time macro declares component props in script setup.

## Mental Model

```text
const props=defineProps<{id:string}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineProps
</script>

<template>
  <div>defineProps</div>
</template>
```

## When to Use

Use type-based declarations with TypeScript when appropriate.

## Common Mistake / Interview Trap

Props are readonly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineProps:** Compile-time macro declares component props in script setup.


---

<!-- 045_TOREFS.md -->

# toRefs

## What / Why

Converts reactive object properties to refs.

## Mental Model

```text
toRefs(state)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRefs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when destructuring a reactive object.

## Common Mistake / Interview Trap

Can create many refs unnecessarily.

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

> **toRefs:** Converts reactive object properties to refs.


---

<!-- 046_REACTIVE_PROPS_DESTRUCTURE.md -->

# Reactive Props Destructure

## What / Why

Vue 3.5 supports reactive destructuring of defineProps variables in script setup.

## Mental Model

```text
const {foo='x'}=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Reactive Props Destructure
</script>

<template>
  <div>Reactive Props Destructure</div>
</template>
```

## When to Use

Use for concise defaults/reactive props in 3.5+.

## Common Mistake / Interview Trap

Know older Vue versions did not preserve reactivity on plain destructure.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Reactive Props Destructure:** Vue 3.5 supports reactive destructuring of defineProps variables in script setup.


---

<!-- 046_UNREF.md -->

# unref

## What / Why

Returns ref value or plain value unchanged.

## Mental Model

```text
unref(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: unref
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in generic utilities.

## Common Mistake / Interview Trap

Often `toValue` is better for MaybeRefOrGetter inputs.

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

> **unref:** Returns ref value or plain value unchanged.


---

<!-- 047_TOVALUE.md -->

# toValue

## What / Why

Normalizes value/ref/getter to value.

## Mental Model

```text
toValue(source)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toValue
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in composables accepting flexible reactive inputs.

## Common Mistake / Interview Trap

Getter execution may establish dependencies when used in reactive context.

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

> **toValue:** Normalizes value/ref/getter to value.


---

<!-- 047_WITHDEFAULTS.md -->

# withDefaults

## What / Why

Provides defaults for type-based props declarations, especially older patterns.

## Mental Model

```text
withDefaults(defineProps<Props>(),{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: withDefaults
</script>

<template>
  <div>withDefaults</div>
</template>
```

## When to Use

Use when needed for compatibility/complex defaults.

## Common Mistake / Interview Trap

Reactive props destructure can be simpler in Vue 3.5+.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **withDefaults:** Provides defaults for type-based props declarations, especially older patterns.


---

<!-- 048_DEFINEEMITS.md -->

# defineEmits

## What / Why

Declares typed component events.

## Mental Model

```text
const emit=defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineEmits
</script>

<template>
  <div>defineEmits</div>
</template>
```

## When to Use

Use for explicit child-to-parent events.

## Common Mistake / Interview Trap

Events should express intent, not mutate parent state indirectly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineEmits:** Declares typed component events.


---

<!-- 048_ISREF.md -->

# isRef

## What / Why

Checks whether value is a ref.

## Mental Model

```text
isRef(x)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: isRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in generic library code.

## Common Mistake / Interview Trap

Normal app code rarely needs it.

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

> **isRef:** Checks whether value is a ref.


---

<!-- 049_DEFINEMODEL.md -->

# defineModel

## What / Why

Declares component v-model contract.

## Mental Model

```text
const model=defineModel<string>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineModel
</script>

<template>
  <div>defineModel</div>
</template>
```

## When to Use

Use for reusable two-way value components.

## Common Mistake / Interview Trap

Do not use v-model everywhere if one-way props/events are clearer.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineModel:** Declares component v-model contract.


---

<!-- 049_TRIGGERREF.md -->

# triggerRef

## What / Why

Manually triggers effects for shallowRef after deep mutation.

## Mental Model

```text
triggerRef(shallow)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: triggerRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with shallow integration patterns.

## Common Mistake / Interview Trap

Frequent manual triggering can indicate wrong state model.

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

> **triggerRef:** Manually triggers effects for shallowRef after deep mutation.


---

<!-- 04_REACTIVITY_DECISION.md -->

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


---

<!-- 04_VUE_3_6_RC_FUTURE.md -->

# Vue 3.6 RC — Future-Facing Cheat Sheet

## Status

As of September 15, 2026, Vue 3.6 is still **Release Candidate**, not stable.

## Major Themes

### Vapor Mode
A compiler/runtime strategy designed to update DOM more directly without relying on the normal Virtual DOM path for supported compiled components.

Mental model:
```text
Template
  ↓
Vapor Compiler
  ↓
Fine-grained DOM operations
```

### Reactivity Engine Refactor
Vue 3.6 RC includes a major `@vue/reactivity` refactor based on alien-signals with performance and memory improvements.

## Interview Position

Say:

> Vue 3.6 introduces Vapor Mode and a major reactivity-engine rewrite, but as of September 15, 2026 it is still in RC. My stable production baseline is Vue 3.5.42.

## Rule

Learn 3.6 architecture now; adopt in production only after stable release and ecosystem compatibility review.


---

<!-- 050_CUSTOMREF.md -->

# customRef

## What / Why

Implements custom tracking/triggering behavior.

## Mental Model

```text
customRef((track,trigger)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: customRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for debounce-like refs/library features.

## Common Mistake / Interview Trap

Incorrect tracking can create subtle bugs.

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

> **customRef:** Implements custom tracking/triggering behavior.


---

<!-- 050_MULTIPLE_V_MODEL.md -->

# Multiple v-model

## What / Why

A component can expose multiple named models.

## Mental Model

```text
v-model:first-name / defineModel('firstName')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Multiple v-model
</script>

<template>
  <div>Multiple v-model</div>
</template>
```

## When to Use

Use for composite reusable inputs.

## Common Mistake / Interview Trap

Keep public component API understandable.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Multiple v-model:** A component can expose multiple named models.


---

<!-- 051_MARKRAW.md -->

# markRaw

## What / Why

Prevents object from becoming reactive.

## Mental Model

```text
markRaw(instance)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: markRaw
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for third-party class instances/large immutable structures.

## Common Mistake / Interview Trap

Do not mark domain state raw accidentally.

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

> **markRaw:** Prevents object from becoming reactive.


---

<!-- 051_MODEL_MODIFIERS.md -->

# Model Modifiers

## What / Why

Custom components can inspect/transform v-model modifiers.

## Mental Model

```text
defineModel({get,set})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Model Modifiers
</script>

<template>
  <div>Model Modifiers</div>
</template>
```

## When to Use

Use for controlled input normalization.

## Common Mistake / Interview Trap

Avoid hidden surprising transformations.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Model Modifiers:** Custom components can inspect/transform v-model modifiers.


---

<!-- 052_FALLTHROUGH_ATTRIBUTES.md -->

# Fallthrough Attributes

## What / Why

Unrecognized attrs/listeners can fall through to root element.

## Mental Model

```text
$attrs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Fallthrough Attributes
</script>

<template>
  <div>Fallthrough Attributes</div>
</template>
```

## When to Use

Use wrapper components carefully.

## Common Mistake / Interview Trap

Multi-root components require explicit attribute routing.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Fallthrough Attributes:** Unrecognized attrs/listeners can fall through to root element.


---

<!-- 052_TORAW.md -->

# toRaw

## What / Why

Returns original object behind proxy.

## Mental Model

```text
toRaw(proxy)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: toRaw
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for diagnostics/interop.

## Common Mistake / Interview Trap

Do not hold raw reference long-term and mutate behind Vue.

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

> **toRaw:** Returns original object behind proxy.


---

<!-- 053_DEFINEPROPS.md -->

# defineProps

## What / Why

Compiler macro declares component props.

## Mental Model

```text
const props=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineProps
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed props in script setup.

## Common Mistake / Interview Trap

Props are readonly from child perspective.

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

> **defineProps:** Compiler macro declares component props.


---

<!-- 053_INHERITATTRS.md -->

# inheritAttrs

## What / Why

Controls automatic fallthrough.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: inheritAttrs
</script>

<template>
  <div>inheritAttrs</div>
</template>
```

## When to Use

Use when wrapper must decide where attrs go.

## Common Mistake / Interview Trap

Forgetting to forward attrs can break accessibility.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **inheritAttrs:** Controls automatic fallthrough.


---

<!-- 054_REACTIVE_PROPS_DESTRUCTURE.md -->

# Reactive Props Destructure

## What / Why

Vue 3.5 makes destructured props reactive in script setup.

## Mental Model

```text
const {foo='default'}=defineProps<Props>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Reactive Props Destructure
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use concise typed destructuring.

## Common Mistake / Interview Trap

Compiler transforms accesses; understand behavior when passing values to watchers/functions.

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

> **Reactive Props Destructure:** Vue 3.5 makes destructured props reactive in script setup.


---

<!-- 054_SLOTS.md -->

# Slots

## What / Why

Caller provides content to child layout/component.

## Mental Model

```text
<slot/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Slots
</script>

<template>
  <div>Slots</div>
</template>
```

## When to Use

Use for composition and reusable containers.

## Common Mistake / Interview Trap

Slots are content contracts; don't overcouple to internal markup.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Slots:** Caller provides content to child layout/component.


---

<!-- 055_NAMED_SLOTS.md -->

# Named Slots

## What / Why

Expose multiple placement regions.

## Mental Model

```text
<slot name='header'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Named Slots
</script>

<template>
  <div>Named Slots</div>
</template>
```

## When to Use

Use for flexible layouts.

## Common Mistake / Interview Trap

Too many slots can create fragile APIs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Named Slots:** Expose multiple placement regions.


---

<!-- 055_WITHDEFAULTS.md -->

# withDefaults

## What / Why

Provides defaults for type-based defineProps in older/non-destructure patterns.

## Mental Model

```text
withDefaults(defineProps<Props>(),{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: withDefaults
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when needed.

## Common Mistake / Interview Trap

Mutable default values may need factory functions depending on API style.

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

> **withDefaults:** Provides defaults for type-based defineProps in older/non-destructure patterns.


---

<!-- 056_DEFINEEMITS.md -->

# defineEmits

## What / Why

Compiler macro declares emitted events.

## Mental Model

```text
const emit=defineEmits<...>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineEmits
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed child-to-parent events.

## Common Mistake / Interview Trap

Emits should represent events, not remote procedure calls for everything.

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

> **defineEmits:** Compiler macro declares emitted events.


---

<!-- 056_SCOPED_SLOTS.md -->

# Scoped Slots

## What / Why

Child exposes data to slot content.

## Mental Model

```text
<slot :item='item'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Scoped Slots
</script>

<template>
  <div>Scoped Slots</div>
</template>
```

## When to Use

Use for headless/reusable behaviors.

## Common Mistake / Interview Trap

Remember scope belongs to parent template.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Scoped Slots:** Child exposes data to slot content.


---

<!-- 057_DEFINEMODEL.md -->

# defineModel

## What / Why

Recommended Vue 3.4+ component v-model contract.

## Mental Model

```text
const model=defineModel()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineModel
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable two-way-bound controls.

## Common Mistake / Interview Trap

Default values can desynchronize parent/child if parent passes no value.

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

> **defineModel:** Recommended Vue 3.4+ component v-model contract.


---

<!-- 057_DEFINESLOTS.md -->

# defineSlots

## What / Why

Provides type hints for slots in script setup.

## Mental Model

```text
defineSlots<Slots>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineSlots
</script>

<template>
  <div>defineSlots</div>
</template>
```

## When to Use

Use in typed component libraries.

## Common Mistake / Interview Trap

Primarily compile-time/type support.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineSlots:** Provides type hints for slots in script setup.


---

<!-- 058_MULTIPLE_V_MODEL.md -->

# Multiple v-model

## What / Why

A component can expose multiple named models.

## Mental Model

```text
defineModel('firstName')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Multiple v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when component legitimately owns multiple editable values.

## Common Mistake / Interview Trap

Too many models can make API hard to reason about.

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

> **Multiple v-model:** A component can expose multiple named models.


---

<!-- 058_PROVIDE.md -->

# provide

## What / Why

Provides a value to descendants without prop drilling.

## Mental Model

```text
provide(key,value)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: provide
</script>

<template>
  <div>provide</div>
</template>
```

## When to Use

Use for plugin/context-style dependencies.

## Common Mistake / Interview Trap

Avoid using provide/inject as hidden global state.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **provide:** Provides a value to descendants without prop drilling.


---

<!-- 059_INJECT.md -->

# inject

## What / Why

Reads nearest provided value.

## Mental Model

```text
inject(key)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: inject
</script>

<template>
  <div>inject</div>
</template>
```

## When to Use

Use for deeply nested contextual dependencies.

## Common Mistake / Interview Trap

Always handle missing/default cases when provider is optional.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **inject:** Reads nearest provided value.


---

<!-- 059_V_MODEL_MODIFIERS.md -->

# v-model Modifiers

## What / Why

Native/custom modifiers transform binding behavior.

## Mental Model

```text
.trim/.number/.lazy/custom
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model Modifiers
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for input normalization.

## Common Mistake / Interview Trap

Keep business validation separate.

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

> **v-model Modifiers:** Native/custom modifiers transform binding behavior.


---

<!-- 05_COMPOSITION_VS_OPTIONS.md -->

# Composition API vs Options API

| Composition API | Options API |
|---|---|
| logic grouped by feature | logic grouped by option type |
| composables | mixins / option reuse |
| excellent TypeScript inference | simpler for some small components |
| `<script setup>` modern style | familiar classic Vue style |
| no component-instance `this` | uses `this` |

## Recommendation

For modern large Vue 3 applications:
```text
Composition API + <script setup>
```

But Options API remains fully supported and is important for legacy/enterprise maintenance.

## Interview Trap

Composition API is not “Vue 4” and Options API is not deprecated simply because Composition API is popular.


---

<!-- 060_DEFINEEXPOSE.md -->

# defineExpose

## What / Why

Controls what parent template ref can access from script setup component.

## Mental Model

```text
defineExpose({focus})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineExpose
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for small imperative public APIs.

## Common Mistake / Interview Trap

Do not expose internal state broadly.

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

> **defineExpose:** Controls what parent template ref can access from script setup component.


---

<!-- 060_INJECTIONKEY.md -->

# InjectionKey

## What / Why

Provides typed Symbol keys for provide/inject.

## Mental Model

```text
const key:InjectionKey<Service>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: InjectionKey
</script>

<template>
  <div>InjectionKey</div>
</template>
```

## When to Use

Use for robust library/app contexts.

## Common Mistake / Interview Trap

String keys can collide in large ecosystems.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **InjectionKey:** Provides typed Symbol keys for provide/inject.


---

<!-- 061_DEFINEEXPOSE.md -->

# defineExpose

## What / Why

Controls what a script-setup component exposes through template refs.

## Mental Model

```text
defineExpose({focus})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineExpose
</script>

<template>
  <div>defineExpose</div>
</template>
```

## When to Use

Use for narrow imperative APIs.

## Common Mistake / Interview Trap

Prefer declarative props/events when possible.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineExpose:** Controls what a script-setup component exposes through template refs.


---

<!-- 061_DEFINEOPTIONS.md -->

# defineOptions

## What / Why

Declares component options inside script setup.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineOptions
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for compile-time component options.

## Common Mistake / Interview Trap

Not for reactive runtime values.

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

> **defineOptions:** Declares component options inside script setup.


---

<!-- 062_DEFINEOPTIONS.md -->

# defineOptions

## What / Why

Declares component options in script setup.

## Mental Model

```text
defineOptions({inheritAttrs:false})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineOptions
</script>

<template>
  <div>defineOptions</div>
</template>
```

## When to Use

Use for options without a separate script block.

## Common Mistake / Interview Trap

Compile-time macro only.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineOptions:** Declares component options in script setup.


---

<!-- 062_USEATTRS.md -->

# useAttrs

## What / Why

Accesses fallthrough attributes.

## Mental Model

```text
useAttrs()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useAttrs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for wrappers/advanced forwarding.

## Common Mistake / Interview Trap

Attrs object is not fully reactive for watcher use.

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

> **useAttrs:** Accesses fallthrough attributes.


---

<!-- 063_DEFINEASYNCCOMPONENT.md -->

# defineAsyncComponent

## What / Why

Loads a component asynchronously.

## Mental Model

```text
defineAsyncComponent(()=>import('./Chart.vue'))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: defineAsyncComponent
</script>

<template>
  <div>defineAsyncComponent</div>
</template>
```

## When to Use

Use for feature/widget code splitting.

## Common Mistake / Interview Trap

Design loading/error/delay/timeout behavior.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **defineAsyncComponent:** Loads a component asynchronously.


---

<!-- 063_USESLOTS.md -->

# useSlots

## What / Why

Accesses slots programmatically.

## Mental Model

```text
useSlots()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useSlots
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in render/advanced component logic.

## Common Mistake / Interview Trap

Prefer declarative slots in normal templates.

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

> **useSlots:** Accesses slots programmatically.


---

<!-- 064_FALLTHROUGH_ATTRIBUTES.md -->

# Fallthrough Attributes

## What / Why

Undeclared attrs/listeners fall through to component root.

## Mental Model

```text
class/id/@click → root
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Fallthrough Attributes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use wrapper component conventions carefully.

## Common Mistake / Interview Trap

Multi-root components require explicit forwarding.

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

> **Fallthrough Attributes:** Undeclared attrs/listeners fall through to component root.


---

<!-- 064_ONBEFOREMOUNT.md -->

# onBeforeMount

## What / Why

Runs before initial mount.

## Mental Model

```text
onBeforeMount(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeMount
</script>

<template>
  <div>onBeforeMount</div>
</template>
```

## When to Use

Use rarely for pre-mount side effects.

## Common Mistake / Interview Trap

DOM is not mounted yet.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onBeforeMount:** Runs before initial mount.


---

<!-- 065_ONMOUNTED.md -->

# onMounted

## What / Why

Runs after component mounts in client.

## Mental Model

```text
onMounted(()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onMounted
</script>

<template>
  <div>onMounted</div>
</template>
```

## When to Use

Use for DOM/browser/third-party initialization.

## Common Mistake / Interview Trap

Does not run during SSR.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onMounted:** Runs after component mounts in client.


---

<!-- 065_PROVIDE_INJECT.md -->

# Provide / Inject

## What / Why

Passes dependencies/context through component tree without prop drilling.

## Mental Model

```text
provide(key,value) → inject(key)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Provide / Inject
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for plugin-like/context dependencies.

## Common Mistake / Interview Trap

Use Symbol/injection keys for library safety.

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

> **Provide / Inject:** Passes dependencies/context through component tree without prop drilling.


---

<!-- 066_INJECTIONKEY.md -->

# InjectionKey

## What / Why

Typed symbol for provide/inject.

## Mental Model

```text
InjectionKey<UserContext>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: InjectionKey
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in TypeScript libraries/apps.

## Common Mistake / Interview Trap

Avoid string key collisions in large apps.

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

> **InjectionKey:** Typed symbol for provide/inject.


---

<!-- 066_ONBEFOREUPDATE.md -->

# onBeforeUpdate

## What / Why

Runs before component DOM update.

## Mental Model

```text
onBeforeUpdate(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeUpdate
</script>

<template>
  <div>onBeforeUpdate</div>
</template>
```

## When to Use

Use for specialized pre-update observations.

## Common Mistake / Interview Trap

Avoid routine business logic.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onBeforeUpdate:** Runs before component DOM update.


---

<!-- 067_ONBEFOREMOUNT.md -->

# onBeforeMount

## What / Why

Runs before initial DOM mount.

## Mental Model

```text
setup → beforeMount → mount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeMount
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely for pre-DOM lifecycle work.

## Common Mistake / Interview Trap

DOM is not mounted yet.

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

> **onBeforeMount:** Runs before initial DOM mount.


---

<!-- 067_ONUPDATED.md -->

# onUpdated

## What / Why

Runs after component updates DOM.

## Mental Model

```text
onUpdated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onUpdated
</script>

<template>
  <div>onUpdated</div>
</template>
```

## When to Use

Use for DOM integration when no finer option exists.

## Common Mistake / Interview Trap

Updating component state here can create loops.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onUpdated:** Runs after component updates DOM.


---

<!-- 068_ONBEFOREUNMOUNT.md -->

# onBeforeUnmount

## What / Why

Runs before unmount.

## Mental Model

```text
onBeforeUnmount(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onBeforeUnmount
</script>

<template>
  <div>onBeforeUnmount</div>
</template>
```

## When to Use

Use when pre-disposal step is required.

## Common Mistake / Interview Trap

Most cleanup can live in onUnmounted/composable cleanup.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onBeforeUnmount:** Runs before unmount.


---

<!-- 068_ONMOUNTED.md -->

# onMounted

## What / Why

Runs after component DOM is mounted.

## Mental Model

```text
mount → onMounted
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onMounted
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM APIs/third-party widgets.

## Common Mistake / Interview Trap

Not called during server-side rendering.

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

> **onMounted:** Runs after component DOM is mounted.


---

<!-- 069_ONBEFOREUPDATE.md -->

# onBeforeUpdate

## What / Why

Runs before DOM patch after reactive update.

## Mental Model

```text
state change → beforeUpdate → patch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeUpdate
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely for DOM snapshot logic.

## Common Mistake / Interview Trap

Avoid mutating state that retriggers updates.

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

> **onBeforeUpdate:** Runs before DOM patch after reactive update.


---

<!-- 069_ONUNMOUNTED.md -->

# onUnmounted

## What / Why

Runs after component unmount.

## Mental Model

```text
onUnmounted(cleanup)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onUnmounted
</script>

<template>
  <div>onUnmounted</div>
</template>
```

## When to Use

Use to clean external subscriptions/listeners/timers.

## Common Mistake / Interview Trap

Vue cleans its own reactive effects, not every external resource.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onUnmounted:** Runs after component unmount.


---

<!-- 070_ONACTIVATED.md -->

# onActivated

## What / Why

Runs when KeepAlive-cached component becomes active.

## Mental Model

```text
onActivated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onActivated
</script>

<template>
  <div>onActivated</div>
</template>
```

## When to Use

Use with KeepAlive pages/widgets.

## Common Mistake / Interview Trap

Different from mount.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onActivated:** Runs when KeepAlive-cached component becomes active.


---

<!-- 070_ONUPDATED.md -->

# onUpdated

## What / Why

Runs after DOM update.

## Mental Model

```text
patch → onUpdated
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onUpdated
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM-dependent integration.

## Common Mistake / Interview Trap

Can run frequently; do not perform expensive work blindly.

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

> **onUpdated:** Runs after DOM update.


---

<!-- 071_ONBEFOREUNMOUNT.md -->

# onBeforeUnmount

## What / Why

Runs before instance unmount.

## Mental Model

```text
beforeUnmount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onBeforeUnmount
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for final cleanup sequencing.

## Common Mistake / Interview Trap

Prefer composable/scoped cleanup where possible.

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

> **onBeforeUnmount:** Runs before instance unmount.


---

<!-- 071_ONDEACTIVATED.md -->

# onDeactivated

## What / Why

Runs when KeepAlive component becomes inactive.

## Mental Model

```text
onDeactivated(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onDeactivated
</script>

<template>
  <div>onDeactivated</div>
</template>
```

## When to Use

Pause resources when cached but hidden.

## Common Mistake / Interview Trap

Component is not destroyed.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onDeactivated:** Runs when KeepAlive component becomes inactive.


---

<!-- 072_ONERRORCAPTURED.md -->

# onErrorCaptured

## What / Why

Captures descendant rendering/lifecycle errors.

## Mental Model

```text
onErrorCaptured((err)=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: onErrorCaptured
</script>

<template>
  <div>onErrorCaptured</div>
</template>
```

## When to Use

Use for component-tree error handling.

## Common Mistake / Interview Trap

It does not replace global monitoring.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **onErrorCaptured:** Captures descendant rendering/lifecycle errors.


---

<!-- 072_ONUNMOUNTED.md -->

# onUnmounted

## What / Why

Runs after component is unmounted.

## Mental Model

```text
unmount → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onUnmounted
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for timers/listeners/resources.

## Common Mistake / Interview Trap

Watcher/effects created synchronously in setup are generally scoped automatically; external resources still need cleanup.

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

> **onUnmounted:** Runs after component is unmounted.


---

<!-- 073_ONERRORCAPTURED.md -->

# onErrorCaptured

## What / Why

Captures descendant errors.

## Mental Model

```text
child error → ancestor hook
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onErrorCaptured
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for error boundaries/logging.

## Common Mistake / Interview Trap

Returning false stops propagation.

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

> **onErrorCaptured:** Captures descendant errors.


---

<!-- 073_TEMPLATE_REFS.md -->

# Template Refs

## What / Why

Reference DOM elements or child component instances.

## Mental Model

```text
const input=useTemplateRef('input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Template Refs
</script>

<template>
  <div>Template Refs</div>
</template>
```

## When to Use

Use for imperative DOM/component APIs.

## Common Mistake / Interview Trap

Avoid reaching into child internals.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Template Refs:** Reference DOM elements or child component instances.


---

<!-- 074_NEXTTICK.md -->

# nextTick

## What / Why

Waits until pending DOM updates flush.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: nextTick
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when DOM must reflect state before measurement.

## Common Mistake / Interview Trap

Do not use as a generic async delay.

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

> **nextTick:** Waits until pending DOM updates flush.


---

<!-- 074_USETEMPLATEREF.md -->

# useTemplateRef

## What / Why

Vue 3.5 helper for typed template refs.

## Mental Model

```text
const input=useTemplateRef('my-input')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: useTemplateRef
</script>

<template>
  <div>useTemplateRef</div>
</template>
```

## When to Use

Use instead of manual ref(null) for template refs in 3.5+.

## Common Mistake / Interview Trap

Ref is populated only after mount.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **useTemplateRef:** Vue 3.5 helper for typed template refs.


---

<!-- 075_COMPONENT_REFS.md -->

# Component Refs

## What / Why

Template ref can access component public instance/exposed API.

## Mental Model

```text
child.value?.focus()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Refs
</script>

<template>
  <div>Component Refs</div>
</template>
```

## When to Use

Use for imperative component handles.

## Common Mistake / Interview Trap

Prefer props/emits for normal communication.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Component Refs:** Template ref can access component public instance/exposed API.


---

<!-- 075_USETEMPLATEREF.md -->

# useTemplateRef

## What / Why

Vue 3.5+ helper for named template refs with better type inference.

## Mental Model

```text
const el=useTemplateRef('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useTemplateRef
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in SFCs for DOM/component refs.

## Common Mistake / Interview Trap

Value is null before mount and when unmounted.

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

> **useTemplateRef:** Vue 3.5+ helper for named template refs with better type inference.


---

<!-- 076_TELEPORT.md -->

# Teleport

## What / Why

Renders DOM into another target while keeping logical component ownership.

## Mental Model

```text
<Teleport to='body'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport
</script>

<template>
  <div>Teleport</div>
</template>
```

## When to Use

Use for modals/popovers/overlays.

## Common Mistake / Interview Trap

Teleport changes DOM location, not Vue ownership.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Teleport:** Renders DOM into another target while keeping logical component ownership.


---

<!-- 076_USEID.md -->

# useId

## What / Why

Generates stable application-unique IDs useful for accessibility/SSR.

## Mental Model

```text
const id=useId()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: useId
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for label/control relationships.

## Common Mistake / Interview Trap

Do not use as list keys.

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

> **useId:** Generates stable application-unique IDs useful for accessibility/SSR.


---

<!-- 077_KEEPALIVE.md -->

# KeepAlive

## What / Why

Caches dynamic component instances instead of destroying them.

## Mental Model

```text
<KeepAlive><component :is='view'/></KeepAlive>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive
</script>

<template>
  <div>KeepAlive</div>
</template>
```

## When to Use

Use for expensive tab/page state preservation.

## Common Mistake / Interview Trap

Cached components still consume memory/resources.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **KeepAlive:** Caches dynamic component instances instead of destroying them.


---

<!-- 077_RENDERER_TIMING.md -->

# Renderer Timing

## What / Why

Vue batches reactive updates into async DOM flush.

## Mental Model

```text
mutate state → queue → patch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Renderer Timing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use nextTick only when post-patch access is truly needed.

## Common Mistake / Interview Trap

Multiple synchronous mutations normally batch.

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

> **Renderer Timing:** Vue batches reactive updates into async DOM flush.


---

<!-- 078_COMPOSABLE_PATTERN.md -->

# Composable Pattern

## What / Why

Functions named `useX` encapsulate reusable reactive logic.

## Mental Model

```text
useMouse/useAuth/useOrders
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Pattern
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to reuse stateful logic.

## Common Mistake / Interview Trap

Each composable call can create its own state unless state is intentionally external/shared.

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

> **Composable Pattern:** Functions named `useX` encapsulate reusable reactive logic.


---

<!-- 078_SUSPENSE.md -->

# Suspense

## What / Why

Coordinates async dependencies/fallback UI.

## Mental Model

```text
<Suspense><AsyncPage/></Suspense>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Suspense
</script>

<template>
  <div>Suspense</div>
</template>
```

## When to Use

Use carefully for async components/setup.

## Common Mistake / Interview Trap

Vue Suspense remains an advanced feature; verify exact stability/support requirements.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Suspense:** Coordinates async dependencies/fallback UI.


---

<!-- 079_COMPOSABLE_INPUTS.md -->

# Composable Inputs

## What / Why

Accept MaybeRefOrGetter inputs and normalize with toValue.

## Mental Model

```text
useFeature(id)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Inputs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use flexible reactive APIs.

## Common Mistake / Interview Trap

Normalize inside reactive tracking context when you want changes observed.

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

> **Composable Inputs:** Accept MaybeRefOrGetter inputs and normalize with toValue.


---

<!-- 079_TRANSITION.md -->

# Transition

## What / Why

Applies enter/leave transitions to a single element/component.

## Mental Model

```text
<Transition>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition
</script>

<template>
  <div>Transition</div>
</template>
```

## When to Use

Use for UI animations.

## Common Mistake / Interview Trap

Transitions do not solve route/data loading.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Transition:** Applies enter/leave transitions to a single element/component.


---

<!-- 080_COMPOSABLE_CLEANUP.md -->

# Composable Cleanup

## What / Why

Register teardown with onScopeDispose/onUnmounted.

## Mental Model

```text
setup resource → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Cleanup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for subscriptions/listeners.

## Common Mistake / Interview Trap

Leaking browser listeners is a common composable bug.

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

> **Composable Cleanup:** Register teardown with onScopeDispose/onUnmounted.


---

<!-- 080_TRANSITIONGROUP.md -->

# TransitionGroup

## What / Why

Animates list insert/remove/move.

## Mental Model

```text
<TransitionGroup>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: TransitionGroup
</script>

<template>
  <div>TransitionGroup</div>
</template>
```

## When to Use

Use for keyed animated lists.

## Common Mistake / Interview Trap

Stable keys are mandatory.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **TransitionGroup:** Animates list insert/remove/move.


---

<!-- 081_DYNAMIC_COMPONENTS.md -->

# Dynamic Components

## What / Why

Selects component at runtime.

## Mental Model

```text
<component :is='current'/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Components
</script>

<template>
  <div>Dynamic Components</div>
</template>
```

## When to Use

Use for tabs/plugins/editors.

## Common Mistake / Interview Trap

Pair with KeepAlive only when state preservation is desired.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Dynamic Components:** Selects component at runtime.


---

<!-- 081_SINGLETON_COMPOSABLE.md -->

# Singleton Composable

## What / Why

Module-scope reactive state is shared across component instances.

## Mental Model

```text
const state=ref(...) outside useX
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Singleton Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use intentionally for lightweight shared state.

## Common Mistake / Interview Trap

Can break SSR due to cross-request state leakage.

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

> **Singleton Composable:** Module-scope reactive state is shared across component instances.


---

<!-- 082_COMPOSABLE_MENTAL_MODEL.md -->

# Composable Mental Model

## What / Why

A composable is a function using Composition API to encapsulate reusable stateful logic.

## Mental Model

```text
useX() → refs/computed/actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Mental Model
</script>

<template>
  <div>Composable Mental Model</div>
</template>
```

## When to Use

Use for logic reuse across components.

## Common Mistake / Interview Trap

Each invocation usually gets its own local state unless state is declared at module scope.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable Mental Model:** A composable is a function using Composition API to encapsulate reusable stateful logic.


---

<!-- 082_FACTORY_COMPOSABLE.md -->

# Factory Composable

## What / Why

Creates isolated state per invocation.

## Mental Model

```text
function useCounter(){const n=ref(0)...}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Factory Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for instance-local reusable logic.

## Common Mistake / Interview Trap

Do not expect different callers to share state.

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

> **Factory Composable:** Creates isolated state per invocation.


---

<!-- 083_COMPOSABLE_VS_PINIA.md -->

# Composable vs Pinia

## What / Why

Composables can share logic/state; Pinia adds formal store identity, devtools, plugins, SSR patterns.

## Mental Model

```text
useX vs defineStore
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable vs Pinia
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use Pinia for app-scale shared state.

## Common Mistake / Interview Trap

Do not add a store for every tiny local concern.

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

> **Composable vs Pinia:** Composables can share logic/state; Pinia adds formal store identity, devtools, plugins, SSR patterns.


---

<!-- 083_NAMING_CONVENTION.md -->

# Naming Convention

## What / Why

Composable names conventionally begin with `use`.

## Mental Model

```text
useMouse/useAuth/useOrders
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Naming Convention
</script>

<template>
  <div>Naming Convention</div>
</template>
```

## When to Use

Use for discoverability and tooling expectations.

## Common Mistake / Interview Trap

Naming alone doesn't make ordinary utility reactive.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Naming Convention:** Composable names conventionally begin with `use`.


---

<!-- 084_INPUT_NORMALIZATION.md -->

# Input Normalization

## What / Why

Accept refs/getters/plain values where appropriate.

## Mental Model

```text
toValue(input)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Input Normalization
</script>

<template>
  <div>Input Normalization</div>
</template>
```

## When to Use

Use for reusable flexible composables.

## Common Mistake / Interview Trap

Document whether composable tracks getter/ref changes.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Input Normalization:** Accept refs/getters/plain values where appropriate.


---

<!-- 084_RENDERLESS_COMPONENT.md -->

# Renderless Component

## What / Why

Uses slots to expose logic without UI.

## Mental Model

```text
slot props
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Renderless Component
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know as older reuse pattern.

## Common Mistake / Interview Trap

Composables usually provide simpler logic reuse today.

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

> **Renderless Component:** Uses slots to expose logic without UI.


---

<!-- 085_MIXIN_LEGACY.md -->

# Mixin Legacy

## What / Why

Mixins merge component options from multiple sources.

## Mental Model

```text
mixins:[...]
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Mixin Legacy
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know for legacy Vue 2/early Vue 3.

## Common Mistake / Interview Trap

Composition API/composables avoid naming/source ambiguity.

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

> **Mixin Legacy:** Mixins merge component options from multiple sources.


---

<!-- 085_RETURN_REFS.md -->

# Return Refs

## What / Why

Return refs or a reactive object while preserving destructuring semantics.

## Mental Model

```text
return {x,y}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Return Refs
</script>

<template>
  <div>Return Refs</div>
</template>
```

## When to Use

Use explicit APIs.

## Common Mistake / Interview Trap

Returning a reactive object then destructuring can lose reactivity.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Return Refs:** Return refs or a reactive object while preserving destructuring semantics.


---

<!-- 086_CLEANUP.md -->

# Cleanup

## What / Why

Use onScopeDispose/onUnmounted/watch cleanup.

## Mental Model

```text
setup → resource → cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Cleanup
</script>

<template>
  <div>Cleanup</div>
</template>
```

## When to Use

Every external resource needs lifecycle ownership.

## Common Mistake / Interview Trap

Composable leaks are still memory leaks.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Cleanup:** Use onScopeDispose/onUnmounted/watch cleanup.


---

<!-- 086_V_TEXT.md -->

# v-text

## What / Why

Sets textContent.

## Mental Model

```text
v-text='msg'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-text
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use rarely; interpolation is often clearer.

## Common Mistake / Interview Trap

Escapes content.

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

> **v-text:** Sets textContent.


---

<!-- 087_SHARED_COMPOSABLE_STATE.md -->

# Shared Composable State

## What / Why

State at module scope creates shared singleton state.

## Mental Model

```text
const global = ref(0) outside useX
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Shared Composable State
</script>

<template>
  <div>Shared Composable State</div>
</template>
```

## When to Use

Use intentionally for SPA-global state.

## Common Mistake / Interview Trap

Unsafe across SSR requests unless instantiated per request.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Shared Composable State:** State at module scope creates shared singleton state.


---

<!-- 087_V_HTML.md -->

# v-html

## What / Why

Sets raw innerHTML.

## Mental Model

```text
v-html='html'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-html
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only with trusted/sanitized HTML.

## Common Mistake / Interview Trap

Major XSS risk.

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

> **v-html:** Sets raw innerHTML.


---

<!-- 088_COMPOSABLE_ERROR_HANDLING.md -->

# Composable Error Handling

## What / Why

Expose error/status/retry instead of swallowing failures.

## Mental Model

```text
{data,error,pending,retry}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Error Handling
</script>

<template>
  <div>Composable Error Handling</div>
</template>
```

## When to Use

Use predictable async contracts.

## Common Mistake / Interview Trap

Silent catches make UI impossible to reason about.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable Error Handling:** Expose error/status/retry instead of swallowing failures.


---

<!-- 088_V_BIND.md -->

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


---

<!-- 089_COMPOSABLE_VS_STORE.md -->

# Composable vs Store

## What / Why

Composable is reusable logic; store owns shared application state/conventions.

## Mental Model

```text
useFeature() vs Pinia store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable vs Store
</script>

<template>
  <div>Composable vs Store</div>
</template>
```

## When to Use

Use simplest suitable abstraction.

## Common Mistake / Interview Trap

Not every composable should become a global store.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable vs Store:** Composable is reusable logic; store owns shared application state/conventions.


---

<!-- 089_V_ON.md -->

# v-on

## What / Why

Binds events.

## Mental Model

```text
v-on='listeners'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-on
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use normal event syntax for clarity.

## Common Mistake / Interview Trap

Event modifiers affect behavior/order.

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

> **v-on:** Binds events.


---

<!-- 090_COMPOSABLE_VS_SERVICE.md -->

# Composable vs Service

## What / Why

Vue composables often replace framework-service style abstractions for UI concerns.

## Mental Model

```text
useApi/useFeature
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable vs Service
</script>

<template>
  <div>Composable vs Service</div>
</template>
```

## When to Use

Use plain classes/modules when reactivity isn't needed.

## Common Mistake / Interview Trap

Do not force every utility through Vue APIs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable vs Service:** Vue composables often replace framework-service style abstractions for UI concerns.


---

<!-- 090_V_IF_VS_V_SHOW.md -->

# v-if vs v-show

## What / Why

v-if mounts/unmounts; v-show toggles CSS display.

## Mental Model

```text
branch creation vs visibility toggle
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-if vs v-show
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose based on toggle frequency and mount cost.

## Common Mistake / Interview Trap

Do not optimize prematurely.

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

> **v-if vs v-show:** v-if mounts/unmounts; v-show toggles CSS display.


---

<!-- 091_VUE_ROUTER.md -->

# Vue Router

## What / Why

Official router for Vue.

## Mental Model

```text
URL → route record → component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Router
</script>

<template>
  <div>Vue Router</div>
</template>
```

## When to Use

Use for SPA navigation.

## Common Mistake / Interview Trap

Use Vue Router 4 with Vue 3.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue Router:** Official router for Vue.


---

<!-- 091_V_FOR.md -->

# v-for

## What / Why

Iterates over arrays/objects/ranges.

## Mental Model

```text
v-for='item in items' :key='item.id'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-for
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use stable keys.

## Common Mistake / Interview Trap

Avoid v-if on same element when filtered computed data is clearer.

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

> **v-for:** Iterates over arrays/objects/ranges.


---

<!-- 092_CREATEROUTER.md -->

# createRouter

## What / Why

Creates router instance.

## Mental Model

```text
createRouter({history,routes})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: createRouter
</script>

<template>
  <div>createRouter</div>
</template>
```

## When to Use

Use one router per app.

## Common Mistake / Interview Trap

Router must be installed with app.use(router).

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **createRouter:** Creates router instance.


---

<!-- 092_V_MODEL.md -->

# v-model

## What / Why

Two-way binding for form elements/components.

## Mental Model

```text
v-model='name'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for form-like state.

## Common Mistake / Interview Trap

Understand modifiers and component contract.

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

> **v-model:** Two-way binding for form elements/components.


---

<!-- 093_HISTORY_MODES.md -->

# History Modes

## What / Why

Web, hash, and memory history modes.

## Mental Model

```text
createWebHistory / createWebHashHistory / createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: History Modes
</script>

<template>
  <div>History Modes</div>
</template>
```

## When to Use

Choose based on hosting/SSR environment.

## Common Mistake / Interview Trap

Web history requires server fallback configuration.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **History Modes:** Web, hash, and memory history modes.


---

<!-- 093_V_SLOT.md -->

# v-slot

## What / Why

Declares named/scoped slot content.

## Mental Model

```text
#header='{title}'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-slot
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for flexible component APIs.

## Common Mistake / Interview Trap

Avoid slot APIs exposing too much internal implementation.

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

> **v-slot:** Declares named/scoped slot content.


---

<!-- 094_ROUTES.md -->

# Routes

## What / Why

Map paths to components and metadata.

## Mental Model

```text
{path:'/users/:id',component:User}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Routes
</script>

<template>
  <div>Routes</div>
</template>
```

## When to Use

Organize by feature boundaries.

## Common Mistake / Interview Trap

Avoid giant unstructured route tables.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Routes:** Map paths to components and metadata.


---

<!-- 094_V_PRE.md -->

# v-pre

## What / Why

Skips compilation for subtree.

## Mental Model

```text
v-pre
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-pre
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for literal mustache/template demos.

## Common Mistake / Interview Trap

Rare in normal apps.

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

> **v-pre:** Skips compilation for subtree.


---

<!-- 095_ROUTERLINK.md -->

# RouterLink

## What / Why

Declarative navigation component.

## Mental Model

```text
<RouterLink to='/users'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: RouterLink
</script>

<template>
  <div>RouterLink</div>
</template>
```

## When to Use

Use instead of plain anchor for internal SPA navigation.

## Common Mistake / Interview Trap

Plain anchors trigger full page load.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **RouterLink:** Declarative navigation component.


---

<!-- 095_V_ONCE.md -->

# v-once

## What / Why

Renders subtree once and skips future updates.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-once
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for truly static runtime content.

## Common Mistake / Interview Trap

Wrong use creates stale UI.

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

> **v-once:** Renders subtree once and skips future updates.


---

<!-- 096_ROUTERVIEW.md -->

# RouterView

## What / Why

Renders matched route component.

## Mental Model

```text
<RouterView/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: RouterView
</script>

<template>
  <div>RouterView</div>
</template>
```

## When to Use

Use in app/layout shells.

## Common Mistake / Interview Trap

Nested views correspond to nested route records.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **RouterView:** Renders matched route component.


---

<!-- 096_V_MEMO.md -->

# v-memo

## What / Why

Conditionally skips subtree updates until dependency array changes.

## Mental Model

```text
v-memo='[valueA,valueB]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-memo
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only for measured performance cases.

## Common Mistake / Interview Trap

Compiler/runtime already optimizes many templates.

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

> **v-memo:** Conditionally skips subtree updates until dependency array changes.


---

<!-- 097_CUSTOM_DIRECTIVES.md -->

# Custom Directives

## What / Why

Encapsulate low-level DOM behavior.

## Mental Model

```text
v-focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Directives
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for DOM concerns not suited to components/composables alone.

## Common Mistake / Interview Trap

Directive hooks should avoid owning business state.

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

> **Custom Directives:** Encapsulate low-level DOM behavior.


---

<!-- 097_DYNAMIC_PARAMS.md -->

# Dynamic Params

## What / Why

Path variables such as `/users/:id`.

## Mental Model

```text
route.params.id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Params
</script>

<template>
  <div>Dynamic Params</div>
</template>
```

## When to Use

Use for resource identity.

## Common Mistake / Interview Trap

Component can be reused when param changes; watch it rather than assume remount.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Dynamic Params:** Path variables such as `/users/:id`.


---

<!-- 098_QUERY_PARAMS.md -->

# Query Params

## What / Why

Shareable filter/navigation state.

## Mental Model

```text
route.query.page
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Query Params
</script>

<template>
  <div>Query Params</div>
</template>
```

## When to Use

Use for search/filter/page.

## Common Mistake / Interview Trap

Do not store secrets.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Query Params:** Shareable filter/navigation state.


---

<!-- 098_SUSPENSE.md -->

# Suspense

## What / Why

Coordinates async dependencies with fallback/content.

## Mental Model

```text
<Suspense><Async/></Suspense>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Suspense
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for async setup/async components where appropriate.

## Common Mistake / Interview Trap

Vue Suspense has had experimental status historically; verify exact support expectations in your framework/version.

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

> **Suspense:** Coordinates async dependencies with fallback/content.


---

<!-- 099_ASYNC_COMPONENTS.md -->

# Async Components

## What / Why

Lazy-load component definition.

## Mental Model

```text
defineAsyncComponent(()=>import(...))
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for feature/widget code splitting.

## Common Mistake / Interview Trap

Handle loading/error/timeout when user-visible.

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

> **Async Components:** Lazy-load component definition.


---

<!-- 099_NAMED_ROUTES.md -->

# Named Routes

## What / Why

Navigate by route name + params.

## Mental Model

```text
router.push({name:'user',params:{id}})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Named Routes
</script>

<template>
  <div>Named Routes</div>
</template>
```

## When to Use

Use to decouple callers from path strings.

## Common Mistake / Interview Trap

Names must remain unique.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Named Routes:** Navigate by route name + params.


---

<!-- 100_LAZY_HYDRATION.md -->

# Lazy Hydration

## What / Why

Vue 3.5+ async components can hydrate on idle/visible/media/interaction.

## Mental Model

```text
hydrateOnVisible() etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with SSR to reduce initial hydration work.

## Common Mistake / Interview Trap

It applies to SSR hydration strategies, not ordinary CSR loading.

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

> **Lazy Hydration:** Vue 3.5+ async components can hydrate on idle/visible/media/interaction.


---

<!-- 100_NESTED_ROUTES.md -->

# Nested Routes

## What / Why

Route records can nest layouts/children.

## Mental Model

```text
parent → child routes
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Nested Routes
</script>

<template>
  <div>Nested Routes</div>
</template>
```

## When to Use

Use for feature/layout hierarchy.

## Common Mistake / Interview Trap

Avoid overly deep nesting.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Nested Routes:** Route records can nest layouts/children.


---

<!-- 101_LAZY_ROUTES.md -->

# Lazy Routes

## What / Why

Route component loaded with dynamic import.

## Mental Model

```text
component:()=>import('./User.vue')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lazy Routes
</script>

<template>
  <div>Lazy Routes</div>
</template>
```

## When to Use

Use to split large features.

## Common Mistake / Interview Trap

Chunking strategy still matters.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Lazy Routes:** Route component loaded with dynamic import.


---

<!-- 101_NATIVE_V_MODEL.md -->

# Native v-model

## What / Why

Binds inputs/selects/textarea to reactive state.

## Mental Model

```text
<input v-model='name'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Native v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for simple form fields.

## Common Mistake / Interview Trap

Checkbox/select semantics differ by element type.

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

> **Native v-model:** Binds inputs/selects/textarea to reactive state.


---

<!-- 102_NAVIGATION_GUARDS.md -->

# Navigation Guards

## What / Why

beforeEach/beforeEnter/in-component guards control navigation.

## Mental Model

```text
guard → allow/redirect/cancel
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Navigation Guards
</script>

<template>
  <div>Navigation Guards</div>
</template>
```

## When to Use

Use for navigation policy/data safety.

## Common Mistake / Interview Trap

Guards are not backend authorization.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Navigation Guards:** beforeEach/beforeEnter/in-component guards control navigation.


---

<!-- 102_V_MODEL_LAZY.md -->

# v-model lazy

## What / Why

Updates on change rather than input.

## Mental Model

```text
.lazy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model lazy
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when per-keystroke updates are unnecessary.

## Common Mistake / Interview Trap

Changes UX/validation timing.

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

> **v-model lazy:** Updates on change rather than input.


---

<!-- 103_ROUTE_META.md -->

# Route Meta

## What / Why

Attach metadata to routes.

## Mental Model

```text
meta:{requiresAuth:true}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Route Meta
</script>

<template>
  <div>Route Meta</div>
</template>
```

## When to Use

Use for layout/auth/breadcrumb policy.

## Common Mistake / Interview Trap

Keep domain state out of meta.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Route Meta:** Attach metadata to routes.


---

<!-- 103_V_MODEL_NUMBER.md -->

# v-model number

## What / Why

Coerces input using number semantics.

## Mental Model

```text
.number
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model number
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for numeric state.

## Common Mistake / Interview Trap

Empty input/coercion edge cases need validation.

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

> **v-model number:** Coerces input using number semantics.


---

<!-- 104_SCROLL_BEHAVIOR.md -->

# Scroll Behavior

## What / Why

Controls scroll on navigation.

## Mental Model

```text
scrollBehavior(to,from,saved)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Scroll Behavior
</script>

<template>
  <div>Scroll Behavior</div>
</template>
```

## When to Use

Use for SPA UX.

## Common Mistake / Interview Trap

Account for back/forward restoration.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Scroll Behavior:** Controls scroll on navigation.


---

<!-- 104_V_MODEL_TRIM.md -->

# v-model trim

## What / Why

Trims string input.

## Mental Model

```text
.trim
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model trim
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for basic normalization.

## Common Mistake / Interview Trap

Do not treat normalization as full validation.

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

> **v-model trim:** Trims string input.


---

<!-- 105_FORM_VALIDATION.md -->

# Form Validation

## What / Why

Model field/field-group validation explicitly.

## Mental Model

```text
state + errors + submit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Form Validation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use native constraints, schema libs, or custom validation.

## Common Mistake / Interview Trap

Client validation is not security.

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

> **Form Validation:** Model field/field-group validation explicitly.


---

<!-- 105_ROUTER_ERROR_HANDLING.md -->

# Router Error Handling

## What / Why

Capture navigation/lazy-load failures.

## Mental Model

```text
router.onError
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Router Error Handling
</script>

<template>
  <div>Router Error Handling</div>
</template>
```

## When to Use

Use for observability and chunk-reload strategies.

## Common Mistake / Interview Trap

Avoid infinite reload loops.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Router Error Handling:** Capture navigation/lazy-load failures.


---

<!-- 106_ASYNC_VALIDATION.md -->

# Async Validation

## What / Why

Validates with server/async source.

## Mental Model

```text
watch/debounce/cancel
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Validation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use cancellation/stale-result protection.

## Common Mistake / Interview Trap

Race conditions can show outdated validation.

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

> **Async Validation:** Validates with server/async source.


---

<!-- 106_TYPED_ROUTES_AWARENESS.md -->

# Typed Routes Awareness

## What / Why

Modern router ecosystem supports stronger route typing patterns/tooling.

## Mental Model

```text
typed route names/params
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typed Routes Awareness
</script>

<template>
  <div>Typed Routes Awareness</div>
</template>
```

## When to Use

Use when project tooling supports it.

## Common Mistake / Interview Trap

Verify exact router/tooling version before implementation.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Typed Routes Awareness:** Modern router ecosystem supports stronger route typing patterns/tooling.


---

<!-- 107_CUSTOM_INPUT_V_MODEL.md -->

# Custom Input v-model

## What / Why

Child component uses defineModel or modelValue/update:modelValue contract.

## Mental Model

```text
defineModel()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Input v-model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable controls.

## Common Mistake / Interview Trap

Model default mismatch can desynchronize state.

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

> **Custom Input v-model:** Child component uses defineModel or modelValue/update:modelValue contract.


---

<!-- 107_STATE_OWNERSHIP.md -->

# State Ownership

## What / Why

Every state value should have one owner/source of truth.

## Mental Model

```text
local ref / URL / server / Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: State Ownership
</script>

<template>
  <div>State Ownership</div>
</template>
```

## When to Use

Decide ownership before selecting a library.

## Common Mistake / Interview Trap

Duplicated state creates synchronization bugs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **State Ownership:** Every state value should have one owner/source of truth.


---

<!-- 108_FORM_SUBMISSION.md -->

# Form Submission

## What / Why

Prevent accidental duplicate work and show pending/errors.

## Mental Model

```text
submit → pending → result
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Form Submission
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use idempotency for high-risk operations.

## Common Mistake / Interview Trap

Disabled button alone is not backend protection.

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

> **Form Submission:** Prevent accidental duplicate work and show pending/errors.


---

<!-- 108_LOCAL_COMPONENT_STATE.md -->

# Local Component State

## What / Why

Use ref/reactive inside component/composable.

## Mental Model

```text
ref/reactive
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Local Component State
</script>

<template>
  <div>Local Component State</div>
</template>
```

## When to Use

Default for local interaction state.

## Common Mistake / Interview Trap

Do not globalize state prematurely.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Local Component State:** Use ref/reactive inside component/composable.


---

<!-- 109_FILE_INPUTS.md -->

# File Inputs

## What / Why

Use File APIs/FormData; file value is not normally controlled like text input.

## Mental Model

```text
input type=file
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: File Inputs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use explicit upload workflow.

## Common Mistake / Interview Trap

Validate type/size server-side.

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

> **File Inputs:** Use File APIs/FormData; file value is not normally controlled like text input.


---

<!-- 109_LIFTED_STATE.md -->

# Lifted State

## What / Why

Move shared state to common owner.

## Mental Model

```text
parent → props/emits
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lifted State
</script>

<template>
  <div>Lifted State</div>
</template>
```

## When to Use

Use for nearby sibling coordination.

## Common Mistake / Interview Trap

Deep prop drilling can justify provide/inject/store.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Lifted State:** Move shared state to common owner.


---

<!-- 110_SIMPLE_SHARED_REACTIVE_STORE.md -->

# Simple Shared Reactive Store

## What / Why

A module-level reactive object can be a small SPA store.

## Mental Model

```text
export const store=reactive(...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Simple Shared Reactive Store
</script>

<template>
  <div>Simple Shared Reactive Store</div>
</template>
```

## When to Use

Use only for simple client-only applications.

## Common Mistake / Interview Trap

SSR singleton state can leak between requests.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Simple Shared Reactive Store:** A module-level reactive object can be a small SPA store.


---

<!-- 110_VUE_ROUTER_MENTAL_MODEL.md -->

# Vue Router Mental Model

## What / Why

URL matches route records, guards/loaders run, route components render in RouterView.

## Mental Model

```text
URL → route match → guards/data → view
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Router Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use Vue Router for SPA routing.

## Common Mistake / Interview Trap

Do not manually reimplement history/navigation.

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

> **Vue Router Mental Model:** URL matches route records, guards/loaders run, route components render in RouterView.


---

<!-- 111_CREATEROUTER.md -->

# createRouter

## What / Why

Creates router with history and routes.

## Mental Model

```text
createRouter({history,routes})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: createRouter
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in app bootstrap.

## Common Mistake / Interview Trap

Choose correct history strategy for hosting environment.

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

> **createRouter:** Creates router with history and routes.


---

<!-- 111_PINIA.md -->

# Pinia

## What / Why

Vue's recommended large-scale shared state library.

## Mental Model

```text
defineStore → state/getters/actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia
</script>

<template>
  <div>Pinia</div>
</template>
```

## When to Use

Use for larger shared state, DevTools, plugins, SSR and conventions.

## Common Mistake / Interview Trap

Do not use a global store for every form field.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia:** Vue's recommended large-scale shared state library.


---

<!-- 112_CREATEWEBHISTORY.md -->

# createWebHistory

## What / Why

Uses HTML5 history.

## Mental Model

```text
clean URLs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: createWebHistory
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when server fallback is configured.

## Common Mistake / Interview Trap

Direct refresh needs server to return app entry.

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

> **createWebHistory:** Uses HTML5 history.


---

<!-- 112_PINIA_OPTION_STORE.md -->

# Pinia Option Store

## What / Why

Defines state/getters/actions object-style.

## Mental Model

```text
defineStore('x',{state,getters,actions})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Option Store
</script>

<template>
  <div>Pinia Option Store</div>
</template>
```

## When to Use

Use when team prefers explicit store sections.

## Common Mistake / Interview Trap

Avoid destructuring state directly without storeToRefs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Option Store:** Defines state/getters/actions object-style.


---

<!-- 113_CREATEWEBHASHHISTORY.md -->

# createWebHashHistory

## What / Why

Uses URL hash.

## Mental Model

```text
/#/users
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: createWebHashHistory
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when server rewrite control is unavailable.

## Common Mistake / Interview Trap

Less clean URLs.

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

> **createWebHashHistory:** Uses URL hash.


---

<!-- 113_PINIA_SETUP_STORE.md -->

# Pinia Setup Store

## What / Why

Defines store using Composition API style.

## Mental Model

```text
defineStore('x',()=>{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Setup Store
</script>

<template>
  <div>Pinia Setup Store</div>
</template>
```

## When to Use

Use for composable-like flexibility.

## Common Mistake / Interview Trap

Return all state needed by SSR/devtools/plugins.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Setup Store:** Defines store using Composition API style.


---

<!-- 114_ROUTERVIEW.md -->

# RouterView

## What / Why

Renders matched route component.

## Mental Model

```text
<RouterView/>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: RouterView
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use layouts/nested routes.

## Common Mistake / Interview Trap

Nested views need clear route record structure.

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

> **RouterView:** Renders matched route component.


---

<!-- 114_STORETOREFS.md -->

# storeToRefs

## What / Why

Extracts reactive state/getters from Pinia store.

## Mental Model

```text
const {count}=storeToRefs(store)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: storeToRefs
</script>

<template>
  <div>storeToRefs</div>
</template>
```

## When to Use

Use when destructuring store state.

## Common Mistake / Interview Trap

Actions can be destructured directly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **storeToRefs:** Extracts reactive state/getters from Pinia store.


---

<!-- 115_PINIA_ACTIONS.md -->

# Pinia Actions

## What / Why

Methods that mutate state and may be async.

## Mental Model

```text
store.save()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Actions
</script>

<template>
  <div>Pinia Actions</div>
</template>
```

## When to Use

Use for business-intent state transitions.

## Common Mistake / Interview Trap

Keep API/domain boundaries clear.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Actions:** Methods that mutate state and may be async.


---

<!-- 115_ROUTERLINK.md -->

# RouterLink

## What / Why

Declarative navigation.

## Mental Model

```text
<RouterLink :to='...'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: RouterLink
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for accessible SPA navigation.

## Common Mistake / Interview Trap

Prefer over click+router.push for ordinary links.

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

> **RouterLink:** Declarative navigation.


---

<!-- 116_PINIA_GETTERS.md -->

# Pinia Getters

## What / Why

Derived store state.

## Mental Model

```text
doubleCount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Getters
</script>

<template>
  <div>Pinia Getters</div>
</template>
```

## When to Use

Use for reusable derivations.

## Common Mistake / Interview Trap

Simple one-off derivation can remain computed locally.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Getters:** Derived store state.


---

<!-- 116_ROUTE_PARAMS.md -->

# Route Params

## What / Why

Dynamic path identity.

## Mental Model

```text
:id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Route Params
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for resource routes.

## Common Mistake / Interview Trap

React to param changes when same component instance is reused.

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

> **Route Params:** Dynamic path identity.


---

<!-- 117_PINIA_PLUGINS.md -->

# Pinia Plugins

## What / Why

Extend stores with cross-cutting behavior.

## Mental Model

```text
pinia.use(plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Plugins
</script>

<template>
  <div>Pinia Plugins</div>
</template>
```

## When to Use

Use for persistence/telemetry carefully.

## Common Mistake / Interview Trap

Plugins run across stores and can create hidden behavior.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Plugins:** Extend stores with cross-cutting behavior.


---

<!-- 117_QUERY_PARAMS.md -->

# Query Params

## What / Why

Optional/shareable filters and UI state.

## Mental Model

```text
?page=2
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Query Params
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for shareable navigation state.

## Common Mistake / Interview Trap

Do not store secrets.

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

> **Query Params:** Optional/shareable filters and UI state.


---

<!-- 118_NAMED_ROUTES.md -->

# Named Routes

## What / Why

Navigates by route name and params.

## Mental Model

```text
{name:'user',params:{id}}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Named Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to decouple callers from path strings.

## Common Mistake / Interview Trap

Route names become contracts.

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

> **Named Routes:** Navigates by route name and params.


---

<!-- 118_PINIA_SSR.md -->

# Pinia SSR

## What / Why

Create Pinia/app state per request and safely hydrate.

## Mental Model

```text
request → fresh app + fresh pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia SSR
</script>

<template>
  <div>Pinia SSR</div>
</template>
```

## When to Use

Use in SSR frameworks.

## Common Mistake / Interview Trap

Never share mutable singleton store across users.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia SSR:** Create Pinia/app state per request and safely hydrate.


---

<!-- 119_NESTED_ROUTES.md -->

# Nested Routes

## What / Why

Child routes render inside parent view.

## Mental Model

```text
/users/:id/profile
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Nested Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for hierarchical layouts.

## Common Mistake / Interview Trap

Avoid overly deep route trees.

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

> **Nested Routes:** Child routes render inside parent view.


---

<!-- 119_VUEX_LEGACY.md -->

# Vuex Legacy

## What / Why

Vuex is the previous official state library and is in maintenance mode.

## Mental Model

```text
Vuex → Pinia migration
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vuex Legacy
</script>

<template>
  <div>Vuex Legacy</div>
</template>
```

## When to Use

Know for enterprise maintenance.

## Common Mistake / Interview Trap

Use Pinia for new applications.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vuex Legacy:** Vuex is the previous official state library and is in maintenance mode.


---

<!-- 120_FETCH_API_PATTERN.md -->

# Fetch API Pattern

## What / Why

Vue has no mandatory HTTP client; use fetch/axios/framework tools.

## Mental Model

```text
fetch → ref state
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Fetch API Pattern
</script>

<template>
  <div>Fetch API Pattern</div>
</template>
```

## When to Use

Use plain fetch for simple needs.

## Common Mistake / Interview Trap

Handle abort/error/loading explicitly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Fetch API Pattern:** Vue has no mandatory HTTP client; use fetch/axios/framework tools.


---

<!-- 120_LAZY_ROUTES.md -->

# Lazy Routes

## What / Why

Dynamic import route components.

## Mental Model

```text
component:()=>import('./User.vue')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Routes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to split route code.

## Common Mistake / Interview Trap

Chunk strategy matters for many tiny routes.

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

> **Lazy Routes:** Dynamic import route components.


---

<!-- 121_ASYNC_COMPOSABLE.md -->

# Async Composable

## What / Why

Wrap request state in a composable.

## Mental Model

```text
{data,error,pending,refresh}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Composable
</script>

<template>
  <div>Async Composable</div>
</template>
```

## When to Use

Use for repeated client data patterns.

## Common Mistake / Interview Trap

Avoid duplicated fetching side effects across components.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Async Composable:** Wrap request state in a composable.


---

<!-- 121_NAVIGATION_GUARDS.md -->

# Navigation Guards

## What / Why

Global/per-route/in-component guards can redirect/cancel navigation.

## Mental Model

```text
beforeEach
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Navigation Guards
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for UX/navigation rules.

## Common Mistake / Interview Trap

Backend must enforce authorization.

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

> **Navigation Guards:** Global/per-route/in-component guards can redirect/cancel navigation.


---

<!-- 122_ABORTCONTROLLER.md -->

# AbortController

## What / Why

Cancel stale fetches.

## Mental Model

```text
controller.abort()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: AbortController
</script>

<template>
  <div>AbortController</div>
</template>
```

## When to Use

Use with watchers/search/navigation.

## Common Mistake / Interview Trap

Cancellation is especially important for latest-only workflows.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **AbortController:** Cancel stale fetches.


---

<!-- 122_ROUTE_META.md -->

# Route Meta

## What / Why

Attaches metadata to route records.

## Mental Model

```text
meta.requiresAuth
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Route Meta
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for titles/roles/layout hints.

## Common Mistake / Interview Trap

Treat meta as client-side policy hints.

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

> **Route Meta:** Attaches metadata to route records.


---

<!-- 123_SCROLL_BEHAVIOR.md -->

# Scroll Behavior

## What / Why

Controls position after navigation.

## Mental Model

```text
scrollBehavior
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Scroll Behavior
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for SPA navigation UX.

## Common Mistake / Interview Trap

Browser/history behavior should be tested.

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

> **Scroll Behavior:** Controls position after navigation.


---

<!-- 123_WATCHER_FETCHING.md -->

# Watcher Fetching

## What / Why

Watch reactive parameter and fetch on change.

## Mental Model

```text
watch(id,fetchUser,{immediate:true})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Watcher Fetching
</script>

<template>
  <div>Watcher Fetching</div>
</template>
```

## When to Use

Use for client-driven parameterized requests.

## Common Mistake / Interview Trap

Use cleanup to prevent stale responses.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Watcher Fetching:** Watch reactive parameter and fetch on change.


---

<!-- 124_DATA_FETCHING_AFTER_NAVIGATION.md -->

# Data Fetching After Navigation

## What / Why

Navigate first, fetch in component.

## Mental Model

```text
route → component → loading → data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Fetching After Navigation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when immediate page shell/loading UX is desired.

## Common Mistake / Interview Trap

Handle param-change cancellation/races.

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

> **Data Fetching After Navigation:** Navigate first, fetch in component.


---

<!-- 124_PARALLEL_REQUESTS.md -->

# Parallel Requests

## What / Why

Start independent requests together.

## Mental Model

```text
Promise.all
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Parallel Requests
</script>

<template>
  <div>Parallel Requests</div>
</template>
```

## When to Use

Use to avoid waterfalls.

## Common Mistake / Interview Trap

One failure behavior should be designed intentionally.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Parallel Requests:** Start independent requests together.


---

<!-- 125_DATA_FETCHING_BEFORE_NAVIGATION.md -->

# Data Fetching Before Navigation

## What / Why

Fetch/resolve before completing navigation.

## Mental Model

```text
route → fetch → render
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Fetching Before Navigation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when data is required before page display.

## Common Mistake / Interview Trap

Navigation can feel blocked without progress indication.

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

> **Data Fetching Before Navigation:** Fetch/resolve before completing navigation.


---

<!-- 125_SERVER_STATE_VS_CLIENT_STATE.md -->

# Server State vs Client State

## What / Why

Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.

## Mental Model

```text
server data ≠ Pinia-by-default
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Server State vs Client State
</script>

<template>
  <div>Server State vs Client State</div>
</template>
```

## When to Use

Use query/framework caches when appropriate.

## Common Mistake / Interview Trap

Do not mirror every response into a global store.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Server State vs Client State:** Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.


---

<!-- 126_DATA_LOADERS_EXPERIMENTAL.md -->

# Data Loaders Experimental

## What / Why

Vue Router's Data Loaders API provides navigation-aware parallel/deduped fetching but is under experimental namespace.

## Mental Model

```text
DataLoaderPlugin / defineBasicLoader
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Data Loaders Experimental
// Use the concrete API described above in real code.
</script>
```

## When to Use

Explore carefully or via supporting libraries/frameworks.

## Common Mistake / Interview Trap

Do not present current experimental API as long-term stable core contract.

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

> **Data Loaders Experimental:** Vue Router's Data Loaders API provides navigation-aware parallel/deduped fetching but is under experimental namespace.


---

<!-- 126_LOADING_ERROR_EMPTY_STATES.md -->

# Loading Error Empty States

## What / Why

Every async view needs explicit state.

## Mental Model

```text
pending/error/empty/success
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Loading Error Empty States
</script>

<template>
  <div>Loading Error Empty States</div>
</template>
```

## When to Use

Use in all production async UI.

## Common Mistake / Interview Trap

Spinner-only UX is incomplete.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Loading Error Empty States:** Every async view needs explicit state.


---

<!-- 127_OPTIMISTIC_UPDATES.md -->

# Optimistic Updates

## What / Why

Update UI before server confirmation and reconcile failure.

## Mental Model

```text
optimistic state → request → rollback/reconcile
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Optimistic Updates
</script>

<template>
  <div>Optimistic Updates</div>
</template>
```

## When to Use

Use for reversible common-success mutations.

## Common Mistake / Interview Trap

Avoid for irreversible/high-risk actions without safeguards.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Optimistic Updates:** Update UI before server confirmation and reconcile failure.


---

<!-- 127_PINIA_MENTAL_MODEL.md -->

# Pinia Mental Model

## What / Why

Pinia stores provide named shared state, getters, actions, devtools/plugins, and SSR patterns.

## Mental Model

```text
Component → Store → State/Getters/Actions
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for app/feature shared state.

## Common Mistake / Interview Trap

Do not move every local ref into Pinia.

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

> **Pinia Mental Model:** Pinia stores provide named shared state, getters, actions, devtools/plugins, and SSR patterns.


---

<!-- 128_DEFINESTORE_OPTIONS_STORE.md -->

# defineStore Options Store

## What / Why

Defines state/getters/actions object style.

## Mental Model

```text
defineStore('id',{state,getters,actions})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineStore Options Store
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when team prefers explicit store sections.

## Common Mistake / Interview Trap

Actions using this should use normal functions.

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

> **defineStore Options Store:** Defines state/getters/actions object style.


---

<!-- 128_RETRY_STRATEGY.md -->

# Retry Strategy

## What / Why

Retry only transient safe operations with limits/backoff.

## Mental Model

```text
attempt → backoff → retry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Retry Strategy
</script>

<template>
  <div>Retry Strategy</div>
</template>
```

## When to Use

Use deliberately.

## Common Mistake / Interview Trap

Blind retries can duplicate mutations or overload services.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Retry Strategy:** Retry only transient safe operations with limits/backoff.


---

<!-- 129_DEFINESTORE_SETUP_STORE.md -->

# defineStore Setup Store

## What / Why

Defines store using Composition API refs/computed/functions.

## Mental Model

```text
defineStore('id',()=>{...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: defineStore Setup Store
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for composable-style store logic.

## Common Mistake / Interview Trap

All state should be exposed appropriately for SSR/devtools.

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

> **defineStore Setup Store:** Defines store using Composition API refs/computed/functions.


---

<!-- 129_VUE_SSR.md -->

# Vue SSR

## What / Why

Vue can render components to HTML on the server.

## Mental Model

```text
createSSRApp → renderToString
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue SSR
</script>

<template>
  <div>Vue SSR</div>
</template>
```

## When to Use

Use through a framework for full applications when practical.

## Common Mistake / Interview Trap

SSR adds request isolation and hydration constraints.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue SSR:** Vue can render components to HTML on the server.


---

<!-- 130_HYDRATION.md -->

# Hydration

## What / Why

Client attaches Vue behavior to server-rendered HTML.

## Mental Model

```text
SSR HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Hydration
</script>

<template>
  <div>Hydration</div>
</template>
```

## When to Use

Use deterministic initial output.

## Common Mistake / Interview Trap

Server/client mismatches cause hydration warnings/repair.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Hydration:** Client attaches Vue behavior to server-rendered HTML.


---

<!-- 130_PINIA_STATE.md -->

# Pinia State

## What / Why

State function creates initial store state.

## Mental Model

```text
state:()=>({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia State
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed initial state.

## Common Mistake / Interview Trap

Declare all intended state properties.

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

> **Pinia State:** State function creates initial store state.


---

<!-- 131_PINIA_GETTERS.md -->

# Pinia Getters

## What / Why

Computed values over store state.

## Mental Model

```text
getters:{doubleCount:s=>s.count*2}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Getters
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for derived store state.

## Common Mistake / Interview Trap

Avoid side effects.

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

> **Pinia Getters:** Computed values over store state.


---

<!-- 131_SSR_STATE_ISOLATION.md -->

# SSR State Isolation

## What / Why

Create app/router/store per request.

## Mental Model

```text
request → fresh instances
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: SSR State Isolation
</script>

<template>
  <div>SSR State Isolation</div>
</template>
```

## When to Use

Required for multi-user SSR.

## Common Mistake / Interview Trap

Module-level singleton state can leak user data.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **SSR State Isolation:** Create app/router/store per request.


---

<!-- 132_BROWSER_ONLY_APIS.md -->

# Browser-Only APIs

## What / Why

Guard window/document/localStorage during SSR.

## Mental Model

```text
onMounted/client checks
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Browser-Only APIs
</script>

<template>
  <div>Browser-Only APIs</div>
</template>
```

## When to Use

Use browser APIs only in client lifecycle.

## Common Mistake / Interview Trap

Direct access during server render crashes.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Browser-Only APIs:** Guard window/document/localStorage during SSR.


---

<!-- 132_PINIA_ACTIONS.md -->

# Pinia Actions

## What / Why

Methods can mutate state and run async work.

## Mental Model

```text
actions:{async save(){...}}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Actions
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for business/client orchestration.

## Common Mistake / Interview Trap

Avoid giant stores containing unrelated domains.

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

> **Pinia Actions:** Methods can mutate state and run async work.


---

<!-- 133_SSR_DATA_FETCHING.md -->

# SSR Data Fetching

## What / Why

Resolve data on server and serialize safely for hydration.

## Mental Model

```text
server fetch → state → HTML/client
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: SSR Data Fetching
</script>

<template>
  <div>SSR Data Fetching</div>
</template>
```

## When to Use

Use framework conventions.

## Common Mistake / Interview Trap

Never serialize secrets or unsafe executable content.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **SSR Data Fetching:** Resolve data on server and serialize safely for hydration.


---

<!-- 133_STORETOREFS.md -->

# storeToRefs

## What / Why

Extracts reactive refs from a store while keeping methods separate.

## Mental Model

```text
const {count}=storeToRefs(store)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: storeToRefs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for destructuring state/getters.

## Common Mistake / Interview Trap

Direct destructuring store properties breaks reactivity.

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

> **storeToRefs:** Extracts reactive refs from a store while keeping methods separate.


---

<!-- 134_HYDRATION_MISMATCH.md -->

# Hydration Mismatch

## What / Why

Server and client first render differ.

## Mental Model

```text
time/random/browser state mismatch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Hydration Mismatch
</script>

<template>
  <div>Hydration Mismatch</div>
</template>
```

## When to Use

Make first render deterministic.

## Common Mistake / Interview Trap

Do not suppress warnings instead of fixing architecture.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Hydration Mismatch:** Server and client first render differ.


---

<!-- 134_PATCH.md -->

# $patch

## What / Why

Applies multiple state changes.

## Mental Model

```text
store.$patch({...})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: $patch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for grouped updates/devtools clarity.

## Common Mistake / Interview Trap

Actions are often clearer for domain intent.

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

> **$patch:** Applies multiple state changes.


---

<!-- 135_NUXT_AWARENESS.md -->

# Nuxt Awareness

## What / Why

Nuxt is the full-stack Vue framework commonly used for routing, SSR, server routes and data fetching.

## Mental Model

```text
Vue core + Nuxt framework
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Nuxt Awareness
</script>

<template>
  <div>Nuxt Awareness</div>
</template>
```

## When to Use

Use for production full-stack/SSR apps when it fits.

## Common Mistake / Interview Trap

Vue and Nuxt versions/features should be checked independently.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Nuxt Awareness:** Nuxt is the full-stack Vue framework commonly used for routing, SSR, server routes and data fetching.


---

<!-- 135_RESET.md -->

# $reset

## What / Why

Resets Options Store to initial state.

## Mental Model

```text
store.$reset()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: $reset
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for logout/feature reset.

## Common Mistake / Interview Trap

Setup stores need custom reset logic.

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

> **$reset:** Resets Options Store to initial state.


---

<!-- 136_STORE_PLUGINS.md -->

# Store Plugins

## What / Why

Extend stores with cross-cutting behavior.

## Mental Model

```text
pinia.use(plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Store Plugins
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for persistence/telemetry carefully.

## Common Mistake / Interview Trap

Plugins can create hidden behavior.

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

> **Store Plugins:** Extend stores with cross-cutting behavior.


---

<!-- 136_UNIVERSAL_CODE.md -->

# Universal Code

## What / Why

Code may execute on server and client.

## Mental Model

```text
isomorphic module
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Universal Code
</script>

<template>
  <div>Universal Code</div>
</template>
```

## When to Use

Use environment-neutral APIs where possible.

## Common Mistake / Interview Trap

Hidden global mutable state is dangerous in SSR.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Universal Code:** Code may execute on server and client.


---

<!-- 137_PINIA_SSR.md -->

# Pinia SSR

## What / Why

Create Pinia per application request and hydrate serialized state safely.

## Mental Model

```text
server store → serialize → client hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use framework guidance, especially Nuxt.

## Common Mistake / Interview Trap

Never share singleton server store across requests.

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

> **Pinia SSR:** Create Pinia per application request and hydrate serialized state safely.


---

<!-- 137_STREAMING_SSR.md -->

# Streaming SSR

## What / Why

Server may stream HTML progressively in framework/advanced setups.

## Mental Model

```text
server stream → browser
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Streaming SSR
</script>

<template>
  <div>Streaming SSR</div>
</template>
```

## When to Use

Use through framework infrastructure.

## Common Mistake / Interview Trap

Do not build custom SSR streaming unless needed.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Streaming SSR:** Server may stream HTML progressively in framework/advanced setups.


---

<!-- 138_PINIA_OUTSIDE_SETUP.md -->

# Pinia Outside setup

## What / Why

Pass/ensure correct pinia instance when using stores outside component setup.

## Mental Model

```text
useStore(pinia)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Outside setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in guards/framework code.

## Common Mistake / Interview Trap

SSR context makes global singleton usage risky.

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

> **Pinia Outside setup:** Pass/ensure correct pinia instance when using stores outside component setup.


---

<!-- 138_TELEPORT_PATTERN.md -->

# Teleport Pattern

## What / Why

Render overlay DOM outside local hierarchy.

## Mental Model

```text
modal → body
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport Pattern
</script>

<template>
  <div>Teleport Pattern</div>
</template>
```

## When to Use

Use for dialogs/popovers.

## Common Mistake / Interview Trap

Logical Vue ownership remains at original component.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Teleport Pattern:** Render overlay DOM outside local hierarchy.


---

<!-- 139_KEEPALIVE_INCLUDE_EXCLUDE.md -->

# KeepAlive Include Exclude

## What / Why

Cache selected dynamic components.

## Mental Model

```text
include/exclude/max
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive Include Exclude
</script>

<template>
  <div>KeepAlive Include Exclude</div>
</template>
```

## When to Use

Use for tab/route caches.

## Common Mistake / Interview Trap

Unbounded caching consumes memory.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **KeepAlive Include Exclude:** Cache selected dynamic components.


---

<!-- 139_PINIA_PERSISTENCE.md -->

# Pinia Persistence

## What / Why

Persist selected state via plugin/custom storage.

## Mental Model

```text
store ↔ localStorage
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Persistence
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only non-sensitive appropriate data.

## Common Mistake / Interview Trap

Browser storage is observable and can become stale.

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

> **Pinia Persistence:** Persist selected state via plugin/custom storage.


---

<!-- 140_FETCH.md -->

# fetch

## What / Why

Browser/native fetch for HTTP calls.

## Mental Model

```text
await fetch(url)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: fetch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use directly or through service/composable.

## Common Mistake / Interview Trap

Remember status errors do not reject automatically for HTTP 4xx/5xx.

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

> **fetch:** Browser/native fetch for HTTP calls.


---

<!-- 140_SUSPENSE_ASYNC_SETUP.md -->

# Suspense Async Setup

## What / Why

Async setup/components can suspend under Suspense.

## Mental Model

```text
async setup → fallback → resolve
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Suspense Async Setup
</script>

<template>
  <div>Suspense Async Setup</div>
</template>
```

## When to Use

Use for coordinated async boundaries where supported.

## Common Mistake / Interview Trap

Treat Suspense as advanced and test SSR/router interactions.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Suspense Async Setup:** Async setup/components can suspend under Suspense.


---

<!-- 141_ABORTCONTROLLER.md -->

# AbortController

## What / Why

Cancels fetch/request workflows.

## Mental Model

```text
signal → fetch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: AbortController
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to prevent stale async work.

## Common Mistake / Interview Trap

Cancellation must be wired to lifecycle/change.

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

> **AbortController:** Cancels fetch/request workflows.


---

<!-- 141_TRANSITION_CSS_CLASSES.md -->

# Transition CSS Classes

## What / Why

Vue manages enter/leave class phases.

## Mental Model

```text
v-enter-from → v-enter-active → v-enter-to
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition CSS Classes
</script>

<template>
  <div>Transition CSS Classes</div>
</template>
```

## When to Use

Use for CSS transitions.

## Common Mistake / Interview Trap

Know class lifecycle when debugging animations.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Transition CSS Classes:** Vue manages enter/leave class phases.


---

<!-- 142_ASYNC_STATE_COMPOSABLE.md -->

# Async State Composable

## What / Why

Encapsulates data/loading/error lifecycle.

## Mental Model

```text
useAsyncData-like composable
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async State Composable
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable client fetching.

## Common Mistake / Interview Trap

Avoid hand-rolling if framework/query solution is stronger.

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

> **Async State Composable:** Encapsulates data/loading/error lifecycle.


---

<!-- 142_TRANSITION_JAVASCRIPT_HOOKS.md -->

# Transition JavaScript Hooks

## What / Why

Custom hooks control animation lifecycle.

## Mental Model

```text
@enter/@leave
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Transition JavaScript Hooks
</script>

<template>
  <div>Transition JavaScript Hooks</div>
</template>
```

## When to Use

Use for animation libraries.

## Common Mistake / Interview Trap

Call done callback when required.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Transition JavaScript Hooks:** Custom hooks control animation lifecycle.


---

<!-- 143_RACE_CANCELLATION.md -->

# Race Cancellation

## What / Why

Cancel/ignore previous request when input changes.

## Mental Model

```text
watch(id, async ... cleanup abort)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Race Cancellation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in search/details workflows.

## Common Mistake / Interview Trap

Stale response overwriting new state is common.

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

> **Race Cancellation:** Cancel/ignore previous request when input changes.


---

<!-- 143_TRANSITIONGROUP_MOVES.md -->

# TransitionGroup Moves

## What / Why

Vue applies move transitions to keyed list reordering.

## Mental Model

```text
v-move
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: TransitionGroup Moves
</script>

<template>
  <div>TransitionGroup Moves</div>
</template>
```

## When to Use

Use for sortable animated lists.

## Common Mistake / Interview Trap

Keys must represent stable identity.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **TransitionGroup Moves:** Vue applies move transitions to keyed list reordering.


---

<!-- 144_ASYNC_COMPONENT_LOADING_STATES.md -->

# Async Component Loading States

## What / Why

defineAsyncComponent supports loading/error/delay/timeout options.

## Mental Model

```text
loader → loading/error component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Component Loading States
</script>

<template>
  <div>Async Component Loading States</div>
</template>
```

## When to Use

Use for large optional features.

## Common Mistake / Interview Trap

Handle chunk/network failure.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Async Component Loading States:** defineAsyncComponent supports loading/error/delay/timeout options.


---

<!-- 144_SERVER_STATE_VS_CLIENT_STATE.md -->

# Server State vs Client State

## What / Why

Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.

## Mental Model

```text
server cache vs refs/Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Server State vs Client State
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use query/framework tools where appropriate.

## Common Mistake / Interview Trap

Do not blindly mirror all API data into Pinia.

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

> **Server State vs Client State:** Remote authoritative data has fetching/cache/revalidation lifecycle distinct from UI state.


---

<!-- 145_QUERY_LIBRARIES.md -->

# Query Libraries

## What / Why

Tools such as TanStack Query for Vue manage server-state cache/revalidation.

## Mental Model

```text
query key → cache → request
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Query Libraries
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for sophisticated client server-state.

## Common Mistake / Interview Trap

Do not duplicate cache in Pinia without reason.

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

> **Query Libraries:** Tools such as TanStack Query for Vue manage server-state cache/revalidation.


---

<!-- 145_RECURSIVE_COMPONENTS.md -->

# Recursive Components

## What / Why

Components may render themselves recursively.

## Mental Model

```text
TreeNode → TreeNode children
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Recursive Components
</script>

<template>
  <div>Recursive Components</div>
</template>
```

## When to Use

Use for trees/comments/files.

## Common Mistake / Interview Trap

Base case is mandatory.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Recursive Components:** Components may render themselves recursively.


---

<!-- 146_API_SERVICE_LAYER.md -->

# API Service Layer

## What / Why

Centralizes transport/DTO mapping.

## Mental Model

```text
component → composable/service → HTTP
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: API Service Layer
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when API protocol should be isolated.

## Common Mistake / Interview Trap

Avoid generic mega-service.

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

> **API Service Layer:** Centralizes transport/DTO mapping.


---

<!-- 146_DYNAMIC_SLOTS.md -->

# Dynamic Slots

## What / Why

Slot names can be dynamic.

## Mental Model

```text
v-slot:[name]
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Dynamic Slots
</script>

<template>
  <div>Dynamic Slots</div>
</template>
```

## When to Use

Use for configurable component systems.

## Common Mistake / Interview Trap

Can make APIs hard to understand if overused.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Dynamic Slots:** Slot names can be dynamic.


---

<!-- 147_DTO_MAPPING.md -->

# DTO Mapping

## What / Why

Maps backend shape to UI/domain model.

## Mental Model

```text
DTO → mapper → model
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: DTO Mapping
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when contracts differ.

## Common Mistake / Interview Trap

Do not leak backend naming everywhere if it harms domain clarity.

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

> **DTO Mapping:** Maps backend shape to UI/domain model.


---

<!-- 147_PERFORMANCE_MENTAL_MODEL.md -->

# Performance Mental Model

## What / Why

Optimize network, bundle, reactive invalidation, component rendering and DOM together.

## Mental Model

```text
Network → JS → reactive updates → patch → paint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Performance Mental Model
</script>

<template>
  <div>Performance Mental Model</div>
</template>
```

## When to Use

Profile before optimizing.

## Common Mistake / Interview Trap

Vue's compiler already removes much manual rendering work.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Performance Mental Model:** Optimize network, bundle, reactive invalidation, component rendering and DOM together.


---

<!-- 148_COMPILER_OPTIMIZATIONS.md -->

# Compiler Optimizations

## What / Why

Vue compiler hoists static content and uses patch flags/block trees.

## Mental Model

```text
compile → optimized render function
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Compiler Optimizations
</script>

<template>
  <div>Compiler Optimizations</div>
</template>
```

## When to Use

Rely on compiler for normal templates.

## Common Mistake / Interview Trap

Avoid premature manual micro-optimization.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Compiler Optimizations:** Vue compiler hoists static content and uses patch flags/block trees.


---

<!-- 148_WEBSOCKET.md -->

# WebSocket

## What / Why

Long-lived bidirectional stream.

## Mental Model

```text
socket → reactive store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: WebSocket
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for real-time updates.

## Common Mistake / Interview Trap

Reconnect, ordering, auth, backpressure need design.

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

> **WebSocket:** Long-lived bidirectional stream.


---

<!-- 149_SSE.md -->

# SSE

## What / Why

Server-to-client event stream.

## Mental Model

```text
EventSource → reactive state
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSE
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for one-way realtime feeds.

## Common Mistake / Interview Trap

Browser/server proxy timeouts require testing.

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

> **SSE:** Server-to-client event stream.


---

<!-- 149_V_ONCE.md -->

# v-once

## What / Why

Renders subtree once and skips future updates.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-once
</script>

<template>
  <div>v-once</div>
</template>
```

## When to Use

Use for truly static reactive-independent content.

## Common Mistake / Interview Trap

Wrong use creates stale UI.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-once:** Renders subtree once and skips future updates.


---

<!-- 150_VUE_SSR.md -->

# Vue SSR

## What / Why

Server renders Vue app to HTML, then client hydrates.

## Mental Model

```text
request → renderToString → HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for SEO/first-load needs.

## Common Mistake / Interview Trap

State must be request-scoped.

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

> **Vue SSR:** Server renders Vue app to HTML, then client hydrates.


---

<!-- 150_V_MEMO.md -->

# v-memo

## What / Why

Memoizes a template subtree based on dependency array.

## Mental Model

```text
v-memo='[selected]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-memo
</script>

<template>
  <div>v-memo</div>
</template>
```

## When to Use

Use for targeted large-list optimization.

## Common Mistake / Interview Trap

Rarely needed; measure first.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-memo:** Memoizes a template subtree based on dependency array.


---

<!-- 151_HYDRATION.md -->

# Hydration

## What / Why

Client attaches Vue to server-rendered DOM.

## Mental Model

```text
SSR HTML → hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Hydration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use with SSR/frameworks.

## Common Mistake / Interview Trap

Server and client output must be compatible.

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

> **Hydration:** Client attaches Vue to server-rendered DOM.


---

<!-- 151_SHALLOWREF_PERFORMANCE.md -->

# shallowRef Performance

## What / Why

Avoid deep proxy overhead for large immutable structures.

## Mental Model

```text
shallowRef(bigData)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: shallowRef Performance
</script>

<template>
  <div>shallowRef Performance</div>
</template>
```

## When to Use

Use immutable replacement style.

## Common Mistake / Interview Trap

Nested mutation won't trigger render.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **shallowRef Performance:** Avoid deep proxy overhead for large immutable structures.


---

<!-- 152_HYDRATION_MISMATCH.md -->

# Hydration Mismatch

## What / Why

Server and client render different markup/data.

## Mental Model

```text
time/random/browser-only state
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Hydration Mismatch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Fix source or selectively allow known mismatch in Vue 3.5+.

## Common Mistake / Interview Trap

Suppressing mismatch is not a general fix.

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

> **Hydration Mismatch:** Server and client render different markup/data.


---

<!-- 152_LIST_VIRTUALIZATION.md -->

# List Virtualization

## What / Why

Render only visible rows for huge lists.

## Mental Model

```text
virtual list
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: List Virtualization
</script>

<template>
  <div>List Virtualization</div>
</template>
```

## When to Use

Use for thousands of elements.

## Common Mistake / Interview Trap

Keying and item-size strategy still matter.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **List Virtualization:** Render only visible rows for huge lists.


---

<!-- 153_CODE_SPLITTING.md -->

# Code Splitting

## What / Why

Use dynamic import/async components/routes.

## Mental Model

```text
import()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Code Splitting
</script>

<template>
  <div>Code Splitting</div>
</template>
```

## When to Use

Use route/feature boundaries.

## Common Mistake / Interview Trap

Avoid excessive tiny chunks/waterfalls.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Code Splitting:** Use dynamic import/async components/routes.


---

<!-- 153_DATA_ALLOW_MISMATCH.md -->

# data-allow-mismatch

## What / Why

Vue 3.5+ can selectively suppress inevitable hydration warnings.

## Mental Model

```text
data-allow-mismatch='text'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: data-allow-mismatch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for unavoidable known differences.

## Common Mistake / Interview Trap

Do not hide genuine bugs.

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

> **data-allow-mismatch:** Vue 3.5+ can selectively suppress inevitable hydration warnings.


---

<!-- 154_BUNDLE_ANALYSIS.md -->

# Bundle Analysis

## What / Why

Inspect dependency/chunk size.

## Mental Model

```text
vite build stats/plugins
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Bundle Analysis
</script>

<template>
  <div>Bundle Analysis</div>
</template>
```

## When to Use

Use before replacing packages.

## Common Mistake / Interview Trap

Tree shaking depends on package/module behavior.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Bundle Analysis:** Inspect dependency/chunk size.


---

<!-- 154_LAZY_HYDRATION_STRATEGIES.md -->

# Lazy Hydration Strategies

## What / Why

Vue 3.5+ async components can hydrate on idle/visible/media/interaction.

## Mental Model

```text
hydrateOnIdle/Visible/MediaQuery/Interaction
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration Strategies
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to reduce hydration cost.

## Common Mistake / Interview Trap

Requires SSR context.

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

> **Lazy Hydration Strategies:** Vue 3.5+ async components can hydrate on idle/visible/media/interaction.


---

<!-- 155_SSR_CONTEXT.md -->

# SSR Context

## What / Why

Passes per-render context such as teleports/modules.

## Mental Model

```text
renderToString(app,ctx)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR Context
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in custom SSR infrastructure.

## Common Mistake / Interview Trap

Frameworks like Nuxt handle much of this.

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

> **SSR Context:** Passes per-render context such as teleports/modules.


---

<!-- 155_STABLE_PROPS.md -->

# Stable Props

## What / Why

Pass primitive/stable derived props when possible to reduce child updates.

## Mental Model

```text
active:boolean not activeId+id calculation
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Stable Props
</script>

<template>
  <div>Stable Props</div>
</template>
```

## When to Use

Use in large repeated child trees.

## Common Mistake / Interview Trap

Do not distort APIs solely for micro-performance.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Stable Props:** Pass primitive/stable derived props when possible to reduce child updates.


---

<!-- 156_COMPUTED_CACHING.md -->

# Computed Caching

## What / Why

Computed only re-evaluates when dependencies change.

## Mental Model

```text
computed cache
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Computed Caching
</script>

<template>
  <div>Computed Caching</div>
</template>
```

## When to Use

Use expensive pure derivations.

## Common Mistake / Interview Trap

Methods rerun when render calls them.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Computed Caching:** Computed only re-evaluates when dependencies change.


---

<!-- 156_SSR_STATE_SERIALIZATION.md -->

# SSR State Serialization

## What / Why

Serialize app/store state safely into HTML.

## Mental Model

```text
server state → escaped JSON → client
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR State Serialization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use secure serializers such as framework-recommended tools.

## Common Mistake / Interview Trap

Unsafe serialization can create XSS.

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

> **SSR State Serialization:** Serialize app/store state safely into HTML.


---

<!-- 157_TELEPORT_SSR.md -->

# Teleport SSR

## What / Why

Teleported content needs special SSR placement/handling.

## Mental Model

```text
ctx.teleports
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport SSR
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use dedicated target containers.

## Common Mistake / Interview Trap

Avoid targeting body in custom SSR hydration scenarios.

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

> **Teleport SSR:** Teleported content needs special SSR placement/handling.


---

<!-- 157_WEB_VITALS.md -->

# Web Vitals

## What / Why

Measure LCP, INP and CLS in field data.

## Mental Model

```text
real user metrics
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Web Vitals
</script>

<template>
  <div>Web Vitals</div>
</template>
```

## When to Use

Use by route/release/device.

## Common Mistake / Interview Trap

Lab benchmarks alone are incomplete.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Web Vitals:** Measure LCP, INP and CLS in field data.


---

<!-- 158_LAZY_HYDRATION_AWARENESS.md -->

# Lazy Hydration Awareness

## What / Why

Vue 3.5 includes SSR lazy hydration strategies for async components.

## Mental Model

```text
hydrateOnIdle/Visible/Interaction/MediaQuery
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lazy Hydration Awareness
</script>

<template>
  <div>Lazy Hydration Awareness</div>
</template>
```

## When to Use

Use for SSR islands/less-critical interactive regions.

## Common Mistake / Interview Trap

Only meaningful in SSR hydration architecture.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Lazy Hydration Awareness:** Vue 3.5 includes SSR lazy hydration strategies for async components.


---

<!-- 158_ONSERVERPREFETCH.md -->

# onServerPrefetch

## What / Why

Fetches async data during SSR before component rendered.

## Mental Model

```text
onServerPrefetch(async()=>...)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: onServerPrefetch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in low-level SSR or libraries.

## Common Mistake / Interview Trap

Framework data APIs are often better at app scale.

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

> **onServerPrefetch:** Fetches async data during SSR before component rendered.


---

<!-- 159_NUXT_MENTAL_MODEL.md -->

# Nuxt Mental Model

## What / Why

Nuxt is the full-stack Vue framework for routing, data, SSR/SSG, server APIs and deployment.

## Mental Model

```text
Vue + file routing + Nitro + data fetching
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Nuxt Mental Model
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for production apps needing framework capabilities.

## Common Mistake / Interview Trap

Vue and Nuxt versions/features are related but not identical.

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

> **Nuxt Mental Model:** Nuxt is the full-stack Vue framework for routing, data, SSR/SSG, server APIs and deployment.


---

<!-- 159_TYPING_PROPS.md -->

# Typing Props

## What / Why

Use type-based defineProps declarations.

## Mental Model

```text
defineProps<{id:string}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Props
</script>

<template>
  <div>Typing Props</div>
</template>
```

## When to Use

Use strict TS.

## Common Mistake / Interview Trap

Keep runtime validation needs separate from compile-time types.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Typing Props:** Use type-based defineProps declarations.


---

<!-- 160_NUXT_VS_VUE_SPA.md -->

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


---

<!-- 160_TYPING_EMITS.md -->

# Typing Emits

## What / Why

Type event names and payload tuples.

## Mental Model

```text
defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Emits
</script>

<template>
  <div>Typing Emits</div>
</template>
```

## When to Use

Use for component contract safety.

## Common Mistake / Interview Trap

Avoid untyped string payload conventions.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Typing Emits:** Type event names and payload tuples.


---

<!-- 161_COMPILER_OPTIMIZATIONS.md -->

# Compiler Optimizations

## What / Why

Vue's template compiler emits patch flags/static hoisting to reduce runtime work.

## Mental Model

```text
template → optimized render code
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Compiler Optimizations
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use normal templates and let compiler optimize.

## Common Mistake / Interview Trap

Hand-written render functions can lose compiler optimizations.

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

> **Compiler Optimizations:** Vue's template compiler emits patch flags/static hoisting to reduce runtime work.


---

<!-- 161_TYPING_TEMPLATE_REFS.md -->

# Typing Template Refs

## What / Why

useTemplateRef can infer many template ref types in modern Vue tooling.

## Mental Model

```text
useTemplateRef('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing Template Refs
</script>

<template>
  <div>Typing Template Refs</div>
</template>
```

## When to Use

Use Volar/vue-tsc ecosystem.

## Common Mistake / Interview Trap

Handle null before mount.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Typing Template Refs:** useTemplateRef can infer many template ref types in modern Vue tooling.


---

<!-- 162_CODE_SPLITTING.md -->

# Code Splitting

## What / Why

Dynamic imports split bundles.

## Mental Model

```text
import() / route lazy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Code Splitting
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use route/feature boundaries.

## Common Mistake / Interview Trap

Too many tiny chunks create network overhead.

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

> **Code Splitting:** Dynamic imports split bundles.


---

<!-- 162_TYPING_PROVIDE_INJECT.md -->

# Typing provide inject

## What / Why

Use InjectionKey<T>.

## Mental Model

```text
const key:InjectionKey<Service>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Typing provide inject
</script>

<template>
  <div>Typing provide inject</div>
</template>
```

## When to Use

Use for app/library context.

## Common Mistake / Interview Trap

Plain strings lose strong typing.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Typing provide inject:** Use InjectionKey<T>.


---

<!-- 163_ASYNC_COMPONENT_LOADING.md -->

# Async Component Loading

## What / Why

defineAsyncComponent lazy-loads widgets/features.

## Mental Model

```text
loader → chunk
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Component Loading
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for non-critical heavy components.

## Common Mistake / Interview Trap

Provide loading/error experience.

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

> **Async Component Loading:** defineAsyncComponent lazy-loads widgets/features.


---

<!-- 163_GENERIC_COMPONENTS.md -->

# Generic Components

## What / Why

SFC script setup supports generic component patterns.

## Mental Model

```text
<script setup lang='ts' generic='T'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Generic Components
</script>

<template>
  <div>Generic Components</div>
</template>
```

## When to Use

Use in reusable design-system components.

## Common Mistake / Interview Trap

Keep inference ergonomic.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Generic Components:** SFC script setup supports generic component patterns.


---

<!-- 164_DISCRIMINATED_UNION_PROPS.md -->

# Discriminated Union Props

## What / Why

Model mutually exclusive component modes.

## Mental Model

```text
type Props=A|B
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Discriminated Union Props
</script>

<template>
  <div>Discriminated Union Props</div>
</template>
```

## When to Use

Use for robust APIs.

## Common Mistake / Interview Trap

Avoid dozens of optional props.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Discriminated Union Props:** Model mutually exclusive component modes.


---

<!-- 164_LAZY_HYDRATION_PERFORMANCE.md -->

# Lazy Hydration Performance

## What / Why

Delay hydration until idle/visible/interaction.

## Mental Model

```text
SSR static → later hydrate
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Lazy Hydration Performance
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for below-fold/low-priority widgets.

## Common Mistake / Interview Trap

Measure interaction readiness.

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

> **Lazy Hydration Performance:** Delay hydration until idle/visible/interaction.


---

<!-- 165_COMPONENT_PUBLIC_INSTANCE.md -->

# Component Public Instance

## What / Why

Type exposed component APIs deliberately.

## Mental Model

```text
ComponentExposed / instance type patterns
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Public Instance
</script>

<template>
  <div>Component Public Instance</div>
</template>
```

## When to Use

Use for template refs/library APIs.

## Common Mistake / Interview Trap

Prefer small imperative surfaces.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Component Public Instance:** Type exposed component APIs deliberately.


---

<!-- 165_V_ONCE.md -->

# v-once

## What / Why

Skips future updates to static runtime subtree.

## Mental Model

```text
v-once
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-once
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only when values truly never change.

## Common Mistake / Interview Trap

Can render stale values.

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

> **v-once:** Skips future updates to static runtime subtree.


---

<!-- 166_VUE_TSC.md -->

# vue-tsc

## What / Why

Performs Vue-aware TypeScript checking.

## Mental Model

```text
vue-tsc --noEmit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: vue-tsc
</script>

<template>
  <div>vue-tsc</div>
</template>
```

## When to Use

Use in CI.

## Common Mistake / Interview Trap

tsc alone does not understand all SFC template semantics.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **vue-tsc:** Performs Vue-aware TypeScript checking.


---

<!-- 166_V_MEMO.md -->

# v-memo

## What / Why

Memoizes template subtree based on dependency list.

## Mental Model

```text
v-memo='[selected]'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-memo
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for proven hot-list cases.

## Common Mistake / Interview Trap

Usually unnecessary for normal components.

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

> **v-memo:** Memoizes template subtree based on dependency list.


---

<!-- 167_STABLE_PROPS.md -->

# Stable Props

## What / Why

Pass primitive/stable derived props to reduce child updates.

## Mental Model

```text
active boolean instead of activeId
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Stable Props
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in large lists/hot trees.

## Common Mistake / Interview Trap

Avoid recreating unnecessary object props.

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

> **Stable Props:** Pass primitive/stable derived props to reduce child updates.


---

<!-- 167_TESTING_STRATEGY.md -->

# Testing Strategy

## What / Why

Test behavior and public contracts rather than internal implementation.

## Mental Model

```text
mount → interact → assert
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Testing Strategy
</script>

<template>
  <div>Testing Strategy</div>
</template>
```

## When to Use

Use layered unit/component/E2E tests.

## Common Mistake / Interview Trap

Avoid testing private refs directly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Testing Strategy:** Test behavior and public contracts rather than internal implementation.


---

<!-- 168_COMPUTED_CACHING.md -->

# Computed Caching

## What / Why

Computed reruns only when dependencies change.

## Mental Model

```text
computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Computed Caching
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for expensive derived state.

## Common Mistake / Interview Trap

Do not create side effects in computed.

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

> **Computed Caching:** Computed reruns only when dependencies change.


---

<!-- 168_VITEST.md -->

# Vitest

## What / Why

Recommended unit test runner for Vite-powered Vue apps.

## Mental Model

```text
vitest
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vitest
</script>

<template>
  <div>Vitest</div>
</template>
```

## When to Use

Use for new Vue applications.

## Common Mistake / Interview Trap

Jest is mainly useful for existing suites/migrations.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vitest:** Recommended unit test runner for Vite-powered Vue apps.


---

<!-- 169_VIRTUALIZATION.md -->

# Virtualization

## What / Why

Render visible subset of huge list/table.

## Mental Model

```text
windowed rows
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Virtualization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for thousands of DOM nodes.

## Common Mistake / Interview Trap

Vue diff optimization cannot make enormous DOM free.

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

> **Virtualization:** Render visible subset of huge list/table.


---

<!-- 169_VUE_TEST_UTILS.md -->

# Vue Test Utils

## What / Why

Official low-level component testing utilities.

## Mental Model

```text
mount/shallowMount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Test Utils
</script>

<template>
  <div>Vue Test Utils</div>
</template>
```

## When to Use

Use for Vue-aware component tests.

## Common Mistake / Interview Trap

Do not overuse shallow tests to avoid real integration.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue Test Utils:** Official low-level component testing utilities.


---

<!-- 170_BUNDLE_SIZE.md -->

# Bundle Size

## What / Why

Prefer tree-shakable APIs, lazy routes and smaller dependencies.

## Mental Model

```text
bundle analyzer
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Bundle Size
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use budgets/analysis.

## Common Mistake / Interview Trap

One dependency can dominate initial JS.

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

> **Bundle Size:** Prefer tree-shakable APIs, lazy routes and smaller dependencies.


---

<!-- 170_TESTING_LIBRARY_AWARENESS.md -->

# Testing Library Awareness

## What / Why

DOM Testing Library/Vue Testing Library can emphasize user-visible behavior.

## Mental Model

```text
getByRole
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Testing Library Awareness
</script>

<template>
  <div>Testing Library Awareness</div>
</template>
```

## When to Use

Use semantic queries where desired.

## Common Mistake / Interview Trap

Tool choice should match team standards.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Testing Library Awareness:** DOM Testing Library/Vue Testing Library can emphasize user-visible behavior.


---

<!-- 171_COMPONENT_TESTING.md -->

# Component Testing

## What / Why

Mount component with realistic props/plugins and assert UI behavior.

## Mental Model

```text
mount(Component,{props})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Testing
</script>

<template>
  <div>Component Testing</div>
</template>
```

## When to Use

Use for reusable components/features.

## Common Mistake / Interview Trap

Mock only external boundaries.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Component Testing:** Mount component with realistic props/plugins and assert UI behavior.


---

<!-- 171_PROPS_STABILITY.md -->

# Props Stability

## What / Why

Keep child inputs stable where possible.

## Mental Model

```text
derive in parent
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Props Stability
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for large repeated children.

## Common Mistake / Interview Trap

Premature identity micro-optimization can reduce readability.

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

> **Props Stability:** Keep child inputs stable where possible.


---

<!-- 172_COMPOSABLE_TESTING.md -->

# Composable Testing

## What / Why

Run composables in correct scope/app context when needed.

## Mental Model

```text
effectScope/test host
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Testing
</script>

<template>
  <div>Composable Testing</div>
</template>
```

## When to Use

Use for reusable logic.

## Common Mistake / Interview Trap

Lifecycle-dependent composables need a component/app context.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable Testing:** Run composables in correct scope/app context when needed.


---

<!-- 172_WEB_VITALS.md -->

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


---

<!-- 173_PINIA_TESTING.md -->

# Pinia Testing

## What / Why

Use testing Pinia/utilities or real store with reset state.

## Mental Model

```text
createTestingPinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Testing
</script>

<template>
  <div>Pinia Testing</div>
</template>
```

## When to Use

Use for feature/store tests.

## Common Mistake / Interview Trap

Overmocking actions can hide integration bugs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Testing:** Use testing Pinia/utilities or real store with reset state.


---

<!-- 173_VAPOR_MODE_FUTURE.md -->

# Vapor Mode Future

## What / Why

Vue 3.6 RC includes Vapor Mode, a compiler strategy without Virtual DOM for supported paths.

## Mental Model

```text
template → fine-grained DOM updates
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vapor Mode Future
// Use the concrete API described above in real code.
</script>
```

## When to Use

Track for future adoption after stable release/ecosystem readiness.

## Common Mistake / Interview Trap

As of Sep 15 2026 Vue 3.6 is RC, not the stable production baseline.

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

> **Vapor Mode Future:** Vue 3.6 RC includes Vapor Mode, a compiler strategy without Virtual DOM for supported paths.


---

<!-- 174_ROUTER_TESTING.md -->

# Router Testing

## What / Why

Use memory history/router instance for deterministic route tests.

## Mental Model

```text
createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Router Testing
</script>

<template>
  <div>Router Testing</div>
</template>
```

## When to Use

Use for guards/navigation/components.

## Common Mistake / Interview Trap

Await router readiness/navigation.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Router Testing:** Use memory history/router instance for deterministic route tests.


---

<!-- 174_TYPESCRIPT_SETUP.md -->

# TypeScript Setup

## What / Why

Vue SFCs support `<script setup lang='ts'>` and vue-tsc/language tooling.

## Mental Model

```text
TS + template inference
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: TypeScript Setup
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use strict TypeScript in production apps.

## Common Mistake / Interview Trap

Build transpilation alone may not perform full type checking.

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

> **TypeScript Setup:** Vue SFCs support `<script setup lang='ts'>` and vue-tsc/language tooling.


---

<!-- 175_ASYNC_TESTING.md -->

# Async Testing

## What / Why

Await Vue update queue and async work.

## Mental Model

```text
await nextTick / flushPromises
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Async Testing
</script>

<template>
  <div>Async Testing</div>
</template>
```

## When to Use

Use deterministic assertions.

## Common Mistake / Interview Trap

Arbitrary setTimeout sleeps create flaky tests.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Async Testing:** Await Vue update queue and async work.


---

<!-- 175_TYPING_PROPS.md -->

# Typing Props

## What / Why

Use type-based defineProps.

## Mental Model

```text
defineProps<{user:User}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Props
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use domain types.

## Common Mistake / Interview Trap

Runtime validation and compile-time types are different concerns.

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

> **Typing Props:** Use type-based defineProps.


---

<!-- 176_E2E.md -->

# E2E

## What / Why

Use browser automation for critical journeys.

## Mental Model

```text
login/checkout/mobile flow
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: E2E
</script>

<template>
  <div>E2E</div>
</template>
```

## When to Use

Keep high-value suite small.

## Common Mistake / Interview Trap

E2E should not replace unit/component tests.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **E2E:** Use browser automation for critical journeys.


---

<!-- 176_TYPING_EMITS.md -->

# Typing Emits

## What / Why

Use typed defineEmits signatures.

## Mental Model

```text
defineEmits<{save:[id:string]}>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Emits
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to document component events.

## Common Mistake / Interview Trap

Avoid untyped string payloads.

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

> **Typing Emits:** Use typed defineEmits signatures.


---

<!-- 177_ACCESSIBILITY_TESTING.md -->

# Accessibility Testing

## What / Why

Use semantic DOM + automated and manual checks.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Accessibility Testing
</script>

<template>
  <div>Accessibility Testing</div>
</template>
```

## When to Use

Use in component/design-system testing.

## Common Mistake / Interview Trap

Automated tools miss many issues.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Accessibility Testing:** Use semantic DOM + automated and manual checks.


---

<!-- 177_TYPING_MODELS.md -->

# Typing Models

## What / Why

defineModel supports typed model refs.

## Mental Model

```text
defineModel<string>()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Models
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use reusable form controls.

## Common Mistake / Interview Trap

Model can be undefined unless required/defaulted appropriately.

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

> **Typing Models:** defineModel supports typed model refs.


---

<!-- 178_TYPING_REFS.md -->

# Typing Refs

## What / Why

Use ref<Type>() and account for undefined/null.

## Mental Model

```text
ref<User|null>(null)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use precise union types.

## Common Mistake / Interview Trap

Avoid unsafe casts.

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

> **Typing Refs:** Use ref<Type>() and account for undefined/null.


---

<!-- 178_XSS_MODEL.md -->

# XSS Model

## What / Why

Vue escapes interpolation/attribute strings, but raw HTML and unsafe URLs remain dangerous.

## Mental Model

```text
escaped bindings vs v-html
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: XSS Model
</script>

<template>
  <div>XSS Model</div>
</template>
```

## When to Use

Prefer normal bindings.

## Common Mistake / Interview Trap

Vue is not a sanitizer for arbitrary HTML.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **XSS Model:** Vue escapes interpolation/attribute strings, but raw HTML and unsafe URLs remain dangerous.


---

<!-- 179_TYPING_REACTIVE.md -->

# Typing reactive

## What / Why

Prefer inferred object type or carefully typed interfaces.

## Mental Model

```text
reactive({count:0})
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing reactive
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use ref for replacing whole object often.

## Common Mistake / Interview Trap

Generic argument on reactive can be misleading with nested unwrapping.

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

> **Typing reactive:** Prefer inferred object type or carefully typed interfaces.


---

<!-- 179_V_HTML.md -->

# v-html

## What / Why

Injects raw HTML.

## Mental Model

```text
<div v-html='trustedHtml'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-html
</script>

<template>
  <div>v-html</div>
</template>
```

## When to Use

Use only with trusted/sanitized content.

## Common Mistake / Interview Trap

Major XSS risk.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-html:** Injects raw HTML.


---

<!-- 180_TYPING_TEMPLATE_REFS.md -->

# Typing Template Refs

## What / Why

Vue 3.5 + language-tools can infer static useTemplateRef types.

## Mental Model

```text
useTemplateRef<HTMLInputElement>('el')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Typing Template Refs
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use explicit generic when inference is impossible.

## Common Mistake / Interview Trap

Ref is nullable before mount.

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

> **Typing Template Refs:** Vue 3.5 + language-tools can infer static useTemplateRef types.


---

<!-- 180_URL_INJECTION.md -->

# URL Injection

## What / Why

Untrusted URLs can create dangerous navigation/resource behavior.

## Mental Model

```text
href/src
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: URL Injection
</script>

<template>
  <div>URL Injection</div>
</template>
```

## When to Use

Validate/normalize URL on trusted backend/client boundary.

## Common Mistake / Interview Trap

Do not bind arbitrary user-controlled javascript-like URLs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **URL Injection:** Untrusted URLs can create dangerous navigation/resource behavior.


---

<!-- 181_INJECTIONKEY_TYPES.md -->

# InjectionKey Types

## What / Why

Use `InjectionKey<T>` for typed provide/inject.

## Mental Model

```text
const Key:InjectionKey<Auth>=Symbol()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: InjectionKey Types
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in libraries/context.

## Common Mistake / Interview Trap

Avoid unsafe casts after inject.

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

> **InjectionKey Types:** Use `InjectionKey<T>` for typed provide/inject.


---

<!-- 181_STYLE_INJECTION.md -->

# Style Injection

## What / Why

User-controlled style values can enable UI redressing or unsafe CSS behavior.

## Mental Model

```text
style binding
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Style Injection
</script>

<template>
  <div>Style Injection</div>
</template>
```

## When to Use

Allowlist style fields.

## Common Mistake / Interview Trap

Avoid binding raw style objects from untrusted users.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Style Injection:** User-controlled style values can enable UI redressing or unsafe CSS behavior.


---

<!-- 182_CSP.md -->

# CSP

## What / Why

Restricts executable/resource origins.

## Mental Model

```text
Content-Security-Policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: CSP
</script>

<template>
  <div>CSP</div>
</template>
```

## When to Use

Use defense in depth.

## Common Mistake / Interview Trap

CSP does not replace authorization or sanitization.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **CSP:** Restricts executable/resource origins.


---

<!-- 182_GENERIC_COMPONENTS.md -->

# Generic Components

## What / Why

SFC script setup supports generic component patterns.

## Mental Model

```text
<script setup generic='T'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Generic Components
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for reusable typed lists/selects.

## Common Mistake / Interview Trap

Keep public API ergonomic.

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

> **Generic Components:** SFC script setup supports generic component patterns.


---

<!-- 183_AUTHENTICATION.md -->

# Authentication

## What / Why

Vue app integrates identity/session/token lifecycle.

## Mental Model

```text
IdP → Vue → API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Authentication
</script>

<template>
  <div>Authentication</div>
</template>
```

## When to Use

Use router UX and API layer.

## Common Mistake / Interview Trap

Frontend auth state is not final security enforcement.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Authentication:** Vue app integrates identity/session/token lifecycle.


---

<!-- 183_VOLAR_VUE_LANGUAGE_TOOLS.md -->

# Volar / Vue Language Tools

## What / Why

Editor/type tooling understands SFC templates and macros.

## Mental Model

```text
vue-tsc/language service
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Volar / Vue Language Tools
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use current tooling.

## Common Mistake / Interview Trap

Old Vetur-era assumptions may be obsolete.

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

> **Volar / Vue Language Tools:** Editor/type tooling understands SFC templates and macros.


---

<!-- 184_AUTHORIZATION.md -->

# Authorization

## What / Why

Conditionally show UI, while backend enforces permission.

## Mental Model

```text
canEdit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Authorization
</script>

<template>
  <div>Authorization</div>
</template>
```

## When to Use

Use for UX.

## Common Mistake / Interview Trap

Never rely on hidden buttons as security.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Authorization:** Conditionally show UI, while backend enforces permission.


---

<!-- 184_VITEST.md -->

# Vitest

## What / Why

Vite-native unit test runner commonly used in Vue projects.

## Mental Model

```text
vitest
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vitest
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for composables/services/components with Vue Test Utils.

## Common Mistake / Interview Trap

Test runner choice is ecosystem/tooling, not Vue core.

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

> **Vitest:** Vite-native unit test runner commonly used in Vue projects.


---

<!-- 185_SECRETS.md -->

# Secrets

## What / Why

Anything shipped to browser is inspectable.

## Mental Model

```text
VITE_* config ≠ secret
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Secrets
</script>

<template>
  <div>Secrets</div>
</template>
```

## When to Use

Keep secrets server-side.

## Common Mistake / Interview Trap

Vite environment variables embedded client-side are public.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Secrets:** Anything shipped to browser is inspectable.


---

<!-- 185_VUE_TEST_UTILS.md -->

# Vue Test Utils

## What / Why

Official low-level component testing utility.

## Mental Model

```text
mount/shallowMount
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Test Utils
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for Vue-aware component tests.

## Common Mistake / Interview Trap

Test behavior rather than internals.

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

> **Vue Test Utils:** Official low-level component testing utility.


---

<!-- 186_SEMANTIC_HTML.md -->

# Semantic HTML

## What / Why

Use native elements before ARIA.

## Mental Model

```text
button/nav/label
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Semantic HTML
</script>

<template>
  <div>Semantic HTML</div>
</template>
```

## When to Use

Foundation for accessibility.

## Common Mistake / Interview Trap

Clickable div is usually wrong.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Semantic HTML:** Use native elements before ARIA.


---

<!-- 186_TESTING_LIBRARY_VUE.md -->

# Testing Library Vue

## What / Why

User-centric DOM testing ecosystem option.

## Mental Model

```text
render/getByRole
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Testing Library Vue
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when behavior/accessibility focus is preferred.

## Common Mistake / Interview Trap

Avoid overusing test IDs.

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

> **Testing Library Vue:** User-centric DOM testing ecosystem option.


---

<!-- 187_COMPONENT_TESTING.md -->

# Component Testing

## What / Why

Mount component, set props, trigger events, assert DOM/emits.

## Mental Model

```text
mount → interact → assert
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Component Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use behavior-focused tests.

## Common Mistake / Interview Trap

Do not assert private implementation details.

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

> **Component Testing:** Mount component, set props, trigger events, assert DOM/emits.


---

<!-- 187_FOCUS_MANAGEMENT.md -->

# Focus Management

## What / Why

Manage modal/popover/route focus deliberately.

## Mental Model

```text
template ref → focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Focus Management
</script>

<template>
  <div>Focus Management</div>
</template>
```

## When to Use

Use accessible primitives/headless libs as needed.

## Common Mistake / Interview Trap

Do not steal focus unexpectedly.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Focus Management:** Manage modal/popover/route focus deliberately.


---

<!-- 188_ARIA.md -->

# ARIA

## What / Why

Add ARIA only when semantics need supplementation.

## Mental Model

```text
aria-expanded etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: ARIA
</script>

<template>
  <div>ARIA</div>
</template>
```

## When to Use

Use according to WAI-ARIA patterns.

## Common Mistake / Interview Trap

Bad ARIA can be worse than none.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **ARIA:** Add ARIA only when semantics need supplementation.


---

<!-- 188_EMITTED_EVENTS_TESTING.md -->

# Emitted Events Testing

## What / Why

Inspect emitted events/payloads.

## Mental Model

```text
wrapper.emitted('save')
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Emitted Events Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for component contract.

## Common Mistake / Interview Trap

Avoid testing framework internals.

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

> **Emitted Events Testing:** Inspect emitted events/payloads.


---

<!-- 189_ACCESSIBILITY_TESTING.md -->

# Accessibility Testing

## What / Why

Automated scans + keyboard + screen-reader checks.

## Mental Model

```text
axe + manual
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Accessibility Testing
</script>

<template>
  <div>Accessibility Testing</div>
</template>
```

## When to Use

Use in CI/release.

## Common Mistake / Interview Trap

Passing scanner is not complete compliance.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Accessibility Testing:** Automated scans + keyboard + screen-reader checks.


---

<!-- 189_COMPOSABLE_TESTING.md -->

# Composable Testing

## What / Why

Run composables in suitable effect/component scope.

## Mental Model

```text
test helper/mounted host
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Composable Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when lifecycle/DI needed.

## Common Mistake / Interview Trap

Pure composables may be tested as ordinary functions.

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

> **Composable Testing:** Run composables in suitable effect/component scope.


---

<!-- 190_CORE_API_QUICK_REFERENCE.md -->

# Vue Core API Quick Reference

## Reactivity

```text
ref
reactive
shallowRef
shallowReactive
readonly
computed
watch
watchEffect
watchPostEffect
watchSyncEffect
toRef / toRefs
toValue / unref
customRef
triggerRef
markRaw
effectScope
onScopeDispose
nextTick
```

## Component Macros

```text
defineProps
defineEmits
defineModel
defineExpose
defineOptions
defineSlots
```

## Lifecycle

```text
onMounted
onUpdated
onUnmounted
onActivated
onDeactivated
onErrorCaptured
```

## Built-ins

```text
Teleport
KeepAlive
Suspense
Transition
TransitionGroup
component
```


---

<!-- 190_FEATURE_FIRST_FOLDERS.md -->

# Feature-First Folders

## What / Why

Organize application by business capability.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Feature-First Folders
</script>

<template>
  <div>Feature-First Folders</div>
</template>
```

## When to Use

Use for medium/large apps.

## Common Mistake / Interview Trap

Avoid giant global components/composables/services folders.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Feature-First Folders:** Organize application by business capability.


---

<!-- 190_PINIA_TESTING.md -->

# Pinia Testing

## What / Why

Create test Pinia or real store with isolated app instance.

## Mental Model

```text
createTestingPinia or createPinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use deterministic store state/actions.

## Common Mistake / Interview Trap

Do not let singleton store leak between tests.

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

> **Pinia Testing:** Create test Pinia or real store with isolated app instance.


---

<!-- 191_COMPARISON_MATRIX.md -->

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


---

<!-- 191_COMPONENT_LAYERING.md -->

# Component Layering

## What / Why

Separate page/feature/UI primitive responsibilities.

## Mental Model

```text
Page → Feature → UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Component Layering
</script>

<template>
  <div>Component Layering</div>
</template>
```

## When to Use

Use clear ownership.

## Common Mistake / Interview Trap

Do not create layers with no actual architectural distinction.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Component Layering:** Separate page/feature/UI primitive responsibilities.


---

<!-- 191_ROUTER_TESTING.md -->

# Router Testing

## What / Why

Create memory history/router and await readiness.

## Mental Model

```text
createMemoryHistory
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Router Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for route/guard tests.

## Common Mistake / Interview Trap

Browser history assumptions can make tests flaky.

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

> **Router Testing:** Create memory history/router and await readiness.


---

<!-- 192_ASYNC_TESTING.md -->

# Async Testing

## What / Why

Await DOM flush/promises via nextTick/flushPromises as appropriate.

## Mental Model

```text
await nextTick()
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Async Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use deterministic async outcomes.

## Common Mistake / Interview Trap

Arbitrary sleeps are brittle.

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

> **Async Testing:** Await DOM flush/promises via nextTick/flushPromises as appropriate.


---

<!-- 192_HEADLESS_COMPONENT_PATTERN.md -->

# Headless Component Pattern

## What / Why

Expose behavior/state through slots/composables without fixed styling.

## Mental Model

```text
headless primitive → styled wrapper
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Headless Component Pattern
</script>

<template>
  <div>Headless Component Pattern</div>
</template>
```

## When to Use

Use for design systems.

## Common Mistake / Interview Trap

Accessibility behavior must be part of contract.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Headless Component Pattern:** Expose behavior/state through slots/composables without fixed styling.


---

<!-- 192_INTERVIEW_TRAPS.md -->

# Vue Interview Traps

1. Vue 3 is the current major; Vue 2 reached EOL on Dec 31, 2023.
2. Vue 3.5.42 is the stable baseline as of Sep 15, 2026; Vue 3.6 is still prerelease/RC.
3. Composition API does not deprecate Options API.
4. `<script setup>` is compile-time SFC syntax, not a runtime component API.
5. `ref` requires `.value` in JavaScript but templates auto-unwrap refs.
6. `reactive` returns a Proxy; destructuring properties can lose reactive linkage.
7. Vue 3.5 reactive props destructure is compiler-supported and remains reactive.
8. `computed` is for derived values, not side effects.
9. `watch` is explicit-source; `watchEffect` auto-tracks.
10. Async watchEffect only tracks dependencies accessed synchronously before the first await.
11. `onWatcherCleanup` must be registered synchronously while watcher/effect is executing.
12. Props are readonly.
13. Mutating nested prop objects still mutates parent-owned data and is usually poor design.
14. `defineModel` formalizes v-model component contracts.
15. `provide/inject` is not automatically a global-state solution.
16. Pinia is recommended for new large shared-state Vue apps.
17. Vuex is maintenance mode, not the recommendation for new apps.
18. Direct Pinia state destructuring loses reactivity; use `storeToRefs`.
19. Vue Router 4 is the Vue 3 router line.
20. Navigation guards are UX/navigation controls, not backend authorization.
21. Vue has no mandatory HTTP client.
22. Multiple fetch/composable invocations can duplicate requests; Vue does not cache server data automatically.
23. Teleport changes DOM location, not component ownership.
24. KeepAlive caches component instances; deactivation is not unmount.
25. Stable keys are essential for list/component identity.
26. `v-if` mounts/unmounts; `v-show` toggles display.
27. `v-html` can create XSS vulnerabilities.
28. Vite environment variables included in client bundle are not secrets.
29. SSR must create request-isolated mutable state.
30. Browser globals can break SSR.
31. Hydration requires compatible server/client initial markup.
32. `create-vue` + Vite is the official new-project setup.
33. Vue CLI is not the current recommendation for new projects.
34. Vitest is the recommended unit-test runner for Vite-powered Vue apps.
35. Nuxt is a framework built on Vue; Vue and Nuxt APIs/versioning should not be conflated.


---

<!-- 193_MOCKING.md -->

# Mocking

## What / Why

Mock network/external boundaries selectively.

## Mental Model

```text
MSW/fetch mock
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Mocking
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use realistic integration where practical.

## Common Mistake / Interview Trap

Excessive mocks create false confidence.

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

> **Mocking:** Mock network/external boundaries selectively.


---

<!-- 193_RENDERLESS_COMPONENT.md -->

# Renderless Component

## What / Why

Component exposes data/behavior through scoped slots without own UI.

## Mental Model

```text
<Mouse v-slot='...'>
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Renderless Component
</script>

<template>
  <div>Renderless Component</div>
</template>
```

## When to Use

Know legacy/library pattern.

## Common Mistake / Interview Trap

Composables often replace renderless components in modern Vue.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Renderless Component:** Component exposes data/behavior through scoped slots without own UI.


---

<!-- 193_TROUBLESHOOTING_MATRIX.md -->

# Vue Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | ref/reactive ownership | lost reactivity / shallow state |
| Computed stale | dependencies | non-reactive input |
| Infinite watcher | callback mutates source | feedback loop |
| Old request wins | watcher cleanup | stale async response |
| List state wrong | key | unstable/index key |
| Prop warning | child mutation | prop ownership violation |
| Pinia value not reactive | destructuring | missing storeToRefs |
| KeepAlive resource continues | activated/deactivated | no pause handling |
| SSR data leak | singleton module state | no per-request app/store |
| Hydration warning | initial markup mismatch | random/time/browser-only state |
| Modal CSS/focus bug | Teleport target | stacking/focus context |
| Duplicate API calls | repeated composable/watch | no cache/dedupe |
| Huge bundle | eager imports | no route/async splitting |
| Slow huge list | DOM volume | no virtualization |
| XSS risk | v-html | unsanitized HTML |
| Route refresh 404 | server hosting | missing SPA fallback |
| Template ref null | lifecycle | accessed before mount |
| Memory leak | external listener/socket | missing cleanup |

## Debug Flow

```text
Vue DevTools
→ Component props/state
→ ref/reactive/computed dependencies
→ watchers
→ Router / Pinia
→ network
→ SSR/hydration boundary
→ bundle/performance
→ fix
→ re-measure
```


---

<!-- 194_ACCESSIBILITY_TESTING.md -->

# Accessibility Testing

## What / Why

Use semantic queries/automated checks/manual keyboard review.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Accessibility Testing
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in CI and design system tests.

## Common Mistake / Interview Trap

Automated a11y tools do not catch everything.

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

> **Accessibility Testing:** Use semantic queries/automated checks/manual keyboard review.


---

<!-- 194_COMPOSABLE_ARCHITECTURE.md -->

# Composable Architecture

## What / Why

Use composables as feature logic boundaries.

## Mental Model

```text
useOrders/useAuth
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composable Architecture
</script>

<template>
  <div>Composable Architecture</div>
</template>
```

## When to Use

Use for reusable UI-domain coordination.

## Common Mistake / Interview Trap

Avoid huge god composables.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composable Architecture:** Use composables as feature logic boundaries.


---

<!-- 194_ONE_PAGE_RECALL.md -->

# Vue — One-Page Architecture Recall

```text
                        Vue App
                           │
            ┌──────────────┼──────────────┐
            ▼              ▼              ▼
        Components       Router          Pinia
            │              │              │
       SFC Template     URL State    Shared State
            │                             │
            └──────────┬──────────────────┘
                       ▼
             Composition API
          ref/reactive/computed
             watch / effects
                       ▼
              Compiler + Runtime
                       ▼
                      DOM
```

## Async

```text
fetch / framework query
→ pending/error/data
→ ref/composable/store
```

## Built-ins

```text
Teleport
KeepAlive
Suspense
Transition
Async Components
```

## Production

```text
Vite / create-vue
Vue Router
Pinia
Vitest
SSR/Nuxt when needed
Security
Accessibility
Web Vitals
Telemetry
```


---

<!-- 195_API_ADAPTER.md -->

# API Adapter

## What / Why

Map backend DTO/protocol into UI/domain models.

## Mental Model

```text
API → adapter → feature
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: API Adapter
</script>

<template>
  <div>API Adapter</div>
</template>
```

## When to Use

Use when contracts differ.

## Common Mistake / Interview Trap

Do not spread raw DTOs everywhere.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **API Adapter:** Map backend DTO/protocol into UI/domain models.


---

<!-- 195_COMMANDS_SETUP.md -->

# Vue Setup / Commands Recall

## Create New Vue Project

```bash
npm create vue@latest
```

Official create-vue can configure:
- TypeScript
- JSX
- Vue Router
- Pinia
- unit testing
- E2E testing
- ESLint
- formatting

## Install Vue

```bash
npm install vue
```

## Pinia

```bash
npm install pinia
```

## Typical Scripts

```bash
npm run dev
npm run build
npm run preview
npm run test:unit
npm run type-check
npm run lint
```

Actual generated script names depend on chosen create-vue options.

## Rule

Use `create-vue` + Vite for new standard Vue projects, not Vue CLI-first guidance.


---

<!-- 195_E2E.md -->

# E2E

## What / Why

Use Playwright/Cypress-style tools for critical journeys.

## Mental Model

```text
login/checkout
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: E2E
// Use the concrete API described above in real code.
</script>
```

## When to Use

Keep high-value and limited.

## Common Mistake / Interview Trap

Do not rely only on E2E.

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

> **E2E:** Use Playwright/Cypress-style tools for critical journeys.


---

<!-- 196_PLUGIN_SYSTEM.md -->

# Plugin System

## What / Why

app.use(plugin) installs cross-cutting capabilities.

## Mental Model

```text
app.use(router/pinia/plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Plugin System
</script>

<template>
  <div>Plugin System</div>
</template>
```

## When to Use

Use for router/store/i18n/library infrastructure.

## Common Mistake / Interview Trap

Plugins can hide global behavior; document them.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Plugin System:** app.use(plugin) installs cross-cutting capabilities.


---

<!-- 196_PRODUCTION_CHECKLIST.md -->

# Vue Production Readiness Checklist

## Architecture
- [ ] Composition API / script setup standards
- [ ] feature boundaries
- [ ] local vs Pinia vs URL vs server-state ownership
- [ ] Router lazy loading
- [ ] composable cleanup/lifetimes

## Reactivity
- [ ] no lost reactive destructuring
- [ ] computed for derived values
- [ ] watchers only for side effects
- [ ] stable list keys
- [ ] shallow/markRaw use justified

## Async
- [ ] loading/error/empty states
- [ ] stale request cancellation
- [ ] retry policy
- [ ] dedupe/cache ownership

## SSR
- [ ] per-request app/router/store
- [ ] no user data singleton
- [ ] browser globals guarded
- [ ] hydration tested

## Security
- [ ] no v-html with untrusted content
- [ ] URL/style inputs validated
- [ ] CSP considered
- [ ] backend authorization
- [ ] no client secrets

## Performance
- [ ] route/async code splitting
- [ ] bundle analysis
- [ ] virtualization for huge lists
- [ ] image/font strategy
- [ ] Web Vitals telemetry

## Quality
- [ ] Vitest
- [ ] component/integration tests
- [ ] critical E2E
- [ ] accessibility tests
- [ ] release/error telemetry


---

<!-- 196_VUE_SECURITY_RULE.md -->

# Vue Security Rule

## What / Why

Never use non-trusted content as Vue templates.

## Mental Model

```text
server text ≠ template source
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue Security Rule
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use templates authored by developers.

## Common Mistake / Interview Trap

Compiling user content as template is equivalent to code execution.

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

> **Vue Security Rule:** Never use non-trusted content as Vue templates.


---

<!-- 197_GLOBAL_PROPERTIES.md -->

# Global Properties

## What / Why

app.config.globalProperties exposes app globals.

## Mental Model

```text
$api/$t etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Global Properties
</script>

<template>
  <div>Global Properties</div>
</template>
```

## When to Use

Use sparingly for framework-style APIs.

## Common Mistake / Interview Trap

Prefer imports/provide-inject/composables for testability.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Global Properties:** app.config.globalProperties exposes app globals.


---

<!-- 197_PRACTICE_QUESTIONS.md -->

# Vue Practice Questions

1. Explain Vue's reactivity/rendering model.
2. What is an SFC?
3. What is `<script setup>`?
4. ref vs reactive?
5. Why can destructuring reactive state break reactivity?
6. What changed with reactive props destructure in Vue 3.5?
7. computed vs watch?
8. watch vs watchEffect?
9. What is onWatcherCleanup?
10. shallowRef use case?
11. markRaw use case?
12. effectScope?
13. What does nextTick do?
14. defineProps vs defineEmits?
15. defineModel?
16. Multiple v-model?
17. Slots vs scoped slots?
18. provide/inject?
19. InjectionKey?
20. defineExpose?
21. Template refs and useTemplateRef?
22. Teleport?
23. KeepAlive?
24. Suspense?
25. Transition vs TransitionGroup?
26. defineAsyncComponent?
27. What is a composable?
28. Composable vs Pinia store?
29. Vue Router history modes?
30. How do dynamic route params behave?
31. What are navigation guards?
32. Why are guards not security?
33. Pinia Option vs Setup stores?
34. storeToRefs?
35. Why is Vuex no longer recommended for new apps?
36. How should HTTP data be modeled?
37. How do you cancel stale requests?
38. What is server state vs client state?
39. Vue SSR request isolation?
40. What causes hydration mismatch?
41. Nuxt vs Vue?
42. How do you optimize huge lists?
43. v-if vs v-show?
44. v-memo?
45. lazy hydration in Vue 3.5?
46. Vitest vs Jest for new Vue apps?
47. v-html security?
48. Why are Vite env vars not secrets?
49. Vue vs React?
50. Vue vs Angular?
51. Composition API vs Options API?
52. Vue 3.5 vs 3.6 current status?


---

<!-- 197_XSS_AND_INTERPOLATION.md -->

# XSS and Interpolation

## What / Why

Text interpolation/attribute bindings are escaped/safely handled in normal cases.

## Mental Model

```text
{{ userText }}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: XSS and Interpolation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use normal bindings for untrusted text.

## Common Mistake / Interview Trap

Unsafe DOM APIs/v-html remain dangerous.

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

> **XSS and Interpolation:** Text interpolation/attribute bindings are escaped/safely handled in normal cases.


---

<!-- 198_ERROR_HANDLER.md -->

# Error Handler

## What / Why

app.config.errorHandler captures uncaught app errors.

## Mental Model

```text
error → global telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Error Handler
</script>

<template>
  <div>Error Handler</div>
</template>
```

## When to Use

Use for observability.

## Common Mistake / Interview Trap

Still provide local recoverable error UX.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Error Handler:** app.config.errorHandler captures uncaught app errors.


---

<!-- 198_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:

- Vue official documentation — https://vuejs.org/
- Vue release policy — https://vuejs.org/about/releases
- Vue npm package release tags
- Vue Router official documentation
- Pinia official documentation
- Vue testing guide
- Vue SSR guide

## Current Baseline — September 15, 2026

```text
Vue stable: 3.5.42
Vue 3.6: RC/pre-release
Vue 2: EOL since Dec 31, 2023
```

## Current Official Ecosystem Guidance

```text
Project scaffolding → create-vue
Build tool → Vite
Routing → Vue Router
Large shared state → Pinia
Unit testing → Vitest
Full-stack/SSR framework → Nuxt ecosystem where appropriate
```

## Version-Sensitive Vue 3.5 Topics

```text
Reactive props destructure
useTemplateRef()
onWatcherCleanup()
SSR lazy hydration strategies
reactivity / hydration improvements
```

## Accuracy Rule

Before production work verify:
- exact Vue patch/minor,
- Router and Pinia versions,
- Vite/TypeScript compatibility,
- Nuxt version if applicable,
- browser support,
- pre-release vs stable status.


---

<!-- 198_V_HTML_SECURITY.md -->

# v-html Security

## What / Why

Raw HTML rendering bypasses normal escaping.

## Mental Model

```text
v-html='trustedHtml'
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-html Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use only with trusted/sanitized HTML.

## Common Mistake / Interview Trap

Do not render arbitrary user HTML without robust sanitization.

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

> **v-html Security:** Raw HTML rendering bypasses normal escaping.


---

<!-- 199_DESIGN_SYSTEM.md -->

# Design System

## What / Why

Use components, tokens and headless primitives consistently.

## Mental Model

```text
tokens → primitives → domain UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Design System
</script>

<template>
  <div>Design System</div>
</template>
```

## When to Use

Use governed shared UI.

## Common Mistake / Interview Trap

Do not put domain business logic into design system.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Design System:** Use components, tokens and headless primitives consistently.


---

<!-- 199_URL_SECURITY.md -->

# URL Security

## What / Why

User-provided URLs need backend/frontend validation.

## Mental Model

```text
href=userUrl
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: URL Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Validate schemes/targets.

## Common Mistake / Interview Trap

`javascript:` and malicious URLs are dangerous.

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

> **URL Security:** User-provided URLs need backend/frontend validation.


---

<!-- 200_CORE_API_QUICK_REFERENCE.md -->

# Vue Core API Quick Reference

## State
```text
ref
reactive
shallowRef
shallowReactive
readonly
computed
```

## Effects
```text
watch
watchEffect
watchPostEffect
watchSyncEffect
onWatcherCleanup
effectScope
onScopeDispose
```

## Normalization
```text
toRef
toRefs
toValue
unref
isRef
markRaw
toRaw
```

## SFC Macros
```text
defineProps
defineEmits
defineModel
defineExpose
defineOptions
```

## Component Context
```text
provide
inject
useAttrs
useSlots
useTemplateRef
useId
```

## Async / Built-ins
```text
defineAsyncComponent
Suspense
Teleport
KeepAlive
Transition
TransitionGroup
```


---

<!-- 200_MICROFRONTEND_INTEGRATION.md -->

# Microfrontend Integration

## What / Why

Vue can participate via route composition, Module Federation, single-spa, Web Components, iframe, etc.

## Mental Model

```text
shell → Vue MFE
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Microfrontend Integration
</script>

<template>
  <div>Microfrontend Integration</div>
</template>
```

## When to Use

Use only when team/deployment autonomy requires.

## Common Mistake / Interview Trap

Do not use MFEs for ordinary component modularity.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Microfrontend Integration:** Vue can participate via route composition, Module Federation, single-spa, Web Components, iframe, etc.


---

<!-- 200_STYLE_INJECTION.md -->

# Style Injection

## What / Why

User-controlled style objects can enable UI redressing risks.

## Mental Model

```text
style bindings
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Style Injection
// Use the concrete API described above in real code.
</script>
```

## When to Use

Whitelist safe properties if user-controlled.

## Common Mistake / Interview Trap

Never let arbitrary user CSS take over page.

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

> **Style Injection:** User-controlled style objects can enable UI redressing risks.


---

<!-- 201_COMPARISON_MATRIX.md -->

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


---

<!-- 201_CREATE_VUE.md -->

# create-vue

## What / Why

Official Vue scaffolding tool uses Vite.

## Mental Model

```text
npm create vue@latest
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: create-vue
</script>

<template>
  <div>create-vue</div>
</template>
```

## When to Use

Use for new Vue projects.

## Common Mistake / Interview Trap

Vue CLI is no longer the recommended default.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **create-vue:** Official Vue scaffolding tool uses Vite.


---

<!-- 201_CSP.md -->

# CSP

## What / Why

Restricts allowed script/style/resource origins.

## Mental Model

```text
Content-Security-Policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: CSP
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use defense in depth.

## Common Mistake / Interview Trap

CSP does not replace authorization or sanitization.

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

> **CSP:** Restricts allowed script/style/resource origins.


---

<!-- 202_INTERVIEW_TRAPS.md -->

# Vue Interview Traps

1. Vue 3.5.42 is the current stable baseline as of Sep 15, 2026.
2. Vue 3.6 is still RC; Vapor Mode is not yet the stable default.
3. Composition API does not deprecate Options API.
4. `<script setup>` is compile-time syntax sugar.
5. `ref` needs `.value` in JavaScript but templates auto-unwrap in common cases.
6. `reactive` returns a Proxy and object destructuring can lose reactivity.
7. Vue 3.5 reactive props destructure is special compiler behavior in script setup.
8. `computed` is for derived state; `watch` is for side effects.
9. `watchEffect` tracks dependencies used during synchronous execution.
10. Stable keys represent identity.
11. `v-if` and `v-show` have different mount/performance semantics.
12. `v-html` can create XSS.
13. Props are readonly in the child.
14. Nested prop objects can still be mutated in JavaScript; avoid hidden parent-state mutation.
15. `defineModel()` is the recommended component v-model approach since 3.4.
16. defineModel defaults can desynchronize parent/child when parent provides no value.
17. `useTemplateRef()` is a Vue 3.5 API.
18. Lazy hydration strategies are Vue 3.5+ SSR features.
19. `data-allow-mismatch` should be used selectively.
20. Pinia store state/getters should use `storeToRefs` when destructuring.
21. Pinia is not necessary for every local piece of state.
22. Navigation guards are not backend authorization.
23. Vue Router history mode needs server fallback on page refresh.
24. Vue Router Data Loaders are currently under the experimental API path; do not treat them as a frozen stable contract.
25. Async component loading and SSR hydration are separate concerns.
26. Suspense support/status should be checked against exact framework/version expectations.
27. KeepAlive preserves component state and can keep stale data.
28. Server state is not the same as Pinia/client state.
29. Singleton module state can leak across SSR requests.
30. Browser env variables are not secrets.
31. Teleport changes DOM location but not component ownership.
32. Vue templates are not safe to compile from untrusted user content.
33. Nuxt is a framework built around Vue; Vue itself is the core framework/library layer.
34. Vite is tooling, not part of Vue runtime.
35. Vue 2 patterns remain important for migration but are not modern defaults.


---

<!-- 202_TRUSTED_TYPES.md -->

# Trusted Types

## What / Why

Can harden dangerous DOM sinks in supporting browsers.

## Mental Model

```text
TrustedHTML policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Trusted Types
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in security-sensitive deployments with library compatibility.

## Common Mistake / Interview Trap

Not a substitute for content validation.

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

> **Trusted Types:** Can harden dangerous DOM sinks in supporting browsers.


---

<!-- 202_VITE.md -->

# Vite

## What / Why

Default modern build tool in official Vue setup.

## Mental Model

```text
Vite dev/build
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vite
</script>

<template>
  <div>Vite</div>
</template>
```

## When to Use

Use for Vue SPA/library setups.

## Common Mistake / Interview Trap

Frameworks like Nuxt own more of the app architecture.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vite:** Default modern build tool in official Vue setup.


---

<!-- 203_FRONTEND_AUTHORIZATION.md -->

# Frontend Authorization

## What / Why

Route/UI checks are UX only.

## Mental Model

```text
canEdit → button
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Frontend Authorization
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use backend as final authorization authority.

## Common Mistake / Interview Trap

Navigation guards cannot secure APIs.

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

> **Frontend Authorization:** Route/UI checks are UX only.


---

<!-- 203_PINIA_ECOSYSTEM.md -->

# Pinia Ecosystem

## What / Why

Pinia is maintained by Vue core team and is recommended for new larger shared-state apps.

## Mental Model

```text
Vue → Pinia
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Ecosystem
</script>

<template>
  <div>Pinia Ecosystem</div>
</template>
```

## When to Use

Use when shared-store conventions are justified.

## Common Mistake / Interview Trap

Vuex is maintenance mode.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Ecosystem:** Pinia is maintained by Vue core team and is recommended for new larger shared-state apps.


---

<!-- 203_TROUBLESHOOTING_MATRIX.md -->

# Vue Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | ref/reactive ownership | lost reactivity |
| destructured state stale | destructuring source | reactive object destructured |
| list state jumps | keys | unstable/index key |
| computed not updating | dependency read | non-reactive source/raw data |
| watcher loop | watcher mutates source | cyclic side effect |
| stale async result | request ordering | missing cancellation |
| duplicate fetch | lifecycle/watch/store | repeated trigger/subscription |
| Pinia value stale | destructured store | missing storeToRefs |
| route refresh 404 | server rewrite | history mode hosting |
| SSR mismatch | server/client output | time/random/browser-only state |
| memory leak | listener/socket/timer | missing cleanup |
| KeepAlive stale | cached instance | no activated refresh policy |
| modal styling wrong | Teleport target | CSS scope/DOM context |
| async component fails | chunk/CDN | stale deployment cache |
| huge bundle | eager imports/dependency | no code splitting |
| XSS risk | v-html/template | unsafe content |
| provide inject undefined | key/provider tree | wrong scope/key |
| type ref wrong | template ref timing | null/inference issue |

## Debug Flow

```text
Vue DevTools
→ reactive source
→ component props/emits
→ watchers/computed
→ Router / Pinia
→ Network
→ SSR/hydration
→ bundle/performance
→ fix
→ re-measure
```


---

<!-- 204_ONE_PAGE_RECALL.md -->

# Vue — One-Page Architecture Recall

```text
                    Vue Application
                          │
             ┌────────────┼────────────┐
             ▼            ▼            ▼
         Components     Router        Pinia
             │            │            │
       Props / Emits     Routes       Stores
             │                         │
       ref / reactive / computed / watchers
             │
        Render Effect
             │
   Compiler + Virtual DOM Patch
             │
            DOM
```

## State

```text
Local UI → ref/reactive
Derived → computed
Side effect → watch/watchEffect
Feature/app shared → Pinia
Navigation → Router URL
Remote authoritative data → query/framework/server cache
```

## Performance

```text
lazy routes
async components
compiler optimizations
stable props/keys
virtualization
lazy hydration
bundle analysis
Web Vitals
```

## Production

```text
TypeScript
testing
accessibility
security
SSR isolation
error telemetry
immutable assets
```


---

<!-- 204_SECRETS.md -->

# Secrets

## What / Why

Anything in browser bundle/runtime config can be inspected.

## Mental Model

```text
client env != secret
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Secrets
// Use the concrete API described above in real code.
</script>
```

## When to Use

Keep secrets server-side.

## Common Mistake / Interview Trap

Vite env variables shipped to client are public by definition.

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

> **Secrets:** Anything in browser bundle/runtime config can be inspected.


---

<!-- 204_VUE_ROUTER_ECOSYSTEM.md -->

# Vue Router Ecosystem

## What / Why

Vue Router is official router for Vue.

## Mental Model

```text
Vue → Router 4
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue Router Ecosystem
</script>

<template>
  <div>Vue Router Ecosystem</div>
</template>
```

## When to Use

Use for SPA routing.

## Common Mistake / Interview Trap

Know hosting fallback requirements.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue Router Ecosystem:** Vue Router is official router for Vue.


---

<!-- 205_COMMANDS_SETUP.md -->

# Vue Commands / Setup Recall

## Create Modern Vue App

```bash
npm create vue@latest
```

The official scaffold can configure options such as:
```text
TypeScript
Vue Router
Pinia
Vitest
E2E tooling
ESLint
Prettier
```

## Install

```bash
npm install
```

## Develop

```bash
npm run dev
```

## Build

```bash
npm run build
```

## Type Check

Typical TypeScript Vue projects:
```bash
vue-tsc --noEmit
```

or the generated project script such as:
```bash
npm run type-check
```

## Test

Depends on scaffold choices; commonly:
```bash
npm run test:unit
```

## Rule

Vue is the runtime/framework. Vite/create-vue/Vitest are tooling choices around it.


---

<!-- 205_NUXT_ECOSYSTEM.md -->

# Nuxt Ecosystem

## What / Why

Nuxt adds file routing, SSR, server routes, data fetching and full-stack conventions.

## Mental Model

```text
Vue core → Nuxt
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Nuxt Ecosystem
</script>

<template>
  <div>Nuxt Ecosystem</div>
</template>
```

## When to Use

Use for full production framework needs.

## Common Mistake / Interview Trap

Do not mix core Vue and Nuxt API assumptions.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Nuxt Ecosystem:** Nuxt adds file routing, SSR, server routes, data fetching and full-stack conventions.


---

<!-- 205_SEMANTIC_HTML.md -->

# Semantic HTML

## What / Why

Use native semantic elements first.

## Mental Model

```text
button/label/nav
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Semantic HTML
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for accessibility.

## Common Mistake / Interview Trap

Clickable divs require extra work and often remain inferior.

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

> **Semantic HTML:** Use native semantic elements first.


---

<!-- 206_ARIA.md -->

# ARIA

## What / Why

Use ARIA when native semantics are insufficient.

## Mental Model

```text
aria-expanded
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ARIA
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use correct state synchronization.

## Common Mistake / Interview Trap

Bad ARIA can make accessibility worse.

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

> **ARIA:** Use ARIA when native semantics are insufficient.


---

<!-- 206_I18N_AWARENESS.md -->

# i18n Awareness

## What / Why

Vue I18n ecosystem handles locale/messages/formatting.

## Mental Model

```text
locale → messages → template
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: i18n Awareness
</script>

<template>
  <div>i18n Awareness</div>
</template>
```

## When to Use

Use for international apps.

## Common Mistake / Interview Trap

Locale state should have one clear owner.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **i18n Awareness:** Vue I18n ecosystem handles locale/messages/formatting.


---

<!-- 206_PRODUCTION_CHECKLIST.md -->

# Vue Production Readiness Checklist

## Architecture
- [ ] feature ownership clear
- [ ] local state kept local
- [ ] Pinia only for justified shared state
- [ ] URL state handled by Router
- [ ] server-state cache strategy explicit
- [ ] composables clean up external resources

## Performance
- [ ] lazy routes
- [ ] async components for heavy secondary UI
- [ ] stable keys/props
- [ ] huge lists virtualized
- [ ] bundle analyzed
- [ ] Web Vitals measured
- [ ] SSR lazy hydration evaluated where useful

## SSR
- [ ] request-scoped app/store state
- [ ] hydration tested
- [ ] browser globals guarded
- [ ] serialized state escaped safely
- [ ] unavoidable mismatch suppression limited

## Security
- [ ] no untrusted Vue templates
- [ ] no unsafe v-html
- [ ] URLs validated
- [ ] no client secrets
- [ ] backend authorization
- [ ] CSP considered

## Quality
- [ ] TypeScript/vue-tsc
- [ ] component tests
- [ ] composable/store tests
- [ ] critical E2E
- [ ] accessibility review

## Delivery
- [ ] production build
- [ ] immutable assets
- [ ] history fallback configured
- [ ] release/version telemetry
- [ ] rollback strategy


---

<!-- 207_ERROR_BOUNDARIES_PATTERN.md -->

# Error Boundaries Pattern

## What / Why

Use onErrorCaptured/global error handler/route-level UX to isolate failures.

## Mental Model

```text
feature error → fallback
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Error Boundaries Pattern
</script>

<template>
  <div>Error Boundaries Pattern</div>
</template>
```

## When to Use

Use failure domains.

## Common Mistake / Interview Trap

Vue has no React-style ErrorBoundary component built-in by that name; implement via Vue error APIs.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Error Boundaries Pattern:** Use onErrorCaptured/global error handler/route-level UX to isolate failures.


---

<!-- 207_FOCUS_MANAGEMENT.md -->

# Focus Management

## What / Why

Manage focus for modals/routes/dynamic content.

## Mental Model

```text
template ref + focus
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Focus Management
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use accessible dialog/router patterns.

## Common Mistake / Interview Trap

Do not unexpectedly steal focus.

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

> **Focus Management:** Manage focus for modals/routes/dynamic content.


---

<!-- 207_PRACTICE_QUESTIONS.md -->

# Vue Practice Questions

1. Explain Vue's reactivity mental model.
2. ref vs reactive?
3. computed vs watch?
4. watch vs watchEffect?
5. What is `<script setup>`?
6. What are compiler macros?
7. defineProps / defineEmits?
8. What is reactive props destructure in Vue 3.5?
9. What is defineModel?
10. How does component v-model work underneath?
11. Slots vs scoped slots?
12. provide/inject use cases?
13. useTemplateRef?
14. Why is nextTick needed?
15. What is effectScope?
16. What is onWatcherCleanup?
17. toRef vs toRefs?
18. markRaw use case?
19. v-if vs v-show?
20. v-once vs v-memo?
21. Async component vs lazy route?
22. What is lazy hydration?
23. What are Vue 3.5 hydration strategies?
24. What is data-allow-mismatch?
25. KeepAlive lifecycle implications?
26. Teleport use case?
27. Composable vs Pinia?
28. Options Store vs Setup Store?
29. Why storeToRefs?
30. Pinia SSR risk?
31. Vue Router history vs hash?
32. Guard vs backend authorization?
33. Fetch before vs after navigation?
34. What are Router Data Loaders and what is their status?
35. Server state vs client state?
36. Vue SSR hydration mismatch causes?
37. Nuxt vs plain Vue?
38. How do you prevent cross-request state leakage?
39. Vue Test Utils?
40. How do you test composables?
41. Vue XSS rules?
42. Why is v-html dangerous?
43. Vue 2 vs Vue 3?
44. Composition vs Options API?
45. Vuex vs Pinia?
46. What is Vapor Mode?
47. Is Vue 3.6 stable today?
48. How do you optimize a huge list?
49. How do you debug lost reactivity?
50. What are the top Vue interview traps?


---

<!-- 208_PROJECT_CREATION.md -->

# Project Creation

## What / Why

Use create-vue.

## Mental Model

```text
npm create vue@latest
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Project Creation
</script>

<template>
  <div>Project Creation</div>
</template>
```

## When to Use

Use current official scaffolder.

## Common Mistake / Interview Trap

Vue CLI is legacy/maintenance for new apps.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Project Creation:** Use create-vue.


---

<!-- 208_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:

- Vue official documentation: https://vuejs.org/
- Vue core release/changelog
- Vue Router official documentation
- Pinia official documentation
- Vue TypeScript / language-tools documentation

## Current Baseline — September 15, 2026

```text
Vue stable: 3.5.42
Vue 3.6: Release Candidate (v3.6.0-rc.8 surfaced)
```

## Important Stable Feature Mapping

```text
Vue 3.4+
defineModel() recommended for component v-model

Vue 3.5+
Reactive Props Destructure
useTemplateRef()
lazy hydration strategies for async components
data-allow-mismatch hydration suppression
language-tools improvements for template refs
```

## Future / Pre-release

```text
Vue 3.6 RC:
Vapor Mode
major @vue/reactivity refactor based on alien-signals
```

## Router Note

Vue Router's newer Data Loaders documentation currently uses the `vue-router/experimental` entry point. Treat it as experimental and verify exact API status before production adoption.

## Pinia

Pinia remains the official/recommended store solution in the modern Vue ecosystem, with Options and Setup store styles plus SSR guidance.

## Accuracy Rule

Before production design, confirm:
- exact Vue / Router / Pinia versions,
- framework (Nuxt) compatibility,
- experimental feature status,
- browser/SSR requirements,
- security advisories.


---

<!-- 208_SSR_SECURITY.md -->

# SSR Security

## What / Why

Escape serialized state and isolate request state.

## Mental Model

```text
server request → isolated app/store
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: SSR Security
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use framework-recommended serializers.

## Common Mistake / Interview Trap

Cross-request singleton state can leak user data.

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

> **SSR Security:** Escape serialized state and isolate request state.


---

<!-- 209_FEATURE_FIRST_FOLDERS.md -->

# Feature-First Folders

## What / Why

Organize code by business feature.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Feature-First Folders
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in medium/large apps.

## Common Mistake / Interview Trap

Avoid giant global components/composables/services folders.

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

> **Feature-First Folders:** Organize code by business feature.


---

<!-- 209_VITE_DEV_SERVER.md -->

# Vite Dev Server

## What / Why

Runs fast dev environment.

## Mental Model

```text
npm run dev
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vite Dev Server
</script>

<template>
  <div>Vite Dev Server</div>
</template>
```

## When to Use

Use local development.

## Common Mistake / Interview Trap

Not a production server.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vite Dev Server:** Runs fast dev environment.


---

<!-- 210_BUILD.md -->

# Build

## What / Why

Produces production assets.

## Mental Model

```text
npm run build
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Build
</script>

<template>
  <div>Build</div>
</template>
```

## When to Use

Use CI build with type/lint/tests.

## Common Mistake / Interview Trap

Inspect chunk warnings/budgets.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Build:** Produces production assets.


---

<!-- 210_COMPONENT_COMPOSITION.md -->

# Component Composition

## What / Why

Build pages from focused components with explicit props/emits/slots.

## Mental Model

```text
Page → Feature → UI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Component Composition
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use simple one-way contracts.

## Common Mistake / Interview Trap

Avoid prop drilling across many layers when context/store fits.

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

> **Component Composition:** Build pages from focused components with explicit props/emits/slots.


---

<!-- 211_CONTAINER_PRESENTATIONAL.md -->

# Container Presentational

## What / Why

Separate orchestration/data from reusable presentational UI when useful.

## Mental Model

```text
feature container → UI component
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Container Presentational
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use selectively.

## Common Mistake / Interview Trap

Composition API reduces need for rigid pattern everywhere.

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

> **Container Presentational:** Separate orchestration/data from reusable presentational UI when useful.


---

<!-- 211_PREVIEW.md -->

# Preview

## What / Why

Serves built output locally for verification.

## Mental Model

```text
npm run preview
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Preview
</script>

<template>
  <div>Preview</div>
</template>
```

## When to Use

Use smoke checks.

## Common Mistake / Interview Trap

Not production hosting.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Preview:** Serves built output locally for verification.


---

<!-- 212_HEADLESS_COMPONENT.md -->

# Headless Component

## What / Why

Expose behavior/state via composable or scoped slot without enforcing styles.

## Mental Model

```text
behavior → consumer template
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Headless Component
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use design systems.

## Common Mistake / Interview Trap

Public contract must remain small.

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

> **Headless Component:** Expose behavior/state via composable or scoped slot without enforcing styles.


---

<!-- 212_TYPE_CHECK.md -->

# Type Check

## What / Why

Use vue-tsc or generated script.

## Mental Model

```text
npm run type-check
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Type Check
</script>

<template>
  <div>Type Check</div>
</template>
```

## When to Use

Run in CI.

## Common Mistake / Interview Trap

Do not rely only on editor types.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Type Check:** Use vue-tsc or generated script.


---

<!-- 213_DESIGN_SYSTEM.md -->

# Design System

## What / Why

Share tokens, primitives, patterns, accessibility.

## Mental Model

```text
tokens → components → features
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Design System
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use governed versioning.

## Common Mistake / Interview Trap

Do not put domain business logic in UI library.

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

> **Design System:** Share tokens, primitives, patterns, accessibility.


---

<!-- 213_LINT.md -->

# Lint

## What / Why

Use ESLint ecosystem/config chosen by create-vue.

## Mental Model

```text
npm run lint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lint
</script>

<template>
  <div>Lint</div>
</template>
```

## When to Use

Use CI.

## Common Mistake / Interview Trap

Keep rules aligned with Vue/TS versions.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Lint:** Use ESLint ecosystem/config chosen by create-vue.


---

<!-- 214_API_ADAPTER.md -->

# API Adapter

## What / Why

Maps backend DTO/protocol into domain-facing API.

## Mental Model

```text
feature → adapter → API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: API Adapter
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when backend shape differs from UI/domain model.

## Common Mistake / Interview Trap

Avoid layers that add no semantic value.

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

> **API Adapter:** Maps backend DTO/protocol into domain-facing API.


---

<!-- 214_DEVTOOLS.md -->

# DevTools

## What / Why

Vue DevTools inspects components, Pinia, events and performance.

## Mental Model

```text
browser devtools
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: DevTools
</script>

<template>
  <div>DevTools</div>
</template>
```

## When to Use

Use for runtime diagnosis.

## Common Mistake / Interview Trap

Production monitoring still needs telemetry.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **DevTools:** Vue DevTools inspects components, Pinia, events and performance.


---

<!-- 215_FACADE.md -->

# Facade

## What / Why

Provides feature-friendly surface over stores/router/API.

## Mental Model

```text
component → facade → Pinia/API
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Facade
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use to isolate infrastructure and simplify components.

## Common Mistake / Interview Trap

A facade that merely renames every method adds noise.

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

> **Facade:** Provides feature-friendly surface over stores/router/API.


---

<!-- 215_VERSION_CHECK.md -->

# Version Check

## What / Why

Inspect package.json/npm.

## Mental Model

```text
npm view vue version
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Version Check
</script>

<template>
  <div>Version Check</div>
</template>
```

## When to Use

Use before upgrades.

## Common Mistake / Interview Trap

Stable and prerelease tags differ.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Version Check:** Inspect package.json/npm.


---

<!-- 216_PLUGIN_ARCHITECTURE.md -->

# Plugin Architecture

## What / Why

Vue `app.use()` installs app-level plugins.

## Mental Model

```text
app.use(router/pinia/plugin)
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Plugin Architecture
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for framework-wide capabilities.

## Common Mistake / Interview Trap

Plugins can hide global side effects; document them.

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

> **Plugin Architecture:** Vue `app.use()` installs app-level plugins.


---

<!-- 216_UPGRADE_STRATEGY.md -->

# Upgrade Strategy

## What / Why

Read Vue changelog and ecosystem compatibility before minor/major upgrades.

## Mental Model

```text
pin → test → upgrade
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Upgrade Strategy
</script>

<template>
  <div>Upgrade Strategy</div>
</template>
```

## When to Use

Use SemVer carefully.

## Common Mistake / Interview Trap

Vue notes that TypeScript definition changes may occur in minors.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Upgrade Strategy:** Read Vue changelog and ecosystem compatibility before minor/major upgrades.


---

<!-- 217_PROVIDE_INJECT_CONTEXT.md -->

# provide/inject Context

## What / Why

Use tree-scoped dependencies instead of globals.

## Mental Model

```text
provider subtree → inject
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: provide/inject Context
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for libraries/layout context.

## Common Mistake / Interview Trap

Not a replacement for app-wide state in every case.

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

> **provide/inject Context:** Use tree-scoped dependencies instead of globals.


---

<!-- 217_VUE_VS_REACT.md -->

# Vue vs React

## What / Why

Vue is a progressive framework with built-in reactivity/compiler and official router/state ecosystem; React is a UI library with different rendering/state conventions.

## Mental Model

```text
Vue vs React mental models
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue vs React
</script>

<template>
  <div>Vue vs React</div>
</template>
```

## When to Use

Discuss trade-offs rather than preference.

## Common Mistake / Interview Trap

Do not reduce comparison to syntax.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue vs React:** Vue is a progressive framework with built-in reactivity/compiler and official router/state ecosystem; React is a UI library with different rendering/state conventions.


---

<!-- 218_MICROFRONTEND_VUE.md -->

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


---

<!-- 218_VUE_VS_ANGULAR.md -->

# Vue vs Angular

## What / Why

Vue is lighter/progressive; Angular is a batteries-included enterprise framework with first-party DI/forms/router/HTTP/tooling.

## Mental Model

```text
progressive vs full framework
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue vs Angular
</script>

<template>
  <div>Vue vs Angular</div>
</template>
```

## When to Use

Compare team scale/architecture needs.

## Common Mistake / Interview Trap

Do not say Vue cannot scale.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue vs Angular:** Vue is lighter/progressive; Angular is a batteries-included enterprise framework with first-party DI/forms/router/HTTP/tooling.


---

<!-- 219_COMPOSITION_VS_OPTIONS_API.md -->

# Composition vs Options API

## What / Why

Both are supported in Vue 3; Composition API + script setup is preferred for complex reusable TypeScript logic.

## Mental Model

```text
setup/ref/computed vs data/methods/computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Composition vs Options API
</script>

<template>
  <div>Composition vs Options API</div>
</template>
```

## When to Use

Know both for maintenance/interviews.

## Common Mistake / Interview Trap

Options API is not deprecated.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Composition vs Options API:** Both are supported in Vue 3; Composition API + script setup is preferred for complex reusable TypeScript logic.


---

<!-- 219_CUSTOM_ELEMENTS.md -->

# Custom Elements

## What / Why

Vue can define custom elements for cross-framework integration.

## Mental Model

```text
defineCustomElement
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Custom Elements
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for embeddable widgets.

## Common Mistake / Interview Trap

Styling/dependency/context behavior differs from normal app components.

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

> **Custom Elements:** Vue can define custom elements for cross-framework integration.


---

<!-- 220_ERROR_ARCHITECTURE.md -->

# Error Architecture

## What / Why

Use local error states, onErrorCaptured/app errorHandler, router/framework error boundaries, telemetry.

## Mental Model

```text
error → local/global handler → UX + telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Error Architecture
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use layered recovery.

## Common Mistake / Interview Trap

One global error handler should not replace local UX.

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

> **Error Architecture:** Use local error states, onErrorCaptured/app errorHandler, router/framework error boundaries, telemetry.


---

<!-- 220_REF_VS_REACTIVE.md -->

# ref vs reactive

## What / Why

ref wraps a value; reactive proxies an object.

## Mental Model

```text
ref.value vs proxy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: ref vs reactive
</script>

<template>
  <div>ref vs reactive</div>
</template>
```

## When to Use

Use based on replacement/destructuring needs.

## Common Mistake / Interview Trap

Destructuring reactive object can lose reactivity.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **ref vs reactive:** ref wraps a value; reactive proxies an object.


---

<!-- 221_COMPUTED_VS_WATCH.md -->

# computed vs watch

## What / Why

computed derives value; watch performs side effect.

## Mental Model

```text
derived vs side effect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: computed vs watch
</script>

<template>
  <div>computed vs watch</div>
</template>
```

## When to Use

Use computed whenever result is just another value.

## Common Mistake / Interview Trap

Using watch to maintain duplicated derived state is a smell.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **computed vs watch:** computed derives value; watch performs side effect.


---

<!-- 221_OBSERVABILITY.md -->

# Observability

## What / Why

Capture route, version, API timing, component errors, backend trace IDs.

## Mental Model

```text
frontend telemetry
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Observability
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use release-aware monitoring.

## Common Mistake / Interview Trap

Do not log secrets or sensitive payloads.

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

> **Observability:** Capture route, version, API timing, component errors, backend trace IDs.


---

<!-- 222_CONFIGURATION.md -->

# Configuration

## What / Why

Separate build-time public config from server/private config.

## Mental Model

```text
Vite env/runtime endpoint
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Configuration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed validated config.

## Common Mistake / Interview Trap

Client config is never secret.

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

> **Configuration:** Separate build-time public config from server/private config.


---

<!-- 222_WATCH_VS_WATCHEFFECT.md -->

# watch vs watchEffect

## What / Why

watch has explicit sources; watchEffect auto-tracks dependencies.

## Mental Model

```text
explicit vs implicit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: watch vs watchEffect
</script>

<template>
  <div>watch vs watchEffect</div>
</template>
```

## When to Use

Use based on clarity/control.

## Common Mistake / Interview Trap

Async watchEffect only tracks dependencies accessed before first await.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **watch vs watchEffect:** watch has explicit sources; watchEffect auto-tracks dependencies.


---

<!-- 223_VUE_VS_NUXT_DECISION.md -->

# Vue vs Nuxt Decision

## What / Why

Use plain Vue for custom SPA/library control; Nuxt for full-stack routing/data/SSR conventions.

## Mental Model

```text
Vue stack vs Nuxt framework
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue vs Nuxt Decision
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose from product requirements.

## Common Mistake / Interview Trap

Framework adoption adds conventions and server runtime responsibilities.

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

> **Vue vs Nuxt Decision:** Use plain Vue for custom SPA/library control; Nuxt for full-stack routing/data/SSR conventions.


---

<!-- 223_V_IF_VS_V_SHOW.md -->

# v-if vs v-show

## What / Why

v-if mounts/unmounts; v-show toggles display.

## Mental Model

```text
lifecycle vs CSS
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: v-if vs v-show
</script>

<template>
  <div>v-if vs v-show</div>
</template>
```

## When to Use

Choose based on toggle frequency/initial cost.

## Common Mistake / Interview Trap

v-show does not work the same for template fragments.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **v-if vs v-show:** v-if mounts/unmounts; v-show toggles display.


---

<!-- 224_CREATE_VUE.md -->

# create-vue

## What / Why

Official project scaffolding workflow for Vue.

## Mental Model

```text
npm create vue@latest
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: create-vue
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for new Vite-based Vue apps.

## Common Mistake / Interview Trap

Select Router/Pinia/TS/testing based on needs.

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

> **create-vue:** Official project scaffolding workflow for Vue.


---

<!-- 224_PROP_MUTATION.md -->

# Prop Mutation

## What / Why

Props are readonly from child perspective.

## Mental Model

```text
parent source → prop
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Prop Mutation
</script>

<template>
  <div>Prop Mutation</div>
</template>
```

## When to Use

Emit intent/model update instead.

## Common Mistake / Interview Trap

Mutating nested prop objects can still mutate parent-owned data and is usually a design smell.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Prop Mutation:** Props are readonly from child perspective.


---

<!-- 225_LOST_REACTIVITY.md -->

# Lost Reactivity

## What / Why

Destructuring reactive object/property without ref-aware helper/compiler support.

## Mental Model

```text
const {x}=reactiveObj
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Lost Reactivity
</script>

<template>
  <div>Lost Reactivity</div>
</template>
```

## When to Use

Use toRefs/toRef or direct access.

## Common Mistake / Interview Trap

Vue 3.5 reactive props destructure is a special compiler-supported case.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Lost Reactivity:** Destructuring reactive object/property without ref-aware helper/compiler support.


---

<!-- 225_VITE.md -->

# Vite

## What / Why

Default modern dev/build tooling in Vue ecosystem.

## Mental Model

```text
dev server + Rollup production build
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vite
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for fast SPA/library workflow.

## Common Mistake / Interview Trap

Vite is tooling, not Vue itself.

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

> **Vite:** Default modern dev/build tooling in Vue ecosystem.


---

<!-- 226_INFINITE_WATCH_LOOP.md -->

# Infinite Watch Loop

## What / Why

Watcher mutates its own triggering source repeatedly.

## Mental Model

```text
watch → mutate source → watch
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Infinite Watch Loop
</script>

<template>
  <div>Infinite Watch Loop</div>
</template>
```

## When to Use

Fix ownership/condition.

## Common Mistake / Interview Trap

Do not paper over with flags unless domain rule requires.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Infinite Watch Loop:** Watcher mutates its own triggering source repeatedly.


---

<!-- 226_VUE_DEVTOOLS.md -->

# Vue DevTools

## What / Why

Inspects component tree, state, Pinia and performance.

## Mental Model

```text
browser devtools
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue DevTools
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for debugging.

## Common Mistake / Interview Trap

Production issue analysis still needs app telemetry.

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

> **Vue DevTools:** Inspects component tree, state, Pinia and performance.


---

<!-- 227_ESLINT.md -->

# ESLint

## What / Why

Static analysis for Vue/TS/code quality.

## Mental Model

```text
eslint-plugin-vue
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ESLint
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use project rules and CI.

## Common Mistake / Interview Trap

Lint cannot replace runtime tests.

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

> **ESLint:** Static analysis for Vue/TS/code quality.


---

<!-- 227_STALE_ASYNC_RESPONSE.md -->

# Stale Async Response

## What / Why

Earlier request resolves after newer one.

## Mental Model

```text
watch cleanup/AbortController
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Stale Async Response
</script>

<template>
  <div>Stale Async Response</div>
</template>
```

## When to Use

Cancel or validate request identity.

## Common Mistake / Interview Trap

Latest UI should not be overwritten by stale response.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Stale Async Response:** Earlier request resolves after newer one.


---

<!-- 228_DUPLICATE_HTTP.md -->

# Duplicate HTTP

## What / Why

Composable/component called multiple times or multiple subscriptions/watchers trigger same request.

## Mental Model

```text
ownership/caching
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Duplicate HTTP
</script>

<template>
  <div>Duplicate HTTP</div>
</template>
```

## When to Use

Centralize server state or dedupe.

## Common Mistake / Interview Trap

Vue itself does not automatically cache fetches.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Duplicate HTTP:** Composable/component called multiple times or multiple subscriptions/watchers trigger same request.


---

<!-- 228_PRETTIER.md -->

# Prettier

## What / Why

Formatting tool.

## Mental Model

```text
format on save/CI
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Prettier
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use consistent formatting.

## Common Mistake / Interview Trap

Formatting is not architecture.

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

> **Prettier:** Formatting tool.


---

<!-- 229_KEEPALIVE_SURPRISE.md -->

# KeepAlive Surprise

## What / Why

Cached component does not unmount.

## Mental Model

```text
activated/deactivated lifecycle
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: KeepAlive Surprise
</script>

<template>
  <div>KeepAlive Surprise</div>
</template>
```

## When to Use

Pause/restart resources correctly.

## Common Mistake / Interview Trap

Do not rely on onUnmounted for cached inactivity.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **KeepAlive Surprise:** Cached component does not unmount.


---

<!-- 229_VUE_TSC.md -->

# vue-tsc

## What / Why

Type-checks Vue SFCs/templates with TypeScript.

## Mental Model

```text
vue-tsc --noEmit
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: vue-tsc
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use in CI for TS projects.

## Common Mistake / Interview Trap

Bundler transpilation can succeed with type errors unless checked.

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

> **vue-tsc:** Type-checks Vue SFCs/templates with TypeScript.


---

<!-- 230_BUILD.md -->

# Build

## What / Why

Vite builds optimized production assets.

## Mental Model

```text
npm run build
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use production mode.

## Common Mistake / Interview Trap

Deploy server fallback correctly for history routing.

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

> **Build:** Vite builds optimized production assets.


---

<!-- 230_TELEPORT_SURPRISE.md -->

# Teleport Surprise

## What / Why

DOM target differs but component event/injection ownership stays logical.

## Mental Model

```text
logical tree ≠ DOM tree
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Teleport Surprise
</script>

<template>
  <div>Teleport Surprise</div>
</template>
```

## When to Use

Use for overlays.

## Common Mistake / Interview Trap

CSS stacking/focus issues remain.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Teleport Surprise:** DOM target differs but component event/injection ownership stays logical.


---

<!-- 231_HYDRATION_MISMATCH.md -->

# Hydration Mismatch

## What / Why

SSR and client initial output differ.

## Mental Model

```text
random/time/browser-only data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Hydration Mismatch
</script>

<template>
  <div>Hydration Mismatch</div>
</template>
```

## When to Use

Make deterministic.

## Common Mistake / Interview Trap

Fix mismatch rather than ignoring warnings.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Hydration Mismatch:** SSR and client initial output differ.


---

<!-- 231_PREVIEW_BUILD.md -->

# Preview Build

## What / Why

Vite preview serves built assets locally.

## Mental Model

```text
npm run preview
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Preview Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for smoke testing production output.

## Common Mistake / Interview Trap

Not intended as hardened production server.

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

> **Preview Build:** Vite preview serves built assets locally.


---

<!-- 232_BUNDLE_ANALYSIS.md -->

# Bundle Analysis

## What / Why

Analyze chunks/dependencies.

## Mental Model

```text
rollup visualizer/etc.
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Bundle Analysis
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use before performance changes.

## Common Mistake / Interview Trap

Measure actual load/parse/runtime costs.

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

> **Bundle Analysis:** Analyze chunks/dependencies.


---

<!-- 232_PINIA_DESTRUCTURE_BUG.md -->

# Pinia Destructure Bug

## What / Why

Direct destructure of store state loses reactive linkage.

## Mental Model

```text
storeToRefs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Pinia Destructure Bug
</script>

<template>
  <div>Pinia Destructure Bug</div>
</template>
```

## When to Use

Use storeToRefs for state/getters.

## Common Mistake / Interview Trap

Actions can be destructured normally.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Pinia Destructure Bug:** Direct destructure of store state loses reactive linkage.


---

<!-- 233_ENVIRONMENT_VARIABLES.md -->

# Environment Variables

## What / Why

Vite exposes prefixed client env vars.

## Mental Model

```text
import.meta.env
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Environment Variables
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use for public build config.

## Common Mistake / Interview Trap

Never store secrets.

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

> **Environment Variables:** Vite exposes prefixed client env vars.


---

<!-- 233_VUE_2_VS_VUE_3.md -->

# Vue 2 vs Vue 3

## What / Why

Vue 3 is current; Vue 2 reached EOL Dec 31, 2023.

## Mental Model

```text
migration context
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue 2 vs Vue 3
</script>

<template>
  <div>Vue 2 vs Vue 3</div>
</template>
```

## When to Use

Know old code but recommend Vue 3.

## Common Mistake / Interview Trap

Do not propose Vue 2 for new apps.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue 2 vs Vue 3:** Vue 3 is current; Vue 2 reached EOL Dec 31, 2023.


---

<!-- 234_VUE_2_VS_VUE_3.md -->

# Vue 2 vs Vue 3

## What / Why

Vue 3 uses createApp, Proxy-based reactivity, Composition API, improved TS/tree-shaking/fragments/teleport etc.

## Mental Model

```text
Vue2 → Vue3
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vue 2 vs Vue 3
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know migration differences for enterprise interviews.

## Common Mistake / Interview Trap

Do not use Vue 2 patterns as default for new code.

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

> **Vue 2 vs Vue 3:** Vue 3 uses createApp, Proxy-based reactivity, Composition API, improved TS/tree-shaking/fragments/teleport etc.


---

<!-- 234_VUE_3_5_VS_3_6.md -->

# Vue 3.5 vs 3.6

## What / Why

3.5.42 is stable baseline; 3.6 is still prerelease/RC as of Sep 15 2026.

## Mental Model

```text
stable vs RC
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Vue 3.5 vs 3.6
</script>

<template>
  <div>Vue 3.5 vs 3.6</div>
</template>
```

## When to Use

Use 3.5.x for production guidance.

## Common Mistake / Interview Trap

Do not recommend 3.6 RC as current stable.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Vue 3.5 vs 3.6:** 3.5.42 is stable baseline; 3.6 is still prerelease/RC as of Sep 15 2026.


---

<!-- 235_INTERVIEW_TRAPS.md -->

# Interview Traps

## What / Why

Version-sensitive misconceptions.

## Mental Model

```text
Vue3.5/Composition/Pinia/Vite/SSR
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall area for: Interview Traps
</script>

<template>
  <div>Interview Traps</div>
</template>
```

## When to Use

Use final recall.

## Common Mistake / Interview Trap

See dedicated trap sheet.

## Production Questions

```text
Who owns this state?
Is it local, URL, server, or Pinia state?
What triggers the reactive update?
Does SSR/hydration change the behavior?
What is the loading/error state?
How is cleanup handled?
How is this tested?
```

## 20-Second Recall

> **Interview Traps:** Version-sensitive misconceptions.


---

<!-- 235_OPTIONS_API.md -->

# Options API

## What / Why

Organizes component by data/computed/methods/watch/lifecycle options.

## Mental Model

```text
export default {data,computed,methods}
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Options API
// Use the concrete API described above in real code.
</script>
```

## When to Use

Still fully supported and useful.

## Common Mistake / Interview Trap

Composition API is often better for complex reusable logic, not automatically for every tiny component.

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

> **Options API:** Organizes component by data/computed/methods/watch/lifecycle options.


---

<!-- 236_THIS_IN_OPTIONS_API.md -->

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


---

<!-- 237_FILTERS_REMOVED.md -->

# Filters Removed

## What / Why

Vue 3 removed template filters from core.

## Mental Model

```text
Vue2 filters → methods/computed
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Filters Removed
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know migration point.

## Common Mistake / Interview Trap

Use computed/functions for formatting.

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

> **Filters Removed:** Vue 3 removed template filters from core.


---

<!-- 238_GLOBAL_API_CHANGES.md -->

# Global API Changes

## What / Why

Vue 3 scopes app configuration to createApp instance.

## Mental Model

```text
Vue.createApp / app.use
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Global API Changes
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use per-app plugins/config.

## Common Mistake / Interview Trap

Reduces global test pollution.

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

> **Global API Changes:** Vue 3 scopes app configuration to createApp instance.


---

<!-- 239_V_MODEL_MIGRATION.md -->

# v-model Migration

## What / Why

Vue 3 standardizes modelValue/update:modelValue and modern defineModel.

## Mental Model

```text
Vue2 value/input → Vue3 model contract
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: v-model Migration
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know legacy custom input migration.

## Common Mistake / Interview Trap

Do not mix old custom model event conventions blindly.

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

> **v-model Migration:** Vue 3 standardizes modelValue/update:modelValue and modern defineModel.


---

<!-- 240_FRAGMENTS.md -->

# Fragments

## What / Why

Vue 3 supports multiple root nodes.

## Mental Model

```text
multiple roots
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Fragments
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use when semantic wrapper unnecessary.

## Common Mistake / Interview Trap

Fallthrough attrs need explicit handling with multiple roots.

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

> **Fragments:** Vue 3 supports multiple root nodes.


---

<!-- 241_COMPAT_BUILD.md -->

# Compat Build

## What / Why

Vue compat build supports staged migration.

## Mental Model

```text
@vue/compat
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Compat Build
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use temporary migration path.

## Common Mistake / Interview Trap

Do not keep compat warnings indefinitely.

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

> **Compat Build:** Vue compat build supports staged migration.


---

<!-- 242_VUEX_TO_PINIA.md -->

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


---

<!-- 243_VETUR_TO_VUE_LANGUAGE_TOOLS.md -->

# Vetur to Vue Language Tools

## What / Why

Modern Vue tooling uses Vue language tools/Volar lineage.

## Mental Model

```text
modern language service
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Vetur to Vue Language Tools
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use current extension/tooling.

## Common Mistake / Interview Trap

Old editor troubleshooting advice may be obsolete.

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

> **Vetur to Vue Language Tools:** Modern Vue tooling uses Vue language tools/Volar lineage.


---

<!-- 244_WHY_VUE_UPDATES.md -->

# Why Vue Updates

## What / Why

Reactive dependency changes trigger affected render effects; compiler/runtime optimize patching.

## Mental Model

```text
mutation → tracked dependency → update
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Why Vue Updates
// Use the concrete API described above in real code.
</script>
```

## When to Use

Explain dependency tracking, not 'whole DOM rerenders'.

## Common Mistake / Interview Trap

Reactive mutation and DOM flush are asynchronous/batched.

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

> **Why Vue Updates:** Reactive dependency changes trigger affected render effects; compiler/runtime optimize patching.


---

<!-- 245_REF_VS_REACTIVE_INTERVIEW.md -->

# ref vs reactive Interview

## What / Why

ref wraps a value; reactive proxies object; both participate in same reactivity graph.

## Mental Model

```text
ref.value vs reactive.prop
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: ref vs reactive Interview
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose by ergonomics/identity.

## Common Mistake / Interview Trap

Reactive object destructuring needs care.

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

> **ref vs reactive Interview:** ref wraps a value; reactive proxies object; both participate in same reactivity graph.


---

<!-- 246_COMPUTED_VS_WATCH.md -->

# computed vs watch

## What / Why

computed derives value; watch performs side effects.

## Mental Model

```text
derived vs effect
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: computed vs watch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use computed whenever output is pure derivation.

## Common Mistake / Interview Trap

Watching just to set another derived ref is often redundant.

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

> **computed vs watch:** computed derives value; watch performs side effects.


---

<!-- 247_WATCH_VS_WATCHEFFECT.md -->

# watch vs watchEffect

## What / Why

watch uses explicit source and old/new; watchEffect auto-tracks dependencies.

## Mental Model

```text
explicit vs auto
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: watch vs watchEffect
// Use the concrete API described above in real code.
</script>
```

## When to Use

Choose based on control/clarity.

## Common Mistake / Interview Trap

Async watchEffect dependency tracking can surprise after await.

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

> **watch vs watchEffect:** watch uses explicit source and old/new; watchEffect auto-tracks dependencies.


---

<!-- 248_PROPS_MUTATION.md -->

# Props Mutation

## What / Why

Props are readonly in child.

## Mental Model

```text
parent → prop → child
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Props Mutation
// Use the concrete API described above in real code.
</script>
```

## When to Use

Emit/model local changes.

## Common Mistake / Interview Trap

Mutating nested object through prop can still mutate parent-owned data; avoid hidden mutation.

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

> **Props Mutation:** Props are readonly in child.


---

<!-- 249_DESTRUCTURING_REACTIVITY.md -->

# Destructuring Reactivity

## What / Why

Reactive props destructure works in Vue 3.5 script setup, but ordinary reactive object destructuring rules still matter.

## Mental Model

```text
props compiler transform vs generic object
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Destructuring Reactivity
// Use the concrete API described above in real code.
</script>
```

## When to Use

Know context.

## Common Mistake / Interview Trap

Do not generalize reactive-props destructure to every reactive object.

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

> **Destructuring Reactivity:** Reactive props destructure works in Vue 3.5 script setup, but ordinary reactive object destructuring rules still matter.


---

<!-- 250_PINIA_DESTRUCTURING.md -->

# Pinia Destructuring

## What / Why

Direct store destructuring can lose reactivity; use storeToRefs for state/getters.

## Mental Model

```text
storeToRefs
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Pinia Destructuring
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use actions directly from store.

## Common Mistake / Interview Trap

Common Pinia interview bug.

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

> **Pinia Destructuring:** Direct store destructuring can lose reactivity; use storeToRefs for state/getters.


---

<!-- 251_DUPLICATE_REQUESTS.md -->

# Duplicate Requests

## What / Why

Repeated watchers/subscriptions/lifecycle calls trigger fetches.

## Mental Model

```text
inspect ownership/cancellation
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Duplicate Requests
// Use the concrete API described above in real code.
</script>
```

## When to Use

Deduplicate/cache/cancel.

## Common Mistake / Interview Trap

Do not assume framework automatically caches.

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

> **Duplicate Requests:** Repeated watchers/subscriptions/lifecycle calls trigger fetches.


---

<!-- 252_STALE_ASYNC_RESULT.md -->

# Stale Async Result

## What / Why

Older request finishes after newer request.

## Mental Model

```text
abort/token/latest-id
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Stale Async Result
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use watcher cleanup or query library.

## Common Mistake / Interview Trap

Race bugs often appear only on slow networks.

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

> **Stale Async Result:** Older request finishes after newer request.


---

<!-- 253_HYDRATION_MISMATCH.md -->

# Hydration Mismatch

## What / Why

Server/client markup differs.

## Mental Model

```text
time/random/browser-only
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Hydration Mismatch
// Use the concrete API described above in real code.
</script>
```

## When to Use

Fix deterministic initial state.

## Common Mistake / Interview Trap

data-allow-mismatch should be selective.

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

> **Hydration Mismatch:** Server/client markup differs.


---

<!-- 254_MEMORY_LEAK.md -->

# Memory Leak

## What / Why

External listeners/timers/websockets/store subscriptions outlive scope.

## Mental Model

```text
cleanup
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Memory Leak
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use onScopeDispose/onUnmounted.

## Common Mistake / Interview Trap

Not every external resource auto-cleans.

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

> **Memory Leak:** External listeners/timers/websockets/store subscriptions outlive scope.


---

<!-- 255_PERFORMANCE_SLOW_LIST.md -->

# Performance Slow List

## What / Why

Too many DOM nodes/unstable props/heavy cells.

## Mental Model

```text
virtualize + stable data
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Performance Slow List
// Use the concrete API described above in real code.
</script>
```

## When to Use

Profile first.

## Common Mistake / Interview Trap

v-memo is not a substitute for virtualization.

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

> **Performance Slow List:** Too many DOM nodes/unstable props/heavy cells.


---

<!-- 256_ROUTER_REFRESH_404.md -->

# Router Refresh 404

## What / Why

History mode server lacks SPA fallback.

## Mental Model

```text
server rewrite
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Router Refresh 404
// Use the concrete API described above in real code.
</script>
```

## When to Use

Configure hosting.

## Common Mistake / Interview Trap

Hash history avoids server rewrite but changes URL.

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

> **Router Refresh 404:** History mode server lacks SPA fallback.


---

<!-- 257_KEEPALIVE_STALE_DATA.md -->

# KeepAlive Stale Data

## What / Why

Cached component retains state when route returns.

## Mental Model

```text
activated/deactivated/refetch policy
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: KeepAlive Stale Data
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use lifecycle deliberately.

## Common Mistake / Interview Trap

KeepAlive means not remounted.

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

> **KeepAlive Stale Data:** Cached component retains state when route returns.


---

<!-- 258_PROVIDE_INJECT_UNDEFINED.md -->

# provide inject Undefined

## What / Why

No ancestor provider or key mismatch.

## Mental Model

```text
trace provider tree/key
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: provide inject Undefined
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use typed Symbol keys.

## Common Mistake / Interview Trap

Defaults can hide configuration mistakes.

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

> **provide inject Undefined:** No ancestor provider or key mismatch.


---

<!-- 259_TELEPORT_MODAL_BUG.md -->

# Teleport Modal Bug

## What / Why

CSS/SSR target/focus differs after teleport.

## Mental Model

```text
target container + focus trap
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Teleport Modal Bug
// Use the concrete API described above in real code.
</script>
```

## When to Use

Test DOM context.

## Common Mistake / Interview Trap

Teleport changes DOM position but not component ownership.

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

> **Teleport Modal Bug:** CSS/SSR target/focus differs after teleport.


---

<!-- 260_INTERVIEW_TRAPS.md -->

# Interview Traps

## What / Why

Version-sensitive Vue misconceptions.

## Mental Model

```text
Vue3.5 stable / 3.6 RC / Composition+Options / Pinia / Router
```

## Example / Recall

```vue
<script setup lang="ts">
// Minimal recall placeholder for: Interview Traps
// Use the concrete API described above in real code.
</script>
```

## When to Use

Use final recall.

## Common Mistake / Interview Trap

See dedicated interview traps sheet.

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

> **Interview Traps:** Version-sensitive Vue misconceptions.
