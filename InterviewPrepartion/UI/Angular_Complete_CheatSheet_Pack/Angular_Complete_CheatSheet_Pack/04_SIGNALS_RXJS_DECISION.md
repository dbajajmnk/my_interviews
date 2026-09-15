# Signals vs RxJS — Decision Cheat Sheet

## Use Signals For

```text
component state
feature state with current value
derived state
template reactivity
signal inputs/models
local synchronous UI state
```

## Use RxJS For

```text
multi-event async streams
WebSocket/events
complex cancellation
debounce/throttle
concurrency
stream composition
retry/backoff
```

## Use Both

```text
HttpClient Observable
   ↓
RxJS composition
   ↓
toSignal()
   ↓
Template
```

or:

```text
Signal
 ↓
toObservable()
 ↓
RxJS async pipeline
```

## Interview Line

> Signals and RxJS are complementary. Signals optimize synchronous state/reactive rendering; RxJS excels at asynchronous event streams and temporal composition.
