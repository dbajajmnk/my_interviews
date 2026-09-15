# Compact Object Headers — Java 25 Product Feature

## What

HotSpot can use a smaller object-header layout.

## Goal

Reduce heap footprint and improve data locality.

## Concept

```text
Before
Object = Header + Fields

Compact Headers
Object = Smaller Header + Fields
```

## Why It Matters

For applications with very large object counts:

```text
few bytes saved per object
×
millions of objects
=
meaningful heap reduction
```

## Java 25 Status

It is a product option, but remains disabled by default in Java 25.

## Enable

```bash
java -XX:+UseCompactObjectHeaders ...
```

## Measure

- heap usage
- allocation rate
- cache locality
- throughput
- latency
- compatibility

## Trap

Do not claim Compact Object Headers are default in Java 25.
