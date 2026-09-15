# React Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| Infinite render | setter called during render | state mutation loop |
| Infinite effect | effect sets dependency | effect design |
| Stale value | closure/dependencies | stale closure |
| Lost list state | keys | unstable/index key |
| Too many renders | state ownership/context | state too high/global |
| Slow typing | expensive sibling render | transition/deferred/colocation |
| Hydration mismatch | server vs client output | time/random/browser-only API |
| Input warning | controlled/uncontrolled switch | value/defaultValue |
| Effect runs twice dev | StrictMode | missing-safe cleanup |
| Memory growth | listeners/subscriptions | cleanup leak |
| Context fan-out | provider value changes | giant context |
| Suspense never resolves | resource/framework integration | promise/cache problem |
| Lazy chunk fails | deployment cache mismatch | stale HTML/chunk removed |
| XSS concern | raw HTML sink | unsafe HTML / CSP |
| Form duplicate | repeated submit | pending UX + server idempotency |
| RSC boundary error | client Hook on server | missing `'use client'` boundary |

## Debug Flow

```text
Reproduce
→ React DevTools
→ Props/State/Context
→ Profiler / Performance Track
→ Network
→ Console
→ Server/client boundary
→ Fix
→ Re-measure
```
