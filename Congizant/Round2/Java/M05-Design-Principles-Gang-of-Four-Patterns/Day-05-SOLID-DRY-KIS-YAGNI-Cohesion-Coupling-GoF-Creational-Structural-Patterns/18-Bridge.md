# Topic 18 — Bridge

**Course:** GOJ Java Interview Mastery Course V2  
**Day:** 05 — SOLID, DRY, KIS, YAGNI, Cohesion/Coupling & GoF Creational/Structural Patterns  
**Module:** M05 — Design Principles & Gang of Four Patterns  
**Priority:** P0  
**Topic Standard:** GOJ Signature Topic Sequence

---

# 1. What

**Bridge** is separates an abstraction from an implementation dimension so both can vary independently.

---

# 2. Why

Interviewers ask **Bridge** to test whether you understand its Java semantics, internal behavior, failure modes, and when its trade-offs are justified—not only its definition.

---

# 3. Plain English

Plain English: **Bridge** is about separates an abstraction from an implementation dimension so both can vary independently. Use it when the requirement matches that problem; otherwise prefer the simpler Java design.

---

# 4. Engineering Explanation

the high-level abstraction delegates implementation-specific work through a collaborator. Within this day, the closest engineering anchor is **SRP**: A module should have one cohesive reason to change—not merely one method.

Senior interpretation:

> **Guarantee → Boundary → Cost → Failure → Alternative → Production Evidence**

---

# 5. Syntax

```java
abstract class Notification {
    protected final Sender sender;
    protected Notification(Sender sender) { this.sender = sender; }
}
```

Do not memorize syntax alone. Explain what the compiler/JVM/framework will do and what the contract guarantees.

---

# 6. Internal Working

- the high-level abstraction delegates implementation-specific work through a collaborator
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

In a real Java system, use **Bridge** for notification type varying independently from delivery provider. Do not use the pattern merely to increase abstraction.

### Project Rule

Never convert this conceptual example into a fake claim about having used it on a client/project.  
Use **Evidence First**: direct experience, related experience, conceptual knowledge, or gap.

---

# 9. Best Practices

- Use **Bridge** only when its semantics fit the requirement.
- Keep contracts explicit and code readable.
- Prefer deterministic guarantees over assumptions from one local run.
- Test edge cases and failure paths.
- Measure performance/production behavior before tuning.

---

# 10. Common Mistakes

1. Memorizing the definition of **Bridge** without understanding runtime behavior.
2. Applying the concept because it is fashionable rather than requirement-driven.
3. Ignoring failure, null/edge, concurrency, or scale behavior.
4. Stating implementation details as language guarantees.
5. Accepting generated code/explanations without compiling or testing.

---

# 11. Debugging

- First reproduce the symptom involving **Bridge**.
- Primary focus: verify the pattern solves notification type varying independently from delivery provider; remove it if it only adds ceremony.
- Capture the artifact that matches the symptom: compiler error, stack trace, SQL, thread dump, heap/JFR profile, trace, metric, or test failure.
- Change one assumption at a time and add a regression test.

### Debug Flow

> **Reproduce → Evidence → Hypothesis → Isolate → Fix → Regression Test → Observe**

---

# 12. Code Review

- Does **Bridge** solve a real requirement or add accidental complexity?
- Is the API/contract hard to misuse?
- Are mutability, nullability, concurrency, exceptions, and resource ownership explicit?
- What is the performance/security/operational consequence?
- Is there a simpler Java-native alternative?

### Review Priority

> **Correctness → Security → Data/Concurrency → Failure Handling → Performance → Architecture/API → Tests → Maintainability → Style**

---

# 13. AI Evaluation

- Ask whether AI-generated code uses **Bridge** correctly for the project's Java version.
- Verify imports, APIs, annotations, library coordinates, and framework behavior against the build/docs.
- Compile and run meaningful tests; do not accept plausible syntax as evidence.
- Review security, concurrency, resource lifecycle, and complexity independently.
- Verdict must be **Accept / Repair / Reject** with a reason.

### AI Rule

> Generated Java is an **untrusted proposal**, not an approved solution.

---

# 14. Interview Questions

1. What is **Bridge** in Java?
2. Why would you use **Bridge**?
3. How does **Bridge** work internally at the level relevant to a Java engineer?
4. What is a common mistake with **Bridge**?
5. Where would **Bridge** appear in a real production system?
6. What is the main alternative or trade-off?

---

# 15. Practice

Create the smallest Java example that demonstrates **Bridge** correctly. Then deliberately introduce one realistic bug or misuse, reproduce it, fix it, and explain the code-review rule that would have caught it.

### Google-Level Practice Flow

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity/Cost → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **Bridge** in plain English.
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
- [Refactoring.Guru Design Patterns overview (supplementary)](https://refactoring.guru/design-patterns)
