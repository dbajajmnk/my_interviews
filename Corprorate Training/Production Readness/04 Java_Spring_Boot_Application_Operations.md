# iRun Corporate Training Interview Preparation
## Module 04 — Java & Spring Boot Application Operations
---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain how a Java/Spring Boot application behaves from startup to production runtime.
- Troubleshoot startup, configuration, dependency, database, deployment, and performance issues.
- Use Spring Boot Actuator and logs effectively.
- Distinguish application-level issues from JVM-level issues.
- Explain connection-pool failures and dependency failures.
- Handle “works locally but fails in production” scenarios.
- Teach Spring Boot operations through practical controlled-failure labs.
- Survive likely follow-up questions without drifting into unnecessary framework theory.

The panel should think:

> **“He understands Java applications as production systems, not only as code.”**

---

# 2. What the Client May Evaluate

The interviewer may test whether you understand:

- Spring Boot startup behavior
- Application configuration
- Profiles
- Environment variables
- Externalized configuration
- Application startup failures
- Dependency Injection failures
- Database connectivity
- Connection pools
- Actuator
- Health/readiness checks
- Logging
- REST/API failures
- Application servers
- Deployment issues
- Dependency/classpath problems
- Production-only failures
- Slow Java applications
- Distinction between Spring Boot issue and JVM issue
- How you would teach these topics practically

---

# 3. Java Application Operations Mental Model

Think of a Spring Boot application in layers:

```text
USER / CLIENT
      |
API / CONTROLLER
      |
SERVICE / BUSINESS LOGIC
      |
REPOSITORY / INTEGRATION
      |
DB / API / QUEUE / CACHE
      |
SPRING CONTAINER
      |
JVM
      |
OS / CONTAINER / KUBERNETES
```

When troubleshooting, do not jump directly into JVM dumps unless evidence points there.

---

# 4. Spring Boot Startup Flow

High-level startup flow:

1. JVM starts.
2. Main class executes.
3. SpringApplication initializes.
4. Environment/configuration is loaded.
5. Component scanning occurs.
6. Beans are created.
7. Dependency Injection happens.
8. Auto-configuration is applied.
9. Embedded server starts.
10. Application context becomes ready.
11. Health endpoints begin reporting state.
12. Application starts serving requests.

## Interview Value

If startup fails, ask:

> **At which stage did startup fail?**

That immediately makes troubleshooting more precise.

---

# 5. Common Spring Boot Startup Failures

Typical causes:

- Port already in use
- Missing environment variable
- Invalid configuration
- Missing secret
- Database unavailable
- Bean creation failure
- Circular dependency
- Missing dependency
- Classpath conflict
- Invalid certificate
- External service unavailable
- Migration failure
- Incorrect profile
- Permission problem

---

# 6. Strong Answer — “Spring Boot Application Is Not Starting. What Will You Check?”

Use:

`Startup Log → Error/Stack Trace → Configuration → Profile → Port → Dependency Injection → DB/External Dependencies → Secrets/Certificates → Deployment Environment`

## Suggested Answer

> “I would first identify where startup fails from the application logs and root exception rather than restarting repeatedly.
>
> Then I would validate the active profile and externalized configuration, required environment variables, secrets, port availability and dependency initialization.
>
> If the failure occurs during bean creation, I would inspect the root cause of the Dependency Injection or configuration problem. If startup depends on a database or external service, I would validate connectivity, credentials and schema/migration state.
>
> I would also compare the failing environment against a healthy environment to identify configuration or deployment differences.”

---

# 7. Configuration & Externalized Configuration

Spring Boot may read configuration from:

- `application.properties`
- `application.yml`
- Profile-specific files
- Environment variables
- Command-line arguments
- Config server / external configuration
- Kubernetes ConfigMaps
- Kubernetes Secrets
- Cloud configuration services

Production principle:

> **Code should not contain environment-specific secrets/configuration.**

---

# 8. Spring Profiles

Examples:

- `dev`
- `test`
- `qa`
- `prod`

Profiles can affect:

- DB URLs
- Credentials
- APIs
- Logging
- Feature behavior
- Bean configuration

Common problem:

Application works locally but production activates the wrong profile or has incomplete production configuration.

---

# 9. “Works Locally but Fails in Production”

High-probability scenario.

Check:

- Active profile
- Environment variables
- Secrets
- DB connectivity
- DNS
- TLS/certificate
- Firewall
- Network policy
- API endpoint
- Permission
- File path
- Case sensitivity
- Resource limits
- Proxy
- Load balancer
- Kubernetes config
- Java version
- Dependency/version mismatch

## Strong Answer

> “When something works locally but fails in production, I first compare environment-specific differences rather than assuming the code is wrong. I check active profile, externalized configuration, credentials, network/DNS, certificates, dependencies, runtime version, resource constraints and production-only security policies.”

---

# 10. Dependency Injection Failures

Common causes:

- Bean missing
- Multiple candidate beans
- Circular dependency
- Configuration class not loaded
- Component outside scan path
- Profile mismatch
- Failed bean initialization
- External dependency failure during bean creation

Important:

Read the **root cause**, not only the top-level `BeanCreationException`.

---

# 11. Database Connectivity Troubleshooting

Check:

- JDBC URL
- Host
- Port
- DNS
- Credentials
- TLS
- Firewall
- DB availability
- Driver
- Pool configuration
- Schema
- Migration
- Connection timeout

Useful distinction:

**Cannot connect at all** vs **can connect but requests are slow**.

---

# 12. Connection Pool Fundamentals

Applications usually reuse DB connections through a pool.

Common Spring Boot pool:

- HikariCP

Key concepts:

- Maximum pool size
- Minimum idle
- Connection timeout
- Idle timeout
- Max lifetime

---

# 13. Connection Pool Exhaustion

Symptoms:

- Requests waiting
- Increased latency
- Timeouts
- Errors acquiring connections
- High pool utilization
- Threads blocked waiting for DB connection

Possible root causes:

- Slow queries
- Long transactions
- Connections not returned
- Traffic spike
- Pool too small
- DB capacity issue
- Downstream DB lock

## Strong Troubleshooting Flow

1. Check API latency.
2. Check error logs.
3. Check pool metrics.
4. Check active vs idle connections.
5. Check DB query latency.
6. Check thread state.
7. Check transaction duration.
8. Check leaks/unreleased connections.
9. Validate cause before changing pool size.

Important:

> **Increasing pool size is not automatically the fix.**

---

# 14. Spring Boot Actuator

Actuator provides production-oriented endpoints.

Common areas:

- Health
- Metrics
- Info
- Environment
- Beans
- Loggers
- Thread dump
- Mappings

Security warning:

Do not expose sensitive actuator endpoints publicly without proper controls.

---

# 15. Health vs Readiness vs Liveness

## Health

General application/dependency status.

## Liveness

Is the process alive?

If failed repeatedly, orchestrator may restart it.

## Readiness

Can the application receive traffic?

If not ready, remove it from service traffic.

### Important Interview Distinction

An application can be:

- Alive
- But not ready

Example:

Process is running, but critical database dependency is unavailable.

---

# 16. Logging Strategy

Useful logs include:

- Startup logs
- Configuration errors
- Exceptions
- Request logs
- Dependency errors
- DB errors
- Security/auth errors

Good production logging should support:

- Correlation ID
- Request ID
- Service name
- Timestamp
- Severity
- Context

Avoid logging sensitive data.

---

# 17. Application Server Concepts

Spring Boot commonly uses embedded servers such as:

- Tomcat
- Jetty
- Undertow

Enterprise environments may also involve application servers such as:

- WildFly
- WebLogic
- WebSphere

Interview level:

Understand:

- Port
- Thread pool
- Connector
- Deployment
- Logs
- Resource configuration
- JNDI in traditional environments
- Health

Do not spend interview preparation time memorizing server administration commands unless the client explicitly requires them.

---

# 18. Port Conflict Scenario

Symptom:

Application startup fails.

Possible message:

> Address already in use

Check:

- Configured server port
- Existing process
- Multiple instances
- Container port mapping
- Kubernetes service/deployment config

Resolution:

- Stop conflicting process
- Correct port
- Correct deployment configuration

---

# 19. Dependency / Classpath Conflict

Symptoms:

- `ClassNotFoundException`
- `NoClassDefFoundError`
- `NoSuchMethodError`
- Startup failure
- Runtime incompatibility

Possible causes:

- Missing dependency
- Multiple incompatible versions
- Packaging issue
- Wrong artifact
- Library upgrade incompatibility

Troubleshooting:

- Inspect dependency tree
- Compare build artifact
- Validate runtime Java/framework version
- Reproduce in clean environment

---

# 20. Java Version Compatibility

Check:

- Build JDK
- Runtime JDK
- Framework compatibility
- Library compatibility
- Container image

Example:

Application compiled for a newer Java version than production runtime.

---

# 21. Slow Spring Boot Application

Use Module 03 framework.

Check:

- Request rate
- Error rate
- Latency
- Recent deployment
- Traces
- DB
- Downstream APIs
- Connection pool
- Thread pool
- CPU
- Memory
- GC
- Locks
- Kubernetes resource limits

Start application-level, then move to JVM-level if needed.

---

# 22. High Error Rate

Check:

- HTTP status distribution
- Specific endpoint
- Recent deployment
- Exception pattern
- Dependency status
- DB
- Authentication
- Rate limiting
- Validation
- Resource saturation

---

# 23. HTTP 500 from Spring Boot

500 is symptom.

Check:

- Stack trace
- Controller/service error
- Null/state issue
- DB failure
- Dependency timeout
- Serialization
- Configuration
- uncaught exception

Avoid:

> “500 means server problem.”

Be specific.

---

# 24. Spring Boot Application Returns 503

Possible causes:

- Application not ready
- Gateway sees no healthy instance
- Kubernetes readiness failing
- Overload
- Dependency unavailable
- Circuit breaker
- Deployment issue

Check:

`Gateway → Service → Pod → Readiness → Application → Dependency`

---

# 25. Deployment Troubleshooting

Check:

- Artifact/image version
- Environment variables
- Secrets
- ConfigMap
- Port
- Probe
- Java version
- Startup logs
- DB migration
- Permissions
- Resource limits
- Network
- Certificate

Compare:

> **Last known good deployment vs failing deployment**

---

# 26. Rolling Deployment Scenario

Possible issue:

New version fails readiness.

Result:

- Old instances may still serve traffic.
- New instances repeatedly fail.
- Deployment may stall.

Check:

- Readiness probe
- Startup time
- Config
- migration
- dependency
- resource

---

# 27. DB Migration Failure

Examples:

- Flyway
- Liquibase

Possible causes:

- Permission issue
- Schema conflict
- Failed previous migration
- Incompatible change
- Lock
- DB unavailable

Important:

Do not blindly rerun migrations in production.

---

# 28. Spring Boot Security / Authentication Failure

Check:

- Token validity
- Issuer/audience
- Certificate
- Identity provider availability
- Secret
- Clock/time
- Role/permission
- Gateway behavior

Differentiate:

- 401 — authentication
- 403 — authorization

---

# 29. Timeouts

Timeout can occur at:

- Client
- Gateway
- Application
- DB
- External API
- Queue
- Network

Do not increase timeout first.

Ask:

> **Why is the operation taking too long?**

---

# 30. Retry Problems

Retries can help transient failures.

But bad retries can create:

- Retry storm
- Increased load
- Duplicate processing
- Longer latency

Combine with:

- Backoff
- Jitter
- Idempotency
- Circuit breaker

---

# 31. Application-Level vs JVM-Level Issue

## Application-Level Examples

- Wrong configuration
- DB credentials
- Bean failure
- API error
- SQL issue
- Connection pool
- Deployment configuration

## JVM-Level Examples

- GC pressure
- Memory leak
- Deadlock
- Thread starvation
- OOM
- JVM CPU issue

Strong troubleshooting means knowing **when to move deeper**.

---

# 32. Strong Answer — “How Do You Troubleshoot a Slow Java Application?”

> “I would first establish scope and business impact, check recent changes, then look at request latency, error rate and traces to see where time is being spent.
>
> I would validate database and downstream dependencies, including connection-pool utilization and query latency.
>
> If dependencies are healthy but application resources show pressure, I would investigate JVM behavior such as CPU, threads, heap and GC.
>
> I would form a hypothesis from the evidence, validate it, mitigate safely, confirm recovery and then perform RCA.”

---

# 33. Strong Answer — “How Do You Use Actuator in Production?”

> “I use Actuator as an operational interface for health and metrics, and where appropriate for diagnostics. I would expose only required endpoints and secure sensitive ones. Health/readiness information is useful for load balancers and orchestrators, while metrics support troubleshooting and capacity analysis.”

---

# 34. Strong Answer — “How Do You Troubleshoot BeanCreationException?”

> “I would read down to the root cause rather than stop at BeanCreationException. Then I would determine whether it is missing configuration, missing bean, circular dependency, profile issue, failed external dependency or initialization error. The root exception and bean creation chain usually identify the failing component.”

---

# 35. Corporate Training Angle

Teach Spring Boot operations through failures.

Do not only show a healthy application.

### Signature Lab Pattern

`Healthy App → Inject Failure → Observe Startup/Runtime Symptom → Collect Logs/Metrics → Diagnose → Resolve → Validate → RCA`

---

# 36. Lab 1 — Wrong Database Password

## Failure

Invalid DB credential.

## Symptoms

- Startup failure or runtime DB error
- Authentication error in logs

## Learner Tasks

- Identify failing layer.
- Check logs.
- Verify configuration source.
- Correct secret.
- Restart/deploy.
- Validate health.

### Learning

Configuration vs code failure.

---

# 37. Lab 2 — Wrong Active Profile

## Failure

Production starts with incorrect profile.

## Symptoms

- Wrong DB/API
- Missing config
- unexpected behavior

## Learning

Externalized config and environment parity.

---

# 38. Lab 3 — Connection Pool Exhaustion

## Failure

Slow query or constrained pool.

## Evidence

- Pool metrics
- latency
- thread waiting
- DB metrics

## Learning

Immediate mechanism vs root cause.

---

# 39. Lab 4 — Readiness Failure

## Failure

Critical dependency unavailable.

## Symptoms

- App process alive
- readiness unhealthy
- traffic not routed

## Learning

Liveness vs readiness.

---

# 40. Lab 5 — Dependency Version Conflict

## Failure

Incompatible dependency introduced.

## Symptoms

- `NoSuchMethodError`
- startup/runtime failure

## Learning

Build/runtime dependency diagnosis.

---

# 41. Whiteboard — Spring Boot Production Flow

```text
             CLIENT
                |
           API GATEWAY
                |
          SPRING BOOT APP
                |
      +---------+---------+
      |         |         |
 Controller   Service   Security
                |
      +---------+---------+
      |                   |
     DB                External API
      |
 Connection Pool
                |
          SPRING CONTAINER
                |
               JVM
                |
        Container / K8s
```

Troubleshoot from the symptom toward the failing layer.

---

# 42. 30-Second Explain-on-Demand

> “For Spring Boot operations I separate application concerns from runtime concerns. I first check startup/configuration, Actuator health, logs, dependencies and connection pools. Only when evidence points deeper do I move into JVM analysis such as threads, heap or GC.”

---

# 43. 5-Minute Trainer Demo Topic

### Topic

**Connection Pool Exhaustion**

Use:

1. What connection pool is.
2. Why applications reuse DB connections.
3. Healthy pool.
4. Symptoms of exhaustion.
5. Possible causes.
6. Evidence.
7. Why increasing pool size is not automatically the fix.
8. RCA/prevention.

---

# 44. High-Probability Interview Questions

Prepare:

1. Explain Spring Boot startup.
2. How do profiles work?
3. How do you manage production configuration?
4. Application is not starting — what do you check?
5. What is Spring Boot Actuator?
6. Health vs readiness vs liveness?
7. What is connection pooling?
8. What causes pool exhaustion?
9. How do you troubleshoot DB connectivity?
10. What is BeanCreationException?
11. Application works locally but not production — why?
12. What causes `ClassNotFoundException`?
13. What causes `NoSuchMethodError`?
14. How do you troubleshoot a slow Java app?
15. What is the role of embedded Tomcat?
16. What do you check after deployment failure?
17. How do you troubleshoot HTTP 500?
18. How do you troubleshoot 503?
19. How do you handle DB migration failures?
20. When do you move from application diagnostics to JVM diagnostics?
21. How would you teach Spring Boot operations practically?
22. How would you design a failure lab?

---

# 45. Cross-Question Drill

## Q1. Why not just increase connection pool size?

Because the root cause may be slow queries, leaked connections, long transactions, or DB capacity. Larger pool can worsen DB pressure.

## Q2. Is liveness dependent on DB?

Usually liveness should indicate whether the process itself is functioning; making it dependent on every external service can cause restart loops. Readiness is more appropriate for traffic eligibility.

## Q3. Actuator health is UP but users still see errors. Why?

Health may not test every request path or downstream behavior. Check metrics, traces, endpoint-specific failures and dependencies.

## Q4. Application fails only in production. Is it always config?

No. Environment differences include runtime version, network, security, certificate, traffic, resource limits and dependencies.

## Q5. Restart fixed the issue. Is the incident closed?

No. Restart is mitigation. Preserve evidence and identify recurrence/root cause.

## Q6. Why inspect root exception?

Top-level Spring exceptions are often wrappers. Root cause identifies the actual failing bean/config/dependency.

## Q7. What is the difference between connection timeout and query timeout?

Connection timeout relates to acquiring/establishing a DB connection; query timeout relates to execution duration after connection acquisition.

## Q8. Why can excessive retries hurt?

They amplify load and can turn transient failures into system-wide overload.

---

# 46. Real Experience Mapping

Prepare truthful examples involving:

- Java/backend application work
- Production issue
- API issue
- DB issue
- Deployment issue
- Security remediation
- Code review
- Azure/cloud
- Kubernetes
- Messaging/integration

Use:

`Situation → Impact → Evidence → Diagnosis → Action → Result → Prevention`

---

# 47. Red Flags

Do not:

- Explain Spring annotations for 10 minutes when asked about operations.
- Say restart is the first troubleshooting step.
- Increase pool size without root-cause analysis.
- Expose all Actuator endpoints publicly.
- Confuse readiness with liveness.
- Assume HTTP 500 identifies the root cause.
- Jump to heap dump for every slow request.
- Blame JVM before checking dependencies.
- Ignore deployment/config differences.
- Claim deep WebLogic/WebSphere administration if not true.

---

# 48. Quick Revision

Remember:

## Startup
**Config → Beans → Dependencies → Server → Ready**

## Production Evidence
**Logs → Metrics → Traces → Actuator**

## Common Failures
**Config → DI → DB → Pool → API → Deployment → Runtime**

## Application vs Runtime
**Spring problem first; JVM problem only when evidence points there.**

## Trainer Principle
**Show healthy behavior, break it, investigate it, fix it.**

---

# 49. Module 04 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Spring Boot startup | 4+ | |
| Configuration/profiles | 5 | |
| Startup troubleshooting | 5 | |
| DI failure reasoning | 4+ | |
| DB troubleshooting | 5 | |
| Connection pools | 5 | |
| Actuator | 5 | |
| Health/readiness/liveness | 5 | |
| Deployment troubleshooting | 4+ | |
| Production-only failure | 5 | |
| Slow app troubleshooting | 5 | |
| Application vs JVM distinction | 5 | |
| Whiteboard explanation | 4+ | |
| Practical lab design | 5 | |
| Cross-question survival | 4+ | |
| Trainer confidence | 4+ | |

---

# 50. Module 04 Readiness Gate

## PASS only when you can:

- Explain Spring Boot startup without notes.
- Troubleshoot a failed startup.
- Explain profiles/externalized config.
- Explain and diagnose connection pool exhaustion.
- Explain Actuator.
- Distinguish health/readiness/liveness.
- Troubleshoot “works locally but fails in production.”
- Explain deployment failures.
- Distinguish application-level from JVM-level issues.
- Handle a slow Java application scenario.
- Design at least three practical labs.
- Draw the Spring Boot production flow.
- Survive at least 10 follow-up questions.

### Minimum Score

**All critical dimensions ≥ 4/5**

If answers drift into framework theory without production reasoning, Module 04 remains **BLOCKED**.

---

# 51. Final Module Outcome

After this module, the panel should think:

> **“He can operate, troubleshoot, explain and teach Spring Boot applications in realistic production environments, and he knows when application-level analysis should transition into JVM diagnostics.”**

That is the selection goal for Module 04.
