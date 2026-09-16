# Backward Compatibility Architecture

## Stable Surface

Keep stable:
- core public types;
- common method signatures;
- error categories;
- event contracts.

## Evolution Techniques

Use:
- additive optional fields;
- default methods where safe;
- deprecation periods;
- migration guides;
- compatibility shims;
- capability negotiation.

## Breaking Changes

Breaking changes may include:
- removing public methods;
- changing semantic behavior;
- changing exception categories;
- changing event meaning;
- changing tool contract format.

## Rule

> Internal freedom comes from external discipline: the more stable the contract, the more safely the runtime can evolve.
