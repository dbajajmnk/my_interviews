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
