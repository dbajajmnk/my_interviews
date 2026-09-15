# Vue Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | ref/reactive ownership | lost reactivity / shallow state |
| Computed stale | dependencies | non-reactive input |
| Infinite watcher | callback mutates source | feedback loop |
| Old request wins | watcher cleanup | stale async response |
| List state wrong | key | unstable/index key |
| Prop warning | child mutation | prop ownership violation |
| Pinia value not reactive | destructuring | missing storeToRefs |
| KeepAlive resource continues | activated/deactivated | no pause handling |
| SSR data leak | singleton module state | no per-request app/store |
| Hydration warning | initial markup mismatch | random/time/browser-only state |
| Modal CSS/focus bug | Teleport target | stacking/focus context |
| Duplicate API calls | repeated composable/watch | no cache/dedupe |
| Huge bundle | eager imports | no route/async splitting |
| Slow huge list | DOM volume | no virtualization |
| XSS risk | v-html | unsanitized HTML |
| Route refresh 404 | server hosting | missing SPA fallback |
| Template ref null | lifecycle | accessed before mount |
| Memory leak | external listener/socket | missing cleanup |

## Debug Flow

```text
Vue DevTools
→ Component props/state
→ ref/reactive/computed dependencies
→ watchers
→ Router / Pinia
→ network
→ SSR/hydration boundary
→ bundle/performance
→ fix
→ re-measure
```
