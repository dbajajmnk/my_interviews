# GOJ Rust Interview Mastery Course V1 — Topic-Level Locked TOC

**Duration:** 60 Hours  
**Schedule:** 30 Days × 2 Hours  
**Modules:** 24  
**Topic Units:** 766  
**Standard:** KIS + DRY + SOLID + Google-Level + 360° + Evidence First + No Bluff

# Course Mission

> **Fixed module purpose, Rust-native implementation.**

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
| 01 | M01 | Rust Ecosystem, Cargo & Core Syntax | Rust language overview; rustup awareness; rustc; cargo; cargo new; cargo run; cargo build; cargo check; cargo fmt; cargo clippy awareness; Crates; Packages; Binary crates; Library crates; Variables; let; mut; Constants; Shadowing; Expressions vs statements; if expressions; match awareness; loop; while; for; Ranges; Formatting macros awareness; Edition awareness; Coding conventions | 2h |
| 02 | M02 | Ownership, Borrowing, Moves, Copy & Core Types | Scalar types; Tuples; Arrays; Slices; str; String; Ownership; Moves; Copy trait; Clone trait; Borrowing; Shared references; Mutable references; Borrowing rules; Dereference operator; Reference coercions awareness; Stack vs heap practical model; Drop; Scope-based destruction; Partial moves awareness; Never type awareness; Unit type; Type inference; Type aliases | 2h |
| 03 | M03 | Functions, Patterns, Closures & Iterators | Functions; Parameters; Return values; Blocks as expressions; Pattern matching; match; if let; let else awareness; while let; Destructuring; Function pointers; Closures; Closure capture; Fn; FnMut; FnOnce; move closures; Higher-order functions; Iterators; IntoIterator; Iterator trait; map; filter; fold; Method syntax; Associated functions; Recursion | 2h |
| 04 | M04 | Structs, Enums, Traits & Composition | Structs; Tuple structs; Unit structs; Enums; Enum variants with data; Option; Result awareness; impl blocks; Methods; Associated functions; self; &self; &mut self; Traits; Trait implementation; Default trait methods; Trait bounds awareness; Derive macros awareness; Composition over inheritance; Newtype pattern; State modeling with enums; Dependency injection via traits; Trait objects awareness; dyn Trait awareness | 2h |
| 05 | M05 | SOLID, DRY, KIS, YAGNI & GoF Creational/Structural | Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP); DRY; KIS; YAGNI; Cohesion and coupling; Dependency inversion; Composition; Factory Method; Abstract Factory; Builder; Prototype; Singleton; Adapter; Bridge; Composite; Decorator; Facade; Flyweight; Proxy; Pattern trade-off defense | 2h |
| 06 | M05 | GoF Behavioral Patterns & Rust-Native Design | Chain of Responsibility; Command; Interpreter; Iterator; Mediator; Memento; Observer; State; Strategy; Template Method; Visitor; Closures as Strategy; Enums as State; Iterator trait vs Iterator pattern; Channels/events vs Observer awareness; Trait default methods vs Template Method awareness; Pattern matching vs Visitor awareness; Pattern combinations | 2h |
| 07 | M06 | Collections, Strings & Iterators | Vec<T>; Capacity; reserve awareness; Indexing vs get; Slices; HashMap; Entry API awareness; HashSet; BTreeMap awareness; BTreeSet awareness; VecDeque; BinaryHeap; LinkedList awareness; String; &str; Bytes vs chars; Unicode scalar values awareness; Iterator adapters; collect; enumerate; zip; flat_map awareness; filter_map; fold; sort; sort_unstable awareness; Collection complexity | 2h |
| 08 | M07 | Option, Result, ?, Panic & Error Modeling | Option<T>; Result<T,E>; match on Result; ? operator; From/Into error conversion awareness; Custom error enums; thiserror awareness; anyhow awareness; Error trait; Box<dyn Error> awareness; Error source chains awareness; unwrap; expect; panic!; Panic vs recoverable errors; Assertions; debug_assert awareness; panic=unwind awareness; panic=abort awareness; RAII during unwinding; Drop during unwinding; Error translation; API error contracts | 2h |
| 09 | M08 | Modules, Crates, Cargo Workspaces & Dependencies | Modules; mod; pub; pub(crate) awareness; use; Paths; Cargo.toml; Dependencies; Dev-dependencies; Build-dependencies awareness; Cargo.lock; SemVer awareness; Cargo features; Optional dependencies; Feature unification awareness; Workspaces; Workspace dependencies awareness; Profiles; Release profile awareness; build.rs awareness; Target triples; Cross compilation awareness; cargo metadata awareness; cargo tree; cargo update; cargo vendor awareness; crates.io; cargo audit awareness | 2h |
| 10 | M09 | Runtime, Layout, Drop, Dispatch & Allocation | Zero-cost abstractions concept; No garbage collector; Stack vs heap practical model; Box<T>; Heap allocation; Drop glue awareness; Move semantics runtime meaning; Copy semantics runtime meaning; Memory layout awareness; repr(Rust) awareness; repr(C) awareness; Alignment; Padding; size_of awareness; Fat pointers awareness; Slices as fat pointers awareness; Trait object representation awareness; Vtables awareness; Monomorphization; Static dispatch; Dynamic dispatch; Inlining awareness; Enum layout/niche optimization awareness; Allocator awareness; Rc; Arc awareness | 2h |
| 11 | M10 | Threads, Send/Sync, Arc, Mutex & Channels | std::thread; spawn; JoinHandle; Thread ownership; move closures in threads; Send trait; Sync trait; Arc<T>; Mutex<T>; RwLock<T> awareness; Poisoning awareness; LockResult awareness; Deadlock; Lock ordering; Condvar awareness; Barrier awareness; mpsc channels awareness; sync_channel awareness; Message passing; Shared-state concurrency; thread::scope awareness; Race prevention via type system; Interior mutability awareness; RefCell vs Mutex distinction | 2h |
| 12 | M10 | Async/Await, Future, Pin, Tokio & Backpressure | Future trait; async functions; async blocks; await; Lazy futures awareness; Executor concept; Waker awareness; Poll awareness; Pin awareness; Unpin awareness; Tokio awareness; Tokio runtime; tokio::spawn awareness; JoinHandle awareness; select! awareness; join! awareness; Cancellation by drop awareness; Timeouts; Async mutex awareness; Blocking in async code; spawn_blocking awareness; Async channels awareness; Bounded channels; Backpressure; Task leaks awareness; Structured concurrency awareness | 2h |
| 13 | M11 | Generics, Lifetimes, Associated Types & Advanced Rust | Generic functions; Generic structs; Trait bounds; where clauses; Associated types; Generic associated types awareness; Lifetimes; Lifetime annotations; Lifetime elision; Multiple lifetimes; Lifetime bounds awareness; 'static lifetime awareness; Higher-ranked trait bounds awareness; impl Trait; dyn Trait; Trait object safety awareness; Associated constants; Const generics; PhantomData awareness; Marker traits; Blanket implementations; Coherence awareness; Orphan rule; Newtype workaround; Specialization awareness | 2h |
| 14 | M12 | I/O, Serde, Files & HTTP | std::io::Read; std::io::Write; BufRead; BufReader; BufWriter; File; Path; PathBuf; Streaming I/O; Error handling in I/O; Serde awareness; Serialize; Deserialize; serde_json awareness; Custom serialization awareness; Borrowed deserialization awareness; JSON schema compatibility awareness; reqwest awareness; hyper awareness; HTTP status handling; Timeouts; Retries awareness; TLS awareness; Streaming responses; Payload size limits; tokio::net awareness; TCP streams awareness; WebSocket awareness | 2h |
| 15 | M13 | DSA I: Vec, Strings, Hashing & Sliding Window | Google problem-solving flow; Big-O; Vec in algorithms; Slices in algorithms; String vs &str in algorithms; Bytes vs chars in algorithms; HashMap for hashing; HashSet membership; Two pointers; Sliding window; Vec as stack; VecDeque as queue; BinaryHeap awareness; Prefix sums awareness; Brute force to optimization; Borrow checker-friendly algorithm design; Edge cases; Complexity communication | 2h |
| 16 | M13 | DSA II: Trees, Heaps, Graphs, BFS/DFS & Ownership | Recursion; Call stack awareness; Tree representation; Box in recursive types; Rc/RefCell tree awareness; Binary tree traversal; BST awareness; BinaryHeap; Top-K; Graph representation; Adjacency lists; BFS; DFS; Visited HashSet; Cycle detection; Topological sort; V and E complexity; Iterative vs recursive traversal; Ownership choices in graphs; Index-based graph representation awareness | 2h |
| 17 | M14 | Debugging, Clippy, Miri, Sanitizers & Profiling | Debugging workflow; rust-gdb awareness; rust-lldb awareness; Backtraces; RUST_BACKTRACE awareness; dbg! awareness; Clippy; Compiler diagnostics; cargo expand awareness; Miri awareness; Undefined behavior in unsafe code; Sanitizers awareness; AddressSanitizer awareness; ThreadSanitizer awareness; MemorySanitizer awareness; Valgrind awareness; perf awareness; Flamegraph awareness; CPU profiling; Heap profiling awareness; Allocation tracking awareness; Tokio console awareness; Deadlock diagnosis; Async task stall diagnosis; Database wait diagnosis; Root-cause evidence | 2h |
| 18 | M15 | Code Review, Refactoring & Idiomatic Rust | Risk-first code review; Correctness; Ownership review; Borrowing review; Lifetime review; Clone review; Allocation review; Result/Option review; unwrap review; panic review; Trait-object review; Generic complexity review; Unsafe block review; Soundness review; Send/Sync review; Lock review; Async cancellation review; Blocking-in-async review; API contracts; Public API semver awareness; Refactoring; Characterization tests; Naming; Clippy warnings; Needless collect awareness; Technical debt | 2h |
| 19 | M16 | AI-Generated Rust Code Evaluation | AI code as untrusted proposal; Hallucinated crates; Hallucinated APIs; Wrong edition/toolchain assumptions; Unnecessary clones; Borrow-checker workarounds; Arc<Mutex> overuse; Rc across threads; Send/Sync mistakes; Unsafe blocks; Unsound abstractions; Pin misuse; Incorrect async cancellation; Blocking in async; Deadlocks; SQL injection; Serde mistakes; Generated Cargo.toml; Generated tests; Generated benchmarks; Performance claims; Security review; Human approval; Accept repair reject rubric | 2h |
| 20 | M17 | Testing, Property Testing, Fuzzing & Benchmarks | cargo test; Unit tests; Integration tests; Doc tests; Test modules; Assertions; should_panic awareness; Test Result return awareness; Mocks awareness; Mockall awareness; Fakes; Stubs; Async tests awareness; tokio::test awareness; Property-based testing; proptest awareness; QuickCheck awareness; Fuzzing; cargo-fuzz awareness; libFuzzer awareness; Miri in CI awareness; Coverage awareness; Criterion awareness; Microbenchmark methodology; Flaky concurrency tests | 2h |
| 21 | M18 | SQLx, Transactions, Pools & ORM Awareness | SQL from Rust; Parameterized queries; SQLx awareness; Compile-time checked queries awareness; Runtime query awareness; Connection pools; sqlx::Pool awareness; Transactions; Isolation awareness; Locking; Optimistic concurrency; Diesel awareness; SeaORM awareness; ORM trade-offs; N+1 problem; Batch queries; Projection; Repository boundary; DTO vs entity awareness; Migrations; Long transactions; Remote calls inside transactions; Retryable DB errors; Async DB access; Blocking DB driver awareness | 2h |
| 22 | M19 | Rust Backend Architecture: Axum/Actix, Tower & Service Design | Rust backend use cases; Axum awareness; Actix Web awareness; Rocket awareness; Framework trade-offs; HTTP request lifecycle; Routing; Handlers; Extractors awareness; Middleware; Tower awareness; Service trait awareness; Application services; Repositories; Dependency injection via state/traits; Arc application state awareness; Configuration; Environment variables; Secrets awareness; Runtime validation; Serde DTOs; Logging; tracing crate awareness; Request IDs; Error responses; Health checks; Readiness; Graceful shutdown; Async runtime integration | 2h |
| 23 | M19 | REST, Auth, Idempotency, OpenAPI & gRPC | REST resource design; HTTP methods; Status codes; Serde DTOs; Runtime validation; Stable error contracts; Authentication; Authorization; Object-level authorization; JWT awareness; OAuth2/OIDC awareness; Pagination; Cursor pagination awareness; Idempotency keys; Retries and side effects; CORS awareness; OpenAPI awareness; utoipa awareness; gRPC awareness; Tonic awareness; Protobuf awareness; HTTP/2 awareness; API versioning; Backward compatibility | 2h |
| 24 | M20 | Rust Performance: Allocation, Cloning, Dispatch, Cache & Profiling | Performance methodology; Latency percentiles; Throughput; Monomorphization cost; Dynamic dispatch cost awareness; Allocation rate; Vec reserve; String allocation; Clone cost; Copy cost; Iterator chains; Bounds-check elimination awareness; Inlining; Enum layout awareness; Cache locality; False sharing awareness; Arc atomic refcount cost; Mutex contention; Async task overhead awareness; Tokio scheduler awareness; Database pool waits; HTTP connection reuse awareness; Buffer reuse; SmallVec awareness; Bytes crate awareness; Criterion; perf/flamegraph awareness | 2h |
| 25 | M20 | Rust Security: Safe Rust, unsafe, FFI & Web/API Security | Threat modeling; Safe Rust memory-safety guarantees; What Safe Rust does not guarantee; unsafe keyword; Unsafe block boundaries; Unsafe functions; Raw pointers; FFI awareness; repr(C); CString/CStr awareness; Ownership across FFI; Soundness; Data races prevention; Logic races awareness; SQL injection; BOLA; SSRF; Path traversal; Command injection; Deserialization risk; Serde untagged risk awareness; File upload security; Secrets management; JWT validation; TLS verification awareness; Dependency vulnerabilities; cargo audit; Supply-chain risk; Rate limiting awareness | 2h |
| 26 | M21 | System Design with Rust: Services, Caching, Messaging & Boundaries | System-design method; Functional requirements; Non-functional requirements; Capacity estimation; When Rust is appropriate; Stateless Rust services; Load balancing; Caching; Rate limiting; SQL vs NoSQL trade-offs; Replication awareness; Partitioning awareness; Queues; Events; Messaging; Kafka client awareness; NATS awareness; RabbitMQ awareness; Idempotent consumers; Outbox pattern; Modular monolith; Microservices; Service boundaries; Consistency trade-offs; Backpressure; Observability; Async architecture; Memory efficiency | 2h |
| 27 | M21 | Distributed Systems: Timeouts, Retries, Sagas & Observability | Partial failure; Timeouts; Retries; Exponential backoff; Jitter; Retry budgets; Circuit breaker awareness; Bulkhead awareness; Backpressure; Load shedding; Idempotency; At-least-once delivery; Exactly-once myth awareness; Outbox; Saga; Compensation; Event ordering; Dead-letter queues; Schema versioning; Distributed tracing; OpenTelemetry Rust awareness; tracing spans awareness; Correlation IDs; CAP awareness; Graceful degradation; Async cancellation propagation | 2h |
| 28 | M22 | Production Engineering: Cargo Release, Containers, Kubernetes & CI/CD | cargo build --release; Cargo profiles; LTO awareness; Codegen units awareness; Panic strategy awareness; Strip symbols awareness; Debug symbols awareness; Reproducible builds awareness; Cross compilation; Target triples; musl awareness; Static linking awareness; Tests in CI; Clippy in CI; rustfmt in CI; cargo audit in CI; Miri in CI awareness; Configuration; Secrets; Docker; Multi-stage builds; Minimal images awareness; Non-root containers; Kubernetes awareness; Readiness vs liveness; Graceful shutdown; Rolling deployment; Canary; Feature flags; Backward-compatible migrations; Logs; Metrics; Traces; Alerts; Runbooks; RPO/RTO | 2h |
| 29 | M23 | Senior Rust Architect Scenarios & Capstone | C/C++ to Rust migration; Incremental Rust adoption; FFI migration boundary; Legacy service modernization; Ownership-model redesign; Sync to async migration; Tokio adoption decision; Unsafe code elimination; Memory incident; Deadlock incident; Async task leak incident; Database bottleneck; Latency incident; Compiler upgrade impact; Edition migration; Crate replacement decision; Security incident; Supply-chain incident; Technical debt; Client trade-offs; Architecture review; AI integration; Team coding standards; Capstone challenge | 2h |
| 30 | M24 | Final Rust Interview Readiness | Rapid recall; Ownership questions; Borrowing questions; Lifetime questions; Copy/Clone questions; Trait questions; Enum/Option/Result questions; Iterator questions; Error-handling questions; Cargo questions; Runtime/layout questions; Send/Sync questions; Arc/Mutex questions; Async/Future/Pin questions; Coding challenge; Debugging challenge; Code review challenge; Backend/API challenge; Database challenge; Security/unsafe challenge; System-design challenge; Architect follow-ups; Communication; Evidence First; No Bluff; Final readiness scoring | 2h |

# All 23 GoF Patterns

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

- Ownership/borrowing/lifetime reasoning automatic.
- Copy/Clone/Drop/String/&str strong.
- Traits/enums/generics/associated types strong.
- 23/23 GoF explainable in Rust-native terms.
- Layout/monomorphization/dyn dispatch understood.
- Send/Sync/Arc/Mutex and async/Future/Pin/Tokio strong.
- Clippy/Miri/debugging evidence strong.
- Unsafe/FFI soundness boundaries defendable.
- SQLx/backend/API/security/performance/distributed/production strong.
- AI-generated Rust critically evaluated.
- Evidence First / No Bluff.
