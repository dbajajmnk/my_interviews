# Command Primitive

## Purpose

`Command` combines graph state updates with routing/control decisions.

## Mental Model

```text
Node
 ↓
Command(
  update = {...},
  goto = "next-node"
)
```

## Why Useful

Use `Command` when a node needs to:
- update state;
- choose the next node;
- resume an interrupt;
- direct execution dynamically.

## Interview Point

> Command is useful when state mutation and control-flow decision belong to the same node result.
