# Day 14 — JSON, Fetch, URL, Buffers, File I/O, Streams & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [JSON.stringify](01-JSON-stringify.md)
2. [JSON.parse](02-JSON-parse.md)
3. [JSON limitations](03-JSON-limitations.md)
4. [Custom serialization awareness](04-Custom-serialization-awareness.md)
5. [fetch](05-fetch.md)
6. [Request and Response](06-Request-and-Response.md)
7. [HTTP status handling](07-HTTP-status-handling.md)
8. [Headers](08-Headers.md)
9. [AbortSignal with fetch](09-AbortSignal-with-fetch.md)
10. [URL and URLSearchParams](10-URL-and-URLSearchParams.md)
11. [Node Buffer](11-Node-Buffer.md)
12. [TextEncoder/TextDecoder awareness](12-TextEncoder-TextDecoder-awareness.md)
13. [Node fs/promises](13-Node-fs-promises.md)
14. [File streams](14-File-streams.md)
15. [Large file processing](15-Large-file-processing.md)
16. [WebSocket awareness](16-WebSocket-awareness.md)
17. [Server-Sent Events awareness](17-Server-Sent-Events-awareness.md)
18. [Character encoding](18-Character-encoding.md)
19. [Network timeouts](19-Network-timeouts.md)
20. [Response size limits](20-Response-size-limits.md)

---

# 2. Real-Life Analogy

Streaming is moving cargo in boxes rather than loading the entire ship into memory before processing.

---

# 3. Visualization

```text
Network/File Source → Stream/Decode/Parse → Process → Encode/Write → Close/Cancel
```

---

# 4. Mind Map

```text
JSON, Fetch, URL, Buffers, File I/O, Streams & Networking
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
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

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Fetch JSON with timeout/cancellation and safe status handling; stream a large file rather than loading it fully into memory.

---

# 8. Google Interview Drill

A service uses `await response.json()` for a multi-GB payload and crashes. Redesign with streaming/size limits and clarify whether the upstream protocol permits it.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
