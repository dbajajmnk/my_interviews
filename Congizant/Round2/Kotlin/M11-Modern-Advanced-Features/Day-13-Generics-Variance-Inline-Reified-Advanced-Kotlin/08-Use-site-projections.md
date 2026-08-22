# Topic 08 — Use-site projections

**Course:** GOJ Kotlin Interview Mastery Course V1  
**Day:** 13 — Generics, Variance, Inline/Reified & Advanced Kotlin  
**Module:** M11 — Modern & Advanced Features  
**Priority:** P0  
**Standard:** GOJ Signature Topic Sequence

---

# 1. What

**Use-site projections** is the Kotlin engineering concept **Use-site projections**.

---

# 2. Why

Interviewers use **Use-site projections** to test whether you understand Kotlin semantics, JVM/platform behavior, failure modes, and engineering trade-offs rather than only syntax.

---

# 3. Plain English

Plain English: **Use-site projections** is about the Kotlin engineering concept **Use-site projections**. Use it when the requirement matches the problem; prefer simpler Kotlin when extra abstraction is not justified.

---

# 4. Engineering Explanation

Reason from Kotlin language guarantees first, then distinguish Kotlin/JVM compiler behavior, JVM runtime behavior, coroutine/library/framework behavior, and production evidence.

A senior answer separates:
- Kotlin language guarantee;
- compiler/bytecode behavior;
- JVM/platform behavior;
- coroutine/library/framework behavior;
- production evidence.

> **Guarantee → Boundary → Cost → Failure → Alternative → Production Evidence**

---

# 5. Syntax

```kotlin
val example = Unit
```

Explain what the compiler/runtime actually guarantees instead of memorizing the syntax.

---

# 6. Internal Working

- Reason from Kotlin language guarantees first, then distinguish Kotlin/JVM compiler behavior, JVM runtime behavior, coroutine/library/framework behavior, and production evidence.
- Identify what is compile-time, what is emitted, and what happens at runtime.
- For coroutines, state lifetime, dispatcher, cancellation, exception propagation, and blocking behavior.
- For JVM topics, distinguish language guarantees from implementation/JIT optimization.
- For data/API topics, identify the authoritative runtime boundary.
- For performance, use measurement rather than folklore.

---

# 7. Example

```kotlin
val example = Unit
```

Explain:
1. What types/objects exist?
2. What is compile-time behavior?
3. What is runtime behavior?
4. What can fail?
5. What mutability/concurrency/resource boundary exists?
6. What is the complexity or production cost?

---

# 8. Real Project Usage

In a Kotlin/JVM production system, **Use-site projections** should connect to a real domain, coroutine, JVM, API, data, Android/backend, or architecture requirement.

**Evidence First:** describe it as conceptual unless supported by your real project evidence. Never fabricate client/project use.

---

# 9. Best Practices

- Prefer Kotlin-native clarity over Java-style boilerplate.
- Keep nullability explicit and boundary-safe.
- Prefer composition/delegation over unnecessary inheritance.
- Use structured concurrency and explicit cancellation.
- Keep collections/data immutable or read-only by design where appropriate.
- Measure JVM/runtime performance before tuning.

---

# 10. Common Mistakes

1. Treating Kotlin as syntactic Java.
2. Overusing `!!`, scope functions, extensions, or clever DSL syntax.
3. Confusing read-only with immutable.
4. Using coroutines while still blocking threads incorrectly.
5. Ignoring Java/platform nullability and interoperability edges.
6. Accepting AI-generated Gradle/framework/coroutine code without verification.

---

# 11. Debugging

- Reproduce the smallest failure involving **Use-site projections**.
- Classify it as compiler/type/JVM/coroutine/framework/data/network issue.
- Capture matching evidence: compiler error, stack trace, coroutine/thread dump, heap/JFR profile, SQL, trace, metric, or test failure.
- Fix one assumption at a time and add a regression test.

> **Debug Flow:** Reproduce → Evidence → Hypothesis → Isolate → Fix → Regression Test → Observe

---

# 12. Code Review

- Does **Use-site projections** solve a real requirement?
- Are nullability, mutation, coroutine lifetime, resource ownership, and exceptions explicit?
- Is Java interoperability safe?
- Is the API easy to misuse?
- What is the JVM/performance/security impact?
- Would a simpler data class, sealed type, function, or delegation be clearer?

> **Review Priority:** Correctness → Security → Null/Concurrency/Data → Failure → Performance → API/Architecture → Tests → Maintainability → Style

---

# 13. AI Evaluation

- Verify generated Kotlin against the project Kotlin/JVM/framework versions.
- Check Gradle coordinates and APIs actually exist.
- Inspect `!!`, GlobalScope, wrong dispatcher, blocking calls, unsafe platform types, and serialization assumptions.
- Compile and run tests before accepting.
- Review security, concurrency, resource lifecycle, and performance independently.
- Verdict: **Accept / Repair / Reject** with evidence.

---

# 14. Interview Questions

1. What is **Use-site projections**?
2. Why would you use it in Kotlin?
3. How does it work internally at the relevant level?
4. What is one common mistake?
5. Where would it appear in a real Kotlin/JVM system?
6. What is the main trade-off or alternative?

---

# 15. Practice

Create the smallest runnable Kotlin example demonstrating **Use-site projections**. Then introduce one realistic misuse, reproduce the failure, fix it, and explain the review rule that should catch it.

Use:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **Use-site projections** in plain English.
- [ ] I can explain Kotlin/JVM or coroutine semantics accurately.
- [ ] I can write/read a minimal example.
- [ ] I can explain one internal detail without bluffing.
- [ ] I can give one real use case.
- [ ] I can identify one common mistake.
- [ ] I can debug one misuse using evidence.
- [ ] I can evaluate AI-generated code involving this topic.
- [ ] I can answer at least 4/6 interview questions.
- [ ] I can state one trade-off.

**READY:** 80%+ and no critical misconception.  
**REPAIR:** fix only this topic.

---

# 17. Official References

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Language Specification](https://kotlinlang.org/spec/kotlin-spec.html)
