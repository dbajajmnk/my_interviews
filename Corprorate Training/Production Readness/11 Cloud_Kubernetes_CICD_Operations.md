# iRun Corporate Training Interview Preparation
## Module 11 — Cloud, Kubernetes & CI/CD Operations

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Strong Working Readiness  
**Primary Goal:** Demonstrate strong cloud-native application operations knowledge across Kubernetes, containers, deployment troubleshooting, resource constraints, health probes, CI/CD failures, configuration, secrets, and rollback strategy.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain how a containerized application is deployed and exposed in Kubernetes.
- Explain Pods, Deployments, Services, ConfigMaps, and Secrets.
- Explain liveness and readiness probes.
- Troubleshoot CrashLoopBackOff.
- Explain OOMKilled.
- Troubleshoot resource-limit problems.
- Use logs and events to diagnose failures.
- Explain rollout and rollback.
- Troubleshoot CI/CD pipeline failures.
- Distinguish application, container, cluster, and pipeline problems.
- Explain common environment/configuration issues.
- Design practical Kubernetes troubleshooting labs.
- Whiteboard a cloud-native request flow.
- Survive likely follow-up questions.

The panel should think:

> **“He understands cloud-native application operations end-to-end and can troubleshoot deployments using evidence rather than assumptions.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- Containers
- Kubernetes architecture
- Pods
- Deployments
- ReplicaSets
- Services
- ConfigMaps
- Secrets
- Namespaces
- Liveness probes
- Readiness probes
- CrashLoopBackOff
- OOMKilled
- Resource requests
- Resource limits
- Logs
- Events
- Rolling deployments
- Rollback
- CI/CD pipelines
- Deployment failures
- Environment-specific configuration
- Secret/certificate problems
- Cloud-native troubleshooting
- Trainer lab design

---

# 3. Kubernetes Mental Model

Use:

```text
CLIENT
  |
LOAD BALANCER / INGRESS
  |
SERVICE
  |
POD
  |
CONTAINER
  |
APPLICATION
  |
DEPENDENCIES
DB / API / QUEUE
```

Behind the Pod:

```text
DEPLOYMENT
   |
REPLICASET
   |
PODS
```

---

# 4. What Is a Pod?

A Pod is the smallest deployable unit in Kubernetes.

It contains one or more containers that share:

- Network namespace
- Storage volumes
- Lifecycle context

Operationally:

> Troubleshoot the Pod first when one instance behaves differently.

---

# 5. Deployment

A Deployment manages desired application replicas and rolling updates.

Responsibilities:

- Desired replica count
- Rollouts
- Rollbacks
- Image version
- Pod template

Strong answer:

> “A Deployment declares the desired state of application Pods and manages ReplicaSets to maintain availability during updates.”

---

# 6. ReplicaSet

A ReplicaSet ensures the requested number of Pod replicas exist.

Usually managed by a Deployment rather than directly.

---

# 7. Service

A Kubernetes Service provides stable network access to a set of Pods.

Common types:

- ClusterIP
- NodePort
- LoadBalancer

Interview depth:

Focus on stable service discovery and load distribution.

---

# 8. ConfigMap

Used for non-sensitive configuration.

Examples:

- Feature flags
- Service URLs
- App settings

Do not store secrets in ConfigMap.

---

# 9. Secret

Used for sensitive configuration such as:

- Password
- Token
- Certificate
- Connection secret

Operational caution:

Secrets still require proper access control and secure handling.

---

# 10. ConfigMap vs Secret

Simple:

- **ConfigMap = non-sensitive config**
- **Secret = sensitive config**

Do not overcomplicate.

---

# 11. Liveness Probe

Answers:

> **Is the application process alive?**

If liveness fails repeatedly, Kubernetes may restart the container.

Use carefully.

Bad liveness probe can cause restart loops.

---

# 12. Readiness Probe

Answers:

> **Can the application safely receive traffic?**

If readiness fails:

- Pod remains running
- traffic should be removed from it

This distinction is critical.

---

# 13. Liveness vs Readiness

Strong answer:

> “Liveness is about whether the process should be restarted; readiness is about whether it should receive traffic. A service can be alive but not ready.”

---

# 14. Startup Probe

Useful for applications that take longer to initialize.

Purpose:

Prevent liveness checks from killing a slow-starting application too early.

Interview depth:

Know why it exists.

---

# 15. CrashLoopBackOff

CrashLoopBackOff means a container repeatedly starts and crashes.

Common causes:

- Application startup error
- Missing configuration
- Missing secret
- Wrong port
- DB unavailable
- Permission issue
- bad command/entrypoint
- OOM
- failed health checks
- incompatible image/runtime

---

# 16. Strong Answer — “How Do You Troubleshoot CrashLoopBackOff?”

Use:

`Pod Status → Previous Logs → Events → Exit Code → Config/Secret → Dependency → Probe → Resource`

Suggested answer:

> “I would first inspect the Pod status, container exit reason, previous container logs and Kubernetes events. Then I would validate environment variables, ConfigMaps, Secrets, startup command, dependencies, probes and resource limits. I would avoid restarting repeatedly because Kubernetes is already doing that; the goal is to identify why the process exits.”

---

# 17. OOMKilled

OOMKilled means the container exceeded its memory limit and was terminated.

Check:

- Pod termination reason
- Container memory limit
- Process RSS
- JVM/.NET/Node heap
- Native memory
- workload
- memory leak

Important:

> OOMKilled is a platform-level termination signal, not necessarily Java heap OOM.

---

# 18. Requests vs Limits

## Requests

Resources Kubernetes uses for scheduling.

## Limits

Maximum resources container is allowed to use.

CPU and memory behave differently.

---

# 19. CPU Limit

If application exceeds CPU limit, it may be throttled rather than killed.

Symptoms:

- Increased latency
- reduced throughput
- CPU appears capped

---

# 20. Memory Limit

If container exceeds memory limit:

- can be killed

Symptoms:

- restart
- OOMKilled
- intermittent failure

---

# 21. Strong Answer — “Pod Is Slow but CPU Is Only at Its Limit. Why?”

> “The container may be CPU-throttled. I would compare application demand, CPU request/limit, throttling metrics, latency and workload. CPU at the limit does not mean the host is out of CPU; it may mean the container is constrained by its configured limit.”

---

# 22. Kubernetes Logs

Useful for:

- Application startup
- Runtime errors
- Dependency failures
- configuration issues

Key operational need:

- current logs
- previous container logs after restart

---

# 23. Kubernetes Events

Events can reveal:

- Scheduling failure
- Image pull failure
- Probe failures
- OOM
- Volume problem
- Secret/config issue

Logs and events answer different questions.

---

# 24. ImagePullBackOff

Possible causes:

- Wrong image/tag
- Registry auth
- Network
- image missing
- rate limit
- secret issue

---

# 25. Pending Pod

Possible causes:

- Insufficient CPU/memory
- node selector
- affinity
- taint/toleration
- volume
- quota

Start with events.

---

# 26. Service Not Reachable

Check:

- Service selector
- Endpoints
- Pod readiness
- target port
- network policy
- DNS
- ingress/load balancer

---

# 27. Kubernetes DNS

Applications usually access services by DNS names.

Possible issues:

- wrong service name
- namespace mismatch
- DNS failure
- network policy

---

# 28. Ingress / Load Balancer

Common responsibilities:

- external routing
- TLS
- host/path rules
- traffic distribution

Failures:

- wrong path
- wrong backend
- TLS
- no healthy endpoints
- timeout

---

# 29. Rolling Deployment

Deployment updates Pods gradually.

Goals:

- Maintain availability
- reduce downtime
- validate new version

Operational risk:

- readiness failures
- incompatible config
- migration issue
- resource issue

---

# 30. Rollback

Rollback is a valid mitigation when:

- Incident correlates strongly with new deployment
- Previous version is known healthy
- Rollback is safe

Do not wait too long during severe customer impact.

---

# 31. Strong Answer — “When Would You Roll Back?”

> “If production degradation clearly correlates with a new release and a known-good version is available, rollback is often the fastest safe mitigation. I would still preserve evidence and investigate root cause afterward.”

---

# 32. Deployment Failure Checklist

Check:

- Image/version
- ConfigMap
- Secret
- Port
- Probe
- Environment variables
- Runtime version
- DB migration
- dependency
- certificate
- resource limit
- network policy
- permission

---

# 33. CI/CD Pipeline Mental Model

```text
CODE
  |
BUILD
  |
TEST
  |
SECURITY / QUALITY
  |
PACKAGE / IMAGE
  |
PUBLISH
  |
DEPLOY
  |
VALIDATE
  |
PROMOTE
```

Failures can occur at every stage.

---

# 34. Build Failure

Possible:

- compile error
- dependency
- test
- version
- toolchain
- missing secret

---

# 35. Test Failure

Could be:

- code regression
- flaky test
- environment
- dependency
- test data

Do not bypass tests blindly.

---

# 36. Security/Quality Gate Failure

Examples:

- vulnerability
- code scan
- policy
- license
- quality threshold

Strong answer:

> “I treat gate failure as evidence to resolve, not as an inconvenience to disable.”

---

# 37. Package / Image Failure

Check:

- Dockerfile
- base image
- dependency
- registry
- image size
- architecture
- tag

---

# 38. Deployment Stage Failure

Check:

- credentials
- cluster access
- manifest/Helm
- namespace
- quota
- image
- config
- secret
- readiness

---

# 39. Post-Deployment Validation

Validate:

- health
- readiness
- error rate
- latency
- logs
- business transaction
- dependencies

Do not consider pipeline successful merely because deployment command completed.

---

# 40. Environment Promotion

Typical flow:

`Dev → Test → QA → Stage → Production`

Key principle:

- Same artifact
- Environment-specific config externalized

Avoid rebuilding different binaries per environment where possible.

---

# 41. Secrets in CI/CD

Never hardcode secrets.

Use:

- Secret store
- secured variables
- managed identity
- vault

Restrict access.

---

# 42. Certificate Problems

Check:

- expiry
- hostname
- trust
- private key
- mounted secret
- rotation

Can break:

- ingress
- service-to-service TLS
- external API

---

# 43. “Works in Dev but Fails in Kubernetes”

Check:

- environment variables
- port
- config
- secret
- DNS
- network policy
- filesystem
- read-only filesystem
- resource
- health probes
- container image
- runtime version

---

# 44. Scenario 1 — CrashLoopBackOff

Evidence:

- previous logs
- exit code
- events

Possible root:

- missing secret

Trainer angle:

Show why restart is useless.

---

# 45. Scenario 2 — OOMKilled

Evidence:

- Pod reason
- memory metrics
- process RSS
- app runtime memory

Question:

Is limit too low, workload high, or application leaking?

---

# 46. Scenario 3 — Pod Running but No Traffic

Check:

- readiness
- Service selector
- endpoints
- target port
- ingress
- network policy

---

# 47. Scenario 4 — New Deployment Partially Failing

Check:

- old vs new ReplicaSet
- version-specific logs
- readiness
- config
- traffic split

Rollback if required.

---

# 48. Scenario 5 — ImagePullBackOff

Check:

- image name/tag
- registry
- auth secret
- network

---

# 49. Scenario 6 — Pipeline Green but Users See Errors

Possible:

- inadequate post-deploy validation
- health check too shallow
- business path not tested
- dependency issue

Lesson:

> Deployment success != production success.

---

# 50. Scenario 7 — CPU Throttling

Symptoms:

- latency
- CPU capped
- app otherwise healthy

Check:

- CPU limit
- throttling
- workload

---

# 51. Scenario 8 — Secret Rotation Breaks App

Check:

- secret update
- pod reload behavior
- credential validity
- dependency
- rollout

---

# 52. Corporate Training Angle

Kubernetes training should not be YAML memorization.

Teach:

`Symptom → Pod/Service State → Logs/Events → Config/Secret → Probe → Resource → Dependency → Fix`

---

# 53. Lab 1 — CrashLoopBackOff

Inject:

- wrong environment variable

Learners:

- inspect status
- previous logs
- events
- correct config
- redeploy
- validate

---

# 54. Lab 2 — Readiness Failure

Inject:

- DB unavailable

Learners:

- app running
- readiness fails
- service removes endpoint
- diagnose dependency
- restore
- validate traffic

---

# 55. Lab 3 — OOMKilled

Inject:

- small memory limit

Learners:

- observe restart
- inspect reason
- compare limit vs process memory
- adjust/fix
- validate

---

# 56. Lab 4 — ImagePullBackOff

Inject:

- wrong registry secret

Learners:

- events
- image reference
- secret
- fix
- validate

---

# 57. Lab 5 — Broken Rollout

Inject:

- new version fails readiness

Learners:

- inspect Deployment
- compare ReplicaSets
- rollback
- investigate root cause

---

# 58. Lab 6 — CI/CD Gate Failure

Inject:

- vulnerability/quality issue

Learners:

- identify failing gate
- fix
- re-run
- do not bypass

---

# 59. Whiteboard — Cloud-Native Request Flow

```text
                 CLIENT
                    |
            INGRESS / LB
                    |
                 SERVICE
                    |
                 POD(S)
                    |
              CONTAINER
                    |
              APPLICATION
                    |
       +------------+------------+
       |            |            |
      DB           API          QUEUE
                    |
             OBSERVABILITY
          Logs / Metrics / Events
                    |
             DEPLOYMENT / CI-CD
```

---

# 60. 30-Second Explain-on-Demand

> “For Kubernetes incidents I first identify whether the problem is at deployment, Pod, service, configuration, resource, or dependency level. I use Pod state, previous logs, events, readiness, resource metrics and service endpoints to narrow the failing layer before changing anything.”

---

# 61. 5-Minute Trainer Demo

### Topic

**CrashLoopBackOff**

Structure:

1. What it means.
2. Why Kubernetes retries.
3. Check Pod status.
4. Previous logs.
5. Events.
6. Exit reason.
7. Common causes.
8. Example missing secret.
9. Fix and validate.
10. Key takeaway.

---

# 62. High-Probability Interview Questions

1. What is a Pod?
2. What is a Deployment?
3. What is a ReplicaSet?
4. What is a Service?
5. ConfigMap vs Secret?
6. Liveness vs readiness?
7. What is startup probe?
8. What is CrashLoopBackOff?
9. How do you troubleshoot it?
10. What is OOMKilled?
11. Requests vs limits?
12. What is CPU throttling?
13. What is ImagePullBackOff?
14. Why is Pod Pending?
15. How do you troubleshoot service connectivity?
16. What are Kubernetes events?
17. Rolling update?
18. Rollback?
19. When would you rollback?
20. How do you troubleshoot deployment failure?
21. Pipeline stages?
22. Build vs deploy failure?
23. What is post-deploy validation?
24. How do you handle secrets?
25. Why app works in dev but not Kubernetes?
26. How would you teach Kubernetes operations?
27. Design a Kubernetes lab.

---

# 63. Cross-Question Drill

## Q1. Pod is Running. Is application healthy?

Not necessarily. Check readiness, application health, errors, and business path.

## Q2. Can readiness failure restart Pod?

Normally readiness removes traffic; liveness triggers restart behavior.

## Q3. Is OOMKilled always a memory leak?

No. Limit may be too low, workload may spike, or native/runtime memory may grow.

## Q4. Why not set very high resource limits?

It can reduce scheduling efficiency and hide capacity/design issues.

## Q5. Is rollback failure?

No. It is responsible mitigation when a deployment causes impact.

## Q6. Pipeline succeeded. Is release successful?

Only after production validation confirms health and business behavior.

## Q7. Can ConfigMap store passwords?

Technically possible, but should not. Use Secret/secure vault mechanisms.

## Q8. Why inspect previous logs?

Current container may have restarted; previous logs show the crash.

## Q9. Service exists but no traffic reaches Pod?

Check selector/endpoints/readiness/ports/network policy.

## Q10. Should health probe call every dependency?

Not always. Poor liveness design can cause cascading restart loops.

---

# 64. Real Experience Mapping

Prepare truthful examples related to:

- Azure
- Kubernetes
- Containers
- CI/CD
- Deployment
- Config/secrets
- Application troubleshooting
- Resource issues
- Vulnerability/security gates
- Rollback/change management

Use:

`Situation → Impact → Platform Evidence → Diagnosis → Action → Validation → Prevention`

---

# 65. Red Flags

Do not:

- Say Running Pod means healthy app.
- Confuse liveness and readiness.
- Restart CrashLoopBackOff manually without diagnosis.
- Treat OOMKilled as Java heap OOM automatically.
- Ignore previous logs/events.
- Set huge resources as default fix.
- Bypass security/quality gates.
- Treat pipeline completion as production success.
- Store secrets in code.
- Roll out without rollback plan.
- Turn Kubernetes interview into YAML syntax discussion.

---

# 66. Quick Revision

## Kubernetes Flow

**Deployment → ReplicaSet → Pod → Container → App**

## Traffic

**Ingress → Service → Ready Pod**

## Health

**Liveness = restart?**  
**Readiness = receive traffic?**

## Failure Evidence

**Status → Previous Logs → Events → Config → Probe → Resource → Dependency**

## CI/CD

**Build → Test → Scan → Package → Deploy → Validate → Promote**

## Golden Rule

> **In Kubernetes, state + events + logs + readiness usually tell you where to look first.**

---

# 67. Module 11 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Pod/Deployment/ReplicaSet | 4+ | |
| Service | 4+ | |
| ConfigMap/Secret | 5 | |
| Liveness/readiness | 5 | |
| Startup probe | 4+ | |
| CrashLoopBackOff | 5 | |
| OOMKilled | 5 | |
| Requests/limits | 4+ | |
| CPU throttling | 4+ | |
| Logs/events | 5 | |
| ImagePullBackOff | 4+ | |
| Service connectivity | 4+ | |
| Rollout/rollback | 5 | |
| Deployment troubleshooting | 5 | |
| CI/CD flow | 4+ | |
| Security/quality gates | 4+ | |
| Post-deploy validation | 5 | |
| Scenario handling | 4+ | |
| Whiteboard explanation | 4+ | |
| Lab design | 4+ | |
| Cross-question survival | 4+ | |

---

# 68. Module 11 Readiness Gate

## PASS only when you can:

- Explain Pod, Deployment, ReplicaSet, and Service.
- Explain ConfigMap vs Secret.
- Explain liveness, readiness, and startup probe.
- Troubleshoot CrashLoopBackOff.
- Explain OOMKilled.
- Explain resource requests/limits.
- Diagnose service connectivity.
- Use previous logs and events correctly.
- Explain rolling deployment and rollback.
- Explain CI/CD stages.
- Troubleshoot at least five deployment scenarios.
- Design at least three Kubernetes labs.
- Draw the cloud-native request flow.
- Survive at least 10 follow-up questions.

### Minimum Score

**P1 target average ≥ 3.5/5, with no critical dimension below 3.**

If answers become YAML-centric or restart-first without operational reasoning, Module 11 remains **BLOCKED**.

---

# 69. Final Module Outcome

After this module, the panel should think:

> **“He understands cloud-native application operations, can diagnose Kubernetes and deployment failures systematically, and can teach practical troubleshooting without turning the session into configuration memorization.”**

That is the selection goal for Module 11.
