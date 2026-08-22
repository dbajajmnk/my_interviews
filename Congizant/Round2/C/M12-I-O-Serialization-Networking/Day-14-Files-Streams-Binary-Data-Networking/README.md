# Day 14 — Files, Streams, Binary Data & Networking

**Module:** M12 — I/O, Serialization & Networking  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [FILE](01-FILE.md)
2. [fopen](02-fopen.md)
3. [fclose](03-fclose.md)
4. [fread](04-fread.md)
5. [fwrite](05-fwrite.md)
6. [fgets](06-fgets.md)
7. [fputs](07-fputs.md)
8. [fprintf](08-fprintf.md)
9. [fscanf risks awareness](09-fscanf-risks-awareness.md)
10. [feof caveat](10-feof-caveat.md)
11. [ferror](11-ferror.md)
12. [fflush](12-fflush.md)
13. [Binary vs text mode](13-Binary-vs-text-mode.md)
14. [fseek](14-fseek.md)
15. [ftell](15-ftell.md)
16. [POSIX file descriptors awareness](16-POSIX-file-descriptors-awareness.md)
17. [open/read/write/close awareness](17-open-read-write-close-awareness.md)
18. [Partial reads/writes](18-Partial-reads-writes.md)
19. [EINTR awareness](19-EINTR-awareness.md)
20. [Binary serialization risks](20-Binary-serialization-risks.md)
21. [Endianness](21-Endianness.md)
22. [Network byte order](22-Network-byte-order.md)
23. [Struct padding serialization risk](23-Struct-padding-serialization-risk.md)
24. [Sockets awareness](24-Sockets-awareness.md)
25. [socket/bind/listen/accept awareness](25-socket-bind-listen-accept-awareness.md)
26. [connect awareness](26-connect-awareness.md)
27. [send/recv awareness](27-send-recv-awareness.md)
28. [Timeouts](28-Timeouts.md)
29. [select/poll awareness](29-select-poll-awareness.md)
30. [Payload size limits](30-Payload-size-limits.md)
31. [Protocol framing](31-Protocol-framing.md)

# 2. Real-Life Analogy

Day 14 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
File/Socket → Partial I/O → Frame/Parse → Bounds → Close
```

# 4. Mind Map

```text
Files, Streams, Binary Data & Networking
├── C Semantics
├── Bounds / Integers / Pointers
├── Ownership / Storage Duration
├── Toolchain / OS
├── Concurrency
├── Failure / UB
├── Debugging / Security
└── Interview Defense
```

# 5. Two-Hour Execution Plan

```text
00–15  Rapid recall
15–55  P0 topics
55–85  Hands-on/debugging
85–105 Google drill
105–115 Follow-ups
115–120 Readiness gate
```

# 6. Engineering Integration

> **Concept → C Guarantee → Bounds/Ownership → Compiler/OS Boundary → Failure/UB → Evidence → Review Rule → Trade-Off**

# 7. Hands-On Integration

Build a length-prefixed protocol without serializing raw structs.

# 8. Google Interview Drill

Explain cross-platform failure of raw-struct serialization.

# 9. Day-Level Common Mistakes

- Pointer/array confusion.
- Missing bounds and cleanup.
- Signed/unsigned mistakes.
- UB and volatile misuse.
- Unsafe string handling.
- Optimizing without evidence.

# 10. Day-Level Best Practices

Explicit sizes, ownership, strong warnings, structured cleanup, sanitizers/fuzzing, correct synchronization, portable representations, Evidence First / No Bluff.

# 11. Interview Questions

Explain three key topics, one failure, one debugging artifact, one production use, and one safer alternative.

# 12. Google-Level Follow-Ups

What changes on another compiler/architecture, under concurrency, for untrusted input, under optimization, or if a safer language is allowed?

# 13. Quick Revision

```text
What is it?
What is the type/size?
Who owns it?
What is the lifetime/capacity?
What can be NULL/overflow/out-of-bounds?
How is cleanup guaranteed?
What tool proves failure?
```

# 14. Day Readiness Gate

- [ ] Every P0 topic READY.
- [ ] Hands-on complete.
- [ ] Drill complete.
- [ ] Bounds/ownership/lifetime explainable.
- [ ] Two follow-up changes survivable.
- [ ] No invented evidence.

**DAY READY:** 80%+ and no P0 failure.
