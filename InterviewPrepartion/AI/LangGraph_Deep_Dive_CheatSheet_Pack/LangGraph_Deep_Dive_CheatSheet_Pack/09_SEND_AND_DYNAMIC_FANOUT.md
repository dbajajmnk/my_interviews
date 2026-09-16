# Send and Dynamic Fan-Out

## Purpose

`Send` dynamically invokes a target node with custom state.

## Map-Reduce Mental Model

```text
Subjects
   │
   ├─ Send(worker, subject A)
   ├─ Send(worker, subject B)
   └─ Send(worker, subject C)
          ↓
       aggregate
```

## Use Cases

- dynamic parallel work;
- map-reduce;
- one worker per document;
- one subtask per entity;
- fan-out/fan-in.

## Important

The state passed with `Send` can differ from the graph's main state.
