# Day 02 — Type System, Integers, Pointers, Arrays & Structs

**Module:** M02 — Language Model & Type System  
**Duration:** 2 Hours

# 1. Objective

Complete and integrate these topic units:

1. [Integer types](01-Integer-types.md)
2. [Signed vs unsigned](02-Signed-vs-unsigned.md)
3. [Integer promotions](03-Integer-promotions.md)
4. [Usual arithmetic conversions](04-Usual-arithmetic-conversions.md)
5. [Floating-point types](05-Floating-point-types.md)
6. [char](06-char.md)
7. [size_t](07-size-t.md)
8. [ptrdiff_t](08-ptrdiff-t.md)
9. [Fixed-width integers stdint.h](09-Fixed-width-integers-stdint-h.md)
10. [Enums](10-Enums.md)
11. [typedef](11-typedef.md)
12. [Pointers](12-Pointers.md)
13. [Null pointer](13-Null-pointer.md)
14. [Pointer arithmetic](14-Pointer-arithmetic.md)
15. [Arrays](15-Arrays.md)
16. [Array-to-pointer decay](16-Array-to-pointer-decay.md)
17. [Multidimensional arrays](17-Multidimensional-arrays.md)
18. [Structs](18-Structs.md)
19. [Unions](19-Unions.md)
20. [Bit-fields awareness](20-Bit-fields-awareness.md)
21. [Alignment](21-Alignment.md)
22. [Conversions](22-Conversions.md)
23. [const qualification](23-const-qualification.md)
24. [restrict](24-restrict.md)

# 2. Real-Life Analogy

An array is storage; a pointer is an address-like value. Decay can hide the original size.

# 3. Visualization

```text
Value → Integer/Pointer/Array/Struct → Conversion/Decay → Defined Operation
```

# 4. Mind Map

```text
Type System, Integers, Pointers, Arrays & Structs
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

Create examples for promotions, signedness, pointer arithmetic, decay, structs/unions and fixed-width types.

# 8. Google Interview Drill

Diagnose a signed/unsigned bounds-check bug.

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
