# Day 29 — Senior C++ Architect Scenarios & Capstone Challenge

**Module:** M23 — Senior Engineering Scenarios & Capstone Challenge  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Legacy C++ modernization](01-Legacy-C-modernization.md)
2. [C to modern C++ migration awareness](02-C-to-modern-C-migration-awareness.md)
3. [Raw pointer to RAII migration](03-Raw-pointer-to-RAII-migration.md)
4. [Threading redesign](04-Threading-redesign.md)
5. [ABI compatibility migration](05-ABI-compatibility-migration.md)
6. [Monolith modernization](06-Monolith-modernization.md)
7. [Memory leak incident](07-Memory-leak-incident.md)
8. [Use-after-free incident](08-Use-after-free-incident.md)
9. [Latency incident](09-Latency-incident.md)
10. [Deadlock incident](10-Deadlock-incident.md)
11. [Race-condition incident](11-Race-condition-incident.md)
12. [Compiler upgrade impact](12-Compiler-upgrade-impact.md)
13. [Standard upgrade decision](13-Standard-upgrade-decision.md)
14. [Build-system modernization](14-Build-system-modernization.md)
15. [Library replacement decision](15-Library-replacement-decision.md)
16. [Security incident](16-Security-incident.md)
17. [Technical debt](17-Technical-debt.md)
18. [Client trade-offs](18-Client-trade-offs.md)
19. [Architecture review](19-Architecture-review.md)
20. [AI integration](20-AI-integration.md)
21. [Team coding standard](21-Team-coding-standard.md)
22. [Capstone challenge](22-Capstone-challenge.md)

---

# 2. Real-Life Analogy

Day 29 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Scenario → Clarify/Evidence → Baseline → Risk/Trade-Off → Migration → Measure
```

---

# 4. Mind Map

```text
Senior C++ Architect Scenarios & Capstone Challenge
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

Complete modernization, incident and architecture scenarios; design a production C++ platform where the language is justified.

---

# 8. Google Interview Drill

Capstone: design a high-throughput C++ service with SQL, async workflows, observability, hardening and optional AI integration.

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
