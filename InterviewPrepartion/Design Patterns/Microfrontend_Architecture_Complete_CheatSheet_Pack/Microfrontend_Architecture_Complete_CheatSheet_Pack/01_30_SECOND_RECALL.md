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
