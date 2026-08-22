# Day 28 — Production Engineering: CMake Builds, Containers, CI/CD, Observability & Hardening

**Module:** M22 — Production Engineering & Deployment  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Production build profiles](01-Production-build-profiles.md)
2. [Debug symbols](02-Debug-symbols.md)
3. [Release optimization](03-Release-optimization.md)
4. [Sanitizer builds](04-Sanitizer-builds.md)
5. [Static analysis](05-Static-analysis.md)
6. [clang-tidy awareness](06-clang-tidy-awareness.md)
7. [cppcheck awareness](07-cppcheck-awareness.md)
8. [Compiler warnings](08-Compiler-warnings.md)
9. [Warnings as errors](09-Warnings-as-errors.md)
10. [Reproducible builds](10-Reproducible-builds.md)
11. [CMake presets awareness](11-CMake-presets-awareness.md)
12. [Artifact versioning](12-Artifact-versioning.md)
13. [Shared library deployment](13-Shared-library-deployment.md)
14. [ABI compatibility](14-ABI-compatibility.md)
15. [Containerization](15-Containerization.md)
16. [Docker](16-Docker.md)
17. [Multi-stage builds](17-Multi-stage-builds.md)
18. [Minimal images awareness](18-Minimal-images-awareness.md)
19. [Non-root containers](19-Non-root-containers.md)
20. [Kubernetes awareness](20-Kubernetes-awareness.md)
21. [Readiness vs liveness](21-Readiness-vs-liveness.md)
22. [Graceful shutdown](22-Graceful-shutdown.md)
23. [Rolling deployment](23-Rolling-deployment.md)
24. [Canary](24-Canary.md)
25. [Feature flags](25-Feature-flags.md)
26. [Backward-compatible migrations](26-Backward-compatible-migrations.md)
27. [CI/CD](27-CI-CD.md)
28. [Logs](28-Logs.md)
29. [Metrics](29-Metrics.md)
30. [Traces](30-Traces.md)
31. [Crash dumps](31-Crash-dumps.md)
32. [Alerts](32-Alerts.md)
33. [Runbooks](33-Runbooks.md)
34. [RPO/RTO](34-RPO-RTO.md)

---

# 2. Real-Life Analogy

Day 28 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Commit → Build/Test/Sanitize/Analyze → Binary/Image → Deploy → Observe/Rollback
```

---

# 4. Mind Map

```text
Production Engineering: CMake Builds, Containers, CI/CD, Observability & Hardening
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

Create a production-readiness checklist for a C++ service, including symbols, hardening, sanitizers, deployment and rollback.

---

# 8. Google Interview Drill

A release-only crash occurs with stripped symbols. Explain how to preserve symbolization while shipping optimized binaries.

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
