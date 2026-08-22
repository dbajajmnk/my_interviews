# Topic 06 — Interfaces

**Course:** GOJ Go Interview Mastery Course V1  
**Day:** 04 — Struct Design, Methods, Interfaces, Embedding & Composition  
**Module:** M04 — OOP / Design Model  
**Priority:** P0  
**Standard:** GOJ Signature Topic Sequence

---

# 1. What

**Interfaces** is a behavior contract satisfied implicitly by method set.

---

# 2. Why

Interviewers use **Interfaces** to test whether you understand Go semantics, ownership, runtime/resource behavior, concurrency correctness, failure handling, and production trade-offs—not merely syntax.

---

# 3. Plain English

Plain English: **Interfaces** is about a behavior contract satisfied implicitly by method set. In Go, prefer the simplest explicit mechanism that preserves correctness, ownership, and operability.

---

# 4. Engineering Explanation

assignability depends on method sets; interfaces are usually owned by consumers and kept small

A senior Go answer separates:
- language/spec guarantee;
- compiler/toolchain behavior;
- runtime behavior;
- OS/network/database behavior;
- production evidence.

> **Guarantee → Ownership → Cost → Failure → Alternative → Production Evidence**

---

# 5. Syntax

```go
type Reader interface{ Read([]byte)(int,error) }
```

Explain semantics and ownership instead of memorizing syntax.

---

# 6. Internal Working

- assignability depends on method sets; interfaces are usually owned by consumers and kept small
- Identify who owns the value, goroutine, channel, context, file, response body, connection, lock, or transaction.
- For concurrency, state synchronization, cancellation, close ownership, and leak/deadlock risk.
- For runtime topics, distinguish specification from compiler/runtime implementation detail.
- For performance, verify allocation/blocking/lock contention with Go diagnostics.
- For external input, state the validation and security boundary.

---

# 7. Example

```go
type Reader interface{ Read([]byte)(int,error) }
```

Explain:
1. Which values/interfaces/pointers exist?
2. What can be nil?
3. What is copied vs shared?
4. Which resource/goroutine owns cleanup?
5. What can block, fail, race, or leak?
6. What is the time/space/allocation cost?

---

# 8. Real Project Usage

In a production Go system, **Interfaces** should connect to a concrete package, API, concurrency, data, networking, runtime, or architecture requirement.

**Evidence First:** course content is conceptual unless supported by your actual project evidence. Never fabricate usage.

---

# 9. Best Practices

- Keep APIs and interfaces small.
- Return errors with useful context and preserve causes.
- Propagate context across request-scoped work.
- Bound concurrency and queues.
- Make goroutine/channel/resource ownership explicit.
- Prefer standard library and simple composition before framework/pattern complexity.
- Measure before optimizing.

---

# 10. Common Mistakes

1. Creating interfaces before a consumer actually needs abstraction.
2. Ignoring returned errors.
3. Leaking goroutines, response bodies, rows, files, or transactions.
4. Closing channels from the wrong side or closing unnecessarily.
5. Assuming maps/slices/interfaces are safer than their actual semantics.
6. Using concurrency to hide a downstream bottleneck.
7. Accepting AI-generated code without gofmt/build/test/-race review.

---

# 11. Debugging

- Reproduce the smallest failure involving **Interfaces**.
- Classify it: compile/type, race/deadlock, goroutine leak, allocation/GC, CPU, I/O, DB, network, or API.
- Use matching evidence: compiler output, `-race`, goroutine dump, pprof, trace, logs, SQL/pool metrics, or tests.
- Fix one invariant at a time and add regression coverage.

> **Debug Flow:** Reproduce → Evidence → Hypothesis → Isolate → Fix → Race/Test/Profile → Observe

---

# 12. Code Review

- Is the code simple enough for the requirement?
- Are errors handled and wrapped correctly?
- Is context propagated?
- Who owns goroutines/channels/resources?
- Is shared state synchronized?
- Are slices/maps/interfaces used safely?
- What is the performance/security consequence?
- Would a concrete type/function be clearer than an interface/pattern?

> **Review Priority:** Correctness → Security → Concurrency/Ownership → Errors/Resources → Performance → API/Architecture → Tests → Maintainability → Style

---

# 13. AI Evaluation

- Verify generated packages/APIs exist.
- Run `gofmt`, `go vet`, build/tests, and `go test -race` where concurrency exists.
- Check ignored errors, typed nil, goroutine leaks, channel ownership, context, HTTP body cleanup, DB rows/transactions, and bounds.
- Review security and supply-chain implications.
- Reject performance claims without benchmark/profile evidence.
- Verdict: **Accept / Repair / Reject** with evidence.

---

# 14. Interview Questions

1. What is **Interfaces**?
2. Why would you use it in Go?
3. How does it work internally at the relevant level?
4. What is one common Go-specific mistake?
5. Where would it appear in a production Go service?
6. What is the main trade-off or simpler alternative?

---

# 15. Practice

Create the smallest runnable Go example demonstrating **Interfaces**. Then introduce one realistic misuse, reproduce the failure, fix it, and explain the review rule that should have caught it.

Use:

> **Clarify → First Approach → Improve → Code → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **Interfaces** in plain English.
- [ ] I can explain the Go semantics accurately.
- [ ] I can write/read a minimal example.
- [ ] I can explain ownership/resource/concurrency behavior.
- [ ] I can give one real production use case.
- [ ] I can identify one common mistake.
- [ ] I can debug one misuse using evidence.
- [ ] I can evaluate AI-generated Go code involving this topic.
- [ ] I can answer at least 4/6 interview questions.
- [ ] I can state one trade-off.

**READY:** 80%+ and no critical misconception.  
**REPAIR:** fix only this topic.

---

# 17. Official References

- [The Go Programming Language Specification](https://go.dev/ref/spec)
- [Go Documentation](https://go.dev/doc/)
- [Effective Go](https://go.dev/doc/effective_go)
