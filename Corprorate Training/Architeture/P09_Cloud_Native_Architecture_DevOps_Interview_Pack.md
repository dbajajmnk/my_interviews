# P09 — Cloud-Native Architecture + DevOps

**Interview Track:** Software Design & Architecture  
**Pack:** P09 of 12  
**Source Curriculum:** Module 7 — Microservices & Cloud-Native Architecture + Module 9 — DevOps & AI-Assisted Architecture  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, compare, and defend the cloud-native and DevOps topics explicitly listed in the supplied curriculum.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain:

- Containerization with Docker
- Kubernetes Basics
- Twelve-Factor App Principles
- CI/CD Concepts
- Infrastructure as Code (IaC)
- Docker & Kubernetes in DevOps

You should also be able to:

- Explain why containers are useful.
- Distinguish containers from virtual machines at a high level.
- Explain what Kubernetes solves.
- Explain the purpose of the Twelve-Factor principles.
- Explain CI vs CD.
- Explain IaC.
- Explain how Docker and Kubernetes fit into DevOps workflows.
- Handle scenario and trade-off questions.

---

# 2. Simple Analogy

Think of software delivery as shipping goods.

## Docker
Docker is like packing an application into a standardized shipping container.

The container carries:

- Application
- Runtime
- Required dependencies
- Configuration expectations

This makes the application more portable across environments.

## Kubernetes
Kubernetes is like the port-management system that decides:

- Where containers run
- How many copies are needed
- What happens if one fails
- How traffic reaches them

## CI/CD
CI/CD is like an automated production and delivery line.

## IaC
Infrastructure as Code is like describing the warehouse, roads, machines, and network in repeatable blueprints instead of building them manually each time.

---

# 3. Visualization

```text
Developer Code
     |
     v
    CI
     |
     v
Build / Test
     |
     v
Docker Image
     |
     v
Container Registry
     |
     v
Deployment Pipeline
     |
     v
Kubernetes
     |
     v
Running Application
     |
     v
Infrastructure
     ^
     |
    IaC
```

---

# 4. Mind Map

```text
Cloud-Native + DevOps
|
+-- Docker
|   +-- Image
|   +-- Container
|   +-- Portability
|
+-- Kubernetes
|   +-- Deployment
|   +-- Scaling
|   +-- Service
|   +-- Resilience
|
+-- Twelve-Factor App
|
+-- CI/CD
|
+-- Infrastructure as Code
|
+-- Docker/Kubernetes in DevOps
```

---

# 5. Containerization with Docker

## Core Idea

Containerization packages an application and its required runtime dependencies into a portable unit.

### Interview-ready answer

> Docker allows an application and its dependencies to be packaged into a consistent container image so the same application can run more predictably across environments.

---

# 6. Docker Image vs Container

## Image

An image is a packaged template.

Conceptually:

```text
Application
+ Runtime
+ Dependencies
+ Configuration instructions
```

## Container

A container is a running instance of an image.

### Easy distinction

**Image = blueprint/package**  
**Container = running instance**

---

# 7. Why Docker?

Potential benefits include:

- Consistent environments
- Portability
- Faster environment setup
- Better packaging of dependencies
- Easier deployment automation
- Isolation between applications

---

# 8. Docker vs Virtual Machine — High-Level

## Virtual Machine

A VM typically includes:

- Guest operating system
- Application
- Dependencies

## Container

A container shares the host kernel but isolates application processes.

### Interview takeaway

Containers are generally lighter-weight than full virtual machines, but they solve different infrastructure concerns.

Do not claim containers replace VMs in every situation.

---

# 9. Kubernetes Basics

Kubernetes is a container orchestration platform.

### Interview-ready answer

> Kubernetes manages containerized workloads by helping with deployment, scaling, service exposure, recovery, and desired-state management.

---

# 10. Key Kubernetes Concepts

The source only says **Kubernetes Basics**, so keep the focus fundamental.

## Pod

Smallest deployable unit in Kubernetes.

A pod can contain one or more tightly related containers.

---

## Deployment

Describes the desired application deployment state.

It helps manage:

- Replica count
- Updates
- Replacement of failed pods

---

## Service

Provides a stable way to access a group of pods.

Conceptually:

```text
Client
  |
  v
Service
  |
  +--> Pod 1
  +--> Pod 2
  +--> Pod 3
```

---

# 11. Why Kubernetes?

Potential reasons:

- Run containers at scale
- Restart failed workloads
- Scale replicas
- Manage deployments
- Provide stable service access
- Support rolling updates

### Red flag

Do not recommend Kubernetes for every small application.

---

# 12. Docker vs Kubernetes

## Docker

Packages and runs containers.

## Kubernetes

Coordinates and manages containerized workloads across environments.

### Interview-ready answer

> Docker solves container packaging/runtime, while Kubernetes solves orchestration and lifecycle management for containerized workloads.

---

# 13. Twelve-Factor App Principles

The source explicitly lists **Twelve-Factor App Principles**.

The purpose is to guide design of modern applications that are portable, deployable, configurable, and suitable for cloud-style environments.

The twelve factors are:

1. Codebase
2. Dependencies
3. Config
4. Backing Services
5. Build, Release, Run
6. Processes
7. Port Binding
8. Concurrency
9. Disposability
10. Dev/Prod Parity
11. Logs
12. Admin Processes

---

# 14. Twelve-Factor — Interview Explanation

You do not need to recite all twelve immediately unless asked.

Explain the purpose first:

> Twelve-Factor encourages applications to separate configuration from code, declare dependencies explicitly, treat backing services as attached resources, keep processes stateless where possible, and support repeatable deployment and scaling.

---

# 15. Key Factors to Remember

## Config

Do not hard-code environment-specific configuration.

## Dependencies

Declare dependencies explicitly.

## Build, Release, Run

Separate build from release and runtime execution.

## Processes

Prefer stateless application processes where practical.

## Logs

Treat logs as event streams for centralized processing.

## Dev/Prod Parity

Reduce unnecessary differences between environments.

---

# 16. CI/CD Concepts

## Continuous Integration — CI

Developers integrate changes frequently.

Automation typically performs:

- Build
- Tests
- Quality checks

### Goal

Detect integration issues early.

---

## Continuous Delivery / Deployment — CD

### Continuous Delivery

Software is kept in a deployable state and can be released through a controlled step.

### Continuous Deployment

Validated changes are automatically released to production.

### Interview distinction

**CI = integrate and validate changes continuously.**  
**CD = automate the path toward release/deployment.**

---

# 17. CI/CD Pipeline Visualization

```text
Commit
  |
  v
Build
  |
  v
Unit Tests
  |
  v
Quality / Security Checks
  |
  v
Package
  |
  v
Deploy
  |
  v
Validate
```

Exact stages depend on the organization.

---

# 18. Why CI/CD Matters Architecturally

CI/CD influences:

- Deployment frequency
- Release risk
- Environment consistency
- Testing automation
- Rollback strategy
- Operational confidence

Architecture should support reliable delivery, not fight against it.

---

# 19. Infrastructure as Code — IaC

Infrastructure as Code means defining infrastructure through machine-readable configuration rather than relying only on manual setup.

Conceptually:

```text
Infrastructure Definition
      |
      v
Automated Provisioning
      |
      v
Repeatable Environment
```

### Interview-ready answer

> IaC enables repeatable, version-controlled, and automated infrastructure provisioning.

---

# 20. Benefits of IaC

Potential benefits:

- Repeatability
- Version control
- Faster environment creation
- Reduced configuration drift
- Reviewable infrastructure changes
- Better automation

---

# 21. IaC Risks / Trade-Offs

Potential challenges:

- Learning curve
- Poorly written IaC can automate bad configuration
- State/configuration management complexity
- Security risks if secrets are handled incorrectly

---

# 22. Docker & Kubernetes in DevOps

The source explicitly lists **Docker & Kubernetes in DevOps**.

A common delivery model:

```text
Code
 |
 v
CI Pipeline
 |
 v
Build Docker Image
 |
 v
Push Image
 |
 v
Deployment Pipeline
 |
 v
Kubernetes Deployment
 |
 v
Running Pods
```

---

# 23. How the Pieces Fit Together

```text
Developer
   |
   v
Git Repository
   |
   v
CI Pipeline
   |
   v
Docker Build
   |
   v
Container Image
   |
   v
CD Pipeline
   |
   v
Kubernetes
   |
   v
Cloud / Infrastructure
   ^
   |
  IaC
```

Twelve-Factor principles help shape the application so it fits this delivery model cleanly.

---

# 24. Engineering Depth — Desired State

Kubernetes works around the idea of desired state.

Example:

```text
Desired replicas = 3
```

If one pod fails:

```text
Actual = 2
Desired = 3
```

Kubernetes attempts to restore the desired count.

### Interview takeaway

This supports automated recovery behavior.

---

# 25. Scaling

At basic level, Kubernetes can scale replicas.

Conceptually:

```text
Traffic increases
     |
     v
More replicas
```

Do not treat scaling as magic.

The application itself must also be designed appropriately.

---

# 26. Statelessness and Containers

Stateless application processes are easier to scale horizontally.

If application state lives only inside one container instance, replacement or scaling can become difficult.

This connects strongly with Twelve-Factor thinking.

---

# 27. Configuration

Strong cloud-native applications separate code from environment-specific configuration.

Avoid:

```text
databaseHost = "prod-db.company.com"
```

inside application source.

Prefer externalized configuration mechanisms.

---

# 28. Common Mistakes / Red Flags

## Mistake 1 — Docker = Virtual Machine

Wrong.

Containers and VMs provide different levels of isolation.

---

## Mistake 2 — Kubernetes = Docker replacement

Wrong.

Kubernetes orchestrates containerized workloads.

---

## Mistake 3 — Kubernetes for everything

Can create unnecessary complexity.

---

## Mistake 4 — CI = CD

Different concerns.

---

## Mistake 5 — Infrastructure manually configured forever

Creates inconsistency and configuration drift.

---

## Mistake 6 — Hard-coded configuration

Conflicts with cloud-native and Twelve-Factor principles.

---

## Mistake 7 — Treating containers as permanent machines

Containers should be considered replaceable execution units.

---

# 29. Practical Scenario

## Scenario

An enterprise application currently has:

- Manual deployments
- Environment-specific setup steps
- “Works on my machine” issues
- Inconsistent server configuration
- Slow releases

### Candidate improvement direction

Consider:

- Containerization
- Automated CI
- Automated deployment
- IaC
- Consistent configuration
- Kubernetes only if orchestration requirements justify it

### Strong interview point

Do not introduce Kubernetes before determining whether the scale/operational need exists.

---

# 30. Interview Questions

## Q1 — What is Docker?

A platform for packaging and running applications in containers.

---

## Q2 — Image vs container?

Image is the packaged template.

Container is a running instance.

---

## Q3 — Docker vs VM?

Containers share the host kernel and are generally lighter-weight, while VMs include a guest operating system.

---

## Q4 — What is Kubernetes?

A container orchestration platform for deploying and managing containerized workloads.

---

## Q5 — What is a Pod?

The smallest deployable unit in Kubernetes.

---

## Q6 — What is a Deployment?

A Kubernetes object that manages the desired state and replicas of application pods.

---

## Q7 — What is a Service?

A stable network access mechanism for a set of pods.

---

## Q8 — Docker vs Kubernetes?

Docker packages/runs containers.

Kubernetes orchestrates them.

---

## Q9 — What is Twelve-Factor App?

A set of principles for building portable, configurable, deployable applications suited to modern cloud environments.

---

## Q10 — CI vs CD?

CI integrates and validates changes.

CD automates delivery/deployment toward release.

---

## Q11 — What is IaC?

Infrastructure defined and provisioned using code/configuration.

---

# 31. Scenario Questions

## Scenario 1

Developers say:

> “It works locally but not in test.”

Possible improvement:

Containerization and consistent dependencies/configuration.

---

## Scenario 2

Application has three replicas and one crashes.

Kubernetes can attempt to restore desired replica count.

---

## Scenario 3

Every environment is configured manually and differs.

IaC can improve repeatability and reduce drift.

---

## Scenario 4

A small internal tool with one instance is proposed for Kubernetes.

Challenge whether Kubernetes adds enough value.

---

## Scenario 5

Configuration differs between dev/test/prod.

Use externalized configuration instead of changing source code.

---

# 32. Follow-Up / Cross-Question Survival

## Cross-Q1
**Do containers guarantee portability?**

They improve consistency, but host capabilities, networking, storage, CPU architecture, and external dependencies can still matter.

---

## Cross-Q2
**Can Kubernetes run stateful workloads?**

Yes, but stateful applications require additional storage and lifecycle considerations.

---

## Cross-Q3
**Does CI/CD eliminate deployment risk?**

No.

It reduces manual error and improves repeatability, but poor tests or bad automation can still deploy defects.

---

## Cross-Q4
**Is IaC only for cloud?**

No.

The principle can apply wherever infrastructure can be defined and automated.

---

## Cross-Q5
**Should logs be written only to local container files?**

For cloud-native environments, centralized log collection is usually more suitable because containers may be replaced.

---

## Cross-Q6
**Does Kubernetes automatically make an application highly available?**

No.

It can support recovery and replica management, but application design, dependencies, data, networking, and infrastructure all influence availability.

---

# 33. Whiteboard Drill

Draw:

```text
Developer
   |
   v
Git
   |
   v
CI
   |
   v
Docker Image
   |
   v
Registry
   |
   v
CD
   |
   v
Kubernetes
   |
   v
Pods / Services
```

Add:

```text
IaC ---> Infrastructure
```

Then explain:

- Build
- Test
- Package
- Deploy
- Scale
- Recover
- Configure

---

# 34. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- Docker
- Image
- Container
- Docker vs VM
- Kubernetes
- Pod
- Deployment
- Service
- Twelve-Factor App
- CI
- CD
- IaC
- Docker/Kubernetes in DevOps

---

# 35. Rapid Revision

## Docker

**Package + run application consistently**

## Kubernetes

**Orchestrate containerized workloads**

## Kubernetes Basics

**Pod • Deployment • Service**

## Twelve-Factor

**Portable • Configurable • Stateless-minded • Deployable**

## CI

**Integrate + validate**

## CD

**Deliver/deploy reliably**

## IaC

**Infrastructure defined as code**

## Golden Rule

> Use cloud-native tooling to solve real delivery, scaling, consistency, and operational problems—not simply because the tools are popular.

---

# 36. Self-Practice

Answer aloud:

1. What is containerization?
2. What is Docker?
3. Image vs container?
4. Docker vs VM?
5. What is Kubernetes?
6. What is a Pod?
7. What is a Deployment?
8. What is a Service?
9. Docker vs Kubernetes?
10. Why use Kubernetes?
11. When would you avoid Kubernetes?
12. What is Twelve-Factor?
13. Name the Twelve Factors.
14. Which factors matter most for cloud-native delivery?
15. CI vs CD?
16. What is IaC?
17. Benefits of IaC?
18. How do Docker and Kubernetes fit into CI/CD?
19. Why is statelessness helpful?
20. How would you improve a manual deployment process?

---

# 37. P09 Readiness Gate

Do **not** mark P09 complete unless you can:

- [ ] Explain Docker.
- [ ] Distinguish image from container.
- [ ] Explain Docker vs VM at a high level.
- [ ] Explain Kubernetes basics.
- [ ] Explain Pod, Deployment, and Service.
- [ ] Explain Docker vs Kubernetes.
- [ ] Explain why Kubernetes may be unnecessary for small systems.
- [ ] Explain Twelve-Factor App purpose.
- [ ] Name the Twelve Factors.
- [ ] Explain at least five factors confidently.
- [ ] Explain CI vs CD.
- [ ] Explain IaC.
- [ ] Explain how Docker/Kubernetes fit into DevOps.
- [ ] Draw a basic CI/CD + Docker + Kubernetes flow.
- [ ] Handle at least five cross-questions.
- [ ] Defend whether the cloud-native tooling is justified in a scenario.

**Pass Condition:** You can explain the delivery lifecycle from source code to containerized deployment, connect it to Twelve-Factor and IaC principles, and defend which tooling is actually justified.

---

# 38. Source Boundary

This pack is grounded in the following topics from the supplied curriculum:

## Module 7 — Microservices & Cloud-Native Architecture
- Containerization with Docker
- Kubernetes Basics
- Twelve-Factor App Principles

## Module 9 — DevOps & AI-Assisted Architecture
- CI/CD Concepts
- Infrastructure as Code (IaC)
- Docker & Kubernetes in DevOps

The explanations of Pod, Deployment, Service, Docker vs VM, desired state, statelessness, and cloud-native delivery flow are interview-preparation aids used to make the source-listed topics explainable and defensible.

The source does **not** explicitly require advanced Kubernetes networking, Helm, operators, service mesh, specific IaC products, advanced autoscaling, or cluster administration, so these are not treated as mandatory curriculum topics.

---

## Status

**P09 — READY FOR STUDY & READINESS VALIDATION**

**Next after P09 gate:** P10 — Data, Security, Scalability & Resilience