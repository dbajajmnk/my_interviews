# iRun Corporate Training Interview Preparation
## Module 16 — Code Analysis & Application Debugging

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Demonstrate the ability to move from production symptoms and telemetry into code-level investigation, identify defects efficiently, review unfamiliar code, reason about performance/security issues, and teach debugging as a disciplined engineering process.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Read unfamiliar code efficiently.
- Trace a production symptom to a likely code path.
- Use logs, traces, stack traces, and runtime evidence to narrow investigation.
- Distinguish symptom, bug, contributing factor, and root cause.
- Diagnose exception-flow problems.
- Identify resource leaks.
- Identify connection handling issues.
- Detect retry-loop and recursion problems.
- Identify blocking and concurrency defects.
- Identify performance bottlenecks.
- Identify security/vulnerability risks.
- Review logging quality.
- Evaluate AI-generated code critically.
- Explain safe debugging in production.
- Design trainer labs around real defect scenarios.
- Survive code-review and debugging cross-questions.

The panel should think:

> **“He can move from production evidence into code intelligently, without reading the whole codebase or guessing.”**

---

# 2. Code Investigation Mental Model

Use:

```text
PRODUCTION SYMPTOM
       |
       v
 LOG / TRACE / METRIC
       |
       v
 STACK TRACE / HOT PATH
       |
       v
 SERVICE / METHOD / COMPONENT
       |
       v
 CODE PATH
       |
       v
 HYPOTHESIS
       |
       v
 TEST / REPRODUCE
       |
       v
 FIX
       |
       v
 VALIDATE
       |
       v
 PREVENT
```

The goal is to reduce the search space before reading code.

---

# 3. First Rule — Do Not Read the Whole Codebase

When debugging unfamiliar systems:

Start with:

- Failing request
- Error message
- Stack trace
- Correlation ID
- Service name
- Endpoint
- recent change
- dependency
- hot method

Then inspect only the relevant path.

Senior behavior:

> “I use evidence to navigate the codebase.”

---

# 4. Codebase Orientation

Before deep debugging, identify:

- Entry point
- API/controller layer
- service/business layer
- repository/data access
- integration clients
- configuration
- shared utilities
- background workers
- exception handling
- logging

This creates a mental map quickly.

---

# 5. Read Call Flow

For API failure, trace:

```text
Controller
   |
Service
   |
Repository / Client
   |
DB / API / Queue
```

For batch:

```text
Scheduler
  |
Job
  |
Processor
  |
Writer / Dependency
```

For event-driven:

```text
Consumer
  |
Handler
  |
Business Logic
  |
DB / API
```

---

# 6. Stack Trace Analysis

A stack trace helps identify:

- Exception type
- Root cause
- call path
- code location
- wrapper exceptions

Important:

Do not stop at the top-level exception.

Look for:

- `Caused by`
- inner exception
- first application-owned frame

---

# 7. Strong Answer — “How Do You Read a Stack Trace?”

> “I identify the exception type and message first, then move down to the root or inner exception. I look for the first relevant application-owned frame rather than spending time on framework internals. Then I connect that frame with the request context, configuration and dependency evidence to form a hypothesis.”

---

# 8. Exception Handling Problems

Common defects:

- Swallowed exception
- generic catch
- rethrow losing context
- exposing stack trace to client
- wrong status code
- missing logging
- retrying non-retryable errors

Good practice:

- Preserve root cause
- add context
- map error appropriately
- avoid sensitive data exposure

---

# 9. Silent Catch Block

Example problem:

```java
try {
    callService();
} catch (Exception e) {
    // ignore
}
```

Operational impact:

- Failure disappears
- downstream behavior becomes confusing
- monitoring misses error

Trainer point:

> “No exception” in logs does not mean no failure occurred.

---

# 10. Resource Leak

Resource leak means resources are acquired but not released properly.

Examples:

- DB connections
- files
- sockets
- streams
- threads
- listeners

Symptoms:

- connection exhaustion
- file-descriptor exhaustion
- memory growth
- instability

---

# 11. Connection Leak

Possible pattern:

- DB connection acquired
- exception occurs
- connection not returned

Symptoms:

- pool utilization grows
- requests wait
- timeout
- DB appears reachable

Production diagnosis requires both code and pool metrics.

---

# 12. Strong Answer — “How Do You Identify Connection Leak?”

> “I would correlate connection-pool metrics with application behavior. If active connections remain high and are not returning despite normal traffic, I would inspect long-running transactions, slow queries and code paths that acquire connections or resources. The key is to prove whether connections are genuinely leaked or simply busy for too long.”

---

# 13. Retry Loop Defect

Bad retry logic can create:

- traffic amplification
- CPU load
- duplicate calls
- cascading failure

Common code smells:

- No max attempts
- no backoff
- retry on every exception
- retry around non-idempotent action

---

# 14. Infinite Loop

Symptoms:

- High CPU
- no progress
- thread stuck in same method

Evidence:

- CPU profile
- repeated thread stack
- loop condition

Avoid assuming loop from CPU alone.

---

# 15. Recursion / StackOverflow

Deep or uncontrolled recursion can cause:

- `StackOverflowError`
- crash
- repeated call frames

Look at stack trace pattern.

---

# 16. Blocking Code

Examples:

- sync I/O inside async path
- long lock
- `sleep`
- waiting on future synchronously
- large CPU work in request thread

Symptoms:

- latency
- starvation
- low throughput

Runtime differs, but principle transfers across Java/.NET/Node.

---

# 17. Concurrency Defects

Examples:

- Race condition
- deadlock
- shared mutable state
- unsafe cache
- lock ordering
- lost update

Evidence:

- intermittent behavior
- thread dumps
- incorrect state
- timing-sensitive reproduction

---

# 18. Race Condition

A race condition occurs when outcome depends on timing/order of concurrent operations.

Symptoms:

- intermittent
- hard to reproduce
- state corruption
- duplicate update

Do not call every intermittent issue a race condition.

---

# 19. Deadlock in Code

Typical cause:

- inconsistent lock acquisition order

Need:

- thread evidence
- lock ownership
- code path

Permanent fix:

- consistent lock order
- reduce locking
- safer concurrency design

---

# 20. Performance Bottleneck Categories

Look for:

- Inefficient algorithm
- N+1 queries
- repeated serialization
- large object creation
- blocking I/O
- unnecessary remote calls
- missing cache
- poor cache
- excessive logging
- repeated computation

Do not optimize without measurement.

---

# 21. N+1 Query Problem

Pattern:

- One query fetches parent list.
- Then one query per item fetches children.

Symptoms:

- Latency grows with record count.
- DB query count high.

Evidence:

- trace/query logs
- DB metrics
- code path

---

# 22. Slow Query vs Bad Application Code

Sometimes application code is fine but query is slow.

Check:

- Query plan
- index
- volume
- lock
- DB resource

Do not force code fix when dependency is root cause.

---

# 23. Excessive Remote Calls

Pattern:

```text
for each item:
    call external API
```

Symptoms:

- latency
- rate limits
- dependency pressure

Possible improvements:

- batching
- caching
- parallelism with bounds
- redesign

---

# 24. Logging Defects

Problems:

- No context
- No correlation ID
- Sensitive data
- Too much debug logging
- Missing exception
- unstructured logs

Good logs support diagnosis.

---

# 25. Sensitive Logging

Never log:

- passwords
- tokens
- full secrets
- sensitive PII without necessity
- payment data

Security is part of operations.

---

# 26. Security / Vulnerability Code Review

High-value areas:

- Input validation
- injection
- auth/authz
- secrets
- insecure deserialization
- path handling
- SSRF
- dependency vulnerabilities
- sensitive logging
- broken access control

Do not turn this module into a full security course; focus on operational risk.

---

# 27. SQL Injection

Risk:

User input directly influences SQL query.

Mitigation:

- Parameterized queries
- ORM safe usage
- validation

Interview point:

> “Input validation helps, but parameterization is the core SQL-injection control.”

---

# 28. Broken Access Control

Code may correctly authenticate user but fail to check authorization.

Example:

User changes object ID in request and accesses another user's data.

Code review should include authorization at resource level.

---

# 29. Secrets in Code

Bad:

- hardcoded password
- API key in repository
- token in config file

Better:

- secret store
- environment/managed identity
- rotation

---

# 30. Dependency Vulnerabilities

Check:

- vulnerable package
- outdated library
- transitive dependency

Operational process:

- identify
- assess exploitability
- patch/upgrade
- regression test
- redeploy
- verify

---

# 31. Code Review Mental Model

Review:

1. Correctness
2. Readability
3. Error handling
4. Resource handling
5. Performance
6. Concurrency
7. Security
8. Logging
9. Testability
10. Operational behavior

---

# 32. Strong Answer — “What Do You Look for in Code Review?”

> “I start with correctness and behavior, then I look at error handling, resource lifecycle, performance, concurrency, security, logging and testability. For production systems I also ask how this change will fail, how we will observe it, and whether rollback or recovery is safe.”

That last sentence sounds senior.

---

# 33. Recent Change Analysis

When incident follows deployment:

Use:

- Git diff
- changed config
- dependency upgrade
- feature flag
- DB migration
- runtime change

Do not assume newest commit is automatically guilty, but use change as evidence.

---

# 34. Binary Search Through Changes

For large change sets:

- compare known good vs bad version
- narrow change window
- reproduce
- rollback or isolate

Useful concept, not necessarily literal `git bisect` unless asked.

---

# 35. Reproduction

A good reproduction should:

- isolate conditions
- use controlled test data
- minimize variables
- produce same symptom
- avoid harming production

Production is not the preferred debugging environment.

---

# 36. Production Debugging Safety

Avoid:

- attaching intrusive debugger casually
- changing many variables
- turning on huge debug logs everywhere
- exposing sensitive data
- running destructive queries

Prefer:

- telemetry
- dumps/profiles
- feature flags
- safe replica
- staging reproduction

---

# 37. Feature Flags

Useful for:

- Isolating new behavior
- disabling problematic feature
- gradual rollout

Operational caution:

- stale flags
- inconsistent config
- hidden code paths

---

# 38. Code-Level RCA

RCA should not stop at:

> “NullPointerException.”

Ask:

- Why was null possible?
- Why was it not validated?
- Why did tests miss it?
- Why did monitoring not catch it earlier?
- What prevents recurrence?

---

# 39. AI-Generated Code Review

Treat AI-generated code like untrusted code.

Check:

- Correctness
- security
- API validity
- error handling
- edge cases
- performance
- dependency/version accuracy
- hallucinated methods
- test coverage

Do not accept because it compiles.

---

# 40. Strong Answer — “How Do You Review AI-Generated Code?”

> “I review it exactly as I would externally sourced code, but with extra attention to invented APIs, insecure defaults and missing edge cases. I validate it against documentation, run tests, inspect security and performance implications, and make sure I understand the code before accepting it.”

---

# 41. Scenario 1 — API 500 After Release

Evidence:

- Stack trace points to new service method
- null object

Investigate:

- Why null?
- input?
- config?
- dependency?
- missing validation?

Fix the cause, not just add catch block.

---

# 42. Scenario 2 — Connection Pool Exhaustion

Code inspection reveals connection not closed on exception path.

Evidence:

- pool saturation
- stack trace
- code path

Fix:

- proper resource lifecycle
- regression test
- monitor pool

---

# 43. Scenario 3 — High CPU

CPU profile points to regex/loop.

Fix:

- optimize code
- add performance test
- validate CPU/latency

---

# 44. Scenario 4 — Duplicate API Calls

Cause:

- retry loop with no idempotency

Fix:

- bounded retry
- backoff
- idempotency

---

# 45. Scenario 5 — Memory Growth

Heap evidence points to static cache.

Investigate:

- retention
- eviction
- business need

---

# 46. Scenario 6 — Intermittent Data Corruption

Potential concurrency issue.

Need:

- timeline
- thread behavior
- shared state
- reproduction

Do not jump to race condition without proof.

---

# 47. Scenario 7 — Security Scan Fails

Dependency vulnerability or insecure code.

Actions:

- assess severity
- patch
- regression test
- redeploy
- verify scan

Do not bypass gate.

---

# 48. Scenario 8 — Logs Show No Root Cause

Maybe:

- exception swallowed
- insufficient context
- wrong logging level

Code improvement should enhance observability.

---

# 49. Corporate Training Angle

Teach debugging as:

**Evidence → Code Path → Hypothesis → Reproduction → Fix → Test → Production Validation**

Do not teach as “put breakpoints everywhere.”

---

# 50. Lab 1 — Exception Root Cause

Inject:

- Wrapped exception

Learners:

- inspect stack trace
- identify root cause
- find application frame
- fix
- validate

---

# 51. Lab 2 — Resource Leak

Inject:

- DB/file resource not closed

Learners:

- observe resource metric
- inspect code
- fix lifecycle
- validate recovery

---

# 52. Lab 3 — Retry Storm

Inject:

- unlimited retry

Learners:

- observe traffic amplification
- identify loop
- add limits/backoff/idempotency

---

# 53. Lab 4 — N+1 Query

Inject:

- query inside loop

Learners:

- inspect traces/query count
- find code path
- optimize
- compare latency

---

# 54. Lab 5 — Sensitive Logging

Inject:

- token logged in plain text

Learners:

- identify security issue
- sanitize
- verify logs

---

# 55. Lab 6 — AI-Generated Defect

Provide AI-generated code with:

- nonexistent API
- poor error handling
- unsafe query

Learners review, test, and correct it.

---

# 56. Whiteboard — Code Investigation Flow

```text
             INCIDENT
                |
          TELEMETRY / ERROR
                |
          STACK / TRACE
                |
        APPLICATION FRAME
                |
            CODE PATH
          /     |      \
      LOGIC  RESOURCE  DEPENDENCY
          \     |      /
             HYPOTHESIS
                |
            REPRODUCE
                |
               FIX
                |
              TEST
                |
         PROD VALIDATION
                |
              PREVENT
```

---

# 57. 30-Second Explain-on-Demand

> “I do not begin code debugging by reading the whole codebase. I use telemetry, stack traces and request context to identify the failing component and application-owned code path. Then I form a hypothesis, reproduce it safely, fix the smallest root cause, test it and validate the production signal afterward.”

---

# 58. 5-Minute Trainer Demo

### Topic: Reading a Stack Trace

1. Start with exception type.
2. Find root/inner cause.
3. Identify first app-owned frame.
4. Connect to request context.
5. Open relevant method.
6. Form hypothesis.
7. Reproduce.
8. Fix.
9. Test.
10. Key takeaway.

---

# 59. High-Probability Interview Questions

1. How do you read unfamiliar code?
2. How do you start production debugging?
3. How do you read a stack trace?
4. What is root cause vs wrapper exception?
5. What is resource leak?
6. How do you identify connection leak?
7. What is retry storm?
8. How do you diagnose high CPU in code?
9. What is N+1 query?
10. What is race condition?
11. What is deadlock?
12. How do you review production code?
13. What security issues do you look for?
14. How do you handle secrets?
15. How do you improve logging?
16. How do you debug safely in production?
17. How do you review AI-generated code?
18. How do you connect telemetry to code?
19. How do you teach debugging?
20. Design a code-analysis lab.

---

# 60. Cross-Question Drill

## Q1. Stack trace points to line 50. Is that root cause?

Not necessarily. It may be where failure surfaced. Check inner cause and surrounding state.

## Q2. High CPU means bad algorithm?

Maybe, but validate with profile and workload.

## Q3. Connection pool full means connection leak?

Not necessarily. Slow queries or long transactions may keep connections busy.

## Q4. Why not add broad try/catch to stop errors?

It can hide root cause and create incorrect behavior.

## Q5. More logs always help?

No. Logs must be relevant, structured, secure, and cost-aware.

## Q6. Race condition is hard to reproduce. How do you prove it?

Use timing evidence, concurrency instrumentation, controlled reproduction, and state analysis.

## Q7. Can static analysis replace code review?

No. It complements human reasoning and runtime evidence.

## Q8. AI-generated code passes tests. Is it safe?

Not automatically. Test coverage may be incomplete; review security, edge cases, performance and API correctness.

## Q9. Production incident fixed by rollback. Is code analysis still needed?

Yes, to identify and prevent root cause before re-release.

## Q10. Why include observability in code review?

Because production support depends on being able to detect and diagnose failures.

---

# 61. Real Experience Mapping

Prepare truthful examples involving:

- Code review
- Vulnerability remediation
- Production defect
- API issue
- Performance issue
- Dependency issue
- Logging improvement
- Architecture/design discussion
- CI/CD quality gate
- AI-generated code evaluation if applicable

Use:

**Situation → Evidence → Code Path → Defect → Fix → Validation → Prevention**

---

# 62. Red Flags

Do not:

- Read whole codebase before using evidence.
- Add catch blocks to hide exceptions.
- Call every resource issue a leak.
- Call every intermittent issue a race condition.
- Optimize without profiling.
- Disable security scans.
- Log secrets.
- Debug intrusively in production without approval.
- Trust AI-generated code blindly.
- Treat compile success as correctness.
- Fix symptom without improving tests/observability.

---

# 63. Quick Revision

**Navigate:** Error → Stack → App Frame → Method

**Review:** Correctness → Error → Resource → Performance → Concurrency → Security → Logging → Tests

**Production:** Evidence first, code second

**AI:** Verify APIs + tests + security + edge cases

**Golden Rule:** Do not debug the whole codebase; debug the evidence-supported path.

---

# 64. Module 16 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Unfamiliar code navigation | 4+ | |
| Stack trace analysis | 5 | |
| Exception handling | 4+ | |
| Resource leak reasoning | 4+ | |
| Connection handling | 4+ | |
| Retry-loop analysis | 4+ | |
| Concurrency reasoning | 4+ | |
| Performance review | 4+ | |
| N+1 recognition | 4+ | |
| Security review | 4+ | |
| Logging quality | 5 | |
| Safe production debugging | 5 | |
| AI-generated code review | 4+ | |
| Telemetry-to-code mapping | 5 | |
| Scenario handling | 4+ | |
| Trainer lab design | 4+ | |
| Cross-question survival | 4+ | |

---

# 65. Module 16 Readiness Gate

## PASS only when you can:

- Explain how to approach an unfamiliar codebase.
- Read a stack trace and identify app-owned frames.
- Explain exception-handling anti-patterns.
- Diagnose resource and connection leaks conceptually.
- Explain retry-loop and blocking-code problems.
- Explain N+1 and performance bottlenecks.
- Explain race/deadlock concepts without overdiagnosing.
- Explain security and logging review.
- Explain safe production debugging.
- Explain how to review AI-generated code.
- Handle at least five code-level production scenarios.
- Design at least three trainer labs.
- Draw the code-investigation flow.
- Survive at least 10 follow-up questions.

### Minimum Score

**P1 target average ≥ 3.5/5, with telemetry-to-code mapping and safe-debugging at 5/5.**

If answers become breakpoint-first, guess-driven, or hide errors rather than diagnose them, Module 16 remains **BLOCKED**.

---

# 66. Final Module Outcome

After this module, the panel should think:

> **“He can move from production evidence to the relevant code path efficiently, identify operationally important defects, and teach debugging as a disciplined engineering process rather than trial and error.”**

That is the selection goal for Module 16.
