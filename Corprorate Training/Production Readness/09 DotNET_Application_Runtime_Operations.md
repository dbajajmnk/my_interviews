# iRun Corporate Training Interview Preparation
## Module 09 — .NET Application & Runtime Operations

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Build credible .NET production-operations knowledge around CLR, ASP.NET Core, hosting, managed memory, ThreadPool behavior, runtime diagnostics, and cross-stack troubleshooting.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain .NET runtime architecture at interview depth.
- Explain CLR, managed memory, GC, and ThreadPool concepts.
- Explain ASP.NET Core hosting.
- Distinguish Kestrel and IIS roles.
- Troubleshoot application startup, configuration, dependency, CPU, memory, and latency problems.
- Explain `dotnet-counters`, `dotnet-trace`, and `dotnet-dump`.
- Compare .NET diagnostic concepts with JVM equivalents.
- Handle .NET questions honestly without pretending specialist depth.
- Design practical .NET operations labs for corporate learners.

The panel should think:

> **“He understands .NET production diagnostics well enough to teach application operations responsibly and can transfer his runtime troubleshooting knowledge across platforms.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- CLR
- Managed memory
- Garbage Collection
- Generations
- ASP.NET Core
- Kestrel
- IIS
- Application startup
- Configuration
- Dependency Injection
- ThreadPool
- CPU troubleshooting
- Memory troubleshooting
- Process dumps
- Runtime counters
- `dotnet-counters`
- `dotnet-trace`
- `dotnet-dump`
- Application vs runtime issues
- Hosting and deployment
- How you would teach .NET operations

---

# 3. .NET Runtime Mental Model

Use:

```text
ASP.NET CORE APPLICATION
          |
         CLR
          |
+--------------------------+
| Managed Heap             |
|  Gen 0 / Gen 1 / Gen 2   |
|                          |
| ThreadPool               |
|                          |
| JIT / Runtime Services   |
+--------------------------+
          |
   OS / Container / IIS
```

Keep the explanation operational.

---

# 4. What Is CLR?

CLR = Common Language Runtime.

High-level responsibilities:

- Executes managed code
- Memory management
- Garbage Collection
- Exception handling
- Type safety
- JIT compilation
- Threading/runtime services

## Strong Interview Answer

> “CLR is the .NET execution runtime, similar in role to the JVM for Java. It manages execution, memory, GC, exceptions, threading, and runtime services for managed .NET applications.”

---

# 5. Managed Memory

Managed memory means CLR manages object allocation and reclamation.

Main concept:

- Objects live on managed heap.
- GC reclaims unreachable objects.

Production concerns:

- Allocation rate
- Heap growth
- GC frequency
- Large Object Heap
- retained objects
- native/process memory

---

# 6. .NET Garbage Collection

Generational model:

- Gen 0
- Gen 1
- Gen 2

High-level:

- New short-lived objects start in younger generations.
- Long-lived objects survive/promote.

Operational concerns:

- Frequent collections
- Gen 2 pressure
- pause time
- allocation rate
- memory growth

---

# 7. Strong Answer — “What Is .NET GC?”

> “.NET uses automatic garbage collection to reclaim managed objects that are no longer reachable. From an operations perspective, I monitor allocation rate, managed heap size, GC frequency and pause behavior, then correlate that with latency and CPU before deciding whether the issue is workload, retention, configuration or application code.”

---

# 8. Large Object Heap

Large objects are typically handled differently by the runtime.

Interview depth:

Understand:

- Large allocations can affect memory pressure.
- Frequent large-object allocation may contribute to fragmentation/GC cost.

Do not overfocus on exact thresholds unless asked.

---

# 9. ASP.NET Core

ASP.NET Core is the modern .NET web application framework.

Operational areas:

- Hosting
- Configuration
- Dependency Injection
- Middleware
- Logging
- Health checks
- HTTP request pipeline
- Kestrel

---

# 10. Kestrel

Kestrel is the cross-platform web server used by ASP.NET Core.

Common deployment:

```text
Client
  |
Reverse Proxy / Load Balancer / IIS
  |
Kestrel
  |
ASP.NET Core Application
```

---

# 11. IIS

IIS may act as:

- Reverse proxy
- Hosting/integration layer
- TLS endpoint
- Process management layer

Do not confuse IIS with CLR.

---

# 12. Kestrel vs IIS

## Kestrel

Application web server.

## IIS

Windows web server / reverse proxy / hosting integration.

Strong answer:

> “Kestrel serves the ASP.NET Core application, while IIS can sit in front as reverse proxy and hosting integration on Windows.”

---

# 13. ASP.NET Core Startup Failures

Common causes:

- Missing configuration
- Missing secret
- Invalid connection string
- DI failure
- Port conflict
- Certificate problem
- Database unavailable
- Environment mismatch
- Missing runtime
- deployment artifact issue

Use same universal troubleshooting framework.

---

# 14. Configuration

Sources may include:

- `appsettings.json`
- environment-specific config
- Environment Variables
- Key Vault/secrets
- Command line
- External config providers

Production principle:

> Externalize environment-specific configuration and secrets.

---

# 15. Dependency Injection Failures

Possible causes:

- Service not registered
- Wrong lifetime
- Missing dependency
- Circular dependency
- invalid configuration
- failed initialization

Strong approach:

Read root exception and failing service registration chain.

---

# 16. ThreadPool

.NET uses ThreadPool for many background and request-processing operations.

Problems can occur when:

- Long blocking work
- Sync-over-async
- Excessive concurrency
- thread starvation
- slow external calls

Symptoms:

- Latency increases
- throughput drops
- CPU may not be saturated
- queued work increases

---

# 17. ThreadPool Starvation

Possible causes:

- Blocking calls
- long synchronous I/O
- too many queued tasks
- poor async usage

Evidence:

- runtime counters
- increased thread count
- queueing
- latency

---

# 18. Strong Answer — “What Is ThreadPool Starvation?”

> “ThreadPool starvation happens when available worker threads are tied up faster than the runtime can service new work. In web applications that can happen through blocking operations or poor async usage, causing requests to queue and latency to rise even if CPU is not fully utilized.”

---

# 19. High CPU Troubleshooting

Check:

- CPU trend
- request volume
- deployment change
- hot code
- GC
- loops
- serialization
- retry storm
- excessive logging

Use:

- `dotnet-counters`
- `dotnet-trace`
- profiling tools where appropriate

---

# 20. High Memory Troubleshooting

Check:

- managed heap trend
- process memory
- GC
- large objects
- caches
- retention
- traffic/workload
- native memory
- container limit

Do not assume memory leak.

---

# 21. Memory Leak in .NET

Conceptually same principle:

> Objects remain reachable longer than intended.

Possible causes:

- Static references
- caches
- event handlers
- long-lived collections
- object retention

Evidence:

- heap growth over time
- Gen 2 growth
- memory dump
- retained object analysis

---

# 22. Process Memory vs Managed Heap

Important distinction:

Process memory includes more than managed heap.

Includes:

- managed heap
- native libraries
- stacks
- runtime overhead
- buffers

So:

> “Managed heap looks fine” does not prove process memory is fine.

---

# 23. `dotnet-counters`

Purpose:

Monitor runtime/application counters in real time.

Useful for:

- CPU
- GC
- heap size
- exception rate
- ThreadPool
- request metrics depending on app/runtime

Interview positioning:

> Fast, lightweight first-look runtime diagnostics.

---

# 24. `dotnet-trace`

Purpose:

Collect runtime tracing/events for deeper time-based investigation.

Useful for:

- CPU
- runtime events
- performance analysis
- application behavior

Comparable conceptually to time-based diagnostics such as JFR.

---

# 25. `dotnet-dump`

Purpose:

Capture/analyze process dumps.

Useful for:

- crash analysis
- memory
- threads
- runtime state

Operational caution:

Dump size and sensitive content.

---

# 26. `dotnet-counters` vs `dotnet-trace` vs `dotnet-dump`

## `dotnet-counters`

Live counters / first signal.

## `dotnet-trace`

Time-based event trace.

## `dotnet-dump`

Point-in-time process state.

Use the least intrusive tool that answers the question.

---

# 27. Strong Answer — “How Do You Diagnose a Slow ASP.NET Core App?”

> “I would first scope the affected requests and check latency, errors and recent changes. Then I would inspect application logs and traces to identify whether the time is spent in the application, database or downstream dependency.
>
> If dependencies look healthy, I would use runtime counters to check ThreadPool behavior, GC, CPU and managed memory.
>
> If needed, I would collect deeper trace or dump evidence, validate the hypothesis, mitigate and then complete RCA.”

---

# 28. Strong Answer — “Application Is Not Starting”

Check:

- startup logs
- environment
- runtime installed
- config
- secrets
- port
- certificate
- DI
- DB
- file permissions
- IIS/Kestrel config
- deployment artifact

---

# 29. IIS / Reverse Proxy Scenario

Symptoms:

- 502 / 503
- app appears running locally
- external traffic fails

Check:

- IIS site/app pool or hosting integration
- process
- Kestrel port
- proxy config
- certificate
- logs
- health

---

# 30. Environment-Specific Failure

Check:

- `ASPNETCORE_ENVIRONMENT`
- config source
- secrets
- connection string
- certificate
- DNS/network
- runtime version
- filesystem
- permissions

Same “works locally but fails in prod” principle.

---

# 31. Health Checks

ASP.NET Core supports health-check patterns.

Use for:

- service health
- dependency health
- readiness/liveness integration

Same principle:

Alive != ready.

---

# 32. Async/Await Operational Risk

Good async I/O helps scalability.

Problems:

- blocking async code with `.Result` / `.Wait()`
- sync-over-async
- deadlock patterns in some contexts
- ThreadPool starvation

Interview depth:

Understand operational consequence.

---

# 33. Exception Handling

Good production exception handling:

- log context
- return appropriate status
- avoid exposing internals
- preserve root cause
- correlation

Avoid silent catch blocks.

---

# 34. Logging

Common production logging needs:

- Request ID
- Correlation ID
- Exception
- service
- environment
- dependency
- duration

Avoid sensitive data.

---

# 35. Containerized .NET

Check:

- container memory limit
- process memory
- GC behavior
- CPU limit
- health probes
- startup
- port
- environment variables

Same cross-runtime principle as JVM.

---

# 36. Scenario 1 — ASP.NET Core 503

Check:

- proxy
- healthy backend
- Kestrel
- readiness
- dependency
- process
- resource

---

# 37. Scenario 2 — Latency High but CPU Low

Possible:

- ThreadPool starvation
- DB wait
- external API
- lock
- queueing

Use traces + runtime counters.

---

# 38. Scenario 3 — High CPU After Deployment

Check:

- new code path
- request rate
- GC
- serialization
- retry loop
- logging
- trace/profile

Rollback if justified.

---

# 39. Scenario 4 — Memory Keeps Growing

Check:

- managed heap
- Gen 2
- workload
- cache
- process memory
- dump
- retained objects

---

# 40. Scenario 5 — Works in Dev, Fails Behind IIS

Check:

- environment
- hosting config
- reverse proxy
- certificate
- permissions
- URL/port
- runtime
- auth

---

# 41. JVM to .NET Runtime Mapping

| Java | .NET |
|---|---|
| JVM | CLR |
| Java Heap | Managed Heap |
| Young/Old Gen | Gen 0/1/2 |
| Thread pool | ThreadPool |
| `jstack` | Process/thread diagnostics |
| Heap dump | Memory/process dump |
| JFR | `dotnet-trace` / profiling |
| JVM metrics | `dotnet-counters` |
| Spring Boot | ASP.NET Core |
| Tomcat | Kestrel |
| Web server/proxy | IIS / reverse proxy |

Important:

These are conceptual parallels, not exact equivalents.

---

# 42. Strong Answer — “How Is .NET Similar to Java Operationally?”

> “The technologies differ, but the production diagnostic principles are similar. Both have managed runtimes, automatic memory management, thread/concurrency behavior, runtime metrics and dump/trace tooling.
>
> I map the symptom first — CPU, memory, threads, dependency or configuration — then use the runtime-specific tool to validate the same type of hypothesis.”

---

# 43. Corporate Training Angle

The goal is not to turn learners into .NET developers.

Teach:

- How app starts
- How it is hosted
- Where configuration comes from
- How to inspect health
- How to identify runtime pressure
- Which diagnostic tool to use

---

# 44. Lab 1 — Missing Configuration

Inject:

- missing production connection string

Learners:

- inspect startup logs
- identify config source
- fix
- validate health

---

# 45. Lab 2 — ThreadPool Starvation

Inject:

- blocking call

Learners:

- observe latency
- inspect counters
- identify queue/thread behavior
- fix async/blocking pattern
- validate

---

# 46. Lab 3 — Memory Growth

Inject:

- unbounded cache/list

Learners:

- observe counters
- collect dump
- analyze retention
- fix
- compare before/after

---

# 47. Lab 4 — Reverse Proxy Failure

Inject:

- wrong Kestrel/IIS routing config

Learners:

- external request fails
- app local health works
- inspect proxy/hosting config
- fix
- validate

---

# 48. Lab 5 — High CPU

Inject:

- CPU-heavy loop

Learners:

- counters
- trace
- identify hot path
- fix
- validate

---

# 49. Whiteboard — .NET Production Flow

```text
              CLIENT
                 |
            IIS / PROXY
                 |
              KESTREL
                 |
          ASP.NET CORE APP
                 |
      +----------+----------+
      |                     |
   BUSINESS              DEPENDENCIES
     LOGIC             DB / API / QUEUE
                 |
                CLR
      +----------+----------+
      |          |          |
    CPU        MEMORY    THREADPOOL
      |          |          |
      +----------+----------+
                 |
       OS / CONTAINER / CLOUD
```

---

# 50. 30-Second Explain-on-Demand

> “For .NET operations I separate application hosting, ASP.NET Core behavior and CLR runtime diagnostics. I first check configuration, hosting, health, logs and dependencies. If evidence points deeper, I use runtime counters, traces or dumps to investigate CPU, memory or ThreadPool behavior.”

---

# 51. 5-Minute Trainer Demo

### Topic

**`dotnet-counters` vs `dotnet-trace` vs `dotnet-dump`**

Structure:

1. Symptom-first thinking.
2. Counters = live health signals.
3. Trace = time-based behavior.
4. Dump = point-in-time deep state.
5. Example scenarios.
6. Safety.
7. Key takeaway.

---

# 52. High-Probability Interview Questions

1. What is CLR?
2. CLR vs JVM?
3. What is managed memory?
4. Explain .NET GC.
5. Gen 0/1/2?
6. What is ASP.NET Core?
7. What is Kestrel?
8. Kestrel vs IIS?
9. How do you troubleshoot startup failure?
10. How is config managed?
11. What is .NET DI?
12. What is ThreadPool?
13. What is ThreadPool starvation?
14. How do you troubleshoot high CPU?
15. How do you troubleshoot memory growth?
16. What is `dotnet-counters`?
17. What is `dotnet-trace`?
18. What is `dotnet-dump`?
19. When do you use each?
20. Managed heap vs process memory?
21. Why app works locally but fails in prod?
22. How do you troubleshoot ASP.NET Core 503?
23. How would you teach .NET operations?
24. Design a .NET runtime lab.

---

# 53. Cross-Question Drill

## Q1. Is high Gen 2 memory a leak?

Not automatically. Look at trend, workload, GC behavior and retained objects.

## Q2. Can CPU be low during ThreadPool starvation?

Yes. Threads may be blocked/waiting and work can queue.

## Q3. Is Kestrel a replacement for IIS?

Kestrel is the app web server; IIS may still provide reverse proxy/hosting integration on Windows.

## Q4. Why not always take a dump?

It may be large/intrusive and unnecessary if live counters or traces can answer the question.

## Q5. Can process memory exceed managed heap?

Yes. Native memory, stacks, libraries and runtime overhead contribute.

## Q6. Is async always faster?

Not inherently. It improves scalability for I/O-bound work but poor async patterns can still create issues.

## Q7. Does 503 prove ASP.NET Core is down?

No. It may originate at proxy/load balancer or indicate no healthy backend.

## Q8. Can .NET app be alive but not ready?

Yes. Process may run while critical dependency is unavailable.

## Q9. Is increasing memory the fix for OOM?

Only possibly temporary mitigation; root cause still requires diagnosis.

## Q10. Are .NET and Java tools identical?

No. Diagnostic principles transfer; tools/runtime details differ.

---

# 54. Real Experience Mapping

Because .NET may not be your strongest current stack, prepare evidence around **transferable runtime and production concepts**:

- Enterprise backend systems
- Java runtime troubleshooting
- Node runtime behavior
- Cloud/container operations
- API issues
- memory/resource thinking
- dependency failures
- production diagnostics

Use truthful phrasing:

> “The direct tool differs, but the diagnostic pattern is one I already use across managed/runtime platforms.”

Do not invent direct .NET administration stories.

---

# 55. Red Flags

Do not:

- Claim deep .NET specialist experience if not true.
- Confuse CLR and ASP.NET Core.
- Confuse IIS and Kestrel.
- Treat high memory as leak automatically.
- Ignore ThreadPool starvation.
- Say `dotnet-dump` is first tool for every issue.
- Assume async solves everything.
- Present JVM/.NET mappings as exact equivalence.
- Overfocus on C# coding questions in an operations interview.

---

# 56. Quick Revision

## Runtime

**CLR → Managed Memory → GC → ThreadPool**

## Hosting

**Client → IIS/Proxy → Kestrel → ASP.NET Core**

## Diagnostics

**Counters → Live signal**  
**Trace → Time-based behavior**  
**Dump → Deep point-in-time state**

## Troubleshooting

**Config → Hosting → Dependency → Runtime → Infrastructure**

## Golden Rule

> **Transfer the diagnostic principle, but respect runtime-specific tooling.**

---

# 57. Module 09 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| CLR explanation | 4+ | |
| Managed memory | 4+ | |
| .NET GC | 4+ | |
| ASP.NET Core | 4+ | |
| Kestrel vs IIS | 5 | |
| Configuration | 4+ | |
| DI failure reasoning | 4+ | |
| ThreadPool | 4+ | |
| ThreadPool starvation | 4+ | |
| High CPU troubleshooting | 4+ | |
| High memory troubleshooting | 4+ | |
| Managed heap vs process memory | 4+ | |
| `dotnet-counters` | 4+ | |
| `dotnet-trace` | 4+ | |
| `dotnet-dump` | 4+ | |
| JVM/.NET comparison | 5 | |
| Scenario handling | 4+ | |
| Whiteboard explanation | 4+ | |
| Lab design | 4+ | |
| Honest gap handling | 5 | |
| Cross-question survival | 4+ | |

---

# 58. Module 09 Readiness Gate

## PASS only when you can:

- Explain CLR without notes.
- Explain managed memory and GC.
- Explain ASP.NET Core hosting.
- Distinguish Kestrel and IIS.
- Explain ThreadPool starvation.
- Troubleshoot startup/configuration failures.
- Troubleshoot high CPU and high memory.
- Explain `dotnet-counters`, `dotnet-trace`, and `dotnet-dump`.
- Compare .NET runtime concepts with JVM concepts responsibly.
- Handle at least five .NET production scenarios.
- Design at least three practical labs.
- Draw the .NET production flow.
- Survive at least 10 follow-up questions.
- Maintain honest specialist boundaries.

### Minimum Score

**P1 target average ≥ 3.5/5, with no critical dimension below 3.**

If answers rely on bluffing or collapse into generic Java comparisons, Module 09 remains **BLOCKED**.

---

# 59. Final Module Outcome

After this module, the panel should think:

> **“He understands .NET operations and runtime diagnostics at a credible working level, can map managed-runtime troubleshooting principles correctly, and is transparent about specialist depth.”**

That is the selection goal for Module 09.
