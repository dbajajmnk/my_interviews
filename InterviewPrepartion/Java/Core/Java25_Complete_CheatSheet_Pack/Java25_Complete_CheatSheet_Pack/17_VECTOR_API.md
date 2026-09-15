# Vector API — Tenth Incubator in Java 25

## Goal

Express SIMD-friendly computations directly in Java.

## Scalar

```text
a0+b0
a1+b1
a2+b2
a3+b3
```

## Vector

```text
[a0 a1 a2 a3]
+
[b0 b1 b2 b3]
=
[c0 c1 c2 c3]
```

## Good Fits

- image processing
- signal processing
- scientific computing
- numeric kernels
- selected ML/data workloads

## Status

Still an incubator API in Java 25.

## Trap

Ten incubator rounds do not make it a normal final Java SE API.
