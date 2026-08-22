# Day 11 — Goroutines, Channels, select & Structured Concurrency with context

**Module:** M10 — Concurrency / Async  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Goroutines](01-Goroutines.md)
2. [go statement](02-go-statement.md)
3. [Channel types](03-Channel-types.md)
4. [Unbuffered channels](04-Unbuffered-channels.md)
5. [Buffered channels](05-Buffered-channels.md)
6. [Send](06-Send.md)
7. [Receive](07-Receive.md)
8. [Channel close](08-Channel-close.md)
9. [Range over channel](09-Range-over-channel.md)
10. [Who closes a channel](10-Who-closes-a-channel.md)
11. [select](11-select.md)
12. [default case](12-default-case.md)
13. [Timeout with select awareness](13-Timeout-with-select-awareness.md)
14. [context.Context](14-context-Context.md)
15. [Cancellation](15-Cancellation.md)
16. [Deadlines](16-Deadlines.md)
17. [Timeouts](17-Timeouts.md)
18. [Context propagation](18-Context-propagation.md)
19. [Context values caution](19-Context-values-caution.md)
20. [WaitGroup](20-WaitGroup.md)
21. [errgroup awareness](21-errgroup-awareness.md)
22. [Fan-out](22-Fan-out.md)
23. [Fan-in](23-Fan-in.md)
24. [Worker pools](24-Worker-pools.md)
25. [Pipeline pattern](25-Pipeline-pattern.md)
26. [Goroutine leaks](26-Goroutine-leaks.md)

---

# 2. Real-Life Analogy

Channels are conveyor belts between goroutines; context is the stop signal that should shut down the whole line when the request ends.

---

# 3. Visualization

```text
Request Context → Goroutines/Channels → select → cancel/deadline → join
```

---

# 4. Mind Map

```text
Goroutines, Channels, select & Structured Concurrency with context
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
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

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a cancellable worker pool and fan-out/fan-in pipeline with context and clean shutdown.

---

# 8. Google Interview Drill

A request handler starts goroutines that survive after the client disconnects. Find the leak and fix lifetime ownership.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
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
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
