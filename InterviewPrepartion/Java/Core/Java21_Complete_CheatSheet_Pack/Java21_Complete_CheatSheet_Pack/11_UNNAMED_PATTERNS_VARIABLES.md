# Unnamed Patterns & Variables — Preview in Java 21

## Goal

Express that a variable/pattern component is intentionally unused.

## Idea

Instead of inventing meaningless names:

```text
ignored
unused
x
```

use underscore in supported preview contexts.

## Why

Communicates intent:

```text
value exists
but
we do not care about it
```

## Example Concept

Useful in:

- record decomposition
- exception handling
- loops
- lambda parameters
- local variables

## Trap

This is preview in Java 21 and requires preview compilation/runtime flags where applicable.
