# iRun Corporate Training Interview Preparation
## Module 10 — Node.js Runtime & Application Troubleshooting

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Demonstrate practical Node.js production-operations knowledge around V8, the event loop, async behavior, memory, CPU, heap snapshots, profiling, and distributed application troubleshooting.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain Node.js runtime architecture simply.
- Explain V8 and the event loop.
- Distinguish CPU-bound vs I/O-bound behavior.
- Explain event-loop blocking.
- Diagnose slow Node.js services.
- Explain memory leaks and heap growth.
- Explain heap snapshots and CPU profiling.
- Diagnose async failures and unhandled errors.
- Explain event-loop lag.
- Distinguish application-level issues from runtime-level issues.
- Compare Node.js runtime diagnostics with JVM and .NET.
- Design practical Node.js troubleshooting labs.
- Whiteboard Node.js production flow.
- Survive likely follow-up questions.

The panel should think:

> **“He understands Node.js as a production runtime, not only as a JavaScript framework environment.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- Node.js architecture
- V8
- Event loop
- Non-blocking I/O
- Blocking operations
- Async behavior
- Callbacks / Promises / async-await
- Memory / heap
- Garbage Collection
- Heap snapshots
- CPU profiling
- Event-loop lag
- Memory leaks
- Unhandled errors
- Process crashes
- Slow API behavior
- External dependency waits
- Node.js in containers
- Production diagnostics
- Cross-runtime comparison
- Trainer lab design

---

# 3. Node.js Runtime Mental Model

Use:

```text
CLIENT REQUEST
      |
 NODE.JS APPLICATION
      |
   EVENT LOOP
      |
+----------------------+
| Timers               |
| I/O callbacks        |
| Poll / Check phases  |
| Microtasks           |
+----------------------+
      |
     V8
      |
+----------------------+
| Heap                 |
| Garbage Collection   |
| JIT / Execution      |
+----------------------+
      |
OS / libuv / Thread Pool
      |
DB / API / FILE / QUEUE
```

Keep this mental model practical.

---

# 4. What Is V8?

V8 is the JavaScript engine used by Node.js.

Responsibilities include:

- JavaScript execution
- Memory management
- Garbage Collection
- JIT compilation

Strong answer:

> “V8 is the JavaScript execution engine. In Node.js operations, I care about how V8 uses heap memory, performs GC, and interacts with the event-driven runtime when diagnosing CPU or memory issues.”

---

# 5. Event Loop

The event loop allows Node.js to handle many I/O operations without creating a dedicated thread per request.

Important:

> Node.js is not “single-threaded” in every sense.

The JavaScript execution path is primarily single-threaded, while libuv and the runtime can use worker threads / OS capabilities for certain operations.

---

# 6. Strong Answer — “What Is the Event Loop?”

> “The event loop is the mechanism Node.js uses to coordinate asynchronous work. JavaScript callbacks execute on the main event-loop thread, while many I/O operations are delegated to the OS or libuv. This is efficient for I/O-heavy workloads, but CPU-heavy or blocking work on the main thread can delay all other requests.”

---

# 7. Non-Blocking I/O

Typical Node strength:

- Network calls
- File I/O
- DB calls
- Async APIs

The application starts work and handles completion later.

This improves concurrency for I/O-heavy workloads.

---

# 8. Event-Loop Blocking

Blocking occurs when JavaScript execution occupies the event loop for too long.

Examples:

- CPU-heavy loop
- Large synchronous file operation
- expensive regex
- huge JSON processing
- synchronous crypto
- inefficient transformation

Symptoms:

- API latency spikes
- event-loop lag
- requests queue
- CPU may rise

---

# 9. Strong Answer — “How Do You Diagnose Event-Loop Blocking?”

> “I would correlate latency with CPU and event-loop lag, then use CPU profiling to identify long-running synchronous code paths. I would also check for synchronous filesystem/crypto calls, large JSON processing, loops, or expensive transformations. The key is to find what keeps the main JavaScript thread busy long enough to delay other work.”

---

# 10. CPU-Bound vs I/O-Bound

## I/O-Bound

Waiting on:

- DB
- API
- network
- file
- queue

Node.js handles this well asynchronously.

## CPU-Bound

Heavy computation on main thread can block request processing.

Solutions may include:

- optimize algorithm
- worker threads
- separate service
- batching
- offloading

---

# 11. libuv Thread Pool

Node.js uses libuv for asynchronous operations.

Some operations use a worker pool.

Examples can include:

- filesystem
- DNS functions
- crypto
- compression

Interview depth:

Understand that event loop and worker pool are distinct.

---

# 12. Async/Await

`async/await` improves readability but does not automatically make code non-blocking.

If the underlying operation is CPU-heavy synchronous work, `await` does not solve event-loop blocking.

---

# 13. Promise / Async Failure

Common issues:

- rejected Promise not handled
- missing `await`
- swallowed error
- parallel calls without limits
- race condition
- timeout handling missing

Strong production behavior:

- explicit error handling
- structured logging
- retries where safe
- cancellation/timeouts
- correlation

---

# 14. Unhandled Rejections / Exceptions

Unhandled errors can cause instability or process termination depending on runtime/version/config.

Operational strategy:

- Centralized error handling
- log context
- fail safely
- do not hide fatal conditions
- restart via supervisor/orchestrator if process exits
- still investigate root cause

---

# 15. Node.js Heap

V8 manages heap memory for JavaScript objects.

Operational concerns:

- Heap growth
- allocation rate
- retained objects
- GC frequency
- process memory
- native buffers

---

# 16. Memory Leak in Node.js

A memory leak typically means objects remain reachable longer than intended.

Common causes:

- Global collections
- Unbounded caches
- Event listeners
- Closures
- Timers
- Retained request objects
- Large buffers
- queues

Evidence:

- memory grows over time
- heap does not return to baseline
- heap snapshot shows retained objects
- GC becomes more frequent

---

# 17. High Memory Is Not Automatically a Leak

Possible reasons:

- cache
- workload
- large payloads
- buffers
- batch processing
- native memory

Same principle as JVM/.NET:

> High memory requires trend and retention evidence.

---

# 18. Heap Snapshot

Heap snapshot captures JavaScript heap state.

Useful for:

- memory leak
- retained objects
- object growth
- reference chains

Operational caution:

- can be large
- may impact process
- may contain sensitive data

---

# 19. CPU Profiling

CPU profile helps identify:

- hot functions
- synchronous work
- excessive computation
- loops
- expensive parsing

Useful for event-loop blocking and high CPU.

---

# 20. Event-Loop Lag

Event-loop lag measures delay in event-loop responsiveness.

High lag can indicate:

- blocking JS
- CPU pressure
- heavy synchronous work

Combine with:

- CPU
- latency
- request rate
- profile

---

# 21. Garbage Collection

V8 performs automatic GC.

Operationally monitor:

- heap usage
- GC activity
- pause behavior
- allocation rate

Do not overfocus on collector internals unless asked.

---

# 22. Strong Answer — “Node.js Memory Keeps Growing. What Will You Do?”

> “I would first confirm whether the growth is persistent and whether heap returns toward baseline after GC. Then I would correlate memory with workload, recent changes, caches, buffers and object allocation. If retention is suspected, I would collect heap snapshots at different times and compare dominant retained objects and reference chains. Increasing process memory may delay failure but would not fix an actual retention issue.”

---

# 23. Process Memory vs V8 Heap

Node.js process memory includes more than V8 heap:

- heap
- buffers
- native modules
- stacks
- runtime overhead

So:

> “Heap looks normal but RSS is high” is possible.

---

# 24. Buffers

Buffers may consume memory outside normal JavaScript heap accounting.

Relevant for:

- files
- network
- binary payloads

Large/unbounded buffers can increase process memory.

---

# 25. Slow Node.js API

Use Module 03 framework.

Check:

- request latency
- error rate
- recent change
- traces
- DB
- external API
- event-loop lag
- CPU
- memory
- queue/backlog
- retries

Do not assume event loop first.

---

# 26. Strong Answer — “How Do You Troubleshoot a Slow Node.js Service?”

> “I first use request metrics and traces to see whether latency is inside the service or in a downstream dependency.
>
> If dependencies are healthy, I correlate CPU, event-loop lag and runtime metrics. High event-loop lag with CPU pressure points toward blocking synchronous work, while low CPU with high latency may indicate DB, API or queue waits.
>
> Then I use CPU profiling or heap/runtime evidence based on the hypothesis.”

---

# 27. DB / API Dependency Waiting

Node.js can be slow even when event loop is healthy.

Causes:

- slow DB
- connection pool
- external API
- DNS/TLS
- retry
- queue

Use distributed tracing.

---

# 28. Connection Pool Exhaustion

Possible with Node DB clients too.

Symptoms:

- requests wait
- latency
- timeout
- pool metrics saturated

Same principle:

> Do not increase pool before finding why connections stay busy.

---

# 29. Timeout Handling

Every external call should have sensible timeout strategy.

Avoid:

- indefinite wait
- excessively high timeout

Combine with:

- retry policy
- circuit breaker
- cancellation where applicable

---

# 30. Retry Storm

Same distributed-system risk:

- dependency fails
- many requests retry
- load multiplies

Mitigate with:

- backoff
- jitter
- limits
- circuit breaker
- idempotency

---

# 31. Process Management

Production Node applications often rely on:

- Kubernetes
- systemd
- process managers
- container orchestrators

If process crashes:

- supervisor restarts
- but root cause still must be investigated

Do not treat restart policy as reliability solution.

---

# 32. Graceful Shutdown

Important for:

- stopping new requests
- finishing in-flight work
- closing DB connections
- consumer shutdown
- avoiding duplicate/incomplete processing

Useful in deployments and Kubernetes termination.

---

# 33. Containerized Node.js

Check:

- memory limit
- CPU limit
- health probes
- environment variables
- port
- graceful shutdown
- process signals
- readiness

Same platform thinking as Java/.NET.

---

# 34. Scenario 1 — High CPU

Possible:

- loop
- JSON parsing
- regex
- crypto
- serialization
- retry storm

Use CPU profile.

---

# 35. Scenario 2 — Event-Loop Lag High

Check:

- synchronous code
- CPU
- hot functions
- large payload
- blocking library

---

# 36. Scenario 3 — Memory Growth Over Hours

Check:

- cache
- listener leak
- timer
- closure
- queue
- buffer
- retained objects

Heap snapshot comparison.

---

# 37. Scenario 4 — API Slow but CPU Normal

Likely:

- DB
- external API
- connection pool
- DNS
- queue

Trace first.

---

# 38. Scenario 5 — Process Crashes Intermittently

Check:

- uncaught exception
- unhandled rejection
- OOM
- native module
- signal
- container kill

Use logs + exit code + memory metrics.

---

# 39. Scenario 6 — Memory Limit in Kubernetes

Node process may be killed by container limit.

Check:

- RSS
- heap
- buffers
- native memory
- cgroup limit

---

# 40. Scenario 7 — Too Many Event Listeners

Potential symptom:

- warnings
- memory growth

Possible cause:

- listeners added repeatedly but not removed

---

# 41. Cross-Runtime Comparison

| Java | .NET | Node.js |
|---|---|---|
| JVM | CLR | V8 |
| Threads | ThreadPool / Tasks | Event Loop + libuv |
| Heap | Managed Heap | V8 Heap |
| GC | GC | GC |
| Thread dump | Process/thread dump | Async stack / profile |
| Heap dump | Memory dump | Heap snapshot |
| JFR | `dotnet-trace` | CPU/profile tracing |
| Spring Boot | ASP.NET Core | Express/Nest/etc. |
| Tomcat | Kestrel | Node HTTP server |

These are conceptual parallels, not exact equivalents.

---

# 42. Strong Answer — “What Is Different About Node.js Troubleshooting?”

> “The biggest operational difference is that blocking the main JavaScript event loop can affect many requests even if the application uses asynchronous I/O. So in addition to standard dependency, CPU and memory checks, I pay attention to event-loop lag and synchronous hot paths. The general troubleshooting method remains the same: scope, telemetry, dependency, runtime, hypothesis, validation.”

---

# 43. Corporate Training Angle

Do not teach Node.js as syntax.

Teach:

- How event loop behaves
- What healthy async service looks like
- What blocking looks like
- How memory grows
- How to collect evidence
- How to choose profile vs heap snapshot

---

# 44. Lab 1 — Event-Loop Blocking

Inject:

- CPU-heavy synchronous loop

Learners:

- observe latency
- check event-loop lag
- capture CPU profile
- identify hot function
- fix
- validate

---

# 45. Lab 2 — Memory Leak

Inject:

- unbounded global array/cache

Learners:

- generate traffic
- observe heap growth
- collect heap snapshots
- find retained objects
- fix
- compare

---

# 46. Lab 3 — Slow Dependency

Inject:

- downstream API delay

Learners:

- see slow API
- inspect traces
- confirm event loop healthy
- identify dependency
- add timeout/circuit policy
- validate

---

# 47. Lab 4 — Unhandled Error

Inject:

- unhandled rejection

Learners:

- inspect process logs
- understand exit behavior
- implement error handling
- validate

---

# 48. Lab 5 — Graceful Shutdown

Inject:

- Kubernetes termination

Learners:

- observe dropped/in-flight requests
- add graceful shutdown
- validate clean termination

---

# 49. Whiteboard — Node.js Production Flow

```text
                CLIENT
                   |
              NODE API
                   |
              EVENT LOOP
            /      |      \
        Timers    I/O    Microtasks
                   |
          +--------+--------+
          |                 |
         V8               libuv
      Heap / GC        Worker Pool
          |                 |
          +--------+--------+
                   |
           DB / API / FILE
                   |
          CONTAINER / CLOUD
```

---

# 50. 30-Second Explain-on-Demand

> “For Node.js operations I first determine whether latency comes from a dependency or from the runtime itself. If traces show the service is internally slow, I correlate CPU and event-loop lag for blocking work, or heap/RSS trends for memory issues. Then I use CPU profiling or heap snapshots based on the hypothesis.”

---

# 51. 5-Minute Trainer Demo

### Topic

**Event Loop Blocking**

Structure:

1. Simple restaurant analogy.
2. Event loop handles many requests.
3. Async I/O.
4. CPU-heavy work blocks.
5. Symptoms.
6. Event-loop lag.
7. CPU profile.
8. Mitigation/fix.
9. Key takeaway.

---

# 52. High-Probability Interview Questions

1. What is V8?
2. What is event loop?
3. Is Node.js single-threaded?
4. What is non-blocking I/O?
5. What causes event-loop blocking?
6. CPU-bound vs I/O-bound?
7. What is libuv?
8. What is event-loop lag?
9. How do you troubleshoot high CPU?
10. How do you troubleshoot memory growth?
11. What is heap snapshot?
12. What is CPU profile?
13. How do you diagnose memory leak?
14. What are Buffers?
15. Heap vs process memory?
16. What is unhandled rejection?
17. Why async/await does not guarantee non-blocking?
18. How do you troubleshoot slow Node API?
19. What is graceful shutdown?
20. How do you run Node in containers?
21. Compare Node vs JVM runtime.
22. How would you teach Node operations?
23. Design Node runtime lab.

---

# 53. Cross-Question Drill

## Q1. Node.js is single-threaded. Correct?

JavaScript execution is primarily single-threaded, but Node uses OS/libuv worker mechanisms for I/O and some tasks.

## Q2. Does async/await move work to another thread?

Not automatically. CPU-heavy synchronous work still blocks.

## Q3. High event-loop lag means CPU high?

Often correlated, but not always. Validate with CPU/runtime evidence.

## Q4. Heap growing means memory leak?

Not necessarily. Check GC baseline, workload and retention.

## Q5. Can process RSS be high while V8 heap is normal?

Yes. Buffers/native memory/runtime overhead contribute.

## Q6. Should worker threads be used for every task?

No. Use them for appropriate CPU-intensive work, not as default complexity.

## Q7. Can Node.js service be slow because DB is slow?

Absolutely. Trace/dependency analysis comes before blaming event loop.

## Q8. Restarting process fixes memory. Root cause solved?

No. Restart is mitigation.

## Q9. Is event-loop blocking same as ThreadPool starvation?

No. Different runtime mechanisms, though both can cause latency/throughput degradation.

## Q10. Is Node.js bad for CPU-heavy workloads?

Node can handle them with suitable architecture, offloading or worker threads, but blocking CPU work on main event loop is problematic.

---

# 54. Real Experience Mapping

Prepare truthful examples related to:

- Node.js/TypeScript backend work
- APIs
- async processing
- database
- Azure Service Bus / queues
- production issues
- cloud/container deployment
- performance concern
- error handling
- code review

Use:

`Situation → Symptom → Telemetry → Diagnosis → Action → Result → Prevention`

---

# 55. Red Flags

Do not:

- Say Node.js is simply single-threaded.
- Say async/await automatically makes code non-blocking.
- Blame event loop for every slow API.
- Treat high memory as leak automatically.
- Ignore buffers/native memory.
- Use process restart as permanent fix.
- Ignore graceful shutdown.
- Compare event loop directly to Java threads as if identical.
- Overfocus on JavaScript syntax in an operations interview.

---

# 56. Quick Revision

## Runtime

**Node.js → V8 + Event Loop + libuv**

## Performance

**High CPU + Lag → Blocking/hot code**

## Memory

**Heap Growth → Snapshot → Retention**

## Slow API

**Trace dependency first; runtime second**

## Cross-Runtime

**JVM / CLR / V8 — same diagnostic principles, different runtime models**

## Golden Rule

> **In Node.js, always distinguish waiting on I/O from blocking the event loop.**

---

# 57. Module 10 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| V8 explanation | 4+ | |
| Event loop | 5 | |
| Node threading model | 4+ | |
| Non-blocking I/O | 5 | |
| Event-loop blocking | 5 | |
| CPU-bound vs I/O-bound | 5 | |
| libuv awareness | 4+ | |
| Event-loop lag | 4+ | |
| High CPU troubleshooting | 5 | |
| Memory troubleshooting | 5 | |
| Heap snapshot | 4+ | |
| CPU profiling | 4+ | |
| Async failure handling | 4+ | |
| Process vs heap memory | 4+ | |
| Graceful shutdown | 4+ | |
| Container awareness | 4+ | |
| Runtime comparison | 5 | |
| Whiteboard explanation | 4+ | |
| Lab design | 4+ | |
| Cross-question survival | 4+ | |

---

# 58. Module 10 Readiness Gate

## PASS only when you can:

- Explain V8 and event loop without notes.
- Explain why blocking code hurts Node.js.
- Distinguish CPU-bound and I/O-bound work.
- Explain event-loop lag.
- Troubleshoot high CPU.
- Troubleshoot memory growth.
- Explain heap snapshot and CPU profiling.
- Explain unhandled async failures.
- Explain heap vs RSS/process memory.
- Explain graceful shutdown.
- Compare Node.js with JVM/.NET responsibly.
- Handle at least five production scenarios.
- Design at least three practical labs.
- Draw the Node.js runtime flow.
- Survive at least 10 follow-up questions.

### Minimum Score

**P1 target average ≥ 3.5/5, with no critical dimension below 3.**

If answers drift into generic JavaScript theory without runtime/production reasoning, Module 10 remains **BLOCKED**.

---

# 59. Final Module Outcome

After this module, the panel should think:

> **“He understands Node.js runtime behavior, can distinguish dependency latency from event-loop problems, and can teach practical production diagnostics using the right evidence.”**

That is the selection goal for Module 10.
