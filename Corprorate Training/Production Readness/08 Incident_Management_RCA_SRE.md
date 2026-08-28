# iRun Corporate Training Interview Preparation
## Module 08 — Incident Management, Root Cause Analysis & SRE

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P0 — Must Be Strong Before Interview  
**Primary Goal:** Demonstrate mature incident ownership, structured RCA, reliability thinking, stakeholder communication, and the ability to teach production engineers how to respond before, during, and after incidents.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain the complete incident lifecycle.
- Distinguish severity, priority, and business impact.
- Triage incidents systematically.
- Know when and how to escalate.
- Explain war-room handling.
- Communicate clearly with technical and business stakeholders.
- Separate service restoration from permanent resolution.
- Perform evidence-based RCA.
- Explain Five Whys and postmortems.
- Define corrective and preventive actions.
- Explain SLI, SLO, SLA, and error budgets.
- Explain MTTD, MTTR, and MTBF.
- Connect observability to incident management.
- Design incident-response labs and simulations.
- Present real incident stories credibly.
- Handle “what would you do first?” production questions under pressure.

The panel should think:

> **“He understands production incidents as business, technical, communication, and learning events — not just debugging exercises.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- Incident lifecycle
- Impact assessment
- Severity vs priority
- Triage
- Escalation
- Major incident management
- War rooms
- Roles and responsibilities
- Communication cadence
- Mitigation vs permanent fix
- Recovery validation
- RCA
- Five Whys
- Postmortem
- Corrective action
- Preventive action
- SLI
- SLO
- SLA
- Error budgets
- MTTD
- MTTR
- MTBF
- Blameless culture
- Reliability mindset
- Incident drills
- Trainer scenario design
- Real experience evidence

---

# 3. Incident Lifecycle

Use this lifecycle:

`Detect → Assess Impact → Classify → Triage → Contain/Mitigate → Restore Service → Validate → Investigate → RCA → Corrective/Preventive Action → Learn → Improve`

This should become natural.

---

# 4. Step 1 — Detect

Incident detection may come from:

- Monitoring alert
- User complaint
- Business metric
- Synthetic test
- Support ticket
- Security alert
- Dependency notification

Good operations teams do not rely only on users to discover problems.

---

# 5. Step 2 — Assess Impact

Ask:

- What business capability is affected?
- How many users?
- Which regions?
- Is data at risk?
- Is security involved?
- Is revenue affected?
- Is there a workaround?
- Is the issue increasing?
- Is an SLA/SLO at risk?

Technical symptom alone does not define severity.

---

# 6. Severity vs Priority

## Severity

How bad is the impact?

Example:

- Sev 1 — Critical widespread outage
- Sev 2 — Major degradation
- Sev 3 — Limited impact
- Sev 4 — Minor issue

Exact definitions vary by organization.

## Priority

How urgently should work be done?

Priority may depend on:

- Business urgency
- regulatory requirement
- customer commitment
- timing

Strong answer:

> “Severity describes impact; priority describes urgency of action. Organizations may define them differently, so I follow the agreed incident policy.”

---

# 7. Triage

Triage means quickly establishing:

- Impact
- Scope
- Symptoms
- Timeline
- Recent changes
- Failing layer
- Owner/team
- Immediate mitigation options

Do not try to complete RCA during initial triage.

---

# 8. Major Incident Roles

Possible roles:

- Incident Commander
- Technical Lead
- Communications Lead
- Service Owner
- Subject Matter Experts
- Scribe / Timeline Recorder

Exact titles vary.

The key is role clarity.

---

# 9. Incident Commander

The Incident Commander typically:

- Maintains control of the incident
- Sets priorities
- Coordinates teams
- Prevents chaotic parallel actions
- Tracks decisions
- Keeps focus on restoration
- Escalates as needed

Important:

The IC does not need to be the deepest technical expert.

---

# 10. War Room

A war room is a coordinated communication channel/session for major incidents.

Good war room behavior:

- Clear owner
- Clear timeline
- One active hypothesis owner
- Evidence shared
- Actions assigned
- Decision log
- Regular status updates
- Avoid side conversations
- Avoid uncoordinated production changes

---

# 11. Escalation

Escalate when:

- Business impact is high
- Time-to-recovery is worsening
- Required access is missing
- Specialist expertise is required
- Security/compliance is involved
- External vendor is involved
- Ownership is unclear
- SLA/SLO breach risk is high

Escalation is not failure.

It is responsible incident management.

---

# 12. Service Restoration vs Root Cause

## Restoration

Get service back safely.

Examples:

- Rollback
- Failover
- Scale out
- Restart
- Disable feature
- Route traffic
- Pause consumer

## Root Cause

Why did the incident happen?

Strong answer:

> “During a major incident, restoration usually takes priority. Once service is stable, we complete deeper root-cause analysis using preserved evidence.”

---

# 13. Mitigation vs Permanent Fix

## Mitigation

Reduces or removes immediate impact.

## Permanent Fix

Removes underlying cause.

Example:

- Restart service = mitigation
- Fix connection leak = permanent fix

Interviewers like this distinction.

---

# 14. Recovery Validation

After service restoration:

- Check health
- Check error rate
- Check latency
- Confirm user transactions
- Check queues/backlogs
- Check dependencies
- Watch for recurrence
- Confirm business metric recovery

Do not declare victory just because process is running.

---

# 15. Stakeholder Communication

Technical teams need details.

Business stakeholders need:

- Impact
- Scope
- Current status
- Workaround
- ETA only if justified
- Next update time
- Risk
- Recovery status

Avoid dumping stack traces into business updates.

---

# 16. Good Incident Update Structure

Use:

`What happened → Who/what is impacted → What we know → What we are doing → Current mitigation → Next update`

Example:

> “Checkout latency is elevated for a subset of users. The application is available, but payment dependency calls are timing out. We have isolated the issue to the payment integration and are routing traffic through the healthy path while the dependency team investigates. The next update will follow after validation of the mitigation.”

---

# 17. Avoid False Certainty

Do not say:

> “The database caused the outage.”

before evidence.

Say:

> “Current evidence points to database connection saturation; we are validating the underlying cause.”

This protects credibility.

---

# 18. Timeline

A strong incident timeline contains:

- First symptom
- Alert
- Deployment/change
- Escalation
- Key evidence
- Mitigation
- Recovery
- Validation

Timeline supports RCA.

---

# 19. Root Cause Analysis

RCA should answer:

1. What happened?
2. Why did it happen?
3. Why did controls not prevent it?
4. Why was detection delayed?
5. What restored service?
6. What permanent action is required?
7. How will recurrence be prevented?

---

# 20. Five Whys

Five Whys is a simple technique to move from symptom toward underlying cause.

Example:

1. Why was API slow?
   - Threads waited for DB connections.
2. Why?
   - Pool was exhausted.
3. Why?
   - Queries were taking too long.
4. Why?
   - New query lacked proper index.
5. Why?
   - Performance validation was missing in deployment process.

Do not force exactly five levels.

The goal is depth, not number.

---

# 21. Technical Root Cause vs Process Root Cause

A mature RCA may identify both.

## Technical

- Missing index
- Memory leak
- bad retry logic
- misconfiguration

## Process/Systemic

- Missing performance test
- weak alert
- insufficient review
- no rollback guardrail
- incomplete runbook

This is senior-level thinking.

---

# 22. Postmortem

A postmortem captures:

- Incident summary
- Impact
- Timeline
- Root cause
- Contributing factors
- Detection
- Response
- What went well
- What did not
- Actions
- Owners
- Due dates

---

# 23. Blameless Postmortem

Blameless means:

> Focus on system/process conditions, not personal punishment.

It does **not** mean:

- No accountability
- No ownership
- Ignore poor decisions

It means learn from context and improve the system.

---

# 24. Corrective vs Preventive Action

## Corrective Action

Fixes identified issue.

Example:

- Add missing DB index.

## Preventive Action

Reduces recurrence risk.

Example:

- Add query performance regression test.
- Add pool saturation alert.
- Add deployment guardrail.

---

# 25. Action Item Quality

Weak:

> “Monitor better.”

Strong:

> “Add alert when DB pool utilization exceeds 90% for 5 minutes, owned by service team, linked to runbook.”

Good actions are:

- Specific
- Owned
- Testable
- Time-bound
- Risk-reducing

---

# 26. SRE — Interview-Level Definition

Site Reliability Engineering applies software engineering principles to operations and reliability.

Common themes:

- Reliability objectives
- Automation
- Observability
- Incident response
- Capacity
- Error budgets
- Toil reduction
- Continuous improvement

---

# 27. SLI

Service Level Indicator.

A measured reliability signal.

Examples:

- Availability
- Successful request rate
- Latency
- Durability

Example:

> 99.95% successful API requests.

---

# 28. SLO

Service Level Objective.

Target for an SLI.

Example:

> 99.9% of requests succeed over 30 days.

---

# 29. SLA

Service Level Agreement.

A formal commitment between provider and customer/business, often with consequences if missed.

Not every SLO is an SLA.

---

# 30. SLI vs SLO vs SLA

Simple:

- **SLI = What we measure**
- **SLO = Target**
- **SLA = Commitment**

This is a must-remember interview answer.

---

# 31. Error Budget

If SLO is 99.9%, allowed unreliability is 0.1%.

Error budget helps balance:

- Reliability
- Release velocity
- Risk

If budget is being consumed too quickly:

- slow risky changes
- prioritize reliability work
- improve controls

---

# 32. Strong Answer — “What Is an Error Budget?”

> “An error budget is the amount of unreliability a service can tolerate while still meeting its SLO. It gives engineering and product teams a practical way to balance feature delivery with reliability. If the budget is being consumed too quickly, we should reduce risk and prioritize reliability improvements.”

---

# 33. MTTD

Mean Time To Detect.

How long it takes to detect an incident.

Improve through:

- Better alerts
- synthetic monitoring
- business metrics
- observability

---

# 34. MTTR

Commonly Mean Time To Restore/Resolve depending on organization.

In interview, clarify terminology if needed.

Operationally:

How quickly service recovers or issue is resolved.

Improve through:

- Runbooks
- automation
- clear ownership
- rollback
- observability
- incident drills

---

# 35. MTBF

Mean Time Between Failures.

Indicator of reliability over time.

Use carefully; applicability differs by system.

---

# 36. Reliability vs Availability

Availability:

> Is service usable?

Reliability:

> Does service consistently perform as expected over time?

Reliability includes more than simple uptime.

---

# 37. Toil

In SRE, toil is repetitive operational work that is manual, predictable, and automatable.

Examples:

- Repeated manual restart
- Repeated log collection
- Manual repetitive deployment checks

Goal:

Reduce through automation and engineering.

---

# 38. Incident Command vs Technical Debugging

Technical lead:

> Finds technical cause.

Incident commander:

> Coordinates incident.

Do not confuse roles.

---

# 39. Scenario 1 — Critical API Outage

Flow:

1. Declare incident.
2. Assess impact.
3. Assign commander/owners.
4. Check recent change.
5. Use observability.
6. Mitigate.
7. Communicate.
8. Validate recovery.
9. Preserve evidence.
10. RCA.
11. Action items.

---

# 40. Scenario 2 — Intermittent Payment Failures

Important:

- Business impact high
- failure not total
- preserve correlation IDs
- identify affected path
- communicate partial degradation
- avoid declaring service healthy based only on uptime

---

# 41. Scenario 3 — Memory Leak Causes Daily Restart

Bad practice:

> “Scheduled restart fixes it.”

Better:

- Restart may mitigate.
- Capture heap evidence.
- Find retention.
- Permanent fix.
- Add memory alert.
- soak test.

This is a good SRE maturity example.

---

# 42. Scenario 4 — Deployment Causes Incident

Check:

- Change correlation
- rollback readiness
- impact
- version comparison

After recovery:

- Why was defect not caught?
- Why did rollout reach all users?
- Canary?
- automated rollback?
- test gap?

---

# 43. Scenario 5 — Monitoring Did Not Alert

RCA includes:

- Technical failure
- Observability gap
- Threshold gap
- Ownership gap

Preventive action:

- Add better SLI-based alerting.

---

# 44. Scenario 6 — Repeated Incident

Repeated incident means previous actions may have been insufficient.

Ask:

- Was RCA correct?
- Were actions completed?
- Did prevention address systemic cause?
- Was action effective?

---

# 45. Corporate Training Angle

Incident management is ideal for simulation.

Do not teach only definitions.

Teach decision-making under pressure.

---

# 46. Lab 1 — Major Incident Simulation

Inject:

- API 503
- error rate spike
- one failed dependency

Assign roles:

- Incident commander
- Technical lead
- Communications lead
- Observer

Evaluate:

- Impact assessment
- Evidence use
- coordination
- updates
- mitigation
- recovery
- RCA

---

# 47. Lab 2 — RCA Workshop

Provide:

- Logs
- Metrics
- timeline
- deployment record

Learners produce:

- Problem statement
- Root cause
- Contributing factors
- Five Whys
- Corrective action
- Preventive action

---

# 48. Lab 3 — SLI/SLO Exercise

Given:

- API traffic
- success rate
- latency

Learners define:

- SLI
- SLO
- error budget

---

# 49. Lab 4 — Bad Alert Review

Provide noisy alert rules.

Learners:

- identify noise
- classify severity
- rewrite alerts
- link runbook
- define owner

---

# 50. Lab 5 — Repeated Incident

Provide previous RCA with weak action:

> “Restart service when memory high.”

Learners improve action to:

- find leak
- alert
- fix code
- regression test
- verify

---

# 51. Whiteboard — Incident Lifecycle

```text
               DETECT
                  |
           ASSESS IMPACT
                  |
             CLASSIFY
                  |
              TRIAGE
                  |
       +----------+----------+
       |                     |
    MITIGATE              COMMUNICATE
       |                     |
       +----------+----------+
                  |
            RESTORE SERVICE
                  |
               VALIDATE
                  |
                 RCA
                  |
      CORRECTIVE + PREVENTIVE
                  |
                LEARN
                  |
               IMPROVE
```

---

# 52. Whiteboard — SLI / SLO / SLA

```text
SLI
What do we measure?
        |
        v
SLO
What target do we want?
        |
        v
SLA
What formal commitment exists?
```

Error Budget:

```text
100% - SLO = Allowed Unreliability
```

---

# 53. 30-Second Explain-on-Demand

> “Incident management is about restoring business service safely while coordinating technical investigation and communication. After recovery, RCA identifies the technical and systemic causes, and SRE practices such as SLOs, error budgets, observability and automation reduce recurrence and improve reliability.”

---

# 54. 5-Minute Trainer Demo

### Topic

**SLI vs SLO vs SLA**

Structure:

1. Simple analogy.
2. SLI = measurement.
3. SLO = target.
4. SLA = commitment.
5. API example.
6. Error budget.
7. Operational decision.
8. Key takeaway.

---

# 55. Strong Answer — “How Do You Handle a Major Production Incident?”

> “I first establish business impact and declare the appropriate incident level. I make sure ownership and communication roles are clear, then the technical team works from evidence while the incident lead coordinates priorities.
>
> Restoration is the first objective, so if a safe rollback, failover or isolation can reduce impact, I would use it while preserving evidence.
>
> Once service is restored, I validate customer and system recovery, reconstruct the timeline, complete RCA and assign specific corrective and preventive actions with owners.”

---

# 56. Strong Answer — “What Makes a Good RCA?”

> “A good RCA explains not only the immediate technical failure, but also why the system allowed it to become an incident, why detection or recovery was delayed, and what changes will reduce recurrence. It should be evidence-based, blameless, and end with specific owned actions rather than vague statements.”

---

# 57. High-Probability Interview Questions

1. Explain incident lifecycle.
2. Severity vs priority?
3. What is triage?
4. When do you escalate?
5. What is a major incident?
6. What is an incident commander?
7. How do you run a war room?
8. Mitigation vs permanent fix?
9. When do you do RCA?
10. What is Five Whys?
11. What is a postmortem?
12. What is blameless RCA?
13. Corrective vs preventive action?
14. What is SRE?
15. What is SLI?
16. What is SLO?
17. What is SLA?
18. What is error budget?
19. What is MTTD?
20. What is MTTR?
21. What is MTBF?
22. What is toil?
23. How do you reduce MTTR?
24. How do you communicate during incidents?
25. How do you teach incident management?
26. Design an incident simulation.
27. Tell me about a real production incident.

---

# 58. Cross-Question Drill

## Q1. Should RCA start before restoration?

Initial evidence collection starts immediately, but deep RCA usually follows stabilization.

## Q2. Is restart a bad action?

No. It can be valid mitigation, but should not replace root-cause investigation.

## Q3. Is blameless culture no accountability?

No. It separates learning from punishment while still assigning clear ownership.

## Q4. Can severity change?

Yes. As impact becomes clearer, classification may change.

## Q5. Is SLA always stricter than SLO?

Not necessarily. Organizations design them differently. Usually internal SLOs are set to support external commitments.

## Q6. What if error budget is exhausted?

Reduce risk, prioritize reliability, and review change/release strategy based on policy.

## Q7. What if root cause cannot be proven?

Document strongest evidence, contributing factors, remaining uncertainty, and actions to improve future detection.

## Q8. Who should communicate to business?

Prefer a designated communication role so technical responders can focus and messaging stays consistent.

## Q9. What if two teams blame each other?

Use shared evidence and incident ownership. Focus on restoring service and validating hypotheses rather than assigning blame.

## Q10. How do you know preventive action worked?

Define measurable validation and review recurrence/telemetry after implementation.

---

# 59. Real Experience Mapping

Prepare truthful stories for:

- Critical production incident
- Application degradation
- Vulnerability remediation
- Deployment issue
- Database/integration issue
- Team coordination
- Stakeholder communication
- RCA/prevention
- Production learning
- Training scenario

Use:

`Situation → Business Impact → Role → Evidence → Decision → Mitigation → Recovery → Root Cause → Prevention`

---

# 60. STAR+RCA Story Format

For incident stories, use:

## Situation
What system/problem?

## Business Impact
Who/what affected?

## Responsibility
What was your role?

## Evidence
What did you inspect?

## Decision
What hypothesis/action?

## Mitigation
How did you restore service?

## Result
What happened?

## RCA
Why did it happen?

## Prevention
What changed afterward?

This is stronger than generic STAR.

---

# 61. Red Flags

Do not:

- Start technical debugging before impact assessment.
- Let war room become uncontrolled discussion.
- Change multiple production variables without coordination.
- Give business stakeholders raw technical noise.
- Call mitigation the root cause.
- Stop after restart.
- Write vague RCA actions.
- Use Five Whys mechanically.
- Blame individuals.
- Promise unrealistic ETA.
- Confuse SLI/SLO/SLA.
- Treat error budget as permission for carelessness.

---

# 62. Quick Revision

## Incident

**Detect → Impact → Triage → Mitigate → Restore → Validate → RCA → Prevent**

## Roles

**Incident Commander coordinates; Technical Lead diagnoses.**

## RCA

**Technical cause + systemic cause + prevention**

## Reliability

**SLI = Measure**  
**SLO = Target**  
**SLA = Commitment**  
**Error Budget = Allowed unreliability**

## Metrics

**MTTD = Detect**  
**MTTR = Restore/Resolve**  
**MTBF = Time between failures**

## Golden Rule

> **Restore first, learn deeply afterward, and prevent recurrence.**

---

# 63. Module 08 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Incident lifecycle | 5 | |
| Business impact assessment | 5 | |
| Severity/priority | 4+ | |
| Triage | 5 | |
| Escalation | 4+ | |
| Incident commander role | 4+ | |
| War-room discipline | 4+ | |
| Stakeholder communication | 5 | |
| Mitigation vs permanent fix | 5 | |
| Recovery validation | 5 | |
| RCA | 5 | |
| Five Whys | 4+ | |
| Blameless postmortem | 4+ | |
| Corrective/preventive actions | 5 | |
| SLI/SLO/SLA | 5 | |
| Error budget | 5 | |
| MTTD/MTTR/MTBF | 4+ | |
| SRE mindset | 4+ | |
| Real incident story | 5 | |
| Whiteboard explanation | 5 | |
| Lab design | 5 | |
| Cross-question survival | 4+ | |

---

# 64. Module 08 Readiness Gate

## PASS only when you can:

- Explain the incident lifecycle without notes.
- Distinguish severity and priority.
- Explain triage and escalation.
- Explain incident commander vs technical lead.
- Explain mitigation vs permanent fix.
- Give a structured stakeholder update.
- Explain RCA and Five Whys.
- Explain blameless postmortem.
- Create strong corrective/preventive actions.
- Explain SLI/SLO/SLA.
- Explain error budgets.
- Explain MTTD/MTTR/MTBF.
- Present at least three truthful incident stories.
- Design a major-incident simulation.
- Draw the incident lifecycle.
- Survive at least 10 follow-up questions.

### Minimum Score

**All critical P0 dimensions ≥ 4/5**

If answers focus only on debugging and ignore impact, coordination, communication, RCA, or prevention, Module 08 remains **BLOCKED**.

---

# 65. Final Module Outcome

After this module, the panel should think:

> **“He can lead and teach production incident response end-to-end — from impact assessment and restoration through RCA, communication, reliability objectives, and prevention.”**

That is the selection goal for Module 08.
