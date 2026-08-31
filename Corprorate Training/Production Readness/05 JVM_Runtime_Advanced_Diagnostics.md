# 1. Module Objective

By the end of this module, you should be able to:

- Explain JVM runtime behavior in production-friendly language.
- Distinguish heap, stack, metaspace, native memory, and thread-related problems.
- Explain garbage collection at interview depth.
- Diagnose high CPU, high memory, OOM, deadlock, thread starvation, and GC pressure.
- Explain when to use thread dumps, heap dumps, JFR, `jstack`, `jcmd`, and `jmap`.
- Separate symptom, evidence, immediate mitigation, and root cause.
- Compare JVM runtime issues with application-level Spring Boot issues.
- Design practical JVM troubleshooting labs.
- Whiteboard common JVM incidents.
- Survive technical follow-up questions without becoming overly theoretical.

The panel should think:

> **“He understands how to diagnose JVM behavior in production and can teach engineers how to reason from evidence.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- JVM architecture
- Heap vs stack
- Young vs old generation
- Garbage Collection
- GC pauses
- Memory leaks
- OutOfMemoryError
- High CPU
- Thread states
- Deadlocks
- Thread starvation
- Thread dumps
- Heap dumps
- JFR
- VisualVM
- `jps`
- `jstack`
- `jcmd`
- `jmap`
- Runtime evidence collection
- Safe production diagnostics
- How to teach runtime topics practically

---

# 3. JVM Runtime Mental Model

Use this simple model:

```text
JAVA APPLICATION
      |
      JVM
      |
+---------------------------+
| Heap                      |
|  - Young Generation       |
|  - Old Generation         |
|                           |
| Metaspace                 |
|                           |
| Thread Stacks             |
|                           |
| Code Cache / Native Areas |
+---------------------------+
      |
Operating System / Container
```

For interview purposes, do not drown the answer in JVM implementation details unless asked.

---

# 4. Heap vs Stack

## Heap

Stores objects created by the application.

Characteristics:

- Shared across threads
- Managed by Garbage Collector
- Main area for object allocation
- Memory leaks often manifest here

## Stack

Each thread has its own stack.

Stores:

- Method call frames
- Local variables
- References
- Execution state

Common problems:

- `StackOverflowError`
- Too many threads can consume significant native memory

## Simple Interview Answer

> “The heap stores application objects and is managed by GC, while each thread has its own stack for method execution and local state. Heap problems usually involve object retention or allocation pressure; stack problems are more associated with deep recursion or very high thread counts.”

---

# 5. Young vs Old Generation

High-level model:

## Young Generation

Most new objects start here.

Many objects die quickly.

## Old Generation

Long-lived objects are promoted here.

Problems can occur when:

- Long-lived objects accumulate
- Heap cannot reclaim enough memory
- Promotion pressure increases
- Old-generation collections become expensive

Do not overfocus on GC implementation names unless asked.

---

# 6. Garbage Collection — Simple Model

GC tries to reclaim memory from objects that are no longer reachable.

Important interview concepts:

- Allocation rate
- Young collections
- Promotion
- Old-generation pressure
- Pause time
- Throughput
- Heap occupancy

A good answer connects GC to production symptoms.

---

# 7. Strong Answer — “What Is Garbage Collection?”

> “Garbage Collection is the JVM’s automatic memory-management process. It identifies objects that are no longer reachable and reclaims their memory.
>
> In production, I care less about memorizing collector internals and more about whether allocation rate, heap occupancy and GC pauses are affecting latency or throughput. If GC activity increases significantly, I would correlate GC behavior with heap usage, response time, CPU and allocation patterns before deciding whether the issue is application retention, workload pressure, configuration or collector tuning.”

---

# 8. GC Pressure

Possible symptoms:

- Frequent collections
- Increased CPU
- High pause time
- Increased latency
- Heap repeatedly near capacity
- Throughput degradation

Possible causes:

- Excessive object allocation
- Large temporary objects
- Heap undersized
- Memory leak
- Cache growth
- Workload spike
- Inefficient code

Important:

> **GC pressure is a symptom pattern, not automatically a tuning problem.**

---

# 9. Memory Leak

A JVM memory leak usually means:

> Objects remain reachable even though the application no longer needs them.

Possible causes:

- Unbounded cache
- Static collections
- Listener references
- Session retention
- ThreadLocal misuse
- Resource/object retention
- Large queues
- Library issue

## Evidence

- Heap usage trends upward over time
- Old generation remains high after GC
- Heap dump shows dominant retained objects
- GC becomes more frequent
- Eventually OOM may occur

---

# 10. High Memory Is Not Automatically a Leak

Possible high-memory reasons:

- Legitimate large workload
- Large cache
- Heap sized to use available memory
- High allocation rate
- Large batch processing
- Native memory
- Too many threads

A leak requires evidence of **unwanted retention**, not simply a high number.

---

# 11. OutOfMemoryError

Common OOM categories include:

- Java heap space
- GC overhead / allocation failure conditions
- Metaspace
- Unable to create new native thread
- Direct buffer/native memory related conditions

Do not treat all OOM errors as the same.

---

# 12. Strong Answer — “Application Has OOM. What Will You Do?”

Use:

`Exact OOM Type → Preserve Evidence → Heap/Native/Thread Context → Recent Change → Memory Trend → Dump/Profile → Dominators/Retained Objects → Root Cause`

## Suggested Answer

> “I would first identify the exact OutOfMemoryError because the diagnostic path depends on whether it is Java heap, metaspace, native thread creation or another memory area.
>
> If possible, I would preserve evidence such as heap dump, GC logs, runtime metrics and process/container memory before restart.
>
> For heap OOM, I would analyze memory growth and retained objects rather than immediately increasing `-Xmx`. I would correlate that with recent changes, workload, caches and allocation behavior.
>
> Increasing heap can be a temporary mitigation, but it is not a permanent fix if the application is retaining objects incorrectly.”

---

# 13. Heap Dump

A heap dump captures a snapshot of objects in JVM heap.

Useful for:

- Memory leak investigation
- Dominator analysis
- Retained-size analysis
- Large object collections
- Cache growth
- Object-reference chains

Potential concern:

Heap dumps can be large and may contain sensitive application data.

Operational principle:

> Collect carefully and store securely.

---

# 14. Thread Dump

A thread dump shows thread states and stack traces at a point in time.

Useful for:

- Deadlocks
- Thread starvation
- Blocking
- Lock contention
- High CPU correlation
- Slow application
- Request pileups

A thread dump does **not** show heap object retention like a heap dump.

---

# 15. Thread Dump vs Heap Dump

| Thread Dump | Heap Dump |
|---|---|
| Thread execution state | Object/memory state |
| Stack traces | Object graph |
| Deadlocks | Memory leaks |
| Blocking/locks | Retained objects |
| Thread starvation | Heap usage |
| Usually smaller | Can be very large |

## Interview Answer

> “Thread dumps answer what threads are doing; heap dumps answer what objects are occupying memory.”

---

# 16. Thread States — Interview Level

Common states:

- NEW
- RUNNABLE
- BLOCKED
- WAITING
- TIMED_WAITING
- TERMINATED

Do not simply memorize names.

Understand what patterns mean.

Examples:

- Many `BLOCKED` threads → lock contention
- Many waiting on DB pool → connection exhaustion
- One RUNNABLE thread repeatedly consuming CPU → possible hotspot

---

# 17. Deadlock

Deadlock occurs when threads wait indefinitely for locks held by each other.

Simplified:

```text
Thread A holds Lock 1 → waits for Lock 2
Thread B holds Lock 2 → waits for Lock 1
```

Evidence:

- Thread dump
- Lock ownership/wait chain
- JVM may explicitly report Java-level deadlock

---

# 18. Strong Answer — “How Do You Diagnose Deadlock?”

> “I would collect thread dumps, ideally more than one if the situation permits, and inspect threads waiting on monitors or locks. I would identify whether there is a circular wait where each thread holds a resource needed by another. Then I would trace those stacks back to application code and lock ordering. Restart can restore service temporarily, but the permanent fix usually requires correcting synchronization or lock ordering.”

---

# 19. Thread Starvation

Thread starvation occurs when work cannot get required execution resources.

Possible causes:

- Thread pool exhausted
- Long-running/blocking work
- DB connections unavailable
- External calls hanging
- Too-small pool
- Lock contention

Symptoms:

- Requests queue
- Latency rises
- CPU may be normal
- Many threads waiting

---

# 20. High CPU

High CPU can be caused by:

- Tight/infinite loop
- Heavy computation
- Excessive serialization
- Large regex
- Busy retry loop
- GC
- High traffic
- Lock contention/spinning
- Hot code path

Do not assume GC without evidence.

---

# 21. Strong Answer — “Java Process Is at 100% CPU. What Will You Do?”

> “I would first confirm whether CPU is sustained and whether it correlates with traffic or a recent change.
>
> Then I would identify the JVM process and, where possible, correlate high-CPU OS threads with Java thread dumps or use JFR to identify hot methods.
>
> I would also check GC activity because heavy GC can consume CPU, but I would not assume that is the cause.
>
> The goal is to find which code path or runtime activity is consuming CPU and validate whether it is workload-driven, a loop, retry storm, serialization, GC or another hotspot.”

---

# 22. Multiple Thread Dumps

One thread dump is a snapshot.

For intermittent or persistent issues:

- Collect several dumps a few seconds apart.
- Compare recurring stacks.
- Look for threads stuck in same location.
- Identify stable patterns.

This is often stronger evidence than a single snapshot.

---

# 23. `jps`

Purpose:

- List Java processes.

Usefulness:

- Identify JVM PID.

Do not overstate it as a diagnostic tool.

---

# 24. `jstack`

Purpose:

- Generate thread dump for a JVM process.

Use for:

- Deadlock
- Blocking
- Thread state
- Stack traces

Example conceptually:

```bash
jstack <pid>
```

---

# 25. `jcmd`

A versatile JVM diagnostic command.

Can be used for:

- Process information
- Thread dumps
- Heap information
- GC-related commands
- JFR control
- Diagnostic commands

Interview positioning:

> `jcmd` is often preferred as a general JVM diagnostic interface in modern Java environments.

---

# 26. `jmap`

Historically used for:

- Heap information
- Heap dumps
- Object histogram

Operational caution:

Some operations can be intrusive depending on JVM/version/workload.

Know the purpose more than syntax.

---

# 27. Java Flight Recorder (JFR)

JFR records JVM and application events with relatively low overhead when appropriately configured.

Useful for:

- CPU hotspots
- Allocation
- GC
- Threading
- Locks
- I/O
- Latency
- Runtime behavior

Strong interview value:

JFR gives a time-based runtime view instead of only a static snapshot.

---

# 28. JFR vs Thread Dump vs Heap Dump

## Thread Dump

Point-in-time thread state.

## Heap Dump

Point-in-time heap/object state.

## JFR

Time-based event recording.

Use the tool that matches the hypothesis.

---

# 29. VisualVM

Useful for development/test/controlled environments:

- Monitor CPU
- Memory
- Threads
- Heap
- Profiling

In sensitive production environments, follow organizational policy and avoid intrusive tooling without approval.

---

# 30. Production Safety

Runtime diagnostics can affect production.

Consider:

- Dump size
- Disk space
- Pause impact
- Permissions
- Sensitive data
- CPU overhead
- Storage location
- Incident urgency

Senior answer:

> “I choose the least intrusive diagnostic method that can validate the hypothesis.”

---

# 31. Container-Aware JVM Troubleshooting

In Kubernetes/container environments check both:

- JVM heap
- Process RSS
- Container memory limit

Important:

A pod can be `OOMKilled` by the container runtime even if Java does not throw heap OOM first.

Possible memory consumers:

- Heap
- Metaspace
- Direct buffers
- Thread stacks
- Native memory
- JVM overhead

---

# 32. OOMKilled vs Java Heap OOM

## Java Heap OOM

JVM throws `OutOfMemoryError`.

## Kubernetes OOMKilled

Container exceeds memory cgroup limit and is terminated.

These can be related but are not identical.

---

# 33. JVM Heap Size

Common options:

- `-Xms`
- `-Xmx`

Interview concept:

- `Xms` initial heap
- `Xmx` maximum heap

Do not say:

> “For memory issue, increase Xmx.”

Instead ask why memory is consumed.

---

# 34. Metaspace

Stores class metadata.

Possible growth causes:

- Dynamic class generation
- Classloader leaks
- Large number of classes

Interview depth:

Understand it is separate from regular Java heap.

---

# 35. Native Memory

JVM process memory includes more than heap.

Examples:

- Thread stacks
- Direct buffers
- Code cache
- Metaspace
- JNI/native libraries
- JVM internal structures

This explains:

> “Heap looks okay but process memory is high.”

---

# 36. Strong Answer — “Heap Is Only 60%, but Container Is OOMKilled. Why?”

> “Because JVM heap is only one component of process memory. I would inspect total RSS and non-heap/native usage such as metaspace, direct buffers, thread stacks and JVM overhead. In containers I also compare the JVM configuration against the cgroup memory limit because total process memory, not just heap, determines whether the container is killed.”

---

# 37. Stop-the-World Concept

Some JVM operations require application threads to pause.

For interview:

> A pause is not automatically a problem; the issue is whether pause frequency/duration affects service objectives.

Correlate:

- GC pause
- latency
- request timeout
- throughput

---

# 38. Memory Leak Investigation Flow

```text
Memory Trend
     |
GC Behavior
     |
Does usage return after GC?
     |
Heap Dump / Histogram
     |
Largest Retained Objects
     |
Reference Chain
     |
Application Owner / Code Path
     |
Fix + Validate
```

---

# 39. High CPU Investigation Flow

```text
CPU Trend
   |
Traffic / Change
   |
JVM PID
   |
Hot Threads / JFR
   |
Thread Stack / Hot Method
   |
GC Check
   |
Code Path / Retry / Loop / Workload
   |
Validate
```

---

# 40. Deadlock Investigation Flow

```text
Latency / Hung Requests
        |
Thread Dump
        |
BLOCKED / WAITING Threads
        |
Lock Ownership
        |
Circular Wait?
        |
Code / Lock Ordering
        |
Mitigate + Fix
```

---

# 41. Scenario 1 — Increasing Heap Usage

Symptoms:

- Heap grows over hours
- GC frequency rises
- latency degrades

Approach:

1. Check workload change.
2. Observe post-GC baseline.
3. Analyze heap trend.
4. Capture heap dump.
5. Identify dominant retained objects.
6. Find reference chain.
7. Map to application component.
8. Fix.
9. Run soak test.

---

# 42. Scenario 2 — Periodic Long Pauses

Check:

- GC pause metrics
- Heap occupancy
- Allocation rate
- Old generation
- Application latency
- workload pattern

Possible causes:

- GC pressure
- Large allocations
- undersized heap
- retention

Do not jump straight to collector tuning.

---

# 43. Scenario 3 — Requests Hang but CPU Is Low

Possible causes:

- Lock contention
- DB pool exhaustion
- External API waiting
- Thread pool saturation
- Deadlock

Collect thread dumps and dependency metrics.

---

# 44. Scenario 4 — High CPU After Deployment

Check:

- Diff/recent code
- request rate
- retries
- hot methods
- GC
- serialization
- loop
- logging volume

Rollback may be a valid mitigation if impact is high and deployment correlation is strong.

---

# 45. Scenario 5 — Too Many Threads

Possible causes:

- Unbounded thread creation
- Thread leak
- blocked external calls
- oversized pools
- task backlog

Consequences:

- native memory pressure
- context switching
- possible inability to create threads

---

# 46. Scenario 6 — Unable to Create New Native Thread

Check:

- Thread count
- OS/container limits
- native memory
- thread leaks
- pool configuration

This is not the same as Java heap exhaustion.

---

# 47. Corporate Training Angle

JVM training should not be command memorization.

Teach:

`Symptom → Runtime Signal → Right Diagnostic Artifact → Interpretation → Root Cause → Fix`

Participants should understand why they collect a dump.

---

# 48. Lab 1 — Thread Dump / Deadlock

## Inject Failure

Two threads acquire locks in opposite order.

## Symptoms

Requests hang.

## Learner Tasks

- Capture thread dump.
- Find blocked threads.
- Identify lock ownership.
- Explain circular wait.
- Suggest code fix.
- Validate after fix.

---

# 49. Lab 2 — Memory Leak

## Inject Failure

Unbounded in-memory collection/cache.

## Symptoms

Heap continuously grows.

## Learner Tasks

- Observe heap trend.
- Trigger workload.
- Capture heap dump.
- Identify dominant object.
- Trace retention.
- Fix retention.
- Compare before/after.

---

# 50. Lab 3 — High CPU

## Inject Failure

CPU-intensive loop.

## Learner Tasks

- Observe CPU.
- Identify JVM PID.
- Use JFR/thread diagnostics.
- Locate hot code.
- Fix.
- Validate CPU recovery.

---

# 51. Lab 4 — Connection Pool Thread Waiting

Purpose:

Show that runtime symptom can originate from application dependency.

Evidence:

- Many threads waiting
- DB pool saturated
- CPU normal

Learning:

> Not every thread problem is a JVM problem.

---

# 52. Lab 5 — Container Memory Limit

Set JVM/container memory relationship poorly.

Observe:

- Heap
- RSS
- container limit
- OOMKilled

Learning:

> JVM memory must be understood inside the container boundary.

---

# 53. Whiteboard — JVM Production Diagnostics

```text
                 JAVA APPLICATION
                        |
                       JVM
                        |
       +----------------+----------------+
       |                |                |
      CPU             MEMORY           THREADS
       |                |                |
   Hot Method      Heap / Native     Block / Wait
   GC CPU          Metaspace         Deadlock
   Retry Loop      Direct Buffer     Starvation
       |                |                |
       +----------------+----------------+
                        |
              DIAGNOSTIC EVIDENCE
          JFR / Thread Dump / Heap Dump
                        |
                    HYPOTHESIS
                        |
                    VALIDATE
                        |
                 FIX + PREVENT
```

---

# 54. 30-Second Explain-on-Demand

> “For JVM incidents I first classify the symptom into CPU, memory or thread behavior. Then I choose the least intrusive diagnostic artifact that can validate the hypothesis — for example JFR for time-based runtime behavior, thread dumps for blocking/deadlock, or heap dumps for object retention. I correlate that evidence with application and infrastructure metrics before concluding root cause.”

---

# 55. 5-Minute Trainer Demo

### Topic

**Thread Dump vs Heap Dump**

Structure:

1. What problem each answers.
2. Thread dump = what threads are doing.
3. Heap dump = what objects occupy memory.
4. Production examples.
5. When to use each.
6. Common mistake: collecting wrong artifact.
7. Security/operational caution.
8. Key takeaway.

---

# 56. High-Probability Interview Questions

Prepare:

1. Explain JVM memory.
2. Heap vs stack?
3. Young vs old generation?
4. What is GC?
5. What is GC pressure?
6. What is a memory leak?
7. High memory vs memory leak?
8. What is OOM?
9. How do you diagnose heap OOM?
10. What is metaspace?
11. What is native memory?
12. Why can container OOM occur with free heap?
13. What is a thread dump?
14. What is a heap dump?
15. Thread dump vs heap dump?
16. What is deadlock?
17. How do you detect deadlock?
18. What is thread starvation?
19. How do you troubleshoot high CPU?
20. Why collect multiple thread dumps?
21. What is `jstack`?
22. What is `jcmd`?
23. What is `jmap`?
24. What is JFR?
25. JFR vs heap dump?
26. What is VisualVM?
27. What is `-Xms` / `-Xmx`?
28. Should you increase heap for OOM?
29. What is OOMKilled?
30. How do you safely collect diagnostics in production?
31. How would you teach JVM troubleshooting?
32. Design a JVM lab.

---

# 57. Cross-Question Drill

## Q1. Full GC is happening. Is that bad?

Not automatically. Evaluate frequency, pause time, heap occupancy, workload, and user impact.

## Q2. Heap is high. Is it a leak?

Not necessarily. Look at post-GC baseline and retention trend.

## Q3. Why collect several thread dumps?

To identify recurring/stuck stack patterns rather than rely on one point-in-time snapshot.

## Q4. Why not always collect a heap dump?

It can be large, intrusive, sensitive, and unnecessary if the hypothesis concerns threads or CPU.

## Q5. Restart fixes memory issue. Is that root cause?

No. Restart releases memory and is only mitigation.

## Q6. Why can more heap make things worse?

Larger heap can increase memory footprint and potentially change GC behavior; it can also hide a leak temporarily and conflict with container limits.

## Q7. CPU high but all requests are healthy. What then?

Check whether CPU is expected workload, batch activity, GC, background processing, or capacity concern before calling it an incident.

## Q8. Many threads are WAITING. Is that bad?

Not necessarily. Thread state must be interpreted with stack context and workload.

## Q9. Can a deadlock happen with low CPU?

Yes. Deadlocked threads can be waiting indefinitely while CPU remains low.

## Q10. Can high thread count cause memory pressure?

Yes. Each thread consumes stack/native resources and adds scheduling overhead.

---

# 58. Real Experience Mapping

Prepare truthful examples related to:

- Java application troubleshooting
- Performance issue
- Memory/resource issue
- Thread/concurrency concern
- Slow dependency
- Kubernetes resource issue
- Production deployment
- Code review
- Security remediation

Use:

`Situation → Symptom → Evidence → Diagnosis → Action → Result → Prevention`

Do not invent a heap-dump story if you have never performed one. You can discuss the methodology clearly and distinguish it from your direct experience.

---

# 59. Red Flags

Do not:

- Say GC removes “unused memory” without explaining reachability.
- Treat high heap as proof of leak.
- Increase `Xmx` as default fix.
- Collect heap dump for every incident.
- Confuse heap dump with thread dump.
- Assume high CPU means GC.
- Assume WAITING thread means problem.
- Ignore native memory.
- Ignore container limits.
- Run intrusive diagnostics casually in production.
- Pretend direct hands-on experience you do not have.
- Overload interview answers with collector-specific trivia.

---

# 60. Quick Revision

## Memory

**Heap → Objects**  
**Stack → Per-thread execution**  
**Metaspace → Class metadata**  
**Native → Threads/direct/JVM internals**

## Diagnostic Artifacts

**Thread Dump → What threads are doing**  
**Heap Dump → What objects retain memory**  
**JFR → What happened over time**

## Core Scenarios

**High CPU → Hot threads/code/GC**  
**High Memory → Heap/native/retention**  
**Hang → Thread/dependency/lock**  
**OOM → Exact OOM type first**

## Golden Rule

> **Choose the diagnostic artifact based on the hypothesis, not habit.**

---

# 61. Module 05 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| JVM memory model | 4+ | |
| Heap vs stack | 5 | |
| GC explanation | 5 | |
| GC pressure reasoning | 4+ | |
| Memory leak reasoning | 5 | |
| OOM troubleshooting | 5 | |
| Native memory awareness | 4+ | |
| Container memory awareness | 4+ | |
| Thread states | 4+ | |
| Deadlock | 5 | |
| Thread starvation | 4+ | |
| High CPU troubleshooting | 5 | |
| Thread dump | 5 | |
| Heap dump | 5 | |
| JFR | 4+ | |
| `jstack` / `jcmd` / `jmap` | 4+ | |
| Production safety | 5 | |
| Whiteboard explanation | 4+ | |
| Lab design | 5 | |
| Cross-question survival | 4+ | |

---

# 62. Module 05 Readiness Gate

## PASS only when you can:

- Explain JVM memory without notes.
- Explain heap vs stack.
- Explain GC in production terms.
- Diagnose high CPU.
- Diagnose high memory.
- Explain memory leak evidence.
- Explain exact OOM-type reasoning.
- Explain heap dump vs thread dump.
- Explain deadlock and thread starvation.
- Explain JFR and when to use it.
- Explain `jstack`, `jcmd`, and `jmap` at interview depth.
- Explain container OOM vs heap OOM.
- Design at least three practical JVM labs.
- Draw the JVM diagnostic whiteboard.
- Survive at least 10 follow-up questions.

### Minimum Score

**All critical P0 dimensions ≥ 4/5**

If answers become tool-first, tuning-first, or unsupported by evidence, Module 05 remains **BLOCKED**.

---

# 63. Final Module Outcome

After this module, the panel should think:

> **“He understands JVM diagnostics at a practical production level, chooses evidence intelligently, and can teach runtime troubleshooting without turning it into theoretical JVM internals.”**

That is the selection goal for Module 05.
