# Agent Runtime Architecture

## Runtime Responsibilities

The runtime coordinates a run from start to finish:
1. create run context;
2. assemble instructions/context;
3. invoke model;
4. validate decision;
5. execute tool if needed;
6. update state;
7. emit events;
8. evaluate stop condition;
9. return result.

## Runtime Loop

```text
start(run)
   ↓
build_context()
   ↓
model.generate()
   ↓
decision
 ┌─┴───────────┐
tool          final
 ↓              ↓
execute       return
 ↓
state update
 ↓
loop
```

## Runtime Must Also Handle

- max steps;
- timeout;
- cancellation;
- retry;
- tool failures;
- provider failures;
- policy denials;
- streaming;
- telemetry.

## Interview Point

> The runtime is the execution engine; the SDK is the developer contract around it.
