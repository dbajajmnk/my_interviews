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
