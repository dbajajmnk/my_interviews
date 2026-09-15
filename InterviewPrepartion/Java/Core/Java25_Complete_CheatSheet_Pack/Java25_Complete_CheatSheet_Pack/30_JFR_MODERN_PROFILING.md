# JFR Modern Profiling — Java 25

## Three Java 25 JFR Improvements

```text
CPU-Time Profiling — experimental
Cooperative Sampling
Method Timing & Tracing
```

## Decision Guide

Need hot CPU areas?

```text
CPU sampling
```

Need exact selected method timing?

```text
method timing/tracing
```

Need broad low-overhead production diagnostics?

```text
JFR event recording + sampling
```

## Rule

Use the least intrusive technique that answers the question.
