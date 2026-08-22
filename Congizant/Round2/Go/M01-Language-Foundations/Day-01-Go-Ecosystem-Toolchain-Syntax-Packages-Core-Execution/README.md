# Day 01 — Go Ecosystem, Toolchain, Syntax, Packages & Core Execution

**Module:** M01 — Language Foundations  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [Go language philosophy](01-Go-language-philosophy.md)
2. [Go toolchain](02-Go-toolchain.md)
3. [go run](03-go-run.md)
4. [go build](04-go-build.md)
5. [go test awareness](05-go-test-awareness.md)
6. [gofmt](06-gofmt.md)
7. [go vet awareness](07-go-vet-awareness.md)
8. [package main](08-package-main.md)
9. [func main](09-func-main.md)
10. [Imports](10-Imports.md)
11. [Exported vs unexported identifiers](11-Exported-vs-unexported-identifiers.md)
12. [Variables](12-Variables.md)
13. [Short declaration](13-Short-declaration.md)
14. [Constants](14-Constants.md)
15. [iota awareness](15-iota-awareness.md)
16. [Basic operators](16-Basic-operators.md)
17. [if](17-if.md)
18. [for](18-for.md)
19. [switch](19-switch.md)
20. [defer awareness](20-defer-awareness.md)
21. [Coding conventions](21-Coding-conventions.md)

---

# 2. Real-Life Analogy

Go is a compact engineering toolkit: a smaller language paired with strong conventions and tooling.

---

# 3. Visualization

```text
Source → gofmt/vet → go build → Binary → OS Runtime
```

---

# 4. Mind Map

```text
Go Ecosystem, Toolchain, Syntax, Packages & Core Execution
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

Build a small CLI using packages, variables/constants, loops, switch, exported/unexported identifiers, and the standard toolchain.

---

# 8. Google Interview Drill

A candidate says Go is just C with garbage collection. Explain the language design choices that make Go distinct.

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
