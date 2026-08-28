# iRun Corporate Training Interview Preparation
## Module 07 — Observability, Logging & Telemetry

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P0 — Must Be Strong Before Interview  
**Primary Goal:** Demonstrate strong observability thinking and the ability to teach engineers how to correlate logs, metrics, traces, health signals, and telemetry to diagnose production incidents.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain monitoring vs observability.
- Distinguish logs, metrics, and traces.
- Explain when each signal is useful.
- Correlate telemetry during production troubleshooting.
- Explain correlation IDs and distributed tracing.
- Understand OpenTelemetry at interview depth.
- Explain Azure Monitor and Application Insights concepts.
- Explain Prometheus and Grafana concepts.
- Use Golden Signals, RED, and USE methods.
- Design useful dashboards and alerts.
- Avoid noisy or meaningless monitoring.
- Teach observability through practical incident labs.
- Whiteboard telemetry flow.
- Survive scenario-based cross-questions.

The panel should think:

> **“He understands observability as a diagnostic system, not just a collection of dashboards.”**

---

# 2. What the Client May Evaluate

The interviewer may test:

- Monitoring vs observability
- Logs
- Metrics
- Traces
- Correlation IDs
- Structured logging
- Log levels
- Centralized logging
- Distributed tracing
- OpenTelemetry
- Azure Monitor
- Application Insights
- Prometheus
- Grafana
- Dashboards
- Alerts
- Golden Signals
- RED method
- USE method
- Telemetry correlation
- Alert fatigue
- Production troubleshooting from telemetry
- Practical lab design

---

# 3. Monitoring vs Observability

## Monitoring

Answers known questions.

Example:

- Is CPU above 80%?
- Is service unavailable?
- Is latency above threshold?

## Observability

Helps understand unknown internal state from external signals.

Example:

> “Why did only one class of requests become slow after deployment?”

## Strong Interview Answer

> “Monitoring tells me whether predefined conditions are healthy or unhealthy. Observability helps me investigate why the system behaves the way it does by correlating logs, metrics, traces, and other telemetry.”

---

# 4. The Three Core Signals

## Logs

Answer:

> **What happened?**

Useful for:

- Exceptions
- Error details
- Business events
- Security events
- Startup failures
- Dependency failures

## Metrics

Answer:

> **How much? How often? How bad?**

Useful for:

- CPU
- Memory
- Error rate
- Request rate
- Latency
- Queue depth
- Thread count
- Connection pool utilization

## Traces

Answer:

> **Where did the request spend time or fail?**

Useful for:

- Distributed systems
- Cross-service latency
- Dependency failure
- Request path analysis

---

# 5. Strong Answer — “Logs vs Metrics vs Traces?”

> “Logs provide detailed event context, metrics show quantitative system behavior over time, and traces show the end-to-end path of a request across services.
>
> In production I rarely rely on only one. For example, metrics may show latency increased, traces identify the slow downstream call, and logs explain the exact dependency error.”

---

# 6. Structured Logging

Structured logs store fields rather than only free-text messages.

Example fields:

- Timestamp
- Service
- Environment
- Severity
- Correlation ID
- Request ID
- User/session
- Error code
- Operation

Benefits:

- Easier search
- Filtering
- Aggregation
- Correlation
- Automation

---

# 7. Log Levels

Common levels:

- TRACE
- DEBUG
- INFO
- WARN
- ERROR
- FATAL / CRITICAL depending on platform

Production principle:

> Log enough to diagnose, but avoid unnecessary noise, cost, performance overhead, and sensitive data.

---

# 8. Correlation ID

A correlation ID follows one logical request across multiple services.

Example:

```text
Client Request
   |
Correlation ID = abc123
   |
Gateway
   |
Service A
   |
Service B
   |
Database
```

Search all logs for `abc123` to reconstruct request path.

---

# 9. Request ID vs Correlation ID

Depending on system design:

- Request ID may identify one request/hop.
- Correlation ID may identify a larger transaction across services.

Terminology varies.

Strong answer:

> “What matters is consistent propagation so engineers can connect events belonging to the same transaction.”

---

# 10. Distributed Tracing

A distributed trace contains:

- Trace
- Spans
- Parent-child relationships
- Timing
- Attributes
- Status/errors

Example:

```text
Trace: Checkout
  |
  +-- Gateway       20 ms
  |
  +-- Order API     50 ms
  |
  +-- Payment API  900 ms
  |
  +-- Database      40 ms
```

Immediately shows where latency concentrates.

---

# 11. Span

A span represents one operation in a trace.

Examples:

- HTTP request
- DB query
- external API call
- queue processing

Useful fields:

- Start/end time
- Service
- Operation
- Status
- Attributes
- Error

---

# 12. OpenTelemetry

OpenTelemetry is a vendor-neutral observability framework for generating, collecting, and exporting telemetry.

Common signals:

- Traces
- Metrics
- Logs

Core concepts:

- Instrumentation
- SDK
- Collector
- Exporter
- Backend

---

# 13. OpenTelemetry Mental Model

```text
APPLICATIONS
    |
Instrumentation
    |
OpenTelemetry SDK
    |
Collector
    |
+----------+----------+----------+
|          |          |          |
Logs     Metrics    Traces
|          |          |
Observability Backend(s)
```

Value:

> Instrument once, export to compatible backends.

---

# 14. Strong Answer — “Why OpenTelemetry?”

> “OpenTelemetry provides a vendor-neutral way to instrument applications and collect telemetry. It reduces tight coupling between application instrumentation and a specific observability vendor, while giving consistent context propagation across logs, metrics, and traces.”

---

# 15. Azure Monitor

At interview depth, understand Azure Monitor as Azure’s monitoring platform for collecting, analyzing, and acting on telemetry from applications and infrastructure.

Typical concepts:

- Metrics
- Logs
- Alerts
- Dashboards/workbooks
- Resource monitoring

---

# 16. Application Insights

Application Insights focuses on application performance monitoring.

Typical use:

- Request rate
- Response time
- Failures
- Dependencies
- Exceptions
- Traces
- Availability
- Application maps

Strong operational use:

> Correlate application request performance with dependency behavior.

---

# 17. Prometheus

Prometheus is commonly used for metrics collection and time-series monitoring.

Concepts:

- Metrics
- Labels
- Scraping
- Targets
- Time series
- Alerting integration

Good interview positioning:

> “Prometheus is primarily metrics-oriented; I would pair it with visualization/alerting and other telemetry systems as required.”

---

# 18. Grafana

Grafana is commonly used to visualize and explore metrics and other telemetry sources.

Use for:

- Dashboards
- Trends
- Correlation
- Operational views

Do not present Grafana as the metric collector itself.

---

# 19. Dashboard Design

A dashboard should answer operational questions.

Weak dashboard:

- 50 charts
- no context
- no thresholds
- no business meaning

Strong dashboard:

- Availability
- Error rate
- Latency
- Traffic
- Saturation
- Dependency health
- Recent deployment/change

---

# 20. Alert Design

Good alert:

- Actionable
- Meaningful
- Severity-aligned
- Low noise
- Context-rich
- Linked to runbook

Bad alert:

- Triggers constantly
- No owner
- No action
- Too sensitive
- Duplicated

---

# 21. Alert Fatigue

Occurs when engineers receive too many low-value alerts.

Consequences:

- Alerts ignored
- slower response
- reduced trust

Mitigation:

- Better thresholds
- Deduplication
- Correlation
- Severity levels
- SLO-based alerting
- Actionability review

---

# 22. Golden Signals

Common four Golden Signals:

1. Latency
2. Traffic
3. Errors
4. Saturation

Useful for service-level health.

---

# 23. RED Method

Common for request-driven services:

- **R — Rate**
- **E — Errors**
- **D — Duration**

Question:

> How many requests, how many failed, and how long did they take?

---

# 24. USE Method

Common for infrastructure/resources:

- **U — Utilization**
- **S — Saturation**
- **E — Errors**

Example:

CPU:
- utilization
- runnable queue
- errors

Disk:
- utilization
- I/O wait
- errors

---

# 25. Golden Signals vs RED vs USE

## Golden Signals

General service health.

## RED

Request-oriented services.

## USE

Resource-oriented troubleshooting.

Strong answer:

> “I choose the model based on what I am observing. RED is excellent for APIs, USE for infrastructure resources, and Golden Signals provide a broad reliability view.”

---

# 26. Telemetry Correlation

Example incident:

- Metrics: API latency increased at 10:15.
- Trace: Payment API span increased from 100 ms to 2 sec.
- Logs: Payment dependency timeout started at 10:15.
- Deployment event: dependency config changed at 10:10.

This gives a coherent hypothesis.

---

# 27. Strong Answer — “Application Is Slow. How Do You Use Observability?”

> “I would first check latency, error rate, traffic, and saturation to determine scope and timing. Then I would use traces to identify where request time is being spent and inspect logs for the affected service or dependency using correlation IDs.
>
> I would also compare the timing against deployments or configuration changes. That gives me an evidence chain rather than relying on one dashboard.”

---

# 28. Symptom vs Signal vs Root Cause

Example:

- Symptom: users report slow checkout.
- Signal: latency metric high.
- Trace: payment span slow.
- Log: payment timeout.
- Root cause: downstream service DB connection pool exhausted.

Telemetry helps narrow the path but does not automatically prove root cause.

---

# 29. Health Check vs Observability

Health check tells:

> “Am I healthy?”

Observability tells:

> “Why am I unhealthy or degraded?”

Do not confuse them.

---

# 30. Business Metrics

Technical observability becomes stronger when connected to business outcomes.

Examples:

- Checkout success rate
- Orders/minute
- Failed payments
- Login success
- Batch records processed

This helps prioritize incidents.

---

# 31. Cardinality

Metrics labels with too many unique values can cause high cardinality.

Example bad label:

- user ID
- request ID

Operational effects:

- Cost
- storage
- performance

Interview depth:

Know the concept; no need for deep backend internals.

---

# 32. Sampling

Tracing every request may be expensive.

Sampling controls volume.

Types conceptually:

- Head sampling
- Tail sampling

Important:

Sampling strategy should preserve useful incident evidence.

---

# 33. Retention

Telemetry retention depends on:

- Compliance
- cost
- troubleshooting needs
- audit requirements
- volume

Do not assume “keep everything forever.”

---

# 34. Sensitive Data

Logs/traces may accidentally capture:

- Passwords
- Tokens
- PII
- secrets
- payment data

Trainer principle:

> Observability must include security and privacy discipline.

---

# 35. Scenario 1 — Error Rate Suddenly Increases

Check:

- Time of increase
- affected endpoint
- deployment
- status-code distribution
- traces
- exception logs
- dependency errors
- resource saturation

---

# 36. Scenario 2 — Latency High but Error Rate Normal

Possible causes:

- slow dependency
- DB query
- connection pool waiting
- GC
- thread saturation
- network
- traffic increase

Use traces and metrics.

---

# 37. Scenario 3 — CPU High but Latency Normal

Could be:

- expected workload
- background processing
- inefficient process
- capacity warning

Not automatically an incident.

Observe trend and headroom.

---

# 38. Scenario 4 — Users Report Errors but Dashboard Is Green

Possible causes:

- dashboard aggregates too broadly
- missing endpoint metric
- health endpoint not representative
- one region/instance affected
- sampling gap
- wrong alert threshold

Lesson:

> Dashboard is a model of reality, not reality itself.

---

# 39. Scenario 5 — Logs Show Errors but No User Impact

Possible:

- handled/retried transient errors
- background operation
- non-critical dependency
- noisy logging

Check business/service metrics before escalating severity.

---

# 40. Scenario 6 — One Service Is Slow in a Microservice Chain

Use distributed trace.

Find:

- slow span
- downstream dependency
- retries
- DB
- network

Then validate with logs/metrics.

---

# 41. Corporate Training Angle

Do not teach observability as tool navigation.

Teach:

> **Question → Signal → Evidence → Correlation → Decision**

Learners should understand which signal answers which question.

---

# 42. Lab 1 — Logs vs Metrics vs Traces

Inject:

- slow downstream dependency

Learners receive:

- latency metric
- trace
- logs

Task:

- determine failing hop
- explain evidence chain
- identify root cause

---

# 43. Lab 2 — Correlation ID

Create request crossing two services.

Learners:

- capture correlation ID
- search both logs
- reconstruct timeline
- identify failure

---

# 44. Lab 3 — Alert Fatigue

Provide noisy alert set.

Learners:

- classify actionable vs noisy
- improve thresholds
- define severity
- attach runbook

---

# 45. Lab 4 — RED Dashboard

Build/interpret dashboard with:

- Rate
- Errors
- Duration

Inject API degradation.

Learners identify symptom.

---

# 46. Lab 5 — USE Resource Analysis

Provide:

- CPU utilization
- saturation
- error signals

Learners determine whether resource is actually constrained.

---

# 47. Whiteboard — Observability Flow

```text
                  APPLICATION
                       |
        +--------------+--------------+
        |              |              |
       LOGS          METRICS         TRACES
        |              |              |
   What happened?   How much?       Where?
        |              |              |
        +--------------+--------------+
                       |
                 CORRELATION
                       |
                  HYPOTHESIS
                       |
                   VALIDATE
                       |
                FIX / PREVENT
```

---

# 48. 30-Second Explain-on-Demand

> “I think of observability as three complementary signals: logs explain events, metrics show system behavior over time, and traces show the path of a request across services. The value comes from correlating them to form and validate a production hypothesis.”

---

# 49. 5-Minute Trainer Demo

### Topic

**Logs vs Metrics vs Traces**

Structure:

1. Analogy:
   - Logs = diary
   - Metrics = health monitor
   - Traces = journey map
2. Engineering explanation
3. Example slow API
4. Show how each signal contributes
5. Explain correlation
6. Key takeaway

---

# 50. High-Probability Interview Questions

1. Monitoring vs observability?
2. Logs vs metrics vs traces?
3. What is structured logging?
4. What is correlation ID?
5. What is distributed tracing?
6. What is a span?
7. What is OpenTelemetry?
8. Why use OpenTelemetry?
9. What is Azure Monitor?
10. What is Application Insights?
11. Prometheus vs Grafana?
12. What are Golden Signals?
13. What is RED?
14. What is USE?
15. How do you design a dashboard?
16. What is alert fatigue?
17. How do you design a good alert?
18. What is cardinality?
19. What is sampling?
20. How do you correlate telemetry?
21. What if dashboard is green but users complain?
22. How would you teach observability?
23. Design an observability lab.

---

# 51. Cross-Question Drill

## Q1. Can logs replace traces?

No. Logs can reconstruct behavior if context is good, but traces provide structured request path and timing across services.

## Q2. Can traces replace logs?

No. Traces often lack detailed event/error context.

## Q3. Is high CPU always bad?

No. Evaluate saturation, latency, headroom, and workload.

## Q4. Why not alert on every error?

Because many errors may be transient or non-impacting. Alerts should be actionable and impact-oriented.

## Q5. What if no correlation ID exists?

Use timestamps, instance IDs, request metadata, trace context, and improve instrumentation afterward.

## Q6. Why can high-cardinality labels hurt?

They create excessive unique time series and increase storage/processing cost.

## Q7. Should every request be traced?

Not always. Sampling may be required depending on scale, cost, and diagnostic needs.

## Q8. What is more important: metrics or logs?

Neither universally. Choose based on the question; correlation is stronger than isolated signals.

## Q9. Health endpoint is green. Can system still be broken?

Yes. Health checks may not cover all business paths.

## Q10. Why include business metrics?

They help connect technical signals to actual customer/business impact.

---

# 52. Real Experience Mapping

Prepare truthful examples involving:

- Production logs
- Application monitoring
- Azure monitoring
- API diagnostics
- Dependency failures
- Kubernetes health
- Performance investigation
- Incident analysis
- Error correlation
- Security logging

Use:

`Situation → Signal → Correlation → Hypothesis → Action → Result → Prevention`

---

# 53. Red Flags

Do not:

- Say observability equals monitoring.
- Treat logs as the only source.
- Treat dashboard as truth.
- Alert on every metric.
- Ignore user/business signals.
- Store sensitive data carelessly.
- Confuse Grafana with metrics collection.
- Explain OpenTelemetry as a dashboard.
- Use correlation ID and trace ID interchangeably without context.
- Claim root cause solely from correlation.
- Build dashboards with no operational question.

---

# 54. Quick Revision

## Three Signals

**Logs → What happened?**  
**Metrics → How much?**  
**Traces → Where?**

## Service View

**Golden Signals → Latency / Traffic / Errors / Saturation**

## API View

**RED → Rate / Errors / Duration**

## Resource View

**USE → Utilization / Saturation / Errors**

## Golden Rule

> **Observability is useful only when signals lead to a decision.**

---

# 55. Module 07 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| Monitoring vs observability | 5 | |
| Logs | 5 | |
| Metrics | 5 | |
| Traces | 5 | |
| Correlation IDs | 5 | |
| Structured logging | 4+ | |
| Distributed tracing | 5 | |
| OpenTelemetry | 4+ | |
| Azure Monitor | 4+ | |
| Application Insights | 4+ | |
| Prometheus/Grafana | 4+ | |
| Golden Signals | 5 | |
| RED | 5 | |
| USE | 5 | |
| Dashboard design | 4+ | |
| Alert design | 4+ | |
| Telemetry correlation | 5 | |
| Scenario handling | 5 | |
| Whiteboard explanation | 5 | |
| Lab design | 5 | |
| Cross-question survival | 4+ | |

---

# 56. Module 07 Readiness Gate

## PASS only when you can:

- Explain monitoring vs observability.
- Explain logs vs metrics vs traces without notes.
- Explain correlation IDs.
- Explain distributed tracing and spans.
- Explain OpenTelemetry at interview depth.
- Explain Azure Monitor/Application Insights.
- Explain Prometheus/Grafana roles.
- Explain Golden Signals, RED, and USE.
- Design an actionable dashboard.
- Explain alert fatigue.
- Correlate telemetry in at least five scenarios.
- Design at least three practical labs.
- Draw the observability whiteboard.
- Teach logs/metrics/traces in five minutes.
- Survive at least 10 cross-questions.

### Minimum Score

**All critical P0 dimensions ≥ 4/5**

If answers become tool-centric without diagnostic reasoning, Module 07 remains **BLOCKED**.

---

# 57. Final Module Outcome

After this module, the panel should think:

> **“He can connect logs, metrics and traces into an evidence-driven diagnostic process and can teach observability as an operational engineering skill rather than a dashboarding exercise.”**

That is the selection goal for Module 07.
