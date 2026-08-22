# FS-03 / File 03 — Effects, Forms, State Management & Performance

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** Frontend framework engineering + performance

---

# 1. Objective

Master:

- `useEffect`;
- cleanup;
- dependency reasoning;
- race conditions;
- controlled forms;
- local/global/server state distinction;
- memoization;
- performance profiling;
- virtualization awareness;
- avoid unnecessary effects.

---

# 2. 5W+H

## What?

Effects synchronize React components with external systems.

## Why?

UI often interacts with:

- network;
- timers;
- subscriptions;
- browser APIs.

## Where?

React components with external synchronization.

## When?

Use effects when something outside React needs synchronization—not for every computation.

## How?

Run effect after commit; cleanup previous subscription/work where appropriate.

---

# 3. Real-Life Analogy

An effect is like opening a phone call after a meeting starts.

When the meeting topic changes or ends, you should close the old call before opening the next one.

---

# 4. Visualization

```text
Render
 ↓
Commit UI
 ↓
Effect runs
 ↓
External system

Dependency changes / unmount
 ↓
Cleanup
 ↓
New effect / stop
```

---

# 5. Mind Map

```text
React Effects
│
├── useEffect
├── Dependencies
├── Cleanup
├── Race
├── Form State
├── Client State
├── Server State
├── Memoization
└── Profiling
```

---

# 6. Core Concepts

## 6.1 Effect Purpose

Good effect:

```tsx
useEffect(() => {
  const connection = connect(roomId);
  return () => connection.disconnect();
}, [roomId]);
```

It synchronizes with an external connection.

---

## 6.2 Avoid Effect for Derived Values

Bad:

```tsx
useEffect(() => {
  setFullName(first + " " + last);
}, [first, last]);
```

Better:

```tsx
const fullName = `${first} ${last}`;
```

---

## 6.3 Dependency Array

Dependencies should reflect values used by effect from render scope.

Do not remove dependencies merely to silence linter.

Instead redesign unstable logic if needed.

---

## 6.4 Cleanup

Needed for:

- subscriptions;
- timers;
- listeners;
- in-flight requests where cancellation matters.

---

## 6.5 Fetch Race

User changes `userId` quickly:

```text
Request A starts
Request B starts
B returns
A returns later
A overwrites B
```

Need cancellation or stale-response guard.

---

## 6.6 AbortController

```tsx
useEffect(() => {
  const controller = new AbortController();

  async function load() {
    const response = await fetch(
      `/api/users/${userId}`,
      { signal: controller.signal }
    );
    // handle
  }

  load();

  return () => controller.abort();
}, [userId]);
```

---

## 6.7 Controlled Forms

```tsx
<input
  value={name}
  onChange={e => setName(e.target.value)}
/>
```

Useful for validation and state coordination.

---

## 6.8 State Categories

### Local UI state
Modal open, selected tab.

### Shared client state
Theme, current draft shared across components.

### Server state
Data fetched from backend with caching/freshness semantics.

Do not treat all three the same.

---

## 6.9 Memoization

Tools include:

- `useMemo`;
- `useCallback`;
- component memoization.

Use when measurement/identity requirements justify.

Memoization itself has complexity/cost.

---

## 6.10 Large Lists

For thousands of rows:

- pagination;
- virtualization;
- avoid unnecessary work;
- stable keys.

Do not render 100k DOM nodes blindly.

---

# 7. Engineering Depth

## 7.1 Server-State Libraries

Libraries can manage:

- cache;
- stale/fresh state;
- refetch;
- deduplication;
- mutations.

Architect principle:

> Server state has different lifecycle from local UI state.

Do not duplicate fetched data unnecessarily into generic global state.

---

## 7.2 Performance Flow

```text
Observe slowness
→ profile
→ identify expensive render/work
→ reduce state scope
→ split component
→ memoize if useful
→ virtualize/paginate if needed
→ remeasure
```

---

# 8. Implementation / Code

```tsx
function UserProfile({ userId }: { userId: string }) {
  const [state, setState] = useState<
    | { status: "loading" }
    | { status: "success"; name: string }
    | { status: "error"; message: string }
  >({ status: "loading" });

  useEffect(() => {
    const controller = new AbortController();

    async function load() {
      setState({ status: "loading" });

      try {
        const response = await fetch(
          `/api/users/${userId}`,
          { signal: controller.signal }
        );

        if (!response.ok) {
          throw new Error(`HTTP ${response.status}`);
        }

        const user = await response.json();
        setState({ status: "success", name: user.name });
      } catch (error) {
        if (!controller.signal.aborted) {
          setState({ status: "error", message: "Unable to load user" });
        }
      }
    }

    load();

    return () => controller.abort();
  }, [userId]);

  // render state...
}
```

---

# 9. Hands-On Practice

Find problem:

```tsx
useEffect(() => {
  setTotal(items.reduce((a, b) => a + b.price, 0));
}, [items]);
```

If total is purely derived, compute during render instead.

---

# 10. Google Interview Drill

## Problem — Search-As-You-Type

Requirements:

- query backend;
- avoid one request per keystroke immediately;
- newest result must win;
- loading state;
- cancellation.

### Clarify

- minimum chars?
- debounce duration?
- cache repeated queries?
- server pagination?

### First Approach

Fetch on every keypress.

Problems:

- excess traffic;
- race;
- flicker.

### Improve

- debounced query;
- cancel previous request;
- server-state caching where useful.

### Edge Cases

- user clears input;
- 429;
- slow old request;
- component unmount;
- duplicate query.

### Follow-Up

At scale:

- backend rate limit;
- prefix cache;
- CDN?
- search index;
- analytics privacy?

---

# 11. Common Mistakes

1. Effect for derived state.
2. Missing cleanup.
3. Suppressing dependency warnings.
4. Stale closure.
5. Race on fetch.
6. Memoizing everything.
7. Global state for every state.
8. Rendering huge lists directly.
9. No loading/error/empty state.

---

# 12. Best Practices

- effects only for external synchronization;
- cancel stale requests;
- model explicit UI states;
- keep state local when possible;
- treat server state separately;
- profile before memoizing;
- virtualize large lists.

---

# 13. Interview Questions

1. What is `useEffect` for?
2. When not to use it?
3. Why cleanup?
4. Dependency array?
5. Stale closure?
6. Fetch race?
7. Controlled form?
8. Local vs global vs server state?
9. `useMemo` vs `useCallback`?
10. How optimize large list?

---

# 14. Google-Level Follow-Ups

1. debounce vs throttle?
2. abort fetch?
3. offline cache?
4. stale result?
5. optimistic updates?
6. infinite scroll?
7. server-side pagination?
8. profile render?

---

# 15. Quick Revision

```text
Effect = external synchronization
Derived value ≠ effect
Dependencies reflect used values
Cleanup subscriptions/timers/requests
Abort stale requests
Local state ≠ server state
Memoize after evidence
Large list → paginate/virtualize
```

---

# 16. Readiness Gate

- [ ] Effect purpose.
- [ ] Dependencies.
- [ ] Cleanup.
- [ ] Race/cancellation.
- [ ] Form state.
- [ ] State categories.
- [ ] Performance flow.
- [ ] Search drill.

**Gate:** READY / REPAIR

---

# 17. References

- React official documentation
- MDN AbortController
