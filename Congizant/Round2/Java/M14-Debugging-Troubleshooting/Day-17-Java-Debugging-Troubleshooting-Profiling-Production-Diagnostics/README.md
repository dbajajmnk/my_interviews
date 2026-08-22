# Day 17 — Java Debugging, Troubleshooting, Profiling & Production Diagnostics

**Module:** M14 — Debugging & Troubleshooting  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [debug workflow](01-debug-workflow.md)
2. [stack traces](02-stack-traces.md)
3. [logging](03-logging.md)
4. [breakpoints](04-breakpoints.md)
5. [thread dumps](05-thread-dumps.md)
6. [heap dumps](06-heap-dumps.md)
7. [JFR/JMC awareness](07-JFR-JMC-awareness.md)
8. [jcmd/jstack/jmap awareness](08-jcmd-jstack-jmap-awareness.md)
9. [GC logs](09-GC-logs.md)
10. [profiling](10-profiling.md)
11. [production evidence](11-production-evidence.md)

---

# 2. Real-Life Analogy

Debugging is detective work: thread dumps, heap dumps, traces, and profiles are different kinds of evidence from the scene.

---

# 3. Visualization

```text
Symptom → Evidence → Hypothesis → Isolate → Fix → Regression Test → Monitor
```

---

# 4. Mind Map

```text
Java Debugging, Troubleshooting, Profiling & Production Diagnostics
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

Given symptoms—100% CPU, deadlock, memory leak, GC pauses, slow DB calls—write the first three pieces of evidence you would collect before changing code.

---

# 8. Google Interview Drill

Production latency jumps only at p99. Use traces, thread dump/JFR, DB pool metrics, GC, and downstream timings to isolate cause. Explain why average CPU alone is insufficient.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Restarting before evidence every time
- Adding random logs
- Heap dump for CPU issue without reason
- Profiling development toy workload only
- Changing five things at once

---

# 10. Day-Level Best Practices

- Preserve evidence
- Correlate request IDs/traces
- Use the right diagnostic artifact
- Reproduce under representative load
- Verify after fix

---

# 11. Interview Questions

1. How debug high CPU?
2. How debug memory leak?
3. Thread dump use?
4. Heap dump use?
5. JFR/JMC?
6. How diagnose deadlock?
7. How debug p99 latency?

---

# 12. Google-Level Follow-Ups

1. What if issue disappears after restart?
2. How reduce diagnostic overhead?
3. How distinguish GC pause from lock contention?
4. What if only one pod is bad?

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
