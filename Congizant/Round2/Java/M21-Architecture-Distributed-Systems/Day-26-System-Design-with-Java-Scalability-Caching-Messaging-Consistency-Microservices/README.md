# Day 26 — System Design with Java: Scalability, Caching, Messaging, Consistency & Microservices

**Module:** M21 — Architecture & Distributed Systems  
**Duration:** 2 Hours  
**Priority:** P0  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [requirements](01-requirements.md)
2. [capacity](02-capacity.md)
3. [stateless services](03-stateless-services.md)
4. [load balancing](04-load-balancing.md)
5. [cache](05-cache.md)
6. [database](06-database.md)
7. [messaging](07-messaging.md)
8. [consistency](08-consistency.md)
9. [microservices](09-microservices.md)
10. [modular monolith](10-modular-monolith.md)
11. [service boundaries](11-service-boundaries.md)
12. [distributed transactions](12-distributed-transactions.md)

---

# 2. Real-Life Analogy

Architecture should grow like a city: start with roads residents actually need, then add highways and transit when traffic justifies them.

---

# 3. Visualization

```text
Requirements → Baseline Service/DB → Bottleneck → Cache/Async/Replica/Service Split → Measure
```

---

# 4. Mind Map

```text
System Design with Java: Scalability, Caching, Messaging, Consistency & Microservices
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

Design URL shortener and order service using the same 12-step method: requirements → estimates → API/data → baseline → bottleneck → scale/failure/security.

---

# 8. Google Interview Drill

Client asks for microservices at 100 RPS. Explain why modular monolith may be better initially and list triggers that would justify extraction later.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Microservices by default
- Kafka for every event
- No idempotency
- Cache critical source-of-truth blindly
- No consistency discussion

---

# 10. Day-Level Best Practices

- Requirements first
- Define source of truth
- Use async deliberately
- Idempotent consumers
- Make service boundaries business-driven

---

# 11. Interview Questions

1. Monolith vs microservices?
2. When use queue/event?
3. What is outbox?
4. Strong vs eventual consistency?
5. How handle distributed transaction?
6. How choose service boundary?

---

# 12. Google-Level Follow-Ups

1. How would Spring Boot services communicate?
2. What if broker is down?
3. How handle event versioning?
4. When use saga?

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
