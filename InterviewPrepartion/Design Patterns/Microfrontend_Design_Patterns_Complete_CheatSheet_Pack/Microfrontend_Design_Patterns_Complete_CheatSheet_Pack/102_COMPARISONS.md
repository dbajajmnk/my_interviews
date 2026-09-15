# High-Value Microfrontend Pattern Comparisons

## Module Federation vs Import Maps

| Module Federation | Import Maps |
|---|---|
| exposes/consumes runtime modules | maps module names to URLs |
| bundler/runtime integration | browser module resolution |
| can coordinate shared dependencies | simple location indirection |
| host/remote model | logical-name/URL model |

## single-spa vs Module Federation

| single-spa | Module Federation |
|---|---|
| application lifecycle/orchestration | runtime module loading/sharing |
| mount/unmount | expose/consume |
| route/activity rules | remote module contract |
| can be used together | can be used together |

## Route vs Widget Composition

| Route-Based | Widget-Based |
|---|---|
| stronger isolation | finer composition |
| less shared state | more coordination |
| easier ownership | harder layout/state contracts |
| preferred default | selective use |

## Web Component vs Iframe

| Web Component | Iframe |
|---|---|
| same page JS context | separate document/origin |
| easy visual integration | stronger isolation |
| Shadow DOM optional | postMessage communication |
| lighter | heavier |

## Local State vs Shared Store

| Local State | Shared Store |
|---|---|
| autonomy | coupling |
| independent evolution | shared schema |
| simpler ownership | coordinated change |
