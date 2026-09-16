# Span Context and Parent/Child Relationships

## Span Context

Carries trace identity across operations.

## Parent/Child

A child span represents work causally inside another operation.

## Links

Span links are useful when work is related but not naturally parent-child, such as asynchronous fan-in/fan-out or event processing.

## Rule

Represent actual causality rather than forcing every relationship into nesting.
