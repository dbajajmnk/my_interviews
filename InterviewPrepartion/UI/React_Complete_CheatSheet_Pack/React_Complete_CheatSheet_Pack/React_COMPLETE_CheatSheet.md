# React — Complete Cheat Sheet (Combined Edition)

> Fast revision companion for React 19.3, modern React architecture, interviews, and production engineering.


---

<!-- 005_REACT_MENTAL_MODEL.md -->

# React Mental Model

## What / Why

React builds UI from components and updates the DOM by reconciling rendered trees.

## Mental Model / Visual

```text
State/Props → Render → Reconcile → Commit → DOM
```

## Example

```jsx
// Minimal recall example for React Mental Model
function Example() {
  return <div>React Mental Model</div>;
}
```

## When to Use

Use this model to reason about every React update.

## Common Mistake / Interview Trap

React does not mutate the DOM directly every time state is set; rendering and committing are distinct phases.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React Mental Model:** React builds UI from components and updates the DOM by reconciling rendered trees.


---

<!-- 006_COMPONENTS.md -->

# Components

## What / Why

A component is a JavaScript function that returns React elements/JSX.

## Mental Model / Visual

```text
function Button(){ return <button>Save</button> }
```

## Example

```jsx
// Minimal recall example for Components
function Example() {
  return <div>Components</div>;
}
```

## When to Use

Use components to encapsulate cohesive UI behavior.

## Common Mistake / Interview Trap

Component names must start with a capital letter when used as JSX components.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Components:** A component is a JavaScript function that returns React elements/JSX.


---

<!-- 007_JSX.md -->

# JSX

## What / Why

JSX is syntax for describing UI and compiles to React element creation.

## Mental Model / Visual

```text
const el = <h1>Hello</h1>
```

## Example

```jsx
// Minimal recall example for JSX
function Example() {
  return <div>JSX</div>;
}
```

## When to Use

Use JSX for readable component markup.

## Common Mistake / Interview Trap

JSX is not HTML and JavaScript expressions go inside braces.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **JSX:** JSX is syntax for describing UI and compiles to React element creation.


---

<!-- 008_PROPS.md -->

# Props

## What / Why

Props are read-only inputs passed from parent to child.

## Mental Model / Visual

```text
<UserCard user={user} />
```

## Example

```jsx
// Minimal recall example for Props
function Example() {
  return <div>Props</div>;
}
```

## When to Use

Use props for explicit parent-to-child data flow.

## Common Mistake / Interview Trap

Do not mutate props.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Props:** Props are read-only inputs passed from parent to child.


---

<!-- 009_CHILDREN.md -->

# Children

## What / Why

children lets a component compose nested content.

## Mental Model / Visual

```text
<Card><Profile /></Card>
```

## Example

```jsx
// Minimal recall example for Children
function Example() {
  return <div>Children</div>;
}
```

## When to Use

Use for generic wrappers/layouts.

## Common Mistake / Interview Trap

Avoid inspecting children when explicit props/composition are clearer.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Children:** children lets a component compose nested content.


---

<!-- 00_MASTER_INDEX.md -->

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


---

<!-- 010_CONDITIONAL_RENDERING.md -->

# Conditional Rendering

## What / Why

Render different UI based on conditions.

## Mental Model / Visual

```text
isAdmin ? <Admin/> : <User/>
```

## Example

```jsx
// Minimal recall example for Conditional Rendering
function Example() {
  return <div>Conditional Rendering</div>;
}
```

## When to Use

Use normal JavaScript branching.

## Common Mistake / Interview Trap

Returning null renders nothing.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Conditional Rendering:** Render different UI based on conditions.


---

<!-- 011_LISTS_AND_KEYS.md -->

# Lists and Keys

## What / Why

Keys identify siblings across renders.

## Mental Model / Visual

```text
items.map(x => <Row key={x.id} />)
```

## Example

```jsx
// Minimal recall example for Lists and Keys
function Example() {
  return <div>Lists and Keys</div>;
}
```

## When to Use

Use stable domain IDs.

## Common Mistake / Interview Trap

Array index keys can break state preservation when order changes.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Lists and Keys:** Keys identify siblings across renders.


---

<!-- 012_EVENTS.md -->

# Events

## What / Why

React handlers respond to user/browser events.

## Mental Model / Visual

```text
<button onClick={handleClick}>
```

## Example

```jsx
// Minimal recall example for Events
function Example() {
  return <div>Events</div>;
}
```

## When to Use

Use functions as handlers.

## Common Mistake / Interview Trap

Do not call handler during render: onClick={handleClick()} unless intentional.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Events:** React handlers respond to user/browser events.


---

<!-- 013_STATE_AS_SNAPSHOT.md -->

# State as Snapshot

## What / Why

State read during a render is a snapshot for that render.

## Mental Model / Visual

```text
setCount(count+1) schedules a new render
```

## Example

```jsx
// Minimal recall example for State as Snapshot
function Example() {
  return <div>State as Snapshot</div>;
}
```

## When to Use

Use functional updates when next state depends on previous state.

## Common Mistake / Interview Trap

setState does not synchronously mutate the current render's value.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State as Snapshot:** State read during a render is a snapshot for that render.


---

<!-- 014_BATCHING.md -->

# Batching

## What / Why

React batches compatible state updates to reduce renders.

## Mental Model / Visual

```text
setA(...); setB(...);
```

## Example

```jsx
// Minimal recall example for Batching
function Example() {
  return <div>Batching</div>;
}
```

## When to Use

Use normal state APIs; let React batch.

## Common Mistake / Interview Trap

Do not depend on intermediate DOM updates unless using escape-hatch APIs intentionally.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Batching:** React batches compatible state updates to reduce renders.


---

<!-- 015_RENDER_AND_COMMIT.md -->

# Render and Commit

## What / Why

Render calculates UI; commit applies changes/effects.

## Mental Model / Visual

```text
Trigger → Render → Commit
```

## Example

```jsx
// Minimal recall example for Render and Commit
function Example() {
  return <div>Render and Commit</div>;
}
```

## When to Use

Use to reason about performance and effect timing.

## Common Mistake / Interview Trap

Rendering must stay pure.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Render and Commit:** Render calculates UI; commit applies changes/effects.


---

<!-- 016_PURITY.md -->

# Purity

## What / Why

Components should be pure during render.

## Mental Model / Visual

```text
same inputs → same JSX
```

## Example

```jsx
// Minimal recall example for Purity
function Example() {
  return <div>Purity</div>;
}
```

## When to Use

Keep side effects in events/effects, not render.

## Common Mistake / Interview Trap

Mutating external data during render can break concurrent rendering.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Purity:** Components should be pure during render.


---

<!-- 017_STATE_PRESERVATION.md -->

# State Preservation

## What / Why

React preserves state by component position/type/key.

## Mental Model / Visual

```text
same position+type → preserve
```

## Example

```jsx
// Minimal recall example for State Preservation
function Example() {
  return <div>State Preservation</div>;
}
```

## When to Use

Use keys intentionally to reset state.

## Common Mistake / Interview Trap

Changing key resets subtree state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State Preservation:** React preserves state by component position/type/key.


---

<!-- 018_LIFTING_STATE_UP.md -->

# Lifting State Up

## What / Why

Move shared state to nearest common owner.

## Mental Model / Visual

```text
Parent state → children props
```

## Example

```jsx
// Minimal recall example for Lifting State Up
function Example() {
  return <div>Lifting State Up</div>;
}
```

## When to Use

Use when sibling components need coordinated state.

## Common Mistake / Interview Trap

Do not lift everything globally.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Lifting State Up:** Move shared state to nearest common owner.


---

<!-- 019_CONTROLLED_VS_UNCONTROLLED.md -->

# Controlled vs Uncontrolled

## What / Why

Controlled values come from React state; uncontrolled values live in DOM/external system.

## Mental Model / Visual

```text
value/onChange vs defaultValue/ref
```

## Example

```jsx
// Minimal recall example for Controlled vs Uncontrolled
function Example() {
  return <div>Controlled vs Uncontrolled</div>;
}
```

## When to Use

Use controlled for validation/coordination; uncontrolled for simpler isolated inputs.

## Common Mistake / Interview Trap

Switching between controlled and uncontrolled modes causes warnings/problems.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Controlled vs Uncontrolled:** Controlled values come from React state; uncontrolled values live in DOM/external system.


---

<!-- 01_30_SECOND_RECALL.md -->

# React — 30-Second Recall

## Formula

```text
Props + State
   ↓
Render (pure)
   ↓
Reconciliation
   ↓
Commit
   ↓
DOM
   ↓
Effects synchronize external systems
```

## Daily Core

```text
Components
Props
State
Events
Keys
useState
useReducer
useContext
useRef
useEffect
Custom Hooks
```

## Performance

```text
Profile first
State colocation
React Compiler
memo/useMemo/useCallback when justified
lazy + Suspense
Transitions / deferred values
```

## Modern React 19.x

```text
Actions
useActionState
useOptimistic
useFormStatus
use
Activity
useEffectEvent
ViewTransition
Fragment Refs
browser()
Trusted Types
React Compiler
```

## Five Rules

1. Rendering must be pure.
2. State is a snapshot.
3. Effects synchronize with external systems.
4. Stable keys represent identity.
5. Keep state as local as practical.

## Ten-Second Interview Answer

> React is a component-based UI library that uses declarative rendering, one-way data flow, state-driven updates, reconciliation, and a render/commit model.


---

<!-- 020_USESTATE.md -->

# useState

## What / Why

Adds local component state.

## Mental Model / Visual

```text
const [count,setCount]=useState(0)
```

## Example

```jsx
// Minimal recall example for useState
function Example() {
  return <div>useState</div>;
}
```

## When to Use

Use for independent local state.

## Common Mistake / Interview Trap

Use updater form setCount(c=>c+1) when based on previous state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useState:** Adds local component state.


---

<!-- 021_USEREDUCER.md -->

# useReducer

## What / Why

Centralizes complex local state transitions.

## Mental Model / Visual

```text
const [state,dispatch]=useReducer(reducer, initial)
```

## Example

```jsx
// Minimal recall example for useReducer
function Example() {
  return <div>useReducer</div>;
}
```

## When to Use

Use for related state with explicit actions.

## Common Mistake / Interview Trap

Reducer must remain pure.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useReducer:** Centralizes complex local state transitions.


---

<!-- 022_USECONTEXT.md -->

# useContext

## What / Why

Reads nearest context value.

## Mental Model / Visual

```text
const theme=useContext(ThemeContext)
```

## Example

```jsx
// Minimal recall example for useContext
function Example() {
  return <div>useContext</div>;
}
```

## When to Use

Use for stable cross-cutting data.

## Common Mistake / Interview Trap

Context updates can re-render many consumers.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useContext:** Reads nearest context value.


---

<!-- 023_CREATECONTEXT.md -->

# createContext

## What / Why

Creates a context object/provider boundary.

## Mental Model / Visual

```text
const ThemeContext=createContext('light')
```

## Example

```jsx
// Minimal recall example for createContext
function Example() {
  return <div>createContext</div>;
}
```

## When to Use

Use for dependency-style data such as theme/auth/locale.

## Common Mistake / Interview Trap

Context is not automatically a state-management architecture.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **createContext:** Creates a context object/provider boundary.


---

<!-- 024_USEREF.md -->

# useRef

## What / Why

Stores mutable value without causing re-render and can reference DOM.

## Mental Model / Visual

```text
const inputRef=useRef(null)
```

## Example

```jsx
// Minimal recall example for useRef
function Example() {
  return <div>useRef</div>;
}
```

## When to Use

Use for DOM handles or mutable instance data.

## Common Mistake / Interview Trap

Changing ref.current does not trigger render.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useRef:** Stores mutable value without causing re-render and can reference DOM.


---

<!-- 025_USEIMPERATIVEHANDLE.md -->

# useImperativeHandle

## What / Why

Customizes the handle exposed through a ref.

## Mental Model / Visual

```text
useImperativeHandle(ref,()=>({focus(){...}}))
```

## Example

```jsx
// Minimal recall example for useImperativeHandle
function Example() {
  return <div>useImperativeHandle</div>;
}
```

## When to Use

Use sparingly for imperative component APIs.

## Common Mistake / Interview Trap

Prefer declarative props when possible.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useImperativeHandle:** Customizes the handle exposed through a ref.


---

<!-- 026_USEEFFECT.md -->

# useEffect

## What / Why

Synchronizes component with external systems after commit.

## Mental Model / Visual

```text
useEffect(()=>{connect(); return disconnect},[roomId])
```

## Example

```jsx
// Minimal recall example for useEffect
function Example() {
  return <div>useEffect</div>;
}
```

## When to Use

Use for subscriptions, browser APIs, non-React systems.

## Common Mistake / Interview Trap

If no external system is involved, you probably do not need an effect.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useEffect:** Synchronizes component with external systems after commit.


---

<!-- 027_USELAYOUTEFFECT.md -->

# useLayoutEffect

## What / Why

Runs synchronously after DOM mutation before paint.

## Mental Model / Visual

```text
useLayoutEffect(()=>measure())
```

## Example

```jsx
// Minimal recall example for useLayoutEffect
function Example() {
  return <div>useLayoutEffect</div>;
}
```

## When to Use

Use for layout measurement or preventing visual flicker.

## Common Mistake / Interview Trap

Can block paint; prefer useEffect otherwise.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useLayoutEffect:** Runs synchronously after DOM mutation before paint.


---

<!-- 028_USEINSERTIONEFFECT.md -->

# useInsertionEffect

## What / Why

Runs before layout effects for CSS-in-JS style insertion.

## Mental Model / Visual

```text
useInsertionEffect(...)
```

## Example

```jsx
// Minimal recall example for useInsertionEffect
function Example() {
  return <div>useInsertionEffect</div>;
}
```

## When to Use

Mostly for library authors.

## Common Mistake / Interview Trap

Do not use for normal application effects.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useInsertionEffect:** Runs before layout effects for CSS-in-JS style insertion.


---

<!-- 029_USEEFFECTEVENT.md -->

# useEffectEvent

## What / Why

Defines non-reactive event logic called from an Effect while reading latest props/state.

## Mental Model / Visual

```text
const onConnected=useEffectEvent(()=>notify(theme))
```

## Example

```jsx
// Minimal recall example for useEffectEvent
function Example() {
  return <div>useEffectEvent</div>;
}
```

## When to Use

Use to separate effect-triggered event logic from reactive dependencies.

## Common Mistake / Interview Trap

Do not use merely to silence dependency linting.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useEffectEvent:** Defines non-reactive event logic called from an Effect while reading latest props/state.


---

<!-- 02_CURRENT_REACT_19_3.md -->

# Current React Baseline — React 19.3

## Current Version

React **19.3** is the current React release as of September 2026.

## React 19.3 Highlights

```text
ViewTransition — stable
Fragment Refs — stable
react-dom browser() API
Trusted Types support
Server Components can render imported Context directly
Transition scheduling improvements
```

## React 19.2 Highlights Still Important

```text
<Activity>
useEffectEvent
cacheSignal (RSC)
React Performance Tracks
Partial Pre-rendering server APIs
```

## React 19 Core Highlights

```text
Actions
useActionState
useOptimistic
form Actions
useFormStatus
use
ref as prop
Context provider shorthand
metadata/resource APIs
Server Components / Server Functions ecosystem
```

## Setup Guidance

Create React App is deprecated.

For new production applications React recommends a framework.
If a framework is not appropriate, use a modern build tool such as Vite, Parcel, or Rsbuild.


---

<!-- 030_USEMEMO.md -->

# useMemo

## What / Why

Caches a calculation between renders.

## Mental Model / Visual

```text
const value=useMemo(()=>expensive(a),[a])
```

## Example

```jsx
// Minimal recall example for useMemo
function Example() {
  return <div>useMemo</div>;
}
```

## When to Use

Use only for measured expensive work or stable identity needs.

## Common Mistake / Interview Trap

It is a performance optimization, not semantic correctness.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useMemo:** Caches a calculation between renders.


---

<!-- 031_USECALLBACK.md -->

# useCallback

## What / Why

Caches a function identity.

## Mental Model / Visual

```text
const fn=useCallback(()=>save(id),[id])
```

## Example

```jsx
// Minimal recall example for useCallback
function Example() {
  return <div>useCallback</div>;
}
```

## When to Use

Use when function identity matters for optimized children/dependencies.

## Common Mistake / Interview Trap

Do not wrap every function by habit.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useCallback:** Caches a function identity.


---

<!-- 032_USETRANSITION.md -->

# useTransition

## What / Why

Marks updates as non-blocking transitions.

## Mental Model / Visual

```text
const [pending,startTransition]=useTransition()
```

## Example

```jsx
// Minimal recall example for useTransition
function Example() {
  return <div>useTransition</div>;
}
```

## When to Use

Use for expensive non-urgent UI updates.

## Common Mistake / Interview Trap

Transitions cannot control text input state updates directly.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useTransition:** Marks updates as non-blocking transitions.


---

<!-- 033_STARTTRANSITION.md -->

# startTransition

## What / Why

Marks updates as transition outside the hook API.

## Mental Model / Visual

```text
startTransition(()=>setTab(next))
```

## Example

```jsx
// Minimal recall example for startTransition
function Example() {
  return <div>startTransition</div>;
}
```

## When to Use

Use when pending state is not needed locally.

## Common Mistake / Interview Trap

Not a delay/timer.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **startTransition:** Marks updates as transition outside the hook API.


---

<!-- 034_USEDEFERREDVALUE.md -->

# useDeferredValue

## What / Why

Lets non-critical UI lag behind urgent updates.

## Mental Model / Visual

```text
const deferred=useDeferredValue(query)
```

## Example

```jsx
// Minimal recall example for useDeferredValue
function Example() {
  return <div>useDeferredValue</div>;
}
```

## When to Use

Use for expensive dependent rendering.

## Common Mistake / Interview Trap

It defers rendering, not the network request by itself.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useDeferredValue:** Lets non-critical UI lag behind urgent updates.


---

<!-- 035_USEID.md -->

# useId

## What / Why

Generates unique IDs for accessibility relationships.

## Mental Model / Visual

```text
const id=useId()
```

## Example

```jsx
// Minimal recall example for useId
function Example() {
  return <div>useId</div>;
}
```

## When to Use

Use for label/input or ARIA relationships.

## Common Mistake / Interview Trap

Do not use as list keys.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useId:** Generates unique IDs for accessibility relationships.


---

<!-- 036_USESYNCEXTERNALSTORE.md -->

# useSyncExternalStore

## What / Why

Subscribes safely to an external store.

## Mental Model / Visual

```text
useSyncExternalStore(subscribe,getSnapshot)
```

## Example

```jsx
// Minimal recall example for useSyncExternalStore
function Example() {
  return <div>useSyncExternalStore</div>;
}
```

## When to Use

Use in store/library integrations.

## Common Mistake / Interview Trap

Prefer this over ad-hoc effect subscriptions for external stores.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useSyncExternalStore:** Subscribes safely to an external store.


---

<!-- 037_USEDEBUGVALUE.md -->

# useDebugValue

## What / Why

Adds labels for custom hooks in React DevTools.

## Mental Model / Visual

```text
useDebugValue(status)
```

## Example

```jsx
// Minimal recall example for useDebugValue
function Example() {
  return <div>useDebugValue</div>;
}
```

## When to Use

Use in reusable custom hooks when useful.

## Common Mistake / Interview Trap

Mostly a debugging/library feature.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useDebugValue:** Adds labels for custom hooks in React DevTools.


---

<!-- 038_CUSTOM_HOOKS.md -->

# Custom Hooks

## What / Why

Extract reusable stateful logic into functions beginning with use.

## Mental Model / Visual

```text
function useOnlineStatus(){...}
```

## Example

```jsx
// Minimal recall example for Custom Hooks
function Example() {
  return <div>Custom Hooks</div>;
}
```

## When to Use

Use to reuse logic, not component state instances.

## Common Mistake / Interview Trap

Hooks share logic; each call gets its own state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Custom Hooks:** Extract reusable stateful logic into functions beginning with use.


---

<!-- 039_RULES_OF_HOOKS.md -->

# Rules of Hooks

## What / Why

Call Hooks at top level of React components/custom Hooks.

## Mental Model / Visual

```text
same hook order every render
```

## Example

```jsx
// Minimal recall example for Rules of Hooks
function Example() {
  return <div>Rules of Hooks</div>;
}
```

## When to Use

Use eslint-plugin-react-hooks.

## Common Mistake / Interview Trap

Do not call Hooks conditionally or in ordinary functions.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Rules of Hooks:** Call Hooks at top level of React components/custom Hooks.


---

<!-- 03_REACT_19_2_19_3_NEW_FEATURES.md -->

# React 19.2 → 19.3 New Features Recall

## React 19.2

### Activity
```jsx
<Activity mode={visible ? 'visible' : 'hidden'}>
  <Page />
</Activity>
```
Hidden mode preserves subtree state, hides children, unmounts effects, and deprioritizes hidden updates.

### useEffectEvent
Separates event-like logic fired by an Effect from reactive Effect dependencies.

### cacheSignal
Server Components only; exposes cache-lifetime cancellation signal.

### Performance Tracks
Chrome DevTools tracks for Scheduler and Components.

### Partial Pre-rendering
Prerender static shell, save postponed state, resume later.

## React 19.3

### ViewTransition — stable
Animate enter/exit/move/resize transitions integrated with React updates.

### Fragment Refs — stable
A ref on Fragment yields a FragmentInstance that can operate on first-level DOM children without adding wrapper DOM.

### browser()
```jsx
use(browser())
```
Suspends on server and continues in browser; useful for truly browser-only rendering under Suspense.

### Trusted Types
React can pass TrustedHTML/TrustedScript/TrustedScriptURL values through supported browser sinks instead of coercing them back to strings.

## Interview Trap

Do not say Activity, ViewTransition, or Fragment Refs all arrived in React 19.0:
- Activity/useEffectEvent → 19.2
- ViewTransition/Fragment Refs stable → 19.3


---

<!-- 040_DERIVED_STATE.md -->

# Derived State

## What / Why

Compute values from props/state during render instead of storing duplicates.

## Mental Model / Visual

```text
fullName = first+' '+last
```

## Example

```jsx
// Minimal recall example for Derived State
function Example() {
  return <div>Derived State</div>;
}
```

## When to Use

Use when value is deterministically derived.

## Common Mistake / Interview Trap

Duplicated derived state causes synchronization bugs.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Derived State:** Compute values from props/state during render instead of storing duplicates.


---

<!-- 041_REDUCER_PATTERN.md -->

# Reducer Pattern

## What / Why

Model state changes as actions and a pure reducer.

## Mental Model / Visual

```text
dispatch({type:'added',item})
```

## Example

```jsx
// Minimal recall example for Reducer Pattern
function Example() {
  return <div>Reducer Pattern</div>;
}
```

## When to Use

Use for complex interaction workflows.

## Common Mistake / Interview Trap

Action names should describe events/intent.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Reducer Pattern:** Model state changes as actions and a pure reducer.


---

<!-- 042_STATE_NORMALIZATION.md -->

# State Normalization

## What / Why

Avoid deeply duplicated nested state.

## Mental Model / Visual

```text
entities by id + ids
```

## Example

```jsx
// Minimal recall example for State Normalization
function Example() {
  return <div>State Normalization</div>;
}
```

## When to Use

Use when many items reference each other.

## Common Mistake / Interview Trap

Do not normalize tiny local forms unnecessarily.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State Normalization:** Avoid deeply duplicated nested state.


---

<!-- 043_STATE_COLOCATION.md -->

# State Colocation

## What / Why

Keep state as close as possible to where it is used.

## Mental Model / Visual

```text
feature state inside feature
```

## Example

```jsx
// Minimal recall example for State Colocation
function Example() {
  return <div>State Colocation</div>;
}
```

## When to Use

Use to reduce unnecessary re-renders/coupling.

## Common Mistake / Interview Trap

Global state should be justified.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State Colocation:** Keep state as close as possible to where it is used.


---

<!-- 044_CONTEXT_REDUCER.md -->

# Context + Reducer

## What / Why

Combine context for distribution with reducer for state transitions.

## Mental Model / Visual

```text
Provider → state/dispatch
```

## Example

```jsx
// Minimal recall example for Context + Reducer
function Example() {
  return <div>Context + Reducer</div>;
}
```

## When to Use

Use for modest app-wide domains.

## Common Mistake / Interview Trap

Can become a global-store anti-pattern at large scale.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Context + Reducer:** Combine context for distribution with reducer for state transitions.


---

<!-- 045_SERVER_STATE_VS_CLIENT_STATE.md -->

# Server State vs Client State

## What / Why

Server state is remote cached data; client state is local interaction/UI state.

## Mental Model / Visual

```text
query cache vs component state
```

## Example

```jsx
// Minimal recall example for Server State vs Client State
function Example() {
  return <div>Server State vs Client State</div>;
}
```

## When to Use

Use separate tools/mental models.

## Common Mistake / Interview Trap

Do not mirror server state blindly into local state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Server State vs Client State:** Server state is remote cached data; client state is local interaction/UI state.


---

<!-- 046_URL_STATE.md -->

# URL State

## What / Why

Store shareable navigation/search/filter state in URL.

## Mental Model / Visual

```text
?q=react&page=2
```

## Example

```jsx
// Minimal recall example for URL State
function Example() {
  return <div>URL State</div>;
}
```

## When to Use

Use for bookmarkable state.

## Common Mistake / Interview Trap

Do not put sensitive data in URL.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **URL State:** Store shareable navigation/search/filter state in URL.


---

<!-- 047_FORM_STATE.md -->

# Form State

## What / Why

Model input values, validation and submit status explicitly.

## Mental Model / Visual

```text
value/errors/pending
```

## Example

```jsx
// Minimal recall example for Form State
function Example() {
  return <div>Form State</div>;
}
```

## When to Use

Use native forms/framework actions where appropriate.

## Common Mistake / Interview Trap

Avoid one effect per field.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Form State:** Model input values, validation and submit status explicitly.


---

<!-- 048_OPTIMISTIC_STATE.md -->

# Optimistic State

## What / Why

Show expected result before server confirms.

## Mental Model / Visual

```text
useOptimistic
```

## Example

```jsx
// Minimal recall example for Optimistic State
function Example() {
  return <div>Optimistic State</div>;
}
```

## When to Use

Use when failure can be reverted/explained.

## Common Mistake / Interview Trap

Do not optimistically apply irreversible/high-risk operations without design.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Optimistic State:** Show expected result before server confirms.


---

<!-- 049_YOU_MIGHT_NOT_NEED_AN_EFFECT.md -->

# You Might Not Need an Effect

## What / Why

Prefer render calculations and event handlers over synchronization effects.

## Mental Model / Visual

```text
derive in render; mutate on event
```

## Example

```jsx
// Minimal recall example for You Might Not Need an Effect
function Example() {
  return <div>You Might Not Need an Effect</div>;
}
```

## When to Use

Use effect only for external synchronization.

## Common Mistake / Interview Trap

Effect chains are a common React anti-pattern.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **You Might Not Need an Effect:** Prefer render calculations and event handlers over synchronization effects.


---

<!-- 04_REACT_COMPILER.md -->

# React Compiler — Stable 1.0

## What

A build-time compiler that automatically optimizes React components and Hooks, primarily through automatic memoization.

## Mental Model

```text
Normal React Source
       ↓
React Compiler
       ↓
Optimized React Code
       ↓
less manual memoization work
```

## Why

Historically developers manually used:

```text
React.memo
useMemo
useCallback
```

to stabilize expensive calculations/components/identities.

The Compiler can automate many of these optimizations.

## Production Guidance

- React Compiler 1.0 is stable.
- It works best with React 19 and can support React 17/18.
- Adopt incrementally.
- Keep `eslint-plugin-react-hooks` current.
- Fix Rules-of-React violations.
- Profile production-like behavior.

## Trap

Compiler does **not** mean:
- every re-render disappears,
- architecture/state ownership stops mattering,
- profiling becomes unnecessary,
- all manual memoization can be deleted without testing.


---

<!-- 050_EFFECT_DEPENDENCIES.md -->

# Effect Dependencies

## What / Why

Every reactive value used by an effect belongs in its dependency model.

## Mental Model / Visual

```text
useEffect(fn,[roomId])
```

## Example

```jsx
// Minimal recall example for Effect Dependencies
function Example() {
  return <div>Effect Dependencies</div>;
}
```

## When to Use

Follow the linter.

## Common Mistake / Interview Trap

Suppressing exhaustive-deps often hides stale-closure bugs.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Effect Dependencies:** Every reactive value used by an effect belongs in its dependency model.


---

<!-- 051_EFFECT_CLEANUP.md -->

# Effect Cleanup

## What / Why

Return cleanup for subscriptions/timers/resources.

## Mental Model / Visual

```text
return ()=>connection.disconnect()
```

## Example

```jsx
// Minimal recall example for Effect Cleanup
function Example() {
  return <div>Effect Cleanup</div>;
}
```

## When to Use

Use to mirror setup.

## Common Mistake / Interview Trap

Cleanup runs before re-run/unmount as appropriate.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Effect Cleanup:** Return cleanup for subscriptions/timers/resources.


---

<!-- 052_STALE_CLOSURES.md -->

# Stale Closures

## What / Why

Callbacks/effects capture values from their render.

## Mental Model / Visual

```text
closure sees snapshot
```

## Example

```jsx
// Minimal recall example for Stale Closures
function Example() {
  return <div>Stale Closures</div>;
}
```

## When to Use

Use dependencies, updater functions, refs or Effect Events appropriately.

## Common Mistake / Interview Trap

Do not assume callback sees future state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Stale Closures:** Callbacks/effects capture values from their render.


---

<!-- 053_REFS_AS_ESCAPE_HATCH.md -->

# Refs as Escape Hatch

## What / Why

Refs access DOM or mutable external instances.

## Mental Model / Visual

```text
ref.current.focus()
```

## Example

```jsx
// Minimal recall example for Refs as Escape Hatch
function Example() {
  return <div>Refs as Escape Hatch</div>;
}
```

## When to Use

Use when imperative integration is necessary.

## Common Mistake / Interview Trap

Do not use refs to bypass normal state flow.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Refs as Escape Hatch:** Refs access DOM or mutable external instances.


---

<!-- 054_PORTALS.md -->

# Portals

## What / Why

Render children into a different DOM node while preserving React tree relationships.

## Mental Model / Visual

```text
createPortal(children,document.body)
```

## Example

```jsx
// Minimal recall example for Portals
function Example() {
  return <div>Portals</div>;
}
```

## When to Use

Use for modals/tooltips.

## Common Mistake / Interview Trap

Events bubble through React tree, not DOM placement alone.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Portals:** Render children into a different DOM node while preserving React tree relationships.


---

<!-- 055_FLUSHSYNC.md -->

# flushSync

## What / Why

Forces React to flush updates synchronously.

## Mental Model / Visual

```text
flushSync(()=>setState(...))
```

## Example

```jsx
// Minimal recall example for flushSync
function Example() {
  return <div>flushSync</div>;
}
```

## When to Use

Use rarely for third-party/browser integration.

## Common Mistake / Interview Trap

Hurts performance and concurrent scheduling.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **flushSync:** Forces React to flush updates synchronously.


---

<!-- 056_STRICTMODE.md -->

# StrictMode

## What / Why

Development-only checks intentionally stress certain patterns.

## Mental Model / Visual

```text
<StrictMode>
```

## Example

```jsx
// Minimal recall example for StrictMode
function Example() {
  return <div>StrictMode</div>;
}
```

## When to Use

Use to surface unsafe effects/deprecations.

## Common Mistake / Interview Trap

Development double-invocation behavior is not production behavior.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **StrictMode:** Development-only checks intentionally stress certain patterns.


---

<!-- 057_ACTIONS.md -->

# Actions

## What / Why

React Actions coordinate async mutations with pending/error/optimistic workflows.

## Mental Model / Visual

```text
action={async formData => ...}
```

## Example

```jsx
// Minimal recall example for Actions
function Example() {
  return <div>Actions</div>;
}
```

## When to Use

Use framework/client action APIs for mutations.

## Common Mistake / Interview Trap

Actions are broader than ordinary event handlers.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Actions:** React Actions coordinate async mutations with pending/error/optimistic workflows.


---

<!-- 058_USEACTIONSTATE.md -->

# useActionState

## What / Why

Manages result state for an Action and exposes pending status.

## Mental Model / Visual

```text
const [state,action,pending]=useActionState(fn,initial)
```

## Example

```jsx
// Minimal recall example for useActionState
function Example() {
  return <div>useActionState</div>;
}
```

## When to Use

Use for forms/mutations tied to an Action.

## Common Mistake / Interview Trap

Known validation errors can be returned as state; unknown errors should throw to boundaries.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useActionState:** Manages result state for an Action and exposes pending status.


---

<!-- 059_USEOPTIMISTIC.md -->

# useOptimistic

## What / Why

Provides temporary optimistic state during an Action.

## Mental Model / Visual

```text
const [optimistic,setOptimistic]=useOptimistic(state)
```

## Example

```jsx
// Minimal recall example for useOptimistic
function Example() {
  return <div>useOptimistic</div>;
}
```

## When to Use

Use for responsive mutation UI.

## Common Mistake / Interview Trap

Reconcile failures and server truth explicitly.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useOptimistic:** Provides temporary optimistic state during an Action.


---

<!-- 060_USEFORMSTATUS.md -->

# useFormStatus

## What / Why

Reads status of a parent form submission.

## Mental Model / Visual

```text
const {pending}=useFormStatus()
```

## Example

```jsx
// Minimal recall example for useFormStatus
function Example() {
  return <div>useFormStatus</div>;
}
```

## When to Use

Use inside form descendants.

## Common Mistake / Interview Trap

It reports the nearest form status, not arbitrary global request state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **useFormStatus:** Reads status of a parent form submission.


---

<!-- 061_USE.md -->

# use

## What / Why

Reads a resource such as a Promise or context and integrates with Suspense.

## Mental Model / Visual

```text
const data=use(promise)
```

## Example

```jsx
// Minimal recall example for use
function Example() {
  return <div>use</div>;
}
```

## When to Use

Use where supported by the React/framework architecture.

## Common Mistake / Interview Trap

Unlike ordinary Hooks, use has different conditional-call rules, but resource creation must still be designed carefully.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **use:** Reads a resource such as a Promise or context and integrates with Suspense.


---

<!-- 062_REF_AS_PROP.md -->

# ref as Prop

## What / Why

React 19 supports ref as a prop for function components in modern patterns.

## Mental Model / Visual

```text
function Input({ref}){ return <input ref={ref}/> }
```

## Example

```jsx
// Minimal recall example for ref as Prop
function Example() {
  return <div>ref as Prop</div>;
}
```

## When to Use

Use according to React 19 migration guidance.

## Common Mistake / Interview Trap

Older forwardRef-heavy patterns may still exist in libraries/codebases.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **ref as Prop:** React 19 supports ref as a prop for function components in modern patterns.


---

<!-- 063_CONTEXT_PROVIDER_SHORTHAND.md -->

# Context Provider Shorthand

## What / Why

React 19 lets Context itself act as provider.

## Mental Model / Visual

```text
<ThemeContext value={theme}>
```

## Example

```jsx
// Minimal recall example for Context Provider Shorthand
function Example() {
  return <div>Context Provider Shorthand</div>;
}
```

## When to Use

Use modern provider syntax.

## Common Mistake / Interview Trap

Know legacy <Context.Provider> when maintaining older code.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Context Provider Shorthand:** React 19 lets Context itself act as provider.


---

<!-- 064_DOCUMENT_METADATA.md -->

# Document Metadata

## What / Why

React can hoist title/meta/link elements appropriately.

## Mental Model / Visual

```text
<title>Orders</title>
```

## Example

```jsx
// Minimal recall example for Document Metadata
function Example() {
  return <div>Document Metadata</div>;
}
```

## When to Use

Use in framework/SSR-aware environments.

## Common Mistake / Interview Trap

Metadata ownership still matters in nested apps.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Document Metadata:** React can hoist title/meta/link elements appropriately.


---

<!-- 065_RESOURCE_PRELOADING_APIS.md -->

# Resource Preloading APIs

## What / Why

React DOM supports APIs such as preload/preinit for resource hints.

## Mental Model / Visual

```text
preload(url,{as:'style'})
```

## Example

```jsx
// Minimal recall example for Resource Preloading APIs
function Example() {
  return <div>Resource Preloading APIs</div>;
}
```

## When to Use

Use framework-supported performance integration.

## Common Mistake / Interview Trap

Prefer framework automation when available.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Resource Preloading APIs:** React DOM supports APIs such as preload/preinit for resource hints.


---

<!-- 066_ACTIVITY.md -->

# Activity

## What / Why

Keeps hidden UI state while deprioritizing hidden work.

## Mental Model / Visual

```text
<Activity mode='hidden'><Page/></Activity>
```

## Example

```jsx
// Minimal recall example for Activity
function Example() {
  return <div>Activity</div>;
}
```

## When to Use

Use for likely-next navigation or preserving hidden subtree state.

## Common Mistake / Interview Trap

Hidden Activity unmounts effects and defers updates.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Activity:** Keeps hidden UI state while deprioritizing hidden work.


---

<!-- 067_VIEWTRANSITION.md -->

# ViewTransition

## What / Why

Stable in React 19.3 for UI transitions coordinated with React updates.

## Mental Model / Visual

```text
<ViewTransition>...</ViewTransition>
```

## Example

```jsx
// Minimal recall example for ViewTransition
function Example() {
  return <div>ViewTransition</div>;
}
```

## When to Use

Use for enter/exit/move/resize transitions.

## Common Mistake / Interview Trap

Treat it as progressive enhancement and test browser behavior.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **ViewTransition:** Stable in React 19.3 for UI transitions coordinated with React updates.


---

<!-- 068_FRAGMENT_REFS.md -->

# Fragment Refs

## What / Why

Stable in React 19.3; ref a Fragment and operate on first-level DOM children as a group.

## Mental Model / Visual

```text
<Fragment ref={ref}>...</Fragment>
```

## Example

```jsx
// Minimal recall example for Fragment Refs
function Example() {
  return <div>Fragment Refs</div>;
}
```

## When to Use

Use when you need DOM-group operations without wrapper markup.

## Common Mistake / Interview Trap

It exposes a FragmentInstance, not a normal single DOM element.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Fragment Refs:** Stable in React 19.3; ref a Fragment and operate on first-level DOM children as a group.


---

<!-- 069_BROWSER_API.md -->

# browser API

## What / Why

React DOM 19.3 browser() lets code suspend during SSR but continue in browser.

## Mental Model / Visual

```text
use(browser())
```

## Example

```jsx
// Minimal recall example for browser API
function Example() {
  return <div>browser API</div>;
}
```

## When to Use

Use for browser-only UI under Suspense.

## Common Mistake / Interview Trap

Do not use it to hide avoidable hydration mismatches.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **browser API:** React DOM 19.3 browser() lets code suspend during SSR but continue in browser.


---

<!-- 070_TRUSTED_TYPES_SUPPORT.md -->

# Trusted Types Support

## What / Why

React 19.3 passes Trusted Types values through to supported DOM sinks.

## Mental Model / Visual

```text
TrustedHTML / CSP trusted-types
```

## Example

```jsx
// Minimal recall example for Trusted Types Support
function Example() {
  return <div>Trusted Types Support</div>;
}
```

## When to Use

Use in hardened XSS defenses.

## Common Mistake / Interview Trap

Trusted Types do not replace sanitization or CSP design.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Trusted Types Support:** React 19.3 passes Trusted Types values through to supported DOM sinks.


---

<!-- 071_CACHE.md -->

# cache

## What / Why

Caches work in Server Components for a cache lifetime.

## Mental Model / Visual

```text
const cached=cache(fetcher)
```

## Example

```jsx
// Minimal recall example for cache
function Example() {
  return <div>cache</div>;
}
```

## When to Use

Use inside RSC architecture.

## Common Mistake / Interview Trap

This is not a general client cache.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **cache:** Caches work in Server Components for a cache lifetime.


---

<!-- 072_CACHESIGNAL.md -->

# cacheSignal

## What / Why

RSC-only API exposing cache lifetime abort signal.

## Mental Model / Visual

```text
fetch(url,{signal:cacheSignal()})
```

## Example

```jsx
// Minimal recall example for cacheSignal
function Example() {
  return <div>cacheSignal</div>;
}
```

## When to Use

Use to abort work when cached rendering ends.

## Common Mistake / Interview Trap

Server Components only.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **cacheSignal:** RSC-only API exposing cache lifetime abort signal.


---

<!-- 073_PARTIAL_PRE_RENDERING.md -->

# Partial Pre-rendering

## What / Why

React 19.2 server APIs can prerender static parts and later resume dynamic rendering.

## Mental Model / Visual

```text
prerender → postponed state → resume
```

## Example

```jsx
// Minimal recall example for Partial Pre-rendering
function Example() {
  return <div>Partial Pre-rendering</div>;
}
```

## When to Use

Use through frameworks unless building infrastructure yourself.

## Common Mistake / Interview Trap

Framework integration is complex; app code should not reimplement casually.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Partial Pre-rendering:** React 19.2 server APIs can prerender static parts and later resume dynamic rendering.


---

<!-- 074_REACT_PERFORMANCE_TRACKS.md -->

# React Performance Tracks

## What / Why

React 19.2 adds scheduler/components tracks to Chrome performance profiling.

## Mental Model / Visual

```text
Chrome DevTools → React tracks
```

## Example

```jsx
// Minimal recall example for React Performance Tracks
function Example() {
  return <div>React Performance Tracks</div>;
}
```

## When to Use

Use for scheduling/render diagnosis.

## Common Mistake / Interview Trap

Profile production-like workloads.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React Performance Tracks:** React 19.2 adds scheduler/components tracks to Chrome performance profiling.


---

<!-- 075_REACT_COMPILER.md -->

# React Compiler

## What / Why

Stable build-time compiler that automatically memoizes/optimizes React code.

## Mental Model / Visual

```text
compiler transforms components/hooks
```

## Example

```jsx
// Minimal recall example for React Compiler
function Example() {
  return <div>React Compiler</div>;
}
```

## When to Use

Use incrementally on codebases following Rules of React.

## Common Mistake / Interview Trap

Compiler reduces manual memoization needs but does not eliminate profiling or good architecture.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React Compiler:** Stable build-time compiler that automatically memoizes/optimizes React code.


---

<!-- 076_REACT_LAZY.md -->

# React.lazy

## What / Why

Code-splits a component loaded dynamically.

## Mental Model / Visual

```text
const Page=lazy(()=>import('./Page'))
```

## Example

```jsx
// Minimal recall example for React.lazy
function Example() {
  return <div>React.lazy</div>;
}
```

## When to Use

Use with Suspense for route/feature splitting.

## Common Mistake / Interview Trap

Lazy declaration should be stable, usually module scope.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React.lazy:** Code-splits a component loaded dynamically.


---

<!-- 077_SUSPENSE.md -->

# Suspense

## What / Why

Shows fallback while a child suspends.

## Mental Model / Visual

```text
<Suspense fallback={<Spinner/>}>
```

## Example

```jsx
// Minimal recall example for Suspense
function Example() {
  return <div>Suspense</div>;
}
```

## When to Use

Use for code/data resources supported by framework/React.

## Common Mistake / Interview Trap

Suspense is not a generic try/catch for arbitrary async code.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Suspense:** Shows fallback while a child suspends.


---

<!-- 078_SUSPENSE_BOUNDARIES.md -->

# Suspense Boundaries

## What / Why

Place boundaries around meaningful loading regions.

## Mental Model / Visual

```text
Page → sidebar/content boundaries
```

## Example

```jsx
// Minimal recall example for Suspense Boundaries
function Example() {
  return <div>Suspense Boundaries</div>;
}
```

## When to Use

Use to control reveal behavior.

## Common Mistake / Interview Trap

Too many tiny boundaries can create visual churn.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Suspense Boundaries:** Place boundaries around meaningful loading regions.


---

<!-- 079_STREAMING_SSR.md -->

# Streaming SSR

## What / Why

Streams server HTML progressively.

## Mental Model / Visual

```text
renderToPipeableStream / framework
```

## Example

```jsx
// Minimal recall example for Streaming SSR
function Example() {
  return <div>Streaming SSR</div>;
}
```

## When to Use

Use for faster first content and Suspense-driven SSR.

## Common Mistake / Interview Trap

Prefer framework integration unless building infrastructure.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Streaming SSR:** Streams server HTML progressively.


---

<!-- 080_HYDRATION.md -->

# Hydration

## What / Why

Attaches React behavior to server-rendered HTML.

## Mental Model / Visual

```text
hydrateRoot(container,<App/>)
```

## Example

```jsx
// Minimal recall example for Hydration
function Example() {
  return <div>Hydration</div>;
}
```

## When to Use

Use for SSR apps.

## Common Mistake / Interview Trap

Server/client initial output must match.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Hydration:** Attaches React behavior to server-rendered HTML.


---

<!-- 081_HYDRATION_MISMATCH.md -->

# Hydration Mismatch

## What / Why

Server and first client render differ.

## Mental Model / Visual

```text
date/random/window-dependent output mismatch
```

## Example

```jsx
// Minimal recall example for Hydration Mismatch
function Example() {
  return <div>Hydration Mismatch</div>;
}
```

## When to Use

Use deterministic initial rendering or browser-only boundaries.

## Common Mistake / Interview Trap

suppressHydrationWarning is an escape hatch, not a general fix.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Hydration Mismatch:** Server and first client render differ.


---

<!-- 082_SERVER_COMPONENTS.md -->

# Server Components

## What / Why

Components rendered in server environment and shipped as serialized UI payload rather than client JS.

## Mental Model / Visual

```text
RSC → client components boundaries
```

## Example

```jsx
// Minimal recall example for Server Components
function Example() {
  return <div>Server Components</div>;
}
```

## When to Use

Use through RSC-capable frameworks.

## Common Mistake / Interview Trap

Server Components cannot use client-only Hooks/state/effects.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Server Components:** Components rendered in server environment and shipped as serialized UI payload rather than client JS.


---

<!-- 083_CLIENT_COMPONENTS.md -->

# Client Components

## What / Why

Interactive components running on client within RSC frameworks.

## Mental Model / Visual

```text
'use client' boundary
```

## Example

```jsx
// Minimal recall example for Client Components
function Example() {
  return <div>Client Components</div>;
}
```

## When to Use

Use for state/effects/browser APIs.

## Common Mistake / Interview Trap

Client boundary can pull imports into client bundle.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Client Components:** Interactive components running on client within RSC frameworks.


---

<!-- 084_SERVER_FUNCTIONS.md -->

# Server Functions

## What / Why

Server-executed functions callable through framework-integrated React architecture.

## Mental Model / Visual

```text
'use server'
```

## Example

```jsx
// Minimal recall example for Server Functions
function Example() {
  return <div>Server Functions</div>;
}
```

## When to Use

Use via framework security/data mutation patterns.

## Common Mistake / Interview Trap

Treat as network endpoints: authorize, validate, protect secrets.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Server Functions:** Server-executed functions callable through framework-integrated React architecture.


---

<!-- 085_ERROR_BOUNDARIES.md -->

# Error Boundaries

## What / Why

Catch render/lifecycle errors in descendant tree.

## Mental Model / Visual

```text
class ErrorBoundary ...
```

## Example

```jsx
// Minimal recall example for Error Boundaries
function Example() {
  return <div>Error Boundaries</div>;
}
```

## When to Use

Use around failure domains/routes/widgets.

## Common Mistake / Interview Trap

Error boundaries do not catch every async/event error automatically.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Error Boundaries:** Catch render/lifecycle errors in descendant tree.


---

<!-- 086_ACTIVITY_VS_CONDITIONAL_RENDERING.md -->

# Activity vs Conditional Rendering

## What / Why

Activity can retain hidden subtree state; conditional rendering removes subtree.

## Mental Model / Visual

```text
hidden Activity vs {show && <Page/>}
```

## Example

```jsx
// Minimal recall example for Activity vs Conditional Rendering
function Example() {
  return <div>Activity vs Conditional Rendering</div>;
}
```

## When to Use

Use Activity when preservation/pre-rendering helps.

## Common Mistake / Interview Trap

Do not keep huge hidden trees without memory/performance reason.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Activity vs Conditional Rendering:** Activity can retain hidden subtree state; conditional rendering removes subtree.


---

<!-- 087_REACT_MEMO.md -->

# React.memo

## What / Why

Skips component re-render when props compare equal.

## Mental Model / Visual

```text
memo(Component)
```

## Example

```jsx
// Minimal recall example for React.memo
function Example() {
  return <div>React.memo</div>;
}
```

## When to Use

Use after profiling when parent renders are expensive.

## Common Mistake / Interview Trap

Memoization is useless if props always change identity.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React.memo:** Skips component re-render when props compare equal.


---

<!-- 088_MEMOIZATION_STRATEGY.md -->

# Memoization Strategy

## What / Why

Memoize only when identity/cost matters.

## Mental Model / Visual

```text
memo + useMemo + useCallback
```

## Example

```jsx
// Minimal recall example for Memoization Strategy
function Example() {
  return <div>Memoization Strategy</div>;
}
```

## When to Use

Use measured evidence and Compiler guidance.

## Common Mistake / Interview Trap

Premature memoization adds complexity.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Memoization Strategy:** Memoize only when identity/cost matters.


---

<!-- 089_PROFILER.md -->

# Profiler

## What / Why

Measures rendering performance programmatically/DevTools.

## Mental Model / Visual

```text
<Profiler onRender={...}>
```

## Example

```jsx
// Minimal recall example for Profiler
function Example() {
  return <div>Profiler</div>;
}
```

## When to Use

Use to find slow trees.

## Common Mistake / Interview Trap

Development timings differ from production.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Profiler:** Measures rendering performance programmatically/DevTools.


---

<!-- 090_CODE_SPLITTING.md -->

# Code Splitting

## What / Why

Split bundles by routes/features.

## Mental Model / Visual

```text
lazy/import()
```

## Example

```jsx
// Minimal recall example for Code Splitting
function Example() {
  return <div>Code Splitting</div>;
}
```

## When to Use

Use to reduce initial JS.

## Common Mistake / Interview Trap

Avoid loading waterfalls.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Code Splitting:** Split bundles by routes/features.


---

<!-- 091_BUNDLE_BUDGET.md -->

# Bundle Budget

## What / Why

Set max JS/CSS for routes/features.

## Mental Model / Visual

```text
initial JS ≤ budget
```

## Example

```jsx
// Minimal recall example for Bundle Budget
function Example() {
  return <div>Bundle Budget</div>;
}
```

## When to Use

Use in CI.

## Common Mistake / Interview Trap

React performance is often JavaScript-delivery performance.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Bundle Budget:** Set max JS/CSS for routes/features.


---

<!-- 092_LIST_PERFORMANCE.md -->

# List Performance

## What / Why

Keep keys stable, avoid excessive item work, virtualize huge lists.

## Mental Model / Visual

```text
windowed list
```

## Example

```jsx
// Minimal recall example for List Performance
function Example() {
  return <div>List Performance</div>;
}
```

## When to Use

Use virtualization for very large collections.

## Common Mistake / Interview Trap

memo alone does not fix rendering 100k DOM nodes.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **List Performance:** Keep keys stable, avoid excessive item work, virtualize huge lists.


---

<!-- 093_STATE_GRANULARITY.md -->

# State Granularity

## What / Why

Place state so updates re-render only required subtrees.

## Mental Model / Visual

```text
colocate state
```

## Example

```jsx
// Minimal recall example for State Granularity
function Example() {
  return <div>State Granularity</div>;
}
```

## When to Use

Use component boundaries strategically.

## Common Mistake / Interview Trap

Global state changes can fan out re-renders.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State Granularity:** Place state so updates re-render only required subtrees.


---

<!-- 094_TRANSITION_SCHEDULING.md -->

# Transition Scheduling

## What / Why

Mark non-urgent UI work as transitions.

## Mental Model / Visual

```text
startTransition
```

## Example

```jsx
// Minimal recall example for Transition Scheduling
function Example() {
  return <div>Transition Scheduling</div>;
}
```

## When to Use

Use for expensive navigation/filter results.

## Common Mistake / Interview Trap

Urgent input updates should remain urgent.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Transition Scheduling:** Mark non-urgent UI work as transitions.


---

<!-- 095_DEFERRED_RENDERING.md -->

# Deferred Rendering

## What / Why

Use deferred values when expensive consumer may lag.

## Mental Model / Visual

```text
useDeferredValue
```

## Example

```jsx
// Minimal recall example for Deferred Rendering
function Example() {
  return <div>Deferred Rendering</div>;
}
```

## When to Use

Use for responsive typing + heavy list/chart.

## Common Mistake / Interview Trap

Debouncing and deferring solve different problems.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Deferred Rendering:** Use deferred values when expensive consumer may lag.


---

<!-- 096_AVOIDING_WATERFALLS.md -->

# Avoiding Waterfalls

## What / Why

Start independent work in parallel and use framework data-loading patterns.

## Mental Model / Visual

```text
Promise.all / route loaders
```

## Example

```jsx
// Minimal recall example for Avoiding Waterfalls
function Example() {
  return <div>Avoiding Waterfalls</div>;
}
```

## When to Use

Use server/framework data APIs.

## Common Mistake / Interview Trap

Nested effects that fetch sequentially often create waterfalls.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Avoiding Waterfalls:** Start independent work in parallel and use framework data-loading patterns.


---

<!-- 097_IMAGES_ASSETS.md -->

# Images & Assets

## What / Why

Optimize images/fonts/static assets outside React reconciliation.

## Mental Model / Visual

```text
responsive images/CDN/preload
```

## Example

```jsx
// Minimal recall example for Images & Assets
function Example() {
  return <div>Images & Assets</div>;
}
```

## When to Use

Use platform/framework capabilities.

## Common Mistake / Interview Trap

React cannot compensate for oversized assets.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Images & Assets:** Optimize images/fonts/static assets outside React reconciliation.


---

<!-- 098_REACT_COMPILER_STRATEGY.md -->

# React Compiler Strategy

## What / Why

Let compiler optimize eligible code; profile before manual memoization.

## Mental Model / Visual

```text
Compiler + eslint rules
```

## Example

```jsx
// Minimal recall example for React Compiler Strategy
function Example() {
  return <div>React Compiler Strategy</div>;
}
```

## When to Use

Use stable compiler with incremental rollout.

## Common Mistake / Interview Trap

Do not remove all manual memoization blindly without validation.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React Compiler Strategy:** Let compiler optimize eligible code; profile before manual memoization.


---

<!-- 099_CONTROLLED_INPUTS.md -->

# Controlled Inputs

## What / Why

React state is source of truth.

## Mental Model / Visual

```text
value={name} onChange=...
```

## Example

```jsx
// Minimal recall example for Controlled Inputs
function Example() {
  return <div>Controlled Inputs</div>;
}
```

## When to Use

Use for complex coordination/validation.

## Common Mistake / Interview Trap

High-frequency state can cause broad rerenders if poorly colocated.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Controlled Inputs:** React state is source of truth.


---

<!-- 100_UNCONTROLLED_INPUTS.md -->

# Uncontrolled Inputs

## What / Why

DOM stores current value; read via FormData/ref.

## Mental Model / Visual

```text
defaultValue / FormData
```

## Example

```jsx
// Minimal recall example for Uncontrolled Inputs
function Example() {
  return <div>Uncontrolled Inputs</div>;
}
```

## When to Use

Use for simple/native form flows.

## Common Mistake / Interview Trap

Do not mix controlled/uncontrolled for same input.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Uncontrolled Inputs:** DOM stores current value; read via FormData/ref.


---

<!-- 101_FORMDATA.md -->

# FormData

## What / Why

Read native form submission values.

## Mental Model / Visual

```text
new FormData(form)
```

## Example

```jsx
// Minimal recall example for FormData
function Example() {
  return <div>FormData</div>;
}
```

## When to Use

Use with Actions/server endpoints.

## Common Mistake / Interview Trap

Checkbox/multi-value fields need correct handling.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **FormData:** Read native form submission values.


---

<!-- 102_VALIDATION.md -->

# Validation

## What / Why

Use native constraints plus domain/server validation.

## Mental Model / Visual

```text
required/minLength/server errors
```

## Example

```jsx
// Minimal recall example for Validation
function Example() {
  return <div>Validation</div>;
}
```

## When to Use

Use client validation for UX, server validation for trust.

## Common Mistake / Interview Trap

Client validation is not security.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Validation:** Use native constraints plus domain/server validation.


---

<!-- 103_PENDING_SUBMIT_UI.md -->

# Pending Submit UI

## What / Why

Disable/indicate submit status using Action/form status.

## Mental Model / Visual

```text
useFormStatus
```

## Example

```jsx
// Minimal recall example for Pending Submit UI
function Example() {
  return <div>Pending Submit UI</div>;
}
```

## When to Use

Use to prevent duplicate UX actions.

## Common Mistake / Interview Trap

Server still needs idempotency.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Pending Submit UI:** Disable/indicate submit status using Action/form status.


---

<!-- 104_OPTIMISTIC_FORMS.md -->

# Optimistic Forms

## What / Why

Update UI immediately while mutation is pending.

## Mental Model / Visual

```text
useOptimistic
```

## Example

```jsx
// Minimal recall example for Optimistic Forms
function Example() {
  return <div>Optimistic Forms</div>;
}
```

## When to Use

Use for reversible expected success.

## Common Mistake / Interview Trap

Display failure/recovery state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Optimistic Forms:** Update UI immediately while mutation is pending.


---

<!-- 105_FILE_INPUTS.md -->

# File Inputs

## What / Why

Use browser File APIs/FormData.

## Mental Model / Visual

```text
<input type='file'>
```

## Example

```jsx
// Minimal recall example for File Inputs
function Example() {
  return <div>File Inputs</div>;
}
```

## When to Use

Use uncontrolled/file upload patterns.

## Common Mistake / Interview Trap

Never trust client MIME/name alone.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **File Inputs:** Use browser File APIs/FormData.


---

<!-- 106_COMPONENT_COMPOSITION.md -->

# Component Composition

## What / Why

Build complex UI by nesting focused components.

## Mental Model / Visual

```text
Page → Section → Widget
```

## Example

```jsx
// Minimal recall example for Component Composition
function Example() {
  return <div>Component Composition</div>;
}
```

## When to Use

Prefer composition over prop-driven mega-components.

## Common Mistake / Interview Trap

Avoid deep wrapper abstractions with no ownership.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Component Composition:** Build complex UI by nesting focused components.


---

<!-- 107_CONTAINER_PRESENTATIONAL_SPLIT.md -->

# Container / Presentational Split

## What / Why

Separate orchestration/data concerns from pure UI where useful.

## Mental Model / Visual

```text
Feature container → presentational component
```

## Example

```jsx
// Minimal recall example for Container / Presentational Split
function Example() {
  return <div>Container / Presentational Split</div>;
}
```

## When to Use

Use selectively for testability/reuse.

## Common Mistake / Interview Trap

Not every component needs this split.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Container / Presentational Split:** Separate orchestration/data concerns from pure UI where useful.


---

<!-- 108_COMPOUND_COMPONENTS.md -->

# Compound Components

## What / Why

Components coordinate through context/children for expressive APIs.

## Mental Model / Visual

```text
<Tabs><Tabs.List/>...</Tabs>
```

## Example

```jsx
// Minimal recall example for Compound Components
function Example() {
  return <div>Compound Components</div>;
}
```

## When to Use

Use for reusable component libraries.

## Common Mistake / Interview Trap

Keep implicit coupling documented.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Compound Components:** Components coordinate through context/children for expressive APIs.


---

<!-- 109_HEADLESS_COMPONENT_PATTERN.md -->

# Headless Component Pattern

## What / Why

Encapsulate behavior/accessibility without forcing styles.

## Mental Model / Visual

```text
hook/render prop/headless primitive
```

## Example

```jsx
// Minimal recall example for Headless Component Pattern
function Example() {
  return <div>Headless Component Pattern</div>;
}
```

## When to Use

Use design systems.

## Common Mistake / Interview Trap

Requires strong API discipline.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Headless Component Pattern:** Encapsulate behavior/accessibility without forcing styles.


---

<!-- 110_HOOKS_QUICK_REFERENCE.md -->

# React Hooks — Quick Reference

| Hook/API | Primary Purpose |
|---|---|
| `useState` | local state |
| `useReducer` | complex local state transitions |
| `useContext` | consume context |
| `useRef` | mutable value / DOM reference |
| `useEffect` | sync with external systems |
| `useLayoutEffect` | layout measurement before paint |
| `useInsertionEffect` | CSS-in-JS library insertion |
| `useMemo` | cache calculation |
| `useCallback` | cache function identity |
| `useTransition` | non-blocking transition + pending |
| `startTransition` | mark transition update |
| `useDeferredValue` | defer non-urgent value rendering |
| `useId` | accessibility-safe unique ID |
| `useSyncExternalStore` | external store subscription |
| `useDebugValue` | custom hook DevTools label |
| `useImperativeHandle` | customize ref handle |
| `useActionState` | Action state + pending |
| `useOptimistic` | optimistic state |
| `useEffectEvent` | non-reactive event logic from Effects |
| `use` | read Promise/context/resource |
| `useFormStatus` | nearest form Action status (react-dom) |

## Rule

Use Hooks to model state, synchronization and reusable logic—not to recreate lifecycle methods mechanically.


---

<!-- 110_RENDER_PROPS.md -->

# Render Props

## What / Why

Pass a function to customize rendering.

## Mental Model / Visual

```text
<Mouse>{pos=>...}</Mouse>
```

## Example

```jsx
// Minimal recall example for Render Props
function Example() {
  return <div>Render Props</div>;
}
```

## When to Use

Know for legacy/library code.

## Common Mistake / Interview Trap

Hooks often replace many render-prop use cases.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Render Props:** Pass a function to customize rendering.


---

<!-- 111_COMPARISON_MATRIX.md -->

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


---

<!-- 111_HIGHER_ORDER_COMPONENTS.md -->

# Higher-Order Components

## What / Why

Function wraps a component to enhance behavior.

## Mental Model / Visual

```text
withAuth(Component)
```

## Example

```jsx
// Minimal recall example for Higher-Order Components
function Example() {
  return <div>Higher-Order Components</div>;
}
```

## When to Use

Know for legacy/ecosystem code.

## Common Mistake / Interview Trap

Hooks/composition are often simpler in modern apps.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Higher-Order Components:** Function wraps a component to enhance behavior.


---

<!-- 112_CUSTOM_HOOK_ARCHITECTURE.md -->

# Custom Hook Architecture

## What / Why

Encapsulate reusable logic at hook boundary.

## Mental Model / Visual

```text
useCheckout/usePermissions
```

## Example

```jsx
// Minimal recall example for Custom Hook Architecture
function Example() {
  return <div>Custom Hook Architecture</div>;
}
```

## When to Use

Use for behavior reuse.

## Common Mistake / Interview Trap

Avoid one giant hook that becomes feature monolith.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Custom Hook Architecture:** Encapsulate reusable logic at hook boundary.


---

<!-- 112_INTERVIEW_TRAPS.md -->

# React Interview Traps

1. React is a UI library; routing/data architecture comes from frameworks/ecosystem.
2. State is a snapshot, not a mutable local variable.
3. Re-render does not automatically mean DOM mutation.
4. Rendering must be pure.
5. `useEffect` is for synchronization with external systems.
6. Derived values usually do not belong in state.
7. Stable keys represent identity; index keys are risky for reordered stateful lists.
8. `useRef` updates do not trigger renders.
9. `useMemo`/`useCallback` are optimizations, not correctness tools.
10. Context is not automatically a global-state solution.
11. Server state and client UI state are different problems.
12. Suspense does not catch every arbitrary Promise unless integrated with supported resource/framework behavior.
13. Error Boundaries do not catch all event/async errors automatically.
14. Client-side permission checks are not backend authorization.
15. `dangerouslySetInnerHTML` needs trusted/sanitized content.
16. Hydration requires compatible server/client initial output.
17. Server Components cannot use client-only state/effects.
18. `'use client'` creates a client boundary in RSC frameworks.
19. Actions are mutation workflows, not just event handlers.
20. `useActionState` returns state, Action dispatcher and pending status.
21. `useOptimistic` needs failure reconciliation.
22. `useFormStatus` reads nearest form status.
23. `<Activity>` arrived in React 19.2.
24. `useEffectEvent` arrived in React 19.2.
25. ViewTransition became stable in React 19.3.
26. Fragment Refs became stable in React 19.3.
27. `browser()` is a React DOM 19.3 API for opting specific UI out of SSR under Suspense.
28. React 19.3 adds Trusted Types support; React is still not a sanitizer.
29. React Compiler 1.0 is stable but optional.
30. Compiler does not remove the need for profiling/state architecture.
31. Create React App is deprecated.
32. Modern React recommends frameworks for most full production apps.
33. Vite/Parcel/Rsbuild remain valid when a framework is not a fit.
34. Class components still matter for legacy maintenance.
35. StrictMode development behavior should not be confused with production behavior.


---

<!-- 113_FEATURE_FOLDER_ARCHITECTURE.md -->

# Feature Folder Architecture

## What / Why

Organize by business feature rather than technical file type.

## Mental Model / Visual

```text
features/orders/...
```

## Example

```jsx
// Minimal recall example for Feature Folder Architecture
function Example() {
  return <div>Feature Folder Architecture</div>;
}
```

## When to Use

Use in medium/large apps.

## Common Mistake / Interview Trap

Avoid all components/hooks/services in giant global folders.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Feature Folder Architecture:** Organize by business feature rather than technical file type.


---

<!-- 113_TROUBLESHOOTING_MATRIX.md -->

# React Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| Infinite render | setter called during render | state mutation loop |
| Infinite effect | effect sets dependency | effect design |
| Stale value | closure/dependencies | stale closure |
| Lost list state | keys | unstable/index key |
| Too many renders | state ownership/context | state too high/global |
| Slow typing | expensive sibling render | transition/deferred/colocation |
| Hydration mismatch | server vs client output | time/random/browser-only API |
| Input warning | controlled/uncontrolled switch | value/defaultValue |
| Effect runs twice dev | StrictMode | missing-safe cleanup |
| Memory growth | listeners/subscriptions | cleanup leak |
| Context fan-out | provider value changes | giant context |
| Suspense never resolves | resource/framework integration | promise/cache problem |
| Lazy chunk fails | deployment cache mismatch | stale HTML/chunk removed |
| XSS concern | raw HTML sink | unsafe HTML / CSP |
| Form duplicate | repeated submit | pending UX + server idempotency |
| RSC boundary error | client Hook on server | missing `'use client'` boundary |

## Debug Flow

```text
Reproduce
→ React DevTools
→ Props/State/Context
→ Profiler / Performance Track
→ Network
→ Console
→ Server/client boundary
→ Fix
→ Re-measure
```


---

<!-- 114_ONE_PAGE_RECALL.md -->

# React — One-Page Architecture Recall

```text
User Event / External Update
          ↓
       State Update
          ↓
        Render
       (pure)
          ↓
    Reconciliation
          ↓
        Commit
          ↓
          DOM
          ↓
 Effects synchronize external systems
```

## Data Flow

```text
Parent → props → Child
Context → distant consumers
Local state → local UI
Server state → framework/query/RSC cache
URL → navigation/shareable state
```

## Modern Async UI

```text
Action
 ├── useActionState
 ├── useOptimistic
 └── useFormStatus

Suspense
 ├── lazy
 ├── framework data
 ├── use(resource)
 └── streaming/RSC
```

## Performance

```text
State Colocation
React Compiler
Code Splitting
Suspense
Transition
Deferred Value
Profiler
Web Vitals
```

## Production

```text
Accessibility
Security
Error Boundaries
Telemetry
Immutable Assets
Cache Safety
Feature Flags
Tests
```


---

<!-- 114_STATE_MANAGEMENT_DECISION.md -->

# State Management Decision

## What / Why

Choose local state → context → external store only as needs grow.

## Mental Model / Visual

```text
useState → reducer/context → store
```

## Example

```jsx
// Minimal recall example for State Management Decision
function Example() {
  return <div>State Management Decision</div>;
}
```

## When to Use

Use simplest sufficient tool.

## Common Mistake / Interview Trap

Library choice cannot fix poor state ownership.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **State Management Decision:** Choose local state → context → external store only as needs grow.


---

<!-- 115_COMMANDS_SETUP.md -->

# React Setup / Commands Recall

## React Packages

```bash
npm install react react-dom
```

## Modern Scratch App Example

```bash
npm create vite@latest
```

Then choose React / React + TypeScript as appropriate.

## React Compiler

```bash
npm install -D babel-plugin-react-compiler@latest
```

## Notes

- Create React App is deprecated.
- For most new full applications React recommends using a React framework.
- For custom/client-only setups, modern build tools such as Vite, Parcel, or Rsbuild are appropriate.

## Production Build

Command depends on chosen framework/build tool.

## Rule

Do not memorize one tool's commands as "React commands"; React itself is the UI library.


---

<!-- 115_EXTERNAL_STORE_PATTERN.md -->

# External Store Pattern

## What / Why

Integrate Redux/Zustand/other stores through supported subscription mechanisms.

## Mental Model / Visual

```text
useSyncExternalStore under library
```

## Example

```jsx
// Minimal recall example for External Store Pattern
function Example() {
  return <div>External Store Pattern</div>;
}
```

## When to Use

Use for large/shared client-state domains.

## Common Mistake / Interview Trap

Do not put server cache data in global client store by default.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **External Store Pattern:** Integrate Redux/Zustand/other stores through supported subscription mechanisms.


---

<!-- 116_PRODUCTION_CHECKLIST.md -->

# React Production Readiness Checklist

## Architecture
- [ ] state colocated
- [ ] server/client state separated
- [ ] route/data strategy defined
- [ ] error boundaries placed
- [ ] loading/Suspense boundaries intentional

## Performance
- [ ] initial JS budget
- [ ] route code splitting
- [ ] Web Vitals measured
- [ ] unnecessary global state avoided
- [ ] expensive renders profiled
- [ ] React Compiler/manual memoization strategy validated

## Security
- [ ] no client secrets
- [ ] raw HTML sanitized/trusted
- [ ] CSP considered
- [ ] Trusted Types considered where appropriate
- [ ] backend authorization enforced

## Accessibility
- [ ] semantic HTML
- [ ] labels/names
- [ ] keyboard flow
- [ ] focus behavior
- [ ] screen-reader checks

## Quality
- [ ] behavior-focused tests
- [ ] integration coverage
- [ ] critical E2E
- [ ] visual/accessibility tests where valuable

## Deployment
- [ ] hashed immutable assets
- [ ] cache invalidation safe
- [ ] source-map policy
- [ ] rollback
- [ ] telemetry includes release/version


---

<!-- 116_SERVER_CACHE_PATTERN.md -->

# Server Cache Pattern

## What / Why

Use data-fetching/cache libraries/framework data APIs for remote data.

## Mental Model / Visual

```text
query cache / route loaders
```

## Example

```jsx
// Minimal recall example for Server Cache Pattern
function Example() {
  return <div>Server Cache Pattern</div>;
}
```

## When to Use

Use for fetching/revalidation/deduplication.

## Common Mistake / Interview Trap

Server state has different lifecycle than client UI state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Server Cache Pattern:** Use data-fetching/cache libraries/framework data APIs for remote data.


---

<!-- 117_PRACTICE_QUESTIONS.md -->

# React Practice Questions

1. What happens when React state changes?
2. Render phase vs commit phase?
3. Why must render stay pure?
4. What does “state is a snapshot” mean?
5. Why are keys important?
6. When is index key unsafe?
7. Props vs state?
8. State vs ref?
9. useState vs useReducer?
10. Context vs external state store?
11. When should you use useEffect?
12. When do you not need an Effect?
13. useEffect vs useLayoutEffect?
14. What is a stale closure?
15. useMemo vs useCallback?
16. React.memo vs useMemo?
17. useTransition vs useDeferredValue?
18. What does useSyncExternalStore solve?
19. What is Suspense?
20. lazy + Suspense?
21. What is hydration?
22. Why do hydration mismatches happen?
23. Server Component vs Client Component?
24. What is `'use client'`?
25. What are Actions?
26. What is useActionState?
27. What is useOptimistic?
28. What is useFormStatus?
29. What does `use` do?
30. What is Activity?
31. What does useEffectEvent solve?
32. What is cacheSignal?
33. What became stable in React 19.3?
34. What are Fragment Refs?
35. What does browser() solve?
36. What is Trusted Types support?
37. What is React Compiler?
38. Is manual memoization still needed?
39. Why is CRA deprecated?
40. Framework vs Vite-style setup?
41. Controlled vs uncontrolled form?
42. Error Boundary limitations?
43. Context performance problem?
44. How do you troubleshoot too many renders?
45. How do you fix list state bugs?
46. How do you secure dangerouslySetInnerHTML?
47. What are Web Vitals?
48. How do you avoid deployment chunk errors?
49. How would you structure a large React application?
50. What are the top React anti-patterns?


---

<!-- 117_ROUTING.md -->

# Routing

## What / Why

React core does not prescribe routing; use a framework/router.

## Mental Model / Visual

```text
route tree → UI/data
```

## Example

```jsx
// Minimal recall example for Routing
function Example() {
  return <div>Routing</div>;
}
```

## When to Use

Use React Router/framework routing.

## Common Mistake / Interview Trap

Do not hand-roll complex production routing unnecessarily.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Routing:** React core does not prescribe routing; use a framework/router.


---

<!-- 118_DATA_FETCHING.md -->

# Data Fetching

## What / Why

Prefer framework/router/server-cache patterns over effect-only fetching in large apps.

## Mental Model / Visual

```text
loader/query/RSC
```

## Example

```jsx
// Minimal recall example for Data Fetching
function Example() {
  return <div>Data Fetching</div>;
}
```

## When to Use

Use effects for imperative integrations, not default app data architecture.

## Common Mistake / Interview Trap

Effect fetches can create waterfalls and race conditions.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Data Fetching:** Prefer framework/router/server-cache patterns over effect-only fetching in large apps.


---

<!-- 118_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:

- React official documentation — https://react.dev/
- React 19.3 release notes
- React 19.2 release notes
- React 19 release notes and upgrade guide
- React Compiler documentation / v1.0 announcement
- React official guidance on creating new apps
- React official Create React App deprecation announcement

## Current Baseline

```text
React latest: 19.3
React Compiler: 1.0 stable
Create React App: deprecated
```

## Important Version Mapping

```text
React 19.0:
Actions, useActionState, useOptimistic, form actions,
useFormStatus, use, ref-as-prop and other React 19 changes

React 19.2:
Activity
useEffectEvent
cacheSignal
React Performance Tracks
Partial Pre-rendering server APIs

React 19.3:
ViewTransition stable
Fragment Refs stable
react-dom browser()
Trusted Types support
additional RSC/context and scheduling improvements
```

## Accuracy Rule

React evolves quickly. For production architecture always verify:
- exact React/framework version,
- framework support for RSC/Actions/server APIs,
- bundler/compiler configuration,
- browser support for progressive enhancement features,
- latest security advisories.


---

<!-- 119_FRAMEWORK_FIRST_PRODUCTION_APPS.md -->

# Framework-First Production Apps

## What / Why

React recommends a framework for most new full applications.

## Mental Model / Visual

```text
framework handles routing/data/code split/SSR
```

## Example

```jsx
// Minimal recall example for Framework-First Production Apps
function Example() {
  return <div>Framework-First Production Apps</div>;
}
```

## When to Use

Use when building production apps with routing/data needs.

## Common Mistake / Interview Trap

Framework is optional for constrained/simple apps.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Framework-First Production Apps:** React recommends a framework for most new full applications.


---

<!-- 120_BUILD_TOOL_APP.md -->

# Build-Tool App

## What / Why

Use Vite/Parcel/Rsbuild when framework is not a fit or for learning/custom setup.

## Mental Model / Visual

```text
React + Vite
```

## Example

```jsx
// Minimal recall example for Build-Tool App
function Example() {
  return <div>Build-Tool App</div>;
}
```

## When to Use

Use for client apps or unusual constraints.

## Common Mistake / Interview Trap

You own routing/data/SSR integrations yourself.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Build-Tool App:** Use Vite/Parcel/Rsbuild when framework is not a fit or for learning/custom setup.


---

<!-- 121_CREATE_REACT_APP_DEPRECATION.md -->

# Create React App Deprecation

## What / Why

CRA is deprecated for new React apps.

## Mental Model / Visual

```text
migrate to framework or Vite/Parcel/Rsbuild
```

## Example

```jsx
// Minimal recall example for Create React App Deprecation
function Example() {
  return <div>Create React App Deprecation</div>;
}
```

## When to Use

Know for modern setup/interviews.

## Common Mistake / Interview Trap

Do not recommend CRA as the current default.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Create React App Deprecation:** CRA is deprecated for new React apps.


---

<!-- 122_TYPING_PROPS.md -->

# Typing Props

## What / Why

Define component prop contracts.

## Mental Model / Visual

```text
type Props={name:string}
```

## Example

```jsx
// Minimal recall example for Typing Props
function Example() {
  return <div>Typing Props</div>;
}
```

## When to Use

Use explicit domain types.

## Common Mistake / Interview Trap

Avoid React.FC by habit when simple function typing suffices.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Typing Props:** Define component prop contracts.


---

<!-- 123_TYPING_EVENTS.md -->

# Typing Events

## What / Why

Use correct React event types.

## Mental Model / Visual

```text
React.ChangeEvent<HTMLInputElement>
```

## Example

```jsx
// Minimal recall example for Typing Events
function Example() {
  return <div>Typing Events</div>;
}
```

## When to Use

Use when handler inference is unavailable.

## Common Mistake / Interview Trap

Do not use any.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Typing Events:** Use correct React event types.


---

<!-- 124_TYPING_REFS.md -->

# Typing Refs

## What / Why

Type DOM/component refs.

## Mental Model / Visual

```text
useRef<HTMLInputElement>(null)
```

## Example

```jsx
// Minimal recall example for Typing Refs
function Example() {
  return <div>Typing Refs</div>;
}
```

## When to Use

Use precise handle types.

## Common Mistake / Interview Trap

Account for null before mount.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Typing Refs:** Type DOM/component refs.


---

<!-- 125_TYPING_CHILDREN.md -->

# Typing Children

## What / Why

Use React.ReactNode for general renderable children.

## Mental Model / Visual

```text
children: React.ReactNode
```

## Example

```jsx
// Minimal recall example for Typing Children
function Example() {
  return <div>Typing Children</div>;
}
```

## When to Use

Use based on component contract.

## Common Mistake / Interview Trap

Do not overconstrain children without reason.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Typing Children:** Use React.ReactNode for general renderable children.


---

<!-- 126_DISCRIMINATED_UNIONS.md -->

# Discriminated Unions

## What / Why

Model variant props safely.

## Mental Model / Visual

```text
type Props={kind:'link';href:string}|{kind:'button';onClick():void}
```

## Example

```jsx
// Minimal recall example for Discriminated Unions
function Example() {
  return <div>Discriminated Unions</div>;
}
```

## When to Use

Use for mutually exclusive component modes.

## Common Mistake / Interview Trap

Better than many optional incompatible props.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Discriminated Unions:** Model variant props safely.


---

<!-- 127_GENERIC_COMPONENTS.md -->

# Generic Components

## What / Why

Use generics for reusable typed lists/selects.

## Mental Model / Visual

```text
function List<T>({items,...})
```

## Example

```jsx
// Minimal recall example for Generic Components
function Example() {
  return <div>Generic Components</div>;
}
```

## When to Use

Use in reusable libraries.

## Common Mistake / Interview Trap

Keep inference ergonomic.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Generic Components:** Use generics for reusable typed lists/selects.


---

<!-- 128_REDUCER_TYPES.md -->

# Reducer Types

## What / Why

Type state/actions with unions.

## Mental Model / Visual

```text
type Action={type:'added';item:Item}|...
```

## Example

```jsx
// Minimal recall example for Reducer Types
function Example() {
  return <div>Reducer Types</div>;
}
```

## When to Use

Use exhaustiveness checking.

## Common Mistake / Interview Trap

Avoid stringly typed unvalidated actions.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Reducer Types:** Type state/actions with unions.


---

<!-- 129_TESTING_PHILOSOPHY.md -->

# Testing Philosophy

## What / Why

Test behavior users observe rather than implementation details.

## Mental Model / Visual

```text
render → interact → assert
```

## Example

```jsx
// Minimal recall example for Testing Philosophy
function Example() {
  return <div>Testing Philosophy</div>;
}
```

## When to Use

Use component/integration tests.

## Common Mistake / Interview Trap

Avoid asserting internal state.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Testing Philosophy:** Test behavior users observe rather than implementation details.


---

<!-- 130_REACT_TESTING_LIBRARY.md -->

# React Testing Library

## What / Why

Query/access UI like users.

## Mental Model / Visual

```text
getByRole
```

## Example

```jsx
// Minimal recall example for React Testing Library
function Example() {
  return <div>React Testing Library</div>;
}
```

## When to Use

Use accessible queries first.

## Common Mistake / Interview Trap

Overusing test IDs hides accessibility problems.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React Testing Library:** Query/access UI like users.


---

<!-- 131_USER_EVENTS.md -->

# User Events

## What / Why

Simulate realistic interaction sequences.

## Mental Model / Visual

```text
user.click / user.type
```

## Example

```jsx
// Minimal recall example for User Events
function Example() {
  return <div>User Events</div>;
}
```

## When to Use

Use over low-level event firing when appropriate.

## Common Mistake / Interview Trap

Await async user interactions.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **User Events:** Simulate realistic interaction sequences.


---

<!-- 132_HOOK_TESTING.md -->

# Hook Testing

## What / Why

Prefer testing hook behavior through components or supported hook utilities.

## Mental Model / Visual

```text
renderHook when justified
```

## Example

```jsx
// Minimal recall example for Hook Testing
function Example() {
  return <div>Hook Testing</div>;
}
```

## When to Use

Use for reusable hooks.

## Common Mistake / Interview Trap

Do not over-isolate hooks from integration context.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Hook Testing:** Prefer testing hook behavior through components or supported hook utilities.


---

<!-- 133_MOCKING_STRATEGY.md -->

# Mocking Strategy

## What / Why

Mock unstable external boundaries, not everything.

## Mental Model / Visual

```text
API boundary/mock server
```

## Example

```jsx
// Minimal recall example for Mocking Strategy
function Example() {
  return <div>Mocking Strategy</div>;
}
```

## When to Use

Use realistic integration where practical.

## Common Mistake / Interview Trap

Excessive mocks make tests lie.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Mocking Strategy:** Mock unstable external boundaries, not everything.


---

<!-- 134_ASYNC_TESTING.md -->

# Async Testing

## What / Why

Wait for visible outcomes, not arbitrary timers.

## Mental Model / Visual

```text
findByRole / waitFor
```

## Example

```jsx
// Minimal recall example for Async Testing
function Example() {
  return <div>Async Testing</div>;
}
```

## When to Use

Use deterministic async expectations.

## Common Mistake / Interview Trap

Avoid sleep-based tests.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Async Testing:** Wait for visible outcomes, not arbitrary timers.


---

<!-- 135_ACCESSIBILITY_TESTING.md -->

# Accessibility Testing

## What / Why

Use semantic queries plus automated/manual accessibility checks.

## Mental Model / Visual

```text
role/name/focus
```

## Example

```jsx
// Minimal recall example for Accessibility Testing
function Example() {
  return <div>Accessibility Testing</div>;
}
```

## When to Use

Use in CI and real keyboard/screen-reader review.

## Common Mistake / Interview Trap

Automated tools do not catch everything.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Accessibility Testing:** Use semantic queries plus automated/manual accessibility checks.


---

<!-- 136_VISUAL_REGRESSION.md -->

# Visual Regression

## What / Why

Capture critical component/page visuals.

## Mental Model / Visual

```text
storybook/screenshot pipeline
```

## Example

```jsx
// Minimal recall example for Visual Regression
function Example() {
  return <div>Visual Regression</div>;
}
```

## When to Use

Use for design systems and layout regressions.

## Common Mistake / Interview Trap

Avoid noisy pixel-perfect suites without governance.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Visual Regression:** Capture critical component/page visuals.


---

<!-- 137_E2E_TESTING.md -->

# E2E Testing

## What / Why

Test critical journeys across real app boundaries.

## Mental Model / Visual

```text
login/checkout
```

## Example

```jsx
// Minimal recall example for E2E Testing
function Example() {
  return <div>E2E Testing</div>;
}
```

## When to Use

Keep small and high-value.

## Common Mistake / Interview Trap

Do not rely on E2E as primary test layer.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **E2E Testing:** Test critical journeys across real app boundaries.


---

<!-- 138_ESLINT_HOOKS_RULES.md -->

# ESLint Hooks Rules

## What / Why

Use eslint-plugin-react-hooks rules.

## Mental Model / Visual

```text
rules-of-hooks + exhaustive-deps + compiler rules
```

## Example

```jsx
// Minimal recall example for ESLint Hooks Rules
function Example() {
  return <div>ESLint Hooks Rules</div>;
}
```

## When to Use

Keep current with React toolchain.

## Common Mistake / Interview Trap

Disabling rules broadly hides correctness problems.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **ESLint Hooks Rules:** Use eslint-plugin-react-hooks rules.


---

<!-- 139_XSS_MENTAL_MODEL.md -->

# XSS Mental Model

## What / Why

React escapes string values by default, but dangerous sinks remain dangerous.

## Mental Model / Visual

```text
{userText} safe-by-default; dangerouslySetInnerHTML special
```

## Example

```jsx
// Minimal recall example for XSS Mental Model
function Example() {
  return <div>XSS Mental Model</div>;
}
```

## When to Use

Use trusted/sanitized content only.

## Common Mistake / Interview Trap

React is not an HTML sanitizer.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **XSS Mental Model:** React escapes string values by default, but dangerous sinks remain dangerous.


---

<!-- 140_DANGEROUSLYSETINNERHTML.md -->

# dangerouslySetInnerHTML

## What / Why

Inject raw HTML explicitly.

## Mental Model / Visual

```text
dangerouslySetInnerHTML={{__html:trustedHtml}}
```

## Example

```jsx
// Minimal recall example for dangerouslySetInnerHTML
function Example() {
  return <div>dangerouslySetInnerHTML</div>;
}
```

## When to Use

Use only with sanitization/trusted source.

## Common Mistake / Interview Trap

Major XSS risk.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **dangerouslySetInnerHTML:** Inject raw HTML explicitly.


---

<!-- 141_TRUSTED_TYPES.md -->

# Trusted Types

## What / Why

Use CSP Trusted Types with React 19.3 support for hardened DOM sinks.

## Mental Model / Visual

```text
require-trusted-types-for 'script'
```

## Example

```jsx
// Minimal recall example for Trusted Types
function Example() {
  return <div>Trusted Types</div>;
}
```

## When to Use

Use in high-security web apps.

## Common Mistake / Interview Trap

Still requires correct policies/sanitization.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Trusted Types:** Use CSP Trusted Types with React 19.3 support for hardened DOM sinks.


---

<!-- 142_CSP.md -->

# CSP

## What / Why

Restrict script/style/resource origins.

## Mental Model / Visual

```text
Content-Security-Policy
```

## Example

```jsx
// Minimal recall example for CSP
function Example() {
  return <div>CSP</div>;
}
```

## When to Use

Use as defense in depth.

## Common Mistake / Interview Trap

CSP does not fix unsafe application authorization.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **CSP:** Restrict script/style/resource origins.


---

<!-- 143_FRONTEND_AUTHORIZATION.md -->

# Frontend Authorization

## What / Why

Hide/disable UI based on permissions for UX only.

## Mental Model / Visual

```text
canEdit ? <Edit/> : null
```

## Example

```jsx
// Minimal recall example for Frontend Authorization
function Example() {
  return <div>Frontend Authorization</div>;
}
```

## When to Use

Use for UI behavior.

## Common Mistake / Interview Trap

Backend must enforce authorization.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Frontend Authorization:** Hide/disable UI based on permissions for UX only.


---

<!-- 144_SECRETS.md -->

# Secrets

## What / Why

Never ship secrets in client bundles.

## Mental Model / Visual

```text
public config != secret
```

## Example

```jsx
// Minimal recall example for Secrets
function Example() {
  return <div>Secrets</div>;
}
```

## When to Use

Use server-side secret storage.

## Common Mistake / Interview Trap

Anything sent to browser is observable.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Secrets:** Never ship secrets in client bundles.


---

<!-- 145_ACCESSIBILITY_SEMANTICS.md -->

# Accessibility Semantics

## What / Why

Prefer native semantic elements.

## Mental Model / Visual

```text
button not clickable div
```

## Example

```jsx
// Minimal recall example for Accessibility Semantics
function Example() {
  return <div>Accessibility Semantics</div>;
}
```

## When to Use

Use labels, headings, landmarks.

## Common Mistake / Interview Trap

ARIA should not replace correct HTML.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Accessibility Semantics:** Prefer native semantic elements.


---

<!-- 146_FOCUS_MANAGEMENT.md -->

# Focus Management

## What / Why

Manage focus for modals/routes/dynamic UI.

## Mental Model / Visual

```text
ref.focus()
```

## Example

```jsx
// Minimal recall example for Focus Management
function Example() {
  return <div>Focus Management</div>;
}
```

## When to Use

Use for keyboard/screen-reader UX.

## Common Mistake / Interview Trap

Do not steal focus unnecessarily.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Focus Management:** Manage focus for modals/routes/dynamic UI.


---

<!-- 147_ERROR_HANDLING.md -->

# Error Handling

## What / Why

Provide route/widget boundaries and useful recovery UI.

## Mental Model / Visual

```text
ErrorBoundary + retry/navigation
```

## Example

```jsx
// Minimal recall example for Error Handling
function Example() {
  return <div>Error Handling</div>;
}
```

## When to Use

Use around failure domains.

## Common Mistake / Interview Trap

Log enough context without leaking secrets.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Error Handling:** Provide route/widget boundaries and useful recovery UI.


---

<!-- 148_PRODUCTION_LOGGING.md -->

# Production Logging

## What / Why

Capture structured frontend errors/version/session context.

## Mental Model / Visual

```text
release, route, error, traceId
```

## Example

```jsx
// Minimal recall example for Production Logging
function Example() {
  return <div>Production Logging</div>;
}
```

## When to Use

Use telemetry platform.

## Common Mistake / Interview Trap

Avoid PII/tokens.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Production Logging:** Capture structured frontend errors/version/session context.


---

<!-- 149_WEB_VITALS.md -->

# Web Vitals

## What / Why

Track LCP, INP, CLS for user-perceived performance.

## Mental Model / Visual

```text
field metrics
```

## Example

```jsx
// Minimal recall example for Web Vitals
function Example() {
  return <div>Web Vitals</div>;
}
```

## When to Use

Use per route/release.

## Common Mistake / Interview Trap

Synthetic lab metrics are not enough.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Web Vitals:** Track LCP, INP, CLS for user-perceived performance.


---

<!-- 150_DEPLOYMENT_CACHE_SAFETY.md -->

# Deployment Cache Safety

## What / Why

Use hashed immutable assets and compatible HTML/runtime manifests.

## Mental Model / Visual

```text
app.abcd.js
```

## Example

```jsx
// Minimal recall example for Deployment Cache Safety
function Example() {
  return <div>Deployment Cache Safety</div>;
}
```

## When to Use

Use CDN caching + rollback.

## Common Mistake / Interview Trap

Stale HTML pointing to deleted chunks causes failures.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Deployment Cache Safety:** Use hashed immutable assets and compatible HTML/runtime manifests.


---

<!-- 151_SOURCE_MAPS.md -->

# Source Maps

## What / Why

Upload/source-control maps securely for debugging.

## Mental Model / Visual

```text
release → source map service
```

## Example

```jsx
// Minimal recall example for Source Maps
function Example() {
  return <div>Source Maps</div>;
}
```

## When to Use

Use for production stack traces.

## Common Mistake / Interview Trap

Avoid unintentionally exposing source maps publicly if policy forbids.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Source Maps:** Upload/source-control maps securely for debugging.


---

<!-- 152_FEATURE_FLAGS.md -->

# Feature Flags

## What / Why

Separate code deployment from feature release.

## Mental Model / Visual

```text
flag → cohort
```

## Example

```jsx
// Minimal recall example for Feature Flags
function Example() {
  return <div>Feature Flags</div>;
}
```

## When to Use

Use for progressive rollout.

## Common Mistake / Interview Trap

Remove stale flags.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Feature Flags:** Separate code deployment from feature release.


---

<!-- 153_OBSERVABILITY.md -->

# Observability

## What / Why

Correlate route, component errors, API calls and backend traces.

## Mental Model / Visual

```text
browser traceId → API
```

## Example

```jsx
// Minimal recall example for Observability
function Example() {
  return <div>Observability</div>;
}
```

## When to Use

Use modern telemetry/OpenTelemetry integration.

## Common Mistake / Interview Trap

Do not log sensitive inputs.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Observability:** Correlate route, component errors, API calls and backend traces.


---

<!-- 154_PRODUCTION_CHECKLIST.md -->

# Production Checklist

## What / Why

Validate performance, security, accessibility, caching, error recovery and monitoring.

## Mental Model / Visual

```text
pre-release checklist
```

## Example

```jsx
// Minimal recall example for Production Checklist
function Example() {
  return <div>Production Checklist</div>;
}
```

## When to Use

Use before major releases.

## Common Mistake / Interview Trap

A green unit-test suite alone is not production readiness.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Production Checklist:** Validate performance, security, accessibility, caching, error recovery and monitoring.


---

<!-- 155_WHY_REACT_RE_RENDERS.md -->

# Why React Re-renders

## What / Why

State/props/context/external-store changes schedule rendering; parent rendering can also render children.

## Mental Model / Visual

```text
trigger → render subtree
```

## Example

```jsx
// Minimal recall example for Why React Re-renders
function Example() {
  return <div>Why React Re-renders</div>;
}
```

## When to Use

Use Profiler before optimizing.

## Common Mistake / Interview Trap

Re-render does not mean DOM mutation.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Why React Re-renders:** State/props/context/external-store changes schedule rendering; parent rendering can also render children.


---

<!-- 156_KEY_PROBLEMS.md -->

# Key Problems

## What / Why

Wrong keys cause state to stick to wrong item or reset unexpectedly.

## Mental Model / Visual

```text
stable id key
```

## Example

```jsx
// Minimal recall example for Key Problems
function Example() {
  return <div>Key Problems</div>;
}
```

## When to Use

Use domain identity.

## Common Mistake / Interview Trap

Index keys are risky for reordered/editable lists.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Key Problems:** Wrong keys cause state to stick to wrong item or reset unexpectedly.


---

<!-- 157_INFINITE_EFFECT_LOOP.md -->

# Infinite Effect Loop

## What / Why

Effect updates state that changes one of its own dependencies repeatedly.

## Mental Model / Visual

```text
effect → setState → dependency change → effect
```

## Example

```jsx
// Minimal recall example for Infinite Effect Loop
function Example() {
  return <div>Infinite Effect Loop</div>;
}
```

## When to Use

Remove unnecessary effect or stabilize logic.

## Common Mistake / Interview Trap

Memoizing blindly may hide root design problem.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Infinite Effect Loop:** Effect updates state that changes one of its own dependencies repeatedly.


---

<!-- 158_TOO_MANY_RE_RENDERS.md -->

# Too Many Re-renders

## What / Why

State too high/global, unstable props, expensive children.

## Mental Model / Visual

```text
profile → colocate/memoize where needed
```

## Example

```jsx
// Minimal recall example for Too Many Re-renders
function Example() {
  return <div>Too Many Re-renders</div>;
}
```

## When to Use

Use DevTools/Compiler/Profiler.

## Common Mistake / Interview Trap

Optimization starts with measurement.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Too Many Re-renders:** State too high/global, unstable props, expensive children.


---

<!-- 159_HYDRATION_TROUBLESHOOTING.md -->

# Hydration Troubleshooting

## What / Why

Compare server/client output and browser-only data sources.

## Mental Model / Visual

```text
time/random/window/localStorage
```

## Example

```jsx
// Minimal recall example for Hydration Troubleshooting
function Example() {
  return <div>Hydration Troubleshooting</div>;
}
```

## When to Use

Use deterministic server render or browser() boundary.

## Common Mistake / Interview Trap

Suppress warning only for intentional mismatch.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Hydration Troubleshooting:** Compare server/client output and browser-only data sources.


---

<!-- 160_STALE_STATE_BUG.md -->

# Stale State Bug

## What / Why

Callback closes over old render values.

## Mental Model / Visual

```text
closure snapshot
```

## Example

```jsx
// Minimal recall example for Stale State Bug
function Example() {
  return <div>Stale State Bug</div>;
}
```

## When to Use

Use updater functions/dependencies/Effect Events/ref as appropriate.

## Common Mistake / Interview Trap

State setters do not mutate captured variables.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Stale State Bug:** Callback closes over old render values.


---

<!-- 161_CONTEXT_PERFORMANCE.md -->

# Context Performance

## What / Why

Large context value changes re-render all consumers.

## Mental Model / Visual

```text
split context / stable value / external store
```

## Example

```jsx
// Minimal recall example for Context Performance
function Example() {
  return <div>Context Performance</div>;
}
```

## When to Use

Use narrow providers.

## Common Mistake / Interview Trap

One giant app context scales poorly.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Context Performance:** Large context value changes re-render all consumers.


---

<!-- 162_FORM_DOUBLE_SUBMIT.md -->

# Form Double Submit

## What / Why

Pending UX may not guarantee server idempotency.

## Mental Model / Visual

```text
disable pending + idempotency key/server guard
```

## Example

```jsx
// Minimal recall example for Form Double Submit
function Example() {
  return <div>Form Double Submit</div>;
}
```

## When to Use

Use both UI and backend protections.

## Common Mistake / Interview Trap

Never rely solely on disabled button.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Form Double Submit:** Pending UX may not guarantee server idempotency.


---

<!-- 163_MEMORY_LEAK_PATTERN.md -->

# Memory Leak Pattern

## What / Why

Uncleaned subscriptions/listeners/resources survive lifecycle.

## Mental Model / Visual

```text
setup ↔ cleanup
```

## Example

```jsx
// Minimal recall example for Memory Leak Pattern
function Example() {
  return <div>Memory Leak Pattern</div>;
}
```

## When to Use

Use effect cleanup and abort signals.

## Common Mistake / Interview Trap

React warning removal does not mean leaks cannot happen.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Memory Leak Pattern:** Uncleaned subscriptions/listeners/resources survive lifecycle.


---

<!-- 164_REACT_18_VS_19.md -->

# React 18 vs 19+

## What / Why

React 19 adds Actions, use, form/action APIs, ref-as-prop/provider improvements; later 19.x adds Activity/ViewTransition/etc.

## Mental Model / Visual

```text
18 → 19.x modernization
```

## Example

```jsx
// Minimal recall example for React 18 vs 19+
function Example() {
  return <div>React 18 vs 19+</div>;
}
```

## When to Use

Know migration impact.

## Common Mistake / Interview Trap

Do not attribute every 19.2/19.3 API to React 19.0.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **React 18 vs 19+:** React 19 adds Actions, use, form/action APIs, ref-as-prop/provider improvements; later 19.x adds Activity/ViewTransition/etc.


---

<!-- 165_CLASS_COMPONENTS_RECALL.md -->

# Class Components Recall

## What / Why

Legacy React uses class lifecycle/state APIs.

## Mental Model / Visual

```text
componentDidMount etc.
```

## Example

```jsx
// Minimal recall example for Class Components Recall
function Example() {
  return <div>Class Components Recall</div>;
}
```

## When to Use

Know for maintenance/interviews.

## Common Mistake / Interview Trap

Modern new code generally uses function components/Hooks.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Class Components Recall:** Legacy React uses class lifecycle/state APIs.


---

<!-- 166_LIFECYCLE_MAPPING.md -->

# Lifecycle Mapping

## What / Why

mount/update/unmount thinking maps imperfectly to effects.

## Mental Model / Visual

```text
render/commit/effect model
```

## Example

```jsx
// Minimal recall example for Lifecycle Mapping
function Example() {
  return <div>Lifecycle Mapping</div>;
}
```

## When to Use

Use effect synchronization model instead.

## Common Mistake / Interview Trap

Do not mechanically translate every class lifecycle to one useEffect.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Lifecycle Mapping:** mount/update/unmount thinking maps imperfectly to effects.


---

<!-- 167_INTERVIEW_TRAPS.md -->

# Interview Traps

## What / Why

High-frequency misconceptions.

## Mental Model / Visual

```text
React≠framework, state snapshot, key identity, effect external sync
```

## Example

```jsx
// Minimal recall example for Interview Traps
function Example() {
  return <div>Interview Traps</div>;
}
```

## When to Use

Use as final recall.

## Common Mistake / Interview Trap

See dedicated traps file.

## Production Thinking

Ask:
```text
Who owns this state/behavior?
What triggers rendering?
What is the failure/loading state?
Does this add unnecessary client JavaScript?
How is this tested?
What happens during SSR/hydration if applicable?
```

## 20-Second Recall

> **Interview Traps:** High-frequency misconceptions.
