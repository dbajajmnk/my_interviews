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
