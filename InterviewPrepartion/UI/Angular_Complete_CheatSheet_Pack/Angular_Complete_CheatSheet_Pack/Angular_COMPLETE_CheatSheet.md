# Angular — Complete Cheat Sheet (Combined Edition)

> Fast revision companion for Angular 22, enterprise frontend engineering, interviews, and production architecture.


---

<!-- 005_ANGULAR_MENTAL_MODEL.md -->

# Angular Mental Model

## What / Why

Angular is a full web framework built around components, dependency injection, templates, reactivity, routing, forms, HTTP, SSR, testing, and tooling.

## Mental Model

```text
Input/Signal/Event → Change Detection → Template → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Angular Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use this as the top-level model for architecture and interviews.

## Common Mistake / Interview Trap

Angular is not only a component library; it includes first-party application infrastructure.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular Mental Model:** Angular is a full web framework built around components, dependency injection, templates, reactivity, routing, forms, HTTP, SSR, testing, and tooling.


---

<!-- 006_COMPONENTS.md -->

# Components

## What / Why

Components combine TypeScript behavior, template, styles, dependency injection, and lifecycle.

## Mental Model

```text
@Component → template + class + styles
```

## Example / Recall

```ts
// Minimal recall example for: Components
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use components for cohesive UI capabilities.

## Common Mistake / Interview Trap

Do not make one giant component own an entire feature.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Components:** Components combine TypeScript behavior, template, styles, dependency injection, and lifecycle.


---

<!-- 007_STANDALONE_COMPONENTS.md -->

# Standalone Components

## What / Why

Modern Angular components are standalone by default.

## Mental Model

```text
Component imports its dependencies directly
```

## Example / Recall

```ts
// Minimal recall example for: Standalone Components
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as the default architecture for Angular 22 applications.

## Common Mistake / Interview Trap

Do not add `standalone: true` in modern Angular unless maintaining older style expectations.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Standalone Components:** Modern Angular components are standalone by default.


---

<!-- 008_TEMPLATES.md -->

# Templates

## What / Why

Angular templates combine HTML with bindings, directives, control flow, pipes, and components.

## Mental Model

```text
template → bindings → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Templates
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use templates declaratively; keep complex business logic in TypeScript/domain services.

## Common Mistake / Interview Trap

Avoid heavy computation/function calls in hot template paths.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Templates:** Angular templates combine HTML with bindings, directives, control flow, pipes, and components.


---

<!-- 009_INTERPOLATION.md -->

# Interpolation

## What / Why

Displays expression values in text.

## Mental Model

```text
{{ user().name }}
```

## Example / Recall

```ts
// Minimal recall example for: Interpolation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for text binding.

## Common Mistake / Interview Trap

Expressions should stay side-effect free.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Interpolation:** Displays expression values in text.


---

<!-- 00_MASTER_INDEX.md -->

# Angular — Complete Cheat Sheet Pack

**Current stable baseline used:** Angular 22.1.6 (September 2026).

**Modern Angular 22 baseline:** standalone-first/default, zoneless by default, OnPush default, Signal Forms stable, `resource` and `httpResource` stable, Vitest default for new CLI projects.

**Purpose:** Fast revision for development, enterprise architecture, interviews, performance, testing, SSR, security, and production troubleshooting.

## Fast Revision Files

- `01_30_SECOND_RECALL.md`
- `02_CURRENT_ANGULAR_22.md`
- `03_MODERN_VS_LEGACY_ANGULAR.md`
- `04_SIGNALS_RXJS_DECISION.md`

## Foundations

- Angular Mental Model — `005_ANGULAR_MENTAL_MODEL.md`
- Components — `006_COMPONENTS.md`
- Standalone Components — `007_STANDALONE_COMPONENTS.md`
- Templates — `008_TEMPLATES.md`
- Interpolation — `009_INTERPOLATION.md`
- Property Binding — `010_PROPERTY_BINDING.md`
- Event Binding — `011_EVENT_BINDING.md`
- Two-Way Binding — `012_TWO_WAY_BINDING.md`
- Template Reference Variables — `013_TEMPLATE_REFERENCE_VARIABLES.md`
- Host Bindings — `014_HOST_BINDINGS.md`
- Content Projection — `015_CONTENT_PROJECTION.md`
- View Encapsulation — `016_VIEW_ENCAPSULATION.md`
- Pipes — `017_PIPES.md`
- Directives — `018_DIRECTIVES.md`
- Lifecycle — `019_LIFECYCLE.md`

## Modern Control Flow & Templates

- @if — `020_IF.md`
- @for — `021_FOR.md`
- @switch — `022_SWITCH.md`
- @empty — `023_EMPTY.md`
- @let — `024_LET.md`
- @defer — `025_DEFER.md`
- Defer Triggers — `026_DEFER_TRIGGERS.md`
- Defer Prefetch — `027_DEFER_PREFETCH.md`
- Template Type Checking — `028_TEMPLATE_TYPE_CHECKING.md`

## Signals & Reactivity

- signal — `029_SIGNAL.md`
- computed — `030_COMPUTED.md`
- effect — `031_EFFECT.md`
- linkedSignal — `032_LINKEDSIGNAL.md`
- resource — `033_RESOURCE.md`
- httpResource — `034_HTTPRESOURCE.md`
- Resource Status — `035_RESOURCE_STATUS.md`
- Signal Equality — `036_SIGNAL_EQUALITY.md`
- untracked — `037_UNTRACKED.md`
- Signal Inputs — `038_SIGNAL_INPUTS.md`
- Model Inputs — `039_MODEL_INPUTS.md`
- Signal Queries — `040_SIGNAL_QUERIES.md`
- Output API — `041_OUTPUT_API.md`
- RxJS Interop — `042_RXJS_INTEROP.md`
- Signals vs Observables — `043_SIGNALS_VS_OBSERVABLES.md`

## Dependency Injection

- Dependency Injection Mental Model — `044_DEPENDENCY_INJECTION_MENTAL_MODEL.md`
- inject — `045_INJECT.md`
- Constructor Injection — `046_CONSTRUCTOR_INJECTION.md`
- Providers — `047_PROVIDERS.md`
- providedIn root — `048_PROVIDEDIN_ROOT.md`
- InjectionToken — `049_INJECTIONTOKEN.md`
- useClass — `050_USECLASS.md`
- useValue — `051_USEVALUE.md`
- useFactory — `052_USEFACTORY.md`
- useExisting — `053_USEEXISTING.md`
- Hierarchical Injectors — `054_HIERARCHICAL_INJECTORS.md`
- EnvironmentInjector — `055_ENVIRONMENTINJECTOR.md`
- runInInjectionContext — `056_RUNININJECTIONCONTEXT.md`

## Change Detection

- Zoneless Default — `057_ZONELESS_DEFAULT.md`
- OnPush Default — `058_ONPUSH_DEFAULT.md`
- ChangeDetectionStrategy Eager — `059_CHANGEDETECTIONSTRATEGY_EAGER.md`
- markForCheck — `060_MARKFORCHECK.md`
- detectChanges — `061_DETECTCHANGES.md`
- detach / reattach — `062_DETACH_REATTACH.md`
- AsyncPipe Notification — `063_ASYNCPIPE_NOTIFICATION.md`
- Signal Template Notification — `064_SIGNAL_TEMPLATE_NOTIFICATION.md`
- ExpressionChanged Error — `065_EXPRESSIONCHANGED_ERROR.md`

## RxJS

- Observable Mental Model — `066_OBSERVABLE_MENTAL_MODEL.md`
- Subject — `067_SUBJECT.md`
- BehaviorSubject — `068_BEHAVIORSUBJECT.md`
- ReplaySubject — `069_REPLAYSUBJECT.md`
- map — `070_MAP.md`
- filter — `071_FILTER.md`
- switchMap — `072_SWITCHMAP.md`
- mergeMap — `073_MERGEMAP.md`
- concatMap — `074_CONCATMAP.md`
- exhaustMap — `075_EXHAUSTMAP.md`
- catchError — `076_CATCHERROR.md`
- retry — `077_RETRY.md`
- shareReplay — `078_SHAREREPLAY.md`
- combineLatest — `079_COMBINELATEST.md`
- forkJoin — `080_FORKJOIN.md`
- debounceTime — `081_DEBOUNCETIME.md`
- takeUntilDestroyed — `082_TAKEUNTILDESTROYED.md`
- RxJS Operator Decision — `083_RXJS_OPERATOR_DECISION.md`

## Routing

- Router Mental Model — `084_ROUTER_MENTAL_MODEL.md`
- provideRouter — `085_PROVIDEROUTER.md`
- Routes — `086_ROUTES.md`
- router-outlet — `087_ROUTER_OUTLET.md`
- RouterLink — `088_ROUTERLINK.md`
- Route Params — `089_ROUTE_PARAMS.md`
- Query Params — `090_QUERY_PARAMS.md`
- Lazy Loading — `091_LAZY_LOADING.md`
- Route Guards — `092_ROUTE_GUARDS.md`
- Resolvers — `093_RESOLVERS.md`
- Route Data — `094_ROUTE_DATA.md`
- Router Events — `095_ROUTER_EVENTS.md`
- View Transitions — `096_VIEW_TRANSITIONS.md`
- Route-Level Render Mode — `097_ROUTE_LEVEL_RENDER_MODE.md`

## Forms

- Forms Decision — `098_FORMS_DECISION.md`
- Signal Forms — `099_SIGNAL_FORMS.md`
- Signal Form Model — `100_SIGNAL_FORM_MODEL.md`
- Signal Form Validation — `101_SIGNAL_FORM_VALIDATION.md`
- FormField — `102_FORMFIELD.md`
- Reactive Forms — `103_REACTIVE_FORMS.md`
- Typed Reactive Forms — `104_TYPED_REACTIVE_FORMS.md`
- Template-Driven Forms — `105_TEMPLATE_DRIVEN_FORMS.md`
- Validators — `106_VALIDATORS.md`
- Cross-Field Validation — `107_CROSS_FIELD_VALIDATION.md`
- ControlValueAccessor — `108_CONTROLVALUEACCESSOR.md`
- Form Submission — `109_FORM_SUBMISSION.md`

## HTTP & Data

- HttpClient — `110_HTTPCLIENT.md`
- provideHttpClient — `111_PROVIDEHTTPCLIENT.md`
- Functional Interceptors — `112_FUNCTIONAL_INTERCEPTORS.md`
- HttpContext — `113_HTTPCONTEXT.md`
- HTTP Error Handling — `114_HTTP_ERROR_HANDLING.md`
- Cancellation — `115_CANCELLATION.md`
- Caching — `116_CACHING.md`
- Data Service Pattern — `117_DATA_SERVICE_PATTERN.md`
- DTO Mapping — `118_DTO_MAPPING.md`

## SSR, Hydration & Rendering

- Angular SSR — `119_ANGULAR_SSR.md`
- Hydration — `120_HYDRATION.md`
- Incremental Hydration — `121_INCREMENTAL_HYDRATION.md`
- Event Replay — `122_EVENT_REPLAY.md`
- Prerendering — `123_PRERENDERING.md`
- Route Render Modes — `124_ROUTE_RENDER_MODES.md`
- Transfer State — `125_TRANSFER_STATE.md`
- Browser-Only APIs — `126_BROWSER_ONLY_APIS.md`
- afterNextRender — `127_AFTERNEXTRENDER.md`
- afterEveryRender — `128_AFTEREVERYRENDER.md`

## Performance

- Performance Mental Model — `129_PERFORMANCE_MENTAL_MODEL.md`
- Lazy Routes — `130_LAZY_ROUTES.md`
- @defer Performance — `131_DEFER_PERFORMANCE.md`
- OnPush Default Performance — `132_ONPUSH_DEFAULT_PERFORMANCE.md`
- Zoneless Performance — `133_ZONELESS_PERFORMANCE.md`
- track in @for — `134_TRACK_IN_FOR.md`
- Pure Pipes — `135_PURE_PIPES.md`
- Memoized Derived State — `136_MEMOIZED_DERIVED_STATE.md`
- Virtual Scrolling — `137_VIRTUAL_SCROLLING.md`
- NgOptimizedImage — `138_NGOPTIMIZEDIMAGE.md`
- Preloading — `139_PRELOADING.md`
- Bundle Analysis — `140_BUNDLE_ANALYSIS.md`
- Web Vitals — `141_WEB_VITALS.md`

## State Management Architecture

- Local Signal State — `142_LOCAL_SIGNAL_STATE.md`
- Feature Service State — `143_FEATURE_SERVICE_STATE.md`
- Signal Store Pattern — `144_SIGNAL_STORE_PATTERN.md`
- NgRx — `145_NGRX.md`
- ComponentStore / SignalStore — `146_COMPONENTSTORE_SIGNALSTORE.md`
- State Ownership — `147_STATE_OWNERSHIP.md`
- Server State — `148_SERVER_STATE.md`
- URL State — `149_URL_STATE.md`

## Testing

- Vitest Default — `150_VITEST_DEFAULT.md`
- TestBed — `151_TESTBED.md`
- ComponentFixture — `152_COMPONENTFIXTURE.md`
- Component Testing — `153_COMPONENT_TESTING.md`
- Service Testing — `154_SERVICE_TESTING.md`
- HTTP Testing — `155_HTTP_TESTING.md`
- Router Testing — `156_ROUTER_TESTING.md`
- Signal Testing — `157_SIGNAL_TESTING.md`
- Fake Dependencies — `158_FAKE_DEPENDENCIES.md`
- Testing Accessibility — `159_TESTING_ACCESSIBILITY.md`
- E2E — `160_E2E.md`
- Karma Migration — `161_KARMA_MIGRATION.md`

## Security & Accessibility

- Angular Security Model — `162_ANGULAR_SECURITY_MODEL.md`
- DomSanitizer — `163_DOMSANITIZER.md`
- XSS — `164_XSS.md`
- CSP — `165_CSP.md`
- Trusted Types — `166_TRUSTED_TYPES.md`
- XSRF — `167_XSRF.md`
- Authentication — `168_AUTHENTICATION.md`
- Authorization — `169_AUTHORIZATION.md`
- Secrets — `170_SECRETS.md`
- Semantic HTML — `171_SEMANTIC_HTML.md`
- Angular Aria — `172_ANGULAR_ARIA.md`
- Focus Management — `173_FOCUS_MANAGEMENT.md`
- Live Regions — `174_LIVE_REGIONS.md`
- Accessibility Testing — `175_ACCESSIBILITY_TESTING.md`

## Architecture & Enterprise Patterns

- Feature-First Folders — `176_FEATURE_FIRST_FOLDERS.md`
- Core vs Shared — `177_CORE_VS_SHARED.md`
- Smart / Presentational — `178_SMART_PRESENTATIONAL.md`
- Facade Pattern — `179_FACADE_PATTERN.md`
- Repository / API Adapter — `180_REPOSITORY_API_ADAPTER.md`
- Standalone Bootstrap — `181_STANDALONE_BOOTSTRAP.md`
- Environment Providers — `182_ENVIRONMENT_PROVIDERS.md`
- NgModules Legacy — `183_NGMODULES_LEGACY.md`
- Microfrontend Integration — `184_MICROFRONTEND_INTEGRATION.md`
- Design System — `185_DESIGN_SYSTEM.md`
- Configuration — `186_CONFIGURATION.md`
- Error Architecture — `187_ERROR_ARCHITECTURE.md`
- Observability — `188_OBSERVABILITY.md`

## Tooling & CLI

- Angular CLI — `189_ANGULAR_CLI.md`
- ng new — `190_NG_NEW.md`
- ng generate — `191_NG_GENERATE.md`
- ng serve — `192_NG_SERVE.md`
- ng build — `193_NG_BUILD.md`
- ng test — `194_NG_TEST.md`
- ng update — `195_NG_UPDATE.md`
- Budgets — `196_BUDGETS.md`
- DevTools — `197_DEVTOOLS.md`

## Interview & Troubleshooting

- Angular vs React — `198_ANGULAR_VS_REACT.md`
- Signals vs RxJS Interview — `199_SIGNALS_VS_RXJS_INTERVIEW.md`
- Standalone vs NgModule — `200_STANDALONE_VS_NGMODULE.md`
- Zoneless Interview — `201_ZONELESS_INTERVIEW.md`
- OnPush Interview — `202_ONPUSH_INTERVIEW.md`
- Change Detection Bug — `203_CHANGE_DETECTION_BUG.md`
- ExpressionChanged Troubleshooting — `204_EXPRESSIONCHANGED_TROUBLESHOOTING.md`
- Memory Leak Troubleshooting — `205_MEMORY_LEAK_TROUBLESHOOTING.md`
- HTTP Duplicate Calls — `206_HTTP_DUPLICATE_CALLS.md`
- switchMap Race Fix — `207_SWITCHMAP_RACE_FIX.md`
- Form Performance — `208_FORM_PERFORMANCE.md`
- SSR Mismatch — `209_SSR_MISMATCH.md`
- Bundle Too Large — `210_BUNDLE_TOO_LARGE.md`
- DI NullInjector Error — `211_DI_NULLINJECTOR_ERROR.md`
- Circular Dependency — `212_CIRCULAR_DEPENDENCY.md`
- Interview Traps — `213_INTERVIEW_TRAPS.md`


---

<!-- 010_PROPERTY_BINDING.md -->

# Property Binding

## What / Why

Binds DOM/component properties.

## Mental Model

```text
[disabled]='isSaving()'
```

## Example / Recall

```ts
// Minimal recall example for: Property Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for one-way data into DOM/components.

## Common Mistake / Interview Trap

Attribute and property binding are not identical.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Property Binding:** Binds DOM/component properties.


---

<!-- 011_EVENT_BINDING.md -->

# Event Binding

## What / Why

Calls handlers for DOM/component events.

## Mental Model

```text
(click)='save()'
```

## Example / Recall

```ts
// Minimal recall example for: Event Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UI interaction.

## Common Mistake / Interview Trap

Keep handlers small; delegate business logic.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Event Binding:** Calls handlers for DOM/component events.


---

<!-- 012_TWO_WAY_BINDING.md -->

# Two-Way Binding

## What / Why

Combines input and output binding semantics.

## Mental Model

```text
[(ngModel)] or model() patterns
```

## Example / Recall

```ts
// Minimal recall example for: Two-Way Binding
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use where bidirectional UI binding improves clarity.

## Common Mistake / Interview Trap

Do not use two-way binding to hide complicated state ownership.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Two-Way Binding:** Combines input and output binding semantics.


---

<!-- 013_TEMPLATE_REFERENCE_VARIABLES.md -->

# Template Reference Variables

## What / Why

Expose template elements/directives/components locally.

## Mental Model

```text
#inputRef
```

## Example / Recall

```ts
// Minimal recall example for: Template Reference Variables
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for template-local interaction.

## Common Mistake / Interview Trap

Template refs are not application state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Template Reference Variables:** Expose template elements/directives/components locally.


---

<!-- 014_HOST_BINDINGS.md -->

# Host Bindings

## What / Why

Modern Angular favors `host` metadata for host properties/events.

## Mental Model

```text
host: {'[class.active]':'active()'}
```

## Example / Recall

```ts
// Minimal recall example for: Host Bindings
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for component/directive host behavior.

## Common Mistake / Interview Trap

Avoid legacy @HostBinding/@HostListener in new code when host metadata is clearer.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Host Bindings:** Modern Angular favors `host` metadata for host properties/events.


---

<!-- 015_CONTENT_PROJECTION.md -->

# Content Projection

## What / Why

Projects caller content into component templates.

## Mental Model

```text
<ng-content>
```

## Example / Recall

```ts
// Minimal recall example for: Content Projection
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable shells/layout components.

## Common Mistake / Interview Trap

Projected content remains owned by the caller.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Content Projection:** Projects caller content into component templates.


---

<!-- 016_VIEW_ENCAPSULATION.md -->

# View Encapsulation

## What / Why

Controls how component CSS is scoped.

## Mental Model

```text
Emulated / ShadowDom / None
```

## Example / Recall

```ts
// Minimal recall example for: View Encapsulation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use Emulated as normal default; choose others deliberately.

## Common Mistake / Interview Trap

View encapsulation is not a security boundary.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **View Encapsulation:** Controls how component CSS is scoped.


---

<!-- 017_PIPES.md -->

# Pipes

## What / Why

Transform values declaratively in templates.

## Mental Model

```text
{{ total | currency }}
```

## Example / Recall

```ts
// Minimal recall example for: Pipes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use pure presentation transformations.

## Common Mistake / Interview Trap

Do not place side-effecting business logic in pipes.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Pipes:** Transform values declaratively in templates.


---

<!-- 018_DIRECTIVES.md -->

# Directives

## What / Why

Add behavior to existing DOM/components.

## Mental Model

```text
attribute/structural behavior
```

## Example / Recall

```ts
// Minimal recall example for: Directives
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when behavior does not require its own visual template.

## Common Mistake / Interview Trap

Prefer components when a visual UI unit has its own structure.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Directives:** Add behavior to existing DOM/components.


---

<!-- 019_LIFECYCLE.md -->

# Lifecycle

## What / Why

Angular invokes lifecycle hooks around creation, checks, rendering and destruction.

## Mental Model

```text
construct → inputs → render → after render → destroy
```

## Example / Recall

```ts
// Minimal recall example for: Lifecycle
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use lifecycle hooks only for real lifecycle responsibilities.

## Common Mistake / Interview Trap

Do not put general initialization logic into every hook by habit.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Lifecycle:** Angular invokes lifecycle hooks around creation, checks, rendering and destruction.


---

<!-- 01_30_SECOND_RECALL.md -->

# Angular — 30-Second Recall

## Formula

```text
Component
+ Template
+ Signals/RxJS
+ DI
+ Router
+ Forms
+ HttpClient
+ Change Detection
= Angular Application
```

## Angular 22 Modern Baseline

```text
Standalone default
Zoneless default
OnPush default
Signals first-class
Signal Forms stable
resource / httpResource stable
Vitest default
Built-in @if / @for / @switch / @defer
SSR + hydration + incremental hydration
```

## Request / UI Flow

```text
User Event / HTTP / Signal Update
           ↓
Angular receives notification
           ↓
OnPush-targeted change detection
           ↓
Template bindings update
           ↓
DOM
```

## 10-Second Interview Answer

> Angular is a full TypeScript web framework with components, templates, fine-grained signal reactivity, RxJS interoperability, dependency injection, router, forms, HTTP, SSR/hydration, testing, and first-party CLI tooling.


---

<!-- 020_IF.md -->

# @if

## What / Why

Built-in conditional template control flow.

## Mental Model

```text
@if (user()) { ... } @else { ... }
```

## Example / Recall

```ts
// Minimal recall example for: @if
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use instead of legacy *ngIf in modern Angular.

## Common Mistake / Interview Trap

Keep conditions simple and signal-friendly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@if:** Built-in conditional template control flow.


---

<!-- 021_FOR.md -->

# @for

## What / Why

Built-in iteration with explicit tracking.

## Mental Model

```text
@for (item of items(); track item.id)
```

## Example / Recall

```ts
// Minimal recall example for: @for
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for lists; track stable identity.

## Common Mistake / Interview Trap

Poor tracking causes unnecessary DOM work/state problems.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@for:** Built-in iteration with explicit tracking.


---

<!-- 022_SWITCH.md -->

# @switch

## What / Why

Built-in switch control flow.

## Mental Model

```text
@switch (status()) { @case ('ok') {...} }
```

## Example / Recall

```ts
// Minimal recall example for: @switch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for mutually exclusive template states.

## Common Mistake / Interview Trap

Avoid nested switch-heavy templates when state modeling can be improved.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@switch:** Built-in switch control flow.


---

<!-- 023_EMPTY.md -->

# @empty

## What / Why

Provides empty-list branch for @for.

## Mental Model

```text
@for (...) {...} @empty {...}
```

## Example / Recall

```ts
// Minimal recall example for: @empty
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for empty UX.

## Common Mistake / Interview Trap

Avoid separate duplicated list/empty logic.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@empty:** Provides empty-list branch for @for.


---

<!-- 024_LET.md -->

# @let

## What / Why

Declares reusable template-local value.

## Mental Model

```text
@let fullName = first() + ' ' + last();
```

## Example / Recall

```ts
// Minimal recall example for: @let
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to avoid repeated template computations.

## Common Mistake / Interview Trap

Keep derived logic modest.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@let:** Declares reusable template-local value.


---

<!-- 025_DEFER.md -->

# @defer

## What / Why

Defers loading/rendering a block until triggers are met.

## Mental Model

```text
@defer (on viewport) { <Chart/> }
```

## Example / Recall

```ts
// Minimal recall example for: @defer
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for non-critical heavy UI and bundle splitting.

## Common Mistake / Interview Trap

Always design placeholder/loading/error states.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@defer:** Defers loading/rendering a block until triggers are met.


---

<!-- 026_DEFER_TRIGGERS.md -->

# Defer Triggers

## What / Why

Controls when deferred blocks load.

## Mental Model

```text
idle / viewport / interaction / hover / timer / when
```

## Example / Recall

```ts
// Minimal recall example for: Defer Triggers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use based on UX/performance need.

## Common Mistake / Interview Trap

Do not defer critical above-the-fold content blindly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Defer Triggers:** Controls when deferred blocks load.


---

<!-- 027_DEFER_PREFETCH.md -->

# Defer Prefetch

## What / Why

Prefetches deferred code/data ahead of rendering.

## Mental Model

```text
prefetch on idle
```

## Example / Recall

```ts
// Minimal recall example for: Defer Prefetch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce perceived wait.

## Common Mistake / Interview Trap

Can waste network bandwidth.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Defer Prefetch:** Prefetches deferred code/data ahead of rendering.


---

<!-- 028_TEMPLATE_TYPE_CHECKING.md -->

# Template Type Checking

## What / Why

Angular compiler checks template expressions against TypeScript types.

## Mental Model

```text
strictTemplates
```

## Example / Recall

```ts
// Minimal recall example for: Template Type Checking
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep strict template checking enabled.

## Common Mistake / Interview Trap

Using any weakens one of Angular's strongest safety features.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Template Type Checking:** Angular compiler checks template expressions against TypeScript types.


---

<!-- 029_SIGNAL.md -->

# signal

## What / Why

Creates writable reactive state.

## Mental Model

```text
count = signal(0)
```

## Example / Recall

```ts
// Minimal recall example for: signal
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for local/component/application reactive state.

## Common Mistake / Interview Trap

Read with count(); update with set/update.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **signal:** Creates writable reactive state.


---

<!-- 02_CURRENT_ANGULAR_22.md -->

# Current Angular Baseline — Angular 22

## Current Stable

As of 15 September 2026:
- Angular 22 is the active major line.
- Angular 22.1.6 is the current stable release line surfaced by official/npm release data.
- Angular 22.2 is still in `next` pre-release builds.

## Angular 22 Modern Defaults / Stable Features

```text
Standalone components are the normal/default model
Zoneless change detection is default (since v21+)
OnPush is the default component change-detection strategy (since v22)
ChangeDetectionStrategy.Eager is the explicit eager mode
ChangeDetectionStrategy.Default is deprecated alias for Eager
Signal Forms are stable in v22
resource() is stable in v22
httpResource() is stable in v22
Vitest is the default unit-test runner for new CLI projects
Angular Aria is stable in v22
```

## Version Compatibility Baseline

Angular 22.0.x officially requires:
- Node.js: ^22.22.3 || ^24.15.0 || ^26.0.0
- TypeScript: >=6.0.0 <6.1.0
- RxJS: ^6.5.3 || ^7.4.0

Check exact compatibility for the specific Angular 22 minor/patch used in a real project.

## Interview Rule

Always distinguish:
- Angular 22 current practice,
- Angular 20/21 transition-era guidance,
- legacy NgModule/ZoneJS/Karma architecture.


---

<!-- 030_COMPUTED.md -->

# computed

## What / Why

Creates derived reactive state.

## Mental Model

```text
fullName = computed(()=>first()+' '+last())
```

## Example / Recall

```ts
// Minimal recall example for: computed
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use instead of duplicated derived state.

## Common Mistake / Interview Trap

Computed functions should be pure.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **computed:** Creates derived reactive state.


---

<!-- 031_EFFECT.md -->

# effect

## What / Why

Runs side-effecting logic when signal dependencies change.

## Mental Model

```text
effect(()=>console.log(count()))
```

## Example / Recall

```ts
// Minimal recall example for: effect
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for external synchronization, logging, imperative integrations.

## Common Mistake / Interview Trap

Do not use effects for ordinary derived state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **effect:** Runs side-effecting logic when signal dependencies change.


---

<!-- 032_LINKEDSIGNAL.md -->

# linkedSignal

## What / Why

Creates writable state that derives/reset/reconciles from other reactive state.

## Mental Model

```text
selected = linkedSignal(()=>options()[0])
```

## Example / Recall

```ts
// Minimal recall example for: linkedSignal
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when writable state depends on changing source state.

## Common Mistake / Interview Trap

Prefer computed if callers never need to write it.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **linkedSignal:** Creates writable state that derives/reset/reconciles from other reactive state.


---

<!-- 033_RESOURCE.md -->

# resource

## What / Why

Reactive async read API driven by signals.

## Mental Model

```text
resource({params:..., loader:...})
```

## Example / Recall

```ts
// Minimal recall example for: resource
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for signal-driven read operations.

## Common Mistake / Interview Trap

Do not use resource loaders for mutations.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **resource:** Reactive async read API driven by signals.


---

<!-- 034_HTTPRESOURCE.md -->

# httpResource

## What / Why

Reactive signal-based wrapper over HttpClient for GET/read workflows.

## Mental Model

```text
httpResource(()=>`/api/users/${id()}`)
```

## Example / Recall

```ts
// Minimal recall example for: httpResource
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reactive HTTP reads while retaining HttpClient features.

## Common Mistake / Interview Trap

For mutations use HttpClient/action/service methods, not httpResource read semantics.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **httpResource:** Reactive signal-based wrapper over HttpClient for GET/read workflows.


---

<!-- 035_RESOURCE_STATUS.md -->

# Resource Status

## What / Why

Resources expose value/loading/error/status style reactive state.

## Mental Model

```text
resource.value()/isLoading/error
```

## Example / Recall

```ts
// Minimal recall example for: Resource Status
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to model async UX declaratively.

## Common Mistake / Interview Trap

Always render loading/error/empty states.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Resource Status:** Resources expose value/loading/error/status style reactive state.


---

<!-- 036_SIGNAL_EQUALITY.md -->

# Signal Equality

## What / Why

Signals can customize equality semantics.

## Mental Model

```text
signal(value,{equal:...})
```

## Example / Recall

```ts
// Minimal recall example for: Signal Equality
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use rarely for performance/domain equality.

## Common Mistake / Interview Trap

Incorrect equality can suppress required updates.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Equality:** Signals can customize equality semantics.


---

<!-- 037_UNTRACKED.md -->

# untracked

## What / Why

Reads a signal without creating a reactive dependency.

## Mental Model

```text
untracked(counter)
```

## Example / Recall

```ts
// Minimal recall example for: untracked
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when incidental read should not re-run computation/effect.

## Common Mistake / Interview Trap

Do not use to hide a dependency bug.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **untracked:** Reads a signal without creating a reactive dependency.


---

<!-- 038_SIGNAL_INPUTS.md -->

# Signal Inputs

## What / Why

input()/input.required() define signal-based component inputs.

## Mental Model

```text
name = input.required<string>()
```

## Example / Recall

```ts
// Minimal recall example for: Signal Inputs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in modern components.

## Common Mistake / Interview Trap

Input signals are read-only to child component.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Inputs:** input()/input.required() define signal-based component inputs.


---

<!-- 039_MODEL_INPUTS.md -->

# Model Inputs

## What / Why

model() enables signal-based two-way binding contract.

## Mental Model

```text
value = model('')
```

## Example / Recall

```ts
// Minimal recall example for: Model Inputs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable controls with two-way binding semantics.

## Common Mistake / Interview Trap

Do not overuse two-way APIs for one-way data flow.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Model Inputs:** model() enables signal-based two-way binding contract.


---

<!-- 03_MODERN_VS_LEGACY_ANGULAR.md -->

# Modern Angular vs Legacy Angular — Quick Map

| Modern Angular 22 | Older / Legacy Angular |
|---|---|
| Standalone default | NgModule-first |
| `bootstrapApplication` | `platformBrowserDynamic().bootstrapModule` |
| `input()` / `output()` / `model()` | decorator `@Input` / `@Output` |
| Signals / computed / effect | RxJS/fields for most local state |
| Zoneless default | ZoneJS default |
| OnPush default | Default/CheckAlways common |
| `Eager` explicit mode | `Default` terminology |
| `@if @for @switch` | `*ngIf *ngFor ngSwitch` |
| `@defer` | manual lazy techniques |
| Signal Forms stable | Reactive/Template Forms only |
| Vitest default new projects | Karma/Jasmine common |
| functional providers/interceptors/guards | class/module configuration common |
| SSR + incremental hydration | older Angular Universal model |

## Critical Point

Legacy APIs remain important because enterprise Angular applications may span many versions.

Modernize incrementally; do not confuse “not preferred for new code” with “removed.”


---

<!-- 040_SIGNAL_QUERIES.md -->

# Signal Queries

## What / Why

Modern query functions expose view/content queries reactively.

## Mental Model

```text
viewChild()/contentChild()
```

## Example / Recall

```ts
// Minimal recall example for: Signal Queries
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for component/DOM integration.

## Common Mistake / Interview Trap

Queries are implementation relationships, not global state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Queries:** Modern query functions expose view/content queries reactively.


---

<!-- 041_OUTPUT_API.md -->

# Output API

## What / Why

output() defines typed event outputs.

## Mental Model

```text
saved = output<Order>()
```

## Example / Recall

```ts
// Minimal recall example for: Output API
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for child-to-parent event contracts.

## Common Mistake / Interview Trap

Outputs communicate events, not shared mutable state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Output API:** output() defines typed event outputs.


---

<!-- 042_RXJS_INTEROP.md -->

# RxJS Interop

## What / Why

toSignal/toObservable bridge Signals and Observables.

## Mental Model

```text
toSignal(obs$), toObservable(sig)
```

## Example / Recall

```ts
// Minimal recall example for: RxJS Interop
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use at framework/service boundaries.

## Common Mistake / Interview Trap

Do not convert back and forth repeatedly without reason.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **RxJS Interop:** toSignal/toObservable bridge Signals and Observables.


---

<!-- 043_SIGNALS_VS_OBSERVABLES.md -->

# Signals vs Observables

## What / Why

Signals model synchronous current reactive state; Observables model async streams over time.

## Mental Model

```text
Signal = current value; Observable = stream
```

## Example / Recall

```ts
// Minimal recall example for: Signals vs Observables
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use both where each fits best.

## Common Mistake / Interview Trap

Signals do not replace every RxJS use case.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signals vs Observables:** Signals model synchronous current reactive state; Observables model async streams over time.


---

<!-- 044_DEPENDENCY_INJECTION_MENTAL_MODEL.md -->

# Dependency Injection Mental Model

## What / Why

Angular injectors provide configured dependencies by token.

## Mental Model

```text
Injector → token → provider → instance
```

## Example / Recall

```ts
// Minimal recall example for: Dependency Injection Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use DI for services, configuration, abstractions and testability.

## Common Mistake / Interview Trap

Avoid service locator patterns.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Dependency Injection Mental Model:** Angular injectors provide configured dependencies by token.


---

<!-- 045_INJECT.md -->

# inject

## What / Why

Reads a dependency in an injection context.

## Mental Model

```text
http = inject(HttpClient)
```

## Example / Recall

```ts
// Minimal recall example for: inject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern field/function injection where appropriate.

## Common Mistake / Interview Trap

inject() only works in supported injection contexts.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **inject:** Reads a dependency in an injection context.


---

<!-- 046_CONSTRUCTOR_INJECTION.md -->

# Constructor Injection

## What / Why

Traditional explicit constructor dependency injection.

## Mental Model

```text
constructor(private api:ApiService) {}
```

## Example / Recall

```ts
// Minimal recall example for: Constructor Injection
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy and explicit class APIs.

## Common Mistake / Interview Trap

Do not mix styles randomly across a codebase without standards.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Constructor Injection:** Traditional explicit constructor dependency injection.


---

<!-- 047_PROVIDERS.md -->

# Providers

## What / Why

Configure how tokens resolve to values/classes/factories.

## Mental Model

```text
providers:[ApiService]
```

## Example / Recall

```ts
// Minimal recall example for: Providers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use closest correct scope.

## Common Mistake / Interview Trap

Over-providing creates duplicate service instances.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Providers:** Configure how tokens resolve to values/classes/factories.


---

<!-- 048_PROVIDEDIN_ROOT.md -->

# providedIn root

## What / Why

Registers a tree-shakable application singleton provider.

## Mental Model

```text
@Injectable({providedIn:'root'})
```

## Example / Recall

```ts
// Minimal recall example for: providedIn root
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for app-wide stateless/shared services.

## Common Mistake / Interview Trap

Singleton lifetime should not become hidden global mutable state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **providedIn root:** Registers a tree-shakable application singleton provider.


---

<!-- 049_INJECTIONTOKEN.md -->

# InjectionToken

## What / Why

Creates typed DI token for non-class dependencies.

## Mental Model

```text
new InjectionToken<AppConfig>('APP_CONFIG')
```

## Example / Recall

```ts
// Minimal recall example for: InjectionToken
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for config/interfaces/factories.

## Common Mistake / Interview Trap

Interfaces do not exist at runtime and cannot be DI tokens.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **InjectionToken:** Creates typed DI token for non-class dependencies.


---

<!-- 04_SIGNALS_RXJS_DECISION.md -->

# Signals vs RxJS — Decision Cheat Sheet

## Use Signals For

```text
component state
feature state with current value
derived state
template reactivity
signal inputs/models
local synchronous UI state
```

## Use RxJS For

```text
multi-event async streams
WebSocket/events
complex cancellation
debounce/throttle
concurrency
stream composition
retry/backoff
```

## Use Both

```text
HttpClient Observable
   ↓
RxJS composition
   ↓
toSignal()
   ↓
Template
```

or:

```text
Signal
 ↓
toObservable()
 ↓
RxJS async pipeline
```

## Interview Line

> Signals and RxJS are complementary. Signals optimize synchronous state/reactive rendering; RxJS excels at asynchronous event streams and temporal composition.


---

<!-- 050_USECLASS.md -->

# useClass

## What / Why

Maps token to implementation class.

## Mental Model

```text
{provide:Repo,useClass:HttpRepo}
```

## Example / Recall

```ts
// Minimal recall example for: useClass
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for abstraction substitution.

## Common Mistake / Interview Trap

Avoid unnecessary abstraction for every trivial service.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **useClass:** Maps token to implementation class.


---

<!-- 051_USEVALUE.md -->

# useValue

## What / Why

Provides fixed value/config.

## Mental Model

```text
{provide:API_URL,useValue:'...'}
```

## Example / Recall

```ts
// Minimal recall example for: useValue
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for immutable runtime/config values.

## Common Mistake / Interview Trap

Do not place secrets in browser DI config.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **useValue:** Provides fixed value/config.


---

<!-- 052_USEFACTORY.md -->

# useFactory

## What / Why

Creates dependency from other dependencies.

## Mental Model

```text
useFactory:(cfg)=>new Client(cfg.url)
```

## Example / Recall

```ts
// Minimal recall example for: useFactory
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for dynamic configuration.

## Common Mistake / Interview Trap

Factory logic should remain deterministic and testable.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **useFactory:** Creates dependency from other dependencies.


---

<!-- 053_USEEXISTING.md -->

# useExisting

## What / Why

Aliases one token to an existing provider.

## Mental Model

```text
{provide:Logger,useExisting:AppLogger}
```

## Example / Recall

```ts
// Minimal recall example for: useExisting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to avoid duplicate instances.

## Common Mistake / Interview Trap

Different from useClass, which can instantiate another object.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **useExisting:** Aliases one token to an existing provider.


---

<!-- 054_HIERARCHICAL_INJECTORS.md -->

# Hierarchical Injectors

## What / Why

Child injectors can override providers.

## Mental Model

```text
root → route/component subtree
```

## Example / Recall

```ts
// Minimal recall example for: Hierarchical Injectors
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for scoped feature instances.

## Common Mistake / Interview Trap

Know provider scope when debugging duplicate state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Hierarchical Injectors:** Child injectors can override providers.


---

<!-- 055_ENVIRONMENTINJECTOR.md -->

# EnvironmentInjector

## What / Why

Represents environment/provider scope for standalone/runtime composition.

## Mental Model

```text
EnvironmentInjector
```

## Example / Recall

```ts
// Minimal recall example for: EnvironmentInjector
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in advanced dynamic composition.

## Common Mistake / Interview Trap

Prefer normal DI unless dynamic scenarios require it.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **EnvironmentInjector:** Represents environment/provider scope for standalone/runtime composition.


---

<!-- 056_RUNININJECTIONCONTEXT.md -->

# runInInjectionContext

## What / Why

Runs code with an injector available to inject().

## Mental Model

```text
runInInjectionContext(injector, fn)
```

## Example / Recall

```ts
// Minimal recall example for: runInInjectionContext
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for advanced library/runtime cases.

## Common Mistake / Interview Trap

Not needed in normal component methods.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **runInInjectionContext:** Runs code with an injector available to inject().


---

<!-- 057_ZONELESS_DEFAULT.md -->

# Zoneless Default

## What / Why

Angular v21+ uses zoneless change detection by default.

## Mental Model

```text
Signal/event/input notification → targeted checks
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern notification mechanisms; ZoneJS is not required by default.

## Common Mistake / Interview Trap

Do not teach ZoneJS patching as the default modern Angular model.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Zoneless Default:** Angular v21+ uses zoneless change detection by default.


---

<!-- 058_ONPUSH_DEFAULT.md -->

# OnPush Default

## What / Why

Angular v22 defaults components to OnPush.

## Mental Model

```text
change → mark relevant subtree
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use signals, inputs, events and AsyncPipe to notify Angular.

## Common Mistake / Interview Trap

Do not explicitly add OnPush everywhere just because older best practice guides say so.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **OnPush Default:** Angular v22 defaults components to OnPush.


---

<!-- 059_CHANGEDETECTIONSTRATEGY_EAGER.md -->

# ChangeDetectionStrategy Eager

## What / Why

Eager is the opt-in always-check strategy; old Default alias is deprecated.

## Mental Model

```text
OnPush default ↔ Eager opt-in
```

## Example / Recall

```ts
// Minimal recall example for: ChangeDetectionStrategy Eager
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use only where eager checking is genuinely required.

## Common Mistake / Interview Trap

`ChangeDetectionStrategy.Default` is now a deprecated alias for Eager.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ChangeDetectionStrategy Eager:** Eager is the opt-in always-check strategy; old Default alias is deprecated.


---

<!-- 060_MARKFORCHECK.md -->

# markForCheck

## What / Why

Marks a view for checking.

## Mental Model

```text
cdr.markForCheck()
```

## Example / Recall

```ts
// Minimal recall example for: markForCheck
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when imperative integration changes data outside normal notification APIs.

## Common Mistake / Interview Trap

Signals/AsyncPipe often make manual calls unnecessary.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **markForCheck:** Marks a view for checking.


---

<!-- 061_DETECTCHANGES.md -->

# detectChanges

## What / Why

Runs change detection for a view subtree immediately.

## Mental Model

```text
cdr.detectChanges()
```

## Example / Recall

```ts
// Minimal recall example for: detectChanges
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use sparingly in advanced integration/testing.

## Common Mistake / Interview Trap

Frequent manual detectChanges usually signals design issues.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **detectChanges:** Runs change detection for a view subtree immediately.


---

<!-- 062_DETACH_REATTACH.md -->

# detach / reattach

## What / Why

Removes/adds a view from normal change-detection traversal.

## Mental Model

```text
cdr.detach(); ...; cdr.reattach()
```

## Example / Recall

```ts
// Minimal recall example for: detach / reattach
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for specialized high-performance scenarios.

## Common Mistake / Interview Trap

Detached views require careful manual updates.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **detach / reattach:** Removes/adds a view from normal change-detection traversal.


---

<!-- 063_ASYNCPIPE_NOTIFICATION.md -->

# AsyncPipe Notification

## What / Why

AsyncPipe subscribes and marks view when values arrive.

## Mental Model

```text
observable | async
```

## Example / Recall

```ts
// Minimal recall example for: AsyncPipe Notification
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for Observable template consumption.

## Common Mistake / Interview Trap

Prefer AsyncPipe over manual subscribe for template-bound streams.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **AsyncPipe Notification:** AsyncPipe subscribes and marks view when values arrive.


---

<!-- 064_SIGNAL_TEMPLATE_NOTIFICATION.md -->

# Signal Template Notification

## What / Why

Updating a signal read in a template schedules the correct view update.

## Mental Model

```text
signal.set → Angular notification
```

## Example / Recall

```ts
// Minimal recall example for: Signal Template Notification
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as the primary modern reactive state mechanism.

## Common Mistake / Interview Trap

Mutating object internals without changing tracked signal semantics can be confusing.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Template Notification:** Updating a signal read in a template schedules the correct view update.


---

<!-- 065_EXPRESSIONCHANGED_ERROR.md -->

# ExpressionChanged Error

## What / Why

Dev-mode check catches values changing after a view was checked.

## Mental Model

```text
render → value changes too late
```

## Example / Recall

```ts
// Minimal recall example for: ExpressionChanged Error
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Fix lifecycle/data-flow timing instead of hiding the error.

## Common Mistake / Interview Trap

setTimeout hacks often hide the root cause.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ExpressionChanged Error:** Dev-mode check catches values changing after a view was checked.


---

<!-- 066_OBSERVABLE_MENTAL_MODEL.md -->

# Observable Mental Model

## What / Why

Observable represents a potentially asynchronous stream of values.

## Mental Model

```text
producer → operators → subscriber
```

## Example / Recall

```ts
// Minimal recall example for: Observable Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for events, HTTP, websockets, streams and composition.

## Common Mistake / Interview Trap

Observable is lazy only when implementation is cold; hot/cold matters.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Observable Mental Model:** Observable represents a potentially asynchronous stream of values.


---

<!-- 067_SUBJECT.md -->

# Subject

## What / Why

Multicasts manually pushed values.

## Mental Model

```text
subject.next(x)
```

## Example / Recall

```ts
// Minimal recall example for: Subject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative event sources carefully.

## Common Mistake / Interview Trap

Subjects often become hidden mutable globals.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Subject:** Multicasts manually pushed values.


---

<!-- 068_BEHAVIORSUBJECT.md -->

# BehaviorSubject

## What / Why

Subject with current value for new subscribers.

## Mental Model

```text
new BehaviorSubject(initial)
```

## Example / Recall

```ts
// Minimal recall example for: BehaviorSubject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy state stores.

## Common Mistake / Interview Trap

Signals are often simpler for current synchronous UI state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **BehaviorSubject:** Subject with current value for new subscribers.


---

<!-- 069_REPLAYSUBJECT.md -->

# ReplaySubject

## What / Why

Replays configured previous values.

## Mental Model

```text
new ReplaySubject(1)
```

## Example / Recall

```ts
// Minimal recall example for: ReplaySubject
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when late subscribers need history.

## Common Mistake / Interview Trap

Can retain memory unexpectedly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ReplaySubject:** Replays configured previous values.


---

<!-- 070_MAP.md -->

# map

## What / Why

Transforms each emission.

## Mental Model

```text
source.pipe(map(x=>...))
```

## Example / Recall

```ts
// Minimal recall example for: map
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for pure transformation.

## Common Mistake / Interview Trap

Do not subscribe inside map.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **map:** Transforms each emission.


---

<!-- 071_FILTER.md -->

# filter

## What / Why

Emits only matching values.

## Mental Model

```text
filter(x=>x.active)
```

## Example / Recall

```ts
// Minimal recall example for: filter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for stream filtering.

## Common Mistake / Interview Trap

Remember filter changes emissions, not source data.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **filter:** Emits only matching values.


---

<!-- 072_SWITCHMAP.md -->

# switchMap

## What / Why

Switches to latest inner Observable and cancels prior subscription.

## Mental Model

```text
query$ → switchMap(search)
```

## Example / Recall

```ts
// Minimal recall example for: switchMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Great for latest-only searches/requests.

## Common Mistake / Interview Trap

Wrong for operations that must all complete.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **switchMap:** Switches to latest inner Observable and cancels prior subscription.


---

<!-- 073_MERGEMAP.md -->

# mergeMap

## What / Why

Subscribes to multiple inner Observables concurrently.

## Mental Model

```text
events → mergeMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: mergeMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for concurrent independent work.

## Common Mistake / Interview Trap

Control concurrency for high-volume sources.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **mergeMap:** Subscribes to multiple inner Observables concurrently.


---

<!-- 074_CONCATMAP.md -->

# concatMap

## What / Why

Queues inner Observables sequentially.

## Mental Model

```text
events → concatMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: concatMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when order matters.

## Common Mistake / Interview Trap

Can build backlog.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **concatMap:** Queues inner Observables sequentially.


---

<!-- 075_EXHAUSTMAP.md -->

# exhaustMap

## What / Why

Ignores new source values while current inner work runs.

## Mental Model

```text
submit$ → exhaustMap(save)
```

## Example / Recall

```ts
// Minimal recall example for: exhaustMap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to prevent repeated submit/login requests.

## Common Mistake / Interview Trap

Not suitable when latest event must win.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **exhaustMap:** Ignores new source values while current inner work runs.


---

<!-- 076_CATCHERROR.md -->

# catchError

## What / Why

Handles stream errors.

## Mental Model

```text
catchError(err=>of(fallback))
```

## Example / Recall

```ts
// Minimal recall example for: catchError
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Handle at appropriate boundary.

## Common Mistake / Interview Trap

Catching too early can hide failures.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **catchError:** Handles stream errors.


---

<!-- 077_RETRY.md -->

# retry

## What / Why

Re-subscribes after errors.

## Mental Model

```text
retry({count:3,delay:...})
```

## Example / Recall

```ts
// Minimal recall example for: retry
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for transient safe/idempotent work.

## Common Mistake / Interview Trap

Never blindly retry permanent or unsafe mutations.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **retry:** Re-subscribes after errors.


---

<!-- 078_SHAREREPLAY.md -->

# shareReplay

## What / Why

Shares/replays source execution.

## Mental Model

```text
shareReplay({bufferSize:1,refCount:true})
```

## Example / Recall

```ts
// Minimal recall example for: shareReplay
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for expensive shared streams with understood lifecycle.

## Common Mistake / Interview Trap

Misuse can cause stale cache or retained subscriptions.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **shareReplay:** Shares/replays source execution.


---

<!-- 079_COMBINELATEST.md -->

# combineLatest

## What / Why

Combines latest values after all sources emitted.

## Mental Model

```text
combineLatest([a$,b$])
```

## Example / Recall

```ts
// Minimal recall example for: combineLatest
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for continuously derived async state.

## Common Mistake / Interview Trap

It waits until each source has emitted.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **combineLatest:** Combines latest values after all sources emitted.


---

<!-- 080_FORKJOIN.md -->

# forkJoin

## What / Why

Waits for all sources to complete and emits final values.

## Mental Model

```text
forkJoin({a:a$,b:b$})
```

## Example / Recall

```ts
// Minimal recall example for: forkJoin
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for parallel one-shot requests.

## Common Mistake / Interview Trap

Never emits if a source never completes.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **forkJoin:** Waits for all sources to complete and emits final values.


---

<!-- 081_DEBOUNCETIME.md -->

# debounceTime

## What / Why

Waits for quiet period before emission.

## Mental Model

```text
input$ → debounceTime(300)
```

## Example / Recall

```ts
// Minimal recall example for: debounceTime
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for search/typeahead.

## Common Mistake / Interview Trap

Different from throttling.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **debounceTime:** Waits for quiet period before emission.


---

<!-- 082_TAKEUNTILDESTROYED.md -->

# takeUntilDestroyed

## What / Why

Automatically completes subscription when Angular context is destroyed.

## Mental Model

```text
pipe(takeUntilDestroyed())
```

## Example / Recall

```ts
// Minimal recall example for: takeUntilDestroyed
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative subscriptions in Angular.

## Common Mistake / Interview Trap

Prefer AsyncPipe/toSignal where possible.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **takeUntilDestroyed:** Automatically completes subscription when Angular context is destroyed.


---

<!-- 083_RXJS_OPERATOR_DECISION.md -->

# RxJS Operator Decision

## What / Why

Choose flattening operator based on cancellation/order/concurrency semantics.

## Mental Model

```text
switch/merge/concat/exhaust
```

## Example / Recall

```ts
// Minimal recall example for: RxJS Operator Decision
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Memorize by business semantics.

## Common Mistake / Interview Trap

Selecting operator by habit creates race conditions.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **RxJS Operator Decision:** Choose flattening operator based on cancellation/order/concurrency semantics.


---

<!-- 084_ROUTER_MENTAL_MODEL.md -->

# Router Mental Model

## What / Why

Router matches URL to route configuration and renders route components/outlets.

## Mental Model

```text
URL → route match → guards/resolvers → component
```

## Example / Recall

```ts
// Minimal recall example for: Router Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use router as application navigation architecture.

## Common Mistake / Interview Trap

Do not build complex navigation with manual DOM state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Router Mental Model:** Router matches URL to route configuration and renders route components/outlets.


---

<!-- 085_PROVIDEROUTER.md -->

# provideRouter

## What / Why

Configures standalone router providers.

## Mental Model

```text
bootstrapApplication(App,{providers:[provideRouter(routes)]})
```

## Example / Recall

```ts
// Minimal recall example for: provideRouter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in modern standalone apps.

## Common Mistake / Interview Trap

NgModule RouterModule patterns still matter in legacy.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **provideRouter:** Configures standalone router providers.


---

<!-- 086_ROUTES.md -->

# Routes

## What / Why

Declarative path/component/lazy config.

## Mental Model

```text
const routes: Routes = [...]
```

## Example / Recall

```ts
// Minimal recall example for: Routes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Organize by feature boundaries.

## Common Mistake / Interview Trap

Avoid one enormous routes file.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Routes:** Declarative path/component/lazy config.


---

<!-- 087_ROUTER_OUTLET.md -->

# router-outlet

## What / Why

Placeholder for activated route component.

## Mental Model

```text
<router-outlet/>
```

## Example / Recall

```ts
// Minimal recall example for: router-outlet
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in shell/layout components.

## Common Mistake / Interview Trap

Nested outlets need clear ownership.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **router-outlet:** Placeholder for activated route component.


---

<!-- 088_ROUTERLINK.md -->

# RouterLink

## What / Why

Declarative navigation in templates.

## Mental Model

```text
[routerLink]='["/users",id]'
```

## Example / Recall

```ts
// Minimal recall example for: RouterLink
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer over manual URL string assembly.

## Common Mistake / Interview Trap

Use relative navigation intentionally.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **RouterLink:** Declarative navigation in templates.


---

<!-- 089_ROUTE_PARAMS.md -->

# Route Params

## What / Why

Dynamic path values.

## Mental Model

```text
/users/:id
```

## Example / Recall

```ts
// Minimal recall example for: Route Params
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for resource identity.

## Common Mistake / Interview Trap

Read via ActivatedRoute signals/observable APIs as appropriate.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Route Params:** Dynamic path values.


---

<!-- 090_QUERY_PARAMS.md -->

# Query Params

## What / Why

Optional navigation/filter state.

## Mental Model

```text
?page=2
```

## Example / Recall

```ts
// Minimal recall example for: Query Params
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for shareable UI state.

## Common Mistake / Interview Trap

Do not store secrets.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Query Params:** Optional navigation/filter state.


---

<!-- 091_LAZY_LOADING.md -->

# Lazy Loading

## What / Why

Loads route component/config only when navigated.

## Mental Model

```text
loadComponent/loadChildren
```

## Example / Recall

```ts
// Minimal recall example for: Lazy Loading
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for feature boundaries and initial bundle reduction.

## Common Mistake / Interview Trap

Lazy loading alone does not guarantee good chunking/performance.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Lazy Loading:** Loads route component/config only when navigated.


---

<!-- 092_ROUTE_GUARDS.md -->

# Route Guards

## What / Why

Control navigation decisions.

## Mental Model

```text
CanActivateFn etc.
```

## Example / Recall

```ts
// Minimal recall example for: Route Guards
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UX/navigation policy.

## Common Mistake / Interview Trap

Backend must enforce real authorization.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Route Guards:** Control navigation decisions.


---

<!-- 093_RESOLVERS.md -->

# Resolvers

## What / Why

Load data before route activation.

## Mental Model

```text
resolve
```

## Example / Recall

```ts
// Minimal recall example for: Resolvers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when route should not render without required data.

## Common Mistake / Interview Trap

Can delay navigation; use loading UX thoughtfully.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Resolvers:** Load data before route activation.


---

<!-- 094_ROUTE_DATA.md -->

# Route Data

## What / Why

Attach static metadata/config to routes.

## Mental Model

```text
data:{title:'Users'}
```

## Example / Recall

```ts
// Minimal recall example for: Route Data
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for breadcrumbs/roles/layout hints.

## Common Mistake / Interview Trap

Avoid dumping business state into route data.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Route Data:** Attach static metadata/config to routes.


---

<!-- 095_ROUTER_EVENTS.md -->

# Router Events

## What / Why

Observe navigation lifecycle.

## Mental Model

```text
NavigationStart/End/Error
```

## Example / Recall

```ts
// Minimal recall example for: Router Events
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for telemetry/loading integration.

## Common Mistake / Interview Trap

Do not duplicate router internal state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Router Events:** Observe navigation lifecycle.


---

<!-- 096_VIEW_TRANSITIONS.md -->

# View Transitions

## What / Why

Router can integrate browser view transitions.

## Mental Model

```text
withViewTransitions()
```

## Example / Recall

```ts
// Minimal recall example for: View Transitions
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as progressive enhancement.

## Common Mistake / Interview Trap

Do not depend on transition support for correctness.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **View Transitions:** Router can integrate browser view transitions.


---

<!-- 097_ROUTE_LEVEL_RENDER_MODE.md -->

# Route-Level Render Mode

## What / Why

Configure server/client/prerender behavior per route in SSR architecture.

## Mental Model

```text
route render mode
```

## Example / Recall

```ts
// Minimal recall example for: Route-Level Render Mode
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for mixed rendering needs.

## Common Mistake / Interview Trap

Rendering strategy should follow data freshness/SEO requirements.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Route-Level Render Mode:** Configure server/client/prerender behavior per route in SSR architecture.


---

<!-- 098_FORMS_DECISION.md -->

# Forms Decision

## What / Why

Angular 22 provides Signal Forms, Reactive Forms and Template-Driven Forms.

## Mental Model

```text
Signal vs Reactive vs Template
```

## Example / Recall

```ts
// Minimal recall example for: Forms Decision
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Choose by complexity, legacy constraints and reactive model.

## Common Mistake / Interview Trap

There is no single correct form API for every app.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Forms Decision:** Angular 22 provides Signal Forms, Reactive Forms and Template-Driven Forms.


---

<!-- 099_SIGNAL_FORMS.md -->

# Signal Forms

## What / Why

Stable v22 signal-based form model with schema validation.

## Mental Model

```text
model signal → form() → [formField]
```

## Example / Recall

```ts
// Minimal recall example for: Signal Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for new signal-centric applications.

## Common Mistake / Interview Trap

Existing Reactive Forms remain production-valid; migrate incrementally.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Forms:** Stable v22 signal-based form model with schema validation.


---

<!-- 100_SIGNAL_FORM_MODEL.md -->

# Signal Form Model

## What / Why

Writable signal is source of truth for form model.

## Mental Model

```text
loginModel = signal({...})
```

## Example / Recall

```ts
// Minimal recall example for: Signal Form Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use strongly typed domain-shaped models.

## Common Mistake / Interview Trap

Do not keep duplicate control-tree and signal model unless interoperability requires it.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Form Model:** Writable signal is source of truth for form model.


---

<!-- 101_SIGNAL_FORM_VALIDATION.md -->

# Signal Form Validation

## What / Why

Defines validation in schema functions.

## Mental Model

```text
required(path.email), email(path.email)
```

## Example / Recall

```ts
// Minimal recall example for: Signal Form Validation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use centralized typed validation.

## Common Mistake / Interview Trap

Server-side validation still required.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Form Validation:** Defines validation in schema functions.


---

<!-- 102_FORMFIELD.md -->

# FormField

## What / Why

Binds signal-form field tree to input/control.

## Mental Model

```text
[formField]='loginForm.email'
```

## Example / Recall

```ts
// Minimal recall example for: FormField
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for Signal Forms native/custom controls.

## Common Mistake / Interview Trap

Custom controls must implement expected control contract.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **FormField:** Binds signal-form field tree to input/control.


---

<!-- 103_REACTIVE_FORMS.md -->

# Reactive Forms

## What / Why

Explicit FormControl/FormGroup tree with Observable state.

## Mental Model

```text
new FormGroup({...})
```

## Example / Recall

```ts
// Minimal recall example for: Reactive Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for established complex forms and existing apps.

## Common Mistake / Interview Trap

Avoid mixing template-driven patterns into reactive forms casually.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Reactive Forms:** Explicit FormControl/FormGroup tree with Observable state.


---

<!-- 104_TYPED_REACTIVE_FORMS.md -->

# Typed Reactive Forms

## What / Why

Reactive Forms support strong control value typing.

## Mental Model

```text
FormControl<string>
```

## Example / Recall

```ts
// Minimal recall example for: Typed Reactive Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep strict types.

## Common Mistake / Interview Trap

Untyped forms weaken safety.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Typed Reactive Forms:** Reactive Forms support strong control value typing.


---

<!-- 105_TEMPLATE_DRIVEN_FORMS.md -->

# Template-Driven Forms

## What / Why

Template directives create/control form model.

## Mental Model

```text
ngModel/ngForm
```

## Example / Recall

```ts
// Minimal recall example for: Template-Driven Forms
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for simple forms.

## Common Mistake / Interview Trap

Less explicit/type-safe for large complex forms.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Template-Driven Forms:** Template directives create/control form model.


---

<!-- 106_VALIDATORS.md -->

# Validators

## What / Why

Synchronous/async validation functions.

## Mental Model

```text
Validators.required / custom
```

## Example / Recall

```ts
// Minimal recall example for: Validators
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use reusable domain validation.

## Common Mistake / Interview Trap

Do not trust client validation for security.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Validators:** Synchronous/async validation functions.


---

<!-- 107_CROSS_FIELD_VALIDATION.md -->

# Cross-Field Validation

## What / Why

Validator checks relationship among fields.

## Mental Model

```text
password/confirm
```

## Example / Recall

```ts
// Minimal recall example for: Cross-Field Validation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use group/schema-level validators.

## Common Mistake / Interview Trap

Error ownership and display need clear UX.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Cross-Field Validation:** Validator checks relationship among fields.


---

<!-- 108_CONTROLVALUEACCESSOR.md -->

# ControlValueAccessor

## What / Why

Adapts custom components to Forms APIs.

## Mental Model

```text
writeValue/registerOnChange
```

## Example / Recall

```ts
// Minimal recall example for: ControlValueAccessor
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for legacy/custom form control integration.

## Common Mistake / Interview Trap

Modern Signal Forms also provide newer custom-control contracts; do not assume CVA is the only future model.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ControlValueAccessor:** Adapts custom components to Forms APIs.


---

<!-- 109_FORM_SUBMISSION.md -->

# Form Submission

## What / Why

Model pending/success/error and prevent accidental duplication.

## Mental Model

```text
submit → pending → result
```

## Example / Recall

```ts
// Minimal recall example for: Form Submission
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use server idempotency for high-risk operations.

## Common Mistake / Interview Trap

Disabled button alone is not transactional protection.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Form Submission:** Model pending/success/error and prevent accidental duplication.


---

<!-- 110_HTTPCLIENT.md -->

# HttpClient

## What / Why

Angular's first-party HTTP API.

## Mental Model

```text
http.get<T>(url)
```

## Example / Recall

```ts
// Minimal recall example for: HttpClient
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for imperative reads/mutations and Observable workflows.

## Common Mistake / Interview Trap

HTTP Observables are typically cold; multiple subscriptions can repeat requests.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HttpClient:** Angular's first-party HTTP API.


---

<!-- 111_PROVIDEHTTPCLIENT.md -->

# provideHttpClient

## What / Why

Registers HttpClient and features.

## Mental Model

```text
provideHttpClient(withInterceptors([...]))
```

## Example / Recall

```ts
// Minimal recall example for: provideHttpClient
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in standalone bootstrap.

## Common Mistake / Interview Trap

Prefer functional features/interceptors in modern Angular.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **provideHttpClient:** Registers HttpClient and features.


---

<!-- 112_FUNCTIONAL_INTERCEPTORS.md -->

# Functional Interceptors

## What / Why

Functions intercept HTTP requests/responses.

## Mental Model

```text
HttpInterceptorFn
```

## Example / Recall

```ts
// Minimal recall example for: Functional Interceptors
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for auth headers, tracing, retry policy, errors.

## Common Mistake / Interview Trap

Do not hide domain logic inside interceptors.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Functional Interceptors:** Functions intercept HTTP requests/responses.


---

<!-- 113_HTTPCONTEXT.md -->

# HttpContext

## What / Why

Carries request-local metadata to interceptors without network headers.

## Mental Model

```text
new HttpContext().set(SKIP_AUTH,true)
```

## Example / Recall

```ts
// Minimal recall example for: HttpContext
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for interceptor policy switches.

## Common Mistake / Interview Trap

Context is client-side request metadata.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HttpContext:** Carries request-local metadata to interceptors without network headers.


---

<!-- 114_HTTP_ERROR_HANDLING.md -->

# HTTP Error Handling

## What / Why

Map network/protocol/domain failures deliberately.

## Mental Model

```text
catchError/map response
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Error Handling
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use consistent API error model.

## Common Mistake / Interview Trap

A 200 response can still contain domain failure depending on API design.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HTTP Error Handling:** Map network/protocol/domain failures deliberately.


---

<!-- 115_CANCELLATION.md -->

# Cancellation

## What / Why

Unsubscribing cancels supported HttpClient request; resources expose cancellation semantics.

## Mental Model

```text
switchMap / resource AbortSignal
```

## Example / Recall

```ts
// Minimal recall example for: Cancellation
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for latest-only workflows.

## Common Mistake / Interview Trap

Mutation cancellation semantics require care.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Cancellation:** Unsubscribing cancels supported HttpClient request; resources expose cancellation semantics.


---

<!-- 116_CACHING.md -->

# Caching

## What / Why

Cache at correct layer based on data freshness and ownership.

## Mental Model

```text
browser/query/service/server/CDN
```

## Example / Recall

```ts
// Minimal recall example for: Caching
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use explicit invalidation/revalidation.

## Common Mistake / Interview Trap

shareReplay is not a universal data cache.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Caching:** Cache at correct layer based on data freshness and ownership.


---

<!-- 117_DATA_SERVICE_PATTERN.md -->

# Data Service Pattern

## What / Why

Feature service centralizes API protocol mapping.

## Mental Model

```text
UserApi service
```

## Example / Recall

```ts
// Minimal recall example for: Data Service Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to keep components declarative.

## Common Mistake / Interview Trap

Do not turn services into giant global business god-objects.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Data Service Pattern:** Feature service centralizes API protocol mapping.


---

<!-- 118_DTO_MAPPING.md -->

# DTO Mapping

## What / Why

Translate wire DTOs to domain/view models.

## Mental Model

```text
API DTO → mapper → model
```

## Example / Recall

```ts
// Minimal recall example for: DTO Mapping
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when backend contracts differ from UI model.

## Common Mistake / Interview Trap

Avoid exposing raw API shape everywhere.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **DTO Mapping:** Translate wire DTOs to domain/view models.


---

<!-- 119_ANGULAR_SSR.md -->

# Angular SSR

## What / Why

Renders application HTML on server for initial request.

## Mental Model

```text
request → server render → HTML → hydrate
```

## Example / Recall

```ts
// Minimal recall example for: Angular SSR
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for SEO/first-load requirements.

## Common Mistake / Interview Trap

SSR introduces server/browser execution differences.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular SSR:** Renders application HTML on server for initial request.


---

<!-- 120_HYDRATION.md -->

# Hydration

## What / Why

Reuses server-rendered DOM instead of recreating it.

## Mental Model

```text
SSR DOM → client hydration
```

## Example / Recall

```ts
// Minimal recall example for: Hydration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use with Angular SSR.

## Common Mistake / Interview Trap

DOM-manipulating libraries need hydration compatibility.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Hydration:** Reuses server-rendered DOM instead of recreating it.


---

<!-- 121_INCREMENTAL_HYDRATION.md -->

# Incremental Hydration

## What / Why

Hydrates deferred regions according to triggers.

## Mental Model

```text
SSR page → hydrate blocks on interaction/viewport
```

## Example / Recall

```ts
// Minimal recall example for: Incremental Hydration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce startup JS/work.

## Common Mistake / Interview Trap

Interactive dependencies must respect hydration boundaries.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Incremental Hydration:** Hydrates deferred regions according to triggers.


---

<!-- 122_EVENT_REPLAY.md -->

# Event Replay

## What / Why

Captures user events before hydration and replays them after app becomes interactive.

## Mental Model

```text
early click → queue → hydrate → replay
```

## Example / Recall

```ts
// Minimal recall example for: Event Replay
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for SSR responsiveness.

## Common Mistake / Interview Trap

Do not rely on replay as a substitute for good hydration performance.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Event Replay:** Captures user events before hydration and replays them after app becomes interactive.


---

<!-- 123_PRERENDERING.md -->

# Prerendering

## What / Why

Generates static HTML ahead of requests.

## Mental Model

```text
build → static HTML
```

## Example / Recall

```ts
// Minimal recall example for: Prerendering
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for stable content routes.

## Common Mistake / Interview Trap

Dynamic/personalized data needs another render mode.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Prerendering:** Generates static HTML ahead of requests.


---

<!-- 124_ROUTE_RENDER_MODES.md -->

# Route Render Modes

## What / Why

Choose SSR, prerender or client render per route.

## Mental Model

```text
route → Server/Prerender/Client
```

## Example / Recall

```ts
// Minimal recall example for: Route Render Modes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use mixed strategies per business need.

## Common Mistake / Interview Trap

One rendering mode does not fit every route.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Route Render Modes:** Choose SSR, prerender or client render per route.


---

<!-- 125_TRANSFER_STATE.md -->

# Transfer State

## What / Why

Avoid refetching identical server-fetched data after hydration.

## Mental Model

```text
server data → transfer → client
```

## Example / Recall

```ts
// Minimal recall example for: Transfer State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use SSR data optimization.

## Common Mistake / Interview Trap

Never serialize secrets into browser-visible transfer state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Transfer State:** Avoid refetching identical server-fetched data after hydration.


---

<!-- 126_BROWSER_ONLY_APIS.md -->

# Browser-Only APIs

## What / Why

Guard window/document/localStorage usage.

## Mental Model

```text
after render/platform check
```

## Example / Recall

```ts
// Minimal recall example for: Browser-Only APIs
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use browser-specific logic only where appropriate.

## Common Mistake / Interview Trap

Direct browser globals can break SSR.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Browser-Only APIs:** Guard window/document/localStorage usage.


---

<!-- 127_AFTERNEXTRENDER.md -->

# afterNextRender

## What / Why

Runs callback after next rendering pass in browser.

## Mental Model

```text
afterNextRender(()=>...)
```

## Example / Recall

```ts
// Minimal recall example for: afterNextRender
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for DOM integration after render.

## Common Mistake / Interview Trap

Not a replacement for data lifecycle.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **afterNextRender:** Runs callback after next rendering pass in browser.


---

<!-- 128_AFTEREVERYRENDER.md -->

# afterEveryRender

## What / Why

Runs after every render cycle.

## Mental Model

```text
afterEveryRender(...)
```

## Example / Recall

```ts
// Minimal recall example for: afterEveryRender
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use sparingly for integration/measurement.

## Common Mistake / Interview Trap

Can become expensive.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **afterEveryRender:** Runs after every render cycle.


---

<!-- 129_PERFORMANCE_MENTAL_MODEL.md -->

# Performance Mental Model

## What / Why

Optimize bundle delivery, rendering work, data/network and DOM together.

## Mental Model

```text
network → JS → change detection → DOM → paint
```

## Example / Recall

```ts
// Minimal recall example for: Performance Mental Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Profile before changing architecture.

## Common Mistake / Interview Trap

Angular performance is not only change detection.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Performance Mental Model:** Optimize bundle delivery, rendering work, data/network and DOM together.


---

<!-- 130_LAZY_ROUTES.md -->

# Lazy Routes

## What / Why

Split feature code by navigation boundary.

## Mental Model

```text
loadComponent/loadChildren
```

## Example / Recall

```ts
// Minimal recall example for: Lazy Routes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use broadly for large features.

## Common Mistake / Interview Trap

Avoid unnecessary nested waterfall chunks.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Lazy Routes:** Split feature code by navigation boundary.


---

<!-- 131_DEFER_PERFORMANCE.md -->

# @defer Performance

## What / Why

Defers non-critical components/resources.

## Mental Model

```text
@defer
```

## Example / Recall

```ts
// Minimal recall example for: @defer Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for charts/editors/secondary panels.

## Common Mistake / Interview Trap

Design placeholder dimensions to avoid CLS.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **@defer Performance:** Defers non-critical components/resources.


---

<!-- 132_ONPUSH_DEFAULT_PERFORMANCE.md -->

# OnPush Default Performance

## What / Why

Angular 22 already defaults to OnPush.

## Mental Model

```text
signals/events notify affected views
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Default Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Write signal-friendly code instead of adding OnPush boilerplate.

## Common Mistake / Interview Trap

Legacy advice that every component must explicitly opt into OnPush is outdated.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **OnPush Default Performance:** Angular 22 already defaults to OnPush.


---

<!-- 133_ZONELESS_PERFORMANCE.md -->

# Zoneless Performance

## What / Why

No global ZoneJS patching; Angular updates from explicit notifications.

## Mental Model

```text
signal/input/event/markForCheck
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern APIs and compatible libraries.

## Common Mistake / Interview Trap

Legacy libraries relying on NgZone events may need updates.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Zoneless Performance:** No global ZoneJS patching; Angular updates from explicit notifications.


---

<!-- 134_TRACK_IN_FOR.md -->

# track in @for

## What / Why

Stable tracking minimizes DOM reuse mistakes/work.

## Mental Model

```text
track item.id
```

## Example / Recall

```ts
// Minimal recall example for: track in @for
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use domain IDs.

## Common Mistake / Interview Trap

Track-by-index is wrong for many reordered lists.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **track in @for:** Stable tracking minimizes DOM reuse mistakes/work.


---

<!-- 135_PURE_PIPES.md -->

# Pure Pipes

## What / Why

Pure pipes run only when input references change.

## Mental Model

```text
value | expensivePipe
```

## Example / Recall

```ts
// Minimal recall example for: Pure Pipes
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for reusable pure template transforms.

## Common Mistake / Interview Trap

Impure pipes execute frequently and can be costly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Pure Pipes:** Pure pipes run only when input references change.


---

<!-- 136_MEMOIZED_DERIVED_STATE.md -->

# Memoized Derived State

## What / Why

Use computed signals for reactive derivations.

## Mental Model

```text
computed(()=>...)
```

## Example / Recall

```ts
// Minimal recall example for: Memoized Derived State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use instead of recalculating expensive derived state in templates.

## Common Mistake / Interview Trap

Computed should remain pure.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Memoized Derived State:** Use computed signals for reactive derivations.


---

<!-- 137_VIRTUAL_SCROLLING.md -->

# Virtual Scrolling

## What / Why

Render only visible subset of huge lists.

## Mental Model

```text
CDK virtual scroll
```

## Example / Recall

```ts
// Minimal recall example for: Virtual Scrolling
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for thousands of rows.

## Common Mistake / Interview Trap

Needs fixed/dynamic size strategy.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Virtual Scrolling:** Render only visible subset of huge lists.


---

<!-- 138_NGOPTIMIZEDIMAGE.md -->

# NgOptimizedImage

## What / Why

Optimizes image loading hints and common image performance patterns.

## Mental Model

```text
ngSrc
```

## Example / Recall

```ts
// Minimal recall example for: NgOptimizedImage
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for static images.

## Common Mistake / Interview Trap

Image dimensions/loading strategy still matter.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **NgOptimizedImage:** Optimizes image loading hints and common image performance patterns.


---

<!-- 139_PRELOADING.md -->

# Preloading

## What / Why

Preload lazy routes/resources based on policy.

## Mental Model

```text
PreloadAllModules/custom
```

## Example / Recall

```ts
// Minimal recall example for: Preloading
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use if navigation likelihood justifies network cost.

## Common Mistake / Interview Trap

Preloading everything can defeat lazy loading.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Preloading:** Preload lazy routes/resources based on policy.


---

<!-- 140_BUNDLE_ANALYSIS.md -->

# Bundle Analysis

## What / Why

Inspect generated chunks/dependency size.

## Mental Model

```text
source-map-explorer/build stats
```

## Example / Recall

```ts
// Minimal recall example for: Bundle Analysis
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use before dependency replacement.

## Common Mistake / Interview Trap

A small code change can import a huge package.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Bundle Analysis:** Inspect generated chunks/dependency size.


---

<!-- 141_WEB_VITALS.md -->

# Web Vitals

## What / Why

Measure LCP, INP, CLS in real users.

## Mental Model

```text
field telemetry
```

## Example / Recall

```ts
// Minimal recall example for: Web Vitals
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use release/route segmented metrics.

## Common Mistake / Interview Trap

Lab scores alone are not production performance.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Web Vitals:** Measure LCP, INP, CLS in real users.


---

<!-- 142_LOCAL_SIGNAL_STATE.md -->

# Local Signal State

## What / Why

Use signals inside component/feature for local state.

## Mental Model

```text
signal/computed
```

## Example / Recall

```ts
// Minimal recall example for: Local Signal State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Default for UI state.

## Common Mistake / Interview Trap

Do not centralize local state prematurely.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Local Signal State:** Use signals inside component/feature for local state.


---

<!-- 143_FEATURE_SERVICE_STATE.md -->

# Feature Service State

## What / Why

Injectable service owns feature-level signals and operations.

## Mental Model

```text
feature store service
```

## Example / Recall

```ts
// Minimal recall example for: Feature Service State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when multiple components in one feature share state.

## Common Mistake / Interview Trap

Scope provider intentionally.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Feature Service State:** Injectable service owns feature-level signals and operations.


---

<!-- 144_SIGNAL_STORE_PATTERN.md -->

# Signal Store Pattern

## What / Why

Model state, computed selectors and actions around signals.

## Mental Model

```text
state + computed + methods
```

## Example / Recall

```ts
// Minimal recall example for: Signal Store Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for structured feature/application state.

## Common Mistake / Interview Trap

Library choice should follow actual complexity.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Store Pattern:** Model state, computed selectors and actions around signals.


---

<!-- 145_NGRX.md -->

# NgRx

## What / Why

Redux-style Angular ecosystem for explicit event/reducer/effects/store architecture.

## Mental Model

```text
Actions → Reducers → Store → Selectors / Effects
```

## Example / Recall

```ts
// Minimal recall example for: NgRx
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for large event-driven client state needing strict conventions.

## Common Mistake / Interview Trap

Do not add NgRx to solve simple local state.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **NgRx:** Redux-style Angular ecosystem for explicit event/reducer/effects/store architecture.


---

<!-- 146_COMPONENTSTORE_SIGNALSTORE.md -->

# ComponentStore / SignalStore

## What / Why

Feature-local store patterns from ecosystem.

## Mental Model

```text
feature store
```

## Example / Recall

```ts
// Minimal recall example for: ComponentStore / SignalStore
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to reduce global-store pressure.

## Common Mistake / Interview Trap

Know exact library version/API when implementing.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ComponentStore / SignalStore:** Feature-local store patterns from ecosystem.


---

<!-- 147_STATE_OWNERSHIP.md -->

# State Ownership

## What / Why

Every state value should have one clear owner/source of truth.

## Mental Model

```text
URL / server / component / store
```

## Example / Recall

```ts
// Minimal recall example for: State Ownership
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use before choosing tools.

## Common Mistake / Interview Trap

Duplicated state causes sync bugs.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **State Ownership:** Every state value should have one clear owner/source of truth.


---

<!-- 148_SERVER_STATE.md -->

# Server State

## What / Why

Remote authoritative state needs caching/revalidation, not just global client state.

## Mental Model

```text
HTTP/resource/query cache
```

## Example / Recall

```ts
// Minimal recall example for: Server State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use APIs/resources/query tools.

## Common Mistake / Interview Trap

Do not mirror everything into NgRx by default.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Server State:** Remote authoritative state needs caching/revalidation, not just global client state.


---

<!-- 149_URL_STATE.md -->

# URL State

## What / Why

Route/query params are often correct source for filters/page/entity id.

## Mental Model

```text
URL → component signals
```

## Example / Recall

```ts
// Minimal recall example for: URL State
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for shareable navigational state.

## Common Mistake / Interview Trap

Keep domain secrets out of URL.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **URL State:** Route/query params are often correct source for filters/page/entity id.


---

<!-- 150_VITEST_DEFAULT.md -->

# Vitest Default

## What / Why

New Angular CLI projects use Vitest as default unit test runner.

## Mental Model

```text
ng test → Vitest + jsdom
```

## Example / Recall

```ts
// Minimal recall example for: Vitest Default
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for new Angular 22 projects.

## Common Mistake / Interview Trap

Karma knowledge still matters for older apps.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Vitest Default:** New Angular CLI projects use Vitest as default unit test runner.


---

<!-- 151_TESTBED.md -->

# TestBed

## What / Why

Angular testing injector/component environment.

## Mental Model

```text
TestBed.configureTestingModule
```

## Example / Recall

```ts
// Minimal recall example for: TestBed
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for Angular-aware unit/integration tests.

## Common Mistake / Interview Trap

Do not overconfigure the whole application for every test.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **TestBed:** Angular testing injector/component environment.


---

<!-- 152_COMPONENTFIXTURE.md -->

# ComponentFixture

## What / Why

Provides test component instance and DOM/native element.

## Mental Model

```text
fixture.componentInstance
```

## Example / Recall

```ts
// Minimal recall example for: ComponentFixture
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when testing Angular rendering.

## Common Mistake / Interview Trap

In zoneless tests, prefer natural stabilization over forcing detectChanges everywhere.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ComponentFixture:** Provides test component instance and DOM/native element.


---

<!-- 153_COMPONENT_TESTING.md -->

# Component Testing

## What / Why

Test inputs, outputs, DOM, user behavior and dependencies.

## Mental Model

```text
arrange → interact → assert
```

## Example / Recall

```ts
// Minimal recall example for: Component Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer behavior over implementation details.

## Common Mistake / Interview Trap

Avoid tests tied to private methods.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Component Testing:** Test inputs, outputs, DOM, user behavior and dependencies.


---

<!-- 154_SERVICE_TESTING.md -->

# Service Testing

## What / Why

Instantiate services via TestBed or focused DI context.

## Mental Model

```text
TestBed.inject(Service)
```

## Example / Recall

```ts
// Minimal recall example for: Service Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use dependency fakes where needed.

## Common Mistake / Interview Trap

Pure services may not need Angular TestBed.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Service Testing:** Instantiate services via TestBed or focused DI context.


---

<!-- 155_HTTP_TESTING.md -->

# HTTP Testing

## What / Why

Use HttpTestingController/provideHttpClientTesting.

## Mental Model

```text
expectOne → flush
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to verify requests deterministically.

## Common Mistake / Interview Trap

Do not hit real APIs in unit tests.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HTTP Testing:** Use HttpTestingController/provideHttpClientTesting.


---

<!-- 156_ROUTER_TESTING.md -->

# Router Testing

## What / Why

Test route config/navigation with router testing utilities.

## Mental Model

```text
navigate → assert component/url
```

## Example / Recall

```ts
// Minimal recall example for: Router Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for guards/resolvers/routes.

## Common Mistake / Interview Trap

Avoid brittle tests against router internals.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Router Testing:** Test route config/navigation with router testing utilities.


---

<!-- 157_SIGNAL_TESTING.md -->

# Signal Testing

## What / Why

Read/set signals and assert computed/effects behavior.

## Mental Model

```text
state.set → expect(computed())
```

## Example / Recall

```ts
// Minimal recall example for: Signal Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use deterministic signal tests.

## Common Mistake / Interview Trap

Effects may require stabilization/injection context.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signal Testing:** Read/set signals and assert computed/effects behavior.


---

<!-- 158_FAKE_DEPENDENCIES.md -->

# Fake Dependencies

## What / Why

Use providers/useValue/spies for boundary collaborators.

## Mental Model

```text
mock API service
```

## Example / Recall

```ts
// Minimal recall example for: Fake Dependencies
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Mock external boundaries, not every internal class.

## Common Mistake / Interview Trap

Too many mocks make tests unrealistic.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Fake Dependencies:** Use providers/useValue/spies for boundary collaborators.


---

<!-- 159_TESTING_ACCESSIBILITY.md -->

# Testing Accessibility

## What / Why

Use semantic DOM assertions and automated a11y tools.

## Mental Model

```text
role/name/focus
```

## Example / Recall

```ts
// Minimal recall example for: Testing Accessibility
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use alongside manual keyboard/screen reader checks.

## Common Mistake / Interview Trap

Automation does not cover all WCAG issues.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Testing Accessibility:** Use semantic DOM assertions and automated a11y tools.


---

<!-- 160_E2E.md -->

# E2E

## What / Why

Use browser automation for critical user journeys.

## Mental Model

```text
login/checkout/admin flow
```

## Example / Recall

```ts
// Minimal recall example for: E2E
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep small and high-value.

## Common Mistake / Interview Trap

E2E should not replace unit/integration tests.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **E2E:** Use browser automation for critical user journeys.


---

<!-- 161_KARMA_MIGRATION.md -->

# Karma Migration

## What / Why

Existing Karma suites can migrate to Vitest; migration tooling may have version-specific status.

## Mental Model

```text
Karma → Vitest
```

## Example / Recall

```ts
// Minimal recall example for: Karma Migration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Plan migration separately from feature work.

## Common Mistake / Interview Trap

Do not assume every Jasmine/Karma helper maps directly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Karma Migration:** Existing Karma suites can migrate to Vitest; migration tooling may have version-specific status.


---

<!-- 162_ANGULAR_SECURITY_MODEL.md -->

# Angular Security Model

## What / Why

Angular sanitizes untrusted values in relevant template binding contexts.

## Mental Model

```text
untrusted value → sanitization → DOM
```

## Example / Recall

```ts
// Minimal recall example for: Angular Security Model
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Prefer normal template binding.

## Common Mistake / Interview Trap

Bypassing sanitization is dangerous.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular Security Model:** Angular sanitizes untrusted values in relevant template binding contexts.


---

<!-- 163_DOMSANITIZER.md -->

# DomSanitizer

## What / Why

Explicitly sanitizes or marks values trusted.

## Mental Model

```text
DomSanitizer
```

## Example / Recall

```ts
// Minimal recall example for: DomSanitizer
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use only when integrating trusted content/resource URLs.

## Common Mistake / Interview Trap

bypassSecurityTrust* transfers security responsibility to you.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **DomSanitizer:** Explicitly sanitizes or marks values trusted.


---

<!-- 164_XSS.md -->

# XSS

## What / Why

Cross-site scripting occurs when untrusted content executes as code.

## Mental Model

```text
input → unsafe DOM sink
```

## Example / Recall

```ts
// Minimal recall example for: XSS
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use template bindings, sanitization, CSP, Trusted Types where applicable.

## Common Mistake / Interview Trap

Never construct trusted HTML from untrusted strings.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **XSS:** Cross-site scripting occurs when untrusted content executes as code.


---

<!-- 165_CSP.md -->

# CSP

## What / Why

Restricts script/style/resource execution origins.

## Mental Model

```text
Content-Security-Policy
```

## Example / Recall

```ts
// Minimal recall example for: CSP
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use defense in depth.

## Common Mistake / Interview Trap

CSP does not replace application authorization.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **CSP:** Restricts script/style/resource execution origins.


---

<!-- 166_TRUSTED_TYPES.md -->

# Trusted Types

## What / Why

Browser security policy can restrict dangerous DOM sinks.

## Mental Model

```text
TrustedHTML etc.
```

## Example / Recall

```ts
// Minimal recall example for: Trusted Types
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in hardened applications where supported.

## Common Mistake / Interview Trap

Requires compatible application/library behavior.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Trusted Types:** Browser security policy can restrict dangerous DOM sinks.


---

<!-- 167_XSRF.md -->

# XSRF

## What / Why

HttpClient supports XSRF protection patterns for cookie-based backends.

## Mental Model

```text
cookie token → request header
```

## Example / Recall

```ts
// Minimal recall example for: XSRF
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use with correctly configured same-origin backend.

## Common Mistake / Interview Trap

JWT bearer-token architectures have different CSRF considerations.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **XSRF:** HttpClient supports XSRF protection patterns for cookie-based backends.


---

<!-- 168_AUTHENTICATION.md -->

# Authentication

## What / Why

Frontend integrates identity and session/token state.

## Mental Model

```text
IdP → client → API
```

## Example / Recall

```ts
// Minimal recall example for: Authentication
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use route UX and interceptors carefully.

## Common Mistake / Interview Trap

Never rely on frontend-only auth enforcement.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Authentication:** Frontend integrates identity and session/token state.


---

<!-- 169_AUTHORIZATION.md -->

# Authorization

## What / Why

UI can conditionally expose actions, backend enforces permissions.

## Mental Model

```text
canEdit()
```

## Example / Recall

```ts
// Minimal recall example for: Authorization
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for UX.

## Common Mistake / Interview Trap

Server must make final authorization decision.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Authorization:** UI can conditionally expose actions, backend enforces permissions.


---

<!-- 170_SECRETS.md -->

# Secrets

## What / Why

Anything shipped to browser can be inspected.

## Mental Model

```text
environment config ≠ secret
```

## Example / Recall

```ts
// Minimal recall example for: Secrets
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Keep real secrets on server/secret manager.

## Common Mistake / Interview Trap

Angular environment files are not secret storage.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Secrets:** Anything shipped to browser can be inspected.


---

<!-- 171_SEMANTIC_HTML.md -->

# Semantic HTML

## What / Why

Use native HTML semantics before ARIA.

## Mental Model

```text
button, label, nav
```

## Example / Recall

```ts
// Minimal recall example for: Semantic HTML
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Foundation for accessibility.

## Common Mistake / Interview Trap

Clickable div is usually worse than button.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Semantic HTML:** Use native HTML semantics before ARIA.


---

<!-- 172_ANGULAR_ARIA.md -->

# Angular Aria

## What / Why

Angular 22 promotes Angular Aria headless accessible interaction patterns to stable.

## Mental Model

```text
ARIA behavior primitives + your styling
```

## Example / Recall

```ts
// Minimal recall example for: Angular Aria
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for custom accessible component systems.

## Common Mistake / Interview Trap

Headless primitives still require correct visual/focus integration.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular Aria:** Angular 22 promotes Angular Aria headless accessible interaction patterns to stable.


---

<!-- 173_FOCUS_MANAGEMENT.md -->

# Focus Management

## What / Why

Move/restore focus for dialogs, route changes and dynamic content.

## Mental Model

```text
focus trap/restore
```

## Example / Recall

```ts
// Minimal recall example for: Focus Management
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CDK/Aria primitives where appropriate.

## Common Mistake / Interview Trap

Do not unexpectedly steal focus.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Focus Management:** Move/restore focus for dialogs, route changes and dynamic content.


---

<!-- 174_LIVE_REGIONS.md -->

# Live Regions

## What / Why

Announce dynamic status to screen readers.

## Mental Model

```text
aria-live
```

## Example / Recall

```ts
// Minimal recall example for: Live Regions
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for async validation/status updates.

## Common Mistake / Interview Trap

Avoid noisy repeated announcements.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Live Regions:** Announce dynamic status to screen readers.


---

<!-- 175_ACCESSIBILITY_TESTING.md -->

# Accessibility Testing

## What / Why

Combine automated tooling with keyboard/screen-reader testing.

## Mental Model

```text
axe + manual
```

## Example / Recall

```ts
// Minimal recall example for: Accessibility Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in CI/release review.

## Common Mistake / Interview Trap

Passing automated scan does not equal full accessibility.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Accessibility Testing:** Combine automated tooling with keyboard/screen-reader testing.


---

<!-- 176_FEATURE_FIRST_FOLDERS.md -->

# Feature-First Folders

## What / Why

Organize by business feature.

## Mental Model

```text
features/orders/...
```

## Example / Recall

```ts
// Minimal recall example for: Feature-First Folders
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for scalable enterprise codebases.

## Common Mistake / Interview Trap

Avoid giant global components/services directories.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Feature-First Folders:** Organize by business feature.


---

<!-- 177_CORE_VS_SHARED.md -->

# Core vs Shared

## What / Why

Keep app-singleton infrastructure separate from reusable stateless UI/utilities when this distinction helps.

## Mental Model

```text
core / shared / features
```

## Example / Recall

```ts
// Minimal recall example for: Core vs Shared
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use conceptually, not dogmatically.

## Common Mistake / Interview Trap

Standalone Angular reduces need for old module-era folder dogma.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Core vs Shared:** Keep app-singleton infrastructure separate from reusable stateless UI/utilities when this distinction helps.


---

<!-- 178_SMART_PRESENTATIONAL.md -->

# Smart / Presentational

## What / Why

Separate feature orchestration from reusable UI where valuable.

## Mental Model

```text
container → UI component
```

## Example / Recall

```ts
// Minimal recall example for: Smart / Presentational
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use selectively.

## Common Mistake / Interview Trap

Signals/services can make rigid split unnecessary.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Smart / Presentational:** Separate feature orchestration from reusable UI where valuable.


---

<!-- 179_FACADE_PATTERN.md -->

# Facade Pattern

## What / Why

Expose feature-friendly API over store/services/router.

## Mental Model

```text
Component → Facade → services/store
```

## Example / Recall

```ts
// Minimal recall example for: Facade Pattern
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to isolate state library/infrastructure.

## Common Mistake / Interview Trap

Avoid facades that only rename every method one-for-one.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Facade Pattern:** Expose feature-friendly API over store/services/router.


---

<!-- 180_REPOSITORY_API_ADAPTER.md -->

# Repository / API Adapter

## What / Why

Translate backend protocol into domain-facing interface.

## Mental Model

```text
component/domain → repository → HttpClient
```

## Example / Recall

```ts
// Minimal recall example for: Repository / API Adapter
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use where API/domain models differ.

## Common Mistake / Interview Trap

Do not add layers without real substitution/mapping need.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Repository / API Adapter:** Translate backend protocol into domain-facing interface.


---

<!-- 181_STANDALONE_BOOTSTRAP.md -->

# Standalone Bootstrap

## What / Why

bootstrapApplication configures modern app root/providers.

## Mental Model

```text
bootstrapApplication(App, appConfig)
```

## Example / Recall

```ts
// Minimal recall example for: Standalone Bootstrap
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern app bootstrap.

## Common Mistake / Interview Trap

Know AppModule for legacy maintenance.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Standalone Bootstrap:** bootstrapApplication configures modern app root/providers.


---

<!-- 182_ENVIRONMENT_PROVIDERS.md -->

# Environment Providers

## What / Why

Functional provider APIs configure router/http/etc.

## Mental Model

```text
provideRouter/provideHttpClient
```

## Example / Recall

```ts
// Minimal recall example for: Environment Providers
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use in app config.

## Common Mistake / Interview Trap

Prefer tree-shakable functional setup.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Environment Providers:** Functional provider APIs configure router/http/etc.


---

<!-- 183_NGMODULES_LEGACY.md -->

# NgModules Legacy

## What / Why

NgModules group declarations/imports/providers in older Angular architecture.

## Mental Model

```text
@NgModule
```

## Example / Recall

```ts
// Minimal recall example for: NgModules Legacy
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know for enterprise maintenance/migration.

## Common Mistake / Interview Trap

Do not build new Angular 22 apps around NgModule-first architecture.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **NgModules Legacy:** NgModules group declarations/imports/providers in older Angular architecture.


---

<!-- 184_MICROFRONTEND_INTEGRATION.md -->

# Microfrontend Integration

## What / Why

Angular can participate in route/module-federation/single-spa/web-component MFEs.

## Mental Model

```text
shell → Angular MFE
```

## Example / Recall

```ts
// Minimal recall example for: Microfrontend Integration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use clear route/team boundaries.

## Common Mistake / Interview Trap

Do not use microfrontends to solve ordinary component modularity.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Microfrontend Integration:** Angular can participate in route/module-federation/single-spa/web-component MFEs.


---

<!-- 185_DESIGN_SYSTEM.md -->

# Design System

## What / Why

Use Angular Material/CDK/Angular Aria/custom tokens depending visual strategy.

## Mental Model

```text
tokens → primitives → components
```

## Example / Recall

```ts
// Minimal recall example for: Design System
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use one governed system.

## Common Mistake / Interview Trap

Do not hide domain logic inside UI library.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Design System:** Use Angular Material/CDK/Angular Aria/custom tokens depending visual strategy.


---

<!-- 186_CONFIGURATION.md -->

# Configuration

## What / Why

Separate build/runtime config and never treat client config as secret.

## Mental Model

```text
config → DI token/service
```

## Example / Recall

```ts
// Minimal recall example for: Configuration
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use typed configuration.

## Common Mistake / Interview Trap

Environment-specific rebuilds can complicate promotion.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Configuration:** Separate build/runtime config and never treat client config as secret.


---

<!-- 187_ERROR_ARCHITECTURE.md -->

# Error Architecture

## What / Why

Use HTTP error mapping, route errors, global ErrorHandler/telemetry and local UX boundaries appropriately.

## Mental Model

```text
error → boundary/handler → telemetry
```

## Example / Recall

```ts
// Minimal recall example for: Error Architecture
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use layered handling.

## Common Mistake / Interview Trap

One global handler should not replace local recoverable UX.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Error Architecture:** Use HTTP error mapping, route errors, global ErrorHandler/telemetry and local UX boundaries appropriately.


---

<!-- 188_OBSERVABILITY.md -->

# Observability

## What / Why

Capture route, version, errors, HTTP timings and backend trace correlation.

## Mental Model

```text
frontend telemetry → backend traces
```

## Example / Recall

```ts
// Minimal recall example for: Observability
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use release-aware monitoring.

## Common Mistake / Interview Trap

Never log secrets/PII casually.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Observability:** Capture route, version, errors, HTTP timings and backend trace correlation.


---

<!-- 189_ANGULAR_CLI.md -->

# Angular CLI

## What / Why

First-party CLI for creation, generation, build, test, serve and updates.

## Mental Model

```text
ng new / ng generate / ng build
```

## Example / Recall

```ts
// Minimal recall example for: Angular CLI
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CLI defaults unless requirements justify custom tooling.

## Common Mistake / Interview Trap

CLI/core major versions should align.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular CLI:** First-party CLI for creation, generation, build, test, serve and updates.


---

<!-- 190_CORE_API_QUICK_REFERENCE.md -->

# Angular Core API Quick Reference

## Reactivity
```text
signal
computed
effect
linkedSignal
resource
untracked
```

## Component Contracts
```text
input
input.required
output
model
viewChild / viewChildren
contentChild / contentChildren
```

## DI
```text
inject
InjectionToken
providers
useClass/useValue/useFactory/useExisting
EnvironmentInjector
runInInjectionContext
```

## Lifecycle / Render
```text
afterNextRender
afterEveryRender
DestroyRef
takeUntilDestroyed
```

## HTTP
```text
provideHttpClient
HttpClient
httpResource
HttpInterceptorFn
HttpContext
```

## Router
```text
provideRouter
Router
ActivatedRoute
RouterLink
router-outlet
guards / resolvers
```


---

<!-- 190_NG_NEW.md -->

# ng new

## What / Why

Creates workspace/application.

## Mental Model

```text
ng new my-app
```

## Example / Recall

```ts
// Minimal recall example for: ng new
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use modern defaults.

## Common Mistake / Interview Trap

Review SSR/routing/style/testing choices.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng new:** Creates workspace/application.


---

<!-- 191_COMPARISON_MATRIX.md -->

# Angular High-Value Comparisons

## Signal vs Observable

| Signal | Observable |
|---|---|
| current synchronous value | stream over time |
| read with `()` | subscribe / AsyncPipe |
| fine-grained template state | async/event composition |
| computed/effect | RxJS operators |

## computed vs effect

| computed | effect |
|---|---|
| derived value | side effect |
| pure | external synchronization |
| memoized reactive result | runs when dependencies change |

## Signal Forms vs Reactive Forms

| Signal Forms | Reactive Forms |
|---|---|
| signal model source | control tree source |
| schema/path validation | validator functions on controls |
| strong signal integration | Observable-based |
| stable v22 | mature/stable |

## OnPush vs Eager

| OnPush | Eager |
|---|---|
| default v22 | opt-in |
| targeted checks | eager traversal when reached |
| signals/events/inputs notify | broader checking |
| preferred modern default | compatibility/special cases |

## Standalone vs NgModule

| Standalone | NgModule |
|---|---|
| direct imports/providers | declarations/imports modules |
| modern default | legacy/compatibility |
| simpler lazy routes | existing enterprise code |

## switchMap vs mergeMap vs concatMap vs exhaustMap

| Operator | Semantics |
|---|---|
| switchMap | latest wins / cancel prior |
| mergeMap | concurrent |
| concatMap | queue sequentially |
| exhaustMap | ignore new until current ends |

## SSR vs Prerender vs CSR

| SSR | Prerender | CSR |
|---|---|---|
| per request server HTML | build-time static HTML | browser renders |
| dynamic SEO content | stable content | app/private screens |
| server cost | rebuild for content | weakest first HTML/SEO |


---

<!-- 191_NG_GENERATE.md -->

# ng generate

## What / Why

Generates components/services/routes etc.

## Mental Model

```text
ng g c features/orders
```

## Example / Recall

```ts
// Minimal recall example for: ng generate
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use schematics for consistency.

## Common Mistake / Interview Trap

Generated code is a starting point, not architecture.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng generate:** Generates components/services/routes etc.


---

<!-- 192_INTERVIEW_TRAPS.md -->

# Angular Interview Traps — Modern Angular 22

1. Angular is a full web framework, not only a component library.
2. Standalone is the modern default; NgModules still exist.
3. Do not set `standalone: true` by habit in modern Angular where it is already default.
4. Angular is zoneless by default in v21+.
5. ZoneJS is not mandatory in a new Angular 22 application.
6. OnPush is the default change-detection strategy in Angular 22.
7. `ChangeDetectionStrategy.Eager` is the explicit eager mode.
8. `ChangeDetectionStrategy.Default` is now a deprecated alias for Eager.
9. Signals do not make RxJS obsolete.
10. `computed` is for derived state; `effect` is for side effects/synchronization.
11. `resource` is intended for asynchronous read operations, not mutations.
12. `httpResource` is a signal-based reactive wrapper around HttpClient for read workflows.
13. Signal Forms are stable in Angular 22.
14. Reactive Forms remain valid and important.
15. Template-driven forms are still supported.
16. `@if/@for/@switch` are built-in modern control flow.
17. `track` identity in `@for` is important.
18. `@defer` provides deferred loading/rendering and code splitting.
19. Route guards are not backend authorization.
20. Frontend environment files are not secret storage.
21. HttpClient Observables can execute more than once with multiple subscriptions.
22. switchMap is correct only when prior inner work may be cancelled.
23. `AsyncPipe` handles subscription lifecycle and change-detection notification.
24. `takeUntilDestroyed` is preferred for imperative Angular subscriptions.
25. `inject()` requires an injection context.
26. Providing the same service at child scopes can create multiple instances.
27. View encapsulation is not a security boundary.
28. DomSanitizer bypass APIs move XSS responsibility to you.
29. SSR code cannot assume `window`/`document` always exist.
30. Hydration requires compatible server/client DOM.
31. Incremental hydration and event replay improve SSR interactivity.
32. Vitest is the default runner for new Angular CLI projects.
33. Karma is legacy but still relevant in existing codebases.
34. Angular Aria is stable in v22 for headless accessible patterns.
35. `ng update` is the supported framework migration path.


---

<!-- 192_NG_SERVE.md -->

# ng serve

## What / Why

Runs development server.

## Mental Model

```text
ng serve
```

## Example / Recall

```ts
// Minimal recall example for: ng serve
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use local development.

## Common Mistake / Interview Trap

Not a production server.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng serve:** Runs development server.


---

<!-- 193_NG_BUILD.md -->

# ng build

## What / Why

Creates production build.

## Mental Model

```text
ng build
```

## Example / Recall

```ts
// Minimal recall example for: ng build
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use budget/config checks.

## Common Mistake / Interview Trap

Know output depends on application builder.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng build:** Creates production build.


---

<!-- 193_TROUBLESHOOTING_MATRIX.md -->

# Angular Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | signal/input/event notification | mutation outside tracked path |
| ExpressionChanged error | lifecycle timing | late binding mutation |
| NullInjectorError | provider/token scope | missing provider |
| Duplicate singleton state | provider hierarchy | service provided in child |
| HTTP fires twice | subscriptions | cold observable multiple subscribers |
| Search shows stale data | flattening operator | mergeMap instead of switchMap |
| Memory leak | subscriptions/listeners | missing cleanup |
| Huge bundle | eager routes/dependency | no lazy/@defer |
| Slow list | tracking/DOM count | bad @for track / no virtualization |
| SSR crash | browser global | window/document access |
| Hydration mismatch | server/client markup | random/time/client-only data |
| Form slow | giant control tree/component | validation/render fan-out |
| 401 repeated | interceptor/token refresh | retry loop/race |
| Route loops | guard redirect logic | cyclic navigation |
| Tests flaky | forced detectChanges/timers | async stabilization issue |
| CSS leak | encapsulation/global style | global selectors |

## Debug Flow

```text
ng version
→ browser console/network
→ Angular DevTools
→ Signals / RxJS ownership
→ DI provider scope
→ Router / HTTP
→ SSR boundary
→ profiler / bundle analysis
→ fix
→ re-measure
```


---

<!-- 194_NG_TEST.md -->

# ng test

## What / Why

Runs unit tests using current configured runner; new apps default to Vitest.

## Mental Model

```text
ng test
```

## Example / Recall

```ts
// Minimal recall example for: ng test
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use watch/CI configuration.

## Common Mistake / Interview Trap

Runner can differ in migrated legacy apps.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng test:** Runs unit tests using current configured runner; new apps default to Vitest.


---

<!-- 194_ONE_PAGE_RECALL.md -->

# Angular — One-Page Architecture Recall

```text
                    Angular Application
                           │
              ┌────────────┼────────────┐
              ▼            ▼            ▼
          Components      Router        Services
              │            │            │
          Templates     Lazy Routes     DI
              │                         │
      Signals / RxJS                   HTTP
              │                         │
              └──────────┬──────────────┘
                         ▼
               Change Detection
          (Zoneless + OnPush default)
                         ▼
                        DOM
```

## Modern Data

```text
Local synchronous state → signals
Derived state → computed
External side effects → effect
Async streams → RxJS
Reactive read → resource/httpResource
Forms → Signal Forms / Reactive Forms
```

## Production

```text
SSR / Hydration
Lazy routes / @defer
Security / CSP / XSS
Accessibility / Angular Aria
Vitest / integration / E2E
Observability
Budgets / Web Vitals
```


---

<!-- 195_COMMANDS_CLI.md -->

# Angular CLI Commands Recall

## Version
```bash
ng version
```

## Create
```bash
ng new my-app
```

## Generate
```bash
ng generate component features/orders/order-list
ng g service features/orders/data/order-api
```

## Develop
```bash
ng serve
```

## Build
```bash
ng build
```

## Test
```bash
ng test
```

New CLI projects use Vitest by default.

## Update
```bash
ng update
ng update @angular/core @angular/cli
```

## Rule

Keep Angular CLI and Angular core on aligned major versions and follow the official Update Guide for major migrations.


---

<!-- 195_NG_UPDATE.md -->

# ng update

## What / Why

Shows/applies supported framework/CLI updates and migrations.

## Mental Model

```text
ng update
```

## Example / Recall

```ts
// Minimal recall example for: ng update
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use official update path.

## Common Mistake / Interview Trap

Do not skip multiple majors without checking update guidance.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ng update:** Shows/applies supported framework/CLI updates and migrations.


---

<!-- 196_BUDGETS.md -->

# Budgets

## What / Why

angular.json build budgets detect bundle growth.

## Mental Model

```text
initial/anyComponentStyle
```

## Example / Recall

```ts
// Minimal recall example for: Budgets
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use CI guardrails.

## Common Mistake / Interview Trap

Budgets should reflect real performance goals.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Budgets:** angular.json build budgets detect bundle growth.


---

<!-- 196_PRODUCTION_CHECKLIST.md -->

# Angular Production Readiness Checklist

## Architecture
- [ ] standalone-first architecture
- [ ] feature boundaries clear
- [ ] local signal state colocated
- [ ] RxJS used for real stream problems
- [ ] DI scopes reviewed
- [ ] lazy routes / @defer used appropriately

## Change Detection
- [ ] zoneless-compatible dependencies
- [ ] OnPush-default assumptions understood
- [ ] no mutation patterns relying on old global checks
- [ ] minimal manual detectChanges

## Data
- [ ] typed HTTP contracts
- [ ] error/loading states
- [ ] cancellation/retry semantics
- [ ] resource/httpResource used for reads, not mutations
- [ ] server/client state ownership explicit

## Security
- [ ] no browser secrets
- [ ] no unsafe sanitizer bypass
- [ ] backend authorization
- [ ] XSRF strategy correct
- [ ] CSP / Trusted Types evaluated

## SSR
- [ ] no unsafe browser globals
- [ ] hydration tested
- [ ] render modes chosen by route
- [ ] transfer state contains no secrets

## Performance
- [ ] bundle budgets
- [ ] stable @for tracking
- [ ] @defer/lazy routes
- [ ] optimized images
- [ ] Web Vitals monitored

## Quality
- [ ] Vitest unit tests
- [ ] integration tests
- [ ] critical E2E
- [ ] accessibility checks
- [ ] release telemetry


---

<!-- 197_DEVTOOLS.md -->

# DevTools

## What / Why

Angular DevTools inspects components, DI and performance.

## Mental Model

```text
browser extension
```

## Example / Recall

```ts
// Minimal recall example for: DevTools
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for change detection/component diagnosis.

## Common Mistake / Interview Trap

Production profiling still needs real-user metrics.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **DevTools:** Angular DevTools inspects components, DI and performance.


---

<!-- 197_PRACTICE_QUESTIONS.md -->

# Angular Practice Questions

1. Explain Angular's modern architecture.
2. What is a standalone component?
3. Standalone vs NgModule?
4. Why is Angular zoneless now?
5. What triggers change detection in zoneless Angular?
6. What changed with OnPush in Angular 22?
7. What is `ChangeDetectionStrategy.Eager`?
8. signal vs computed vs effect?
9. linkedSignal use case?
10. resource vs httpResource?
11. Why shouldn't resource loaders perform mutations?
12. Signal vs Observable?
13. When use toSignal/toObservable?
14. input vs model vs output?
15. How does hierarchical DI work?
16. inject vs constructor injection?
17. useClass vs useExisting?
18. What is an InjectionToken?
19. @if/@for vs legacy structural directives?
20. Why is track important in @for?
21. What does @defer do?
22. Router lazy loading vs @defer?
23. Guard vs resolver?
24. Why are route guards not security?
25. Signal Forms vs Reactive Forms?
26. What is FormField?
27. What is ControlValueAccessor?
28. HttpClient vs httpResource?
29. Functional interceptor?
30. switchMap vs mergeMap?
31. concatMap vs exhaustMap?
32. takeUntilDestroyed?
33. SSR vs prerender vs CSR?
34. What is hydration?
35. Incremental hydration?
36. Event replay?
37. Why can browser globals break SSR?
38. TestBed?
39. Why Vitest now?
40. How do you migrate from Karma?
41. Angular sanitization model?
42. Why is bypassSecurityTrust dangerous?
43. What is Angular Aria?
44. How do you optimize huge lists?
45. How do you troubleshoot NullInjectorError?
46. Why can HttpClient call twice?
47. How do you debug stale async search results?
48. Angular vs React?
49. How would you structure a large enterprise Angular app?
50. What are the top Angular 22 interview traps?


---

<!-- 198_ANGULAR_VS_REACT.md -->

# Angular vs React

## What / Why

Angular is a full framework with DI/router/forms/HTTP/tooling; React is a UI library with framework/ecosystem choices.

## Mental Model

```text
framework vs library
```

## Example / Recall

```ts
// Minimal recall example for: Angular vs React
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Answer by architecture trade-offs, not preference.

## Common Mistake / Interview Trap

Do not say Angular is simply 'heavier React'.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Angular vs React:** Angular is a full framework with DI/router/forms/HTTP/tooling; React is a UI library with framework/ecosystem choices.


---

<!-- 198_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:

- Angular official documentation: https://angular.dev/
- Angular release/version support: https://angular.dev/reference/releases
- Angular version compatibility: https://angular.dev/reference/versions
- Angular roadmap: https://angular.dev/roadmap
- Angular Zoneless guide
- Angular Forms / Signal Forms guides
- Angular HTTP / httpResource guides
- Angular Testing / Vitest guide
- Angular CLI reference

## Current Baseline — 15 September 2026

```text
Active major: Angular 22
Current stable surfaced release: 22.1.6
22.2: pre-release/next line at this date
```

## Important Modern Version Facts

```text
Standalone default: modern Angular (standalone true no longer necessary in new defaults)
Zoneless default: v21+
OnPush default: v22+
ChangeDetectionStrategy.Eager: explicit eager strategy
ChangeDetectionStrategy.Default: deprecated alias of Eager
Signal Forms: stable v22+
resource(): stable v22
httpResource(): stable v22
Vitest: default new-project test runner
Angular Aria: stable v22
```

## Accuracy Rule

Angular evolves quickly. For production work always confirm:
- exact Angular minor/patch,
- Node/TypeScript/RxJS compatibility,
- migration guide requirements,
- browser Baseline support,
- developer-preview/experimental API status.


---

<!-- 199_SIGNALS_VS_RXJS_INTERVIEW.md -->

# Signals vs RxJS Interview

## What / Why

Signals are synchronous reactive values; RxJS handles async streams/composition.

## Mental Model

```text
state vs stream
```

## Example / Recall

```ts
// Minimal recall example for: Signals vs RxJS Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use both intentionally.

## Common Mistake / Interview Trap

Signals did not make RxJS obsolete.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Signals vs RxJS Interview:** Signals are synchronous reactive values; RxJS handles async streams/composition.


---

<!-- 200_STANDALONE_VS_NGMODULE.md -->

# Standalone vs NgModule

## What / Why

Standalone is default modern Angular; NgModules are legacy/compatibility architecture.

## Mental Model

```text
component imports directly vs module declarations
```

## Example / Recall

```ts
// Minimal recall example for: Standalone vs NgModule
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Know both for enterprise interviews.

## Common Mistake / Interview Trap

Do not say NgModules were removed.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Standalone vs NgModule:** Standalone is default modern Angular; NgModules are legacy/compatibility architecture.


---

<!-- 201_ZONELESS_INTERVIEW.md -->

# Zoneless Interview

## What / Why

Modern Angular is zoneless by default.

## Mental Model

```text
explicit notifications → change detection
```

## Example / Recall

```ts
// Minimal recall example for: Zoneless Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Explain signals/events/inputs/AsyncPipe notifications.

## Common Mistake / Interview Trap

Do not describe ZoneJS as mandatory.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Zoneless Interview:** Modern Angular is zoneless by default.


---

<!-- 202_ONPUSH_INTERVIEW.md -->

# OnPush Interview

## What / Why

Angular 22 defaults to OnPush; Eager is opt-in; Default alias is deprecated.

## Mental Model

```text
OnPush default
```

## Example / Recall

```ts
// Minimal recall example for: OnPush Interview
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Explain what marks views dirty.

## Common Mistake / Interview Trap

Older 'set OnPush manually everywhere' guidance is stale.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **OnPush Interview:** Angular 22 defaults to OnPush; Eager is opt-in; Default alias is deprecated.


---

<!-- 203_CHANGE_DETECTION_BUG.md -->

# Change Detection Bug

## What / Why

UI not updating usually means state changed without notifying Angular or mutation/ownership is wrong.

## Mental Model

```text
signal/input/event/markForCheck
```

## Example / Recall

```ts
// Minimal recall example for: Change Detection Bug
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Trace notification source.

## Common Mistake / Interview Trap

Do not spam detectChanges.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Change Detection Bug:** UI not updating usually means state changed without notifying Angular or mutation/ownership is wrong.


---

<!-- 204_EXPRESSIONCHANGED_TROUBLESHOOTING.md -->

# ExpressionChanged Troubleshooting

## What / Why

A binding changes after it was checked in the same verification cycle.

## Mental Model

```text
late mutation
```

## Example / Recall

```ts
// Minimal recall example for: ExpressionChanged Troubleshooting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Fix lifecycle/data flow.

## Common Mistake / Interview Trap

setTimeout is usually a workaround.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **ExpressionChanged Troubleshooting:** A binding changes after it was checked in the same verification cycle.


---

<!-- 205_MEMORY_LEAK_TROUBLESHOOTING.md -->

# Memory Leak Troubleshooting

## What / Why

Long-lived subscriptions/listeners/resources outlive owning component.

## Mental Model

```text
takeUntilDestroyed/AsyncPipe/cleanup
```

## Example / Recall

```ts
// Minimal recall example for: Memory Leak Troubleshooting
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use lifecycle-aware APIs.

## Common Mistake / Interview Trap

Destroying component does not automatically clean every custom external resource.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Memory Leak Troubleshooting:** Long-lived subscriptions/listeners/resources outlive owning component.


---

<!-- 206_HTTP_DUPLICATE_CALLS.md -->

# HTTP Duplicate Calls

## What / Why

Cold Observable subscribed multiple times or repeated effect/computation.

## Mental Model

```text
subscription count
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Duplicate Calls
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Share/cache deliberately or change ownership.

## Common Mistake / Interview Trap

Do not assume HttpClient request executes only once globally.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HTTP Duplicate Calls:** Cold Observable subscribed multiple times or repeated effect/computation.


---

<!-- 207_SWITCHMAP_RACE_FIX.md -->

# switchMap Race Fix

## What / Why

Use switchMap when new request should cancel previous.

## Mental Model

```text
typeahead latest wins
```

## Example / Recall

```ts
// Minimal recall example for: switchMap Race Fix
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use for searches.

## Common Mistake / Interview Trap

Do not use for writes that must all complete.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **switchMap Race Fix:** Use switchMap when new request should cancel previous.


---

<!-- 208_FORM_PERFORMANCE.md -->

# Form Performance

## What / Why

Large forms need scoped state, sensible validation timing and component boundaries.

## Mental Model

```text
form tree/signals
```

## Example / Recall

```ts
// Minimal recall example for: Form Performance
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use Signal Forms/Reactive Forms appropriately.

## Common Mistake / Interview Trap

One giant component + every-keystroke expensive validation performs poorly.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Form Performance:** Large forms need scoped state, sensible validation timing and component boundaries.


---

<!-- 209_SSR_MISMATCH.md -->

# SSR Mismatch

## What / Why

Server and browser produce incompatible DOM/state.

## Mental Model

```text
browser API/time/random/data mismatch
```

## Example / Recall

```ts
// Minimal recall example for: SSR Mismatch
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Make first render deterministic.

## Common Mistake / Interview Trap

Direct DOM mutation before hydration can break reuse.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **SSR Mismatch:** Server and browser produce incompatible DOM/state.


---

<!-- 210_BUNDLE_TOO_LARGE.md -->

# Bundle Too Large

## What / Why

Large eager features/dependencies/images.

## Mental Model

```text
analyze → lazy/@defer/replace dependency
```

## Example / Recall

```ts
// Minimal recall example for: Bundle Too Large
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use budgets.

## Common Mistake / Interview Trap

Tree shaking cannot fix side-effect-heavy packages automatically.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Bundle Too Large:** Large eager features/dependencies/images.


---

<!-- 211_DI_NULLINJECTOR_ERROR.md -->

# DI NullInjector Error

## What / Why

Requested token has no visible provider in current injector hierarchy.

## Mental Model

```text
token → provider scope
```

## Example / Recall

```ts
// Minimal recall example for: DI NullInjector Error
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Check provider registration and dynamic scopes.

## Common Mistake / Interview Trap

Adding provider randomly can create duplicate instances.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **DI NullInjector Error:** Requested token has no visible provider in current injector hierarchy.


---

<!-- 212_CIRCULAR_DEPENDENCY.md -->

# Circular Dependency

## What / Why

Features/services import each other cyclically.

## Mental Model

```text
A→B→A
```

## Example / Recall

```ts
// Minimal recall example for: Circular Dependency
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Refactor ownership/contracts.

## Common Mistake / Interview Trap

forwardRef rarely fixes architectural coupling.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Circular Dependency:** Features/services import each other cyclically.


---

<!-- 213_INTERVIEW_TRAPS.md -->

# Interview Traps

## What / Why

Modern Angular misconceptions and version-sensitive facts.

## Mental Model

```text
Angular22 / Signals / Zoneless / OnPush / Vitest
```

## Example / Recall

```ts
// Minimal recall example for: Interview Traps
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use as final recall.

## Common Mistake / Interview Trap

See dedicated trap sheet.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **Interview Traps:** Modern Angular misconceptions and version-sensitive facts.
