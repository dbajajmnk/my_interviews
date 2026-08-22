# Day 07 — Arrays, C Strings, Memory Utilities & Containers

**Module:** M06 — Collections & Standard Library  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Arrays](01-Arrays.md)
2. [Character arrays](02-Character-arrays.md)
3. [C strings](03-C-strings.md)
4. [Null terminator](04-Null-terminator.md)
5. [strlen](05-strlen.md)
6. [strcmp](06-strcmp.md)
7. [strncmp](07-strncmp.md)
8. [strcpy risk awareness](08-strcpy-risk-awareness.md)
9. [strncpy caveats](09-strncpy-caveats.md)
10. [snprintf](10-snprintf.md)
11. [strchr](11-strchr.md)
12. [strstr](12-strstr.md)
13. [strtok caveats](13-strtok-caveats.md)
14. [memcpy](14-memcpy.md)
15. [memmove](15-memmove.md)
16. [memset](16-memset.md)
17. [memcmp](17-memcmp.md)
18. [qsort](18-qsort.md)
19. [bsearch](19-bsearch.md)
20. [Dynamic arrays implementation awareness](20-Dynamic-arrays-implementation-awareness.md)
21. [Linked list implementation awareness](21-Linked-list-implementation-awareness.md)
22. [Hash table implementation awareness](22-Hash-table-implementation-awareness.md)
23. [Ring buffer awareness](23-Ring-buffer-awareness.md)
24. [Flexible array members](24-Flexible-array-members.md)
25. [Container ownership](25-Container-ownership.md)
26. [Complexity](26-Complexity.md)

# 2. Real-Life Analogy

Day 07 translates the locked GOJ structure into C-native bounds, ownership, memory, systems and production reasoning.

# 3. Visualization

```text
Buffer → Length/Capacity → Memory Utility → Ownership
```

# 4. Mind Map

```text
Arrays, C Strings, Memory Utilities & Containers
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

Implement a safe dynamic array and compare memcpy vs memmove.

# 8. Google Interview Drill

Fix a one-byte string buffer overflow.

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
