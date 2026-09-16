# Fake Tool Pattern

## Purpose

Use deterministic tool doubles instead of real external systems.

## Modes

Fake tool may:
- return success;
- return known data;
- throw timeout;
- throw authorization error;
- return malformed payload.

## Rule

Make tool fakes controllable per test case.
