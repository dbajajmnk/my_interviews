# Troubleshooting Matrix

| Symptom | First Checks | Likely Cause |
|---|---|---|
| Remote not loading | URL/network/CSP | bad manifest/CDN |
| Blank route | router/mount | route ownership |
| React duplicate error | shared deps | duplicate runtime |
| CSS broken | global selectors | isolation failure |
| Auth mismatch | token/context | duplicated auth state |
| Slow initial load | bundle waterfall | no lazy/preload strategy |
| Hydration error | SSR/client mismatch | version/render mismatch |
| One MFE breaks page | error boundary | weak isolation |
| Random runtime error after deploy | compatibility | host/remote mismatch |
| Duplicate analytics | shared telemetry | multiple bootstrap |
| Memory growth | unmount cleanup | leaked listeners/state |
| Navigation broken | multiple routers | history ownership |

## Debug Flow

```text
Network
 ↓
Manifest / Remote
 ↓
Runtime Console
 ↓
Version Matrix
 ↓
Route / Mount Lifecycle
 ↓
Telemetry / Trace
```
