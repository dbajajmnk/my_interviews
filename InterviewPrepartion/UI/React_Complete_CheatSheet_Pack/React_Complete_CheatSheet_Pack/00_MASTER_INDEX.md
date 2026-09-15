# React — Complete Cheat Sheet Pack

**Current baseline:** React 19.3 (September 2026).

**Purpose:** Fast revision for React development, architecture, interviews, performance, testing, server rendering, security, and production troubleshooting.

**Per-topic format:** What/Why → Mental Model → Example → When to Use → Trap → 20-second Recall

## Fast Revision

- `01_30_SECOND_RECALL.md`
- `02_CURRENT_REACT_19_3.md`
- `03_REACT_19_2_19_3_NEW_FEATURES.md`
- `04_REACT_COMPILER.md`

## Foundations

- React Mental Model — `005_REACT_MENTAL_MODEL.md`
- Components — `006_COMPONENTS.md`
- JSX — `007_JSX.md`
- Props — `008_PROPS.md`
- Children — `009_CHILDREN.md`
- Conditional Rendering — `010_CONDITIONAL_RENDERING.md`
- Lists and Keys — `011_LISTS_AND_KEYS.md`
- Events — `012_EVENTS.md`
- State as Snapshot — `013_STATE_AS_SNAPSHOT.md`
- Batching — `014_BATCHING.md`
- Render and Commit — `015_RENDER_AND_COMMIT.md`
- Purity — `016_PURITY.md`
- State Preservation — `017_STATE_PRESERVATION.md`
- Lifting State Up — `018_LIFTING_STATE_UP.md`
- Controlled vs Uncontrolled — `019_CONTROLLED_VS_UNCONTROLLED.md`

## Hooks Core

- useState — `020_USESTATE.md`
- useReducer — `021_USEREDUCER.md`
- useContext — `022_USECONTEXT.md`
- createContext — `023_CREATECONTEXT.md`
- useRef — `024_USEREF.md`
- useImperativeHandle — `025_USEIMPERATIVEHANDLE.md`
- useEffect — `026_USEEFFECT.md`
- useLayoutEffect — `027_USELAYOUTEFFECT.md`
- useInsertionEffect — `028_USEINSERTIONEFFECT.md`
- useEffectEvent — `029_USEEFFECTEVENT.md`
- useMemo — `030_USEMEMO.md`
- useCallback — `031_USECALLBACK.md`
- useTransition — `032_USETRANSITION.md`
- startTransition — `033_STARTTRANSITION.md`
- useDeferredValue — `034_USEDEFERREDVALUE.md`
- useId — `035_USEID.md`
- useSyncExternalStore — `036_USESYNCEXTERNALSTORE.md`
- useDebugValue — `037_USEDEBUGVALUE.md`
- Custom Hooks — `038_CUSTOM_HOOKS.md`
- Rules of Hooks — `039_RULES_OF_HOOKS.md`

## State & Data Flow Patterns

- Derived State — `040_DERIVED_STATE.md`
- Reducer Pattern — `041_REDUCER_PATTERN.md`
- State Normalization — `042_STATE_NORMALIZATION.md`
- State Colocation — `043_STATE_COLOCATION.md`
- Context + Reducer — `044_CONTEXT_REDUCER.md`
- Server State vs Client State — `045_SERVER_STATE_VS_CLIENT_STATE.md`
- URL State — `046_URL_STATE.md`
- Form State — `047_FORM_STATE.md`
- Optimistic State — `048_OPTIMISTIC_STATE.md`

## Effects & Escape Hatches

- You Might Not Need an Effect — `049_YOU_MIGHT_NOT_NEED_AN_EFFECT.md`
- Effect Dependencies — `050_EFFECT_DEPENDENCIES.md`
- Effect Cleanup — `051_EFFECT_CLEANUP.md`
- Stale Closures — `052_STALE_CLOSURES.md`
- Refs as Escape Hatch — `053_REFS_AS_ESCAPE_HATCH.md`
- Portals — `054_PORTALS.md`
- flushSync — `055_FLUSHSYNC.md`
- StrictMode — `056_STRICTMODE.md`

## Modern React 19.x

- Actions — `057_ACTIONS.md`
- useActionState — `058_USEACTIONSTATE.md`
- useOptimistic — `059_USEOPTIMISTIC.md`
- useFormStatus — `060_USEFORMSTATUS.md`
- use — `061_USE.md`
- ref as Prop — `062_REF_AS_PROP.md`
- Context Provider Shorthand — `063_CONTEXT_PROVIDER_SHORTHAND.md`
- Document Metadata — `064_DOCUMENT_METADATA.md`
- Resource Preloading APIs — `065_RESOURCE_PRELOADING_APIS.md`
- Activity — `066_ACTIVITY.md`
- ViewTransition — `067_VIEWTRANSITION.md`
- Fragment Refs — `068_FRAGMENT_REFS.md`
- browser API — `069_BROWSER_API.md`
- Trusted Types Support — `070_TRUSTED_TYPES_SUPPORT.md`
- cache — `071_CACHE.md`
- cacheSignal — `072_CACHESIGNAL.md`
- Partial Pre-rendering — `073_PARTIAL_PRE_RENDERING.md`
- React Performance Tracks — `074_REACT_PERFORMANCE_TRACKS.md`
- React Compiler — `075_REACT_COMPILER.md`

## Rendering, Suspense & Server

- React.lazy — `076_REACT_LAZY.md`
- Suspense — `077_SUSPENSE.md`
- Suspense Boundaries — `078_SUSPENSE_BOUNDARIES.md`
- Streaming SSR — `079_STREAMING_SSR.md`
- Hydration — `080_HYDRATION.md`
- Hydration Mismatch — `081_HYDRATION_MISMATCH.md`
- Server Components — `082_SERVER_COMPONENTS.md`
- Client Components — `083_CLIENT_COMPONENTS.md`
- Server Functions — `084_SERVER_FUNCTIONS.md`
- Error Boundaries — `085_ERROR_BOUNDARIES.md`
- Activity vs Conditional Rendering — `086_ACTIVITY_VS_CONDITIONAL_RENDERING.md`

## Performance

- React.memo — `087_REACT_MEMO.md`
- Memoization Strategy — `088_MEMOIZATION_STRATEGY.md`
- Profiler — `089_PROFILER.md`
- Code Splitting — `090_CODE_SPLITTING.md`
- Bundle Budget — `091_BUNDLE_BUDGET.md`
- List Performance — `092_LIST_PERFORMANCE.md`
- State Granularity — `093_STATE_GRANULARITY.md`
- Transition Scheduling — `094_TRANSITION_SCHEDULING.md`
- Deferred Rendering — `095_DEFERRED_RENDERING.md`
- Avoiding Waterfalls — `096_AVOIDING_WATERFALLS.md`
- Images & Assets — `097_IMAGES_ASSETS.md`
- React Compiler Strategy — `098_REACT_COMPILER_STRATEGY.md`

## Forms

- Controlled Inputs — `099_CONTROLLED_INPUTS.md`
- Uncontrolled Inputs — `100_UNCONTROLLED_INPUTS.md`
- FormData — `101_FORMDATA.md`
- Validation — `102_VALIDATION.md`
- Pending Submit UI — `103_PENDING_SUBMIT_UI.md`
- Optimistic Forms — `104_OPTIMISTIC_FORMS.md`
- File Inputs — `105_FILE_INPUTS.md`

## Architecture & Ecosystem

- Component Composition — `106_COMPONENT_COMPOSITION.md`
- Container / Presentational Split — `107_CONTAINER_PRESENTATIONAL_SPLIT.md`
- Compound Components — `108_COMPOUND_COMPONENTS.md`
- Headless Component Pattern — `109_HEADLESS_COMPONENT_PATTERN.md`
- Render Props — `110_RENDER_PROPS.md`
- Higher-Order Components — `111_HIGHER_ORDER_COMPONENTS.md`
- Custom Hook Architecture — `112_CUSTOM_HOOK_ARCHITECTURE.md`
- Feature Folder Architecture — `113_FEATURE_FOLDER_ARCHITECTURE.md`
- State Management Decision — `114_STATE_MANAGEMENT_DECISION.md`
- External Store Pattern — `115_EXTERNAL_STORE_PATTERN.md`
- Server Cache Pattern — `116_SERVER_CACHE_PATTERN.md`
- Routing — `117_ROUTING.md`
- Data Fetching — `118_DATA_FETCHING.md`
- Framework-First Production Apps — `119_FRAMEWORK_FIRST_PRODUCTION_APPS.md`
- Build-Tool App — `120_BUILD_TOOL_APP.md`
- Create React App Deprecation — `121_CREATE_REACT_APP_DEPRECATION.md`

## TypeScript

- Typing Props — `122_TYPING_PROPS.md`
- Typing Events — `123_TYPING_EVENTS.md`
- Typing Refs — `124_TYPING_REFS.md`
- Typing Children — `125_TYPING_CHILDREN.md`
- Discriminated Unions — `126_DISCRIMINATED_UNIONS.md`
- Generic Components — `127_GENERIC_COMPONENTS.md`
- Reducer Types — `128_REDUCER_TYPES.md`

## Testing & Quality

- Testing Philosophy — `129_TESTING_PHILOSOPHY.md`
- React Testing Library — `130_REACT_TESTING_LIBRARY.md`
- User Events — `131_USER_EVENTS.md`
- Hook Testing — `132_HOOK_TESTING.md`
- Mocking Strategy — `133_MOCKING_STRATEGY.md`
- Async Testing — `134_ASYNC_TESTING.md`
- Accessibility Testing — `135_ACCESSIBILITY_TESTING.md`
- Visual Regression — `136_VISUAL_REGRESSION.md`
- E2E Testing — `137_E2E_TESTING.md`
- ESLint Hooks Rules — `138_ESLINT_HOOKS_RULES.md`

## Security, Accessibility & Production

- XSS Mental Model — `139_XSS_MENTAL_MODEL.md`
- dangerouslySetInnerHTML — `140_DANGEROUSLYSETINNERHTML.md`
- Trusted Types — `141_TRUSTED_TYPES.md`
- CSP — `142_CSP.md`
- Frontend Authorization — `143_FRONTEND_AUTHORIZATION.md`
- Secrets — `144_SECRETS.md`
- Accessibility Semantics — `145_ACCESSIBILITY_SEMANTICS.md`
- Focus Management — `146_FOCUS_MANAGEMENT.md`
- Error Handling — `147_ERROR_HANDLING.md`
- Production Logging — `148_PRODUCTION_LOGGING.md`
- Web Vitals — `149_WEB_VITALS.md`
- Deployment Cache Safety — `150_DEPLOYMENT_CACHE_SAFETY.md`
- Source Maps — `151_SOURCE_MAPS.md`
- Feature Flags — `152_FEATURE_FLAGS.md`
- Observability — `153_OBSERVABILITY.md`
- Production Checklist — `154_PRODUCTION_CHECKLIST.md`

## Interview & Troubleshooting

- Why React Re-renders — `155_WHY_REACT_RE_RENDERS.md`
- Key Problems — `156_KEY_PROBLEMS.md`
- Infinite Effect Loop — `157_INFINITE_EFFECT_LOOP.md`
- Too Many Re-renders — `158_TOO_MANY_RE_RENDERS.md`
- Hydration Troubleshooting — `159_HYDRATION_TROUBLESHOOTING.md`
- Stale State Bug — `160_STALE_STATE_BUG.md`
- Context Performance — `161_CONTEXT_PERFORMANCE.md`
- Form Double Submit — `162_FORM_DOUBLE_SUBMIT.md`
- Memory Leak Pattern — `163_MEMORY_LEAK_PATTERN.md`
- React 18 vs 19+ — `164_REACT_18_VS_19.md`
- Class Components Recall — `165_CLASS_COMPONENTS_RECALL.md`
- Lifecycle Mapping — `166_LIFECYCLE_MAPPING.md`
- Interview Traps — `167_INTERVIEW_TRAPS.md`
