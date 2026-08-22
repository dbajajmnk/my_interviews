# Day 17 — Kotlin/JVM Debugging, Coroutines Diagnostics, Memory & CPU Troubleshooting

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [Debugging workflow](01-Debugging-workflow.md)
2. [IDE debugger awareness](02-IDE-debugger-awareness.md)
3. [Breakpoints](03-Breakpoints.md)
4. [Coroutine debugger awareness](04-Coroutine-debugger-awareness.md)
5. [Stack traces](05-Stack-traces.md)
6. [Thread dumps](06-Thread-dumps.md)
7. [Heap dumps](07-Heap-dumps.md)
8. [JFR awareness](08-JFR-awareness.md)
9. [JMC awareness](09-JMC-awareness.md)
10. [CPU profiling](10-CPU-profiling.md)
11. [Allocation profiling](11-Allocation-profiling.md)
12. [GC logs awareness](12-GC-logs-awareness.md)
13. [Coroutine dumps awareness](13-Coroutine-dumps-awareness.md)
14. [Deadlock diagnosis](14-Deadlock-diagnosis.md)
15. [Suspension vs blocking diagnosis](15-Suspension-vs-blocking-diagnosis.md)
16. [Database wait diagnosis](16-Database-wait-diagnosis.md)
17. [Network tracing](17-Network-tracing.md)
18. [One-pod anomaly diagnosis](18-One-pod-anomaly-diagnosis.md)
19. [Root-cause evidence](19-Root-cause-evidence.md)

---

# 2. Real-Life Analogy

Debugging is evidence matching: coroutine dump for leaked/suspended work, thread dump for blocking, heap dump for retention, JFR for runtime behavior.

---

# 3. Visualization

```text
Symptom → matching diagnostic artifact → hypothesis → fix → regression
```

---

# 4. Mind Map

```text
Kotlin/JVM Debugging, Coroutines Diagnostics, Memory & CPU Troubleshooting
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Diagnose CPU, memory, coroutine-blocking and latency scenarios using the right artifact.

---

# 8. Google Interview Drill

p99 latency rises while CPU is low. Choose traces, coroutine/thread dumps, pool metrics and downstream timings.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
