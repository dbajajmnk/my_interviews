# FS-03 / File 02 — React Components, State, Hooks & Rendering

**Priority:** P0  
**Suggested Time:** 75 minutes  
**GOJ Mapping:** Frontend framework engineering

---

# 1. Objective

Master:

- component model;
- props;
- state;
- one-way data flow;
- composition;
- hooks;
- rendering;
- reconciliation awareness;
- keys;
- controlled updates;
- derived state;
- lifting state.

---

# 2. 5W+H

## What?

React builds UI as a tree of components that render based on props and state.

## Why?

Declarative rendering makes UI easier to reason about than manually synchronizing DOM changes.

## Where?

Web applications and full-stack frontends.

## When?

For interactive UI with reusable component structure.

## How?

State/props change → React renders component tree → reconciles changes → updates DOM.

---

# 3. Real-Life Analogy

A React component is like a spreadsheet cell formula.

You define what the output should look like for current inputs; the system updates the displayed result when inputs change.

---

# 4. Visualization

```text
Props + State
     ↓
Component Render
     ↓
React Element Tree
     ↓
Reconciliation
     ↓
DOM Update
```

---

# 5. Mind Map

```text
React
│
├── Component
├── Props
├── State
├── Hooks
├── Render
├── Keys
├── Composition
└── Lifted State
```

---

# 6. Core Concepts

## 6.1 Component

```tsx
function Greeting({ name }: { name: string }) {
  return <h1>Hello {name}</h1>;
}
```

Components should ideally have clear responsibility.

---

## 6.2 Props

Inputs from parent.

Props should be treated as read-only.

---

## 6.3 State

```tsx
const [count, setCount] = useState(0);
```

State belongs to the component instance/render lifecycle.

Do not mutate state directly.

Bad:

```tsx
user.name = "B";
setUser(user);
```

Better:

```tsx
setUser(prev => ({ ...prev, name: "B" }));
```

---

## 6.4 One-Way Data Flow

```text
Parent state
   ↓ props
Child
   ↑ callback/event
Parent updates state
```

---

## 6.5 Functional Update

If next state depends on previous state:

```tsx
setCount(prev => prev + 1);
```

This avoids stale update reasoning.

---

## 6.6 Rendering

A render means React calls component function to compute UI representation.

Render should be:

- deterministic from inputs;
- free of uncontrolled side effects.

Do not perform network calls directly during render.

---

## 6.7 Reconciliation

React compares element trees and determines needed UI updates.

Interview-safe explanation:

> React uses element identity/type/key information to decide which existing component instances can be preserved versus recreated.

---

## 6.8 Keys

When rendering lists:

```tsx
items.map(item => (
  <Row key={item.id} item={item} />
))
```

Keys help React preserve identity.

Avoid array index as key when items can reorder/insert/delete and component state matters.

---

## 6.9 Derived State

Bad:

```tsx
const [fullName, setFullName] = useState("");
```

if `fullName` is always computed from first + last.

Prefer:

```tsx
const fullName = `${firstName} ${lastName}`;
```

Do not store what can be derived cheaply from current state/props.

---

## 6.10 Lift State Up

When sibling components need shared state, move state to common owner.

Do not immediately introduce global state.

---

## 6.11 Composition

Prefer composing focused components rather than deep inheritance hierarchies.

React naturally favors composition.

---

# 7. Engineering Depth

## 7.1 State Ownership

Ask:

> What is the smallest component boundary that needs to own this state?

Too high:

- unnecessary rerenders;
- complexity.

Too low:

- duplicate state;
- synchronization bugs.

---

## 7.2 Render Does Not Mean DOM Replaced Entirely

React can render component logic without necessarily changing actual DOM nodes.

Distinguish:

> render computation vs committed DOM updates.

---

## 7.3 Component Identity

Changing key/type can reset component state.

Useful intentionally, dangerous accidentally.

---

# 8. Implementation / Code

```tsx
type Todo = {
  id: string;
  title: string;
  done: boolean;
};

function TodoList({ todos }: { todos: Todo[] }) {
  return (
    <ul>
      {todos.map(todo => (
        <li key={todo.id}>
          {todo.title}
        </li>
      ))}
    </ul>
  );
}
```

---

# 9. Hands-On Practice

Review:

```tsx
function UserList({ users }) {
  return users.map((user, index) => (
    <UserCard key={index} user={user} />
  ));
}
```

Question:

What happens if rows reorder and `UserCard` has internal state?

Prefer stable user ID.

---

# 10. Google Interview Drill

## Problem — Shopping Cart Quantity

Requirements:

- increment/decrement;
- total derived from cart;
- cart rows reorder;
- parent needs total.

### Clarify

- quantity minimum?
- server persistence?
- optimistic update?
- multiple tabs?

### First Approach

Each row keeps its own quantity and parent separately keeps total.

Problem:

duplicated state can diverge.

### Improve

Single cart state owned by common parent/store.

```tsx
setCart(prev =>
  prev.map(item =>
    item.id === id
      ? { ...item, quantity: item.quantity + 1 }
      : item
  )
);
```

Total is derived:

```tsx
const total = cart.reduce(
  (sum, item) => sum + item.price * item.quantity,
  0
);
```

### Test

- quantity 1 → decrement;
- row removed;
- reorder;
- duplicate product ID impossible.

### Follow-Up

Persist to backend with optimistic update and rollback.

---

# 11. Common Mistakes

1. Mutating state.
2. Index keys for reorderable lists.
3. Storing derived state.
4. Side effects during render.
5. Global state too early.
6. Duplicated state.
7. Confusing render with DOM replacement.
8. Unstable keys resetting component state.

---

# 12. Best Practices

- immutable updates;
- stable keys;
- minimal state;
- derive values;
- lift only when necessary;
- composition over inheritance;
- keep render pure.

---

# 13. Interview Questions

1. Props vs state?
2. Why immutable state updates?
3. What triggers render?
4. What is reconciliation?
5. Why keys?
6. Why avoid index keys?
7. What is derived state?
8. Lifting state?
9. Functional state update?
10. Composition in React?

---

# 14. Google-Level Follow-Ups

1. 10k cart rows?
2. server state?
3. optimistic update?
4. concurrent edits?
5. rollback?
6. cache invalidation?
7. state persistence?

---

# 15. Quick Revision

```text
Props = input
State = owned UI data
Render should be pure
State update → render
Keys preserve identity
Avoid index keys when order changes
Do not store derived state
Lift state only when needed
Composition is default
```

---

# 16. Readiness Gate

- [ ] Props/state.
- [ ] Immutable update.
- [ ] Render/reconciliation.
- [ ] Keys.
- [ ] Derived state.
- [ ] Lift state.
- [ ] Cart drill.

**Gate:** READY / REPAIR

---

# 17. References

- React official documentation
