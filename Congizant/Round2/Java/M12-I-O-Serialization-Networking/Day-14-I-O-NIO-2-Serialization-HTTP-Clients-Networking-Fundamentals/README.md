# Day 14 — I/O, NIO.2, Serialization, HTTP Clients & Networking Fundamentals

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P1  
**Role of this file:** Day integration, visualization, Google drill, and readiness gate.

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready mental model.

## Topic Units

1. [InputStream/OutputStream](01-InputStream-OutputStream.md)
2. [Reader/Writer](02-Reader-Writer.md)
3. [Files/Path](03-Files-Path.md)
4. [buffers](04-buffers.md)
5. [NIO awareness](05-NIO-awareness.md)
6. [serialization formats](06-serialization-formats.md)
7. [Java serialization risks](07-Java-serialization-risks.md)
8. [HTTP client](08-HTTP-client.md)
9. [timeouts](09-timeouts.md)
10. [resource handling](10-resource-handling.md)
11. [blocking vs non-blocking awareness](11-blocking-vs-non-blocking-awareness.md)

---

# 2. Real-Life Analogy

I/O is a pipeline carrying water: buffer size, flow rate, destination capacity, and closing valves all matter.

---

# 3. Visualization

```text
Source → Buffer/Decode → Process → Encode/Write → Close; Network → Timeout/Limit → Response
```

---

# 4. Mind Map

```text
I/O, NIO.2, Serialization, HTTP Clients & Networking Fundamentals
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

Read a UTF-8 file safely, stream lines, write JSON through a chosen library abstraction, and call an HTTP endpoint with timeout/error handling. Explain memory behavior for huge files.

---

# 8. Google Interview Drill

A service loads a 5 GB file using `Files.readAllBytes`. Diagnose memory risk and redesign with streaming/chunk processing plus backpressure where downstream is slower.

### Required Response Flow

> **Clarify → First Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Default charset assumptions
- Reading huge file fully into memory
- Java native deserialization of untrusted bytes
- No HTTP timeout
- Leaking streams

---

# 10. Day-Level Best Practices

- Specify charset
- Stream large data
- Treat serialized input as untrusted
- Bound network operations
- Use stable external schemas

---

# 11. Interview Questions

1. Byte vs character streams?
2. `Path`/`Files`?
3. Why native Java serialization can be risky?
4. How process large files?
5. What HTTP timeouts matter?
6. Blocking vs non-blocking I/O?

---

# 12. Google-Level Follow-Ups

1. What is zero-copy awareness?
2. How would Netty differ conceptually?
3. How do you handle partial network failure?
4. How version message schemas?

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
