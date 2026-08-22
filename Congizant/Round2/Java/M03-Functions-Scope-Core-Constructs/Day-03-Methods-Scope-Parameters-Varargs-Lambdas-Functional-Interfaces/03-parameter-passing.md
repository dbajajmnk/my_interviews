# Topic 03 — parameter passing

**Course:** GOJ Java Interview Mastery Course V2  
**Day:** 03 — Methods, Scope, Parameters, Varargs, Lambdas & Functional Interfaces  
**Module:** M03 — Functions, Scope & Core Constructs  
**Priority:** P0  
**Topic Standard:** GOJ Signature Topic Sequence

---

# 1. What

**parameter passing** is pass-by-value semantics.

---

# 2. Why

Interviewers ask **parameter passing** to test whether you understand its Java semantics, internal behavior, failure modes, and when its trade-offs are justified—not only its definition.

---

# 3. Plain English

Plain English: **parameter passing** is about pass-by-value semantics. Use it when the requirement matches that problem; otherwise prefer the simpler Java design.

---

# 4. Engineering Explanation

method receives a copy of primitive value or reference value. Within this day, the closest engineering anchor is **Parameter Passing**: A method receives copies of argument values. For object references, the copied reference can still point to a mutable object.

Senior interpretation:

> **Guarantee → Boundary → Cost → Failure → Alternative → Production Evidence**

---

# 5. Syntax

```java
void change(List<String> xs) { xs.add("x"); }
```

Do not memorize syntax alone. Explain what the compiler/JVM/framework will do and what the contract guarantees.

---

# 6. Internal Working

- method receives a copy of primitive value or reference value
- Separate the Java/API contract from JVM/framework implementation details.
- Identify the state, lifecycle, complexity, I/O, memory, locking, or network boundary affected by this topic.
- State what changes under concurrency, scale, malformed input, retries, or partial failure when relevant.

---

# 7. Example

Use the syntax example above, then answer:

1. What is the input/contract?
2. What state or resource changes?
3. What is compile-time behavior?
4. What is runtime behavior?
5. What failure/edge case should be tested?

---

# 8. Real Project Usage

In a Java/Spring production system, **parameter passing** appears in the context of **Methods, Scope, Parameters, Varargs, Lambdas & Functional Interfaces**. Connect it to the day's project concern: Implement reusable validators using lambdas and method references. Add overloaded utility methods and explain exactly which overload is selected for primitive, wrapper, and null arguments.

### Project Rule

Never convert this conceptual example into a fake claim about having used it on a client/project.  
Use **Evidence First**: direct experience, related experience, conceptual knowledge, or gap.

---

# 9. Best Practices

- Use **parameter passing** only when its semantics fit the requirement.
- Keep contracts explicit and code readable.
- Prefer deterministic guarantees over assumptions from one local run.
- Test edge cases and failure paths.
- Measure performance/production behavior before tuning.

---

# 10. Common Mistakes

1. Memorizing the definition of **parameter passing** without understanding runtime behavior.
2. Applying the concept because it is fashionable rather than requirement-driven.
3. Ignoring failure, null/edge, concurrency, or scale behavior.
4. Stating implementation details as language guarantees.
5. Accepting generated code/explanations without compiling or testing.

---

# 11. Debugging

- First reproduce the symptom involving **parameter passing**.
- Primary focus: distinguish rebinding a reference from mutating referenced object.
- Capture the artifact that matches the symptom: compiler error, stack trace, SQL, thread dump, heap/JFR profile, trace, metric, or test failure.
- Change one assumption at a time and add a regression test.

### Debug Flow

> **Reproduce → Evidence → Hypothesis → Isolate → Fix → Regression Test → Observe**

---

# 12. Code Review

- Does **parameter passing** solve a real requirement or add accidental complexity?
- Is the API/contract hard to misuse?
- Are mutability, nullability, concurrency, exceptions, and resource ownership explicit?
- What is the performance/security/operational consequence?
- Is there a simpler Java-native alternative?

### Review Priority

> **Correctness → Security → Data/Concurrency → Failure Handling → Performance → Architecture/API → Tests → Maintainability → Style**

---

# 13. AI Evaluation

- Ask whether AI-generated code uses **parameter passing** correctly for the project's Java version.
- Verify imports, APIs, annotations, library coordinates, and framework behavior against the build/docs.
- Compile and run meaningful tests; do not accept plausible syntax as evidence.
- Review security, concurrency, resource lifecycle, and complexity independently.
- Verdict must be **Accept / Repair / Reject** with a reason.

### AI Rule

> Generated Java is an **untrusted proposal**, not an approved solution.

---

# 14. Interview Questions

1. What is **parameter passing** in Java?
2. Why would you use **parameter passing**?
3. How does **parameter passing** work internally at the level relevant to a Java engineer?
4. What is a common mistake with **parameter passing**?
5. Where would **parameter passing** appear in a real production system?
6. What is the main alternative or trade-off?

---

# 15. Practice

Create the smallest Java example that demonstrates **parameter passing** correctly. Then deliberately introduce one realistic bug or misuse, reproduce it, fix it, and explain the code-review rule that would have caught it.

### Google-Level Practice Flow

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity/Cost → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **parameter passing** in plain English.
- [ ] I can explain its Java engineering semantics.
- [ ] I can write/read the relevant syntax.
- [ ] I can explain one internal-working detail accurately.
- [ ] I can give one real project use case without bluffing.
- [ ] I can identify one common mistake.
- [ ] I can debug one misuse using evidence.
- [ ] I can review AI-generated code involving this topic.
- [ ] I can answer at least 4/6 interview questions without notes.
- [ ] I can state one trade-off or alternative.

**READY:** 80%+ with no critical misconception.  
**REPAIR:** Fix only this topic before continuing.

---

# 17. Official References

- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/)
- [Java SE API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/)
