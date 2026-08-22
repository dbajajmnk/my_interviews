# Day 01 — Java Ecosystem, JVM, JDK, JRE, Syntax & Execution

**Module:** M01 — Language Foundations  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [Java platform architecture](01-Java-platform-architecture.md)
2. [JDK vs JRE vs JVM](02-JDK-vs-JRE-vs-JVM.md)
3. [compile → bytecode → execute](03-compile-bytecode-execute.md)
4. [class structure](04-class-structure.md)
5. [main method](05-main-method.md)
6. [variables/constants](06-variables-constants.md)
7. [operators](07-operators.md)
8. [control flow](08-control-flow.md)
9. [coding conventions](09-coding-conventions.md)

---

# 2. Real-Life Analogy

Java is like writing a universal instruction manual that is translated into JVM bytecode; each operating system uses its own JVM as the trained interpreter/executor.

---

# 3. Visualization

```text
Source (.java) → javac → Bytecode (.class) → Class Loader/Verifier → JVM Execution → JIT Hot Paths
```

---

# 4. Mind Map

```text
Java Ecosystem, JVM, JDK, JRE, Syntax & Execution
├── Topic Units
├── Java Semantics
├── Runtime / Internal Working
├── Implementation
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

Use the 2-hour boundary strictly:

```text
00–15 min  Rapid topic recall / skim
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, P1 subtopics receive awareness depth first. Do not sacrifice P0 correctness to memorize low-value trivia.

---

# 6. Engineering Integration

For the whole day, be able to connect:

> **Concept → Java Guarantee → JVM/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Create a small CLI that accepts an order amount, applies a tiered discount with `switch`/`if`, calculates tax, and prints a formatted result. Explain primitive conversions and edge cases.

---

# 8. Google Interview Drill

You receive a Java program that compiles on one machine but not another. Walk through JDK version, source/target compatibility, classpath/module-path, dependency, and runtime checks before changing code.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Calling Java purely interpreted
- Confusing JDK/JRE/JVM
- Using `==` reasoning from primitives for objects
- Ignoring integer overflow
- Writing side effects inside complex expressions

---

# 10. Day-Level Best Practices

- Explain source → bytecode → JVM clearly
- Prefer readable expressions
- Use `final` for stable local bindings where useful
- Know primitive widening/narrowing
- State assumptions before output-prediction questions

---

# 11. Interview Questions

1. JDK vs JRE vs JVM?
2. Why is Java platform-independent?
3. What happens from `.java` to execution?
4. Primitive vs reference type?
5. Why can integer overflow occur silently?
6. `switch` statement vs expression?

---

# 12. Google-Level Follow-Ups

1. What changes when running inside a container?
2. How would you compile for an older runtime?
3. What is bytecode verification?
4. When does JIT enter the picture?

---

# 13. Quick Revision

```text
What is it?
Why use it?
What does Java guarantee?
How does it work internally?
Show code.
What breaks?
How do you debug it?
What do you review?
How would you evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can draw/explain today's visualization without notes.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can answer the interview questions with concise senior-level reasoning.
- [ ] I can survive at least two follow-up changes.
- [ ] I did not invent project experience or metrics.

**DAY READY:** 80%+ and no P0 topic failure.  
**DAY REPAIR:** Reopen only failed topic files.
