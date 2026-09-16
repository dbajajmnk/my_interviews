# Public API Surface Minimization

## Why

Every public symbol creates a future compatibility obligation.

## Expose

Only stable concepts required by consumers.

## Hide

- provider payloads;
- HTTP internals;
- experimental implementation details;
- retry machinery.

## Rule

Make the public surface smaller than the internal architecture.
