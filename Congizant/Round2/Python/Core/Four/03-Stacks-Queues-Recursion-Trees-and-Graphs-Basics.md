# PY-04 / File 03 — Stacks, Queues, Recursion, Trees & Graphs Basics

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M13 Coding & DSA

---

# 1. Objective

Master enough depth for senior full-stack interviews:

- stack;
- queue/deque;
- recursion;
- DFS;
- BFS;
- tree traversal;
- graph representation;
- visited set;
- cycle awareness;
- complexity.

This is not a competitive-programming deep dive.

---

# 2. 5W+H

## What?

These structures model nested, ordered, hierarchical, and connected problems.

## Why?

They appear in parsing, dependency graphs, workflows, trees, routing, and state exploration.

## Where?

- expression validation;
- filesystem;
- org hierarchy;
- dependency graph;
- API orchestration;
- workflow graph.

## When?

Use based on traversal/order semantics.

## How?

Stack → LIFO  
Queue → FIFO  
DFS → depth-first  
BFS → level-first

---

# 3. Real-Life Analogy

Stack:

> plates — last placed, first removed.

Queue:

> ticket line — first arrived, first served.

Tree:

> organization chart.

Graph:

> city road network.

---

# 4. Visualization

```text
Tree

       A
      / \
     B   C
    / \
   D   E

DFS: A B D E C
BFS: A B C D E
```

---

# 5. Mind Map

```text
Structures
│
├── Stack
├── Queue / deque
├── Recursion
├── Tree
│   ├── DFS
│   └── BFS
└── Graph
    ├── adjacency list
    └── visited set
```

---

# 6. Core Concepts

## 6.1 Stack

Python list can be stack:

```python
stack = []
stack.append(1)
value = stack.pop()
```

Use for:

- nested brackets;
- DFS;
- undo;
- parsing.

---

## 6.2 Queue

Prefer `collections.deque`:

```python
from collections import deque

queue = deque()
queue.append(1)
value = queue.popleft()
```

Avoid repeated `list.pop(0)` for large queues because shifting is O(n).

---

## 6.3 Recursion

A recursive function needs:

- base case;
- progress toward base case.

Example factorial:

```python
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)
```

Python recursion depth is limited, so deep iterative traversal may be safer.

---

## 6.4 DFS

Recursive:

```python
def dfs(node):
    if node is None:
        return

    visit(node)
    dfs(node.left)
    dfs(node.right)
```

---

## 6.5 BFS

```python
from collections import deque

def bfs(root):
    if root is None:
        return []

    result = []
    queue = deque([root])

    while queue:
        node = queue.popleft()
        result.append(node.value)

        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)

    return result
```

---

## 6.6 Graph Representation

Adjacency list:

```python
graph = {
    "A": ["B", "C"],
    "B": ["D"],
    "C": [],
    "D": [],
}
```

---

## 6.7 Visited Set

For graph traversal:

```python
visited = set()
```

Prevents repeated processing/cycles.

---

# 7. Engineering Depth

## 7.1 DFS vs BFS

DFS:

- deep exploration;
- stack/recursion;
- path-style searches.

BFS:

- level order;
- shortest path in unweighted graph;
- queue.

---

## 7.2 Recursion Risk

Deep graph/tree can trigger recursion limit.

Iterative stack may be safer.

---

## 7.3 Graphs in Architecture

Real examples:

- service dependency graph;
- workflow DAG;
- package dependency graph;
- AI agent state graph;
- authorization relationship graph.

---

# 8. Implementation / Code

## Valid Parentheses

```python
def valid_parentheses(s):
    pairs = {
        ")": "(",
        "]": "[",
        "}": "{",
    }

    stack = []

    for ch in s:
        if ch in "([{":
            stack.append(ch)
        elif ch in pairs:
            if not stack or stack.pop() != pairs[ch]:
                return False

    return not stack
```

---

# 9. Hands-On Practice

1. Valid parentheses
2. Reverse a string using stack
3. BFS traversal
4. DFS traversal
5. Detect reachable node in graph
6. Maximum tree depth

---

# 10. Google Interview Drill

## Problem — Service Dependency Reachability

Given directed dependencies, determine whether service `A` eventually depends on service `B`.

### Clarify

- directed?
- cycles possible? yes;
- large graph?
- return path or boolean?

### First Approach

DFS.

```python
def depends_on(graph, start, target):
    visited = set()
    stack = [start]

    while stack:
        node = stack.pop()

        if node == target:
            return True

        if node in visited:
            continue

        visited.add(node)
        stack.extend(graph.get(node, []))

    return False
```

### Test

- start == target;
- disconnected;
- cycle;
- missing node.

### Complexity

O(V + E) time, O(V) space.

### Follow-Up

Need shortest dependency chain?

Use BFS.

### Architecture Follow-Up

How would you detect cyclic service dependencies?

Use DFS coloring/state or topological-analysis concepts.

---

# 11. Common Mistakes

1. Missing base case.
2. No visited set in cyclic graph.
3. `pop(0)` queue.
4. Confusing DFS and BFS guarantees.
5. Recursive overflow on deep graph.
6. Wrong complexity.
7. Treating tree like graph without considering cycles/context.

---

# 12. Best Practices

- use `deque` for FIFO;
- track visited;
- choose traversal by requirement;
- prefer iterative for very deep structures;
- state complexity in V/E for graphs.

---

# 13. Interview Questions

1. Stack vs queue?
2. Why deque?
3. Recursion pros/cons?
4. DFS vs BFS?
5. When BFS gives shortest path?
6. Why visited set?
7. Tree vs graph?
8. Graph complexity?

---

# 14. Google-Level Follow-Ups

1. shortest path?
2. weighted graph?
3. cycle detection?
4. millions of nodes?
5. graph distributed across services?
6. return path rather than boolean?

---

# 15. Quick Revision

```text
Stack = LIFO
Queue = FIFO / deque
DFS = depth
BFS = level / unweighted shortest path
Graph traversal needs visited
Graph complexity = O(V+E)
Deep recursion can fail
```

---

# 16. Readiness Gate

- [ ] Stack.
- [ ] Queue/deque.
- [ ] Recursion.
- [ ] DFS.
- [ ] BFS.
- [ ] Visited set.
- [ ] Reachability problem.
- [ ] O(V+E).

**Gate:** READY / REPAIR

---

# 17. References

- Python `collections.deque`
- Standard graph/tree algorithm references
