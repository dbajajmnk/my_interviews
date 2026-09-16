# Schema Evolution Patterns

## Additive Evolution

Prefer adding optional fields over replacing existing fields abruptly.

## Deprecation

Support both old and new fields during a migration window when consumers cannot upgrade simultaneously.

## Adapter

Use an internal adapter to normalize multiple schema versions into one domain model.

## Rule

External schema stability can coexist with internal model evolution.
