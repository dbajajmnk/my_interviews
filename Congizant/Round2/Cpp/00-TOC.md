# GOJ C++ Interview Mastery Course V1 — Topic-Level Locked TOC

**Duration:** 60 Hours  
**Schedule:** 30 Days × 2 Hours  
**Modules:** 24 Fixed GOJ Modules  
**Topic Units:** 771  
**Standard:** KIS + DRY + SOLID + Google-Level + 360° + Evidence First + No Bluff

---

# 1. Course Mission

> **Preserve the GOJ signature while making every implementation genuinely C++-native.**

Core engineering spine:

```text
Language Semantics
→ Lifetime / Ownership
→ RAII / Rule of Zero
→ STL / Algorithms / Ranges
→ Templates / Concepts / Move Semantics
→ Memory Model / Threads / Atomics
→ Undefined Behavior / Sanitizers
→ Performance / Cache / Allocation
→ API / Distributed / Production Engineering
```

---

# 2. Signature Topic Sequence

Every topic file follows:

> **What → Why → Plain English → Engineering Explanation → Syntax → Internal Working → Example → Real Project Usage → Best Practices → Common Mistakes → Debugging → Code Review → AI Evaluation → Interview Questions → Practice**

---

# 3. Interview Execution

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Sanitize/Profile if Needed → Edge Cases → Complexity/Cost → Failure/UB → Trade-Off → Follow-Up → Defend**

---

# 4. Module Summary

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
|  | **Total** | **30 Days** | **60h** |

---

# 5. Day-Wise TOC

| Day | Module | Day Focus | Topic Units | Hours | Priority |
|---:|---|---|---|---:|---|
| 01 | M01 | C++ Ecosystem, Toolchain, Syntax, Compilation & Core Execution | C++ language overview; Compiler toolchain; Preprocessing; Compilation; Assembly generation awareness; Linking; Translation units; Header files; Source files; main function; Namespaces; using declarations; Variables; const; constexpr awareness; auto; Fundamental operators; if; switch; for; range-based for; while; Structured bindings awareness; Coding conventions; Warnings as errors awareness | 2h | P0 |
| 02 | M02 | C++ Type System, Value Categories, References, Pointers, const & Object Semantics | Fundamental types; Integer types; Floating-point types; bool; char types; std::byte awareness; Enumerations; Scoped enum enum class; Type aliases; using aliases; auto type deduction; decltype; const qualification; Pointers; Null pointer nullptr; References; Lvalue references; Rvalue references awareness; Value categories; lvalue; xvalue awareness; prvalue awareness; Array types; Pointer arithmetic awareness; Conversions; static_cast; dynamic_cast awareness; const_cast awareness; reinterpret_cast awareness; Object lifetime overview | 2h | P0 |
| 03 | M03 | Functions, Overloading, References, Lambdas, Templates Basics & Scope | Function declarations; Function definitions; Parameter passing by value; Pass by reference; Pass by const reference; Pass by pointer; Return by value; Return by reference risk; Function overloading; Default arguments; Inline functions; Function pointers; std::function awareness; Lambdas; Lambda capture by value; Lambda capture by reference; mutable lambdas awareness; Generic lambdas; Scopes; Storage duration awareness; Static local variables; Templates introduction | 2h | P0 |
| 04 | M04 | Classes, RAII, Constructors, Destructors, Inheritance & Composition | Classes; Structs vs classes; Access specifiers; Constructors; Default constructor; Parameterized constructor; Delegating constructors; Destructor; RAII; Member initializer lists; this pointer; Static members; Friend awareness; Encapsulation; Inheritance; Public inheritance; Protected/private inheritance awareness; Virtual functions; Override; final; Abstract classes; Pure virtual functions; Virtual destructors; Object slicing; Composition over inheritance; Rule of Zero awareness; Rule of Three; Rule of Five; Copy constructor; Copy assignment; Move constructor; Move assignment | 2h | P0 |
| 05 | M05 | SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in C++ | Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP); DRY; KIS; YAGNI; Cohesion and coupling; Dependency inversion; Composition; Factory Method; Abstract Factory; Builder; Prototype; Singleton; Adapter; Bridge; Composite; Decorator; Facade; Flyweight; Proxy; Pattern trade-off defense | 2h | P0 |
| 06 | M05 | GoF Behavioral Patterns & C++-Native Pattern Design | Chain of Responsibility; Command; Interpreter; Iterator; Mediator; Memento; Observer; State; Strategy; Template Method; Visitor; Lambdas as Strategy; std::variant as State modeling awareness; std::visit as Visitor awareness; Ranges/pipelines vs Chain awareness; Pattern combinations | 2h | P0 |
| 07 | M06 | STL Containers, Iterators, Algorithms, Ranges & Complexity | std::array; std::vector; std::deque; std::list awareness; std::forward_list awareness; std::map; std::unordered_map; std::set; std::unordered_set; std::multimap awareness; std::multiset awareness; std::stack; std::queue; std::priority_queue; Iterators; Iterator categories awareness; begin/end; Algorithms; std::sort; std::find; std::transform; std::accumulate awareness; std::lower_bound; std::binary_search; erase-remove idiom awareness; Ranges awareness; Views awareness; Container invalidation rules; Allocator awareness; Collection complexity | 2h | P0 |
| 08 | M07 | Exceptions, noexcept, RAII Failure Safety & Error Modeling | Exception hierarchy awareness; throw; try; catch; catch by reference; catch-all; Custom exceptions; std::exception; what(); Exception propagation; Stack unwinding; RAII during unwinding; noexcept; noexcept operator awareness; Destructor exception rules; Strong exception guarantee; Basic exception guarantee; No-throw guarantee; Exception safety; Error codes awareness; std::error_code awareness; std::optional as absence; std::expected awareness; Exception vs expected/error-code trade-offs; Resource cleanup | 2h | P0 |
| 09 | M08 | Build Systems, CMake, Libraries, Linkage, ODR & Dependency Management | Header/source organization; Include guards; pragma once awareness; Forward declarations; Internal linkage; External linkage; static at namespace scope awareness; inline variables awareness; One Definition Rule; Name mangling awareness; Static libraries; Shared libraries; Dynamic linking awareness; ABI awareness; CMake; Targets; target_include_directories; target_link_libraries; Compile features; Generator awareness; Build types; Presets awareness; Package managers vcpkg awareness; Conan awareness; Dependency versioning; Transitive dependencies; Modules awareness; Header units awareness; Supply-chain risk | 2h | P0 |
| 10 | M09 | Object Lifetime, Memory Layout, Stack/Heap, Allocators & Undefined Behavior | Automatic storage duration; Static storage duration; Thread storage duration awareness; Dynamic storage duration; Stack vs heap practical model; new/delete; new[]/delete[]; Placement new awareness; Object lifetime rules; Construction/destruction order; Memory alignment; Padding awareness; sizeof; alignof; Strict aliasing awareness; Undefined behavior; Use-after-free; Double delete; Dangling pointer; Dangling reference; Memory leak; Allocator model awareness; std::allocator awareness; Custom allocator awareness; Sanitizers awareness | 2h | P0 |
| 11 | M10 | Threads, mutex, locks, condition_variable & the C++ Memory Model | std::thread; jthread awareness; Thread lifetime; join; detach caution; std::mutex; std::recursive_mutex awareness; std::timed_mutex awareness; std::lock_guard; std::unique_lock; std::scoped_lock; Deadlock; Lock ordering; std::condition_variable; Spurious wakeups; Predicate waits; Data races; C++ memory model; Happens-before awareness; Sequenced-before awareness; Thread-safe initialization; call_once; once_flag; False sharing awareness; Thread-local storage awareness | 2h | P0 |
| 12 | M10 | Atomics, Memory Ordering, Futures, async & Concurrent Design | std::atomic; Atomic operations; compare_exchange awareness; Memory order seq_cst; memory_order_relaxed awareness; Acquire/release awareness; Atomic flag awareness; Lock-free awareness; Wait-free awareness; ABA problem awareness; std::future; std::promise; std::packaged_task awareness; std::async; launch policies; Future exceptions; Cancellation limitations awareness; stop_token awareness; jthread stop_token awareness; Thread pool pattern; Producer-consumer; Bounded queue; Backpressure; Lock-free data structures caution | 2h | P0 |
| 13 | M11 | Templates, Concepts, constexpr, Move Semantics & Modern C++ | Function templates; Class templates; Template argument deduction; Specialization awareness; Partial specialization awareness; Variadic templates; Parameter packs; Fold expressions awareness; SFINAE awareness; Concepts; requires clauses; Type traits; std::enable_if awareness; constexpr; consteval awareness; constinit awareness; Move semantics; std::move; Perfect forwarding awareness; std::forward; Universal/forwarding references awareness; Copy elision; Return value optimization; Guaranteed copy elision awareness; Structured bindings; std::optional; std::variant; std::any awareness; Smart pointers overview | 2h | P0 |
| 14 | M12 | Smart Pointers, Streams, Files, Serialization & Networking Awareness | std::unique_ptr; std::shared_ptr; std::weak_ptr; Ownership semantics; make_unique; make_shared; Shared_ptr reference counting awareness; Cyclic ownership; Weak references; Custom deleters awareness; iostream; istream; ostream; ifstream; ofstream; stringstream; Binary I/O awareness; Filesystem library; std::filesystem::path; Serialization formats awareness; JSON library awareness; Protobuf awareness; Boost.Asio awareness; Sockets awareness; HTTP client/server library awareness; Timeouts; Streaming I/O; Buffer lifetime; Payload size limits | 2h | P0 |
| 15 | M13 | DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Stacks | Google problem-solving flow; Big-O; std::vector; std::string; std::string_view awareness; unordered_map for hashing; unordered_set membership; Two pointers; Sliding window; std::stack; std::queue; std::deque; Prefix sums awareness; Brute force to optimization; Edge cases; Complexity communication; Iterator safety | 2h | P0 |
| 16 | M13 | DSA II: Recursion, Trees, Heaps, Graphs, BFS/DFS & Dependency Problems | Recursion; Call stack depth; Binary trees; Tree traversal; BST awareness; std::priority_queue; Heap algorithms awareness; Top-K; Graph representation; Adjacency lists; BFS; DFS; Visited set; Cycle detection; Topological sort; V and E complexity; Iterative vs recursive traversal; Template graph helpers awareness | 2h | P0 |
| 17 | M14 | C++ Debugging: GDB/LLDB, Sanitizers, Valgrind Awareness & Profiling | Debugging workflow; GDB awareness; LLDB awareness; Breakpoints; Watchpoints; Backtraces; Core dumps awareness; AddressSanitizer; UndefinedBehaviorSanitizer; ThreadSanitizer; MemorySanitizer awareness; LeakSanitizer awareness; Valgrind awareness; Heap profiling awareness; perf awareness; Flame graphs awareness; CPU profiling; Memory profiling; Deadlock diagnosis; Data race diagnosis; Use-after-free diagnosis; One-process anomaly diagnosis; Symbol files awareness; Optimized build debugging; Root-cause evidence | 2h | P0 |
| 18 | M15 | Code Review, Refactoring & Modern C++ Safety | Risk-first code review; Correctness; Lifetime review; Ownership review; RAII review; Raw pointer review; Smart pointer review; Move semantics review; Iterator invalidation; Exception safety; noexcept review; Thread safety; Data race review; Undefined behavior review; Const-correctness; API contracts; Inheritance abuse; Template overengineering; Macro abuse; Global state; Premature optimization; Refactoring; Characterization tests; Naming; Header hygiene; ABI/public API compatibility; Technical debt; C++ Core Guidelines awareness | 2h | P0 |
| 19 | M16 | AI-Generated C++ Code Evaluation & Safe Engineering Use | AI code as untrusted proposal; Hallucinated standard-library APIs; Wrong C++ standard assumptions; Ownership bugs; Use-after-free; Double free; Dangling references; Dangling string_view; Shared_ptr cycles; Missing virtual destructor; Incorrect move semantics; Undefined behavior; Data races; Deadlocks; Incorrect atomics; Exception-safety bugs; Buffer overflow risk; Unsafe casts; Generated templates; Generated CMake; Generated tests; Generated benchmarks; Security review; Performance claims; Human approval; Accept repair reject rubric | 2h | P0 |
| 20 | M17 | Testing: GoogleTest/Catch2 Awareness, Unit, Fuzzing, Sanitizers & Benchmarks | Test strategy; GoogleTest awareness; Catch2 awareness; Assertions; Parameterized tests; Test fixtures; Mocks awareness; Fakes; Stubs; Dependency injection for tests; Integration tests; File/network tests; Property-based testing awareness; Fuzzing; libFuzzer awareness; Sanitizers in CI; ThreadSanitizer tests; Coverage awareness; Mutation testing awareness; Google Benchmark awareness; Microbenchmark methodology; Compiler optimization in benchmarks; Flaky concurrency tests | 2h | P0 |
| 21 | M18 | Database Access, Transactions, Drivers/ORM Awareness & Resource Safety | SQL from C++; Parameterized queries; Prepared statements; Connection lifecycle; Connection pools awareness; Transactions; Isolation awareness; Locking; Optimistic concurrency; Result-set lifetime; RAII wrappers for DB resources; SQLite C/C++ API awareness; libpq/PostgreSQL awareness; ODBC awareness; SOCI awareness; ODB ORM awareness; N+1 problem; Batch queries; Repository boundary; Schema migrations; Long transactions; Remote calls inside transactions; Error translation; Retryable database failures | 2h | P0 |
| 22 | M19 | C++ Backend/API Engineering: HTTP Framework Awareness, Services & Boundaries | C++ backend use cases; HTTP server framework awareness; Boost.Beast awareness; Drogon awareness; Crow awareness; Pistache awareness; Request lifecycle; Routing; Handlers; Middleware/interceptors awareness; Service layer; Repository layer; Dependency injection approaches; Configuration; Runtime validation; JSON DTOs awareness; Logging; Request IDs; Graceful shutdown; Server timeouts; Health checks; Readiness; Threading model awareness; Async I/O model awareness; Framework trade-offs | 2h | P0 |
| 23 | M19 | REST, Auth, Idempotency, gRPC/Protobuf & API Contracts | REST resource design; HTTP methods; Status codes; Request validation; Stable error contracts; Authentication; Authorization; Object-level authorization; JWT awareness; OAuth2/OIDC awareness; Pagination; Cursor pagination awareness; Idempotency keys; Retries and side effects; OpenAPI awareness; gRPC; Protobuf; Schema evolution; Generated stubs; HTTP/2 awareness; TLS awareness; API versioning; Backward compatibility | 2h | P0 |
| 24 | M20 | C++ Performance: Cache Locality, Allocation, Copies, Branching & Profiling | Performance methodology; Latency percentiles; Throughput; CPU profiling; Cache locality; Cache lines awareness; False sharing; Branch prediction awareness; Allocations; Heap fragmentation awareness; Object pools awareness; Custom allocators awareness; Small object optimization awareness; Copy cost; Move semantics; Copy elision; String allocation; string_view; Span awareness; Vector reserve; Container choice; Virtual dispatch cost awareness; Template/static polymorphism awareness; Inlining; Auto-vectorization awareness; SIMD awareness; Compiler optimization levels; Link-time optimization awareness; Profile-guided optimization awareness; Benchmark pitfalls | 2h | P0 |
| 25 | M20 | C++ Security: Memory Safety, Undefined Behavior, Input, Files & Supply Chain | Threat modeling; Memory safety; Buffer overflow; Out-of-bounds access; Use-after-free; Double free; Integer overflow awareness; Signed/unsigned bugs; Format string risk awareness; Unsafe C APIs; Safe string/container usage; Input validation; SQL injection; Command injection; Path traversal; SSRF awareness; File upload security; Deserialization risk; TLS verification awareness; Secrets management; Secure logging; Compiler hardening flags awareness; ASLR/DEP awareness; Stack protector awareness; Sanitizers; Static analysis awareness; Dependency vulnerabilities; CMake/package supply-chain risk; Unsafe casts; Race conditions as security risk | 2h | P0 |
| 26 | M21 | System Design with C++: High Performance Services, Caching, Messaging & Boundaries | System-design method; Functional requirements; Non-functional requirements; Capacity estimation; C++ service suitability; Latency-sensitive design; Throughput-sensitive design; Threading model choices; Event loops awareness; Async I/O awareness; Load balancing; Caching; Rate limiting; SQL vs NoSQL trade-offs; Replication awareness; Partitioning awareness; Queues; Events; Messaging; Kafka client awareness; ZeroMQ awareness; Idempotent consumers; Outbox pattern; Modular monolith; Microservices; Service boundaries; Consistency trade-offs; Backpressure; Observability | 2h | P0 |
| 27 | M21 | Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability | Partial failure; Timeouts; Deadlines; Retries; Exponential backoff; Jitter; Retry budgets; Circuit breaker; Bulkhead; Backpressure; Load shedding; Idempotency; At-least-once delivery; Exactly-once myth awareness; Outbox; Saga; Compensation; Event ordering; Dead-letter queues; Schema versioning; Distributed tracing awareness; OpenTelemetry C++ awareness; Correlation IDs; CAP awareness; Graceful degradation; Cancellation propagation awareness | 2h | P0 |
| 28 | M22 | Production Engineering: CMake Builds, Containers, CI/CD, Observability & Hardening | Production build profiles; Debug symbols; Release optimization; Sanitizer builds; Static analysis; clang-tidy awareness; cppcheck awareness; Compiler warnings; Warnings as errors; Reproducible builds; CMake presets awareness; Artifact versioning; Shared library deployment; ABI compatibility; Containerization; Docker; Multi-stage builds; Minimal images awareness; Non-root containers; Kubernetes awareness; Readiness vs liveness; Graceful shutdown; Rolling deployment; Canary; Feature flags; Backward-compatible migrations; CI/CD; Logs; Metrics; Traces; Crash dumps; Alerts; Runbooks; RPO/RTO | 2h | P0 |
| 29 | M23 | Senior C++ Architect Scenarios & Capstone Challenge | Legacy C++ modernization; C to modern C++ migration awareness; Raw pointer to RAII migration; Threading redesign; ABI compatibility migration; Monolith modernization; Memory leak incident; Use-after-free incident; Latency incident; Deadlock incident; Race-condition incident; Compiler upgrade impact; Standard upgrade decision; Build-system modernization; Library replacement decision; Security incident; Technical debt; Client trade-offs; Architecture review; AI integration; Team coding standard; Capstone challenge | 2h | P0 |
| 30 | M24 | Final C++ Interview Readiness: Lifetime, Templates, Concurrency, Coding, Review & Design | Rapid recall; Pointer/reference questions; const questions; Value category questions; RAII questions; Rule of Five questions; Virtual dispatch questions; STL questions; Iterator invalidation questions; Exception-safety questions; Template/concept questions; Move-semantics questions; Smart-pointer questions; Memory/UB questions; Thread/atomic questions; Coding challenge; Debugging challenge; Code review challenge; Backend/API challenge; Security challenge; System-design challenge; Architect follow-ups; Communication; Evidence First; No Bluff; Final readiness scoring | 2h | P0 |

---

# 6. C++-Native Coverage

```text
Toolchain / Preprocess / Compile / Link
→ Types / Pointers / References / Value Categories
→ Functions / Lambdas / Overloading / Scope
→ Classes / RAII / Rule of Zero/Five / Virtual Dispatch
→ SOLID + 23 GoF
→ STL / Iterators / Algorithms / Ranges
→ Exceptions / noexcept / Exception Safety / expected
→ CMake / ODR / Libraries / ABI
→ Lifetime / Memory / Alignment / Allocators / UB
→ Threads / Mutex / Condition Variables / Memory Model
→ Atomics / Futures / stop_token / Backpressure
→ Templates / Concepts / constexpr / Move / Forwarding
→ Smart Pointers / Files / Serialization / Networking
→ DSA
→ GDB/LLDB / Sanitizers / Profiling
→ Code Review
→ AI Code Evaluation
→ Testing / Fuzzing / Benchmarks
→ DB / Transactions / RAII Data Access
→ HTTP/gRPC/API Engineering
→ Performance / Security
→ Distributed Systems
→ Production Builds / Containers / CI-CD
→ Senior Architect Scenarios
→ Final Readiness
```

---

# 7. All 23 GoF Patterns — Individual Topic Units

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

---

# 8. Final Gate

- 80%+ final readiness.
- No P0 weakness.
- Lifetime/ownership/value-category reasoning automatic.
- RAII/Rule of Zero/Move/Smart Pointer discipline strong.
- 23/23 GoF explainable in modern C++ terms.
- STL/iterator invalidation/complexity strong.
- UB/sanitizer/debugging evidence strong.
- Memory model/thread/atomic reasoning strong.
- Performance/security/distributed/production depth strong.
- AI-generated C++ critically evaluated.
- Evidence First / No Bluff.
