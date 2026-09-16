# Client Disconnect and Run Lifecycle

## Problem

Browser/network may disconnect while the agent continues processing.

## Questions

Should disconnect:
- cancel the run?
- leave run active?
- pause?
- persist and allow reconnect?

## Enterprise Pattern

For business workflows, decouple:
```text
client connection lifecycle
from
business run lifecycle
```

## Rule

A dropped browser tab should not accidentally cancel an approved financial workflow unless that is explicitly intended.
