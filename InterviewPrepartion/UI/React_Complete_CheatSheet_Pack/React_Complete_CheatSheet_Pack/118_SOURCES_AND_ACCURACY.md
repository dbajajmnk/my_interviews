# Sources & Accuracy Notes

Primary current references:

- React official documentation — https://react.dev/
- React 19.3 release notes
- React 19.2 release notes
- React 19 release notes and upgrade guide
- React Compiler documentation / v1.0 announcement
- React official guidance on creating new apps
- React official Create React App deprecation announcement

## Current Baseline

```text
React latest: 19.3
React Compiler: 1.0 stable
Create React App: deprecated
```

## Important Version Mapping

```text
React 19.0:
Actions, useActionState, useOptimistic, form actions,
useFormStatus, use, ref-as-prop and other React 19 changes

React 19.2:
Activity
useEffectEvent
cacheSignal
React Performance Tracks
Partial Pre-rendering server APIs

React 19.3:
ViewTransition stable
Fragment Refs stable
react-dom browser()
Trusted Types support
additional RSC/context and scheduling improvements
```

## Accuracy Rule

React evolves quickly. For production architecture always verify:
- exact React/framework version,
- framework support for RSC/Actions/server APIs,
- bundler/compiler configuration,
- browser support for progressive enhancement features,
- latest security advisories.
