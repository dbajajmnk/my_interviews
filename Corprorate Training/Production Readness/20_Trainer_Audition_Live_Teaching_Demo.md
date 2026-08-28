# iRun Corporate Training Interview Preparation
## Module 20 — Trainer Audition & Live Teaching Demo

**Interview Target:** iRun Application / Production Operations Corporate Trainer  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P1 — Selection-Critical  
**Primary Goal:** Prepare for an on-the-spot trainer audition where the panel asks you to teach a technical topic clearly, practically, and confidently within a strict time window.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Deliver a 3-minute, 5-minute, and 10-minute technical teaching demo.
- Open with a clear learning objective.
- Simplify the topic without weakening technical accuracy.
- Use a quick analogy or mental model.
- Draw a compact whiteboard diagram.
- Explain healthy behavior first.
- Introduce a production failure scenario.
- Ask one learner-style diagnostic question.
- Show evidence-based troubleshooting.
- Close with a memorable takeaway.
- Handle panel interruptions.
- Recover from forgotten terminology.
- Handle a wrong answer from the “learner.”
- Recover from demo/tool failure.
- Avoid over-teaching.
- Score and improve your own audition performance.

The panel should think:

> **“He can teach under pressure, not just answer technical questions.”**

---

# 2. The Audition Mindset

The panel is usually evaluating more than the topic.

They may be evaluating:

- Communication
- Structure
- Depth control
- Confidence
- Practicality
- Accuracy
- learner engagement
- whiteboard skill
- time management
- recovery behavior
- questioning style
- trainer maturity

Therefore:

> **The topic is only the vehicle. Trainer behavior is the real test.**

---

# 3. The Universal 5-Minute Demo Formula

Use this for almost any technical topic:

```text
0:00–0:30  Objective + Why it matters
0:30–1:15  Analogy / Mental model
1:15–2:15  Engineering explanation
2:15–3:15  Production failure scenario
3:15–4:15  Troubleshooting / evidence
4:15–4:45  Learner question
4:45–5:00  Golden takeaway
```

This should become automatic.

---

# 4. The 3-Minute Demo Formula

Use if panel says:

> “Explain quickly.”

```text
0:00–0:20  Definition
0:20–0:50  Why it matters
0:50–1:30  Diagram
1:30–2:20  Production example
2:20–2:50  Troubleshooting point
2:50–3:00  Recap
```

Do not try to teach everything.

---

# 5. The 10-Minute Demo Formula

Use if panel gives more time:

```text
1 min  Objective + audience context
2 min  Mental model + architecture
2 min  Core engineering mechanics
2 min  Demo / failure scenario
2 min  learner interaction / troubleshooting
1 min  Recap + assessment question
```

---

# 6. Strong Demo Opening

Weak:

> “Today I am going to explain Kubernetes readiness probes.”

Strong:

> “By the end of these five minutes, you should be able to explain what readiness means, identify why a Pod may be running but not receiving traffic, and choose the first evidence to inspect.”

This immediately sounds like a trainer.

---

# 7. Strong “Why It Matters”

Example — Readiness:

> “This matters because a process can be alive but still unsafe to receive user traffic. If we confuse readiness with liveness, we can either route traffic to a broken instance or create unnecessary restart loops.”

This connects concept to production.

---

# 8. Analogy Rule

Use analogy for no more than 30–45 seconds.

Then map it technically.

Example:

> “Think of a restaurant. Liveness means the restaurant is open; readiness means the kitchen is actually ready to serve customers.”

Then:

```text
Restaurant Open -> Liveness
Kitchen Ready    -> Readiness
Customer Traffic -> Service Routing
```

Do not leave the answer at analogy level.

---

# 9. Whiteboard Rule

Draw only what supports the lesson.

Example readiness demo:

```text
SERVICE
   |
   v
  POD
 /   \
Live Ready
 |     |
Run?  Traffic?
```

Then add dependency only if needed.

---

# 10. Healthy Flow Before Failure

Example:

```text
Service -> Ready Pod -> App -> DB
```

Then break:

```text
Service -> Pod
           |
        Ready = false
           |
         DB down
```

This makes diagnosis intuitive.

---

# 11. Learner Interaction

Ask one question during a short audition.

Example:

> “If liveness is healthy but readiness is failing, would you restart the Pod first?”

Pause briefly.

Then explain:

> “Not automatically. The process is alive; I would inspect why it cannot safely serve traffic.”

This shows facilitation skill.

---

# 12. Close with a Golden Rule

Every audition should end with one memorable line.

Examples:

- **Readiness:** “Alive does not mean ready.”
- **Kafka lag:** “Lag tells you where you are behind, not why.”
- **Observability:** “Metrics show the symptom; traces show the path; logs explain the detail.”
- **Batch:** “Never rerun until you know what already committed.”
- **AI Ops:** “AI can suggest; engineers must prove.”

---

# 13. Audition Topic 1 — Kubernetes Readiness vs Liveness

## Objective

Learner can distinguish liveness and readiness and troubleshoot a failing probe.

## Analogy

Restaurant open vs kitchen ready.

## Diagram

```text
SERVICE
   |
  POD
 /   \
LIVE READY
```

## Engineering

- Liveness: should process restart?
- Readiness: should traffic be routed?

## Failure

DB unavailable.

App process still alive.

Readiness fails.

## Evidence

- Pod status
- probe result
- app logs
- dependency health

## Learner Question

> “Would increasing probe timeout fix this?”

Expected:

Not if dependency is actually unavailable.

## Golden Rule

> **Alive does not mean ready.**

---

# 14. Audition Topic 2 — Kafka Consumer Lag

## Objective

Learner can explain lag and identify first troubleshooting checks.

## Diagram

```text
Producer -> Topic -> Consumer
             |
          Offset Gap
```

## Engineering

Lag = broker progress minus consumer progress.

## Failure

Downstream DB becomes slow.

Consumer processing rate drops.

## Evidence

- lag by partition
- processing duration
- consumer health
- downstream latency

## Learner Question

> “Should we add more consumers immediately?”

Expected:

Not before validating the bottleneck and partition count.

## Golden Rule

> **Lag is a symptom, not the cause.**

---

# 15. Audition Topic 3 — Logs vs Metrics vs Traces

## Objective

Learner can choose the right evidence source.

## Analogy

- Logs = diary
- Metrics = dashboard
- Traces = journey map

## Diagram

```text
Request
  |
Service A
  |
Service B
  |
DB
```

## Failure

Service B slow.

## Evidence

- Metrics show latency.
- Trace shows slow span.
- Logs show timeout.

## Learner Question

> “If metrics show high latency, do we know root cause?”

Expected:

No.

## Golden Rule

> **Correlate signals; do not diagnose from one signal.**

---

# 16. Audition Topic 4 — API 503 Troubleshooting

## Objective

Learner can troubleshoot 503 without assuming root cause.

## Diagram

```text
Client -> Gateway -> Service -> Pod -> Dependency
```

## Failure

No ready backend.

## Evidence

- Gateway response
- readiness
- service endpoints
- app logs

## Learner Question

> “Does 503 prove application crashed?”

Expected:

No.

## Golden Rule

> **Status code identifies the symptom, not the failing layer.**

---

# 17. Audition Topic 5 — Connection Pool Exhaustion

## Objective

Learner can explain pool exhaustion and avoid the wrong fix.

## Diagram

```text
APP -> CONNECTION POOL -> DB
```

## Failure

Slow DB query holds connections.

## Symptoms

- latency
- timeout
- active connections maxed

## Learner Question

> “Increase pool size?”

Expected:

Only after root cause analysis.

## Golden Rule

> **A full pool tells you connections are busy—not why.**

---

# 18. Audition Topic 6 — Thread Dump vs Heap Dump

## Objective

Learner can choose the correct artifact.

## Diagram

```text
THREAD DUMP -> What threads are doing
HEAP DUMP   -> What objects occupy memory
```

## Failure Examples

- Hang/deadlock -> thread dump
- Memory leak -> heap dump

## Golden Rule

> **Choose the diagnostic artifact based on the hypothesis.**

---

# 19. Audition Topic 7 — SLI vs SLO vs SLA

## Objective

Learner can distinguish the three.

## Analogy

- SLI = score
- SLO = target
- SLA = commitment

## Diagram

```text
SLI -> SLO -> SLA
```

## Example

- SLI: API success rate
- SLO: 99.9%
- SLA: customer commitment

## Golden Rule

> **Measure → Target → Commit.**

---

# 20. Audition Topic 8 — CrashLoopBackOff

## Objective

Learner can diagnose repeated container restart.

## Diagram

```text
Pod -> Container -> App -> Exit -> Restart
```

## Evidence

- previous logs
- events
- exit reason
- config
- secret
- probes
- resources

## Learner Question

> “Should we restart the Pod manually?”

Expected:

Kubernetes is already restarting it; diagnose why it exits.

## Golden Rule

> **CrashLoopBackOff is a loop; the task is to find the exit reason.**

---

# 21. Audition Topic 9 — Batch Safe Rerun

## Objective

Learner can explain why rerun requires state awareness.

## Diagram

```text
Input -> Process -> Commit -> Checkpoint -> Reconcile
```

## Failure

8,000/10,000 records committed.

## Learner Question

> “Can we rerun from zero?”

Expected:

Only if operation is safely idempotent.

## Golden Rule

> **Know what committed before you rerun.**

---

# 22. Audition Topic 10 — AI-Assisted Incident Analysis

## Objective

Learner can use AI safely in operations.

## Diagram

```text
Evidence -> AI -> Hypothesis -> Human Verify -> Action
```

## Failure

AI says “database root cause” from timeout log.

## Learner Question

> “Can we accept the AI conclusion?”

Expected:

No; validate.

## Golden Rule

> **AI accelerates investigation; it does not replace proof.**

---

# 23. How to Handle Panel Interruptions

If interrupted:

1. Stop immediately.
2. Listen.
3. Answer directly.
4. Reconnect to demo only if useful.

Example:

> “Yes, and that is exactly why readiness should not be treated as liveness. Coming back to the failure path…”

Do not sound irritated.

---

# 24. If Panel Says “Go Deeper”

Add one layer:

- mechanism
- runtime behavior
- trade-off
- edge case

Do not suddenly dump everything.

---

# 25. If Panel Says “Simplify”

Remove:

- product internals
- jargon
- edge cases

Keep:

- purpose
- analogy
- one diagram
- one example

---

# 26. If Panel Says “Give a Real Example”

If it is real experience:

Use it.

If not:

Say:

> “A representative production scenario would be…”

Never convert an illustrative scenario into fake personal experience.

---

# 27. If You Forget a Term

Do not freeze.

Say:

> “The exact product term is escaping me, but the component I mean is the one responsible for X. I would verify the exact label rather than guess.”

Then continue.

---

# 28. If You Make a Technical Error

Correct it openly:

> “Let me correct that point. Readiness removes the Pod from traffic; it does not normally restart it. Restart behavior belongs to liveness.”

This increases trust.

---

# 29. If Demo Tool Fails

Option 1:
Turn it into troubleshooting.

Option 2:
Use fallback evidence.

Option 3:
Whiteboard expected behavior.

Do not spend the full audition fighting the tool.

---

# 30. If Panel Plays a Difficult Learner

They may intentionally challenge:

> “That is not how we do it.”

Respond:

> “That is fair. Let us separate the underlying engineering principle from the implementation choice. In your environment, what constraint drives the different approach?”

This shows classroom maturity.

---

# 31. If Panel Gives Wrong Answer

Do not embarrass them.

Use:

> “That is a common interpretation. The important distinction is…”

Then explain.

---

# 32. If Nobody Responds to Your Question

Do not wait awkwardly.

Say:

> “A common first instinct is to restart the Pod. Let us test whether that actually addresses the failure.”

Continue smoothly.

---

# 33. Timing Control

Use visible mental checkpoints.

At 2 minutes:

> “Now we understand the mechanism.”

At 4 minutes:

> “Let us finish with how we diagnose it.”

Do not run over unless panel asks.

---

# 34. Voice & Presence

Aim for:

- Calm pace
- Short sentences
- intentional pauses
- no filler words
- eye contact
- confident but not theatrical tone

Avoid speaking faster because time is short.

---

# 35. Body Language

When whiteboarding:

- Face panel when speaking.
- Turn to board only while drawing.
- Step aside after diagram.
- Point to flow while explaining.

Do not talk to the board.

---

# 36. Marker / Whiteboard Technique

Use:

- Large labels
- 3–7 components maximum
- arrows
- one X for failure
- one number sequence if needed

Do not create artwork.

---

# 37. Virtual Interview Adaptation

If no physical board:

Use verbal whiteboard:

> “Imagine a simple flow: client, gateway, service, database. I would place the failure between service and database…”

If drawing tool is available, keep it minimal.

---

# 38. Five-Minute Demo Scoring Matrix

Score each 0–5:

| Dimension | Target |
|---|---:|
| Objective clarity | 5 |
| Answer relevance | 5 |
| Simple mental model | 5 |
| Technical accuracy | 5 |
| Production relevance | 5 |
| Diagram clarity | 5 |
| Learner interaction | 4+ |
| Troubleshooting reasoning | 5 |
| Time control | 5 |
| Golden takeaway | 5 |
| Confidence | 5 |
| Recovery behavior | 5 |

---

# 39. Self-Practice Protocol

For each audition topic:

1. Deliver once without notes.
2. Record.
3. Score yourself.
4. Redeliver.
5. Reduce filler.
6. Improve diagram.
7. Add one learner question.
8. Ensure time ≤ 5:15.

Repeat until natural.

---

# 40. The “Cold Topic” Drill

Ask someone/randomizer to give you a topic from the TOC.

You get:

**30 seconds preparation**

Then teach for:

**5 minutes**

This is the strongest simulation of an actual trainer audition.

---

# 41. The “No Analogy” Drill

Teach same topic without analogy.

Purpose:

Ensure analogy is helping rather than carrying your understanding.

---

# 42. The “No Whiteboard” Drill

Teach same topic verbally.

Purpose:

Prepare for virtual interviews or panel constraints.

---

# 43. The “Interrupt Me” Drill

Have someone interrupt at:

- minute 1
- minute 3
- minute 4

Answer, then continue.

This trains composure.

---

# 44. The “Wrong Learner Answer” Drill

Example:

Trainer:
> “What would you check first?”

Learner:
> “Restart the service.”

Respond:

> “That may restore service temporarily. Before doing that, what evidence would we want to preserve so we do not destroy the diagnostic trail?”

Excellent trainer move.

---

# 45. Audition Preparation Priority

Before interview, master at least these five:

1. Logs vs Metrics vs Traces
2. Kubernetes Readiness vs Liveness
3. API 503 Troubleshooting
4. Connection Pool Exhaustion
5. SLI vs SLO vs SLA

Then secondary:

6. Kafka Consumer Lag
7. Thread vs Heap Dump
8. CrashLoopBackOff
9. Safe Batch Rerun
10. AI-Assisted Incident Analysis

---

# 46. High-Probability Panel Prompts

- “Teach me any topic from the curriculum.”
- “Explain this as if I am a beginner.”
- “Now explain it to a senior engineer.”
- “Can you whiteboard it?”
- “Give me a production example.”
- “How would you create a lab?”
- “Ask me a question as your learner.”
- “What if your demo fails?”
- “How do you know I understood?”
- “You have five minutes—go.”

---

# 47. Cross-Question Drill

## Q1. Why include a learner question in a five-minute demo?

Because teaching should reveal learner thinking, not only transmit content.

## Q2. Why not show a full live tool demo?

In a short audition, concept clarity and trainer skill matter more; tool demos can introduce avoidable timing risk.

## Q3. Should the demo topic be your hardest technology?

No. Choose a topic where you can demonstrate both technical depth and teaching skill confidently.

## Q4. Is analogy mandatory?

No. Use it only when it improves clarity.

## Q5. What if panel already knows the topic deeply?

Keep the explanation concise, then move into failure modes and trade-offs.

## Q6. What if panel asks a deep edge case?

Answer if confident; otherwise state the boundary and verify rather than bluff.

## Q7. Should you use slides?

Only if explicitly expected. Whiteboard/verbal explanation is usually stronger for spontaneous audition.

## Q8. What is the best final sentence?

A short engineering rule that compresses the lesson.

---

# 48. Red Flags

Do not:

- Spend 2 minutes introducing the topic.
- Read a memorized speech.
- Draw a complex architecture.
- Use jargon before mental model.
- Skip production relevance.
- Skip learner interaction.
- Run over time.
- Fight with demo tools.
- Bluff a cross-question.
- become defensive when challenged.
- Finish without recap.

---

# 49. Quick Revision

**Audition Flow:** Objective → Model → Engineering → Failure → Diagnose → Question → Rule

**Timing:** 30s + 45s + 60s + 60s + 60s + 30s + 15s

**Panel interruption:** Stop → Answer → Resume

**Unknown:** State boundary → Explain principle → Verify

**Demo failure:** Troubleshoot or fallback

**Golden Rule:** The panel is assessing the trainer, not only the topic.

---

# 50. Module 20 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| 3-minute demo | 5 | |
| 5-minute demo | 5 | |
| 10-minute demo | 4+ | |
| Objective opening | 5 | |
| Mental model | 5 | |
| Technical accuracy | 5 | |
| Production scenario | 5 | |
| Learner interaction | 5 | |
| Troubleshooting explanation | 5 | |
| Whiteboard clarity | 5 | |
| Time management | 5 | |
| Interruption handling | 5 | |
| Demo-failure recovery | 5 | |
| Unknown handling | 5 | |
| Golden takeaway | 5 | |
| Trainer confidence | 5 | |

---

# 51. Module 20 Readiness Gate

## PASS only when you can:

- Deliver five different 5-minute demos without notes.
- Deliver one topic in 3, 5, and 10-minute versions.
- Draw every demo with 3–7 components.
- Ask at least one learner question naturally.
- Include a production failure scenario.
- Explain how to diagnose the failure.
- Finish within time.
- Handle an interruption without losing structure.
- Correct a technical mistake calmly.
- Recover from an imagined demo failure.
- Handle at least 10 audition cross-questions.

### Minimum Score

**Selection-critical target: average ≥ 4.5/5, with technical accuracy, time control, unknown handling, and trainer confidence at 5/5.**

If the demo sounds like a lecture rather than an interactive production lesson, Module 20 remains **BLOCKED**.

---

# 52. Final Module Outcome

After this module, the panel should think:

> **“He can be given almost any topic from the program and immediately turn it into a clear, practical, interactive, production-focused mini-session without slides, bluffing, or losing control of time.”**

That is the selection goal for Module 20.
