# Vector API — Sixth Incubator in Java 21

## Goal

Express vector computations that can map efficiently to CPU SIMD instructions.

## Scalar

```text
a[0] + b[0]
a[1] + b[1]
a[2] + b[2]
...
```

## Vector

```text
[A0 A1 A2 A3]
+
[B0 B1 B2 B3]
=
[C0 C1 C2 C3]
```

## Good Fits

- numeric workloads
- image processing
- signal processing
- scientific computing
- ML primitives

## Trade-off

More specialized than ordinary Java loops.

## Trap

Vector API is an incubator API in Java 21.

Do not treat it as a stable ordinary Java SE API.
