# CI/CD Matrix Build

## Pipeline

```text
Canonical Spec Change
   ↓
Shared Contract Tests
   ↓
┌─────────┬─────────┬─────────┬────────────┐
│ Python  │ Java    │ C#      │ TypeScript │
│ build   │ build   │ build   │ build      │
│ test    │ test    │ test    │ test       │
└─────────┴─────────┴─────────┴────────────┘
   ↓
Parity Gate
   ↓
Publish Packages
```

## Rule

A release is not complete until parity and package publication status are known.
