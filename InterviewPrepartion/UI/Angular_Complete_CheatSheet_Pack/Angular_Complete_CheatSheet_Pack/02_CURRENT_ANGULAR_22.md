# Current Angular Baseline — Angular 22

## Current Stable

As of 15 September 2026:
- Angular 22 is the active major line.
- Angular 22.1.6 is the current stable release line surfaced by official/npm release data.
- Angular 22.2 is still in `next` pre-release builds.

## Angular 22 Modern Defaults / Stable Features

```text
Standalone components are the normal/default model
Zoneless change detection is default (since v21+)
OnPush is the default component change-detection strategy (since v22)
ChangeDetectionStrategy.Eager is the explicit eager mode
ChangeDetectionStrategy.Default is deprecated alias for Eager
Signal Forms are stable in v22
resource() is stable in v22
httpResource() is stable in v22
Vitest is the default unit-test runner for new CLI projects
Angular Aria is stable in v22
```

## Version Compatibility Baseline

Angular 22.0.x officially requires:
- Node.js: ^22.22.3 || ^24.15.0 || ^26.0.0
- TypeScript: >=6.0.0 <6.1.0
- RxJS: ^6.5.3 || ^7.4.0

Check exact compatibility for the specific Angular 22 minor/patch used in a real project.

## Interview Rule

Always distinguish:
- Angular 22 current practice,
- Angular 20/21 transition-era guidance,
- legacy NgModule/ZoneJS/Karma architecture.
