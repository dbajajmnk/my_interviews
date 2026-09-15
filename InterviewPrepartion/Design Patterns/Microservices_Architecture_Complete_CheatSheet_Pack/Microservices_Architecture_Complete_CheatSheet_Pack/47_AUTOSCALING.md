# Autoscaling

## Signals

```text
CPU
memory
requests/sec
queue depth
custom metrics
```

## Rule

Scale on the resource that actually represents pressure.

Example:

Queue consumers:

```text
queue depth
```

may be better than CPU.

## Trap

Autoscaling cannot fix a database bottleneck automatically.
