# High-Value Comparison Matrix

## Module Federation vs Import Maps

| Module Federation | Import Maps |
|---|---|
| remote modules | module URL mapping |
| bundler integration | browser module resolution |
| shared dependency features | simple indirection |
| runtime code sharing | runtime location mapping |

## single-spa vs Module Federation

| single-spa | Module Federation |
|---|---|
| app orchestration | module loading/sharing |
| mount/unmount | expose/consume |
| route/activity model | remote module model |
| can use together | can use together |

## Web Components vs Framework Components

| Web Components | Framework Components |
|---|---|
| browser standard | framework-native |
| cross-framework | best same-framework DX |
| Shadow DOM possible | framework styling/model |

## Runtime vs Build-Time

| Runtime | Build-Time |
|---|---|
| independent release | simpler runtime |
| runtime failure possible | rebuild required |
| compatibility needed | compile-time integration |

## Route vs Component Split

| Route-Based | Component-Based |
|---|---|
| stronger isolation | fine-grained composition |
| less shared state | more communication |
| recommended default | use selectively |
