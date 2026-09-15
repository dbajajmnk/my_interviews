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
