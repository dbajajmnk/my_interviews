# Microfrontend Design Patterns — Complete Cheat Sheet

> Pattern-first fast revision companion for enterprise frontend architecture and interviews.


---

<!-- 00_MASTER_INDEX.md -->

# Microfrontend Design Patterns — Complete Cheat Sheet Pack

**Purpose:** Fast revision for frontend architecture, enterprise modernization, interviews, independent delivery, platform engineering, and production troubleshooting.

**Pattern format:** Problem → Intent → Visual → How → When to Use → Avoid When → Trade-offs → Example → Interview Trap → Related Patterns

## Revision order

`30-sec Recall → Decomposition → Shell/Composition → Integration → State → UX Isolation → Versioning → Reliability → Delivery → Governance → Anti-Patterns → Interview Traps`

## Foundations & Decomposition

1. Vertical Slice / Business Capability — `02_VERTICAL_SLICE_BUSINESS_CAPABILITY.md`
2. Route-Based Decomposition — `03_ROUTE_BASED_DECOMPOSITION.md`
3. Page-Owned Microfrontend — `04_PAGE_OWNED_MICROFRONTEND.md`
4. Domain-Owned Microfrontend — `05_DOMAIN_OWNED_MICROFRONTEND.md`
5. Self-Contained Frontend — `06_SELF_CONTAINED_FRONTEND.md`
6. Team-Owned Slice — `07_TEAM_OWNED_SLICE.md`
7. Modular Frontend First — `08_MODULAR_FRONTEND_FIRST.md`
8. Strangler Frontend — `09_STRANGLER_FRONTEND.md`
9. UI Anti-Corruption Layer — `10_UI_ANTI_CORRUPTION_LAYER.md`

## Shell & Composition

10. Application Shell — `11_APPLICATION_SHELL.md`
11. Thin Shell — `12_THIN_SHELL.md`
12. Runtime Composition — `13_RUNTIME_COMPOSITION.md`
13. Build-Time Composition — `14_BUILD_TIME_COMPOSITION.md`
14. Server-Side Composition — `15_SERVER_SIDE_COMPOSITION.md`
15. Edge-Side Composition — `16_EDGE_SIDE_COMPOSITION.md`
16. Islands Architecture — `17_ISLANDS_ARCHITECTURE.md`
17. Widget Composition — `18_WIDGET_COMPOSITION.md`
18. Route Composition — `19_ROUTE_COMPOSITION.md`
19. Layout Slot Composition — `20_LAYOUT_SLOT_COMPOSITION.md`
20. Plugin Architecture — `21_PLUGIN_ARCHITECTURE.md`

## Integration Technologies

21. Module Federation — `22_MODULE_FEDERATION.md`
22. Host / Remote — `23_HOST_REMOTE.md`
23. Shared Singleton Dependency — `24_SHARED_SINGLETON_DEPENDENCY.md`
24. Import Map — `25_IMPORT_MAP.md`
25. single-spa Orchestration — `26_SINGLE_SPA_ORCHESTRATION.md`
26. Web Component Wrapper — `27_WEB_COMPONENT_WRAPPER.md`
27. Iframe Isolation — `28_IFRAME_ISOLATION.md`
28. Package-Based Integration — `29_PACKAGE_BASED_INTEGRATION.md`
29. Runtime Manifest / Remote Registry — `30_RUNTIME_MANIFEST_REMOTE_REGISTRY.md`
30. Remote Adapter / Facade — `31_REMOTE_ADAPTER_FACADE.md`

## Routing & Navigation

31. Shell-Owned Top-Level Routing — `32_SHELL_OWNED_TOP_LEVEL_ROUTING.md`
32. MFE-Owned Nested Routing — `33_MFE_OWNED_NESTED_ROUTING.md`
33. URL-as-Contract — `34_URL_AS_CONTRACT.md`
34. URL-as-State — `35_URL_AS_STATE.md`
35. Route Delegation — `36_ROUTE_DELEGATION.md`
36. Deep-Link Preservation — `37_DEEP_LINK_PRESERVATION.md`
37. Navigation Event — `38_NAVIGATION_EVENT.md`

## State & Communication

38. Local State First — `39_LOCAL_STATE_FIRST.md`
39. URL-Mediated Communication — `40_URL_MEDIATED_COMMUNICATION.md`
40. Event Bus — `41_EVENT_BUS.md`
41. DOM Custom Event — `42_DOM_CUSTOM_EVENT.md`
42. Pub/Sub Utility — `43_PUB_SUB_UTILITY.md`
43. Callback / Contract Props — `44_CALLBACK_CONTRACT_PROPS.md`
44. Shared Context — `45_SHARED_CONTEXT.md`
45. Controlled Shared Store — `46_CONTROLLED_SHARED_STORE.md`
46. Backend-Mediated State — `47_BACKEND_MEDIATED_STATE.md`
47. State Synchronization Anti-Pattern — `48_STATE_SYNCHRONIZATION_ANTI_PATTERN.md`
48. Cross-MFE Contract Versioning — `49_CROSS_MFE_CONTRACT_VERSIONING.md`

## UI Consistency & Isolation

49. Design System — `50_DESIGN_SYSTEM.md`
50. Design Tokens — `51_DESIGN_TOKENS.md`
51. Shared Dumb Components — `52_SHARED_DUMB_COMPONENTS.md`
52. Shadow DOM Isolation — `53_SHADOW_DOM_ISOLATION.md`
53. Scoped CSS — `54_SCOPED_CSS.md`
54. Minimal Global CSS — `55_MINIMAL_GLOBAL_CSS.md`
55. Theme Contract — `56_THEME_CONTRACT.md`
56. Accessibility Contract — `57_ACCESSIBILITY_CONTRACT.md`
57. i18n Contract — `58_I18N_CONTRACT.md`
58. SEO Metadata Ownership — `59_SEO_METADATA_OWNERSHIP.md`

## Versioning & Dependency Patterns

59. Independent Versioning — `60_INDEPENDENT_VERSIONING.md`
60. Semantic Compatibility — `61_SEMANTIC_COMPATIBILITY.md`
61. Runtime Compatibility Window — `62_RUNTIME_COMPATIBILITY_WINDOW.md`
62. Dependency Sharing — `63_DEPENDENCY_SHARING.md`
63. Dependency Duplication — `64_DEPENDENCY_DUPLICATION.md`
64. Version Pinning — `65_VERSION_PINNING.md`
65. Canary Remote — `66_CANARY_REMOTE.md`
66. Backward-Compatible Public Interface — `67_BACKWARD_COMPATIBLE_PUBLIC_INTERFACE.md`

## Reliability, Performance & Security

67. Error Boundary per MFE — `68_ERROR_BOUNDARY_PER_MFE.md`
68. Remote Load Fallback — `69_REMOTE_LOAD_FALLBACK.md`
69. Graceful Degradation — `70_GRACEFUL_DEGRADATION.md`
70. Remote Load Circuit Breaker — `71_REMOTE_LOAD_CIRCUIT_BREAKER.md`
71. Remote Load Timeout — `72_REMOTE_LOAD_TIMEOUT.md`
72. CDN + Immutable Assets — `73_CDN_IMMUTABLE_ASSETS.md`
73. Lazy Loading — `74_LAZY_LOADING.md`
74. Prefetch / Preload — `75_PREFETCH_PRELOAD.md`
75. Performance Budget per MFE — `76_PERFORMANCE_BUDGET_PER_MFE.md`
76. CSP Allowlist — `77_CSP_ALLOWLIST.md`
77. Trusted Remote Origin — `78_TRUSTED_REMOTE_ORIGIN.md`
78. Iframe Security Boundary — `79_IFRAME_SECURITY_BOUNDARY.md`
79. Supply Chain Verification — `80_SUPPLY_CHAIN_VERIFICATION.md`

## Testing, Delivery & Operations

80. Independent Pipeline — `81_INDEPENDENT_PIPELINE.md`
81. Contract Testing — `82_CONTRACT_TESTING.md`
82. Shell-MFE Integration Test — `83_SHELL_MFE_INTEGRATION_TEST.md`
83. Critical Journey E2E — `84_CRITICAL_JOURNEY_E2E.md`
84. Visual Regression — `85_VISUAL_REGRESSION.md`
85. Consumer-Driven UI Contract — `86_CONSUMER_DRIVEN_UI_CONTRACT.md`
86. Runtime Version Telemetry — `87_RUNTIME_VERSION_TELEMETRY.md`
87. Frontend Distributed Tracing — `88_FRONTEND_DISTRIBUTED_TRACING.md`
88. Feature Flag — `89_FEATURE_FLAG.md`
89. Blue-Green Remote — `90_BLUE_GREEN_REMOTE.md`
90. Canary Deployment — `91_CANARY_DEPLOYMENT.md`
91. Shadow / Dark Launch — `92_SHADOW_DARK_LAUNCH.md`
92. Rollback by Manifest — `93_ROLLBACK_BY_MANIFEST.md`
93. Local Override — `94_LOCAL_OVERRIDE.md`
94. Environment Promotion — `95_ENVIRONMENT_PROMOTION.md`

## Governance & Decision Patterns

95. Frontend Platform Team — `96_FRONTEND_PLATFORM_TEAM.md`
96. Paved Road — `97_PAVED_ROAD.md`
97. Architecture Guardrails — `98_ARCHITECTURE_GUARDRAILS.md`
98. Custodian-Owned Design System — `99_CUSTODIAN_OWNED_DESIGN_SYSTEM.md`
99. Shared-Nothing Business Logic — `100_SHARED_NOTHING_BUSINESS_LOGIC.md`


---

<!-- 01_30_SECOND_RECALL.md -->

# Microfrontend Design Patterns — 30-Second Recall

## Formula

```text
Business Boundary
+ Independent Delivery
+ Explicit Integration Contract
+ Local State
+ Shared UX Standards
+ Runtime Isolation
= Healthy Microfrontend Architecture
```

## Most Important Patterns

```text
Vertical Slice
Route Composition
Thin Application Shell
Runtime Composition
Module Federation / Import Maps / single-spa
Local State First
URL-as-Contract
Design System + Design Tokens
Error Boundary + Remote Fallback
Independent Pipeline + Contract Testing
Strangler Frontend
```

## State Rule

```text
Local State
   ↓
URL / Events / Backend
   ↓
Minimal Shared Context
```

## Five Interview Traps

1. Microfrontend is an architecture style; Module Federation is one implementation mechanism.
2. Route/business-capability boundaries are usually safer than tiny-component splitting.
3. Shared global state recreates coupling.
4. Independent repository does not guarantee independent deployment.
5. Different frameworks are possible, not automatically desirable.


---

<!-- 02_VERTICAL_SLICE_BUSINESS_CAPABILITY.md -->

# Vertical Slice / Business Capability

## Problem

Large independently delivered frontends need a clear pattern for **split the frontend by user/business capability rather than technical layer.**

## Intent

Split the frontend by user/business capability rather than technical layer.

## Visual / Memory Trigger

```text
Catalog, Cart, Checkout, Account
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when teams own business outcomes and need independent delivery.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog, Cart, Checkout, Account
```

## Interview Trap

Do not create Button-MFE, Validation-MFE, or other nano-frontends.

## Related Patterns

Route-Based Decomposition, Team-Owned Slice, Domain-Owned Microfrontend

## 20-Second Recall

> **Vertical Slice / Business Capability:** Split the frontend by user/business capability rather than technical layer.


---

<!-- 03_ROUTE_BASED_DECOMPOSITION.md -->

# Route-Based Decomposition

## Problem

Large independently delivered frontends need a clear pattern for **map top-level route areas to independently owned mfes.**

## Intent

Map top-level route areas to independently owned MFEs.

## Visual / Memory Trigger

```text
/catalog/* → Catalog MFE; /cart/* → Cart MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the safest default when routes reflect clear business capabilities.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/catalog/* → Catalog MFE; /cart/* → Cart MFE
```

## Interview Trap

Route paths become contracts; change them compatibly.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Route-Based Decomposition:** Map top-level route areas to independently owned MFEs.


---

<!-- 04_PAGE_OWNED_MICROFRONTEND.md -->

# Page-Owned Microfrontend

## Problem

Large independently delivered frontends need a clear pattern for **one mfe owns one complete page or major screen.**

## Intent

One MFE owns one complete page or major screen.

## Visual / Memory Trigger

```text
/orders → Orders MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Good when a page has cohesive logic, data and ownership.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/orders → Orders MFE
```

## Interview Trap

Avoid splitting a page merely to mirror component structure.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Page-Owned Microfrontend:** One MFE owns one complete page or major screen.


---

<!-- 05_DOMAIN_OWNED_MICROFRONTEND.md -->

# Domain-Owned Microfrontend

## Problem

Large independently delivered frontends need a clear pattern for **align an mfe to a bounded business domain.**

## Intent

Align an MFE to a bounded business domain.

## Visual / Memory Trigger

```text
Checkout team owns Checkout MFE + APIs/BFF + telemetry.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when frontend and backend domain ownership can align.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Checkout team owns Checkout MFE + APIs/BFF + telemetry.
```

## Interview Trap

Domain ownership matters more than framework boundaries.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Domain-Owned Microfrontend:** Align an MFE to a bounded business domain.


---

<!-- 06_SELF_CONTAINED_FRONTEND.md -->

# Self-Contained Frontend

## Problem

Large independently delivered frontends need a clear pattern for **keep routing, local state, ui logic, tests, telemetry and delivery inside one owning slice.**

## Intent

Keep routing, local state, UI logic, tests, telemetry and delivery inside one owning slice.

## Visual / Memory Trigger

```text
MFE = route + state + API integration + tests + deployment.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to maximize autonomy.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
MFE = route + state + API integration + tests + deployment.
```

## Interview Trap

Self-contained does not mean duplicating platform concerns.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Self-Contained Frontend:** Keep routing, local state, UI logic, tests, telemetry and delivery inside one owning slice.


---

<!-- 07_TEAM_OWNED_SLICE.md -->

# Team-Owned Slice

## Problem

Large independently delivered frontends need a clear pattern for **give one team clear end-to-end ownership of one mfe.**

## Intent

Give one team clear end-to-end ownership of one MFE.

## Visual / Memory Trigger

```text
Build → Test → Deploy → Operate
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when multiple teams need independent release cadence.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Build → Test → Deploy → Operate
```

## Interview Trap

If every release requires multiple teams, boundary is weak.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Team-Owned Slice:** Give one team clear end-to-end ownership of one MFE.


---

<!-- 08_MODULAR_FRONTEND_FIRST.md -->

# Modular Frontend First

## Problem

Large independently delivered frontends need a clear pattern for **use a modular monolith frontend until runtime distribution is justified.**

## Intent

Use a modular monolith frontend until runtime distribution is justified.

## Visual / Memory Trigger

```text
Modules inside one app → proven autonomy need → MFEs
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Best for smaller teams or unclear domain boundaries.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Modules inside one app → proven autonomy need → MFEs
```

## Interview Trap

Microfrontends are not the default for every frontend.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Modular Frontend First:** Use a modular monolith frontend until runtime distribution is justified.


---

<!-- 09_STRANGLER_FRONTEND.md -->

# Strangler Frontend

## Problem

Large independently delivered frontends need a clear pattern for **incrementally replace a frontend monolith route by route.**

## Intent

Incrementally replace a frontend monolith route by route.

## Visual / Memory Trigger

```text
Shell → new Catalog MFE + legacy app for remaining routes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for low-risk modernization.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell → new Catalog MFE + legacy app for remaining routes
```

## Interview Trap

Avoid a big-bang rewrite.

## Related Patterns

UI Anti-Corruption Layer, Route-Based Decomposition

## 20-Second Recall

> **Strangler Frontend:** Incrementally replace a frontend monolith route by route.


---

<!-- 100_ANTI_PATTERNS.md -->

# Microfrontend Design Anti-Patterns

## Nano Frontends
Every small component becomes independently deployed.

## Fat Shell
The shell accumulates domain logic and becomes the new monolith.

## One Global Store
All MFEs depend on one mutable state schema.

## Shared-Everything Library
A common package hides domain models and business rules.

## Framework Zoo
Every team chooses a framework without a real business/migration reason.

## Central Release Train
All MFEs still have to deploy together.

## Runtime Dependency Chain
MFE A loads B, B loads C, C loads D.

## Global CSS
One team's styles can break another MFE.

## Invisible Event Bus
Cross-MFE contracts are undocumented and unversioned.

## Mutable Remote URLs
Existing URLs are overwritten, making cache and rollback unsafe.

## No Failure Boundary
One remote failure blanks the whole page.

## State Synchronization Web
Every MFE continuously mirrors other MFE state.

## Key Rule

If autonomy requires constant coordination, the boundary is probably wrong.


---

<!-- 100_SHARED_NOTHING_BUSINESS_LOGIC.md -->

# Shared-Nothing Business Logic

## Problem

Large independently delivered frontends need a clear pattern for **keep business/domain logic inside the owning mfe/domain.**

## Intent

Keep business/domain logic inside the owning MFE/domain.

## Visual / Memory Trigger

```text
share platform/UI primitives, not business models
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to prevent hidden coupling.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
share platform/UI primitives, not business models
```

## Interview Trap

DRY is less important than autonomy across domain boundaries.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared-Nothing Business Logic:** Keep business/domain logic inside the owning MFE/domain.


---

<!-- 101_DECISION_TREE.md -->

# Microfrontend Pattern Decision Tree

```text
Need independent frontend deployment?
 ├── No → Modular frontend / build-time package
 └── Yes
      ↓
Clear business/route boundary?
 ├── Yes → Route-based MFE
 └── No
      ↓
Does a widget truly need independent deployment?
 ├── No → Keep inside owning MFE
 └── Yes → Widget composition
```

## Integration choice

```text
Need runtime module sharing? → Module Federation
Need URL indirection / version mapping? → Import Maps / Runtime Manifest
Need app mount/unmount orchestration? → single-spa
Need framework-neutral widget? → Web Component
Need strong browser/security isolation? → iframe
```

## State choice

```text
Navigation/shareable state → URL
Business source of truth → Backend
Simple signal → Event / Callback
Stable app-wide context → Shared Context
Everything else → Local State
```


---

<!-- 102_COMPARISONS.md -->

# High-Value Microfrontend Pattern Comparisons

## Module Federation vs Import Maps

| Module Federation | Import Maps |
|---|---|
| exposes/consumes runtime modules | maps module names to URLs |
| bundler/runtime integration | browser module resolution |
| can coordinate shared dependencies | simple location indirection |
| host/remote model | logical-name/URL model |

## single-spa vs Module Federation

| single-spa | Module Federation |
|---|---|
| application lifecycle/orchestration | runtime module loading/sharing |
| mount/unmount | expose/consume |
| route/activity rules | remote module contract |
| can be used together | can be used together |

## Route vs Widget Composition

| Route-Based | Widget-Based |
|---|---|
| stronger isolation | finer composition |
| less shared state | more coordination |
| easier ownership | harder layout/state contracts |
| preferred default | selective use |

## Web Component vs Iframe

| Web Component | Iframe |
|---|---|
| same page JS context | separate document/origin |
| easy visual integration | stronger isolation |
| Shadow DOM optional | postMessage communication |
| lighter | heavier |

## Local State vs Shared Store

| Local State | Shared Store |
|---|---|
| autonomy | coupling |
| independent evolution | shared schema |
| simpler ownership | coordinated change |


---

<!-- 103_INTERVIEW_TRAPS.md -->

# Microfrontend Design Pattern Interview Traps

1. Microfrontend != Module Federation.
2. Route composition is an architecture pattern; Module Federation is an implementation mechanism.
3. single-spa and Module Federation can be used together.
4. Web Components solve interoperability, not full application orchestration.
5. Iframes remain valid when strong isolation is required.
6. Local state should be the default.
7. One global Redux store usually recreates monolithic coupling.
8. URL is a powerful cross-MFE contract.
9. Independent repository != independent deployment.
10. Thin shell should not contain domain business logic.
11. Shared design system should not contain business logic.
12. CSS isolation is an architecture concern.
13. Runtime composition requires compatibility across concurrently deployed versions.
14. Immutable assets make CDN caching and rollback safer.
15. Runtime manifests/import maps enable fast canary and rollback.
16. Route-oriented boundaries generally reduce cross-MFE communication.
17. Shared dependencies can improve performance while increasing version coupling.
18. Dependency duplication can be the correct trade-off.
19. Multi-framework capability is not a reason to use multiple frameworks.
20. Strangler migration is usually safer than a full rewrite.
21. Same-page MFE boundaries are not automatically security boundaries.
22. Total page performance matters more than one MFE's local bundle score.
23. Accessibility must be coherent across all slices.
24. Feature flags require lifecycle/removal governance.
25. Platform teams should enable autonomy, not become release gates.


---

<!-- 104_ONE_PAGE_RECALL.md -->

# Microfrontend Design Patterns — One-Page Recall

## Decomposition
```text
Vertical Slice
Route-Based
Domain-Owned
Strangler
```

## Composition
```text
Thin Shell
Runtime Composition
Server/Edge Composition
Widget Composition
```

## Integration
```text
Module Federation
Import Maps
single-spa
Web Components
iframe
Runtime Manifest
```

## Communication
```text
Local State First
URL-as-Contract
Callback/Event
Backend Truth
Minimal Shared Context
```

## UX
```text
Design System
Design Tokens
Scoped CSS
Accessibility
i18n
SEO Ownership
```

## Reliability / Performance
```text
Error Boundary
Remote Fallback
Immutable CDN Asset
Lazy Load
Prefetch
Performance Budget
CSP
```

## Delivery
```text
Independent Pipeline
Contract Test
Canary
Manifest Rollback
Local Override
Environment Promotion
```

## Governance
```text
Platform Team
Paved Road
Guardrails
Shared-Nothing Business Logic
```


---

<!-- 105_PRACTICE_QUESTIONS.md -->

# Microfrontend Design Patterns — Practice Questions

1. What is vertical-slice decomposition?
2. Route-based vs component/widget-based MFE?
3. What is a thin application shell?
4. Runtime vs build-time composition?
5. Server-side vs client-side composition?
6. What is Module Federation?
7. Host vs Remote?
8. Why share singleton dependencies?
9. Import Maps vs Module Federation?
10. What does single-spa solve?
11. Web Components vs framework components?
12. When would you choose iframe isolation?
13. What is a runtime manifest?
14. Who should own top-level routing?
15. Why is URL a good integration contract?
16. Why prefer local state?
17. When is an event bus acceptable?
18. Why is one global Redux store risky?
19. How should auth context be shared?
20. What belongs in a design system?
21. How do you prevent CSS collisions?
22. What is a runtime compatibility window?
23. When is dependency duplication acceptable?
24. How do you handle a remote-load failure?
25. Why use immutable CDN assets?
26. What is a per-MFE performance budget?
27. How does CSP apply to dynamic remotes?
28. What is runtime version telemetry?
29. How do you contract-test an MFE?
30. How do you rollback a remote quickly?
31. How can a developer run only one MFE locally?
32. What is Strangler Frontend?
33. What should a frontend platform team own?
34. What is a paved-road pattern?
35. Name common microfrontend anti-patterns.
36. When is a modular frontend better than microfrontends?


---

<!-- 106_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack is architecture-first and framework-neutral.

Primary reference families:

- Martin Fowler / Thoughtworks — Micro Frontends
- webpack — Module Federation documentation
- single-spa — application orchestration and recommended setup
- MDN — Web Components, Custom Elements, Shadow DOM
- browser standards for URLs, Custom Events, module loading and CSP

## High-Confidence Design Guidance

### Business / Vertical Slicing
Independent frontend applications are strongest when aligned to business capabilities and team ownership rather than horizontal technical layers.

### Independent Deployment
Each MFE should be buildable, testable and deployable without forcing unrelated applications to release.

### Communication
MFEs should communicate as little as practical. Excessive shared mutable state reintroduces the coupling microfrontends are intended to reduce.

### URL as Contract
Routes provide a declarative, shareable, bookmarkable integration mechanism and should be treated as versioned contracts.

### Shared UI
Shared libraries are best suited to visual/platform primitives; business/domain logic should stay with the owning MFE/domain.

### Module Federation
Module Federation is a runtime module-loading/sharing mechanism for separately built applications.

### single-spa
single-spa focuses on application lifecycle/orchestration and can coexist with Module Federation or import-map based loading.

## Core Rule

Choose the simplest pattern that preserves:

```text
team autonomy
business cohesion
independent delivery
runtime reliability
performance
security
UX consistency
```


---

<!-- 10_UI_ANTI_CORRUPTION_LAYER.md -->

# UI Anti-Corruption Layer

## Problem

Large independently delivered frontends need a clear pattern for **translate legacy frontend state/contracts into a clean interface for new mfes.**

## Intent

Translate legacy frontend state/contracts into a clean interface for new MFEs.

## Visual / Memory Trigger

```text
New MFE → adapter/ACL → legacy APIs/store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use during migration from legacy global-state or navigation models.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
New MFE → adapter/ACL → legacy APIs/store
```

## Interview Trap

Keep the ACL as translation, not a new business-logic hub.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **UI Anti-Corruption Layer:** Translate legacy frontend state/contracts into a clean interface for new MFEs.


---

<!-- 11_APPLICATION_SHELL.md -->

# Application Shell

## Problem

Large independently delivered frontends need a clear pattern for **provide global composition, top-level routing, auth bootstrap, layout and mfe loading.**

## Intent

Provide global composition, top-level routing, auth bootstrap, layout and MFE loading.

## Visual / Memory Trigger

```text
Shell → Catalog / Cart / Account
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the stable platform frame around independently delivered MFEs.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell → Catalog / Cart / Account
```

## Interview Trap

Do not put domain business logic into the shell.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Application Shell:** Provide global composition, top-level routing, auth bootstrap, layout and MFE loading.


---

<!-- 12_THIN_SHELL.md -->

# Thin Shell

## Problem

Large independently delivered frontends need a clear pattern for **keep the shell platform-oriented and stable.**

## Intent

Keep the shell platform-oriented and stable.

## Visual / Memory Trigger

```text
Navigation + routing + auth bootstrap + telemetry only
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to prevent the shell becoming a release bottleneck.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Navigation + routing + auth bootstrap + telemetry only
```

## Interview Trap

Fat shell = new frontend monolith.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Thin Shell:** Keep the shell platform-oriented and stable.


---

<!-- 13_RUNTIME_COMPOSITION.md -->

# Runtime Composition

## Problem

Large independently delivered frontends need a clear pattern for **resolve and load independently deployed mfes at runtime.**

## Intent

Resolve and load independently deployed MFEs at runtime.

## Visual / Memory Trigger

```text
Shell → runtime map → remote bundle → mount
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when independent runtime release is essential.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell → runtime map → remote bundle → mount
```

## Interview Trap

Adds runtime compatibility and failure modes.

## Related Patterns

Module Federation, Import Map, Runtime Manifest / Remote Registry

## 20-Second Recall

> **Runtime Composition:** Resolve and load independently deployed MFEs at runtime.


---

<!-- 14_BUILD_TIME_COMPOSITION.md -->

# Build-Time Composition

## Problem

Large independently delivered frontends need a clear pattern for **compose packages/modules during host build.**

## Intent

Compose packages/modules during host build.

## Visual / Memory Trigger

```text
Package → host build → one artifact
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when compile-time safety matters more than independent runtime deployment.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Package → host build → one artifact
```

## Interview Trap

A host rebuild is required.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Build-Time Composition:** Compose packages/modules during host build.


---

<!-- 15_SERVER_SIDE_COMPOSITION.md -->

# Server-Side Composition

## Problem

Large independently delivered frontends need a clear pattern for **compose html fragments on the server.**

## Intent

Compose HTML fragments on the server.

## Visual / Memory Trigger

```text
Request → composer → header/catalog/account fragments → HTML
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for SEO and fast first paint.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Request → composer → header/catalog/account fragments → HTML
```

## Interview Trap

The slowest fragment can dominate latency.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Server-Side Composition:** Compose HTML fragments on the server.


---

<!-- 16_EDGE_SIDE_COMPOSITION.md -->

# Edge-Side Composition

## Problem

Large independently delivered frontends need a clear pattern for **compose/cache fragments at cdn or edge.**

## Intent

Compose/cache fragments at CDN or edge.

## Visual / Memory Trigger

```text
Browser → edge composer → cached fragments
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for globally distributed content-heavy apps.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Browser → edge composer → cached fragments
```

## Interview Trap

Caching/invalidation becomes an architecture concern.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Edge-Side Composition:** Compose/cache fragments at CDN or edge.


---

<!-- 17_ISLANDS_ARCHITECTURE.md -->

# Islands Architecture

## Problem

Large independently delivered frontends need a clear pattern for **hydrate only independently interactive islands on mostly server-rendered pages.**

## Intent

Hydrate only independently interactive islands on mostly server-rendered pages.

## Visual / Memory Trigger

```text
Static HTML + Search Island + Cart Island
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for content-heavy apps with selective interactivity.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Static HTML + Search Island + Cart Island
```

## Interview Trap

An island is not automatically an independently deployable MFE.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Islands Architecture:** Hydrate only independently interactive islands on mostly server-rendered pages.


---

<!-- 18_WIDGET_COMPOSITION.md -->

# Widget Composition

## Problem

Large independently delivered frontends need a clear pattern for **compose multiple independently owned widgets on one page.**

## Intent

Compose multiple independently owned widgets on one page.

## Visual / Memory Trigger

```text
Dashboard → Sales / Alerts / Recommendations widgets
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use only when widgets genuinely require independent ownership/deployment.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Dashboard → Sales / Alerts / Recommendations widgets
```

## Interview Trap

Increases state/layout/integration complexity.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Widget Composition:** Compose multiple independently owned widgets on one page.


---

<!-- 19_ROUTE_COMPOSITION.md -->

# Route Composition

## Problem

Large independently delivered frontends need a clear pattern for **only one major mfe owns each top-level route.**

## Intent

Only one major MFE owns each top-level route.

## Visual / Memory Trigger

```text
Route → one primary MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Strong default for autonomy and simple state.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Route → one primary MFE
```

## Interview Trap

Avoid hidden cross-route mutable state.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Route Composition:** Only one major MFE owns each top-level route.


---

<!-- 20_LAYOUT_SLOT_COMPOSITION.md -->

# Layout Slot Composition

## Problem

Large independently delivered frontends need a clear pattern for **shell exposes stable slots that mfes fill.**

## Intent

Shell exposes stable slots that MFEs fill.

## Visual / Memory Trigger

```text
Header slot / main slot / side slot
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when page-level composition needs explicit placement.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Header slot / main slot / side slot
```

## Interview Trap

Too many tiny slots create layout coupling.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Layout Slot Composition:** Shell exposes stable slots that MFEs fill.


---

<!-- 21_PLUGIN_ARCHITECTURE.md -->

# Plugin Architecture

## Problem

Large independently delivered frontends need a clear pattern for **allow features to register at runtime against a stable host api.**

## Intent

Allow features to register at runtime against a stable host API.

## Visual / Memory Trigger

```text
Host → Plugin Registry → Plugins
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for extensible enterprise platforms/admin products.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Host → Plugin Registry → Plugins
```

## Interview Trap

Plugin API becomes a long-lived public contract.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Plugin Architecture:** Allow features to register at runtime against a stable host API.


---

<!-- 22_MODULE_FEDERATION.md -->

# Module Federation

## Problem

Large independently delivered frontends need a clear pattern for **load modules exposed by separately built applications at runtime.**

## Intent

Load modules exposed by separately built applications at runtime.

## Visual / Memory Trigger

```text
Host → Remote Container → Exposed Module
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime code sharing and independent deployments.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Host → Remote Container → Exposed Module
```

## Interview Trap

It is an implementation mechanism, not the architecture itself.

## Related Patterns

Host / Remote, Shared Singleton Dependency, Runtime Manifest / Remote Registry

## 20-Second Recall

> **Module Federation:** Load modules exposed by separately built applications at runtime.


---

<!-- 23_HOST_REMOTE.md -->

# Host / Remote

## Problem

Large independently delivered frontends need a clear pattern for **model consumer as host and provider as remote.**

## Intent

Model consumer as Host and provider as Remote.

## Visual / Memory Trigger

```text
Host → remoteEntry → exposed module
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use with Module Federation-style runtime integration.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Host → remoteEntry → exposed module
```

## Interview Trap

Remote availability becomes a runtime dependency.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Host / Remote:** Model consumer as Host and provider as Remote.


---

<!-- 24_SHARED_SINGLETON_DEPENDENCY.md -->

# Shared Singleton Dependency

## Problem

Large independently delivered frontends need a clear pattern for **reuse one compatible runtime instance for heavy/core libraries.**

## Intent

Reuse one compatible runtime instance for heavy/core libraries.

## Visual / Memory Trigger

```text
Host + Remotes share React/Angular/router runtime
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when duplicate runtimes are expensive or invalid.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Host + Remotes share React/Angular/router runtime
```

## Interview Trap

Sharing increases version coupling.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared Singleton Dependency:** Reuse one compatible runtime instance for heavy/core libraries.


---

<!-- 25_IMPORT_MAP.md -->

# Import Map

## Problem

Large independently delivered frontends need a clear pattern for **map logical module names to deployable urls at runtime.**

## Intent

Map logical module names to deployable URLs at runtime.

## Visual / Memory Trigger

```text
@company/cart → https://cdn/cart/v42.js
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime indirection, local overrides, promotion and rollback.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
@company/cart → https://cdn/cart/v42.js
```

## Interview Trap

Import Maps resolve modules; they do not orchestrate lifecycle.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Import Map:** Map logical module names to deployable URLs at runtime.


---

<!-- 26_SINGLE_SPA_ORCHESTRATION.md -->

# single-spa Orchestration

## Problem

Large independently delivered frontends need a clear pattern for **mount/unmount applications according to route/activity rules.**

## Intent

Mount/unmount applications according to route/activity rules.

## Visual / Memory Trigger

```text
Root Config → React MFE / Angular MFE / Vue MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when application lifecycle/orchestration is the key problem.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Root Config → React MFE / Angular MFE / Vue MFE
```

## Interview Trap

State, auth and CSS governance are still separate concerns.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **single-spa Orchestration:** Mount/unmount applications according to route/activity rules.


---

<!-- 27_WEB_COMPONENT_WRAPPER.md -->

# Web Component Wrapper

## Problem

Large independently delivered frontends need a clear pattern for **expose a framework-specific capability through a browser-standard custom element.**

## Intent

Expose a framework-specific capability through a browser-standard custom element.

## Visual / Memory Trigger

```text
<customer-summary customer-id='123'>
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for cross-framework reusable widgets.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
<customer-summary customer-id='123'>
```

## Interview Trap

Keep public DOM API small and stable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Web Component Wrapper:** Expose a framework-specific capability through a browser-standard custom element.


---

<!-- 28_IFRAME_ISOLATION.md -->

# Iframe Isolation

## Problem

Large independently delivered frontends need a clear pattern for **use a separate document/origin for strong runtime and security isolation.**

## Intent

Use a separate document/origin for strong runtime and security isolation.

## Visual / Memory Trigger

```text
Host page ↔ iframe via postMessage
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for third-party, legacy, or high-security embedded apps.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Host page ↔ iframe via postMessage
```

## Interview Trap

Costs include routing, layout, accessibility and communication.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Iframe Isolation:** Use a separate document/origin for strong runtime and security isolation.


---

<!-- 29_PACKAGE_BASED_INTEGRATION.md -->

# Package-Based Integration

## Problem

Large independently delivered frontends need a clear pattern for **publish a frontend module as a versioned package.**

## Intent

Publish a frontend module as a versioned package.

## Visual / Memory Trigger

```text
MFE package → npm registry → host build
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when build-time composition is sufficient.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
MFE package → npm registry → host build
```

## Interview Trap

Independent runtime release is lost.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Package-Based Integration:** Publish a frontend module as a versioned package.


---

<!-- 30_RUNTIME_MANIFEST_REMOTE_REGISTRY.md -->

# Runtime Manifest / Remote Registry

## Problem

Large independently delivered frontends need a clear pattern for **externalize remote version/url mapping.**

## Intent

Externalize remote version/URL mapping.

## Visual / Memory Trigger

```text
manifest.json → catalog:v42, cart:v17
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for canary, rollback and environment promotion without shell rebuild.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
manifest.json → catalog:v42, cart:v17
```

## Interview Trap

Manifest availability/integrity becomes critical.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Manifest / Remote Registry:** Externalize remote version/URL mapping.


---

<!-- 31_REMOTE_ADAPTER_FACADE.md -->

# Remote Adapter / Facade

## Problem

Large independently delivered frontends need a clear pattern for **hide runtime integration details behind a local stable interface.**

## Intent

Hide runtime integration details behind a local stable interface.

## Visual / Memory Trigger

```text
Shell → CatalogAdapter → Remote MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to isolate host from federation/import-map specifics.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell → CatalogAdapter → Remote MFE
```

## Interview Trap

Do not let adapter accumulate business logic.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Adapter / Facade:** Hide runtime integration details behind a local stable interface.


---

<!-- 32_SHELL_OWNED_TOP_LEVEL_ROUTING.md -->

# Shell-Owned Top-Level Routing

## Problem

Large independently delivered frontends need a clear pattern for **shell owns top-level route prefixes; mfes own internals.**

## Intent

Shell owns top-level route prefixes; MFEs own internals.

## Visual / Memory Trigger

```text
/account/* → Account MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for predictable global navigation.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/account/* → Account MFE
```

## Interview Trap

Avoid multiple routers competing for browser history.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shell-Owned Top-Level Routing:** Shell owns top-level route prefixes; MFEs own internals.


---

<!-- 33_MFE_OWNED_NESTED_ROUTING.md -->

# MFE-Owned Nested Routing

## Problem

Large independently delivered frontends need a clear pattern for **an mfe manages routes beneath its assigned prefix.**

## Intent

An MFE manages routes beneath its assigned prefix.

## Visual / Memory Trigger

```text
/account/profile, /account/security
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to preserve autonomy inside a domain.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/account/profile, /account/security
```

## Interview Trap

Shell should not know internal route details.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **MFE-Owned Nested Routing:** An MFE manages routes beneath its assigned prefix.


---

<!-- 34_URL_AS_CONTRACT.md -->

# URL-as-Contract

## Problem

Large independently delivered frontends need a clear pattern for **treat routes as stable contracts between independently deployed frontends.**

## Intent

Treat routes as stable contracts between independently deployed frontends.

## Visual / Memory Trigger

```text
/product/:id
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for bookmarkable, decoupled integration.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/product/:id
```

## Interview Trap

Breaking route changes require compatibility planning.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **URL-as-Contract:** Treat routes as stable contracts between independently deployed frontends.


---

<!-- 35_URL_AS_STATE.md -->

# URL-as-State

## Problem

Large independently delivered frontends need a clear pattern for **put shareable navigation/filter state into url.**

## Intent

Put shareable navigation/filter state into URL.

## Visual / Memory Trigger

```text
/search?q=laptop&page=2
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for declarative cross-MFE state.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
/search?q=laptop&page=2
```

## Interview Trap

Do not put sensitive or huge state into URLs.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **URL-as-State:** Put shareable navigation/filter state into URL.


---

<!-- 36_ROUTE_DELEGATION.md -->

# Route Delegation

## Problem

Large independently delivered frontends need a clear pattern for **delegate a path subtree from shell to mfe.**

## Intent

Delegate a path subtree from shell to MFE.

## Visual / Memory Trigger

```text
Shell owns /account/*; Account owns remainder.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for clean ownership.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell owns /account/*; Account owns remainder.
```

## Interview Trap

Prefix conflicts must be governed.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Route Delegation:** Delegate a path subtree from shell to MFE.


---

<!-- 37_DEEP_LINK_PRESERVATION.md -->

# Deep-Link Preservation

## Problem

Large independently delivered frontends need a clear pattern for **ensure every owned route works on direct load/refresh.**

## Intent

Ensure every owned route works on direct load/refresh.

## Visual / Memory Trigger

```text
Direct navigation to /orders/123 must bootstrap correctly.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for production-ready routing.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Direct navigation to /orders/123 must bootstrap correctly.
```

## Interview Trap

Do not depend on transient in-memory state to open a route.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Deep-Link Preservation:** Ensure every owned route works on direct load/refresh.


---

<!-- 38_NAVIGATION_EVENT.md -->

# Navigation Event

## Problem

Large independently delivered frontends need a clear pattern for **emit navigation intent through a stable callback/event but make url the final source of truth.**

## Intent

Emit navigation intent through a stable callback/event but make URL the final source of truth.

## Visual / Memory Trigger

```text
MFE emits navigate('/cart')
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when integrated code cannot directly access router.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
MFE emits navigate('/cart')
```

## Interview Trap

Avoid multiple competing navigation authorities.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Navigation Event:** Emit navigation intent through a stable callback/event but make URL the final source of truth.


---

<!-- 39_LOCAL_STATE_FIRST.md -->

# Local State First

## Problem

Large independently delivered frontends need a clear pattern for **each mfe owns its own ui and domain state.**

## Intent

Each MFE owns its own UI and domain state.

## Visual / Memory Trigger

```text
Catalog Store / Cart Store / Account Store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Default pattern for autonomy.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog Store / Cart Store / Account Store
```

## Interview Trap

Frequent cross-MFE state exchange signals poor boundaries.

## Related Patterns

URL-Mediated Communication, Shared Context, Backend-Mediated State

## 20-Second Recall

> **Local State First:** Each MFE owns its own UI and domain state.


---

<!-- 40_URL_MEDIATED_COMMUNICATION.md -->

# URL-Mediated Communication

## Problem

Large independently delivered frontends need a clear pattern for **communicate intent through route/path/query state.**

## Intent

Communicate intent through route/path/query state.

## Visual / Memory Trigger

```text
Catalog → /product/123 → Product MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for navigation and shareable state.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog → /product/123 → Product MFE
```

## Interview Trap

Keep route contracts versioned.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **URL-Mediated Communication:** Communicate intent through route/path/query state.


---

<!-- 41_EVENT_BUS.md -->

# Event Bus

## Problem

Large independently delivered frontends need a clear pattern for **publish messages without direct references between mfes.**

## Intent

Publish messages without direct references between MFEs.

## Visual / Memory Trigger

```text
MFE A → Event Bus → MFE B
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use sparingly for loosely coupled signals.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
MFE A → Event Bus → MFE B
```

## Interview Trap

Can become invisible coupling/event soup.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Event Bus:** Publish messages without direct references between MFEs.


---

<!-- 42_DOM_CUSTOM_EVENT.md -->

# DOM Custom Event

## Problem

Large independently delivered frontends need a clear pattern for **use browser customevent for lightweight cross-app signals.**

## Intent

Use browser CustomEvent for lightweight cross-app signals.

## Visual / Memory Trigger

```text
window.dispatchEvent(new CustomEvent(...))
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for framework-neutral same-page events.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
window.dispatchEvent(new CustomEvent(...))
```

## Interview Trap

Namespace and document event contracts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **DOM Custom Event:** Use browser CustomEvent for lightweight cross-app signals.


---

<!-- 43_PUB_SUB_UTILITY.md -->

# Pub/Sub Utility

## Problem

Large independently delivered frontends need a clear pattern for **use a tiny platform utility for publish/subscribe.**

## Intent

Use a tiny platform utility for publish/subscribe.

## Visual / Memory Trigger

```text
publish(topic,payload) / subscribe(topic,handler)
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when event semantics are clear.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
publish(topic,payload) / subscribe(topic,handler)
```

## Interview Trap

Do not turn it into a hidden global store.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Pub/Sub Utility:** Use a tiny platform utility for publish/subscribe.


---

<!-- 44_CALLBACK_CONTRACT_PROPS.md -->

# Callback / Contract Props

## Problem

Large independently delivered frontends need a clear pattern for **parent passes explicit data/callbacks to child mfe/widget.**

## Intent

Parent passes explicit data/callbacks to child MFE/widget.

## Visual / Memory Trigger

```text
mount({user, onCheckout})
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for parent-child composition.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
mount({user, onCheckout})
```

## Interview Trap

Keep prop contract small and versionable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Callback / Contract Props:** Parent passes explicit data/callbacks to child MFE/widget.


---

<!-- 45_SHARED_CONTEXT.md -->

# Shared Context

## Problem

Large independently delivered frontends need a clear pattern for **share only stable application-wide concepts.**

## Intent

Share only stable application-wide concepts.

## Visual / Memory Trigger

```text
identity / locale / theme / entitlements
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for cross-cutting context.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
identity / locale / theme / entitlements
```

## Interview Trap

Do not store mutable business-domain state here.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared Context:** Share only stable application-wide concepts.


---

<!-- 46_CONTROLLED_SHARED_STORE.md -->

# Controlled Shared Store

## Problem

Large independently delivered frontends need a clear pattern for **use one store only for a truly global bounded domain.**

## Intent

Use one store only for a truly global bounded domain.

## Visual / Memory Trigger

```text
Small global auth/theme store
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use rarely.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Small global auth/theme store
```

## Interview Trap

One giant Redux store defeats autonomy.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Controlled Shared Store:** Use one store only for a truly global bounded domain.


---

<!-- 47_BACKEND_MEDIATED_STATE.md -->

# Backend-Mediated State

## Problem

Large independently delivered frontends need a clear pattern for **use backend as the source of truth between mfes.**

## Intent

Use backend as the source of truth between MFEs.

## Visual / Memory Trigger

```text
MFE A writes API; MFE B queries/subscribes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for business state shared across frontends.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
MFE A writes API; MFE B queries/subscribes
```

## Interview Trap

Accept backend/network latency and eventual consistency where applicable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Backend-Mediated State:** Use backend as the source of truth between MFEs.


---

<!-- 48_STATE_SYNCHRONIZATION_ANTI_PATTERN.md -->

# State Synchronization Anti-Pattern

## Problem

Large independently delivered frontends need a clear pattern for **multiple mfes continuously mirror mutable state.**

## Intent

Multiple MFEs continuously mirror mutable state.

## Visual / Memory Trigger

```text
Store A ↔ Store B ↔ Store C
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Avoid.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Store A ↔ Store B ↔ Store C
```

## Interview Trap

Usually fix by merging boundary or moving truth to URL/backend.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **State Synchronization Anti-Pattern:** Multiple MFEs continuously mirror mutable state.


---

<!-- 49_CROSS_MFE_CONTRACT_VERSIONING.md -->

# Cross-MFE Contract Versioning

## Problem

Large independently delivered frontends need a clear pattern for **version events, exposed modules, props and route contracts.**

## Intent

Version events, exposed modules, props and route contracts.

## Visual / Memory Trigger

```text
v1 + additive evolution + compatibility window
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for independent deployments.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
v1 + additive evolution + compatibility window
```

## Interview Trap

Breaking runtime contracts cause production-only failures.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Cross-MFE Contract Versioning:** Version events, exposed modules, props and route contracts.


---

<!-- 50_DESIGN_SYSTEM.md -->

# Design System

## Problem

Large independently delivered frontends need a clear pattern for **share visual and interaction standards across mfes.**

## Intent

Share visual and interaction standards across MFEs.

## Visual / Memory Trigger

```text
Tokens → Components → MFEs
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for coherent UX across independent teams.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Tokens → Components → MFEs
```

## Interview Trap

Do not embed domain business logic.

## Related Patterns

Design Tokens, Shared Dumb Components, Accessibility Contract

## 20-Second Recall

> **Design System:** Share visual and interaction standards across MFEs.


---

<!-- 51_DESIGN_TOKENS.md -->

# Design Tokens

## Problem

Large independently delivered frontends need a clear pattern for **share cross-framework visual primitives.**

## Intent

Share cross-framework visual primitives.

## Visual / Memory Trigger

```text
color / spacing / typography / radius
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as the lowest-coupling consistency layer.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
color / spacing / typography / radius
```

## Interview Trap

Tokens are contracts; change them carefully.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Design Tokens:** Share cross-framework visual primitives.


---

<!-- 52_SHARED_DUMB_COMPONENTS.md -->

# Shared Dumb Components

## Problem

Large independently delivered frontends need a clear pattern for **share presentation-focused reusable components.**

## Intent

Share presentation-focused reusable components.

## Visual / Memory Trigger

```text
Button / Input / Modal / primitive Table
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use after stable reusable patterns emerge.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Button / Input / Modal / primitive Table
```

## Interview Trap

Avoid domain-specific shared components.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shared Dumb Components:** Share presentation-focused reusable components.


---

<!-- 53_SHADOW_DOM_ISOLATION.md -->

# Shadow DOM Isolation

## Problem

Large independently delivered frontends need a clear pattern for **use shadow dom for stronger style/dom encapsulation.**

## Intent

Use Shadow DOM for stronger style/DOM encapsulation.

## Visual / Memory Trigger

```text
Web Component → Shadow Root
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when style isolation is critical.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Web Component → Shadow Root
```

## Interview Trap

Theming and accessibility integration need planning.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shadow DOM Isolation:** Use Shadow DOM for stronger style/DOM encapsulation.


---

<!-- 54_SCOPED_CSS.md -->

# Scoped CSS

## Problem

Large independently delivered frontends need a clear pattern for **use css modules/scoped styles to prevent leakage.**

## Intent

Use CSS Modules/scoped styles to prevent leakage.

## Visual / Memory Trigger

```text
local class name generation
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as a pragmatic default.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
local class name generation
```

## Interview Trap

Global selectors can still break boundaries.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Scoped CSS:** Use CSS Modules/scoped styles to prevent leakage.


---

<!-- 55_MINIMAL_GLOBAL_CSS.md -->

# Minimal Global CSS

## Problem

Large independently delivered frontends need a clear pattern for **keep global stylesheet tiny and platform-owned.**

## Intent

Keep global stylesheet tiny and platform-owned.

## Visual / Memory Trigger

```text
reset + tokens only
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to reduce cross-team breakage.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
reset + tokens only
```

## Interview Trap

Do not allow arbitrary global selectors from MFEs.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Minimal Global CSS:** Keep global stylesheet tiny and platform-owned.


---

<!-- 56_THEME_CONTRACT.md -->

# Theme Contract

## Problem

Large independently delivered frontends need a clear pattern for **expose stable theme variables/context from platform.**

## Intent

Expose stable theme variables/context from platform.

## Visual / Memory Trigger

```text
Shell theme → MFE tokens
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for coherent theming.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Shell theme → MFE tokens
```

## Interview Trap

Avoid each MFE redefining global semantics.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Theme Contract:** Expose stable theme variables/context from platform.


---

<!-- 57_ACCESSIBILITY_CONTRACT.md -->

# Accessibility Contract

## Problem

Large independently delivered frontends need a clear pattern for **share rules for focus, headings, keyboard and aria.**

## Intent

Share rules for focus, headings, keyboard and ARIA.

## Visual / Memory Trigger

```text
route transition → focus management
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use because user experience spans all MFEs.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
route transition → focus management
```

## Interview Trap

Independent delivery does not mean independent accessibility.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Accessibility Contract:** Share rules for focus, headings, keyboard and ARIA.


---

<!-- 58_I18N_CONTRACT.md -->

# i18n Contract

## Problem

Large independently delivered frontends need a clear pattern for **shell owns locale; mfes own domain translations.**

## Intent

Shell owns locale; MFEs own domain translations.

## Visual / Memory Trigger

```text
Locale context → domain bundles
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for consistent language/formatting.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Locale context → domain bundles
```

## Interview Trap

Avoid duplicate locale negotiation.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **i18n Contract:** Shell owns locale; MFEs own domain translations.


---

<!-- 59_SEO_METADATA_OWNERSHIP.md -->

# SEO Metadata Ownership

## Problem

Large independently delivered frontends need a clear pattern for **assign ownership of title/meta/canonical/structured data.**

## Intent

Assign ownership of title/meta/canonical/structured data.

## Visual / Memory Trigger

```text
Route MFE owns page metadata via shell contract
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for public content/e-commerce.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Route MFE owns page metadata via shell contract
```

## Interview Trap

Multiple writers create race conditions.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **SEO Metadata Ownership:** Assign ownership of title/meta/canonical/structured data.


---

<!-- 60_INDEPENDENT_VERSIONING.md -->

# Independent Versioning

## Problem

Large independently delivered frontends need a clear pattern for **each mfe releases its own version.**

## Intent

Each MFE releases its own version.

## Visual / Memory Trigger

```text
Catalog v42 / Cart v17 / Account v11
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for true release autonomy.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog v42 / Cart v17 / Account v11
```

## Interview Trap

Version visibility must be observable.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Independent Versioning:** Each MFE releases its own version.


---

<!-- 61_SEMANTIC_COMPATIBILITY.md -->

# Semantic Compatibility

## Problem

Large independently delivered frontends need a clear pattern for **govern public interface changes with explicit compatibility rules.**

## Intent

Govern public interface changes with explicit compatibility rules.

## Visual / Memory Trigger

```text
additive change > breaking change
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for stable contracts.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
additive change > breaking change
```

## Interview Trap

SemVer alone does not guarantee runtime compatibility.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Semantic Compatibility:** Govern public interface changes with explicit compatibility rules.


---

<!-- 62_RUNTIME_COMPATIBILITY_WINDOW.md -->

# Runtime Compatibility Window

## Problem

Large independently delivered frontends need a clear pattern for **design old shell/new remote and new shell/old remote overlap.**

## Intent

Design old shell/new remote and new shell/old remote overlap.

## Visual / Memory Trigger

```text
N and N-1 compatibility
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use in runtime composition.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
N and N-1 compatibility
```

## Interview Trap

Zero-overlap versions force coordinated deploys.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Compatibility Window:** Design old shell/new remote and new shell/old remote overlap.


---

<!-- 63_DEPENDENCY_SHARING.md -->

# Dependency Sharing

## Problem

Large independently delivered frontends need a clear pattern for **share heavy runtimes deliberately.**

## Intent

Share heavy runtimes deliberately.

## Visual / Memory Trigger

```text
React/router singleton
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when performance/runtime constraints justify.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
React/router singleton
```

## Interview Trap

Creates version coupling.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Dependency Sharing:** Share heavy runtimes deliberately.


---

<!-- 64_DEPENDENCY_DUPLICATION.md -->

# Dependency Duplication

## Problem

Large independently delivered frontends need a clear pattern for **allow small library duplication to preserve autonomy.**

## Intent

Allow small library duplication to preserve autonomy.

## Visual / Memory Trigger

```text
tiny utility duplicated per MFE
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when coupling cost exceeds bytes saved.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
tiny utility duplicated per MFE
```

## Interview Trap

Optimize total user experience, not ideological DRY.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Dependency Duplication:** Allow small library duplication to preserve autonomy.


---

<!-- 65_VERSION_PINNING.md -->

# Version Pinning

## Problem

Large independently delivered frontends need a clear pattern for **pin known-good remote/shared versions.**

## Intent

Pin known-good remote/shared versions.

## Visual / Memory Trigger

```text
manifest points to exact immutable version
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for reproducibility and rollback.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
manifest points to exact immutable version
```

## Interview Trap

Floating latest is risky.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Version Pinning:** Pin known-good remote/shared versions.


---

<!-- 66_CANARY_REMOTE.md -->

# Canary Remote

## Problem

Large independently delivered frontends need a clear pattern for **expose new remote version to a small cohort first.**

## Intent

Expose new remote version to a small cohort first.

## Visual / Memory Trigger

```text
5% users → v43, rest → v42
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for risk-controlled rollout.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
5% users → v43, rest → v42
```

## Interview Trap

Need version-aware telemetry.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Canary Remote:** Expose new remote version to a small cohort first.


---

<!-- 67_BACKWARD_COMPATIBLE_PUBLIC_INTERFACE.md -->

# Backward-Compatible Public Interface

## Problem

Large independently delivered frontends need a clear pattern for **expose minimal stable lifecycle and data contracts.**

## Intent

Expose minimal stable lifecycle and data contracts.

## Visual / Memory Trigger

```text
mount/unmount/props/events/routes
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime autonomy.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
mount/unmount/props/events/routes
```

## Interview Trap

Never expose internal store structures as contract.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Backward-Compatible Public Interface:** Expose minimal stable lifecycle and data contracts.


---

<!-- 68_ERROR_BOUNDARY_PER_MFE.md -->

# Error Boundary per MFE

## Problem

Large independently delivered frontends need a clear pattern for **contain runtime failures within one independently loaded area.**

## Intent

Contain runtime failures within one independently loaded area.

## Visual / Memory Trigger

```text
Catalog fails → fallback; shell/cart remain
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use around every runtime boundary.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog fails → fallback; shell/cart remain
```

## Interview Trap

Error boundary must emit useful telemetry.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Error Boundary per MFE:** Contain runtime failures within one independently loaded area.


---

<!-- 69_REMOTE_LOAD_FALLBACK.md -->

# Remote Load Fallback

## Problem

Large independently delivered frontends need a clear pattern for **show degraded ui when remote asset cannot load.**

## Intent

Show degraded UI when remote asset cannot load.

## Visual / Memory Trigger

```text
timeout/failure → fallback + telemetry
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime composition.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
timeout/failure → fallback + telemetry
```

## Interview Trap

Do not retry endlessly.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Load Fallback:** Show degraded UI when remote asset cannot load.


---

<!-- 70_GRACEFUL_DEGRADATION.md -->

# Graceful Degradation

## Problem

Large independently delivered frontends need a clear pattern for **preserve core journey when optional features fail.**

## Intent

Preserve core journey when optional features fail.

## Visual / Memory Trigger

```text
Checkout works; recommendations unavailable
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for optional MFEs/widgets.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Checkout works; recommendations unavailable
```

## Interview Trap

Never degrade silently when correctness is affected.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Graceful Degradation:** Preserve core journey when optional features fail.


---

<!-- 71_REMOTE_LOAD_CIRCUIT_BREAKER.md -->

# Remote Load Circuit Breaker

## Problem

Large independently delivered frontends need a clear pattern for **temporarily stop loading a repeatedly failing remote.**

## Intent

Temporarily stop loading a repeatedly failing remote.

## Visual / Memory Trigger

```text
closed → open → probe
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use in highly dynamic remote ecosystems.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
closed → open → probe
```

## Interview Trap

Often unnecessary for simple static deployments.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Load Circuit Breaker:** Temporarily stop loading a repeatedly failing remote.


---

<!-- 72_REMOTE_LOAD_TIMEOUT.md -->

# Remote Load Timeout

## Problem

Large independently delivered frontends need a clear pattern for **bound remote bootstrap/mount wait time.**

## Intent

Bound remote bootstrap/mount wait time.

## Visual / Memory Trigger

```text
load remote ≤ X ms else fallback
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to protect UX.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
load remote ≤ X ms else fallback
```

## Interview Trap

Timeout value must fit page performance budget.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Remote Load Timeout:** Bound remote bootstrap/mount wait time.


---

<!-- 73_CDN_IMMUTABLE_ASSETS.md -->

# CDN + Immutable Assets

## Problem

Large independently delivered frontends need a clear pattern for **publish content-addressed/versioned assets and never overwrite them.**

## Intent

Publish content-addressed/versioned assets and never overwrite them.

## Visual / Memory Trigger

```text
catalog.v42.abcd.js
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for caching and reliable rollback.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
catalog.v42.abcd.js
```

## Interview Trap

Mutable URLs create cache/version ambiguity.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **CDN + Immutable Assets:** Publish content-addressed/versioned assets and never overwrite them.


---

<!-- 74_LAZY_LOADING.md -->

# Lazy Loading

## Problem

Large independently delivered frontends need a clear pattern for **load mfe only when route/widget is needed.**

## Intent

Load MFE only when route/widget is needed.

## Visual / Memory Trigger

```text
shell first → route MFE on demand
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to reduce initial JS.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
shell first → route MFE on demand
```

## Interview Trap

Too much lazy loading creates waterfalls.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Lazy Loading:** Load MFE only when route/widget is needed.


---

<!-- 75_PREFETCH_PRELOAD.md -->

# Prefetch / Preload

## Problem

Large independently delivered frontends need a clear pattern for **fetch likely-next mfe before navigation.**

## Intent

Fetch likely-next MFE before navigation.

## Visual / Memory Trigger

```text
hover/route prediction → prefetch
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when behavior is predictable.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
hover/route prediction → prefetch
```

## Interview Trap

Can waste bandwidth.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Prefetch / Preload:** Fetch likely-next MFE before navigation.


---

<!-- 76_PERFORMANCE_BUDGET_PER_MFE.md -->

# Performance Budget per MFE

## Problem

Large independently delivered frontends need a clear pattern for **give each mfe explicit js/css/request/web vitals budget.**

## Intent

Give each MFE explicit JS/CSS/request/Web Vitals budget.

## Visual / Memory Trigger

```text
Catalog ≤ 180KB JS etc.
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for decentralized performance governance.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog ≤ 180KB JS etc.
```

## Interview Trap

Total page budget still wins.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Performance Budget per MFE:** Give each MFE explicit JS/CSS/request/Web Vitals budget.


---

<!-- 77_CSP_ALLOWLIST.md -->

# CSP Allowlist

## Problem

Large independently delivered frontends need a clear pattern for **restrict dynamic scripts/remotes to trusted origins.**

## Intent

Restrict dynamic scripts/remotes to trusted origins.

## Visual / Memory Trigger

```text
script-src trusted-cdn.example.com
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for runtime-loaded MFEs.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
script-src trusted-cdn.example.com
```

## Interview Trap

Overly broad CSP defeats protection.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **CSP Allowlist:** Restrict dynamic scripts/remotes to trusted origins.


---

<!-- 78_TRUSTED_REMOTE_ORIGIN.md -->

# Trusted Remote Origin

## Problem

Large independently delivered frontends need a clear pattern for **allow runtime code only from governed deployment/cdn origins.**

## Intent

Allow runtime code only from governed deployment/CDN origins.

## Visual / Memory Trigger

```text
HTTPS + protected CI + immutable artifact
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for supply-chain control.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
HTTPS + protected CI + immutable artifact
```

## Interview Trap

Same-page MFE is usually same security context.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Trusted Remote Origin:** Allow runtime code only from governed deployment/CDN origins.


---

<!-- 79_IFRAME_SECURITY_BOUNDARY.md -->

# Iframe Security Boundary

## Problem

Large independently delivered frontends need a clear pattern for **use origin/document isolation for untrusted/high-risk frontend code.**

## Intent

Use origin/document isolation for untrusted/high-risk frontend code.

## Visual / Memory Trigger

```text
sandboxed iframe + postMessage contract
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use when organizational/runtime boundary is insufficient for security.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
sandboxed iframe + postMessage contract
```

## Interview Trap

UX integration costs are higher.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Iframe Security Boundary:** Use origin/document isolation for untrusted/high-risk frontend code.


---

<!-- 80_SUPPLY_CHAIN_VERIFICATION.md -->

# Supply Chain Verification

## Problem

Large independently delivered frontends need a clear pattern for **protect mfe build and publishing pipeline.**

## Intent

Protect MFE build and publishing pipeline.

## Visual / Memory Trigger

```text
lockfile + SBOM + scan + provenance + protected publish
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for every independently deployable MFE.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
lockfile + SBOM + scan + provenance + protected publish
```

## Interview Trap

More MFEs means more release surface.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Supply Chain Verification:** Protect MFE build and publishing pipeline.


---

<!-- 81_INDEPENDENT_PIPELINE.md -->

# Independent Pipeline

## Problem

Large independently delivered frontends need a clear pattern for **each mfe builds/tests/publishes independently.**

## Intent

Each MFE builds/tests/publishes independently.

## Visual / Memory Trigger

```text
commit → tests → immutable asset → deploy
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for true autonomous delivery.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
commit → tests → immutable asset → deploy
```

## Interview Trap

One mega-pipeline negates independence.

## Related Patterns

Contract Testing, Canary Deployment, Rollback by Manifest

## 20-Second Recall

> **Independent Pipeline:** Each MFE builds/tests/publishes independently.


---

<!-- 82_CONTRACT_TESTING.md -->

# Contract Testing

## Problem

Large independently delivered frontends need a clear pattern for **verify shell/mfe/events/routes/public modules against stable contracts.**

## Intent

Verify shell/MFE/events/routes/public modules against stable contracts.

## Visual / Memory Trigger

```text
consumer contract → provider verification
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use before runtime deployment.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
consumer contract → provider verification
```

## Interview Trap

E2E alone is too slow/late.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Contract Testing:** Verify shell/MFE/events/routes/public modules against stable contracts.


---

<!-- 83_SHELL_MFE_INTEGRATION_TEST.md -->

# Shell-MFE Integration Test

## Problem

Large independently delivered frontends need a clear pattern for **test one changed mfe against the shell and stable dependencies.**

## Intent

Test one changed MFE against the shell and stable dependencies.

## Visual / Memory Trigger

```text
shell + changed MFE + deployed others
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for focused integration confidence.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
shell + changed MFE + deployed others
```

## Interview Trap

Do not require every repository locally.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shell-MFE Integration Test:** Test one changed MFE against the shell and stable dependencies.


---

<!-- 84_CRITICAL_JOURNEY_E2E.md -->

# Critical Journey E2E

## Problem

Large independently delivered frontends need a clear pattern for **keep a small suite for cross-mfe business journeys.**

## Intent

Keep a small suite for cross-MFE business journeys.

## Visual / Memory Trigger

```text
login / search / checkout / payment
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use as final integration safety net.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
login / search / checkout / payment
```

## Interview Trap

Avoid making E2E the primary test layer.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Critical Journey E2E:** Keep a small suite for cross-MFE business journeys.


---

<!-- 85_VISUAL_REGRESSION.md -->

# Visual Regression

## Problem

Large independently delivered frontends need a clear pattern for **detect ui breakage across independently owned slices.**

## Intent

Detect UI breakage across independently owned slices.

## Visual / Memory Trigger

```text
component + integrated page screenshots
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for design-system/global-layout risk.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
component + integrated page screenshots
```

## Interview Trap

Tune thresholds to avoid noise.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Visual Regression:** Detect UI breakage across independently owned slices.


---

<!-- 86_CONSUMER_DRIVEN_UI_CONTRACT.md -->

# Consumer-Driven UI Contract

## Problem

Large independently delivered frontends need a clear pattern for **let consumers specify required remote interface behavior.**

## Intent

Let consumers specify required remote interface behavior.

## Visual / Memory Trigger

```text
consumer expectation → provider verify
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for shared modules/runtime contracts.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
consumer expectation → provider verify
```

## Interview Trap

Retire stale contracts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Consumer-Driven UI Contract:** Let consumers specify required remote interface behavior.


---

<!-- 87_RUNTIME_VERSION_TELEMETRY.md -->

# Runtime Version Telemetry

## Problem

Large independently delivered frontends need a clear pattern for **attach shell and mfe versions to errors/performance events.**

## Intent

Attach shell and MFE versions to errors/performance events.

## Visual / Memory Trigger

```text
shellVersion / mfeName / mfeVersion / remoteURL
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for production debugging.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
shellVersion / mfeName / mfeVersion / remoteURL
```

## Interview Trap

Without version context runtime incidents are hard to reproduce.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Runtime Version Telemetry:** Attach shell and MFE versions to errors/performance events.


---

<!-- 88_FRONTEND_DISTRIBUTED_TRACING.md -->

# Frontend Distributed Tracing

## Problem

Large independently delivered frontends need a clear pattern for **trace navigation, remote load, render and backend calls.**

## Intent

Trace navigation, remote load, render and backend calls.

## Visual / Memory Trigger

```text
browser → MFE → API → backend spans
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for end-to-end latency diagnosis.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
browser → MFE → API → backend spans
```

## Interview Trap

Avoid uncontrolled telemetry cardinality.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Frontend Distributed Tracing:** Trace navigation, remote load, render and backend calls.


---

<!-- 89_FEATURE_FLAG.md -->

# Feature Flag

## Problem

Large independently delivered frontends need a clear pattern for **separate deployment from user release.**

## Intent

Separate deployment from user release.

## Visual / Memory Trigger

```text
deployed code + flag
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for progressive rollout/migration.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
deployed code + flag
```

## Interview Trap

Flags need owner and removal date.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Feature Flag:** Separate deployment from user release.


---

<!-- 90_BLUE_GREEN_REMOTE.md -->

# Blue-Green Remote

## Problem

Large independently delivered frontends need a clear pattern for **keep current and new remote versions, then switch manifest pointer.**

## Intent

Keep current and new remote versions, then switch manifest pointer.

## Visual / Memory Trigger

```text
Blue v42 / Green v43
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for rapid rollback.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Blue v42 / Green v43
```

## Interview Trap

Requires immutable assets.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Blue-Green Remote:** Keep current and new remote versions, then switch manifest pointer.


---

<!-- 91_CANARY_DEPLOYMENT.md -->

# Canary Deployment

## Problem

Large independently delivered frontends need a clear pattern for **route small cohort to new mfe version.**

## Intent

Route small cohort to new MFE version.

## Visual / Memory Trigger

```text
1% → 5% → 25% → 100%
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for risk-controlled production rollout.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
1% → 5% → 25% → 100%
```

## Interview Trap

Gate on UX and business metrics.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Canary Deployment:** Route small cohort to new MFE version.


---

<!-- 92_SHADOW_DARK_LAUNCH.md -->

# Shadow / Dark Launch

## Problem

Large independently delivered frontends need a clear pattern for **execute/load new path without exposing it as the active ui.**

## Intent

Execute/load new path without exposing it as the active UI.

## Visual / Memory Trigger

```text
production data → hidden new path
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for validation.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
production data → hidden new path
```

## Interview Trap

Privacy and side effects must be controlled.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Shadow / Dark Launch:** Execute/load new path without exposing it as the active UI.


---

<!-- 93_ROLLBACK_BY_MANIFEST.md -->

# Rollback by Manifest

## Problem

Large independently delivered frontends need a clear pattern for **rollback by repointing runtime version mapping.**

## Intent

Rollback by repointing runtime version mapping.

## Visual / Memory Trigger

```text
catalog:v43 → catalog:v42
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for fast recovery.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
catalog:v43 → catalog:v42
```

## Interview Trap

Only works well with immutable retained artifacts.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Rollback by Manifest:** Rollback by repointing runtime version mapping.


---

<!-- 94_LOCAL_OVERRIDE.md -->

# Local Override

## Problem

Large independently delivered frontends need a clear pattern for **run only the mfe being developed locally.**

## Intent

Run only the MFE being developed locally.

## Visual / Memory Trigger

```text
Catalog → localhost; others → integration CDN
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for fast developer workflow.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Catalog → localhost; others → integration CDN
```

## Interview Trap

Architecture that requires all MFEs local is painful.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Local Override:** Run only the MFE being developed locally.


---

<!-- 95_ENVIRONMENT_PROMOTION.md -->

# Environment Promotion

## Problem

Large independently delivered frontends need a clear pattern for **promote the same artifact through environments.**

## Intent

Promote the same artifact through environments.

## Visual / Memory Trigger

```text
dev → UAT → prod
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for deployment confidence.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
dev → UAT → prod
```

## Interview Trap

Avoid environment-specific rebuilds.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Environment Promotion:** Promote the same artifact through environments.


---

<!-- 96_FRONTEND_PLATFORM_TEAM.md -->

# Frontend Platform Team

## Problem

Large independently delivered frontends need a clear pattern for **provide shell, templates, design system, telemetry, security baseline and tooling.**

## Intent

Provide shell, templates, design system, telemetry, security baseline and tooling.

## Visual / Memory Trigger

```text
Platform → paved road for product teams
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use at organizational scale.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
Platform → paved road for product teams
```

## Interview Trap

Platform team should not own every feature.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Frontend Platform Team:** Provide shell, templates, design system, telemetry, security baseline and tooling.


---

<!-- 97_PAVED_ROAD.md -->

# Paved Road

## Problem

Large independently delivered frontends need a clear pattern for **provide defaults that make the safe architecture the easiest path.**

## Intent

Provide defaults that make the safe architecture the easiest path.

## Visual / Memory Trigger

```text
template + CI + observability + security + deploy pattern
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to scale governance.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
template + CI + observability + security + deploy pattern
```

## Interview Trap

Do not make paved road impossible to escape when justified.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Paved Road:** Provide defaults that make the safe architecture the easiest path.


---

<!-- 98_ARCHITECTURE_GUARDRAILS.md -->

# Architecture Guardrails

## Problem

Large independently delivered frontends need a clear pattern for **standardize cross-cutting outcomes, not every implementation detail.**

## Intent

Standardize cross-cutting outcomes, not every implementation detail.

## Visual / Memory Trigger

```text
security / performance / accessibility / contracts
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use to preserve autonomy with safety.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
security / performance / accessibility / contracts
```

## Interview Trap

Over-governance recreates centralized bottlenecks.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Architecture Guardrails:** Standardize cross-cutting outcomes, not every implementation detail.


---

<!-- 99_CUSTODIAN_OWNED_DESIGN_SYSTEM.md -->

# Custodian-Owned Design System

## Problem

Large independently delivered frontends need a clear pattern for **allow broad contribution but give one team/person stewardship.**

## Intent

Allow broad contribution but give one team/person stewardship.

## Visual / Memory Trigger

```text
community contribution + custodian quality gate
```

## How It Works

1. Define a clear owner and public contract.
2. Keep internal implementation private to the owning MFE/team.
3. Integrate through the smallest stable surface possible.
4. Add telemetry and failure behavior at the boundary.
5. Evolve contracts compatibly when independently deployed consumers exist.

## When to Use

Use for coherent shared UI.

## Avoid / Use Carefully

Avoid when the same result can be achieved more simply inside one modular frontend or one owning MFE.

## Trade-offs

```text
More autonomy  ↔  More distributed frontend complexity
More runtime independence  ↔  More compatibility/observability work
More isolation  ↔  More duplication/integration overhead
```

## Example

```text
community contribution + custodian quality gate
```

## Interview Trap

Everyone owns it often means nobody owns it.

## Related Patterns

Thin Shell, Route Composition, Local State First, Contract Testing

## 20-Second Recall

> **Custodian-Owned Design System:** Allow broad contribution but give one team/person stewardship.
