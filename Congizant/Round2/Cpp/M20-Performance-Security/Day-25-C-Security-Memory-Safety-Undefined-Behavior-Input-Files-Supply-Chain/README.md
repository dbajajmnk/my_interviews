# Day 25 — C++ Security: Memory Safety, Undefined Behavior, Input, Files & Supply Chain

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C++ mental model.

## Topic Units

1. [Threat modeling](01-Threat-modeling.md)
2. [Memory safety](02-Memory-safety.md)
3. [Buffer overflow](03-Buffer-overflow.md)
4. [Out-of-bounds access](04-Out-of-bounds-access.md)
5. [Use-after-free](05-Use-after-free.md)
6. [Double free](06-Double-free.md)
7. [Integer overflow awareness](07-Integer-overflow-awareness.md)
8. [Signed/unsigned bugs](08-Signed-unsigned-bugs.md)
9. [Format string risk awareness](09-Format-string-risk-awareness.md)
10. [Unsafe C APIs](10-Unsafe-C-APIs.md)
11. [Safe string/container usage](11-Safe-string-container-usage.md)
12. [Input validation](12-Input-validation.md)
13. [SQL injection](13-SQL-injection.md)
14. [Command injection](14-Command-injection.md)
15. [Path traversal](15-Path-traversal.md)
16. [SSRF awareness](16-SSRF-awareness.md)
17. [File upload security](17-File-upload-security.md)
18. [Deserialization risk](18-Deserialization-risk.md)
19. [TLS verification awareness](19-TLS-verification-awareness.md)
20. [Secrets management](20-Secrets-management.md)
21. [Secure logging](21-Secure-logging.md)
22. [Compiler hardening flags awareness](22-Compiler-hardening-flags-awareness.md)
23. [ASLR/DEP awareness](23-ASLR-DEP-awareness.md)
24. [Stack protector awareness](24-Stack-protector-awareness.md)
25. [Sanitizers](25-Sanitizers.md)
26. [Static analysis awareness](26-Static-analysis-awareness.md)
27. [Dependency vulnerabilities](27-Dependency-vulnerabilities.md)
28. [CMake/package supply-chain risk](28-CMake-package-supply-chain-risk.md)
29. [Unsafe casts](29-Unsafe-casts.md)
30. [Race conditions as security risk](30-Race-conditions-as-security-risk.md)

---

# 2. Real-Life Analogy

Day 25 keeps the GOJ structure familiar while translating it into C++-native lifetime, ownership, memory, concurrency, performance and production reasoning.

---

# 3. Visualization

```text
Untrusted Input → Bounds/Lifetime Validate → Safe File/DB/Network → Harden
```

---

# 4. Mind Map

```text
C++ Security: Memory Safety, Undefined Behavior, Input, Files & Supply Chain
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

Threat-model a C++ network service with file uploads, DB access and external calls; add hardening and sanitizer checks.

---

# 8. Google Interview Drill

Find the security issues in a parser using raw buffers, unchecked lengths and signed/unsigned conversions.

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
