# Day 25 — C Security: Memory, Integer, Input & Hardening

**Module:** M20 — Performance & Security  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Threat modeling](01-Threat-modeling.md)
2. [Buffer overflow](02-Buffer-overflow.md)
3. [Out-of-bounds read/write](03-Out-of-bounds-read-write.md)
4. [Use-after-free](04-Use-after-free.md)
5. [Double free](05-Double-free.md)
6. [Integer overflow](06-Integer-overflow.md)
7. [Integer truncation](07-Integer-truncation.md)
8. [Signed/unsigned conversion](08-Signed-unsigned-conversion.md)
9. [Format string vulnerabilities](09-Format-string-vulnerabilities.md)
10. [Unsafe printf usage](10-Unsafe-printf-usage.md)
11. [Unsafe string functions](11-Unsafe-string-functions.md)
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
22. [Compiler hardening flags](22-Compiler-hardening-flags.md)
23. [Stack protector](23-Stack-protector.md)
24. [FORTIFY_SOURCE awareness](24-FORTIFY-SOURCE-awareness.md)
25. [ASLR/DEP awareness](25-ASLR-DEP-awareness.md)
26. [Sanitizers](26-Sanitizers.md)
27. [Static analysis](27-Static-analysis.md)
28. [Dependency vulnerabilities](28-Dependency-vulnerabilities.md)
29. [Supply-chain risk](29-Supply-chain-risk.md)
30. [Race conditions as security risk](30-Race-conditions-as-security-risk.md)

# 2. Real-Life Analogy

Day 25 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Input → Integer/Bounds Validate → Safe Buffer/File/DB → Harden
```

# 4. Mind Map

```text
C Security: Memory, Integer, Input & Hardening
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Threat-model a C network parser and apply bounded APIs, integer checks and hardening.

# 8. Google Interview Drill

Find exploit paths in an unchecked sprintf parser.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
