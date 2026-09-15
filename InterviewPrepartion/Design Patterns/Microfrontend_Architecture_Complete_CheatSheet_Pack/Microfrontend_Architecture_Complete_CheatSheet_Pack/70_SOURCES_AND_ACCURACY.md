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
