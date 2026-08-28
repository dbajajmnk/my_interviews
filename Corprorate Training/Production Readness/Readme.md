# iRun Interview Preparation — Master TOC V2

**Target:** iRun Application / Production Operations Training Interview  
**Interview Date:** Sunday, 30 August 2026  
**Primary Goal:** Convert the interview by demonstrating production engineering depth, structured troubleshooting, trainer capability, curriculum ownership, and credible cross-stack readiness.

---

# Preparation Philosophy

**KIS + Evidence First + Scenario First + No Bluffing**

Preparation sequence:

`Understand → Position → Explain → Troubleshoot → Demonstrate → Defend → Cross-Question → Mock → Revise`

The objective is **not** to become an expert in every technology before the interview.

The objective is to prove:

> **Enterprise engineering depth + production troubleshooting discipline + architecture understanding + strong practical training capability + honest cross-stack adaptability.**

---

# Module 01 — Opportunity, Client TOC & Curriculum Defense

## Objective
Understand the client's curriculum deeply enough to explain, critique, defend, and improve it like a senior trainer/architect.

### Topics
- 1.1 iRun curriculum overview
- 1.2 Target learner profile
- 1.3 Expected trainer responsibilities
- 1.4 Mapping the workbook into major interview domains
- 1.5 Technology breadth vs required delivery depth
- 1.6 Current curriculum strengths
- 1.7 Curriculum duplication and overlap
- 1.8 Learning progression analysis
- 1.9 Theory vs hands-on balance
- 1.10 Production relevance
- 1.11 Lab feasibility
- 1.12 Assessment feasibility
- 1.13 Suggested improvements without criticizing the client
- 1.14 Delivery risks
- 1.15 Trainer preparation strategy

## Client TOC Defense Questions
Prepare for:

- What do you think about our TOC?
- Is the duration realistic?
- What would you improve?
- Where do you see duplication?
- Which modules need more hands-on work?
- How would you sequence the curriculum?
- What would you keep unchanged?
- Which areas require deeper labs?
- How would you handle technologies outside your strongest stack?
- How would you validate the labs before delivery?

**Readiness Gate:** Explain the full curriculum, strengths, gaps, and delivery strategy in 3–5 minutes without sounding negative or theoretical.

---

# Module 02 — Personal Introduction & Senior Trainer Positioning

## Objective
Create a strong opening that establishes relevance, seniority, credibility, and delivery ownership.

### Topics
- 2.1 60-second introduction
- 2.2 90-second introduction
- 2.3 Enterprise application engineering experience
- 2.4 Production support and troubleshooting experience
- 2.5 Architecture and design experience
- 2.6 Cloud / Kubernetes / CI-CD exposure
- 2.7 API / integration / database exposure
- 2.8 Team handling and code-review experience
- 2.9 Training and mentoring experience
- 2.10 Why this opportunity fits
- 2.11 Why should we select you?
- 2.12 Why can you handle a broad curriculum?
- 2.13 How to discuss experience gaps safely
- 2.14 Cross-question survival

**Readiness Gate:** Deliver the introduction naturally and survive at least five follow-up questions.

---

# Module 03 — Universal Production Troubleshooting Framework

## Objective
Create one reusable diagnostic methodology for almost every production scenario.

### Core Flow

`Incident → Impact → Scope → Symptoms → Recent Change → Health → Logs → Metrics → Traces → Dependencies → Runtime → Infrastructure → Hypothesis → Validate → Mitigate → Restore → RCA → Prevention`

### Topics
- 3.1 Incident recognition
- 3.2 Business impact assessment
- 3.3 Scope identification
- 3.4 Symptom collection
- 3.5 Recent deployment/configuration checks
- 3.6 Health endpoints
- 3.7 Logs
- 3.8 Metrics
- 3.9 Traces
- 3.10 Database/dependency validation
- 3.11 Runtime checks
- 3.12 Infrastructure checks
- 3.13 Evidence-driven hypothesis
- 3.14 Hypothesis validation
- 3.15 Temporary mitigation
- 3.16 Service restoration
- 3.17 Permanent fix
- 3.18 RCA
- 3.19 Preventive actions
- 3.20 Troubleshooting anti-patterns

### Scenario Set
- Application down
- Application slow
- Intermittent errors
- High CPU
- High memory
- Dependency failure
- Timeout
- Deployment issue
- Configuration issue
- Production-only failure

**Readiness Gate:** Solve unfamiliar incidents systematically rather than by memorized technology-specific answers.

---

# Module 04 — Java & Spring Boot Application Operations

## Objective
Make Java application operations one of the strongest interview areas.

### Topics
- 4.1 Java application lifecycle
- 4.2 Spring Boot startup sequence
- 4.3 Configuration and profiles
- 4.4 Environment-specific configuration
- 4.5 Spring Boot Actuator
- 4.6 Health/readiness endpoints
- 4.7 Dependency Injection failures
- 4.8 Database connectivity issues
- 4.9 Connection-pool exhaustion
- 4.10 Startup failures
- 4.11 Classpath/dependency conflicts
- 4.12 Tomcat/application-server basics
- 4.13 Application logging
- 4.14 Slow application diagnosis
- 4.15 Production deployment failures
- 4.16 Common Spring Boot incident scenarios

**Readiness Gate:** Diagnose startup, latency, dependency, DB, and deployment issues end-to-end.

---

# Module 05 — JVM Runtime & Advanced Diagnostics

## Objective
Strengthen deep Java production diagnosis.

### Topics
- 5.1 JVM architecture
- 5.2 Heap vs stack
- 5.3 Young / Old generations
- 5.4 Garbage Collection
- 5.5 GC pressure
- 5.6 Memory leaks
- 5.7 OutOfMemoryError
- 5.8 High CPU
- 5.9 Thread states
- 5.10 Deadlocks
- 5.11 Thread starvation
- 5.12 Thread dumps
- 5.13 Heap dumps
- 5.14 `jps`
- 5.15 `jstack`
- 5.16 `jcmd`
- 5.17 `jmap`
- 5.18 Java Flight Recorder
- 5.19 VisualVM
- 5.20 JVM tuning basics
- 5.21 JVM incident scenarios

**Readiness Gate:** Explain what evidence to collect for CPU, memory, GC, deadlock, and thread problems and why.

---

# Module 06 — API, Middleware & Integration Operations

## Objective
Demonstrate strong distributed-system troubleshooting.

### Topics
- 6.1 REST request lifecycle
- 6.2 HTTP troubleshooting
- 6.3 400 / 401 / 403 / 404
- 6.4 409 / 429
- 6.5 500 / 502 / 503 / 504
- 6.6 Authentication vs authorization
- 6.7 Timeouts
- 6.8 Retry strategies
- 6.9 Circuit breaker
- 6.10 Rate limiting
- 6.11 DNS failures
- 6.12 TLS/certificate failures
- 6.13 API gateway issues
- 6.14 Serialization/payload issues
- 6.15 Downstream service failures
- 6.16 “Works locally but fails in production”
- 6.17 Queues and messaging basics
- 6.18 Integration incident scenarios

**Readiness Gate:** Troubleshoot an API from client → gateway → service → database → downstream dependency.

---

# Module 07 — Observability, Logging & Telemetry

## Objective
Show that production diagnosis is evidence-driven.

### Topics
- 7.1 Monitoring vs observability
- 7.2 Logs
- 7.3 Metrics
- 7.4 Traces
- 7.5 Correlation IDs
- 7.6 Structured logging
- 7.7 Log levels
- 7.8 Centralized logging
- 7.9 Distributed tracing
- 7.10 OpenTelemetry
- 7.11 Azure Monitor
- 7.12 Application Insights
- 7.13 Prometheus concepts
- 7.14 Grafana concepts
- 7.15 Dashboards
- 7.16 Alerts
- 7.17 Golden Signals
- 7.18 RED method
- 7.19 USE method
- 7.20 Telemetry correlation

**Readiness Gate:** Diagnose a request failure using logs + metrics + traces together.

---

# Module 08 — Incident Management, RCA & SRE

## Objective
Demonstrate operational maturity and production ownership.

### Topics
- 8.1 Incident lifecycle
- 8.2 Severity and priority
- 8.3 Triage
- 8.4 Escalation
- 8.5 War-room handling
- 8.6 Stakeholder communication
- 8.7 Restore vs permanently fix
- 8.8 Root Cause Analysis
- 8.9 Five Whys
- 8.10 Postmortem
- 8.11 Corrective actions
- 8.12 Preventive actions
- 8.13 SLI
- 8.14 SLO
- 8.15 SLA
- 8.16 Error budget
- 8.17 MTTD
- 8.18 MTTR
- 8.19 MTBF
- 8.20 Reliability mindset

**Readiness Gate:** Present at least three strong incident/RCA examples and defend decisions under follow-up questioning.

---

# Module 09 — .NET Application & Runtime Operations

## Objective
Close the main runtime knowledge gap at interview depth.

### Topics
- 9.1 .NET runtime overview
- 9.2 CLR
- 9.3 Managed memory
- 9.4 .NET GC
- 9.5 ASP.NET Core
- 9.6 Kestrel
- 9.7 IIS fundamentals
- 9.8 Configuration
- 9.9 Dependency Injection failures
- 9.10 ThreadPool concepts
- 9.11 CPU investigation
- 9.12 Memory investigation
- 9.13 `dotnet-counters`
- 9.14 `dotnet-trace`
- 9.15 `dotnet-dump`
- 9.16 Process/memory dumps
- 9.17 Common .NET production failures

**Readiness Gate:** Explain the .NET equivalent of common JVM diagnostic activities.

---

# Module 10 — Node.js Runtime & Application Troubleshooting

## Objective
Refresh Node.js operations and compare runtime models.

### Topics
- 10.1 Node.js architecture
- 10.2 V8
- 10.3 Event loop
- 10.4 Blocking operations
- 10.5 Heap
- 10.6 Garbage Collection
- 10.7 Heap snapshots
- 10.8 CPU profiling
- 10.9 Memory leaks
- 10.10 Event-loop lag
- 10.11 Async failures
- 10.12 Unhandled errors
- 10.13 Node.js incident scenarios

### Runtime Comparison
`JVM ↔ CLR ↔ V8`

`Java Threads ↔ .NET ThreadPool/Tasks ↔ Node Event Loop`

`Heap Dump ↔ Memory Dump ↔ Heap Snapshot`

**Readiness Gate:** Compare Java, .NET, and Node.js runtime troubleshooting clearly.

---

# Module 11 — Cloud, Kubernetes & CI/CD Operations

## Objective
Strengthen application-to-infrastructure troubleshooting.

### Topics
- 11.1 Cloud application operations
- 11.2 Containers
- 11.3 Kubernetes fundamentals
- 11.4 Pods
- 11.5 Deployments
- 11.6 Services
- 11.7 ConfigMaps
- 11.8 Secrets
- 11.9 Liveness/readiness probes
- 11.10 CrashLoopBackOff
- 11.11 OOMKilled
- 11.12 Resource requests/limits
- 11.13 Container logs/events
- 11.14 Deployment troubleshooting
- 11.15 CI/CD pipeline failures
- 11.16 Environment configuration issues
- 11.17 Secret/certificate issues
- 11.18 Rollback strategy

**Readiness Gate:** Troubleshoot a failing deployment or pod from symptom to recovery.

---

# Module 12 — Batch Jobs & Scheduled Workloads

## Objective
Prepare for operations of background and scheduled workloads.

### Topics
- 12.1 Batch-processing architecture
- 12.2 Schedulers
- 12.3 Job lifecycle
- 12.4 Job dependencies
- 12.5 Failed jobs
- 12.6 Missed schedules
- 12.7 Long-running jobs
- 12.8 Retry/restart
- 12.9 Idempotency
- 12.10 Audit logs
- 12.11 Data consistency
- 12.12 Partial processing
- 12.13 Recovery/reconciliation

**Readiness Gate:** Diagnose jobs that failed, did not start, duplicated work, or ran slowly.

---

# Module 13 — Kafka & Messaging Operations

## Objective
Build strong interview-level Kafka operations knowledge.

### Topics
- 13.1 Producer
- 13.2 Broker
- 13.3 Topic
- 13.4 Partition
- 13.5 Consumer
- 13.6 Consumer group
- 13.7 Offset
- 13.8 Consumer lag
- 13.9 Broker failure
- 13.10 Serialization issues
- 13.11 Authentication/authorization
- 13.12 Network failures
- 13.13 Partition imbalance
- 13.14 Duplicate/lost-message reasoning
- 13.15 Kafka incident scenarios

**Readiness Gate:** Explain and diagnose consumer lag and message-flow failures.

---

# Module 14 — Data Platform Operations

## Objective
Develop operational awareness of the specialist data stack.

### 14A — Spark / Databricks
- Driver
- Executors
- Jobs
- Stages
- Tasks
- Partitions
- Shuffle
- Data skew
- Memory/resource failures
- Cluster/job troubleshooting

### 14B — Snowflake
- Warehouses
- Databases
- Schemas
- Query history
- Query performance
- Resource usage
- Operational failures

### 14C — Airflow
- DAG
- Tasks
- Scheduler
- Workers
- Dependencies
- Retries
- Failed-DAG troubleshooting

### 14D — dbt
- Models
- Dependencies
- Tests
- Build failures
- Data-quality issues

### 14E — Azure Data Factory
- Pipelines
- Activities
- Datasets
- Linked Services
- Triggers
- Integration Runtime
- Pipeline troubleshooting

**Readiness Gate:** For each platform explain architecture, common failures, evidence sources, and first diagnostic actions.

---

# Module 15 — SharePoint Operations

## Objective
Build sufficient operational readiness while maintaining honest specialist boundaries.

### Topics
- 15.1 SharePoint architecture overview
- 15.2 Sites and site collections
- 15.3 Permissions
- 15.4 Authentication/access issues
- 15.5 Service/application dependencies
- 15.6 Common operational failures
- 15.7 Logs/diagnostics concepts
- 15.8 Escalation boundaries
- 15.9 Handling deep specialist questions safely

**Readiness Gate:** Demonstrate a structured troubleshooting approach without bluffing specialist depth.

---

# Module 16 — Code Analysis & Production Code Investigation

## Objective
Demonstrate that production troubleshooting can move from telemetry into code when needed.

### Topics
- 16.1 Reading unfamiliar code quickly
- 16.2 Exception-flow analysis
- 16.3 Resource leaks
- 16.4 Connection handling
- 16.5 Retry-loop problems
- 16.6 Thread/concurrency defects
- 16.7 Blocking operations
- 16.8 Performance bottlenecks
- 16.9 Security/vulnerability issues
- 16.10 Logging deficiencies
- 16.11 Code-review approach
- 16.12 AI-generated code validation
- 16.13 Production defect investigation

**Readiness Gate:** Explain how telemetry leads to code-level investigation and validation.

---

# Module 17 — AI-Assisted Application Operations

## Objective
Position AI as a controlled operational accelerator.

### Topics
- 17.1 AI for log analysis
- 17.2 Incident summarization
- 17.3 Pattern detection
- 17.4 RCA assistance
- 17.5 Runbook assistance
- 17.6 Query generation
- 17.7 Code/config analysis
- 17.8 Hallucination risks
- 17.9 Verification
- 17.10 Security/privacy
- 17.11 Human-in-the-loop
- 17.12 Responsible AI during incidents

**Readiness Gate:** Explain where AI can reduce investigation time and where human validation is mandatory.

---

# Module 18 — Trainer Delivery Methodology

## Objective
Make practical training capability a major differentiator.

### Topics
- 18.1 Adult-learning principles
- 18.2 Mixed-skill audience handling
- 18.3 Concept → Demo → Practice
- 18.4 Scenario-based learning
- 18.5 Controlled failures
- 18.6 Guided troubleshooting
- 18.7 Independent troubleshooting
- 18.8 RCA exercise
- 18.9 Hands-on labs
- 18.10 Assessments
- 18.11 Participant Q&A
- 18.12 Lab/environment preparation
- 18.13 Time management
- 18.14 Failed-demo contingency
- 18.15 Evidence collection

### Preferred Lab Pattern

`Concept → Demonstration → Inject Failure → Observe → Gather Evidence → Diagnose → Resolve → Validate → RCA`

**Readiness Gate:** Design and explain at least one complete troubleshooting lab.

---

# Module 19 — Whiteboard & Explain-on-Demand Readiness

## Objective
Prepare to explain complex topics simply under interview pressure.

### Mandatory Whiteboard Topics
- 19.1 Java application request flow
- 19.2 JVM memory model
- 19.3 Thread dump vs heap dump
- 19.4 API request flow
- 19.5 Logs vs metrics vs traces
- 19.6 Incident lifecycle
- 19.7 SLI/SLO/SLA relationship
- 19.8 Kubernetes application flow
- 19.9 Kafka producer-to-consumer flow
- 19.10 Batch job lifecycle
- 19.11 JVM vs CLR vs V8
- 19.12 RCA flow

### Explain-on-Demand Rule
For each topic prepare:

`30-second answer → 2-minute explanation → 5-minute whiteboard explanation`

**Readiness Gate:** Explain every P0 topic clearly without slides or notes.

---

# Module 20 — Trainer Audition / Five-Minute Teaching Demos

## Objective
Prepare for an unexpected “teach us now” request.

### Mandatory Mini-Demos
- 20.1 How to troubleshoot a slow application
- 20.2 Heap dump vs thread dump
- 20.3 Logs vs metrics vs traces
- 20.4 API 503 troubleshooting
- 20.5 Root Cause Analysis
- 20.6 Spring Boot Actuator
- 20.7 Connection-pool exhaustion
- 20.8 Kubernetes CrashLoopBackOff
- 20.9 Kafka consumer lag
- 20.10 SLI/SLO/SLA

### Demo Structure

`Hook → Analogy → Concept → Production Example → Diagnostic Flow → Key Takeaway`

**Readiness Gate:** Deliver at least five topics confidently in 5 minutes each.

---

# Module 21 — Difficult Question & Unknown-Answer Handling

## Objective
Protect credibility when facing deep or unfamiliar questions.

### Topics
- 21.1 “I don't know” without losing confidence
- 21.2 Partially known questions
- 21.3 Clarifying ambiguous technical questions
- 21.4 Deep specialist questions
- 21.5 Incorrect learner assumptions
- 21.6 Participant challenges
- 21.7 Failed lab/demo
- 21.8 Tool/version differences
- 21.9 Out-of-scope questions
- 21.10 How to verify before answering
- 21.11 How to defer safely
- 21.12 Avoiding bluffing
- 21.13 Avoiding unnecessary self-rejection

### Recommended Pattern

`Acknowledge → State what is known → Explain diagnostic principle → State boundary → Verify/validate`

**Readiness Gate:** Handle difficult questions professionally without bluffing or becoming defensive.

---

# Module 22 — Scenario-Based Interview Preparation

## Objective
Convert theory into production decision-making.

### Scenarios
- 22.1 Application is slow
- 22.2 Application is down
- 22.3 Java application will not start
- 22.4 High CPU
- 22.5 High memory
- 22.6 OutOfMemoryError
- 22.7 Connection-pool exhaustion
- 22.8 API returning 503
- 22.9 API timeout
- 22.10 Kubernetes pod restarting
- 22.11 Deployment failed
- 22.12 Kafka consumer lag
- 22.13 Batch job did not execute
- 22.14 Data pipeline failed
- 22.15 Intermittent failure
- 22.16 No obvious error but poor performance
- 22.17 Post-deployment degradation
- 22.18 Multi-service distributed incident
- 22.19 Database latency
- 22.20 Certificate/authentication outage

**Readiness Gate:** Answer scenarios using structured reasoning and survive cross-questioning.

---

# Module 23 — Real Experience / STAR Evidence Bank

## Objective
Build truthful, defensible stories from real experience.

### Evidence Stories
- 23.1 Critical production incident
- 23.2 Performance problem
- 23.3 Security/vulnerability issue
- 23.4 Architecture/design decision
- 23.5 Code-review improvement
- 23.6 Team handling
- 23.7 Client/stakeholder handling
- 23.8 Training/mentoring example
- 23.9 Difficult learner/question
- 23.10 Failure/lesson learned
- 23.11 Learning a new technology quickly
- 23.12 Production prevention/improvement example

### Story Pattern

`Situation → Business Impact → Responsibility → Investigation → Evidence → Decision → Action → Result → Prevention/Learning`

**Readiness Gate:** Every example is truthful, concise, technically defensible, and ready for follow-up.

---

# Module 24 — Gap Defense & Cross-Stack Credibility

## Objective
Handle weaker technologies without damaging the overall profile.

### Questions
- How much SharePoint experience do you have?
- How deep is your .NET production experience?
- Have you administered Snowflake?
- What is your Databricks experience?
- How comfortable are you with Airflow/dbt?
- Can you teach all technologies listed?
- How will you prepare technology-specific labs?
- What if a learner asks something beyond your experience?
- Why should we choose one trainer for this breadth?

### Defense Strategy

`Strong Core → Transferable Troubleshooting Principles → Current Exposure → Preparation Approach → Lab Validation → Honest Boundary`

**Readiness Gate:** No bluffing and no unnecessary weakening of your candidacy.

---

# Module 25 — Interview Scoring Matrix & Readiness Dashboard

## Objective
Measure interview readiness objectively rather than by feeling.

### Score Every P0/P1 Topic from 0–5

| Dimension | Meaning |
|---|---|
| Technical Accuracy | Correctness of the answer |
| Concept Clarity | Can explain simply |
| Practical Tool Knowledge | Knows relevant commands/tools |
| Troubleshooting Reasoning | Uses structured diagnosis |
| Production Relevance | Connects answer to real incidents |
| Evidence / Experience | Can support with real examples |
| Cross-Question Survival | Can defend follow-ups |
| Trainer Confidence | Can teach the topic clearly |

### Score Definition
- **0** — Not prepared
- **1** — Awareness only
- **2** — Basic explanation
- **3** — Working interview answer
- **4** — Strong, scenario-ready answer
- **5** — Expert-level explanation + cross-question + demo readiness

### Minimum Interview Gate
- P0 topics: **minimum 4/5**
- P1 topics: **minimum 3.5/5**
- P2 topics: **minimum 3/5**
- No P0 topic below 3

---

# Module 26 — Full Technical Mock Interview

## Objective
Simulate the actual technical round.

### Round Structure
- Introduction
- Curriculum understanding
- Java/Spring Boot
- JVM diagnostics
- API/integration
- Observability
- SRE/RCA
- .NET/Node
- Kubernetes
- Kafka
- Data platforms
- Rapid scenarios
- Cross-questioning

**Readiness Gate:** Pass the technical mock with structured, defensible answers.

---

# Module 27 — Trainer / Demo Mock Interview

## Objective
Simulate trainer evaluation.

### Round Structure
- Explain a topic
- Whiteboard a topic
- Design a lab
- Handle a participant question
- Handle a wrong learner assumption
- Handle a failed demo
- Explain assessment approach
- Explain mixed-skill handling
- Deliver a 5-minute teaching demo

**Readiness Gate:** Pass as both an engineer and a trainer.

---

# Module 28 — Final Pressure Interview

## Objective
Test confidence and credibility under aggressive follow-up questioning.

### Areas
- Challenge experience claims
- Ask “why?” repeatedly
- Ask for alternatives
- Ask for commands/tools
- Ask for production evidence
- Ask technology comparisons
- Push on weak areas
- Ask client TOC criticism questions
- Ask trainer failure scenarios
- Ask unknown questions

**Readiness Gate:** Remain calm, honest, structured, and technically credible.

---

# Module 29 — Final Sunday Revision Pack

## Objective
Reduce the full preparation into one compact battle-ready revision set.

### Final Revision Items
- 90-second introduction
- Why should we select you?
- Client TOC assessment
- Universal troubleshooting flow
- Java/Spring Boot map
- JVM diagnostic map
- Logs/Metrics/Traces
- API troubleshooting flow
- SRE definitions
- Runtime comparison
- Kubernetes quick map
- Kafka quick map
- Data-platform quick map
- Three strongest production stories
- Ten high-probability scenarios
- Five mini teaching demos
- Gap-defense answers
- Unknown-question handling
- Interview scoring gaps

**Final Gate:** READY / BLOCKED decision before the interview.

---

# Preparation Priority

## P0 — Must Be Strong Before Sunday
1. Opportunity & Client TOC Defense
2. Personal Introduction & Positioning
3. Production Troubleshooting Framework
4. Java / Spring Boot
5. JVM Diagnostics
6. API / Integration
7. Observability
8. Incident Management / RCA / SRE
9. Trainer Methodology
10. Whiteboard Readiness
11. Trainer Audition Demos
12. Scenario Practice
13. Real Experience Stories
14. Gap Defense
15. Difficult Question Handling

## P1 — Strong Working Readiness
1. .NET Operations
2. Node.js Runtime
3. Kubernetes
4. CI/CD
5. Kafka
6. Batch Operations
7. Code Analysis
8. AI-Assisted Operations

## P2 — Interview-Level Operational Awareness
1. Spark / Databricks
2. Snowflake
3. Airflow
4. dbt
5. Azure Data Factory
6. SharePoint

---

# Final Success Criteria

The interview is successful if the panel believes:

> **This trainer understands enterprise production systems, can troubleshoot systematically, can explain difficult concepts simply, can design practical labs, can handle incidents and RCA, and can prepare specialist areas responsibly without bluffing.**

## Interview Win Condition

**Technical Depth + Production Mindset + Teaching Ability + Evidence + Cross-Question Survival + Honest Adaptability**

---

# Locking Rule

Once this V2 TOC is approved:

- Do not add more technologies unless the client provides new requirements.
- Do not expand scope randomly.
- Work module-by-module.
- Finish the readiness gate before moving to the next critical module.
- Prioritize interview conversion over syllabus completion.
