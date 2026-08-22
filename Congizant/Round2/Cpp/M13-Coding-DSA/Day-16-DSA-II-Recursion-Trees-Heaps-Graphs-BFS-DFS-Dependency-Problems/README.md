# Day 16 — DSA II: Recursion, Trees, Heaps, Graphs, BFS/DFS & Dependency Problems

**Module:** M13 — Coding & DSA  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Recursion](01-Recursion.md)
2. [Call stack depth](02-Call-stack-depth.md)
3. [Binary trees](03-Binary-trees.md)
4. [Tree traversal](04-Tree-traversal.md)
5. [BST awareness](05-BST-awareness.md)
6. [std::priority_queue](06-std-priority-queue.md)
7. [Heap algorithms awareness](07-Heap-algorithms-awareness.md)
8. [Top-K](08-Top-K.md)
9. [Graph representation](09-Graph-representation.md)
10. [Adjacency lists](10-Adjacency-lists.md)
11. [BFS](11-BFS.md)
12. [DFS](12-DFS.md)
13. [Visited set](13-Visited-set.md)
14. [Cycle detection](14-Cycle-detection.md)
15. [Topological sort](15-Topological-sort.md)
16. [V and E complexity](16-V-and-E-complexity.md)
17. [Iterative vs recursive traversal](17-Iterative-vs-recursive-traversal.md)
18. [Template graph helpers awareness](18-Template-graph-helpers-awareness.md)

---

# 2. Real-Life Analogy

Day 16 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Tree/Graph → BFS/DFS/Heap/Topo → Visited/State → Result
```

---

# 4. Mind Map

```text
DSA II: Recursion, Trees, Heaps, Graphs, BFS/DFS & Dependency Problems
├── Language Semantics
├── Lifetime / Ownership
├── Compiler / Linker / Runtime
├── Concurrency / Memory Model
├── Failure / Undefined Behavior
├── Debugging / Sanitizers
├── Code Review
├── AI Evaluation
├── Performance / Production
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → C++ Guarantee → Lifetime/Ownership → Compiler/Runtime Boundary → Failure/UB → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Implement tree depth, BFS, graph reachability, cycle detection, topological ordering and top-K.

---

# 8. Google Interview Drill

Given dependencies, detect a cycle and produce a valid build order in O(V+E).

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Raw ownership without RAII.
- Dangling pointers/references/views.
- Iterator invalidation.
- Incorrect copy/move semantics.
- Missing virtual destructor.
- Data races/atomic misuse.
- Overusing templates/patterns.
- Optimizing before profiling.

---

# 10. Day-Level Best Practices

- Rule of Zero first.
- RAII everywhere practical.
- Smart/value ownership explicit.
- Strong warnings + sanitizers.
- Const-correctness.
- Defined behavior only.
- Measure before optimization.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the C++ standard guarantee?
3. What is compiler/ABI/runtime-specific?
4. What can dangle, race, leak or invoke UB?
5. What tool would you use to prove the problem?
6. What simpler/safer design could replace this?

---

# 12. Google-Level Follow-Ups

1. What changes under optimization?
2. What changes under concurrency?
3. What changes if ownership becomes shared?
4. What changes across a shared-library ABI boundary?
5. What would ASan/TSan/profiler show?
6. What trade-off would make you choose another language/runtime?

---

# 13. Quick Revision

```text
What is it?
Who owns it?
When does lifetime end?
Can anything dangle?
What can be UB?
What allocates/copies/moves?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can explain ownership/lifetime/UB risks.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
