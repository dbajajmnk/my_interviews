# Day 29 — Senior Go Architect Scenarios & Capstone Challenge

**Module:** M23 — Senior Engineering Scenarios & Capstone Challenge  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Legacy service modernization](01-Legacy-service-modernization.md)
2. [Java/Node to Go migration decision](02-Java-Node-to-Go-migration-decision.md)
3. [Monolith modernization](03-Monolith-modernization.md)
4. [Goroutine leak incident](04-Goroutine-leak-incident.md)
5. [Memory growth incident](05-Memory-growth-incident.md)
6. [Latency incident](06-Latency-incident.md)
7. [Database bottleneck](07-Database-bottleneck.md)
8. [Race-condition incident](08-Race-condition-incident.md)
9. [Framework vs stdlib decision](09-Framework-vs-stdlib-decision.md)
10. [gRPC adoption decision](10-gRPC-adoption-decision.md)
11. [Event-driven migration](11-Event-driven-migration.md)
12. [Microservice extraction decision](12-Microservice-extraction-decision.md)
13. [Observability redesign](13-Observability-redesign.md)
14. [Security incident](14-Security-incident.md)
15. [Technical debt](15-Technical-debt.md)
16. [Client trade-offs](16-Client-trade-offs.md)
17. [Architecture review](17-Architecture-review.md)
18. [AI integration](18-AI-integration.md)
19. [Team coding standards](19-Team-coding-standards.md)
20. [Capstone challenge](20-Capstone-challenge.md)

---

# 2. Real-Life Analogy

Day 29 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Scenario → Clarify/Evidence → Baseline → Trade-Off → Migration → Measure
```

---

# 4. Mind Map

```text
Senior Go Architect Scenarios & Capstone Challenge
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

Complete migration, incident and architecture scenarios; design a production Go platform.

---

# 8. Google Interview Drill

Capstone: design a multi-tenant enterprise platform in Go with SQL, object storage, async workflows and optional AI capability.

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
