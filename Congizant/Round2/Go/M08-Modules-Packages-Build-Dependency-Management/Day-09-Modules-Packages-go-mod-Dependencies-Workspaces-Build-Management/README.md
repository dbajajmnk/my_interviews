# Day 09 — Modules, Packages, go.mod, Dependencies, Workspaces & Build Management

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Go modules](01-Go-modules.md)
2. [go.mod](02-go-mod.md)
3. [Module paths](03-Module-paths.md)
4. [Semantic import versioning awareness](04-Semantic-import-versioning-awareness.md)
5. [go.sum](05-go-sum.md)
6. [Dependency graph](06-Dependency-graph.md)
7. [go get](07-go-get.md)
8. [go mod tidy](08-go-mod-tidy.md)
9. [go mod download](09-go-mod-download.md)
10. [go mod graph awareness](10-go-mod-graph-awareness.md)
11. [go list awareness](11-go-list-awareness.md)
12. [replace directive awareness](12-replace-directive-awareness.md)
13. [exclude directive awareness](13-exclude-directive-awareness.md)
14. [Internal packages](14-Internal-packages.md)
15. [cmd layout awareness](15-cmd-layout-awareness.md)
16. [Package cycles](16-Package-cycles.md)
17. [Workspaces go.work awareness](17-Workspaces-go-work-awareness.md)
18. [Build tags awareness](18-Build-tags-awareness.md)
19. [Environment variables GOOS GOARCH](19-Environment-variables-GOOS-GOARCH.md)
20. [Cross compilation](20-Cross-compilation.md)
21. [CGO awareness](21-CGO-awareness.md)
22. [Vendoring awareness](22-Vendoring-awareness.md)
23. [Reproducible builds](23-Reproducible-builds.md)
24. [Dependency supply-chain risk](24-Dependency-supply-chain-risk.md)

---

# 2. Real-Life Analogy

Day 09 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Import → Module Graph/go.mod/go.sum → Build → Binary
```

---

# 4. Mind Map

```text
Modules, Packages, go.mod, Dependencies, Workspaces & Build Management
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

Create a multi-package module, inspect go.mod/go.sum, run tidy/list/graph, and cross-compile for another OS/architecture.

---

# 8. Google Interview Drill

A module builds locally but CI fetches a different major version. Explain module paths, semantic import versioning, and module resolution.

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
