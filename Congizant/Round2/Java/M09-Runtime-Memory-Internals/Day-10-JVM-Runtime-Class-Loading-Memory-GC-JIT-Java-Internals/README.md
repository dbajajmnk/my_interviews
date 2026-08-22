# Day 10 — JVM Runtime, Class Loading, Memory, GC, JIT & Java Internals

**Module:** M09 — Runtime, Memory & Internals  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [class loading](01-class-loading.md)
2. [heap/stack/metaspace](02-heap-stack-metaspace.md)
3. [object allocation](03-object-allocation.md)
4. [GC roots](04-GC-roots.md)
5. [generational GC](05-generational-GC.md)
6. [JIT](06-JIT.md)
7. [escape analysis awareness](07-escape-analysis-awareness.md)
8. [reference types](08-reference-types.md)
9. [memory leaks](09-memory-leaks.md)
10. [OOM vs stack overflow](10-OOM-vs-stack-overflow.md)

---

# 2. Real-Life Analogy

The JVM is an automated factory: class loaders bring in blueprints, the heap stores products, stacks track active work orders, GC removes unreachable inventory, and JIT optimizes hot assembly lines.

---

# 3. Visualization

```text
Class Load → Bytecode Execute → Allocate → GC Reachability → JIT Profile/Optimize → Runtime Metrics
```

---

# 4. Mind Map

```text
JVM Runtime, Class Loading, Memory, GC, JIT & Java Internals
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Analyze scenarios: StackOverflowError recursion, OutOfMemoryError heap, metaspace growth, unbounded static cache, thread leak. For each, state evidence/tools you would collect.

---

# 8. Google Interview Drill

A Java service memory rises until OOM every 12 hours. Explain heap dump, GC logs/metrics, dominator/retained-size reasoning, allocation rate, leak suspects, and verification after fix.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Saying local variables always live physically only on stack
- Assuming GC prevents all memory leaks
- Tuning GC before finding allocation/leak issue
- Calling `System.gc()` as fix
- Ignoring native/off-heap/thread memory

---

# 10. Day-Level Best Practices

- Use runtime evidence
- Understand reachability
- Track allocation + GC + live set
- Bound caches/resources
- Treat GC choice/tuning as workload-specific

---

# 11. Interview Questions

1. Heap vs stack?
2. What is metaspace?
3. What are GC roots?
4. How can Java leak memory?
5. JIT?
6. Class loading phases?
7. OOM vs StackOverflowError?

---

# 12. Google-Level Follow-Ups

1. Strong/weak/soft/phantom references?
2. What is safepoint awareness?
3. How would container memory limits affect JVM?
4. How do you distinguish leak from high legitimate live set?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
