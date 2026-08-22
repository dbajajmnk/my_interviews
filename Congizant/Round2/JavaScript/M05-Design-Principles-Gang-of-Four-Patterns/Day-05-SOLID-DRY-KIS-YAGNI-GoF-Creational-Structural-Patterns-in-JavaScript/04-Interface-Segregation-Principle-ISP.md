# Topic 04 — Interface Segregation Principle (ISP)

**Course:** GOJ JavaScript Interview Mastery Course V1  
**Day:** 05 — SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in JavaScript  
**Module:** M05 — Design Principles & Gang of Four Patterns  
**Priority:** P0  
**Standard:** GOJ Signature Topic Sequence

---

# 1. What

**Interface Segregation Principle (ISP)** is consumers should depend on the small capability they need.

---

# 2. Why

Interviewers use **Interface Segregation Principle (ISP)** to test whether you understand actual JavaScript semantics, host/runtime boundaries, failure modes, and engineering trade-offs—not only syntax.

---

# 3. Plain English

Plain English: Interface Segregation Principle (ISP) means consumers should depend on the small capability they need. Use it when it solves the stated problem; do not add complexity simply because the feature or pattern exists.

---

# 4. Engineering Explanation

JavaScript lacks compile-time interfaces, so module/object API shape must stay cohesive A senior answer separates **ECMAScript language guarantees**, **browser/Node host behavior**, and **engine/framework implementation details**.

Senior response model:

> **Guarantee → Boundary → Cost → Failure → Alternative → Production Evidence**

---

# 5. Syntax

```javascript
const service = createService({ repository, client });
```

Do not stop at syntax. Explain which behavior is defined by ECMAScript and which depends on the browser, Node.js, engine, framework, or package.

---

# 6. Internal Working

- JavaScript lacks compile-time interfaces, so module/object API shape must stay cohesive
- Identify the scope, object state, job queue, resource, I/O, network, or memory boundary affected by the concept.
- For async topics, explain when work starts, how completion/failure is represented, and what can remain in flight.
- For engine topics, treat optimization details as implementation behavior rather than language guarantees.
- For API/security topics, identify the trust boundary and authoritative source of truth.

---

# 7. Example

```javascript
const service = createService({ repository, client });
```

Explain the example using these questions:

1. What bindings/values/objects exist?
2. What happens synchronously?
3. What may happen asynchronously or in the host runtime?
4. What state is mutated or retained?
5. What failure/edge case must be tested?
6. What is the expected complexity or resource cost?

---

# 8. Real Project Usage

Expose read capability separately from write capability.

**Evidence First:** describe this as conceptual/related experience unless you have direct project evidence. Never turn course content into a fabricated client claim.

---

# 9. Best Practices

- Use **Interface Segregation Principle (ISP)** because a requirement needs it, not because it is fashionable.
- Prefer explicit, readable semantics over clever coercion or meta-programming.
- Keep mutable/shared state and async ownership visible.
- Test edge cases and failure paths, not only the happy path.
- Measure runtime/performance behavior before optimizing.

---

# 10. Common Mistakes

1. Memorizing **Interface Segregation Principle (ISP)** as trivia without understanding its language/runtime semantics.
2. Confusing browser or Node APIs with ECMAScript itself.
3. Ignoring async failure, mutation, coercion, or shared-state behavior.
4. Treating one engine optimization as a language guarantee.
5. Accepting AI-generated code or package names without runtime/build verification.

---

# 11. Debugging

- Reproduce the smallest failing case involving **Interface Segregation Principle (ISP)**.
- Determine whether the failure is parse/semantic/runtime/host/framework/data/async related.
- Capture the matching evidence: stack trace, async stack, Network panel, event-loop metric, CPU profile, heap snapshot, SQL/trace, or test failure.
- Change one assumption at a time and add a regression test.

> **Debug Flow:** Reproduce → Evidence → Hypothesis → Isolate → Fix → Regression Test → Observe

---

# 12. Code Review

- Does **Interface Segregation Principle (ISP)** improve correctness or does it hide behavior?
- Is mutation, ownership, `this`, async lifetime, and error propagation explicit?
- Could untrusted input cross a dangerous browser/Node sink?
- What is the time/memory/network/operational cost?
- Would a simpler function/module/data structure be clearer?

> **Review Priority:** Correctness → Security → Async/Data → Failure Handling → Performance → API/Architecture → Tests → Maintainability → Style

---

# 13. AI Evaluation

- Verify that AI-generated use of **Interface Segregation Principle (ISP)** is valid for the target runtime and module system.
- Check that packages, methods, Web APIs, Node APIs, and syntax actually exist.
- Run the code/tests; do not trust a plausible explanation.
- Review async ordering, cancellation, resource cleanup, security, and performance independently.
- Give an explicit **Accept / Repair / Reject** verdict with evidence.

> **AI Rule:** Generated JavaScript is an untrusted proposal until runtime/build/tests/review prove it.

---

# 14. Interview Questions

1. What is **Interface Segregation Principle (ISP)**?
2. Why would you use **Interface Segregation Principle (ISP)** in JavaScript?
3. How does **Interface Segregation Principle (ISP)** work internally at the level relevant to an engineer?
4. What is one common bug or misconception with **Interface Segregation Principle (ISP)**?
5. Where does **Interface Segregation Principle (ISP)** appear in a real browser/Node system?
6. What is the main alternative or trade-off?

---

# 15. Practice

Create the smallest runnable JavaScript example that demonstrates **Interface Segregation Principle (ISP)**. Then deliberately introduce one realistic misuse, reproduce it, fix it, and explain the review rule that would have caught it.

Use:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity/Cost → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **Interface Segregation Principle (ISP)** in plain English.
- [ ] I can explain the ECMAScript/runtime semantics accurately.
- [ ] I can write/read a minimal example.
- [ ] I can explain one internal-working detail without inventing engine behavior.
- [ ] I can give one real project use case without bluffing.
- [ ] I can identify one common mistake.
- [ ] I can debug one misuse using evidence.
- [ ] I can review AI-generated code involving this topic.
- [ ] I can answer at least 4/6 interview questions without notes.
- [ ] I can state one trade-off or alternative.

**READY:** 80%+ and no critical misconception.  
**REPAIR:** Fix only this topic before continuing.

---

# 17. Official References

- [ECMAScript Language Specification](https://tc39.es/ecma262/)
- [MDN JavaScript Guide](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide)
- [MDN JavaScript Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference)
- [Refactoring.Guru Design Patterns (supplementary)](https://refactoring.guru/design-patterns)
