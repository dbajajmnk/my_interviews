# Backpressure

## Intent
Slow/reject producers when consumers cannot keep up.

```text
Producer >>> Consumer
```

Fix:
```text
bounded queue
throttle
scale
drop/reject
```
