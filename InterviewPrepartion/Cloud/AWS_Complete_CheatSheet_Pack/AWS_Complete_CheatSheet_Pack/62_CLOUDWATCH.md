# Amazon CloudWatch

## Core Areas

```text
Metrics
Logs
Alarms
Dashboards
Application observability
```

## Golden Signals

```text
latency
traffic
errors
saturation
```

## Pattern

```text
AWS Resource / Application
 ↓
CloudWatch
 ↓
Alarm
 ↓
SNS / Incident Workflow
```

## Trap

Collecting metrics without actionable alarms/SLOs is not operational excellence.
