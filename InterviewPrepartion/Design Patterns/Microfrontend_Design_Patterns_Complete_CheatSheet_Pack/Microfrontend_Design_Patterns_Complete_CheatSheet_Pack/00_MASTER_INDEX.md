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
