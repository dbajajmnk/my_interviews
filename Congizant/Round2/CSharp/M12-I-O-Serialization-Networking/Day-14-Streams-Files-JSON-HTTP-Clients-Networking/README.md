# Day 14 — Streams, Files, JSON, HTTP Clients & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below and integrate them into one interview-ready C#/.NET mental model.

## Topic Units

1. [Stream](01-Stream.md)
2. [FileStream](02-FileStream.md)
3. [MemoryStream](03-MemoryStream.md)
4. [StreamReader](04-StreamReader.md)
5. [StreamWriter](05-StreamWriter.md)
6. [BinaryReader awareness](06-BinaryReader-awareness.md)
7. [BinaryWriter awareness](07-BinaryWriter-awareness.md)
8. [using/await using](08-using-await-using.md)
9. [File APIs](09-File-APIs.md)
10. [Path APIs](10-Path-APIs.md)
11. [Buffered I/O awareness](11-Buffered-I-O-awareness.md)
12. [System.Text.Json](12-System-Text-Json.md)
13. [JsonSerializer](13-JsonSerializer.md)
14. [JsonSerializerOptions](14-JsonSerializerOptions.md)
15. [Custom converters awareness](15-Custom-converters-awareness.md)
16. [JSON source generation awareness](16-JSON-source-generation-awareness.md)
17. [Unknown property handling awareness](17-Unknown-property-handling-awareness.md)
18. [HttpClient](18-HttpClient.md)
19. [HttpClientFactory awareness](19-HttpClientFactory-awareness.md)
20. [SocketsHttpHandler awareness](20-SocketsHttpHandler-awareness.md)
21. [Connection pooling](21-Connection-pooling.md)
22. [DNS refresh awareness](22-DNS-refresh-awareness.md)
23. [Timeouts](23-Timeouts.md)
24. [Cancellation](24-Cancellation.md)
25. [Streaming responses](25-Streaming-responses.md)
26. [ResponseHeadersRead awareness](26-ResponseHeadersRead-awareness.md)
27. [Payload limits](27-Payload-limits.md)
28. [Sockets awareness](28-Sockets-awareness.md)
29. [WebSockets awareness](29-WebSockets-awareness.md)
30. [gRPC awareness](30-gRPC-awareness.md)

---

# 2. Real-Life Analogy

Day 14 keeps the GOJ structure familiar while translating it into C# language, CLR, async, ASP.NET Core, data and production engineering.

---

# 3. Visualization

```text
Stream/File/HTTP → buffer/deserialize → process → dispose/cancel
```

---

# 4. Mind Map

```text
Streams, Files, JSON, HTTP Clients & Networking
├── C# Semantics
├── CLR / IL / Runtime
├── Async / Lifetime
├── Framework / Data
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

> **Concept → C# Guarantee → CLR/Framework Boundary → Lifetime/Ownership → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a streaming JSON/HTTP client and process a large file without loading it entirely into memory.

---

# 8. Google Interview Drill

A service creates a new HttpClient per request and sees socket exhaustion. Explain the connection-pooling issue and fix.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Confusing C# with .NET/CLR.
- Sync-over-async.
- Missing cancellation.
- Resource leaks.
- Wrong DI lifetime.
- Overusing inheritance/patterns.
- Trusting LINQ/EF/runtime behavior without evidence.
- Optimizing without diagnostics.

---

# 10. Day-Level Best Practices

- Nullable enabled.
- Async all the way for I/O.
- CancellationToken propagated.
- Deterministic disposal.
- Constructor injection and correct lifetimes.
- Inspect SQL and traces.
- Measure before tuning.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. What does C# guarantee?
3. What is CLR/framework-specific?
4. What can allocate/block/race/leak?
5. What evidence would you collect?
6. What simpler design could replace the abstraction?

---

# 12. Google-Level Follow-Ups

1. What changes under 10× concurrency?
2. What happens when CancellationToken fires?
3. What if the DB/API is saturated?
4. What changes under Native AOT/trimming?
5. What would counters/trace/dump/profile show?
6. What would you choose differently for library vs ASP.NET Core service?

---

# 13. Quick Revision

```text
What is it?
Why?
What does C# guarantee?
What does CLR/framework do?
What allocates?
What can block/race/leak?
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
- [ ] I can distinguish language vs CLR/framework behavior.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
