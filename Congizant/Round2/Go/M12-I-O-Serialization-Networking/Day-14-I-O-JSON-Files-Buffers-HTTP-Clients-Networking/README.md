# Day 14 — I/O, JSON, Files, Buffers, HTTP Clients & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready Go mental model.

## Topic Units

1. [io.Reader](01-io-Reader.md)
2. [io.Writer](02-io-Writer.md)
3. [io.Closer](03-io-Closer.md)
4. [io.Copy](04-io-Copy.md)
5. [io.LimitReader](05-io-LimitReader.md)
6. [bufio.Reader](06-bufio-Reader.md)
7. [bufio.Writer](07-bufio-Writer.md)
8. [bytes.Buffer](08-bytes-Buffer.md)
9. [strings.Reader](09-strings-Reader.md)
10. [os.File](10-os-File.md)
11. [os.Open](11-os-Open.md)
12. [os.Create](12-os-Create.md)
13. [defer Close](13-defer-Close.md)
14. [fs package awareness](14-fs-package-awareness.md)
15. [encoding/json](15-encoding-json.md)
16. [JSON tags](16-JSON-tags.md)
17. [omitempty awareness](17-omitempty-awareness.md)
18. [Custom MarshalJSON awareness](18-Custom-MarshalJSON-awareness.md)
19. [Unknown field handling awareness](19-Unknown-field-handling-awareness.md)
20. [HTTP client](20-HTTP-client.md)
21. [http.Request](21-http-Request.md)
22. [http.Response](22-http-Response.md)
23. [Timeouts](23-Timeouts.md)
24. [Context cancellation](24-Context-cancellation.md)
25. [Connection reuse awareness](25-Connection-reuse-awareness.md)
26. [Transport awareness](26-Transport-awareness.md)
27. [Response body close/drain awareness](27-Response-body-close-drain-awareness.md)
28. [Streaming responses](28-Streaming-responses.md)
29. [Payload size limits](29-Payload-size-limits.md)
30. [net package awareness](30-net-package-awareness.md)
31. [WebSocket library awareness](31-WebSocket-library-awareness.md)

---

# 2. Real-Life Analogy

Day 14 keeps the GOJ structure familiar while translating it into Go-native simplicity, explicit errors, ownership, concurrency, runtime, and production reasoning.

---

# 3. Visualization

```text
Reader → Buffer/Decode → Process → Encode/Writer → Close/Cancel
```

---

# 4. Mind Map

```text
I/O, JSON, Files, Buffers, HTTP Clients & Networking
├── Language Semantics
├── Toolchain / Runtime
├── Ownership / Resources
├── Concurrency
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

---

# 6. Engineering Integration

Connect:

> **Concept → Go Guarantee → Runtime/OS Boundary → Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a streaming HTTP/file pipeline with limits, cancellation and JSON decoding.

---

# 8. Google Interview Drill

A service leaks HTTP connections because response bodies are not handled correctly. Diagnose and fix.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Ignoring errors.
- Over-abstracting with interfaces/patterns.
- Leaking goroutines/resources.
- Using unbounded concurrency.
- Misunderstanding slice/interface nil semantics.
- Treating race-free as automatically deadlock/leak-free.
- Optimizing without pprof/trace/benchmark evidence.

---

# 10. Day-Level Best Practices

- Standard library first.
- Small consumer-owned interfaces.
- Explicit errors and context.
- Bounded concurrency.
- Clear ownership and cleanup.
- Measure runtime behavior.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does the Go spec guarantee?
3. What is runtime/compiler implementation detail?
4. What can leak, block, or race?
5. What evidence would you collect?
6. What simpler design could replace this abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when the client cancels?
3. What if the downstream DB/API is saturated?
4. What if this function receives a typed-nil interface?
5. What would pprof/trace/-race show?
6. What would you change for a library vs a service?

---

# 13. Quick Revision

```text
What is it?
Why?
Who owns the resource?
What can be nil?
What can block/race/leak?
What does the runtime do?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization.
- [ ] I completed the hands-on task.
- [ ] I completed the Google drill.
- [ ] I can explain ownership/cancellation/resource behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
