# React 19.2 → 19.3 New Features Recall

## React 19.2

### Activity
```jsx
<Activity mode={visible ? 'visible' : 'hidden'}>
  <Page />
</Activity>
```
Hidden mode preserves subtree state, hides children, unmounts effects, and deprioritizes hidden updates.

### useEffectEvent
Separates event-like logic fired by an Effect from reactive Effect dependencies.

### cacheSignal
Server Components only; exposes cache-lifetime cancellation signal.

### Performance Tracks
Chrome DevTools tracks for Scheduler and Components.

### Partial Pre-rendering
Prerender static shell, save postponed state, resume later.

## React 19.3

### ViewTransition — stable
Animate enter/exit/move/resize transitions integrated with React updates.

### Fragment Refs — stable
A ref on Fragment yields a FragmentInstance that can operate on first-level DOM children without adding wrapper DOM.

### browser()
```jsx
use(browser())
```
Suspends on server and continues in browser; useful for truly browser-only rendering under Suspense.

### Trusted Types
React can pass TrustedHTML/TrustedScript/TrustedScriptURL values through supported browser sinks instead of coercing them back to strings.

## Interview Trap

Do not say Activity, ViewTransition, or Fragment Refs all arrived in React 19.0:
- Activity/useEffectEvent → 19.2
- ViewTransition/Fragment Refs stable → 19.3
