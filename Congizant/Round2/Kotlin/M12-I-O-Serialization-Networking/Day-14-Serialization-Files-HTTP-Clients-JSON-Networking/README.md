# Day 14 — Serialization, Files, HTTP Clients, JSON & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Kotlin mental model.

## Topic Units

1. [kotlinx.serialization awareness](01-kotlinx-serialization-awareness.md)
2. [Serializable annotation awareness](02-Serializable-annotation-awareness.md)
3. [JSON encoding/decoding](03-JSON-encoding-decoding.md)
4. [Schema compatibility awareness](04-Schema-compatibility-awareness.md)
5. [Unknown fields awareness](05-Unknown-fields-awareness.md)
6. [Custom serializers awareness](06-Custom-serializers-awareness.md)
7. [Java serialization risk awareness](07-Java-serialization-risk-awareness.md)
8. [File I/O](08-File-I-O.md)
9. [Path/File awareness](09-Path-File-awareness.md)
10. [useLines awareness](10-useLines-awareness.md)
11. [Buffered I/O](11-Buffered-I-O.md)
12. [Charsets](12-Charsets.md)
13. [Ktor client awareness](13-Ktor-client-awareness.md)
14. [Java HttpClient interop awareness](14-Java-HttpClient-interop-awareness.md)
15. [HTTP status handling](15-HTTP-status-handling.md)
16. [Timeouts](16-Timeouts.md)
17. [Retries awareness](17-Retries-awareness.md)
18. [Cancellation with HTTP calls](18-Cancellation-with-HTTP-calls.md)
19. [Streaming responses awareness](19-Streaming-responses-awareness.md)
20. [WebSocket awareness](20-WebSocket-awareness.md)
21. [SSE awareness](21-SSE-awareness.md)
22. [Payload size limits](22-Payload-size-limits.md)

---

# 2. Real-Life Analogy

Day 14 keeps the GOJ structure familiar while translating it into Kotlin-native language, JVM, coroutine, and backend engineering decisions.

---

# 3. Visualization

```text
File/Network → stream/decode → deserialize → domain → close/cancel
```

---

# 4. Mind Map

```text
Serialization, Files, HTTP Clients, JSON & Networking
├── Kotlin Semantics
├── JVM / Platform Internals
├── Coroutines / Runtime
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Kotlin Guarantee → JVM/Coroutine/Framework Behavior → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a typed HTTP/JSON client and stream a large file safely.

---

# 8. Google Interview Drill

Redesign a service that reads multi-GB payloads fully into memory.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Java-like Kotlin instead of Kotlin-native modeling.
- `!!` used instead of proving nullability.
- Read-only treated as deep immutable.
- Global/unstructured coroutines.
- Blocking I/O on wrong dispatcher.
- Overusing scope functions/extensions.
- Ignoring JVM and Java interoperability.

---

# 10. Day-Level Best Practices

- Null-safe by design.
- Final/composition/delegation first.
- Structured concurrency.
- Explicit blocking boundaries.
- Sealed/data/value types where they simplify domain modeling.
- JVM evidence before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does Kotlin guarantee?
3. What is JVM/framework-specific?
4. What production failure could result from misunderstanding this topic?
5. What would you review in AI-generated code?
6. What alternative would be simpler?

---

# 12. Google-Level Follow-Ups

1. What changes at a Java boundary?
2. What changes under concurrency?
3. What happens when the operation blocks?
4. What changes at 10× traffic/data?
5. What would you profile/trace?
6. What would you choose differently in Android vs backend?

---

# 13. Quick Revision

```text
What is it?
Why?
What does Kotlin guarantee?
What is JVM/coroutine/framework specific?
Show code.
What breaks?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish language vs JVM/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
