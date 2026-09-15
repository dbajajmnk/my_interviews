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
