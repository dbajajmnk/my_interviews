# Modern Angular vs Legacy Angular — Quick Map

| Modern Angular 22 | Older / Legacy Angular |
|---|---|
| Standalone default | NgModule-first |
| `bootstrapApplication` | `platformBrowserDynamic().bootstrapModule` |
| `input()` / `output()` / `model()` | decorator `@Input` / `@Output` |
| Signals / computed / effect | RxJS/fields for most local state |
| Zoneless default | ZoneJS default |
| OnPush default | Default/CheckAlways common |
| `Eager` explicit mode | `Default` terminology |
| `@if @for @switch` | `*ngIf *ngFor ngSwitch` |
| `@defer` | manual lazy techniques |
| Signal Forms stable | Reactive/Template Forms only |
| Vitest default new projects | Karma/Jasmine common |
| functional providers/interceptors/guards | class/module configuration common |
| SSR + incremental hydration | older Angular Universal model |

## Critical Point

Legacy APIs remain important because enterprise Angular applications may span many versions.

Modernize incrementally; do not confuse “not preferred for new code” with “removed.”
