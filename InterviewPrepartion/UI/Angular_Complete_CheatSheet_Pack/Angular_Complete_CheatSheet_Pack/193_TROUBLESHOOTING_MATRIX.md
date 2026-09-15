# Angular Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | signal/input/event notification | mutation outside tracked path |
| ExpressionChanged error | lifecycle timing | late binding mutation |
| NullInjectorError | provider/token scope | missing provider |
| Duplicate singleton state | provider hierarchy | service provided in child |
| HTTP fires twice | subscriptions | cold observable multiple subscribers |
| Search shows stale data | flattening operator | mergeMap instead of switchMap |
| Memory leak | subscriptions/listeners | missing cleanup |
| Huge bundle | eager routes/dependency | no lazy/@defer |
| Slow list | tracking/DOM count | bad @for track / no virtualization |
| SSR crash | browser global | window/document access |
| Hydration mismatch | server/client markup | random/time/client-only data |
| Form slow | giant control tree/component | validation/render fan-out |
| 401 repeated | interceptor/token refresh | retry loop/race |
| Route loops | guard redirect logic | cyclic navigation |
| Tests flaky | forced detectChanges/timers | async stabilization issue |
| CSS leak | encapsulation/global style | global selectors |

## Debug Flow

```text
ng version
→ browser console/network
→ Angular DevTools
→ Signals / RxJS ownership
→ DI provider scope
→ Router / HTTP
→ SSR boundary
→ profiler / bundle analysis
→ fix
→ re-measure
```
