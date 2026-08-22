# GOJ C Interview Mastery Course V1 — Topic-Level Locked TOC

**Duration:** 60 Hours  
**Schedule:** 30 Days × 2 Hours  
**Modules:** 24  
**Topic Units:** 718

# Course Mission

> **Fixed module purpose, C-native implementation.**

Module 4 is implemented through **procedural design, ADTs, opaque handles, function tables, composition, tagged unions and explicit contracts**, not fake classes.

# Signature Topic Sequence

> **What → Why → Plain English → Engineering Explanation → Syntax → Internal Working → Example → Real Project Usage → Best Practices → Common Mistakes → Debugging → Code Review → AI Evaluation → Interview Questions → Practice**

# Module Summary

| Module | Purpose | Days | Hours |
|---|---|---|---:|
| M01 | Language Foundations | Day 01 | 2h |
| M02 | Language Model & Type System | Day 02 | 2h |
| M03 | Functions, Scope & Core Constructs | Day 03 | 2h |
| M04 | OOP / Design Model | Day 04 | 2h |
| M05 | Design Principles & Gang of Four Patterns | Day 05, Day 06 | 4h |
| M06 | Collections & Standard Library | Day 07 | 2h |
| M07 | Error / Exception Handling | Day 08 | 2h |
| M08 | Modules, Packages, Build & Dependency Management | Day 09 | 2h |
| M09 | Runtime, Memory & Internals | Day 10 | 2h |
| M10 | Concurrency / Async | Day 11, Day 12 | 4h |
| M11 | Modern & Advanced Features | Day 13 | 2h |
| M12 | I/O, Serialization & Networking | Day 14 | 2h |
| M13 | Coding & DSA | Day 15, Day 16 | 4h |
| M14 | Debugging & Troubleshooting | Day 17 | 2h |
| M15 | Code Review & Refactoring Mastery | Day 18 | 2h |
| M16 | AI-Generated Code Evaluation | Day 19 | 2h |
| M17 | Testing & Quality Engineering | Day 20 | 2h |
| M18 | Database & Data Access | Day 21 | 2h |
| M19 | Backend / Framework / API Engineering | Day 22, Day 23 | 4h |
| M20 | Performance & Security | Day 24, Day 25 | 4h |
| M21 | Architecture & Distributed Systems | Day 26, Day 27 | 4h |
| M22 | Production Engineering & Deployment | Day 28 | 2h |
| M23 | Senior Engineering Scenarios & Capstone Challenge | Day 29 | 2h |
| M24 | Interview, Practical Assessment & Final Readiness | Day 30 | 2h |
| | **Total** | **30 Days** | **60h** |

# Day-Wise TOC

| Day | Module | Focus | Topics | Hours |
|---:|---|---|---|---:|
| 01 | M01 | C Toolchain, Syntax & Compilation | C language overview; Compiler toolchain; Preprocessor; Compilation; Linking; Translation units; Header files; Source files; main function; Variables; const; volatile awareness; Operators; if; switch; for; while; do-while; break; continue; goto awareness; Compiler warnings | 2h |
| 02 | M02 | Type System, Integers, Pointers, Arrays & Structs | Integer types; Signed vs unsigned; Integer promotions; Usual arithmetic conversions; Floating-point types; char; size_t; ptrdiff_t; Fixed-width integers stdint.h; Enums; typedef; Pointers; Null pointer; Pointer arithmetic; Arrays; Array-to-pointer decay; Multidimensional arrays; Structs; Unions; Bit-fields awareness; Alignment; Conversions; const qualification; restrict | 2h |
| 03 | M03 | Functions, Scope, Storage Duration & Callbacks | Function declarations; Function definitions; Prototypes; Pass by value; Pointers for mutation; Array parameters; Return values; Returning structs; Returning pointers safely; Variadic functions awareness; stdarg.h awareness; Function pointers; Callbacks; Comparator callbacks; Recursion; Block scope; File scope; Static storage duration; Automatic storage duration; extern; static functions; inline awareness | 2h |
| 04 | M04 | C Design Model: ADTs, Opaque Types & Function Tables | Procedural design; Abstract data types; Opaque structs; Incomplete types; Header/API boundaries; Encapsulation through translation units; Composition with structs; Function tables; Vtable pattern awareness; Interface by function pointers; Dependency injection with function pointers; Context objects; Handle pattern; State machines; Tagged unions; Discriminated union pattern; Object-like design in C awareness; Data-oriented design awareness; API ownership contracts; ABI-aware struct design | 2h |
| 05 | M05 | SOLID & GoF Creational/Structural Patterns in C | Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP); DRY; KIS; YAGNI; Cohesion and coupling; Dependency inversion; Composition; Factory Method; Abstract Factory; Builder; Prototype; Singleton; Adapter; Bridge; Composite; Decorator; Facade; Flyweight; Proxy; Pattern trade-off defense | 2h |
| 06 | M05 | GoF Behavioral Patterns in C | Chain of Responsibility; Command; Interpreter; Iterator; Mediator; Memento; Observer; State; Strategy; Template Method; Visitor; Function pointers as Strategy; Callback tables as Observer; State machine vs State pattern; Tagged unions vs Visitor awareness; Pattern combinations | 2h |
| 07 | M06 | Arrays, C Strings, Memory Utilities & Containers | Arrays; Character arrays; C strings; Null terminator; strlen; strcmp; strncmp; strcpy risk awareness; strncpy caveats; snprintf; strchr; strstr; strtok caveats; memcpy; memmove; memset; memcmp; qsort; bsearch; Dynamic arrays implementation awareness; Linked list implementation awareness; Hash table implementation awareness; Ring buffer awareness; Flexible array members; Container ownership; Complexity | 2h |
| 08 | M07 | Error Handling, errno & Cleanup Patterns | Return-code error handling; Boolean success/failure; Out parameters; Sentinel values; errno; perror; strerror awareness; Custom error enums; Error structs awareness; Error propagation; Error context; goto cleanup pattern; Single-exit cleanup pattern; Partial initialization; Resource cleanup; setjmp awareness; longjmp awareness; Recoverable vs programmer errors; API error contracts; Retryable vs non-retryable errors | 2h |
| 09 | M08 | Headers, Linkage, Libraries & Build Systems | Header discipline; Include guards; pragma once awareness; Declarations vs definitions; External linkage; Internal linkage; static at file scope; extern; Tentative definitions awareness; Multiple definition errors; Static libraries; Shared libraries; Dynamic linking awareness; Symbol visibility awareness; ABI awareness; Make awareness; Makefile targets; CMake awareness; pkg-config awareness; Compiler flags; Feature-test macros awareness; Cross compilation; Vendoring; Supply-chain risk | 2h |
| 10 | M09 | Memory, Allocation, Aliasing & Undefined Behavior | Object lifetime in C; Storage durations; Stack practical model; Heap practical model; malloc; calloc; realloc; free; Allocation failure; realloc safe pattern; Memory leaks; Double free; Use-after-free; Dangling pointer; Wild pointer; Uninitialized memory; Indeterminate values awareness; Effective type awareness; Strict aliasing awareness; Alignment; Padding; Object representation; Undefined behavior; Unspecified behavior; Implementation-defined behavior; Sequencing rules awareness; Sanitizers awareness | 2h |
| 11 | M10 | Threads, Mutexes, Condvars & C Memory Model | C11 threads awareness; POSIX pthreads awareness; pthread_create awareness; pthread_join awareness; pthread_mutex_t awareness; pthread_cond_t awareness; Data races; C memory model awareness; Happens-before awareness; Thread-local storage; _Thread_local awareness; Deadlock; Lock ordering; Condition-variable predicates; Spurious wakeups; Thread lifecycle; Shared-state design; False sharing awareness | 2h |
| 12 | M10 | Atomics, volatile & Concurrent Data Structures | stdatomic.h; _Atomic; Atomic load/store; atomic_fetch_add awareness; compare_exchange awareness; memory_order_seq_cst; memory_order_relaxed awareness; Acquire/release awareness; Atomic flag awareness; Lock-free awareness; Wait-free awareness; ABA problem awareness; volatile semantics; volatile vs atomic; Signal-handler constraints awareness; Bounded queues; Producer-consumer; Ring buffers; Backpressure; Semaphore awareness; Lock-free programming caution | 2h |
| 13 | M11 | Modern C: C11/C17/C23 Awareness & Generic Selection | C standard evolution awareness; C89/C90 awareness; C99 awareness; C11 awareness; C17 awareness; C23 awareness; Designated initializers; Compound literals; Variable length arrays awareness; Flexible array members; _Static_assert; static_assert awareness; _Generic; Generic selection; Anonymous structs/unions awareness; restrict; _Alignas awareness; alignas awareness; Noreturn awareness; Attributes awareness; typeof awareness; nullptr awareness in newer C; constexpr awareness in newer C; Compatibility across standards | 2h |
| 14 | M12 | Files, Streams, Binary Data & Networking | FILE; fopen; fclose; fread; fwrite; fgets; fputs; fprintf; fscanf risks awareness; feof caveat; ferror; fflush; Binary vs text mode; fseek; ftell; POSIX file descriptors awareness; open/read/write/close awareness; Partial reads/writes; EINTR awareness; Binary serialization risks; Endianness; Network byte order; Struct padding serialization risk; Sockets awareness; socket/bind/listen/accept awareness; connect awareness; send/recv awareness; Timeouts; select/poll awareness; Payload size limits; Protocol framing | 2h |
| 15 | M13 | DSA I: Arrays, Strings, Hashing & Sliding Windows | Google problem-solving flow; Big-O; Arrays; C strings; Length-aware string processing; Hash table implementation awareness; Two pointers; Sliding window; Stack using array; Queue using circular buffer; Deque awareness; Prefix sums awareness; Brute force to optimization; Boundary conditions; Off-by-one errors; Integer overflow in algorithms; Complexity communication | 2h |
| 16 | M13 | DSA II: Trees, Heaps, Graphs, BFS/DFS & Topological Sort | Recursion; Call stack depth; Binary tree structs; Tree traversal; BST awareness; Heap implementation; Priority queue implementation; Top-K; Graph representation; Adjacency matrix; Adjacency list; BFS; DFS; Visited arrays/maps awareness; Cycle detection; Topological sort; V and E complexity; Iterative vs recursive traversal; Memory ownership in graph structures | 2h |
| 17 | M14 | Debugging: GDB/LLDB, Sanitizers, Core Dumps & Static Analysis | Debugging workflow; GDB awareness; LLDB awareness; Breakpoints; Watchpoints; Backtraces; Core dumps; AddressSanitizer; UndefinedBehaviorSanitizer; ThreadSanitizer awareness; MemorySanitizer awareness; LeakSanitizer awareness; Valgrind awareness; Static analyzers awareness; clang-tidy awareness; cppcheck awareness; Compiler warnings; Memory corruption diagnosis; Use-after-free diagnosis; Double-free diagnosis; Race diagnosis; Optimized build debugging; Symbol files; Root-cause evidence | 2h |
| 18 | M15 | Code Review, Refactoring & Safe C | Risk-first code review; Correctness; Bounds review; Pointer lifetime review; Ownership review; Allocation/free pairing; realloc review; Integer conversion review; Signed/unsigned review; String safety; Null handling; Error propagation; goto cleanup review; Concurrency review; volatile misuse review; Atomic review; Undefined behavior review; Macro review; Global state; Header hygiene; API contracts; Const-correctness; Refactoring; Characterization tests; Naming; Public ABI compatibility; Technical debt; MISRA C awareness; CERT C awareness | 2h |
| 19 | M16 | AI-Generated C Code Evaluation | AI code as untrusted proposal; Hallucinated standard APIs; Wrong C standard assumptions; Buffer overflow bugs; Off-by-one errors; Use-after-free; Double free; Dangling pointers; realloc misuse; Integer overflow; Signed/unsigned bugs; Undefined behavior; Strict-aliasing violations; Incorrect volatile use; Atomic-ordering mistakes; Data races; Unsafe string handling; Serialization mistakes; Generated Make/CMake; Generated tests; Generated benchmarks; Security review; Performance claims; Human approval; Accept repair reject rubric | 2h |
| 20 | M17 | Testing, Fuzzing, Sanitizers & Benchmarks | Test strategy; Unity test framework awareness; Check framework awareness; cmocka awareness; Assertions; Test fixtures awareness; Fakes; Stubs; Dependency injection for C; Integration tests; File/network tests; Fuzzing; libFuzzer awareness; AFL++ awareness; Sanitizers in CI; Coverage with gcov awareness; lcov awareness; Mutation testing awareness; Microbenchmark methodology; Compiler optimization in benchmarks; Concurrency test flakiness | 2h |
| 21 | M18 | Database C APIs, Transactions & Resource Ownership | SQL from C; Parameterized queries; Prepared statements; Connection lifecycle; Connection pooling awareness; Transactions; Isolation awareness; Locking; Optimistic concurrency; Result-set ownership; SQLite C API awareness; sqlite3_prepare_v2 awareness; sqlite3_bind awareness; libpq awareness; PQexecParams awareness; ODBC C API awareness; N+1 problem; Batch operations; Repository/module boundary; Schema migrations; Long transactions; Remote calls inside transactions; Cleanup on DB errors; Retryable database errors | 2h |
| 22 | M19 | C Backend/System API Engineering | C backend/system service use cases; Socket server model; Blocking I/O model; Non-blocking I/O awareness; select; poll; epoll awareness; kqueue awareness; libevent awareness; libuv awareness; HTTP parser/library awareness; libcurl awareness; Request lifecycle; Routing awareness; Handler functions; Context structs; Dependency injection with function tables; Configuration; Runtime validation; Logging; Request IDs; Graceful shutdown; Signal handling awareness; Server timeouts; Health checks; Readiness; Threading model; Event-loop model; Framework trade-offs | 2h |
| 23 | M19 | REST, Auth, Idempotency & Binary Protocol Contracts | REST resource design; HTTP methods; Status codes; Request validation; Stable error contracts; Authentication; Authorization; Object-level authorization; JWT library awareness; OAuth2/OIDC awareness; Pagination; Cursor pagination awareness; Idempotency keys; Retries and side effects; OpenAPI awareness; Protobuf C awareness; gRPC C-core awareness; TLS awareness; Binary protocol framing; Schema evolution; API versioning; Backward compatibility | 2h |
| 24 | M20 | C Performance: Cache, Allocation, Copies & Profiling | Performance methodology; Latency percentiles; Throughput; CPU profiling; perf awareness; Cache locality; Cache lines awareness; False sharing; Branch prediction awareness; Allocation cost; Heap fragmentation awareness; Memory pools awareness; Arena allocators awareness; Object pools awareness; Copy cost; memcpy performance awareness; Data layout; Array of structs vs struct of arrays awareness; Inlining; restrict optimization implications; Vectorization awareness; SIMD awareness; Compiler optimization levels; LTO awareness; PGO awareness; Benchmark pitfalls | 2h |
| 25 | M20 | C Security: Memory, Integer, Input & Hardening | Threat modeling; Buffer overflow; Out-of-bounds read/write; Use-after-free; Double free; Integer overflow; Integer truncation; Signed/unsigned conversion; Format string vulnerabilities; Unsafe printf usage; Unsafe string functions; Input validation; SQL injection; Command injection; Path traversal; SSRF awareness; File upload security; Deserialization risk; TLS verification awareness; Secrets management; Secure logging; Compiler hardening flags; Stack protector; FORTIFY_SOURCE awareness; ASLR/DEP awareness; Sanitizers; Static analysis; Dependency vulnerabilities; Supply-chain risk; Race conditions as security risk | 2h |
| 26 | M21 | System Design with C: Embedded/System Services & Messaging | System-design method; Functional requirements; Non-functional requirements; Capacity estimation; When C is appropriate; Embedded systems awareness; Systems daemons; Latency-sensitive design; Memory-constrained design; Threading model choices; Event loops; Async I/O awareness; Load balancing awareness; Caching; Rate limiting; SQL vs NoSQL trade-offs; Queues; Events; Messaging; ZeroMQ awareness; MQTT awareness; Idempotent consumers; Outbox pattern; Modular monolith; Microservices awareness; Service boundaries; Backpressure; Observability | 2h |
| 27 | M21 | Distributed Systems: Timeouts, Retries, Sagas & Observability | Partial failure; Timeouts; Deadlines; Retries; Exponential backoff; Jitter; Retry budgets; Circuit breaker awareness; Bulkhead awareness; Backpressure; Load shedding; Idempotency; At-least-once delivery; Exactly-once myth awareness; Outbox; Saga; Compensation; Event ordering; Dead-letter queues; Schema versioning; Distributed tracing awareness; OpenTelemetry C awareness; Correlation IDs; CAP awareness; Graceful degradation; Cancellation propagation awareness | 2h |
| 28 | M22 | Production Engineering: Builds, Cross-Compilation, Containers & CI/CD | Production compiler flags; Debug symbols; Release optimization; Sanitizer builds; Static analysis; Warnings as errors; Reproducible builds; Make/CMake automation; Cross compilation; Toolchains; Artifact versioning; Static linking awareness; Dynamic linking; ABI compatibility; Containerization; Docker; Minimal images awareness; Non-root containers; Kubernetes awareness; Readiness vs liveness; Graceful shutdown; Signal handling; Rolling deployment awareness; Canary awareness; CI/CD; Logs; Metrics; Traces awareness; Core dumps; Alerts; Runbooks; RPO/RTO | 2h |
| 29 | M23 | Senior C Architect Scenarios & Capstone | Legacy C modernization; Unsafe string migration; Raw allocation cleanup redesign; Global state reduction; Threading redesign; Embedded firmware architecture awareness; Protocol parser redesign; Memory leak incident; Use-after-free incident; Buffer overflow incident; Deadlock incident; Race-condition incident; Compiler upgrade impact; Standard upgrade decision; Build-system modernization; Library replacement decision; Security incident; Technical debt; Client trade-offs; Architecture review; AI integration; Team coding standards; Capstone challenge | 2h |
| 30 | M24 | Final C Interview Readiness | Rapid recall; Integer conversion questions; Pointer questions; Array-decay questions; Struct/union questions; Function-pointer questions; Storage-duration questions; Allocation/realloc questions; String questions; Undefined-behavior questions; Error-handling questions; Thread/atomic questions; Coding challenge; Debugging challenge; Code review challenge; System/API challenge; Database challenge; Security challenge; System-design challenge; Architect follow-ups; Communication; Evidence First; No Bluff; Final readiness scoring | 2h |

# 23 GoF Patterns

## Creational
- Factory Method
- Abstract Factory
- Builder
- Prototype
- Singleton

## Structural
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

## Behavioral
- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor

# Final Gate

- No P0 weakness.
- Integer/pointer/array semantics strong.
- Bounds, ownership, storage duration and cleanup strong.
- 23/23 GoF explainable in C-native terms.
- malloc/calloc/realloc/free and UB strong.
- Thread/atomic/volatile distinction strong.
- Sanitizer/fuzzer/debugging strong.
- Networking/data/security/performance/production defendable.
- AI-generated C critically evaluated.
- Evidence First / No Bluff.
