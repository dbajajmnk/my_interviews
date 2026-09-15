# Dead Letter Queue

## Intent
Move repeatedly failing messages aside.

```text
Main Queue
 ↓ retry exhausted
DLQ
```

## Use
Investigation, repair, replay.

## Rule
DLQ needs operational ownership.

## Trap
A DLQ nobody monitors is only hidden failure.
