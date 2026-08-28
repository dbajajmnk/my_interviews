# iRun Corporate Training Interview Preparation
## Module 26 — Technical Mock Interview

**Interview Target:** iRun Application / Production Operations Corporate Trainer  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P0 — Final Validation  
**Primary Goal:** Simulate a realistic technical interview across the locked curriculum, test cross-question survival, expose weak areas, and determine whether technical preparation is genuinely selection-ready.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Answer technical questions without notes.
- Handle production scenarios under time pressure.
- Move from concept to engineering depth.
- Explain troubleshooting in a structured way.
- Handle cross-stack questions.
- Defend stronger and weaker areas honestly.
- Whiteboard when asked.
- Survive follow-up questions.
- Correct yourself cleanly.
- Avoid bluffing.
- Maintain concise, senior-level communication.
- Receive an objective technical readiness score.

The panel should think:

> **“He can handle a broad production-operations interview without collapsing under follow-up pressure.”**

---

# 2. Mock Interview Format

Recommended duration:

**60–75 minutes**

Structure:

```text
Round 1 — Introduction & Positioning        5 min
Round 2 — Core Technical Concepts          15 min
Round 3 — Production Scenarios             20 min
Round 4 — Runtime / Platform Deep Dive     10 min
Round 5 — Cross-Stack Gap Questions        10 min
Round 6 — Whiteboard / Explain-on-Demand   10 min
Round 7 — Rapid-Fire Cross Questions        5 min
```

---

# 3. Mock Rules

During the mock:

- No notes.
- No searching.
- Initial answers should usually stay within 60–90 seconds.
- Cross-questions should be answered in 20–45 seconds unless deeper explanation is requested.
- If you do not know, state the boundary.
- If you make a mistake, correct it immediately.
- Do not invent experience.
- Do not jump to restart/scale/timeout changes without evidence.

---

# 4. Scoring Dimensions

Score each 0–5.

| Dimension | Target |
|---|---:|
| Technical Accuracy | 5 |
| Concept Clarity | 5 |
| Engineering Depth | 4+ |
| Production Relevance | 5 |
| Troubleshooting Reasoning | 5 |
| Cross-Question Survival | 5 |
| Whiteboard Ability | 4+ |
| Gap Honesty | 5 |
| Confidence / Conciseness | 5 |
| Trainer Relevance | 4+ |

---

# 5. Round 1 — Introduction & Positioning

## Q1. Tell me about yourself.

Target:
60–90 seconds.

Must include:

- Senior enterprise engineering
- backend/cloud/integration
- production troubleshooting
- corporate training
- relevance to iRun

### Cross-Q
- What is your strongest technical area?
- What is your weakest area in this curriculum?
- Why should we select you?
- Are you an expert in all technologies?

---

# 6. Round 2 — Core Technical Concepts

## Q2. Explain Spring Boot startup flow.

Cross-Q:
- What can fail during bean creation?
- How do profiles affect production?
- How do you troubleshoot “works locally but fails in production”?

---

## Q3. Explain JVM heap vs stack.

Cross-Q:
- High memory means leak?
- Thread dump vs heap dump?
- What if container is OOMKilled but heap looks fine?

---

## Q4. Logs vs Metrics vs Traces?

Cross-Q:
- Which would you check first for latency?
- Can traces replace logs?
- What if dashboard is green but users complain?

---

## Q5. Liveness vs Readiness?

Cross-Q:
- Can readiness failure restart a Pod?
- What if dependency is unavailable?
- Why can bad probe design be dangerous?

---

## Q6. Consumer Lag?

Cross-Q:
- Add more consumers?
- What if one partition has all the lag?
- What causes rebalancing?

---

# 7. Round 3 — Production Scenarios

## Scenario 1 — API Is Slow

Prompt:

> “Users report that one API is taking 8–10 seconds. There are no obvious application errors. Walk me through your investigation.”

Expected structure:

Impact → Scope → Change → Metrics → Traces → Dependencies → Runtime → Hypothesis → Validate → Mitigate

Cross-Q:
- CPU is normal. What next?
- DB is also normal.
- Only one Pod is affected.
- How do you prove recovery?

---

## Scenario 2 — 503 After Deployment

Prompt:

> “Immediately after a new release, users receive intermittent 503 responses.”

Expected:

- Compare deployment timing.
- gateway/backend readiness.
- new vs old replicas.
- application startup.
- dependencies.
- rollback if safe.

Cross-Q:
- Would you restart?
- Would you rollback?
- What if old Pods are healthy and new Pods are not?

---

## Scenario 3 — Java Memory Growth

Prompt:

> “Heap usage keeps growing during the day and service restarts every night.”

Expected:

- Trend.
- GC baseline.
- heap dump.
- retained objects.
- restart = mitigation.
- permanent fix.

Cross-Q:
- Increase Xmx?
- What if memory returns after GC?
- What if RSS is high but heap is not?

---

## Scenario 4 — Kafka Lag

Prompt:

> “Consumer lag is steadily increasing during peak traffic.”

Expected:

- producer rate.
- consumer rate.
- lag by partition.
- dependencies.
- retries.
- resources.
- partition count.

Cross-Q:
- Add consumers?
- What if there are already more consumers than partitions?
- What if lag is only on one partition?

---

## Scenario 5 — Batch Failure at 80%

Prompt:

> “A nightly batch fails after processing 80% of records.”

Expected:

- What committed?
- checkpoint.
- idempotency.
- partial side effects.
- safe replay.
- reconciliation.

Cross-Q:
- Can we rerun from start?
- What if external API side effects already happened?
- How do you prove completion?

---

# 8. Round 4 — Runtime / Platform Deep Dive

## Q7. High CPU in Java.

Expected:

- verify sustained.
- workload/change.
- process/thread.
- JFR/thread dump.
- GC.
- hot code.

Cross-Q:
- One thread is hot. What next?
- CPU high but latency normal?
- When would scaling be valid?

---

## Q8. Node.js event-loop blocking.

Cross-Q:
- Is Node.js single-threaded?
- Does async/await move CPU work to another thread?
- How do you detect event-loop lag?

---

## Q9. .NET ThreadPool starvation.

Cross-Q:
- Can CPU stay low?
- Which tools help?
- How is this similar/different from JVM thread issues?

---

## Q10. Kubernetes CrashLoopBackOff.

Cross-Q:
- What evidence first?
- Why previous logs?
- What if exit reason is OOMKilled?

---

# 9. Round 5 — Cross-Stack Gap Questions

## Q11. How deep is your .NET experience?

Expected:
Honest JVM-to-.NET mapping, no overclaim.

---

## Q12. Have you supported Kafka in production?

Expected:
Direct/Adjacent/Learned answer.

---

## Q13. Can you teach Snowflake?

Expected:
Operational depth + boundary.

---

## Q14. How would you troubleshoot Airflow DAG failure?

Expected:
DAG/scheduler/task/dependency/logs/retry.

---

## Q15. SharePoint user cannot access a file.

Expected:
identity → permission → inheritance → least privilege.

---

# 10. Round 6 — Whiteboard / Explain-on-Demand

Panel chooses any two.

## Option A — API Troubleshooting

Draw:

```text
Client -> Gateway -> Service -> DB/API
```

Then explain:
- healthy flow
- 503
- evidence
- recovery

---

## Option B — Kubernetes

Draw:

```text
Ingress -> Service -> Pod -> App -> DB
```

Explain:
- readiness
- liveness
- CrashLoopBackOff

---

## Option C — Kafka

Draw:

```text
Producer -> Topic/Partitions -> Consumer Group
```

Explain:
- offset
- lag
- ordering
- replay

---

## Option D — Incident Lifecycle

Draw:

```text
Detect -> Triage -> Mitigate -> Restore -> RCA -> Prevent
```

Explain:
- impact
- mitigation vs fix
- validation

---

# 11. Round 7 — Rapid-Fire Questions

Answer in 20–30 seconds each.

1. 401 vs 403?
2. 502 vs 503 vs 504?
3. Thread dump vs heap dump?
4. Xms vs Xmx?
5. Readiness vs liveness?
6. ConfigMap vs Secret?
7. Retry vs circuit breaker?
8. At-least-once means?
9. SLI vs SLO vs SLA?
10. MTTR?
11. What is idempotency?
12. What is data skew?
13. What is OpenTelemetry?
14. What is connection-pool exhaustion?
15. What is RCA?

---

# 12. Pressure Cross-Questions

Use these after any answer:

- Why?
- What evidence proves that?
- What if CPU is normal?
- What if logs are empty?
- What changed?
- What is your first action?
- What is the safest mitigation?
- How do you know it is fixed?
- What would you prevent afterward?
- Have you done this personally?

---

# 13. Technical Mock Red Flags

Immediate deductions if you:

- Guess an exact product detail.
- Invent production experience.
- Say “restart first.”
- Treat symptom as root cause.
- Ignore business impact.
- Skip validation.
- confuse readiness/liveness.
- overclaim Kafka/Snowflake/SharePoint depth.
- give unsafe production action.
- become defensive.

---

# 14. Strong Answer Pattern

Use:

```text
1. Direct answer
2. Reason
3. Evidence
4. Production implication
5. Stop
```

Do not keep talking after the answer is complete.

---

# 15. Scenario Answer Pattern

Use:

```text
Impact
Scope
Recent Change
Health
Logs / Metrics / Traces
Dependencies
Runtime / Platform
Hypothesis
Validate
Mitigate
Recovery Validation
RCA
Prevention
```

---

# 16. Cross-Question Pattern

For “Why?”:

> “Because this check gives me X information and helps eliminate Y hypothesis.”

For “What next?”:

> Give the next highest-information, lowest-risk diagnostic step.

For “How do you know?”:

> Use measurable recovery evidence.

---

# 17. Mock Scorecard

| Area | Score /5 |
|---|---:|
| Introduction | |
| Java / Spring Boot | |
| JVM Diagnostics | |
| APIs / Integration | |
| Observability | |
| Kubernetes | |
| Kafka | |
| Batch | |
| Incident / SRE | |
| .NET | |
| Node.js | |
| Data Platforms | |
| SharePoint | |
| AI Ops | |
| Cross-Questions | |
| Whiteboard | |
| Gap Handling | |
| Confidence | |

---

# 18. Weighted Technical Score

Suggested:

```text
Core P0 Technical          35%
Production Scenarios       25%
Cross-Question Survival    15%
Runtime / Platform         10%
Gap Handling                5%
Whiteboard                  5%
Confidence / Conciseness    5%
```

---

# 19. Technical Mock Result Bands

## 4.5–5.0 — Selection Grade
Strong.

## 4.0–4.49 — Ready
Minor refinement.

## 3.5–3.99 — At Risk
Target weak areas.

## 3.0–3.49 — Weak
Substantial mock practice needed.

## Below 3.0 — Blocked
Do not consider technical preparation complete.

---

# 20. Retest Rule

For any section below target:

1. Identify exact weak dimension.
2. Review only that topic.
3. answer three questions.
4. solve one scenario.
5. handle three cross-questions.
6. retest.

Do not reread the whole module.

---

# 21. Mock 2 Variation

On second technical mock:

- Change question order.
- Change scenario details.
- Add false-premise questions.
- Add product-specific gap questions.
- Reduce thinking time.

This prevents memorized performance.

---

# 22. Final Technical Readiness Gate

## PASS only when:

- Overall technical mock ≥ 4/5.
- All P0 technical sections ≥ 4/5.
- Cross-Question Survival ≥ 4/5.
- Gap Honesty = 5/5.
- Production Safety = 5/5.
- No invented experience.
- At least two whiteboard topics delivered cleanly.
- At least five scenarios solved without notes.
- Rapid-fire accuracy ≥ 80%.

### Selection-Grade Target

**Overall ≥ 4.5/5**

---

# 23. Final Module Outcome

After Module 26, we should know:

> **“Can he actually perform technically in the interview, under pressure, without notes?”**

If yes, technical preparation is READY.

If not, the mock score—not confidence—determines the next revision target.
