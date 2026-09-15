# Vue Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| UI not updating | ref/reactive ownership | lost reactivity |
| destructured state stale | destructuring source | reactive object destructured |
| list state jumps | keys | unstable/index key |
| computed not updating | dependency read | non-reactive source/raw data |
| watcher loop | watcher mutates source | cyclic side effect |
| stale async result | request ordering | missing cancellation |
| duplicate fetch | lifecycle/watch/store | repeated trigger/subscription |
| Pinia value stale | destructured store | missing storeToRefs |
| route refresh 404 | server rewrite | history mode hosting |
| SSR mismatch | server/client output | time/random/browser-only state |
| memory leak | listener/socket/timer | missing cleanup |
| KeepAlive stale | cached instance | no activated refresh policy |
| modal styling wrong | Teleport target | CSS scope/DOM context |
| async component fails | chunk/CDN | stale deployment cache |
| huge bundle | eager imports/dependency | no code splitting |
| XSS risk | v-html/template | unsafe content |
| provide inject undefined | key/provider tree | wrong scope/key |
| type ref wrong | template ref timing | null/inference issue |

## Debug Flow

```text
Vue DevTools
→ reactive source
→ component props/emits
→ watchers/computed
→ Router / Pinia
→ Network
→ SSR/hydration
→ bundle/performance
→ fix
→ re-measure
```
