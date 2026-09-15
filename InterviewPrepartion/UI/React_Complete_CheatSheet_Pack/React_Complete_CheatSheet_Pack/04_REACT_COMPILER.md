# React Compiler — Stable 1.0

## What

A build-time compiler that automatically optimizes React components and Hooks, primarily through automatic memoization.

## Mental Model

```text
Normal React Source
       ↓
React Compiler
       ↓
Optimized React Code
       ↓
less manual memoization work
```

## Why

Historically developers manually used:

```text
React.memo
useMemo
useCallback
```

to stabilize expensive calculations/components/identities.

The Compiler can automate many of these optimizations.

## Production Guidance

- React Compiler 1.0 is stable.
- It works best with React 19 and can support React 17/18.
- Adopt incrementally.
- Keep `eslint-plugin-react-hooks` current.
- Fix Rules-of-React violations.
- Profile production-like behavior.

## Trap

Compiler does **not** mean:
- every re-render disappears,
- architecture/state ownership stops mattering,
- profiling becomes unnecessary,
- all manual memoization can be deleted without testing.
