# GOJ C# Interview Mastery Course V1 — Topic-Level Locked TOC

**Duration:** 60 Hours  
**Schedule:** 30 Days × 2 Hours  
**Modules:** 24 Fixed GOJ Modules  
**Topic Units:** 770  
**Standard:** KIS + DRY + SOLID + Google-Level + 360° + Evidence First + No Bluff

---

# 1. Course Mission

> **Preserve the GOJ signature while making the implementation genuinely C#/.NET-native.**

This course explicitly separates:

```text
C# language
→ compiler/IL
→ CLR/JIT/GC
→ BCL/.NET libraries
→ ASP.NET Core / EF Core
→ OS/network/database
→ production architecture
```

---

# 2. Signature Topic Sequence

Every topic file follows:

> **What → Why → Plain English → Engineering Explanation → Syntax → Internal Working → Example → Real Project Usage → Best Practices → Common Mistakes → Debugging → Code Review → AI Evaluation → Interview Questions → Practice**

---

# 3. Interview Execution

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Build/Test → Edge Cases → Complexity/Allocation → Failure → Trade-Off → Follow-Up → Defend**

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
| 01 | M01 | C# Ecosystem, .NET, Syntax, Projects & Core Execution | C# language overview; .NET runtime overview; .NET SDK; dotnet CLI; dotnet new; dotnet build; dotnet run; Namespaces; using directives; Top-level statements awareness; Variables; var; Constants; readonly awareness; Operators; if; switch; switch expressions; for; foreach; while; do-while; Pattern matching awareness; Coding conventions; Nullable context awareness | 2h | P0 |
| 02 | M02 | C# Type System, Value/Reference Types, Nullable, Boxing & Equality | Static typing; Type inference with var; Built-in numeric types; bool; char; string; object; dynamic awareness; Value types; Reference types; Stack vs heap myth correction; struct; class; enum; record awareness; Nullable value types; Nullable reference types; Null-forgiving operator awareness; Null-coalescing operator; Null-conditional operator; Boxing; Unboxing; Conversions; Implicit conversions; Explicit casts; is; as; Pattern matching; Equality ==; ReferenceEquals; Equals; GetHashCode contract | 2h | P0 |
| 03 | M03 | Methods, Parameters, Delegates, Lambdas, Local Functions & Closures | Methods; Expression-bodied members; Method overloading; Optional parameters; Named arguments; params; ref parameters; out parameters; in parameters; Return by ref awareness; Local functions; Delegates; Action; Func; Predicate awareness; Lambdas; Closures; Captured variables; Method groups; Events awareness; Extension methods; Generic methods; Tuples; Deconstruction; Default interface methods awareness | 2h | P0 |
| 04 | M04 | Classes, Records, Interfaces, Inheritance, Composition & Domain Modeling | Classes; Constructors; Primary constructors awareness; Properties; Auto-properties; init-only setters; Required members awareness; Fields; readonly fields; Static members; Accessibility modifiers; Interfaces; Abstract classes; Inheritance; Virtual methods; Override; Sealed classes; Sealed overrides awareness; Composition over inheritance; Records; Record classes; Record structs awareness; with expressions; Object initializers; Collection initializers; Encapsulation; Dependency injection; Domain modeling; Immutability | 2h | P0 |
| 05 | M05 | SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in C# | Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP); DRY; KIS; YAGNI; Cohesion and coupling; Dependency inversion; Composition; Factory Method; Abstract Factory; Builder; Prototype; Singleton; Adapter; Bridge; Composite; Decorator; Facade; Flyweight; Proxy; Pattern trade-off defense | 2h | P0 |
| 06 | M05 | GoF Behavioral Patterns & C#-Native Pattern Design | Chain of Responsibility; Command; Interpreter; Iterator; Mediator; Memento; Observer; State; Strategy; Template Method; Visitor; Delegates as Strategy; Events vs Observer; LINQ/pipelines vs Chain awareness; Records/discriminated-union-like modeling awareness; Pattern combinations | 2h | P0 |
| 07 | M06 | Arrays, Lists, Dictionaries, Sets, Span Awareness & LINQ | Arrays; List<T>; LinkedList<T> awareness; Dictionary<TKey,TValue>; HashSet<T>; SortedDictionary awareness; Queue<T>; Stack<T>; PriorityQueue awareness; IEnumerable<T>; IEnumerator<T>; yield return; ICollection<T>; IReadOnlyCollection<T>; IReadOnlyList<T>; Immutable collections awareness; LINQ; Select; Where; SelectMany; GroupBy; ToDictionary; Aggregate; OrderBy; Distinct; Deferred execution; Multiple enumeration; Materialization; Span<T> awareness; Memory<T> awareness; Collection complexity | 2h | P0 |
| 08 | M07 | Exceptions, Custom Errors, Exception Filters & Resource Safety | System.Exception; Exception hierarchy; throw; try; catch; finally; Exception filters; Custom exceptions; InnerException; Exception wrapping; Preserving stack trace; throw vs throw ex; AggregateException awareness; Task exception awareness; ExceptionDispatchInfo awareness; Result-pattern awareness; Exception vs result trade-offs; IDisposable; using statement; using declaration; IAsyncDisposable; await using; Resource ownership; Error translation; API error contracts; Retryable vs non-retryable errors | 2h | P0 |
| 09 | M08 | Assemblies, Projects, NuGet, SDK-Style csproj & Build Management | Assemblies; Namespaces vs assemblies; SDK-style projects; csproj; Target frameworks; Target framework monikers; Project references; Package references; NuGet; Package restore; Package lock awareness; Central package management awareness; Semantic versioning; Transitive dependencies; PrivateAssets awareness; Build configurations; Debug vs Release; MSBuild awareness; Directory.Build.props awareness; Solution files awareness; Multi-project solutions; InternalsVisibleTo awareness; Strong naming awareness; Trimming awareness; AOT awareness; Dependency supply-chain risk | 2h | P0 |
| 10 | M09 | CLR Runtime, IL, JIT, GC, Stack/Heap, Boxing & Type Metadata | CLR; Common Intermediate Language IL; Assembly metadata; JIT compilation; Tiered compilation awareness; ReadyToRun awareness; Native AOT awareness; Managed heap; Stack frames; Object layout awareness; Value type representation; Reference type representation; Boxing cost; Generational GC; Gen 0; Gen 1; Gen 2; Large Object Heap; Pinned Object Heap awareness; GC roots; Finalizers; SafeHandle awareness; IDisposable vs finalizer; Type metadata; Reflection cost; Generic specialization awareness; Language guarantee vs CLR implementation | 2h | P0 |
| 11 | M10 | Tasks, async/await, CancellationToken & Async Composition | Task; Task<T>; async methods; await; SynchronizationContext awareness; ConfigureAwait awareness; Task.Run; CPU-bound vs I/O-bound; Async all the way; async void; ValueTask awareness; Task.WhenAll; Task.WhenAny; Sequential vs concurrent awaits; CancellationToken; CancellationTokenSource; Cooperative cancellation; Timeout patterns; Linked cancellation tokens awareness; Exception propagation; Deadlock from sync-over-async awareness; IAsyncEnumerable awareness; await foreach | 2h | P0 |
| 12 | M10 | Threads, ThreadPool, Locks, Concurrent Collections & Channels | Thread awareness; ThreadPool; TaskScheduler awareness; Lock statement; Monitor awareness; Mutex awareness; SemaphoreSlim; ReaderWriterLockSlim awareness; Interlocked; Volatile awareness; Memory model awareness; Race conditions; Deadlocks; Lock ordering; ConcurrentDictionary; ConcurrentQueue; ConcurrentBag awareness; BlockingCollection awareness; System.Threading.Channels awareness; Producer-consumer; Backpressure; Bounded channels; Parallel.ForEachAsync awareness; ThreadPool starvation; Async lock patterns awareness | 2h | P0 |
| 13 | M11 | Generics, Variance, Pattern Matching, Ref Structs & Advanced C# | Generic classes; Generic methods; Constraints; class constraint; struct constraint; notnull constraint awareness; new() constraint; unmanaged constraint awareness; Generic variance; out covariance; in contravariance; Generic type inference; Pattern matching; Property patterns; Relational patterns awareness; List patterns awareness; switch expressions; nameof; Caller info attributes awareness; Attributes; Reflection awareness; Span<T>; ReadOnlySpan<T>; ref struct; stackalloc awareness; Memory<T>; Readonly structs; Record structs; Required members; Source generators awareness | 2h | P0 |
| 14 | M12 | Streams, Files, JSON, HTTP Clients & Networking | Stream; FileStream; MemoryStream; StreamReader; StreamWriter; BinaryReader awareness; BinaryWriter awareness; using/await using; File APIs; Path APIs; Buffered I/O awareness; System.Text.Json; JsonSerializer; JsonSerializerOptions; Custom converters awareness; JSON source generation awareness; Unknown property handling awareness; HttpClient; HttpClientFactory awareness; SocketsHttpHandler awareness; Connection pooling; DNS refresh awareness; Timeouts; Cancellation; Streaming responses; ResponseHeadersRead awareness; Payload limits; Sockets awareness; WebSockets awareness; gRPC awareness | 2h | P0 |
| 15 | M13 | DSA I: Arrays, Strings, Hashing, Two Pointers, Sliding Window & Stacks | Google problem-solving flow; Big-O; Arrays; Strings; StringBuilder awareness; Dictionary for hashing; HashSet membership; Two pointers; Sliding window; Stack<T>; Queue<T>; PriorityQueue awareness; Prefix sums awareness; Brute force to optimization; Edge cases; Complexity communication; Span-aware optimization awareness | 2h | P0 |
| 16 | M13 | DSA II: Recursion, Trees, Heaps, Graphs, BFS/DFS & Dependency Problems | Recursion; Stack depth; Binary trees; Tree traversal; BST awareness; PriorityQueue; Top-K; Graph representation; Adjacency lists; BFS; DFS; Visited set; Cycle detection; Topological sort; V and E complexity; Iterative vs recursive traversal; Generic graph helpers | 2h | P0 |
| 17 | M14 | C#/.NET Debugging: dotnet-counters, dotnet-trace, Dumps & Profiling | Debugging workflow; Visual Studio debugger awareness; Breakpoints; Conditional breakpoints; Exception settings awareness; Stack traces; Async stack traces; dotnet-counters; dotnet-trace; dotnet-dump; GC dump awareness; CPU profiling; Allocation profiling; Memory leak diagnosis; ThreadPool starvation diagnosis; Deadlock diagnosis; Lock contention; EventPipe awareness; ETW awareness; Logging/tracing correlation; Database wait diagnosis; HTTP dependency diagnosis; One-instance anomaly diagnosis; Root-cause evidence | 2h | P0 |
| 18 | M15 | Code Review, Refactoring & Idiomatic C#/.NET | Risk-first code review; Correctness; Nullability review; Async correctness; Cancellation review; Thread safety; IDisposable ownership; LINQ multiple enumeration; Allocation review; API contracts; Large classes; Boolean flags; Inheritance abuse; Service locator anti-pattern awareness; Static mutable state; Overuse of reflection; Premature abstraction; Refactoring; Characterization tests; Naming; Public API compatibility; Technical debt prioritization; Analyzer warnings awareness; Style vs correctness | 2h | P0 |
| 19 | M16 | AI-Generated C# Code Evaluation & Safe Engineering Use | AI code as untrusted proposal; Hallucinated NuGet packages; Hallucinated .NET APIs; Wrong target framework assumptions; Async void misuse; Sync-over-async; Missing cancellation; HttpClient misuse; IDisposable leaks; Unsafe null-forgiving; Incorrect EF Core usage; N+1; SQL injection; Reflection misuse; Unsafe code awareness; Generated tests; Generated benchmarks; Generated configuration; Performance claims; Security review; Human approval; Accept repair reject rubric | 2h | P0 |
| 20 | M17 | Testing: xUnit/NUnit/MSTest Awareness, Mocks, Integration & Benchmarks | Test strategy; xUnit awareness; NUnit awareness; MSTest awareness; Assertions; Theory/data-driven tests; Fixtures; Mocks; Stubs; Fakes; Moq awareness; NSubstitute awareness; Mocking pitfalls; Async tests; Cancellation tests; Integration tests; WebApplicationFactory awareness; HTTP API tests; Database tests; Testcontainers awareness; Contract tests; Snapshot testing awareness; Coverage limitations; Mutation testing awareness; BenchmarkDotNet awareness; Flaky tests | 2h | P0 |
| 21 | M18 | ADO.NET, EF Core, Transactions, Tracking, LINQ-to-SQL & Data Access | ADO.NET awareness; DbConnection; DbCommand; Parameterized queries; Connection pooling; Transactions; Isolation awareness; Locking; Optimistic concurrency; EF Core; DbContext; DbSet; Change tracking; No-tracking queries; Entity states; LINQ translation; Client vs server evaluation awareness; Lazy loading awareness; Eager loading; Explicit loading; N+1; Include; Projection; Split queries awareness; Compiled queries awareness; Migrations; Concurrency tokens; Repository pattern trade-offs; Unit of Work awareness; Long transactions; Remote calls inside transactions | 2h | P0 |
| 22 | M19 | ASP.NET Core Architecture: DI, Middleware, Controllers & Minimal APIs | ASP.NET Core request pipeline; Kestrel awareness; Middleware; Endpoint routing; Controllers; Minimal APIs; Dependency injection container; Service lifetimes Singleton Scoped Transient; Scoped service misuse; Options pattern; Configuration; Environment variables; Secrets awareness; Model binding; Validation; Data annotations awareness; ProblemDetails awareness; Logging; Request IDs; Exception handling middleware; Filters awareness; BackgroundService awareness; Hosted services; Health checks; Readiness; Graceful shutdown | 2h | P0 |
| 23 | M19 | REST, Auth, Idempotency, OpenAPI, gRPC & Full-Stack Contracts | REST resource design; HTTP methods; Status codes; DTOs; Validation; ProblemDetails; OpenAPI; Swagger awareness; Authentication; Authorization; Policy-based authorization; Claims; Object-level authorization; JWT bearer awareness; OAuth2/OIDC awareness; Identity provider integration awareness; Pagination; Cursor pagination awareness; Idempotency keys; Retries and side effects; CORS; Cookies vs bearer tokens; CSRF awareness; gRPC awareness; SignalR awareness; API versioning; Backward compatibility | 2h | P0 |
| 24 | M20 | C#/.NET Performance: GC, Allocations, Async, LINQ, Pools & Profiling | Performance methodology; Latency percentiles; Throughput; Allocation rate; GC pressure; LOH pressure; Boxing; String allocations; StringBuilder; Span<T>; Memory<T>; ArrayPool<T> awareness; ObjectPool awareness; ValueTask trade-offs; Async state-machine overhead awareness; ThreadPool starvation; Lock contention; LINQ allocation awareness; Multiple enumeration; EF Core query cost; Database pool waits; HttpClient connection reuse; Caching; IMemoryCache awareness; Distributed cache awareness; BenchmarkDotNet; Profiling before optimization | 2h | P0 |
| 25 | M20 | C#/.NET Security: ASP.NET Core, AuthZ, Serialization, SSRF & Supply Chain | Threat modeling; Authentication vs authorization; BOLA; SQL injection; EF parameterization awareness; XSS awareness; Razor encoding awareness; CSRF; CORS; SSRF; Open redirect awareness; Mass assignment/overposting; File upload security; Path traversal; Command injection; Secrets management; ASP.NET Core Data Protection awareness; Secure logging; JWT validation; Cookie security; TLS awareness; System.Text.Json security awareness; Unsafe deserialization awareness; Dependency vulnerabilities; NuGet supply-chain risk; Rate limiting awareness; Unsafe code risk | 2h | P0 |
| 26 | M21 | System Design with .NET: Scalability, Caching, Messaging & Service Boundaries | System-design method; Functional requirements; Non-functional requirements; Capacity estimation; Stateless ASP.NET Core services; Load balancing; Caching; IMemoryCache; Distributed cache; CDN awareness; Rate limiting; SQL vs NoSQL trade-offs; Replication awareness; Partitioning awareness; Queues; Events; Messaging; Azure Service Bus awareness; Kafka awareness; Idempotent consumers; Outbox pattern; Modular monolith; Microservices; Service boundaries; Consistency trade-offs; Backpressure; Observability; Background workers | 2h | P0 |
| 27 | M21 | Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability | Partial failure; Timeouts; CancellationToken across service calls; Retries; Exponential backoff; Jitter; Retry budgets; Polly awareness; Circuit breaker; Bulkhead; Rate limiting; Backpressure; Load shedding; Idempotency; At-least-once delivery; Exactly-once myth awareness; Outbox; Saga; Compensation; Event ordering; Dead-letter queues; Schema versioning; Distributed tracing; OpenTelemetry awareness; Activity awareness; Correlation IDs; CAP awareness; Graceful degradation | 2h | P0 |
| 28 | M22 | Production Engineering: .NET Builds, Containers, Kubernetes, CI/CD & Observability | dotnet build pipeline; dotnet publish; Self-contained deployment awareness; Framework-dependent deployment awareness; Single-file publish awareness; Trimming awareness; Native AOT awareness; Tests in CI; Analyzers awareness; Configuration; Secrets; Docker; Multi-stage builds; Container resource limits; .NET container awareness; Kubernetes awareness; Readiness vs liveness; Graceful shutdown; Rolling deployment; Canary; Feature flags; Backward-compatible migrations; CI/CD; Immutable artifacts; Logs; Metrics; Traces; SLI/SLO/SLA; Alerts; Runbooks; RPO/RTO; Backup restore | 2h | P0 |
| 29 | M23 | Senior C#/.NET Architect Scenarios & Capstone Challenge | Legacy .NET Framework modernization; .NET Framework to modern .NET migration; Monolith modernization; Synchronous to async migration; EF6 to EF Core awareness; WCF migration awareness; Windows service to container awareness; ThreadPool starvation incident; Memory leak incident; LOH pressure incident; Database bottleneck; Security incident; Framework migration decision; Microservice extraction decision; Messaging adoption decision; Cloud migration awareness; Technical debt; Client trade-offs; Architecture review; AI integration; Capstone challenge | 2h | P0 |
| 30 | M24 | Final C#/.NET Interview Readiness: Runtime, Async, Coding, Review, API & Design | Rapid recall; Value/reference questions; Nullable questions; Delegate/lambda questions; Record questions; Generic questions; LINQ questions; Exception questions; CLR/GC questions; async/await questions; ThreadPool questions; Locking questions; Coding challenge; Debugging challenge; Code review challenge; ASP.NET Core challenge; EF Core challenge; Security challenge; System-design challenge; Architect follow-ups; Communication; Evidence First; No Bluff; Final readiness scoring | 2h | P0 |

---

# 6. C#/.NET-Native Coverage

```text
C# / .NET SDK / CLI
→ Value vs Reference / Nullable / Boxing
→ Methods / Delegates / Lambdas / Extensions
→ Classes / Records / Interfaces / Composition
→ SOLID + 23 GoF
→ Collections / LINQ / Span Awareness
→ Exceptions / IDisposable / IAsyncDisposable
→ Assemblies / NuGet / MSBuild
→ CLR / IL / JIT / GC / LOH
→ Task / async-await / CancellationToken
→ ThreadPool / locks / Interlocked / Channels
→ Generics / Variance / Pattern Matching / Span
→ Streams / JSON / HttpClient
→ DSA
→ dotnet-counters / trace / dump / profiling
→ Code Review
→ AI Code Evaluation
→ Testing / Integration / Benchmarking
→ ADO.NET / EF Core
→ ASP.NET Core / DI / Middleware
→ REST / Auth / OpenAPI / gRPC
→ Performance / Security
→ Distributed Systems
→ Docker / Kubernetes / CI-CD
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
- C# vs CLR/framework boundary clear.
- Nullable/value/reference/boxing/equality strong.
- async/await/CancellationToken/ThreadPool reasoning strong.
- 23/23 GoF explainable.
- LINQ/EF SQL behavior defendable.
- ASP.NET Core DI/lifetimes/API/security strong.
- Diagnostics/performance/production strong.
- AI-generated C# critically evaluated.
- Evidence First / No Bluff.
