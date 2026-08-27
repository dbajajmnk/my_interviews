# M08 — Docker, Kubernetes, CI/CD & MLOps
## AI & Data Campus Interview Preparation

**Interview:** 28 August 2026, 3:00 PM IST  
**Framework:** Standard Interview Preparation Framework  
**Module:** M08  
**Phase:** Phase 2 — AI & Data Engineering Depth  
**Priority:** P2 — Practical Understanding  
**Status:** Ready for Study / Practice

---

# 1. Module Objective

This module prepares you to explain, design, secure, deploy, observe, troubleshoot, and teach production delivery for AI/Data applications using:

- Docker
- Container registries
- Kubernetes
- AKS
- CI/CD
- Deployment strategies
- Rollback
- MLOps / LLMOps
- Model/prompt/config versioning
- Release gates
- Observability
- Security
- Cost and reliability controls

By the end of M08, you must be able to:

1. Explain why containers exist.
2. Explain Docker image vs container.
3. Explain Dockerfile and image layers.
4. Explain container registry.
5. Explain core Kubernetes objects.
6. Explain AKS at architect level.
7. Explain ConfigMaps, Secrets, probes, autoscaling.
8. Design a CI/CD pipeline.
9. Explain blue/green and canary deployments.
10. Explain rollback strategy.
11. Explain MLOps/LLMOps lifecycle.
12. Explain prompt/model/config versioning.
13. Define production release gates.
14. Troubleshoot common deployment failures.
15. Explain observability and cost controls.

---

# 2. Why Containers Exist

Traditional deployment problem:

```text
Works on Developer Laptop
        ↓
Fails in Test
        ↓
Different Runtime / Libraries / Config
```

Containers package:

```text
Application
+ Runtime
+ Dependencies
+ Configuration Expectations
```

into a portable execution unit.

---

# 3. Docker — What Is It?

Docker is a platform/tooling ecosystem for building, packaging, and running containerized applications.

Key concepts:

- Dockerfile
- Image
- Container
- Registry
- Volume
- Network

---

# 4. Image vs Container

## Image

Immutable package/template.

Think:

> "Application blueprint."

## Container

Running instance of an image.

Think:

> "Application process created from the blueprint."

---

# 5. Dockerfile

A Dockerfile contains instructions for building an image.

Example:

```dockerfile
FROM python:3.12-slim

WORKDIR /app

COPY requirements.txt .

RUN pip install --no-cache-dir -r requirements.txt

COPY . .

EXPOSE 8000

CMD ["python", "app.py"]
```

---

# 6. Docker Image Layers

Each build instruction can create a layer.

Benefits:

- caching,
- reuse,
- smaller incremental builds.

Bad Dockerfile ordering can invalidate cache unnecessarily.

---

# 7. Dockerfile Optimization

Prefer:

- small trusted base images,
- copy dependency files first,
- install dependencies before copying frequently changing source,
- use `.dockerignore`,
- avoid secrets in image,
- run as non-root where possible.

---

# 8. Multi-Stage Build

Useful to reduce image size.

Example:

```dockerfile
FROM node:20 AS build
WORKDIR /app
COPY . .
RUN npm ci && npm run build

FROM nginx:alpine
COPY --from=build /app/dist /usr/share/nginx/html
```

Benefits:

- smaller final image,
- fewer build dependencies,
- reduced attack surface.

---

# 9. Container Registry

Stores container images.

Examples:

- Azure Container Registry
- Docker Hub
- cloud registries

Typical flow:

```text
Code
 ↓
Build Image
 ↓
Scan
 ↓
Push Registry
 ↓
Deploy
```

---

# 10. Azure Container Registry

ACR provides private container image storage in Azure.

Use for:

- application images,
- versioned releases,
- AKS deployments.

Security:

- identity-based access,
- private networking where needed,
- image scanning policies/tooling.

---

# 11. Immutable Deployment Principle

Do not patch production containers manually.

Build a new versioned image.

Example:

```text
app:1.4.2
```

Deploy that image through controlled pipeline.

---

# 12. Why Kubernetes?

Containers solve packaging.

Kubernetes solves orchestration at scale:

- scheduling,
- self-healing,
- service discovery,
- scaling,
- rollout,
- configuration,
- health management.

---

# 13. Kubernetes Architecture

```text
              CONTROL PLANE
          ┌─────────────────────┐
          │ API Server          │
          │ Scheduler           │
          │ Controllers         │
          │ etcd                │
          └──────────┬──────────┘
                     │
             ┌───────┴────────┐
             │                │
          Worker Node      Worker Node
             │                │
           Pods             Pods
```

---

# 14. Pod

Smallest deployable Kubernetes unit.

A pod may contain one or more tightly coupled containers.

Most application deployments use one main application container per pod, plus sidecars where justified.

---

# 15. Deployment

A Deployment manages stateless application replicas and rolling updates.

```yaml
replicas: 3
```

If one pod dies, Kubernetes replaces it.

---

# 16. ReplicaSet

Deployment manages ReplicaSets, which ensure desired number of pod replicas.

Interview answer:

> "I normally manage ReplicaSets indirectly through Deployments."

---

# 17. Service

Pods are ephemeral.

A Service provides stable network access to a set of pods.

Common service types:

- ClusterIP
- NodePort
- LoadBalancer

---

# 18. ClusterIP

Internal cluster access.

Default service type.

---

# 19. LoadBalancer

Exposes service externally through cloud load balancer integration.

In enterprise setups, external traffic often comes through ingress/application gateway rather than exposing every service directly.

---

# 20. Ingress

Ingress routes HTTP/HTTPS traffic to services.

Useful for:

```text
/api → backend-service
/ui  → frontend-service
```

Often paired with an ingress controller.

---

# 21. ConfigMap

Stores non-secret configuration.

Examples:

- feature flags,
- URLs,
- environment values.

---

# 22. Secret

Stores sensitive values in Kubernetes abstraction.

But Kubernetes Secret by itself should not be assumed to solve full secret-security requirements.

Enterprise approach often integrates:

- Key Vault,
- workload identity,
- external secret provider.

---

# 23. Liveness Probe

Answers:

> "Should this container be restarted?"

If liveness fails repeatedly, Kubernetes restarts container.

---

# 24. Readiness Probe

Answers:

> "Should this pod receive traffic?"

If readiness fails, pod is removed from service endpoints.

---

# 25. Startup Probe

Useful when application takes long time to initialize.

Prevents premature liveness failures during startup.

---

# 26. Probe Interview Trap

Do not confuse readiness and liveness.

Strong answer:

> "Readiness protects traffic routing; liveness protects process health."

---

# 27. Resource Requests and Limits

Requests:

- scheduler uses to place pod.

Limits:

- maximum resource usage boundary.

Example:

```yaml
resources:
  requests:
    cpu: "500m"
    memory: "512Mi"
  limits:
    cpu: "1"
    memory: "1Gi"
```

---

# 28. Why Requests Matter

Without realistic requests:

- poor scheduling,
- noisy neighbors,
- unstable capacity planning.

---

# 29. OOMKilled

If container exceeds memory limit, it may be killed.

Troubleshoot:

- memory leak,
- too-low limit,
- large model/process,
- unbounded cache,
- oversized payload.

---

# 30. Horizontal Pod Autoscaler

HPA scales pod replicas based on metrics.

Example:

```text
CPU > threshold
    ↓
Increase replicas
```

Can also use custom/external metrics.

---

# 31. Cluster Autoscaler

Adds/removes worker nodes when pods cannot be scheduled due to capacity.

---

# 32. HPA vs Cluster Autoscaler

HPA:

> More pods.

Cluster Autoscaler:

> More nodes.

They solve different layers.

---

# 33. AKS

Azure Kubernetes Service is Microsoft's managed Kubernetes offering.

Azure manages much of control-plane operations.

You still own:

- workloads,
- container security,
- networking design,
- resource policy,
- observability,
- configuration,
- application reliability.

---

# 34. AKS Security

Consider:

- Microsoft Entra integration,
- workload identity,
- RBAC,
- network policies,
- private cluster,
- Key Vault integration,
- image security,
- pod security,
- least privilege.

---

# 35. Workload Identity

Prefer identity-based access over embedded client secrets.

Pattern:

```text
Pod
 ↓
Workload Identity
 ↓
Azure Resource
```

Examples:

- Key Vault,
- Storage,
- other Azure services.

---

# 36. Persistent Storage

Stateless app containers should not rely on local container filesystem for durable data.

Use:

- managed database,
- object storage,
- persistent volumes where required.

---

# 37. StatefulSet

Used for stateful workloads requiring:

- stable identities,
- ordered deployment,
- persistent storage relationships.

Do not use StatefulSet for every database blindly; managed databases may be operationally better.

---

# 38. Job

Kubernetes Job executes finite work.

Example:

- data migration,
- batch process.

---

# 39. CronJob

Schedules Jobs.

Example:

- nightly cleanup.

---

# 40. Rolling Update

Kubernetes Deployment can gradually replace old pods with new pods.

Benefits:

- reduced downtime.

Need:

- readiness checks,
- compatible versions,
- rollback.

---

# 41. Blue/Green Deployment

Two full environments:

```text
Blue = Current
Green = New
```

Switch traffic after validation.

Pros:

- fast rollback.

Cons:

- more infrastructure cost.

---

# 42. Canary Deployment

Send small percentage of traffic to new version.

Example:

```text
95% → v1
5%  → v2
```

Monitor:

- errors,
- latency,
- quality.

Then increase gradually.

---

# 43. Canary for AI

For AI systems, monitor more than HTTP success.

Also monitor:

- groundedness,
- tool success,
- evaluation score,
- token cost,
- unsafe-output rate.

---

# 44. Rollback

Rollback must be planned before release.

Version:

- image,
- config,
- prompt,
- model,
- schema,
- graph/workflow.

---

# 45. Database Migration Risk

Application rollback may fail if database schema change is incompatible.

Use backward-compatible migration patterns.

Example:

```text
Expand
 ↓
Deploy
 ↓
Migrate
 ↓
Contract
```

---

# 46. CI/CD — What Is It?

CI:

> Continuously integrate and validate code changes.

CD:

> Deliver/deploy validated changes through controlled environments.

---

# 47. CI Pipeline

Typical:

```text
Checkout
 ↓
Build
 ↓
Unit Test
 ↓
Static Analysis
 ↓
Dependency Scan
 ↓
Container Build
 ↓
Image Scan
 ↓
Artifact Publish
```

---

# 48. CD Pipeline

Typical:

```text
Artifact
 ↓
Deploy DEV
 ↓
Smoke Test
 ↓
Deploy TEST
 ↓
Integration / Evaluation
 ↓
Approval
 ↓
Deploy PROD
 ↓
Monitor
```

---

# 49. Quality Gates

Examples:

- unit tests pass,
- code coverage threshold,
- no critical vulnerabilities,
- image scan passes,
- AI evaluation above threshold,
- latency within SLO,
- cost within budget.

---

# 50. Git Branching

Avoid overcomplicated branching.

Common approaches:

- trunk-based,
- short-lived feature branches,
- pull request review.

Senior principle:

> "Branching strategy should support delivery speed without sacrificing review and traceability."

---

# 51. Infrastructure as Code

Version infrastructure with code.

Examples conceptually:

- Terraform,
- Bicep,
- ARM.

Benefits:

- repeatability,
- review,
- environment parity,
- drift reduction.

---

# 52. Configuration as Code

Version:

- Kubernetes manifests,
- Helm values,
- pipeline YAML,
- policies,
- alerts.

---

# 53. Secrets in CI/CD

Never place production secrets directly in repository.

Use:

- secure secret store,
- workload identity,
- pipeline secret integration.

---

# 54. MLOps — What Is It?

MLOps applies DevOps-style engineering to ML lifecycle.

Typical lifecycle:

```text
Data
 ↓
Train
 ↓
Evaluate
 ↓
Register
 ↓
Deploy
 ↓
Monitor
 ↓
Retrain
```

---

# 55. LLMOps

LLMOps extends operational discipline to LLM applications.

Need to version/observe:

- prompt,
- model,
- retrieval,
- tool contracts,
- guardrails,
- evaluation dataset,
- agent graph,
- cost.

---

# 56. AI Application Version Matrix

A release may depend on:

```text
Application Version
Prompt Version
Model Version
Embedding Version
Retrieval Config Version
Tool Version
Policy Version
```

If any changes, behavior may change.

---

# 57. Prompt Versioning

Treat prompts like code.

Track:

- ID,
- version,
- owner,
- change,
- test results,
- release date.

---

# 58. Model Versioning

Do not use vague:

```text
latest
```

without governance in production.

Model upgrades can change:

- output quality,
- tool behavior,
- latency,
- cost,
- safety.

---

# 59. Evaluation Before Release

For GenAI:

```text
Candidate Release
 ↓
Golden Dataset
 ↓
Automated Evaluation
 ↓
Safety Tests
 ↓
Human Review
 ↓
Performance / Cost Check
 ↓
Release Decision
```

---

# 60. AI Regression Test

Changes to:

- prompt,
- RAG,
- model,
- agent,
- tool

can cause behavioral regression.

Need repeatable evaluation.

---

# 61. Model Registry

For traditional ML, registry tracks:

- model artifact,
- version,
- metrics,
- metadata,
- approval stage.

---

# 62. Experiment Tracking

Track:

- parameters,
- datasets,
- metrics,
- code version,
- model output.

Useful for reproducibility.

---

# 63. Feature Store — Interview Level

Feature store centralizes reusable ML features.

Benefits:

- consistency,
- reuse,
- online/offline alignment.

Not necessarily required for all ML projects.

---

# 64. Drift

Types:

- data drift,
- concept drift,
- model performance drift.

For LLM apps also monitor:

- prompt drift,
- content drift,
- retrieval drift,
- cost drift.

---

# 65. Monitoring Traditional ML

Track:

- prediction distribution,
- feature drift,
- accuracy where labels available,
- latency,
- errors.

---

# 66. Monitoring GenAI

Track:

- latency,
- tokens,
- cost,
- retrieval quality,
- groundedness,
- safety,
- tool success,
- refusal rate,
- user feedback.

---

# 67. SLO

Service Level Objective.

Example:

```text
99.9% availability
P95 latency < 2 seconds
```

For GenAI, may also define quality SLO.

---

# 68. Production Readiness

A deployment is not production-ready because the container starts.

Need:

```text
Security
Reliability
Observability
Scalability
Cost
Rollback
Testing
Runbook
```

---

# 69. Health Endpoints

Typical:

```text
/health/live
/health/ready
```

Readiness may validate critical dependencies carefully.

Avoid making readiness depend on every optional service if that causes cascading outages.

---

# 70. Graceful Shutdown

When Kubernetes terminates pod:

Application should:

- stop accepting new work,
- finish in-flight requests where possible,
- close resources.

---

# 71. SIGTERM

Kubernetes typically sends termination signal before force-killing.

App should handle it.

---

# 72. Stateless Design

Prefer stateless application instances where possible.

Session/state stored externally.

Benefits:

- scaling,
- restart,
- load balancing.

---

# 73. Session Affinity

Avoid relying on sticky sessions unless required.

Better:

- external session store,
- stateless tokens.

---

# 74. Rate Limiting

Protect AI services from:

- abuse,
- cost spikes,
- provider limits.

Apply per:

- user,
- tenant,
- API key.

---

# 75. Backpressure

If downstream provider is overloaded:

- queue,
- reject gracefully,
- throttle,
- shed load.

Do not let requests accumulate without bound.

---

# 76. Queue for Long-Running AI Work

For long operations:

```text
API
 ↓
Queue
 ↓
Worker
 ↓
Model / Tool
 ↓
Result Store
```

API returns job ID.

---

# 77. Idempotency

Important for retried write operations.

Example:

```text
POST /generate-report
```

If same request retries, avoid duplicate side effects.

---

# 78. Circuit Breaker

Stop repeatedly calling failing provider.

Use:

```text
Closed → Open → Half-Open
```

---

# 79. Timeout

Every external dependency needs timeout.

Examples:

- LLM provider,
- vector DB,
- SQL,
- REST API.

---

# 80. Retry

Retry transient failures.

Use:

- bounded attempts,
- exponential backoff,
- jitter.

Never retry validation or authorization errors blindly.

---

# 81. Kubernetes Failure — CrashLoopBackOff

Possible causes:

- app startup error,
- missing secret,
- bad config,
- failed dependency,
- bad command,
- liveness too aggressive.

Debug:

```text
kubectl logs
kubectl describe pod
events
config/secrets
```

---

# 82. Kubernetes Failure — ImagePullBackOff

Possible:

- wrong image name/tag,
- registry auth,
- image unavailable,
- network.

---

# 83. Kubernetes Failure — Pending Pod

Possible:

- insufficient CPU/memory,
- node selector,
- taint/toleration,
- PVC issue.

---

# 84. Kubernetes Failure — OOMKilled

Check:

- memory limits,
- workload behavior,
- leaks,
- large responses,
- model loading.

---

# 85. Kubernetes Failure — 503 After Deployment

Check:

- readiness probe,
- service selector,
- ingress,
- app startup,
- dependency health.

---

# 86. Kubernetes Failure — Autoscaling Not Working

Check:

- metrics available,
- requests configured,
- HPA config,
- custom metric source,
- cluster capacity.

---

# 87. CI Failure — Build Works Locally

Possible:

- missing dependency lock,
- environment assumptions,
- platform difference,
- uncommitted config.

Containers/CI should expose these inconsistencies.

---

# 88. CD Failure — New Version Breaks

Need:

- health checks,
- canary,
- automated rollback,
- feature flag,
- previous artifact retained.

---

# 89. AI Release Failure — HTTP Healthy but Quality Drops

This is why AI needs evaluation gates.

Monitor:

- golden-set score,
- user feedback,
- retrieval hit rate,
- unsafe outputs.

---

# 90. Security — Container

- use minimal base,
- non-root user,
- scan image,
- patch dependencies,
- no secrets baked into image.

---

# 91. Security — Kubernetes

- RBAC,
- namespaces,
- network policies,
- workload identity,
- secret store,
- admission policies,
- image policies,
- pod security.

---

# 92. Security — Supply Chain

Protect:

```text
Source
 ↓
Dependencies
 ↓
Build
 ↓
Artifact
 ↓
Registry
 ↓
Deployment
```

Need:

- signed artifacts where possible,
- vulnerability scans,
- SBOM,
- trusted registries.

---

# 93. SBOM

Software Bill of Materials lists components/dependencies in artifact.

Useful for:

- vulnerability response,
- compliance,
- supply-chain visibility.

---

# 94. Observability

Use three pillars:

- Logs
- Metrics
- Traces

Plus AI quality telemetry.

---

# 95. Logs

Include:

- request ID,
- pod/version,
- error,
- relevant context.

Do not log secrets/PII.

---

# 96. Metrics

Examples:

- request rate,
- error rate,
- latency,
- CPU,
- memory,
- pod count,
- token usage,
- model failure.

---

# 97. Tracing

Distributed trace across:

```text
Ingress
 ↓
API
 ↓
RAG
 ↓
LLM
 ↓
Tool
```

---

# 98. Golden Signals

Common:

- latency,
- traffic,
- errors,
- saturation.

---

# 99. Cost Controls

Kubernetes:

- right-size requests,
- autoscale,
- shut idle non-prod,
- spot nodes for suitable workloads,
- use serverless/managed alternatives where appropriate.

AI:

- model routing,
- token budgets,
- cache,
- step limits.

---

# 100. Build vs Kubernetes

Do not deploy every small workload to Kubernetes.

Alternatives:

- serverless,
- managed app platform,
- container apps,
- functions,
- managed ML endpoint.

Senior principle:

> "Kubernetes is justified by operational requirements, not because containers exist."

---

# 101. When AKS Makes Sense

Use when:

- many services,
- portability,
- custom networking,
- complex scaling,
- platform standardization,
- Kubernetes ecosystem needed.

---

# 102. When AKS May Be Overkill

For:

- one simple API,
- low scale,
- small team,
- no Kubernetes expertise.

A managed PaaS may be simpler.

---

# 103. System Design — AI API on AKS

```text
Client
 ↓
Gateway / Ingress
 ↓
API Pods
 ↓
RAG / Agent Service
 ├── Vector DB
 ├── LLM Provider
 └── Tool APIs
 ↓
Response

Cross-Cutting:
HPA
Managed Identity
Key Vault
Logging
Tracing
Rate Limits
Circuit Breakers
```

---

# 104. CI/CD for AI Application

```text
Commit
 ↓
Unit Tests
 ↓
Static / Security Scan
 ↓
Container Build
 ↓
Image Scan
 ↓
Push ACR
 ↓
Deploy Test
 ↓
Integration Tests
 ↓
AI Evaluation
 ↓
Approval
 ↓
Canary Prod
 ↓
Monitor
 ↓
Promote / Rollback
```

---

# 105. Release Gate Example

Require:

```text
Unit Tests = PASS
Critical CVEs = 0
RAG Recall@K ≥ threshold
Groundedness ≥ threshold
P95 latency ≤ budget
Cost/request ≤ budget
Safety test = PASS
```

---

# 106. MLOps vs DevOps

DevOps focuses on code/application lifecycle.

MLOps adds:

- data,
- experiments,
- models,
- drift,
- retraining.

LLMOps adds:

- prompts,
- retrieval,
- model APIs,
- evaluation,
- tool/agent behavior.

---

# 107. Interview Question — Docker vs VM

Strong answer:

> "A VM virtualizes hardware and includes a full guest OS. Containers share the host kernel and package application dependencies, making them lighter and faster to start. They solve different isolation and operational needs."

---

# 108. Interview Question — Pod vs Container

> "A container is the runtime unit. A Pod is Kubernetes' scheduling unit that contains one or more closely related containers sharing network and lifecycle."

---

# 109. Interview Question — Readiness vs Liveness

> "Readiness controls whether the pod should receive traffic. Liveness controls whether the container should be restarted."

---

# 110. Interview Question — HPA vs Cluster Autoscaler

> "HPA changes pod count. Cluster Autoscaler changes node count when cluster capacity is insufficient or underused."

---

# 111. Interview Question — Blue/Green vs Canary

> "Blue/green switches between two complete environments and provides fast rollback. Canary gradually exposes a small portion of traffic to the new version, allowing risk to be measured before full rollout."

---

# 112. Interview Question — MLOps

> "MLOps applies engineering discipline to the ML lifecycle: data, training, evaluation, versioning, deployment, monitoring, and retraining."

---

# 113. Interview Question — LLMOps

> "LLMOps extends that discipline to LLM applications by versioning prompts, models, retrieval configuration, tools and evaluation datasets, and by monitoring quality, cost, latency and safety."

---

# 114. Q01 — Conceptual Questions

1. What is Docker?
2. Image vs container?
3. Why layers?
4. Multi-stage build?
5. Registry?
6. What is Kubernetes?
7. Pod?
8. Deployment?
9. Service?
10. Ingress?
11. ConfigMap vs Secret?
12. Readiness vs liveness?
13. Requests vs limits?
14. HPA?
15. Cluster Autoscaler?
16. AKS?
17. Job vs CronJob?
18. Blue/green?
19. Canary?
20. CI vs CD?
21. MLOps?
22. LLMOps?

---

# 115. Q04 — Scenario Questions

1. Deploy RAG API to AKS.
2. Scale AI API under traffic spike.
3. Protect secrets.
4. Roll back bad release.
5. Long-running report generation.
6. LLM provider rate limit.
7. Model quality regression after upgrade.
8. Zero-downtime deployment.
9. Secure supply chain.
10. Reduce AKS cost.

---

# 116. Q06 — Debugging Questions

1. CrashLoopBackOff.
2. ImagePullBackOff.
3. Pod Pending.
4. OOMKilled.
5. 503 after deploy.
6. HPA not scaling.
7. Secret unavailable.
8. New image quality regression.
9. pipeline fails only in CI.
10. canary shows high latency.

---

# 117. Q07 — Architecture Review

Weak:

```text
Developer
 ↓
docker build
 ↓
kubectl apply
 ↓
Production
```

Missing:

- tests,
- code review,
- scans,
- registry,
- versioning,
- environment promotion,
- evaluation,
- approval,
- secrets,
- rollback,
- observability.

---

# 118. Q08 — Optimization

Docker:

- smaller base image,
- cache layers,
- multi-stage.

Kubernetes:

- right-size requests,
- HPA,
- efficient probes,
- reduce idle resources.

CI/CD:

- parallel jobs,
- dependency caching,
- incremental builds.

AI:

- model routing,
- token limits,
- cache,
- async processing.

---

# 119. Q10 — Edge Cases

- pod restarts mid-request,
- duplicate write on retry,
- provider timeout,
- image vulnerability,
- secret rotation,
- config mismatch,
- partial rollout,
- DB incompatible rollback,
- node failure,
- region failure.

---

# 120. Q11 — Deployment Pseudocode

```text
onCommit():

    build()
    unitTest()
    securityScan()

    image = buildContainer()
    scanImage(image)
    pushRegistry(image)

    deploy("test", image)

    integrationTest()
    aiEvaluation()

    if gatesPass():
        approveProduction()

        deployCanary(image)

        observe()

        if healthy():
            promote()
        else:
            rollback()
```

---

# 121. Q12 — Cross-Question Survival

Expect:

1. Why containers?
2. Why Kubernetes?
3. Why AKS?
4. Why not App Service/Container Apps?
5. How do you handle secrets?
6. How do you scale?
7. How do you roll back?
8. What if DB schema changed?
9. How do you prevent duplicate writes?
10. How do you monitor quality?
11. How do you release new LLM model?
12. How do you reduce cost?
13. How do you secure supply chain?
14. How do you handle provider outage?
15. What is your release gate?

---

# 122. Trainer Audition — Explain Container

> "A container is like a sealed travel kit that contains the application and the runtime pieces it needs. That makes the application behave more consistently when we move it from a developer machine to test or production."

---

# 123. Trainer Audition — Explain Kubernetes

> "Docker gives us containers. Kubernetes manages large numbers of containers: where they run, how many copies we need, what happens when one fails, and how traffic reaches them."

---

# 124. Trainer Lab

Objective:

Containerize and deploy a simple API.

Learners:

1. create Dockerfile,
2. build image,
3. run locally,
4. push registry,
5. deploy to Kubernetes,
6. expose Service,
7. add readiness/liveness probes,
8. configure environment,
9. scale replicas.

Stretch:

- HPA,
- canary release,
- Key Vault integration.

---

# 125. Trainer Assessment

Rubric:

- image quality,
- security,
- deployment correctness,
- probes,
- configuration,
- scaling,
- rollback,
- explanation.

---

# 126. Whiteboard Script — 5-Minute Production Delivery

```text
1. Source Code
2. CI: Build/Test/Scan
3. Container
4. Registry
5. CD: Environment Promotion
6. Kubernetes/AKS
7. Config + Secrets
8. Health + Autoscaling
9. Canary/Blue-Green
10. Observability
11. Rollback
12. MLOps/LLMOps Evaluation Gate
```

---

# 127. Senior-Level Principles

Memorize:

> **1. Containers solve packaging; Kubernetes solves orchestration.**

> **2. Kubernetes is not automatically the right platform for every app.**

> **3. Readiness controls traffic; liveness controls restart.**

> **4. Never bake secrets into images.**

> **5. Use immutable, versioned artifacts.**

> **6. Rollback must be designed before release.**

> **7. CI/CD for AI needs quality evaluation, not only unit tests.**

> **8. LLMOps versions prompts, models, retrieval, tools, and evaluation.**

> **9. A healthy HTTP endpoint does not prove a healthy AI release.**

> **10. Production readiness = security + reliability + observability + scalability + cost + rollback.**

---

# 128. High-Probability Rapid-Fire Questions

Answer in 30–60 seconds:

1. Docker?
2. image vs container?
3. Dockerfile?
4. layers?
5. multi-stage build?
6. registry?
7. Kubernetes?
8. pod?
9. deployment?
10. ReplicaSet?
11. service?
12. ingress?
13. ConfigMap?
14. Secret?
15. readiness?
16. liveness?
17. startup probe?
18. requests/limits?
19. OOMKilled?
20. HPA?
21. cluster autoscaler?
22. AKS?
23. workload identity?
24. StatefulSet?
25. Job/CronJob?
26. rolling update?
27. blue/green?
28. canary?
29. CI/CD?
30. release gate?
31. MLOps?
32. LLMOps?
33. drift?
34. observability?
35. rollback?

---

# 129. M08 Readiness Gate

Do not mark M08 complete until all P2 items can be answered clearly.

## Gate A — Docker

- [ ] Explain image vs container.
- [ ] Explain Dockerfile.
- [ ] Explain image layers.
- [ ] Explain multi-stage build.
- [ ] Explain registry.
- [ ] Explain container security basics.

## Gate B — Kubernetes

- [ ] Explain pod/deployment/service.
- [ ] Explain ingress.
- [ ] Explain ConfigMap/Secret.
- [ ] Explain readiness/liveness/startup.
- [ ] Explain requests/limits.
- [ ] Explain HPA vs Cluster Autoscaler.
- [ ] Explain AKS.

## Gate C — Delivery

- [ ] Explain CI vs CD.
- [ ] Explain quality gates.
- [ ] Explain blue/green.
- [ ] Explain canary.
- [ ] Explain rollback.
- [ ] Explain immutable artifacts.
- [ ] Explain IaC.

## Gate D — MLOps/LLMOps

- [ ] Explain MLOps.
- [ ] Explain LLMOps.
- [ ] Explain prompt/model/retrieval versioning.
- [ ] Explain AI evaluation gate.
- [ ] Explain drift.
- [ ] Explain AI observability.

## Gate E — Production Troubleshooting

- [ ] Diagnose CrashLoopBackOff.
- [ ] Diagnose ImagePullBackOff.
- [ ] Diagnose OOMKilled.
- [ ] Diagnose 503 after deploy.
- [ ] Handle provider outage.
- [ ] Handle quality regression.
- [ ] Handle rollback with schema change.

## Gate F — Interview Conversion

- [ ] Whiteboard production delivery in 5 minutes.
- [ ] Survive "Why Kubernetes?"
- [ ] Survive "Why not simpler PaaS?"
- [ ] Survive "How do you release LLM changes?"
- [ ] Survive "How do you roll back?"
- [ ] Explain Docker/Kubernetes to beginner.
- [ ] Design one deployment lab.

### Completion Rule

**M08 PASS = You can explain how an AI application moves from source code to a secure, observable, scalable production deployment with controlled release and rollback.**

Weak areas move to **M12 Gap Closure**.

---

# 130. M08 One-Minute Battle Card

```text
DOCKER
Package app + runtime dependencies.

IMAGE
Immutable template.

CONTAINER
Running image.

KUBERNETES
Container orchestration.

POD
Scheduling unit.

DEPLOYMENT
Replicas + rollout.

SERVICE
Stable network endpoint.

READINESS
Receive traffic?

LIVENESS
Restart?

HPA
Scale pods.

AKS
Managed Kubernetes on Azure.

CI
Build/test/scan.

CD
Promote/deploy.

CANARY
Small traffic first.

ROLLBACK
Restore known-good version.

MLOPS
Data/model lifecycle.

LLMOPS
Prompt/model/RAG/tool/evaluation lifecycle.

SENIOR PRINCIPLE
A technically running deployment is not necessarily production-ready.
```

---

# 131. Next Module

After M08 passes its readiness gate:

# **M09 — AI Security, Governance, Observability & FinOps**

M09 will cover:

- authentication/authorization,
- Entra ID,
- managed identity,
- Key Vault,
- private networking,
- PII/data leakage,
- prompt injection,
- agent/tool security,
- governance,
- auditability,
- responsible AI,
- logs/metrics/traces,
- AI quality telemetry,
- token/cost control,
- architecture review,
- readiness gate.

---

**End of M08 — Docker, Kubernetes, CI/CD & MLOps**
