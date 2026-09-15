# Dependency Duplication

## Problem

```text
React vX
React vX again
UI library again
utility library again
```

## Cost

```text
download
parse
compile
memory
runtime conflicts
```

## Share Large Dependencies Carefully

Candidates:

```text
framework runtime
router
large UI runtime
```

## Trap

Aggressively sharing every library creates tight version coupling.
