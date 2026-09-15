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
