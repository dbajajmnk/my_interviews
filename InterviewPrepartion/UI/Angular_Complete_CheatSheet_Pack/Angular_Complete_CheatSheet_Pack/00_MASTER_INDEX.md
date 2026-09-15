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
