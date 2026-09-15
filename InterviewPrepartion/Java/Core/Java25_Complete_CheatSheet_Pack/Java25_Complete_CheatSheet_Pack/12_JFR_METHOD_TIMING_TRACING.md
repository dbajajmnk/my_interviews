# JFR Method Timing & Tracing

## What

JFR can time and trace selected methods using bytecode instrumentation.

## Why

Sometimes CPU samples answer:

```text
"where is CPU spent?"
```

but not:

```text
"how long does this exact method take?"
"how often is this method called?"
```

## Mental Model

```text
Selected Method
   ↓
Instrumentation
   ↓
JFR Event
   ↓
Timing / Trace Analysis
```

## Use Carefully

Instrumenting too broadly can create overhead.

Target high-value methods.

## Good Uses

- latency investigation
- method hot spots
- framework internals
- custom diagnostics
