# Day 09 — Packages, Modules, Classpath, Maven, Gradle & Dependency Management

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P1  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [packages](01-packages.md)
2. [access control](02-access-control.md)
3. [classpath](03-classpath.md)
4. [module-path](04-module-path.md)
5. [JPMS awareness](05-JPMS-awareness.md)
6. [JAR/WAR](06-JAR-WAR.md)
7. [Maven lifecycle](07-Maven-lifecycle.md)
8. [Gradle concepts](08-Gradle-concepts.md)
9. [dependency scopes](09-dependency-scopes.md)
10. [transitive dependencies](10-transitive-dependencies.md)
11. [version conflicts](11-version-conflicts.md)
12. [build reproducibility](12-build-reproducibility.md)

---

# 2. Real-Life Analogy

A build file is the shipping manifest for your application: it defines exactly which parts, versions, and assembly steps are required.

---

# 3. Visualization

```text
Source + Dependencies → Build Lifecycle → Tests → Package → Runtime Classpath/Module Path
```

---

# 4. Mind Map

```text
Packages, Modules, Classpath, Maven, Gradle & Dependency Management
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

Create a small multi-module Maven project with `domain`, `application`, and `adapter` modules. Explain dependency direction and why domain should not depend on Spring/web adapters.

---

# 8. Google Interview Drill

Production throws `NoSuchMethodError` after a dependency upgrade. Diagnose dependency tree, transitive version conflict, runtime classpath, shaded/fat JAR, and rollback strategy.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Adding dependencies without checking transitives
- Using implementation dependencies in domain
- Ignoring reproducible versions
- Confusing compile and runtime failures
- Treating build file as boilerplate

---

# 10. Day-Level Best Practices

- Inspect dependency tree
- Keep dependency direction intentional
- Pin/manage versions centrally
- Separate test/runtime scopes
- Scan dependencies for vulnerabilities

---

# 11. Interview Questions

1. Classpath vs module-path?
2. JAR vs WAR?
3. Maven lifecycle?
4. Transitive dependency?
5. What causes `NoSuchMethodError`?
6. Maven vs Gradle at high level?

---

# 12. Google-Level Follow-Ups

1. How do Spring Boot fat JARs work conceptually?
2. What is dependency convergence?
3. How would JPMS affect reflection-heavy frameworks?
4. How do you make builds reproducible?

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
