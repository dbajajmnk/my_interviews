# Sources & Accuracy Notes

Primary current references:

- Angular official documentation: https://angular.dev/
- Angular release/version support: https://angular.dev/reference/releases
- Angular version compatibility: https://angular.dev/reference/versions
- Angular roadmap: https://angular.dev/roadmap
- Angular Zoneless guide
- Angular Forms / Signal Forms guides
- Angular HTTP / httpResource guides
- Angular Testing / Vitest guide
- Angular CLI reference

## Current Baseline — 15 September 2026

```text
Active major: Angular 22
Current stable surfaced release: 22.1.6
22.2: pre-release/next line at this date
```

## Important Modern Version Facts

```text
Standalone default: modern Angular (standalone true no longer necessary in new defaults)
Zoneless default: v21+
OnPush default: v22+
ChangeDetectionStrategy.Eager: explicit eager strategy
ChangeDetectionStrategy.Default: deprecated alias of Eager
Signal Forms: stable v22+
resource(): stable v22
httpResource(): stable v22
Vitest: default new-project test runner
Angular Aria: stable v22
```

## Accuracy Rule

Angular evolves quickly. For production work always confirm:
- exact Angular minor/patch,
- Node/TypeScript/RxJS compatibility,
- migration guide requirements,
- browser Baseline support,
- developer-preview/experimental API status.
