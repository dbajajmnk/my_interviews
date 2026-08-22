# GOJ Go Interview Mastery Course V1 — Topic-Level Locked TOC

**Duration:** 60 Hours  
**Schedule:** 30 Days × 2 Hours  
**Modules:** 24 Fixed GOJ Modules  
**Topic Units:** 702  
**Standard:** KIS + DRY + SOLID + Google-Level + 360° + Evidence First + No Bluff

---

# 1. Course Mission

> **Preserve the GOJ signature while making the implementation genuinely Go-native.**

The course emphasizes explicit errors, small consumer-owned interfaces, composition, slice/map/interface/nil semantics, goroutines/channels/context, runtime/GC/scheduler/escape analysis, standard-library-first engineering, profiling, security, and production simplicity.

---

# 2. Signature Topic Sequence

Every topic file follows:

> **What → Why → Plain English → Engineering Explanation → Syntax → Internal Working → Example → Real Project Usage → Best Practices → Common Mistakes → Debugging → Code Review → AI Evaluation → Interview Questions → Practice**

---

# 3. Interview Execution

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Race/Profile if Needed → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

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
| 01 | M01 | Go Ecosystem, Toolchain, Syntax, Packages & Core Execution | Go language philosophy; Go toolchain; go run; go build; go test awareness; gofmt; go vet awareness; package main; func main; Imports; Exported vs unexported identifiers; Variables; Short declaration; Constants; iota awareness; Basic operators; if; for; switch; defer awareness; Coding conventions | 2h | P0 |
| 02 | M02 | Go Types, Zero Values, Pointers, Structs, Interfaces & Nil Semantics | Static typing; Type inference; Defined types; Type aliases; Basic types; Integer types; Floating point types; Complex types awareness; bool; string; byte; rune; UTF-8 awareness; Zero values; Pointers; Pointer vs value semantics; Structs; Anonymous structs; Interfaces; Implicit interface satisfaction; nil; Typed nil interface trap; Type assertions; Type switches; Comparability; Equality; Conversions | 2h | P0 |
| 03 | M03 | Functions, Multiple Returns, Closures, Variadics, defer & Functional Patterns | Functions; Parameters; Return values; Multiple return values; Named returns awareness; Variadic functions; First-class functions; Function types; Closures; Anonymous functions; Higher-order functions; defer; LIFO defer execution; Deferred argument evaluation; panic/recover awareness; Method values; Method expressions; Receiver methods; Pointer receivers; Value receivers | 2h | P0 |
| 04 | M04 | Struct Design, Methods, Interfaces, Embedding & Composition | Struct modeling; Methods; Value receivers; Pointer receivers; Method sets; Interfaces; Small interfaces; Interface segregation; Embedding structs; Embedding interfaces; Promoted methods; Composition over inheritance; Constructor functions; Functional options pattern awareness; Encapsulation through packages; Immutable-by-convention design; Dependency injection; Behavior-oriented interfaces; Duck typing comparison awareness | 2h | P0 |
| 05 | M05 | SOLID, DRY, KIS, YAGNI & GoF Creational/Structural Patterns in Go | Single Responsibility Principle (SRP); Open/Closed Principle (OCP); Liskov Substitution Principle (LSP); Interface Segregation Principle (ISP); Dependency Inversion Principle (DIP); DRY; KIS; YAGNI; Cohesion and coupling; Dependency inversion; Composition; Factory Method; Abstract Factory; Builder; Prototype; Singleton; Adapter; Bridge; Composite; Decorator; Facade; Flyweight; Proxy; Pattern trade-off defense | 2h | P0 |
| 06 | M05 | GoF Behavioral Patterns & Go-Native Pattern Design | Chain of Responsibility; Command; Interpreter; Iterator; Mediator; Memento; Observer; State; Strategy; Template Method; Visitor; Functions as Strategy; Interfaces as behavior contracts; Channels/events vs Observer awareness; Functional options vs Builder; Pattern combinations | 2h | P0 |
| 07 | M06 | Arrays, Slices, Maps, Strings, Runes & Standard Library Collections | Arrays; Slices; Slice header awareness; len; cap; append; copy; Slice growth awareness; Slice aliasing; Sub-slicing memory retention; Maps; Map lookup comma-ok; Map iteration order; Delete; Clear awareness; Strings; Bytes vs runes; UTF-8; range over string; strings package; bytes package; sort package; slices package awareness; maps package awareness; container/heap awareness; container/list awareness; Collection complexity | 2h | P0 |
| 08 | M07 | Errors, Wrapping, errors.Is/As, panic/recover & Resource Cleanup | error interface; errors.New; fmt.Errorf; Error wrapping with %w; errors.Is; errors.As; Custom error types; Sentinel errors; Typed errors vs sentinel trade-offs; Multiple errors awareness; errors.Join awareness; Error context; Error translation; panic; recover; When panic is appropriate; defer for cleanup; Close errors; Partial failure; Retryable vs non-retryable errors; API error contracts | 2h | P0 |
| 09 | M08 | Modules, Packages, go.mod, Dependencies, Workspaces & Build Management | Go modules; go.mod; Module paths; Semantic import versioning awareness; go.sum; Dependency graph; go get; go mod tidy; go mod download; go mod graph awareness; go list awareness; replace directive awareness; exclude directive awareness; Internal packages; cmd layout awareness; Package cycles; Workspaces go.work awareness; Build tags awareness; Environment variables GOOS GOARCH; Cross compilation; CGO awareness; Vendoring awareness; Reproducible builds; Dependency supply-chain risk | 2h | P0 |
| 10 | M09 | Go Runtime: Goroutine Stacks, Scheduler, GC, Escape Analysis & Interfaces | Go runtime overview; Goroutine stack growth; Heap vs stack; Escape analysis; go build -gcflags awareness; Garbage collector; GC roots awareness; Allocation rate; GOGC awareness; Memory scavenging awareness; GMP scheduler model; Goroutines vs OS threads; Work stealing awareness; Syscalls and scheduler awareness; Interface representation awareness; Boxing into interface awareness; Method dispatch; Reflection cost; Inlining awareness; Bounds-check elimination awareness; Compiler optimization vs language guarantee | 2h | P0 |
| 11 | M10 | Goroutines, Channels, select & Structured Concurrency with context | Goroutines; go statement; Channel types; Unbuffered channels; Buffered channels; Send; Receive; Channel close; Range over channel; Who closes a channel; select; default case; Timeout with select awareness; context.Context; Cancellation; Deadlines; Timeouts; Context propagation; Context values caution; WaitGroup; errgroup awareness; Fan-out; Fan-in; Worker pools; Pipeline pattern; Goroutine leaks | 2h | P0 |
| 12 | M10 | sync Primitives, Atomics, Race Detector & Concurrent Design | Data races; Go memory model awareness; Happens-before awareness; sync.Mutex; sync.RWMutex; sync.Once; sync.Cond awareness; sync.Pool awareness; sync.Map awareness; atomic package awareness; Atomic types awareness; WaitGroup misuse; Mutex copy pitfalls; Lock ordering; Deadlock; Channel vs mutex trade-offs; Race detector; go test -race; False assumptions about maps; Concurrent map safety; Backpressure; Bounded concurrency; Semaphore pattern | 2h | P0 |
| 13 | M11 | Generics, Constraints, Type Sets, Embedding & Advanced Go | Generic functions; Generic types; Type parameters; Constraints; any; comparable; Type sets; Union elements in constraints; Approximation element ~; Generic inference; Parameterized containers; When not to use generics; Interface embedding; Struct embedding; Type switches; Reflection awareness; unsafe package awareness; Functional options; Compile-time interface assertions; Build-time code generation awareness; go generate awareness | 2h | P0 |
| 14 | M12 | I/O, JSON, Files, Buffers, HTTP Clients & Networking | io.Reader; io.Writer; io.Closer; io.Copy; io.LimitReader; bufio.Reader; bufio.Writer; bytes.Buffer; strings.Reader; os.File; os.Open; os.Create; defer Close; fs package awareness; encoding/json; JSON tags; omitempty awareness; Custom MarshalJSON awareness; Unknown field handling awareness; HTTP client; http.Request; http.Response; Timeouts; Context cancellation; Connection reuse awareness; Transport awareness; Response body close/drain awareness; Streaming responses; Payload size limits; net package awareness; WebSocket library awareness | 2h | P0 |
| 15 | M13 | DSA I: Slices, Strings, Hashing, Two Pointers, Sliding Window & Stacks | Google problem-solving flow; Big-O; Slices; Strings; Bytes vs runes in algorithms; Maps for hashing; Sets with map[T]struct{}; Two pointers; Sliding window; Stack with slice; Queue with slice pitfalls; ArrayDeque equivalent patterns awareness; Prefix sums awareness; Brute force to optimization; Edge cases; Complexity communication | 2h | P0 |
| 16 | M13 | DSA II: Recursion, Trees, Heaps, Graphs, BFS/DFS & Dependency Problems | Recursion; Goroutine stack vs recursion stack awareness; Binary trees; Tree traversal; BST awareness; container/heap; Top-K; Graph representation; Adjacency lists; BFS; DFS; Visited map; Cycle detection; Topological sort; V and E complexity; Iterative vs recursive traversal; Generic graph helpers awareness | 2h | P0 |
| 17 | M14 | Go Debugging: pprof, trace, Race Detector, Delve & Runtime Diagnostics | Debugging workflow; Delve debugger awareness; go test failure analysis; Stack traces; runtime.Stack awareness; Goroutine dumps; pprof CPU profile; pprof heap profile; Allocation profiles; Block profile; Mutex profile; go tool trace; Execution trace awareness; Race detector; Deadlock diagnosis; Goroutine leak diagnosis; GC metrics awareness; HTTP trace awareness; Database wait diagnosis; One-instance anomaly diagnosis; Root-cause evidence | 2h | P0 |
| 18 | M15 | Code Review, Refactoring & Idiomatic Go | Risk-first code review; Correctness; Error handling review; Context review; Goroutine lifecycle review; Data race review; Nil handling; Slice aliasing; Interface design; Package boundaries; Exported API design; Large interfaces; Premature abstractions; Global state; init function caution; defer in hot loops awareness; Refactoring; Characterization tests; Naming; Comments on exported identifiers; Backward compatibility; Technical debt; Go-like simplicity | 2h | P0 |
| 19 | M16 | AI-Generated Go Code Evaluation & Safe Engineering Use | AI code as untrusted proposal; Hallucinated packages; Hallucinated stdlib APIs; Wrong context handling; Goroutine leaks; Channel close bugs; Deadlocks; Race conditions; Ignored errors; Typed nil bugs; Slice aliasing bugs; HTTP body leaks; SQL injection; Unsafe reflection; unsafe package misuse; Generated tests; Generated benchmarks; Generated regex awareness; Generated Docker/Kubernetes config; Performance claims; Human approval; Accept repair reject rubric | 2h | P0 |
| 20 | M17 | Testing: testing Package, Table Tests, Fuzzing, Benchmarks & Integration | testing package; Test functions; Subtests; Table-driven tests; t.Helper; t.Cleanup; Parallel tests; Test isolation; Examples awareness; httptest; HTTP handler tests; Fakes; Stubs; Mocks trade-offs; Interface-based test doubles; Fuzz testing; go test -fuzz awareness; Benchmarks; b.N; b.ReportAllocs awareness; Race tests; Integration tests; Database tests; Testcontainers awareness; Coverage limitations; Flaky tests; Golden files awareness | 2h | P0 |
| 21 | M18 | database/sql, Transactions, Pools, pgx, sqlc/GORM Awareness & Data Access | database/sql; sql.DB is a pool; Open vs Ping awareness; Parameterized queries; Query; QueryRow; Exec; Rows close; Scan; Null types awareness; Context-aware DB calls; Transactions; Tx lifecycle; Isolation awareness; Locking; Optimistic concurrency; Connection pool settings; MaxOpenConns; MaxIdleConns; ConnMaxLifetime awareness; N+1; Batch queries; Repository boundaries; pgx awareness; sqlc awareness; GORM awareness; Migrations; Long transactions; Remote calls inside transactions | 2h | P0 |
| 22 | M19 | Go Backend Architecture: net/http, Routers, Middleware & Service Design | net/http server; http.Handler; http.HandlerFunc; ServeMux; Request lifecycle; Context on requests; Middleware pattern; chi awareness; Gin awareness; Echo awareness; Framework vs stdlib trade-offs; Controllers/handlers; Services/use cases; Repositories; Dependency injection with constructors; Configuration; Environment variables; Runtime validation; Structured logging awareness; Request IDs; Graceful shutdown; Server timeouts; Readiness; Health endpoints; Panic recovery middleware awareness | 2h | P0 |
| 23 | M19 | REST, Auth, Idempotency, Pagination, gRPC Awareness & API Contracts | REST resource design; HTTP methods; Status codes; JSON DTOs; Validation; Stable error contracts; Authentication; Authorization; Object-level authorization; JWT awareness; OAuth2/OIDC awareness; Pagination; Cursor pagination awareness; Idempotency keys; Retries and side effects; CORS awareness; OpenAPI awareness; gRPC awareness; Protobuf awareness; HTTP/2 awareness; Generated clients awareness; API versioning; Backward compatibility | 2h | P0 |
| 24 | M20 | Go Performance: Allocation, GC, Scheduler, I/O, DB & Benchmarking | Performance methodology; Latency percentiles; Throughput; CPU profiling; Heap profiling; Allocation rate; Escape analysis; Inlining awareness; Bounds-check elimination awareness; GC pressure; GOGC awareness; Goroutine scheduling overhead; Too many goroutines; Lock contention; Channel contention; Buffer reuse; sync.Pool trade-offs; String/byte conversions; Copy avoidance awareness; I/O buffering; Database pool waits; HTTP connection reuse; Caching; Benchmarking; Warmup considerations awareness | 2h | P0 |
| 25 | M20 | Go Security: Web/API, Input, Files, SSRF, Supply Chain & Memory-Safe Boundaries | Threat modeling; Authentication vs authorization; BOLA; SQL injection; Command injection; Path traversal; SSRF; Open redirect awareness; File upload security; Request body limits; JSON validation; Mass assignment awareness; Secrets management; Secure logging; TLS configuration awareness; JWT validation awareness; CORS awareness; CSRF awareness; XSS awareness for templates; html/template escaping; text/template caution; Dependency vulnerabilities; govulncheck awareness; Module supply-chain risk; Rate limiting awareness; unsafe package risk; Race conditions as security risk | 2h | P0 |
| 26 | M21 | System Design with Go: Scalability, Caching, Messaging & Service Boundaries | System-design method; Functional requirements; Non-functional requirements; Capacity estimation; Stateless Go services; Load balancing; Caching; CDN awareness; Rate limiting; SQL vs NoSQL trade-offs; Replication awareness; Partitioning awareness; Queues; Events; Messaging; Idempotent consumers; Outbox pattern; Modular monolith; Microservices; Service boundaries; Interface boundaries; Consistency trade-offs; Backpressure; Observability | 2h | P0 |
| 27 | M21 | Distributed Systems: Timeouts, Retries, Circuit Breakers, Sagas & Observability | Partial failure; Timeouts; Context deadlines; Retries; Exponential backoff; Jitter; Retry budgets; Circuit breaker; Bulkhead; Backpressure; Load shedding; Idempotency; At-least-once delivery; Exactly-once myth awareness; Outbox; Saga; Compensation; Event ordering; Dead-letter queues; Schema versioning; Distributed tracing; OpenTelemetry awareness; Correlation IDs; CAP awareness; Graceful degradation; Context cancellation across service calls | 2h | P0 |
| 28 | M22 | Production Engineering: Go Builds, Containers, Kubernetes, CI/CD & Observability | Go build pipeline; Static binaries awareness; CGO implications; Build reproducibility; Version metadata awareness; Tests in CI; go vet; Staticcheck awareness; govulncheck awareness; Configuration; Secrets; Docker; Multi-stage builds; Minimal images awareness; Non-root containers; Kubernetes awareness; Readiness vs liveness; Graceful shutdown; Rolling deployment; Canary; Feature flags; Backward-compatible migrations; CI/CD; Immutable artifacts; Logs; Metrics; Traces; SLI/SLO/SLA; Alerts; Runbooks; RPO/RTO; Backup restore | 2h | P0 |
| 29 | M23 | Senior Go Architect Scenarios & Capstone Challenge | Legacy service modernization; Java/Node to Go migration decision; Monolith modernization; Goroutine leak incident; Memory growth incident; Latency incident; Database bottleneck; Race-condition incident; Framework vs stdlib decision; gRPC adoption decision; Event-driven migration; Microservice extraction decision; Observability redesign; Security incident; Technical debt; Client trade-offs; Architecture review; AI integration; Team coding standards; Capstone challenge | 2h | P0 |
| 30 | M24 | Final Go Interview Readiness: Runtime, Concurrency, Coding, Review, API & Design | Rapid recall; Slice questions; Interface/nil questions; Pointer questions; Error questions; defer questions; Goroutine questions; Channel questions; Context questions; Race/mutex questions; Runtime/GC questions; Generic questions; Coding challenge; Debugging challenge; Code review challenge; Backend/API challenge; Database challenge; Security challenge; System-design challenge; Architect follow-ups; Communication; Evidence First; No Bluff; Final readiness scoring | 2h | P0 |

---

# 6. Go-Native Coverage

```text
Toolchain / Packages / Modules
→ Types / Pointers / Structs / Interfaces / nil
→ Functions / Multiple Returns / defer
→ Composition / Embedding / Small Interfaces
→ SOLID + 23 GoF in Go-native form
→ Arrays / Slices / Maps / Strings / Runes
→ Error Wrapping / Is / As / panic/recover
→ go.mod / go.sum / Workspaces / Build
→ Scheduler / Goroutine Stacks / GC / Escape Analysis
→ Goroutines / Channels / select / context
→ Mutex / Atomics / Race Detector
→ Generics / Constraints / Type Sets
→ io.Reader/Writer / JSON / HTTP / Files
→ DSA
→ pprof / trace / Delve / -race
→ Code Review / AI Evaluation
→ Table Tests / Fuzzing / Benchmarks
→ database/sql / Transactions / Pools
→ net/http / Middleware / REST / gRPC Awareness
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
- Slice/interface/nil semantics automatic.
- Error/context/resource ownership strong.
- Goroutine/channel/mutex/race reasoning strong.
- Runtime/GC/scheduler/escape-analysis awareness strong.
- 23/23 GoF explainable in Go-native terms.
- Backend/data/security/distributed/production depth strong.
- AI-generated Go critically evaluated.
- Evidence First / No Bluff.
