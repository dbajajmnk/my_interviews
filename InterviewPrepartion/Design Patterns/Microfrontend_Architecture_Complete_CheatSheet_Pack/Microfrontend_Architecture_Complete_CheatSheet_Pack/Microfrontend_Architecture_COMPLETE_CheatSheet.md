# Microfrontend Architecture — Complete Cheat Sheet

> Fast technical revision companion for frontend architecture, interviews, modernization, and production engineering.



---

<!-- 00_MASTER_INDEX.md -->

# Microfrontend Architecture — Complete Cheat Sheet Pack

**Purpose:** Fast revision for frontend architecture, enterprise modernization, interviews, production engineering, platform design, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open any topic and scan:
**What → Why → Diagram → Decision → Trap**

### 10 Minutes
Read:
**What → Why → How → Visual → Code/Config → Trade-offs → Production Use → Interview Recall**

---

## Part A — Foundations

1. Microfrontend Snapshot
2. Monolithic Frontend vs Modular Frontend vs Microfrontend
3. When to Use Microfrontends
4. Business Capability / Vertical Slice Boundaries
5. Team Ownership Model
6. Shell / Container Architecture
7. Route-Based Composition
8. Component-Based Composition
9. Build-Time vs Runtime Integration
10. Client-Side vs Server-Side Composition

## Part B — Composition Technologies

11. Webpack Module Federation
12. Host / Remote / Shared Dependencies
13. Import Maps
14. single-spa
15. Web Components
16. Iframes
17. Server-Side Includes / Edge Composition
18. SSR / Streaming / Hydration
19. Multi-Framework Interoperability
20. Monorepo vs Polyrepo

## Part C — Cross-Cutting Architecture

21. Routing
22. Shared State
23. Cross-MFE Communication
24. Authentication / Authorization
25. Design System
26. Shared Libraries
27. Dependency Versioning
28. CSS Isolation
29. Error Boundaries
30. Configuration
31. Feature Flags
32. Localization / i18n
33. Accessibility
34. SEO

## Part D — Performance / Security / Reliability

35. Performance Budget
36. Dependency Duplication
37. Lazy Loading
38. Caching / CDN
39. Resilience / Partial Failure
40. Security Boundaries
41. CSP / SRI / Trusted Sources
42. Supply Chain Security
43. Observability
44. Frontend Tracing
45. Logging / Telemetry
46. Web Vitals

## Part E — Testing / Delivery

47. Unit / Component Testing
48. Contract Testing
49. Integration Testing
50. End-to-End Testing
51. Visual Regression
52. CI/CD
53. Independent Deployment
54. Versioning / Backward Compatibility
55. Local Development
56. Environment Strategy

## Part F — Migration / Governance / Interview

57. Strangler Migration
58. Frontend Platform Team
59. Governance Model
60. Anti-Patterns
61. Troubleshooting Matrix
62. Production Readiness
63. Architecture Review Checklist
64. Comparison Matrix
65. Interview Traps
66. One-Page Architecture Recall
67. Decision Tree
68. Practice Questions
69. Sources & Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# Microfrontend Architecture — 30-Second Recall

## Formula

**Microfrontend = independently owned frontend slice + explicit contract + independent delivery + isolated failure/change + shared user experience**

## Mental Model

```text
Browser
  ↓
Application Shell
  ├── Header / Navigation
  ├── Product MFE
  ├── Cart MFE
  └── Account MFE
```

## Must Remember

```text
Business-capability boundaries
Route-based splitting
Independent deployment
Runtime vs build-time composition
Module Federation
Import Maps
single-spa
Web Components
Local state first
Design system
Dependency sharing
CSS isolation
Auth context
Observability
Performance budget
Contract testing
Backward compatibility
```

## Interview Traps

- Microfrontend != tiny UI component.
- Route/business boundaries are usually better than arbitrary component splitting.
- Shared Redux/store across all MFEs creates coupling.
- Module Federation is a mechanism, not the architecture itself.
- Different frameworks are possible, but not automatically desirable.
- Independent repos do not guarantee independent deployment.
- Shared design system should not become shared business logic.


---

<!-- 02_MFE_SNAPSHOT.md -->

# Microfrontend Snapshot

## What

A frontend architecture in which a large UI is decomposed into independently developed and deployable slices aligned to business capabilities or team ownership.

## Why

Useful when:

```text
many teams
large frontend
independent release needs
domain-aligned ownership
legacy modernization
different release cadences
```

## Core Principle

```text
Organizational boundary
        ↓
Business capability
        ↓
Frontend slice
        ↓
Independent delivery
```

## Real-Life Analogy

A shopping mall:

```text
Mall Shell
 ├── Store A
 ├── Store B
 ├── Food Court
 └── Services
```

Each area operates independently but follows common mall standards.

## Trap

A fragmented UI without ownership and deployment autonomy is only a complicated frontend, not a useful microfrontend architecture.


---

<!-- 03_MONOLITH_MODULAR_MFE.md -->

# Monolithic Frontend vs Modular Frontend vs Microfrontend

| Area | Monolith | Modular Frontend | Microfrontend |
|---|---|---|---|
| Deployment | one | one | independent |
| Team ownership | shared | module-based | capability-based |
| Runtime | one app | one app | composed apps |
| Failure isolation | low | medium | higher potential |
| Complexity | low | medium | high |
| Dependency management | simple | manageable | distributed |
| Release autonomy | low | low-medium | high |

## Rule

Prefer a modular frontend until independent deployment/team autonomy creates enough value to justify runtime distribution.


---

<!-- 04_WHEN_TO_USE.md -->

# When to Use Microfrontends

## Good Signals

```text
multiple frontend teams
large product surface
independent release cadence
legacy migration
clear domain boundaries
different ownership
platform maturity
```

## Weak Signals

```text
one small team
simple CRUD portal
unclear ownership
no CI/CD
no observability
no design system
no performance governance
```

## Rule

Use microfrontends to solve **organizational scaling and independent-delivery problems**, not because the project uses React/Angular/Vue.


---

<!-- 05_VERTICAL_SLICES.md -->

# Business Capability / Vertical Slice Boundaries

## Good Boundaries

```text
Search
Checkout
Account
Billing
Admin
Orders
```

## Poor Boundaries

```text
Button MFE
Form MFE
Table MFE
HeaderCell MFE
```

## Test

Ask:

```text
Can one team own this end-to-end?
Can it release independently?
Does it have a coherent user/business purpose?
Can it minimize cross-MFE state?
```

## Preferred Split

```text
Route / Domain
     ↓
Page / Workflow
     ↓
Local components
```

## Trap

Over-fragmentation creates network, dependency, testing, and cognitive overhead.


---

<!-- 06_TEAM_OWNERSHIP.md -->

# Team Ownership Model

## Ideal

```text
Team Checkout
 ├── Checkout MFE
 ├── checkout APIs/BFF
 ├── tests
 ├── telemetry
 └── deployment
```

## Principle

```text
You build it
You operate it
You evolve its contract
```

## Shared Responsibilities

Platform team owns:

```text
shell standards
deployment platform
observability
design system
security baseline
developer tooling
```

## Trap

A central frontend team approving every MFE release defeats autonomy.


---

<!-- 07_SHELL_CONTAINER.md -->

# Shell / Container Architecture

## Role

The shell provides application-wide composition.

```text
Shell
 ├── navigation
 ├── route orchestration
 ├── authentication bootstrap
 ├── global error handling
 ├── telemetry bootstrap
 └── MFE loading
```

## Avoid

Putting domain logic into shell.

## Rule

Shell should be:

```text
thin
stable
platform-oriented
```

## Trap

A fat shell becomes the new frontend monolith.


---

<!-- 08_ROUTE_COMPOSITION.md -->

# Route-Based Composition

## Example

```text
/products/*  → Product MFE
/cart/*      → Cart MFE
/account/*   → Account MFE
/admin/*     → Admin MFE
```

## Benefits

- strong isolation
- minimal shared UI state
- clear ownership
- lazy loading
- easier independent deployment

## Best Default

For many large apps, route-level splitting is the cleanest first boundary.

## Trap

Do not create cross-route hidden state dependencies.


---

<!-- 09_COMPONENT_COMPOSITION.md -->

# Component-Based Composition

## Example

One page:

```text
Dashboard
 ├── Sales MFE
 ├── Alerts MFE
 ├── Activity MFE
 └── Recommendations MFE
```

## Benefits

Fine-grained composition.

## Costs

```text
more communication
shared layout coupling
more runtime dependencies
harder testing
harder performance control
```

## Rule

Use when component ownership truly needs independent deployment.

## Trap

Do not split purely reusable widgets into independently deployed MFEs.


---

<!-- 10_BUILD_RUNTIME_INTEGRATION.md -->

# Build-Time vs Runtime Integration

## Build-Time

```text
npm package
 ↓
host build
 ↓
single deployment artifact
```

### Benefits
- simple runtime
- easy typing
- predictable dependency graph

### Cost
- host rebuild needed

## Runtime

```text
Host
 ↓ runtime lookup
Remote bundle
```

### Benefits
- independent deployment
- late binding

### Cost
- runtime failures
- version compatibility
- observability complexity

## Rule

Choose runtime composition only when independent runtime release is genuinely required.


---

<!-- 11_CLIENT_SERVER_COMPOSITION.md -->

# Client-Side vs Server-Side Composition

## Client-Side

```text
Browser
 ↓
Shell
 ↓
loads MFEs
```

Good:
- SPA
- runtime federation
- client routing

## Server-Side

```text
Request
 ↓
Server / Edge Composer
 ↓
HTML fragments
 ↓
Browser
```

Good:
- SEO
- fast first paint
- content-heavy apps

## Hybrid

```text
SSR shell
+
hydrated independent islands
```

## Trap

Server composition does not remove client-side compatibility concerns.


---

<!-- 12_MODULE_FEDERATION.md -->

# Webpack Module Federation

## What

Allows separately built applications to expose and consume modules at runtime.

## Mental Model

```text
Host Build
   ↓
loads
Remote Container
   ↓
exposes
Component / Module
```

## Host Example Concept

```javascript
remotes: {
  catalog: "catalog@https://cdn/catalog/remoteEntry.js"
}
```

## Remote Concept

```javascript
exposes: {
  "./ProductList": "./src/ProductList"
}
```

## Why

Useful for runtime integration and independent releases.

## Trap

Module Federation is an integration technology, not the microfrontend architecture itself.


---

<!-- 13_HOST_REMOTE_SHARED.md -->

# Host / Remote / Shared Dependencies

## Concepts

```text
Host
 = consuming application

Remote
 = runtime-provided module

Shared
 = dependency reused across builds
```

## Typical Shared Dependencies

```text
react
react-dom
angular core
vue
router/runtime libraries
```

## Risks

```text
version mismatch
singleton assumptions
hidden coupling
remote unavailable
```

## Rule

Share only dependencies where duplication is costly and compatibility is well-governed.


---

<!-- 14_IMPORT_MAPS.md -->

# Import Maps

## What

Map JavaScript module specifiers to URLs at runtime.

## Example

```html
<script type="importmap">
{
  "imports": {
    "@company/cart":
      "https://cdn.example.com/cart/v42/cart.js"
  }
}
</script>
```

## Benefit

Runtime redirection without rebuilding every consumer.

## Good Uses

```text
MFE loading
shared library mapping
local development overrides
progressive deployment
```

## Trap

Import maps solve module resolution, not orchestration, ownership, or state design.


---

<!-- 15_SINGLE_SPA.md -->

# single-spa

## What

A framework-neutral orchestrator that mounts/unmounts frontend applications according to activity/routing rules.

## Model

```text
Root Config
  ├── React MFE
  ├── Angular MFE
  └── Vue MFE
```

## Concepts

```text
applications
parcels
utility modules
```

## Strong Pattern

Prefer route-oriented applications and limited cross-MFE communication.

## Trap

single-spa orchestrates applications; it does not automatically solve dependency, state, or design-system governance.


---

<!-- 16_WEB_COMPONENTS.md -->

# Web Components

## Technologies

```text
Custom Elements
Shadow DOM
Templates / Slots
```

## Example

```javascript
class UserCard extends HTMLElement {
  connectedCallback() {
    this.innerHTML = `<strong>User</strong>`;
  }
}

customElements.define("user-card", UserCard);
```

## Why

Browser-native component interoperability.

## Shadow DOM

Can isolate:

```text
DOM
styles
implementation details
```

## Good Fit

Cross-framework reusable widgets.

## Trap

Web Components do not automatically provide application orchestration, routing, data fetching, or deployment independence.


---

<!-- 17_IFRAMES.md -->

# Iframes

## Strong Isolation

```text
DOM isolation
CSS isolation
JavaScript isolation
origin security boundary
```

## Good Fits

- third-party apps
- legacy systems
- high-security isolation
- embedded tools

## Costs

- communication complexity
- UX integration
- accessibility
- routing
- height/layout
- performance

## Trap

Iframes are not inherently bad; they are a strong isolation tool with integration costs.


---

<!-- 18_EDGE_COMPOSITION.md -->

# Server / Edge Composition

## Flow

```text
Browser Request
      ↓
Edge / Server Composer
 ├── Header fragment
 ├── Catalog fragment
 └── Account fragment
      ↓
Combined HTML
```

## Benefits

- early HTML
- SEO
- reduced client bootstrap

## Challenges

- fragment latency
- cache strategy
- failures
- hydration coordination

## Trap

The slowest fragment can dominate server-side composition latency unless designed carefully.


---

<!-- 19_SSR_STREAMING_HYDRATION.md -->

# SSR / Streaming / Hydration

## SSR

HTML rendered before reaching browser.

## Streaming

Send HTML progressively.

## Hydration

Attach client behavior to server-rendered markup.

## Microfrontend Challenge

```text
multiple build systems
multiple hydration roots
dependency duplication
routing ownership
failure isolation
```

## Rule

Define one SSR ownership model before adding multiple server-rendered MFEs.


---

<!-- 20_MULTI_FRAMEWORK.md -->

# Multi-Framework Interoperability

## Possible

```text
React MFE
Angular MFE
Vue MFE
Web Component
```

in one product.

## Valid Reasons

- legacy migration
- acquired product
- specialized team need

## Weak Reason

```text
"team wants a different framework"
```

## Costs

```text
larger bundles
duplicate runtimes
different tooling
different accessibility patterns
different state models
```

## Recommendation

Prefer one primary framework unless diversity solves a real business/migration problem.


---

<!-- 21_MONOREPO_POLYREPO.md -->

# Monorepo vs Polyrepo

## Monorepo

Benefits:

```text
atomic refactoring
shared tooling
consistent standards
easy discovery
```

Risks:

```text
centralized pipeline
accidental coupling
large repo
```

## Polyrepo

Benefits:

```text
strong ownership
independent pipelines
clear boundaries
```

Risks:

```text
duplicated tooling
discovery/versioning complexity
```

## Rule

Repository topology does not define microfrontend architecture.

Independent deployment and ownership matter more.


---

<!-- 22_ROUTING.md -->

# Routing

## Ownership Options

### Shell-Owned Top-Level Routing

```text
Shell
 ├── /catalog → Catalog MFE
 ├── /cart → Cart MFE
 └── /account → Account MFE
```

### MFE-Owned Nested Routing

```text
/account/*
  ├── profile
  ├── security
  └── billing
```

## Rule

Shell owns global routes.

MFE owns internal routes beneath its prefix.

## Trap

Multiple routers fighting over browser history creates unpredictable navigation.


---

<!-- 23_SHARED_STATE.md -->

# Shared State

## Best Default

```text
local state first
```

## Share Only Stable Global Concepts

Examples:

```text
authenticated user identity
locale
theme
feature entitlements
```

## Avoid

One giant global store containing every MFE's business state.

## Better Patterns

```text
URL
backend/API
events
small shared context
local store per MFE
```

## Boundary Smell

If two MFEs exchange state continuously, consider whether they should be one MFE.


---

<!-- 24_CROSS_MFE_COMMUNICATION.md -->

# Cross-MFE Communication

## Options

```text
URL / route
CustomEvent
pub/sub
shared utility module
shared browser API
backend-mediated state
```

## Prefer

Contracts that are:

```text
small
typed
versioned
asynchronous where useful
```

## Event Example

```javascript
window.dispatchEvent(
  new CustomEvent("cart:item-added", {
    detail: { productId: "P1" }
  })
);
```

## Trap

Global event buses can become invisible coupling.


---

<!-- 25_AUTH.md -->

# Authentication / Authorization

## Recommended Shape

```text
Identity Provider
      ↓
Shell / Auth Utility
      ↓
Stable Auth Context
      ↓
MFEs
```

## Shared

```text
user identity
access token strategy
permissions / entitlements
logout lifecycle
```

## Avoid

Each MFE implementing independent auth login logic.

## Security Rule

Authorization must still be enforced by backend services.

Frontend checks are UX controls, not security boundaries.


---

<!-- 26_DESIGN_SYSTEM.md -->

# Design System

## Share

```text
tokens
typography
spacing
colors
components
accessibility behavior
interaction standards
```

## Architecture

```text
Design Tokens
      ↓
Component Library
      ↓
MFEs
```

## Version Strategy

Use semver/compatibility policy.

## Trap

Design system should share presentation primitives, not domain business logic.


---

<!-- 27_SHARED_LIBRARIES.md -->

# Shared Libraries

## Good Shared Libraries

```text
design system
auth client
telemetry
API primitives
common utilities
```

## Dangerous Shared Libraries

```text
shared domain state
huge "common" package
cross-team business rules
central global store
```

## Rule

Shared code can create stronger coupling than duplicated small code.

Share deliberately.


---

<!-- 28_DEPENDENCY_VERSIONING.md -->

# Dependency Versioning

## Problem

MFEs may load different versions of:

```text
React
Angular
router
design system
auth utility
```

## Strategies

```text
singleton shared dependency
compatible range
import-map pinning
federated shared config
independent duplicate copy
```

## Rule

Choose one ownership model per dependency class.

## Trap

"Shared" dependency can become a runtime breaking contract.


---

<!-- 29_CSS_ISOLATION.md -->

# CSS Isolation

## Options

```text
CSS Modules
BEM/naming conventions
CSS-in-JS
Shadow DOM
scoped styles
design tokens
```

## Risk

```css
button { ... }
```

in one MFE accidentally breaks another.

## Rule

Global CSS should be minimal and platform-owned.

## Trap

Shadow DOM gives strong style isolation but complicates theming and some framework integration.


---

<!-- 30_ERROR_BOUNDARIES.md -->

# Error Boundaries / Failure Isolation

## Desired Behavior

```text
Shell
 ├── Header ✓
 ├── Catalog ✗ → fallback
 └── Cart ✓
```

## Patterns

- framework error boundary
- runtime load fallback
- remote timeout
- graceful degraded UI
- retry only safe asset loads

## Rule

One MFE failure should not blank the whole page whenever feasible.


---

<!-- 31_CONFIGURATION.md -->

# Configuration

## Examples

```text
API base URL
feature endpoints
telemetry settings
environment flags
```

## Models

```text
build-time config
runtime config
config endpoint
import-map/env manifest
```

## Rule

Do not rebuild every MFE just to change an environment URL if runtime configuration is appropriate.


---

<!-- 32_FEATURE_FLAGS.md -->

# Feature Flags

## Uses

```text
progressive release
A/B test
kill switch
tenant feature
migration
```

## Ownership

Feature flag should have:

```text
owner
expiry date
default
monitoring
removal plan
```

## Trap

Permanent flags become hidden architecture.


---

<!-- 33_I18N.md -->

# Localization / i18n

## Decide Centrally

```text
locale source
translation loading
number/date format
currency
RTL behavior
```

## Ownership

```text
shell → locale selection/context
MFE → domain translations
```

## Trap

Duplicating locale negotiation in every MFE creates inconsistent UX.


---

<!-- 34_ACCESSIBILITY.md -->

# Accessibility

## Cross-MFE Risks

```text
duplicate IDs
broken heading hierarchy
focus loss
keyboard traps
inconsistent ARIA
route focus not restored
```

## Platform Rules

- shared accessibility standards
- automated checks
- keyboard testing
- screen-reader validation
- focus management

## Trap

Independent deployment does not mean independent accessibility.


---

<!-- 35_SEO.md -->

# SEO

## Important For

```text
public content
commerce catalog
marketing pages
articles
```

## Consider

```text
SSR
metadata ownership
canonical URLs
structured data
sitemaps
performance
```

## Route Contract

Define who owns:

```text
<title>
meta description
Open Graph
canonical
structured data
```

## Trap

Multiple MFEs writing document metadata without ownership creates race conditions.


---

<!-- 36_PERFORMANCE_BUDGET.md -->

# Performance Budget

## Budget Areas

```text
JavaScript KB
CSS KB
requests
LCP
INP
CLS
startup time
memory
```

## Per-MFE Budget

Example concept:

```text
Shell       100 KB
Catalog     180 KB
Cart         80 KB
Account     120 KB
```

## Rule

Architecture-level performance requires enforceable budgets.

## Trap

Independent teams can each optimize locally while total page performance becomes unacceptable.


---

<!-- 37_DEPENDENCY_DUPLICATION.md -->

# Dependency Duplication

## Problem

```text
React vX
React vX again
UI library again
utility library again
```

## Cost

```text
download
parse
compile
memory
runtime conflicts
```

## Share Large Dependencies Carefully

Candidates:

```text
framework runtime
router
large UI runtime
```

## Trap

Aggressively sharing every library creates tight version coupling.


---

<!-- 38_LAZY_LOADING.md -->

# Lazy Loading

## Pattern

```text
Initial shell
 ↓
load route MFE only when needed
```

## Benefits

- smaller initial payload
- faster startup
- less unused JavaScript

## Combine With

```text
prefetch
preload
route prediction
CDN
```

## Trap

Lazy loading everything can create visible waterfalls.


---

<!-- 39_CACHING_CDN.md -->

# Caching / CDN

## Recommended Asset Model

```text
immutable hashed asset
+
long cache lifetime
```

Example:

```text
catalog.a1b2c3.js
```

## Runtime Manifest

Keep dynamic mapping separately cache-controlled.

## CDN Benefits

```text
edge delivery
availability
cache
latency
```

## Trap

Overwriting a versioned remote asset breaks rollback safety.


---

<!-- 40_PARTIAL_FAILURE.md -->

# Resilience / Partial Failure

## Failure Types

```text
remote JS unavailable
API unavailable
auth unavailable
config unavailable
incompatible version
runtime exception
```

## Degrade

```text
fallback UI
cached content
hide optional feature
retry asset carefully
error telemetry
```

## Rule

Design page behavior when each MFE is unavailable.

## Trap

Runtime composition introduces runtime dependency failure modes.


---

<!-- 41_SECURITY_BOUNDARIES.md -->

# Security Boundaries

## Browser Reality

MFEs running in the same page often share the same JavaScript security context.

## Risks

```text
XSS
malicious remote
token theft
DOM tampering
dependency compromise
```

## Stronger Isolation

Use iframe/origin boundaries when required.

## Rule

Microfrontend boundaries are organizational/runtime boundaries, not necessarily security boundaries.


---

<!-- 42_CSP_SRI.md -->

# CSP / SRI / Trusted Sources

## CSP

Restrict where resources/scripts can load from.

## SRI

Integrity metadata can verify static third-party assets where applicable.

## Runtime Federation Challenge

Dynamic remote locations require deliberate trust management.

## Checklist

```text
trusted CDN
HTTPS
CSP
allowlist
asset immutability
signed/reviewed pipeline
```

## Trap

Allowing arbitrary remote script origins defeats frontend supply-chain controls.


---

<!-- 43_SUPPLY_CHAIN_SECURITY.md -->

# Supply Chain Security

## Risks

```text
compromised npm package
malicious remote deployment
dependency confusion
stolen CI credentials
CDN tampering
```

## Controls

```text
lockfiles
SBOM
dependency scanning
signed artifacts
restricted publishing
protected branches
short-lived CI credentials
provenance
```

## Rule

Every independently deployable MFE expands the release surface.


---

<!-- 44_OBSERVABILITY.md -->

# Observability

## Need

```text
Which MFE failed?
Which version?
Which route?
Which user flow?
Which remote URL?
```

## Common Fields

```text
appVersion
mfeName
mfeVersion
route
release
traceId
sessionId
errorType
```

## Rule

Telemetry contract should be platform-wide.


---

<!-- 45_FRONTEND_TRACING.md -->

# Frontend Tracing

## Flow

```text
Browser Navigation
  ↓
MFE Load
  ↓
API Call
  ↓
Backend Service
  ↓
Database
```

## Goal

Correlate frontend experience with backend traces.

## Useful Spans

```text
route transition
remote load
data fetch
render/hydration
user action
```

## Trap

High-cardinality or over-instrumented telemetry can become expensive.


---

<!-- 46_LOGGING_TELEMETRY.md -->

# Logging / Telemetry

## Capture

```text
runtime errors
remote load failure
route failure
API failure
feature flag
performance measure
```

## Avoid

```text
tokens
passwords
sensitive PII
full response bodies
```

## Rule

Prefer structured event telemetry over console logging.


---

<!-- 47_WEB_VITALS.md -->

# Web Vitals

## Core User Metrics

```text
LCP
INP
CLS
```

## Microfrontend Risks

### LCP
late-loading route MFE

### INP
too much JavaScript / long tasks

### CLS
independent fragments shift layout

## Rule

Measure total page experience, not only each MFE in isolation.


---

<!-- 48_UNIT_COMPONENT_TESTING.md -->

# Unit / Component Testing

## Each MFE Owns

```text
domain logic tests
component tests
accessibility tests
routing tests
state tests
```

## Goal

Most behavior verified locally.

## Trap

Do not require the entire application shell for every component test.


---

<!-- 49_CONTRACT_TESTING.md -->

# Contract Testing

## Contracts Between

```text
Shell ↔ MFE
MFE ↔ shared utility
MFE ↔ backend API
MFE ↔ events
```

## Verify

```text
mount interface
props/context
event schema
remote module name
API response schema
```

## Benefit

Supports independent deployment.

## Trap

Runtime JavaScript contracts need the same discipline as backend APIs.


---

<!-- 50_INTEGRATION_TESTING.md -->

# Integration Testing

## Verify

```text
shell + one MFE
MFE + auth utility
MFE + design system
MFE + deployed dependencies
```

## Strategy

Test one changed MFE against stable deployed versions of others when possible.

## Trap

Spinning up every repository locally for every test destroys developer speed.


---

<!-- 51_E2E_TESTING.md -->

# End-to-End Testing

## Keep For Critical Journeys

```text
login
search
checkout
payment
account update
```

## Run Against Integrated Environment

Validate:

```text
routing
composition
auth
cross-MFE flow
backend integration
```

## Trap

Do not make E2E the only integration safety net.


---

<!-- 52_VISUAL_REGRESSION.md -->

# Visual Regression

## Why Important

MFEs share one visible product.

A change in:

```text
design system
global CSS
shell layout
MFE size
```

can break adjacent areas.

## Test

```text
component screenshots
route screenshots
critical integrated pages
```

## Trap

Pixel-perfect diff without sensible thresholds can create noise.


---

<!-- 53_CICD.md -->

# CI/CD

## Per MFE

```text
Commit
 ↓
Lint
 ↓
Unit / Component
 ↓
Security
 ↓
Contract
 ↓
Build
 ↓
Publish immutable asset
 ↓
Integration check
 ↓
Promote mapping/manifest
```

## Principle

Independent deployment should not require rebuilding unrelated MFEs.

## Trap

One central release train defeats a major microfrontend benefit.


---

<!-- 54_INDEPENDENT_DEPLOYMENT.md -->

# Independent Deployment

## True Independence

Team can deploy:

```text
MFE A v42
```

without rebuilding:

```text
MFE B
MFE C
Shell
```

provided contracts remain compatible.

## Requires

```text
runtime mapping
stable contracts
backward compatibility
independent CI
observability
rollback
```

## Trap

Independent repository != independent deployment.


---

<!-- 55_VERSIONING_COMPATIBILITY.md -->

# Versioning / Backward Compatibility

## Public Interface

Each MFE should expose the smallest possible public contract.

## Compatibility

Prefer:

```text
additive changes
optional fields
stable events
semantic versioning where appropriate
```

## Runtime Concern

Old host may meet new remote.

New host may meet old remote.

Design for overlap.

## Trap

Runtime federation creates temporal version compatibility requirements.


---

<!-- 56_LOCAL_DEVELOPMENT.md -->

# Local Development

## Goal

Developer runs only the MFE they are changing.

```text
Catalog MFE → localhost
Other MFEs  → deployed environment
```

## Techniques

```text
import-map override
remote URL override
proxy
standalone mode
```

## Benefit

Fast local startup and realistic integration.

## Trap

Requiring all MFEs to run locally makes the architecture painful.


---

<!-- 57_ENVIRONMENT_STRATEGY.md -->

# Environment Strategy

## Avoid

One permanent full environment per branch for every MFE.

## Prefer

```text
shared integration environment
ephemeral preview where useful
runtime remote override
immutable artifacts
promotion
```

## Rule

Deploy the same artifact through environments when possible.

## Trap

Environment-specific rebuilds reduce confidence in promotion.


---

<!-- 58_STRANGLER_MIGRATION.md -->

# Strangler Migration

## From Frontend Monolith

```text
Monolith
 ├── Catalog
 ├── Cart
 ├── Account
 └── Admin
```

Extract one capability:

```text
Shell
 ├── New Catalog MFE
 └── Legacy Monolith for remaining routes
```

Repeat.

## Good First Candidate

```text
clear route
clear ownership
low shared state
high change rate
```

## Trap

Do not rewrite the whole frontend into MFEs at once.


---

<!-- 59_PLATFORM_TEAM.md -->

# Frontend Platform Team

## Owns

```text
shell
MFE templates
CI patterns
observability SDK
design system
security baseline
runtime manifest/import maps
developer tooling
```

## Does Not Own

Every product feature.

## Goal

Make the safe path the easy path.

## Trap

Platform team should enable teams, not become a release bottleneck.


---

<!-- 60_GOVERNANCE.md -->

# Governance Model

## Standardize

```text
security
observability
accessibility
performance budget
release contract
design tokens
browser support
error handling
```

## Allow Autonomy

```text
internal component structure
local state
team workflow
implementation details
```

## Rule

Govern interfaces and outcomes, not every line of code.


---

<!-- 61_ANTI_PATTERNS.md -->

# Microfrontend Anti-Patterns

## Nano Frontends
Every small component becomes an MFE.

## Shared Global Store
All MFEs depend on one mutable schema.

## Fat Shell
Shell contains domain business logic.

## Framework Zoo
Every team chooses a different framework without business reason.

## Shared Everything Package
One giant common dependency.

## Runtime Dependency Chain
MFE A loads B which loads C which loads D.

## Central Release Train
All MFEs deploy together.

## Invisible Events
Unversioned global event bus.

## Global CSS
One team's styles break another.

## Trap

The most common failure is too much coupling disguised as distribution.


---

<!-- 62_TROUBLESHOOTING_MATRIX.md -->

# Troubleshooting Matrix

| Symptom | First Checks | Likely Cause |
|---|---|---|
| Remote not loading | URL/network/CSP | bad manifest/CDN |
| Blank route | router/mount | route ownership |
| React duplicate error | shared deps | duplicate runtime |
| CSS broken | global selectors | isolation failure |
| Auth mismatch | token/context | duplicated auth state |
| Slow initial load | bundle waterfall | no lazy/preload strategy |
| Hydration error | SSR/client mismatch | version/render mismatch |
| One MFE breaks page | error boundary | weak isolation |
| Random runtime error after deploy | compatibility | host/remote mismatch |
| Duplicate analytics | shared telemetry | multiple bootstrap |
| Memory growth | unmount cleanup | leaked listeners/state |
| Navigation broken | multiple routers | history ownership |

## Debug Flow

```text
Network
 ↓
Manifest / Remote
 ↓
Runtime Console
 ↓
Version Matrix
 ↓
Route / Mount Lifecycle
 ↓
Telemetry / Trace
```


---

<!-- 63_PRODUCTION_READINESS.md -->

# Production Readiness Checklist

## Architecture

- [ ] clear business boundary
- [ ] team owner
- [ ] independent deployment
- [ ] stable public interface
- [ ] route ownership

## Runtime

- [ ] fallback for remote load failure
- [ ] error boundary
- [ ] unmount cleanup
- [ ] compatibility policy

## Performance

- [ ] JS budget
- [ ] shared dependency plan
- [ ] lazy loading
- [ ] CDN caching
- [ ] Web Vitals

## Security

- [ ] trusted remote origins
- [ ] CSP
- [ ] dependency scanning
- [ ] auth strategy

## Quality

- [ ] component tests
- [ ] contract tests
- [ ] integration tests
- [ ] critical E2E
- [ ] accessibility

## Operations

- [ ] telemetry
- [ ] version visibility
- [ ] rollback
- [ ] release ownership


---

<!-- 64_ARCH_REVIEW.md -->

# Architecture Review Checklist

Ask:

```text
Why is this a separate MFE?
What business capability does it own?
Who owns it?
Can it deploy independently?
What is its public interface?
What state does it share?
Who owns top-level routing?
What happens if it fails to load?
How are framework dependencies shared?
How is CSS isolated?
How is auth provided?
How is it observed?
What is its performance budget?
What is its rollback path?
How are versions kept compatible?
```

## Rule

If an MFE cannot be explained without naming implementation components, the business boundary may be weak.


---

<!-- 65_COMPARISON_MATRIX.md -->

# High-Value Comparison Matrix

## Module Federation vs Import Maps

| Module Federation | Import Maps |
|---|---|
| remote modules | module URL mapping |
| bundler integration | browser module resolution |
| shared dependency features | simple indirection |
| runtime code sharing | runtime location mapping |

## single-spa vs Module Federation

| single-spa | Module Federation |
|---|---|
| app orchestration | module loading/sharing |
| mount/unmount | expose/consume |
| route/activity model | remote module model |
| can use together | can use together |

## Web Components vs Framework Components

| Web Components | Framework Components |
|---|---|
| browser standard | framework-native |
| cross-framework | best same-framework DX |
| Shadow DOM possible | framework styling/model |

## Runtime vs Build-Time

| Runtime | Build-Time |
|---|---|
| independent release | simpler runtime |
| runtime failure possible | rebuild required |
| compatibility needed | compile-time integration |

## Route vs Component Split

| Route-Based | Component-Based |
|---|---|
| stronger isolation | fine-grained composition |
| less shared state | more communication |
| recommended default | use selectively |


---

<!-- 66_INTERVIEW_TRAPS.md -->

# Microfrontend Interview Traps

1. Microfrontend != component library.
2. Microfrontend != Module Federation.
3. Module Federation is an implementation mechanism.
4. Route-based boundaries are often cleaner than tiny component splits.
5. Independent repository != independent deployment.
6. Shared global Redux store creates coupling.
7. Cross-MFE UI state should be minimal.
8. Web Components solve interoperability, not orchestration.
9. single-spa and Module Federation can complement each other.
10. Iframes provide stronger isolation than same-page JS MFEs.
11. Different frameworks are possible, not automatically desirable.
12. Shared design system != shared business logic.
13. Shared dependencies can create runtime coupling.
14. Runtime integration requires compatibility across deployed versions.
15. Shell should remain thin.
16. Top-level routing needs one owner.
17. CSS is a cross-team contract.
18. Backend authorization cannot be replaced by frontend checks.
19. CSP matters for runtime-loaded remotes.
20. Total page performance matters more than local MFE performance.
21. SSR makes MFE composition harder, not impossible.
22. Contract testing is important for independent deployment.
23. One failing MFE should degrade gracefully where possible.
24. Platform team should enable, not centralize feature delivery.
25. Modular monolith frontend can be the correct solution.


---

<!-- 67_ONE_PAGE_ARCHITECTURE_RECALL.md -->

# Microfrontend Architecture — One-Page Recall

```text
                         Browser
                           │
                           ▼
                    Application Shell
              ┌────────────┼────────────┐
              ▼            ▼            ▼
          Catalog MFE   Cart MFE    Account MFE
              │            │            │
           Catalog API   Cart API    Account API
```

## Composition Options

```text
Runtime
 ├── Module Federation
 ├── Import Maps
 ├── single-spa
 └── Web Components

Build-Time
 └── package/module integration

Server/Edge
 └── HTML fragment composition
```

## Cross-Cutting

```text
Routing
Auth
Design System
Observability
Accessibility
i18n
Performance
Security
```

## State Rule

```text
Local state first
URL for navigation
Backend for business truth
Small stable global context only
```

## Delivery Rule

```text
Independent Build
→ Immutable Asset
→ CDN
→ Version Mapping
→ Progressive Release
→ Observe
→ Rollback
```


---

<!-- 68_DECISION_TREE.md -->

# Microfrontend Decision Tree

## 1. Do you need independent frontend deployment?

```text
No → Modular frontend likely enough
Yes ↓
```

## 2. Are there clear business/team boundaries?

```text
No → Fix domain/team boundaries first
Yes ↓
```

## 3. Can boundary be route-based?

```text
Yes → Prefer route-based MFE
No ↓
```

## 4. Does component need independent deployment?

```text
No → Normal shared component
Yes ↓
```

## 5. Same framework?

```text
Yes → Framework component / Module Federation
No → Web Component / orchestrator / iframe depending isolation
```

## 6. Need runtime independent release?

```text
No → Build-time package
Yes → Module Federation / import maps / orchestration
```

## 7. Strong security isolation required?

```text
Yes → iframe/origin boundary may be better
```


---

<!-- 69_PRACTICE_QUESTIONS.md -->

# Microfrontend Practice Questions

1. What problem do microfrontends solve?
2. When should you avoid them?
3. Modular frontend vs microfrontend?
4. How do you identify MFE boundaries?
5. Why route-based splitting?
6. What is an application shell?
7. Build-time vs runtime composition?
8. Client vs server composition?
9. What is Module Federation?
10. Host vs remote?
11. Shared dependency strategy?
12. What are import maps?
13. What is single-spa?
14. single-spa vs Module Federation?
15. What are Web Components?
16. When would you use iframe?
17. How do MFEs communicate?
18. Why avoid global shared state?
19. How do you manage authentication?
20. How do you share a design system?
21. How do you prevent CSS collisions?
22. How do you handle routing?
23. Monorepo vs polyrepo?
24. How do you manage dependency versions?
25. How do you handle a remote-load failure?
26. How do you secure runtime remotes?
27. What is CSP?
28. How do you prevent supply-chain risk?
29. How do you measure MFE performance?
30. How do Web Vitals apply?
31. How do you test MFEs?
32. What is a frontend contract test?
33. How do you achieve independent deployment?
34. How do you maintain compatibility?
35. How do you do local development?
36. How do you migrate a frontend monolith?
37. What should a frontend platform team own?
38. What are common MFE anti-patterns?
39. How do you troubleshoot duplicate framework runtimes?
40. When is a modular monolith frontend better?


---

<!-- 70_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack is vendor-neutral and architecture-first.

Primary current references used:

- Martin Fowler / Thoughtworks — Micro Frontends
- webpack — Module Federation documentation
- single-spa — microfrontend concepts and recommended setup
- MDN — Web Components, Custom Elements, Shadow DOM

## Current Practical Guidance

### Route-Oriented Boundaries

Route/business-capability boundaries generally reduce cross-MFE communication and state coupling.

### Shared State

Keep UI state local to each microfrontend where possible.
Frequent shared UI state is often a boundary smell.

### Module Federation

Webpack Module Federation allows independently built containers to expose and consume modules at runtime.

### single-spa

single-spa focuses on application mounting/orchestration and can coexist with Module Federation.

### Web Components

Web Components provide browser-native custom elements and optional Shadow DOM encapsulation.

## Core Rule

Judge a microfrontend architecture by:

```text
team autonomy
business alignment
independent deployment
runtime reliability
performance
security
operability
user-experience consistency
```

—not by how many bundles or repositories it has.
