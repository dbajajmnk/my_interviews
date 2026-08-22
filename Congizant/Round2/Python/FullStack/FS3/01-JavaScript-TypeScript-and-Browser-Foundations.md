# FS-03 / File 01 — JavaScript, TypeScript & Browser Foundations

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** Full-stack language/runtime bridge

---

# 1. Objective

Master the JavaScript/TypeScript concepts most likely to affect React engineering:

- values, references, equality;
- scope and closures;
- `let`, `const`, `var`;
- functions and arrow functions;
- objects/arrays and immutability;
- promises;
- event loop;
- microtask/macrotask awareness;
- TypeScript static typing;
- interfaces/types/generics/unions;
- browser storage and networking basics.

---

# 2. 5W+H

## What?

JavaScript is the browser execution language; TypeScript adds compile-time type checking and tooling.

## Why?

React behavior depends on JavaScript semantics. TypeScript improves refactoring and contract clarity but does not replace runtime validation.

## Where?

Browser UI, Node tooling, frontend applications.

## When?

Every React implementation and code review.

## How?

JavaScript runs on an event-driven runtime; TypeScript is transformed/compiled to JavaScript before runtime.

---

# 3. Real-Life Analogy

TypeScript is like engineering drawings checked before construction.

The browser still runs the actual building material—JavaScript.

---

# 4. Visualization

```text
TypeScript
   ↓
Type Check / Build
   ↓
JavaScript
   ↓
Browser Runtime
   ├── Call Stack
   ├── Web APIs
   ├── Task Queues
   └── Event Loop
```

---

# 5. Mind Map

```text
JS / TS
│
├── Scope
├── Closure
├── Object Reference
├── Equality
├── Promise
├── Event Loop
├── TypeScript
│   ├── union
│   ├── interface/type
│   └── generics
└── Browser
    ├── fetch
    └── storage
```

---

# 6. Core Concepts

## 6.1 `let`, `const`, `var`

Prefer:

- `const` when binding does not need reassignment;
- `let` when reassignment is needed.

`var` has function scope and hoisting behavior that can create surprises.

Important:

```javascript
const user = { name: "A" };
user.name = "B"; // allowed
```

`const` prevents rebinding, not object mutation.

---

## 6.2 Equality

Prefer strict equality:

```javascript
a === b
```

rather than loose coercing equality:

```javascript
a == b
```

unless coercion is intentional and understood.

---

## 6.3 Reference Semantics

```javascript
const a = { count: 1 };
const b = a;
b.count = 2;
```

Both names reference the same object.

This matters heavily for React state updates.

---

## 6.4 Shallow Copy

```javascript
const next = { ...current };
```

Only top-level object is copied.

Nested objects may still share references.

---

## 6.5 Closure

```javascript
function makeCounter() {
  let count = 0;

  return () => ++count;
}
```

Returned function remembers lexical environment.

Closures power:

- callbacks;
- hooks;
- event handlers;
- memoized behavior.

They can also cause stale-state bugs when used incorrectly.

---

## 6.6 Promise

A Promise represents future completion/failure.

```javascript
fetch("/api/users")
  .then(r => r.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));
```

With async/await:

```javascript
const response = await fetch("/api/users");
```

---

## 6.7 Event Loop

JavaScript execution is single-threaded at the main call-stack level, while browser APIs perform asynchronous work.

Conceptually:

```text
Call Stack
   ↓
Async Browser Work
   ↓
Queue
   ↓
Event Loop
   ↓
Call Stack
```

Promises schedule microtasks, which are generally processed before normal task/macrotask queue work after the current stack completes.

Do not over-focus on terminology unless asked.

---

## 6.8 TypeScript Is Compile-Time

```typescript
function greet(name: string): string {
  return `Hello ${name}`;
}
```

TypeScript checks developers' code but external JSON still requires runtime validation.

---

## 6.9 Union

```typescript
type Status = "idle" | "loading" | "success" | "error";
```

Useful for making illegal UI states harder to represent.

---

## 6.10 Interface vs Type

Both can describe object shapes.

Do not turn this into dogma.

Use team consistency and required features.

---

## 6.11 Generics

```typescript
type ApiResponse<T> = {
  data: T;
  requestId: string;
};
```

Preserves type relationships without losing specificity.

---

## 6.12 Browser Storage

### localStorage
Persistent per-origin client storage.

### sessionStorage
Per-tab/session-style lifetime.

Do not store sensitive credentials carelessly.

Browser storage is accessible to JavaScript, so XSS risk matters.

---

# 7. Engineering Depth

## 7.1 TypeScript Does Not Validate API Data

Bad assumption:

```typescript
const user: User = await response.json();
```

This annotation does not prove response is valid `User`.

External data needs runtime validation where trust matters.

---

## 7.2 Stale Closure

Callbacks can capture state from a particular render.

This becomes important in:

- timers;
- effects;
- subscriptions;
- asynchronous callbacks.

---

# 8. Implementation / Code

```typescript
type User = {
  id: number;
  name: string;
};

async function loadUser(id: number): Promise<User> {
  const response = await fetch(`/api/users/${id}`);

  if (!response.ok) {
    throw new Error(`HTTP ${response.status}`);
  }

  return response.json();
}
```

Production code should also consider runtime schema validation where needed.

---

# 9. Hands-On Practice

Explain output/order:

```javascript
console.log("A");

Promise.resolve().then(() => console.log("B"));

setTimeout(() => console.log("C"), 0);

console.log("D");
```

Typical order:

```text
A
D
B
C
```

Explain stack → microtask → timer task.

---

# 10. Google Interview Drill

## Problem — Build a Generic API Result Type

Need UI states:

- loading;
- success with data;
- error with message.

### First Approach

```typescript
type State<T> = {
  loading: boolean;
  data?: T;
  error?: string;
};
```

Problem:

Impossible combinations are allowed:

```text
loading=true + data + error
```

### Improve

Discriminated union:

```typescript
type State<T> =
  | { status: "loading" }
  | { status: "success"; data: T }
  | { status: "error"; message: string };
```

### Test Reasoning

Each state has only relevant fields.

### Follow-Up

Add idle and stale-cache state only if product requires them.

### Goal

> Use type system to model valid states, not merely annotate variables.

---

# 11. Common Mistakes

1. `const` assumed immutable object.
2. Shallow copy assumed deep.
3. Loose equality used casually.
4. TypeScript assumed runtime validation.
5. `any` used everywhere.
6. Ignoring promise rejection.
7. Blocking main thread with heavy computation.
8. Storing secrets in browser storage.

---

# 12. Best Practices

- prefer `const`;
- immutable state updates;
- strict equality;
- model valid states with unions;
- avoid unnecessary `any`;
- validate untrusted server data;
- understand async ordering;
- keep secrets server-side where possible.

---

# 13. Interview Questions

1. `let` vs `const` vs `var`?
2. `==` vs `===`?
3. What is closure?
4. Shallow vs deep copy?
5. Promise?
6. Event loop?
7. Microtask vs task awareness?
8. TypeScript runtime or compile-time?
9. Interface vs type?
10. Generic use case?
11. Why runtime validation still needed?

---

# 14. Google-Level Follow-Ups

1. stale closure?
2. CPU-heavy work in browser?
3. web worker?
4. 100k-row transformation?
5. runtime schema validation?
6. XSS and localStorage?
7. cancellation with fetch?

---

# 15. Quick Revision

```text
const = binding not reassigned
Object can still mutate
=== avoids coercion
Closure captures lexical scope
Promise = future result
Event loop schedules async callbacks
TypeScript = compile-time
External JSON still untrusted
Union can model valid UI states
```

---

# 16. Readiness Gate

- [ ] Scope/closure.
- [ ] Reference/mutation.
- [ ] Promise/event loop.
- [ ] TS compile-time role.
- [ ] Generics/unions.
- [ ] Runtime validation distinction.
- [ ] State-model drill.

**Gate:** READY / REPAIR

---

# 17. References

- MDN JavaScript documentation
- TypeScript Handbook
