# Angular High-Value Comparisons

## Signal vs Observable

| Signal | Observable |
|---|---|
| current synchronous value | stream over time |
| read with `()` | subscribe / AsyncPipe |
| fine-grained template state | async/event composition |
| computed/effect | RxJS operators |

## computed vs effect

| computed | effect |
|---|---|
| derived value | side effect |
| pure | external synchronization |
| memoized reactive result | runs when dependencies change |

## Signal Forms vs Reactive Forms

| Signal Forms | Reactive Forms |
|---|---|
| signal model source | control tree source |
| schema/path validation | validator functions on controls |
| strong signal integration | Observable-based |
| stable v22 | mature/stable |

## OnPush vs Eager

| OnPush | Eager |
|---|---|
| default v22 | opt-in |
| targeted checks | eager traversal when reached |
| signals/events/inputs notify | broader checking |
| preferred modern default | compatibility/special cases |

## Standalone vs NgModule

| Standalone | NgModule |
|---|---|
| direct imports/providers | declarations/imports modules |
| modern default | legacy/compatibility |
| simpler lazy routes | existing enterprise code |

## switchMap vs mergeMap vs concatMap vs exhaustMap

| Operator | Semantics |
|---|---|
| switchMap | latest wins / cancel prior |
| mergeMap | concurrent |
| concatMap | queue sequentially |
| exhaustMap | ignore new until current ends |

## SSR vs Prerender vs CSR

| SSR | Prerender | CSR |
|---|---|---|
| per request server HTML | build-time static HTML | browser renders |
| dynamic SEO content | stable content | app/private screens |
| server cost | rebuild for content | weakest first HTML/SEO |
