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
