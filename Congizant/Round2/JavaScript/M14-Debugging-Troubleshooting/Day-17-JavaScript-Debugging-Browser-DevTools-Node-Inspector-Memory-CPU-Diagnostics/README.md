# Day 17 — JavaScript Debugging, Browser DevTools, Node Inspector & Memory/CPU Diagnostics

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [Debugging workflow](01-Debugging-workflow.md)
2. [Browser DevTools](02-Browser-DevTools.md)
3. [Node inspector](03-Node-inspector.md)
4. [Breakpoints](04-Breakpoints.md)
5. [Conditional breakpoints](05-Conditional-breakpoints.md)
6. [Async stack traces](06-Async-stack-traces.md)
7. [Source maps](07-Source-maps.md)
8. [Console logging discipline](08-Console-logging-discipline.md)
9. [Performance profiles](09-Performance-profiles.md)
10. [CPU profiling](10-CPU-profiling.md)
11. [Heap snapshots](11-Heap-snapshots.md)
12. [Allocation profiling](12-Allocation-profiling.md)
13. [Event-loop lag](13-Event-loop-lag.md)
14. [Memory leak diagnosis](14-Memory-leak-diagnosis.md)
15. [Network panel](15-Network-panel.md)
16. [Unhandled promises](16-Unhandled-promises.md)
17. [One-process anomaly diagnosis](17-One-process-anomaly-diagnosis.md)

---

# 2. Real-Life Analogy

Debugging is detective work: use the evidence that matches the symptom—network trace, async stack, CPU profile, heap snapshot, or event-loop lag.

---

# 3. Visualization

```text
Symptom → Evidence → Hypothesis → Isolate → Fix → Regression → Monitor
```

---

# 4. Mind Map

```text
JavaScript Debugging, Browser DevTools, Node Inspector & Memory/CPU Diagnostics
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
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

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Diagnose one CPU issue, one memory leak, one async ordering bug, and one network/API failure using the correct diagnostic artifact.

---

# 8. Google Interview Drill

p99 latency is high while CPU average is low. Use traces, event-loop lag, downstream timings, connection pools, and async stacks instead of adding more Node processes blindly.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
