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
