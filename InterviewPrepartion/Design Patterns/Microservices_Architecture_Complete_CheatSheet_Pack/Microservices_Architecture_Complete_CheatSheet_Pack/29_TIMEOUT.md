# Timeout

## Rule

Every remote call should have a timeout budget.

```text
Client Timeout
   >
Service A timeout
   >
Service B timeout
```

Budget should decrease downstream.

## Why

Without timeouts:

```text
threads wait
queues grow
memory grows
system collapses
```

## Trap

Huge timeout values hide failure rather than handle it.
