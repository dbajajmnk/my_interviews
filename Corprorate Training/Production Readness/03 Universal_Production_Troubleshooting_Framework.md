# iRun Corporate Training Interview Preparation
## Module 03 — Universal Production Troubleshooting Framework
---

# 1. Module Objective

By the end of this module, you should be able to:

- Handle unfamiliar production scenarios without panicking.
- Avoid random command-based troubleshooting.
- Diagnose issues layer by layer.
- Explain your reasoning clearly.
- Separate symptom from root cause.
- Distinguish mitigation from permanent fix.
- Connect application, runtime, dependency, and infrastructure evidence.
- Teach participants a repeatable production troubleshooting method.
- Use the same framework across Java, .NET, Node.js, APIs, Kafka, Kubernetes, batch jobs, data platforms, and SRE scenarios.

The panel should think:

> **“He does not troubleshoot by guessing. He uses a structured, evidence-driven production methodology.”**

---

# 2. What the Client May Evaluate

The interviewer may test whether you can:

- Prioritize business impact.
- Scope the incident.
- Ask the right first questions.
- Identify recent changes.
- Use logs, metrics, and traces correctly.
- Check dependencies.
- Decide when to inspect runtime behavior.
- Decide when to inspect infrastructure.
- Form hypotheses from evidence.
- Validate assumptions.
- Restore service safely.
- Perform RCA.
- Recommend preventive actions.
- Explain the process to learners.
- Avoid common troubleshooting anti-patterns.

---

# 3. Master Troubleshooting Flow

Use this for almost every scenario:

`Incident → Impact → Scope → Symptoms → Recent Change → Health → Logs → Metrics → Traces → Dependencies → Runtime → Infrastructure → Hypothesis → Validate → Mitigate → Restore → RCA → Prevention`

This is the backbone of the entire interview preparation.

---

# 4. Step 1 — Understand the Incident

Before checking commands or logs, understand what happened.

Ask:

- What is failing?
- When did it start?
- Who is affected?
- Is it complete failure or degradation?
- Is it intermittent?
- Is it one service or multiple services?
- Is the issue local, regional, or global?
- Is there business-critical impact?
- What changed recently?

## Strong Interview Language

> “My first step is to understand impact and scope before jumping into technical diagnosis.”

This sounds senior because it prevents blind troubleshooting.

---

# 5. Step 2 — Assess Business Impact

Technical severity and business severity may differ.

Examples:

- One internal report is slow.
- Login is unavailable for all customers.
- A batch job failed but can safely retry.
- Payment processing is partially failing.
- A background queue is building up.

Questions:

- How many users?
- Which business function?
- Is revenue affected?
- Is data loss possible?
- Is there security risk?
- Is a workaround available?
- Is this an SLA breach?

---

# 6. Step 3 — Scope the Problem

Determine:

- One user or all users?
- One endpoint or all endpoints?
- One instance or all instances?
- One environment or multiple environments?
- One region or multiple regions?
- One dependency or multiple dependencies?
- One deployment version or all versions?

## Why Scope Matters

Scope reduces the search space.

Example:

If only one pod is failing, investigate pod-level state before assuming a system-wide database outage.

---

# 7. Step 4 — Identify Symptoms

Symptoms are not root causes.

Examples:

- High latency
- HTTP 503
- OOMKilled
- Connection timeout
- High CPU
- Queue lag
- Failed job
- Deadlock
- Authentication error
- Increased error rate

Never conclude:

> “503 means the application is down.”

Instead:

> “503 is the symptom. I would investigate why the service is unavailable.”

---

# 8. Step 5 — Check Recent Changes

High-value question:

> **“What changed?”**

Check:

- Deployment
- Configuration
- Secrets
- Certificates
- Infrastructure
- Database changes
- Dependency version
- Traffic pattern
- Feature flags
- Firewall/network rule
- Autoscaling policy
- Resource limits

A large percentage of incidents correlate with change.

Do not assume change caused the issue, but always validate it.

---

# 9. Step 6 — Check Application Health

Look at:

- Health endpoint
- Readiness endpoint
- Liveness endpoint
- Process state
- Pod/container state
- Service state
- Application startup status
- Dependency health

Questions:

- Is process running?
- Is it accepting traffic?
- Is it ready?
- Is health endpoint healthy?
- Are all dependencies reachable?

---

# 10. Step 7 — Analyze Logs

Logs help answer:

> **What happened?**

Check:

- Error logs
- Warning logs
- Stack traces
- Correlation IDs
- Authentication errors
- Timeout messages
- Connection errors
- Startup logs
- Dependency errors
- Resource errors

## Good Practice

Do not search logs randomly.

Use:

- Time window
- Correlation ID
- Request ID
- User/session
- Error code
- Service name

---

# 11. Step 8 — Analyze Metrics

Metrics answer:

> **How much? How often? How badly?**

Examples:

- CPU
- Memory
- Request rate
- Error rate
- Response time
- Thread count
- GC activity
- DB pool utilization
- Queue depth
- Consumer lag
- Disk
- Network
- Pod restarts

Important:

A log may show one error.

Metrics show whether the problem is isolated or systemic.

---

# 12. Step 9 — Analyze Traces

Traces answer:

> **Where did the request spend time or fail?**

Use tracing to identify:

- Slow service
- Slow database call
- Slow downstream API
- Retry amplification
- Gateway latency
- Serialization delay
- Cross-service failure

Useful for distributed systems where one request crosses multiple services.

---

# 13. Step 10 — Check Dependencies

Applications rarely fail alone.

Check:

- Database
- Cache
- External API
- Internal API
- Queue
- Kafka
- DNS
- Authentication provider
- File storage
- Object storage
- SMTP
- Certificate service
- Secrets store

Questions:

- Is dependency available?
- Is latency normal?
- Is authentication working?
- Is connection pool exhausted?
- Is network path open?

---

# 14. Step 11 — Runtime Investigation

Only go deeper when evidence points to runtime issues.

## Java / JVM

- Heap
- GC
- Threads
- Deadlock
- Thread starvation
- OOM
- CPU
- Thread dump
- Heap dump

## .NET / CLR

- Managed memory
- GC
- ThreadPool
- CPU
- Process dump
- Runtime counters

## Node.js / V8

- Event loop
- Heap
- GC
- CPU profile
- Heap snapshot
- Blocking work

---

# 15. Step 12 — Infrastructure Investigation

Check:

- CPU limits
- Memory limits
- Disk
- Network
- DNS
- Kubernetes events
- Pod status
- Node pressure
- Load balancer
- Autoscaling
- Firewall
- Certificates
- Cloud service health

Important:

Do not blame infrastructure automatically.

Use evidence.

---

# 16. Step 13 — Form a Hypothesis

A hypothesis should explain:

- Symptom
- Evidence
- Failure mechanism

Weak:

> “Maybe database problem.”

Strong:

> “API latency increased at the same time DB connection-pool utilization reached 100%, while application threads were waiting for connections. My current hypothesis is connection-pool exhaustion caused by slow DB queries or unreleased connections.”

---

# 17. Step 14 — Validate the Hypothesis

Validation is critical.

Examples:

- Compare healthy vs unhealthy instance.
- Reproduce issue.
- Check query latency.
- Inspect thread dump.
- Increase pool temporarily.
- Disable recent configuration.
- Route traffic away from one instance.
- Test dependency directly.

Never implement permanent changes based only on suspicion.

---

# 18. Step 15 — Mitigate Safely

Mitigation restores service quickly.

Examples:

- Roll back deployment.
- Scale instances.
- Restart unhealthy instance.
- Route traffic.
- Disable problematic feature.
- Increase temporary resource limit.
- Pause failing consumer.
- Re-run failed job safely.

Important:

Mitigation is not necessarily root-cause resolution.

---

# 19. Step 16 — Restore & Validate

After mitigation:

- Confirm health endpoint.
- Check error rate.
- Check latency.
- Check user impact.
- Check queue depth.
- Check logs.
- Confirm downstream dependencies.
- Monitor for recurrence.

Never say:

> “Issue fixed.”

without validation.

---

# 20. Step 17 — Root Cause Analysis

RCA should answer:

- What happened?
- Why did it happen?
- Why was it not detected earlier?
- Why did safeguards fail?
- What restored service?
- What is the permanent fix?
- How do we prevent recurrence?

---

# 21. Step 18 — Prevention

Prevention may include:

- Better alert
- Resource tuning
- Code fix
- Retry policy
- Circuit breaker
- Capacity planning
- Query optimization
- Pool configuration
- Autoscaling
- Health checks
- Deployment guardrails
- Runbook
- Test coverage
- Chaos/failure testing
- Training

---

# 22. Universal Troubleshooting Layers

Think in layers:

```text
USER / BUSINESS
      |
APPLICATION
      |
OBSERVABILITY
Logs / Metrics / Traces
      |
DEPENDENCIES
DB / API / Queue / Cache
      |
RUNTIME
JVM / CLR / V8
      |
PLATFORM
Kubernetes / Cloud / OS / Network
      |
ROOT CAUSE
```

---

# 23. Five Diagnostic Questions

If you forget everything, remember:

1. **What changed?**
2. **What is the scope?**
3. **What evidence do I have?**
4. **Which layer is failing?**
5. **How do I validate my hypothesis?**

These five questions can recover most scenario answers.

---

# 24. Scenario 1 — Application Is Slow

## Strong Flow

1. Scope users/endpoints.
2. Check recent changes.
3. Check latency/error metrics.
4. Check CPU/memory.
5. Inspect traces.
6. Check DB/API dependencies.
7. Check connection pools.
8. Check runtime if required.
9. Form hypothesis.
10. Validate.
11. Mitigate.
12. RCA.

## Possible Causes

- Slow database
- Connection pool exhaustion
- Downstream API
- GC
- High CPU
- Thread starvation
- Network latency
- Queue backlog
- Traffic spike

---

# 25. Scenario 2 — Application Is Down

Check:

- Process/pod status
- Health/readiness
- Deployment status
- Startup logs
- Configuration
- Secrets
- Certificates
- Dependency availability
- Resource exhaustion
- Kubernetes events

Do not begin with:

> “Restart it.”

Restart may be mitigation after evidence is collected.

---

# 26. Scenario 3 — High CPU

Check:

- CPU trend
- Request rate
- Recent changes
- Top processes
- Thread/runtime activity
- Hot methods
- Infinite loops
- Serialization
- GC
- Traffic spike
- Retry storm

Java:

- Thread dump
- JFR
- `top` / process metrics

Node:

- CPU profile
- Event loop

.NET:

- `dotnet-counters`
- `dotnet-trace`

---

# 27. Scenario 4 — High Memory

Check:

- Memory trend
- Recent deployment
- Traffic
- Heap
- GC
- Cache
- Unreleased resources
- Large objects
- Memory leak

Important distinction:

**High memory is not automatically a memory leak.**

Leak usually shows continuous growth that does not return after normal GC/workload cycles.

---

# 28. Scenario 5 — HTTP 503

Possible causes:

- Service unavailable
- No healthy backend
- Application not ready
- Deployment failure
- Dependency outage
- Overload
- Gateway/load balancer issue
- Circuit breaker open
- Resource exhaustion

Use:

`Client → Gateway → Service → Runtime → Dependency → Platform`

---

# 29. Scenario 6 — Intermittent Failure

Intermittent issues require correlation.

Check:

- One instance?
- One region?
- Specific user?
- Load?
- Time pattern?
- Connection pool?
- Network?
- Race condition?
- Expiring token?
- Load balancer?
- Dependency timeout?

Use correlation IDs and instance identifiers.

---

# 30. Scenario 7 — Kubernetes Pod Restarting

Check:

- Pod status
- Restart count
- Events
- Logs
- Liveness probe
- Readiness probe
- OOMKilled
- Resource limits
- Application startup
- Secret/config
- Dependency

---

# 31. Scenario 8 — Kafka Consumer Lag

Check:

- Producer rate
- Consumer processing rate
- Consumer health
- Partition assignment
- Broker health
- Slow downstream dependency
- Consumer errors
- Retries
- Offset behavior
- Scaling

Lag is a symptom, not the root cause.

---

# 32. Scenario 9 — Batch Job Did Not Run

Check:

- Scheduler
- Trigger
- Job status
- Dependency
- Credentials
- Logs
- Time zone
- Previous job state
- Lock
- Resource
- Configuration

Then determine if safe to re-run.

---

# 33. Scenario 10 — Data Pipeline Failed

Check:

- Trigger
- Source availability
- Credentials
- Schema
- Connectivity
- Transformation
- Destination
- Capacity
- Partial processing
- Retry behavior

---

# 34. Troubleshooting Anti-Patterns

Avoid:

- Restart first.
- Check “everything.”
- Blame network.
- Blame database.
- Change multiple variables at once.
- Ignore recent changes.
- Ignore business impact.
- Treat correlation as causation.
- Stop after service restoration.
- Skip validation.
- Skip RCA.
- Use production as uncontrolled test environment.

---

# 35. Strong Answer — “How Do You Troubleshoot Production Issues?”

## Recommended Interview Answer

> “I use a structured, evidence-driven approach.
>
> First I understand business impact and scope, then identify symptoms and check recent changes. I verify application health and correlate logs, metrics and traces. After that I check dependencies such as databases, APIs, queues or authentication services.
>
> If the evidence points deeper, I inspect runtime behavior — for example threads, heap, GC or event-loop health — and then infrastructure such as containers, resources, networking or cloud services.
>
> I form a hypothesis from evidence, validate it with the smallest safe test, mitigate to restore service, confirm recovery and then perform RCA and preventive action.
>
> I avoid random restarts or changing multiple things at once because that destroys evidence.”

---

# 36. Corporate Training Angle

Do not only teach the troubleshooting steps.

Teach decision-making.

## Lab Pattern

`Symptom → Evidence → Hypothesis → Test → Fix → Validation → RCA`

The trainer should **not reveal the root cause** at the beginning.

---

# 37. Trainer Lab Example — Slow Java API

## Injected Failure

DB connection pool reaches maximum.

## Symptoms

- API latency
- Timeouts
- Waiting threads
- Pool utilization high

## Learner Evidence

- Application logs
- Metrics
- Thread dump
- DB metrics

## Expected Reasoning

Pool exhaustion is the immediate mechanism.

Then ask:

> **Why is the pool exhausted?**

Possible deeper cause:

- Slow query
- Unreleased connection
- Traffic spike
- Undersized pool

This teaches root-cause depth.

---

# 38. Whiteboard Explanation

```text
             INCIDENT
                |
          BUSINESS IMPACT
                |
              SCOPE
                |
            SYMPTOMS
                |
          RECENT CHANGE?
                |
    +-----------+-----------+
    |           |           |
  LOGS        METRICS      TRACES
    |           |           |
    +-----------+-----------+
                |
           DEPENDENCIES
       DB / API / QUEUE
                |
             RUNTIME
       JVM / CLR / V8
                |
          INFRASTRUCTURE
                |
            HYPOTHESIS
                |
             VALIDATE
                |
            MITIGATE
                |
             RESTORE
                |
               RCA
                |
            PREVENT
```

---

# 39. 30-Second Explanation

> “I troubleshoot production issues from impact to evidence. I first scope the incident and check recent changes, then correlate logs, metrics and traces. I validate dependencies, runtime and infrastructure only as the evidence requires. I form and test a hypothesis, restore service safely, then complete RCA and prevention.”

---

# 40. 2-Minute Explanation

Add:

- Why symptoms are not root causes.
- Why recent changes matter.
- How logs/metrics/traces complement each other.
- Why mitigation and permanent fix differ.
- Why validation and RCA are mandatory.

---

# 41. 5-Minute Trainer Demo

Teach:

> **How to troubleshoot a slow application**

Structure:

1. What is “slow”?
2. Scope.
3. Business impact.
4. Logs/metrics/traces.
5. DB/API dependencies.
6. Runtime.
7. Hypothesis.
8. Validation.
9. Mitigation.
10. RCA.

---

# 42. Cross-Question Drill

## Q1. Why check recent changes first?

Because change is a common incident trigger and helps reduce the search space, but must still be validated.

## Q2. What if there was no deployment?

Check configuration, traffic, dependency, infrastructure, certificate, data, and resource changes.

## Q3. Logs show no errors. What next?

Use metrics, traces, health, dependency metrics, runtime data, and infrastructure evidence.

## Q4. When would you restart?

When restart is an appropriate mitigation, after capturing sufficient evidence if possible, especially for recurring issues.

## Q5. How do you know the root cause?

The root cause must explain the observed symptoms and be supported by evidence and validation.

## Q6. What if multiple issues exist?

Prioritize business impact, isolate layers, and validate each hypothesis independently.

## Q7. How do you troubleshoot under time pressure?

Separate immediate mitigation from deeper diagnosis while preserving evidence.

## Q8. What if the issue disappears?

Preserve logs, metrics, traces, dumps, event history, deployment history, and timeline for post-incident investigation.

## Q9. How do you avoid confirmation bias?

Actively look for evidence that disproves the current hypothesis.

## Q10. When do you escalate?

When impact, access, expertise, ownership boundaries, or time-to-recovery justify involving another team.

---

# 43. Real Experience Mapping

Prepare truthful examples for:

- Slow application
- Deployment issue
- Security/vulnerability issue
- API/integration issue
- Database dependency
- Messaging issue
- Infrastructure/container issue
- Production defect
- Code review finding
- Incident coordination

Each story:

`Situation → Impact → Evidence → Hypothesis → Action → Result → Prevention`

---

# 44. Red Flags

Do not say:

- “I restart first.”
- “I check all logs.”
- “Probably database.”
- “It is a network issue.”
- “I will increase memory.”
- “I will scale pods.”

without evidence.

These may be valid actions, but only after diagnosis.

---

# 45. Quick Revision

Remember:

## Master Flow

**Impact → Scope → Change → Health → Logs → Metrics → Traces → Dependencies → Runtime → Infra → Hypothesis → Validate → Mitigate → RCA → Prevent**

## Three Evidence Sources

**Logs → What happened?**  
**Metrics → How much?**  
**Traces → Where?**

## Three Senior Questions

**What changed?**  
**What is the scope?**  
**What evidence supports the hypothesis?**

## Golden Rule

> **Do not confuse symptom, mitigation, and root cause.**

---

# 46. Module 03 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Master troubleshooting flow | 5 | |
| Business impact thinking | 4+ | |
| Scope identification | 5 | |
| Recent change analysis | 4+ | |
| Logs reasoning | 5 | |
| Metrics reasoning | 5 | |
| Traces reasoning | 4+ | |
| Dependency analysis | 5 | |
| Runtime reasoning | 4+ | |
| Infrastructure reasoning | 4+ | |
| Hypothesis formation | 5 | |
| Validation discipline | 5 | |
| Mitigation vs fix distinction | 5 | |
| RCA/prevention | 5 | |
| Scenario handling | 4+ | |
| Whiteboard explanation | 5 | |
| Trainer explanation | 5 | |
| Cross-question survival | 4+ | |

---

# 47. Module 03 Readiness Gate

## PASS only when you can:

- State the master flow without notes.
- Explain each step clearly.
- Handle at least 10 unfamiliar scenarios.
- Avoid jumping directly to tools.
- Distinguish symptom from root cause.
- Distinguish mitigation from permanent fix.
- Explain logs vs metrics vs traces.
- Form and validate hypotheses.
- Draw the troubleshooting whiteboard.
- Teach the methodology in 5 minutes.
- Survive at least 10 cross-questions.

### Minimum Score

**All critical P0 dimensions ≥ 4/5**

If the answer becomes random, tool-first, or assumption-driven, Module 03 remains **BLOCKED**.

---

# 48. Final Module Outcome

After this module, the panel should think:

> **“He can handle unfamiliar production incidents systematically, explain his reasoning, and teach engineers how to diagnose instead of guess.”**

That is the selection goal for Module 03.
